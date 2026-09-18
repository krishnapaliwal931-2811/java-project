def add3(x, y, z):
    return x + y + z

def showBoard(pX, pO):
    board = []
    for i in range(9):
        if pX[i] == 1:
            board.append("X")
        elif pO[i] == 1:
            board.append("O")
        else:
            board.append(i)

    print(f"{board[0]} | {board[1]} | {board[2]}")
    print("--|---|--")
    print(f"{board[3]} | {board[4]} | {board[5]}")
    print("--|---|--")
    print(f"{board[6]} | {board[7]} | {board[8]}")

def winner(pX, pO):
    patterns = [
        [0,1,2], [3,4,5], [6,7,8],
        [0,3,6], [1,4,7], [2,5,8],
        [0,4,8], [2,4,6]
    ]

    for a, b, c in patterns:
        if add3(pX[a], pX[b], pX[c]) == 3:
            print("X wins!")
            return 1
        if add3(pO[a], pO[b], pO[c]) == 3:
            print("O wins!")
            return 0
    return -1

if __name__ == "__main__":
    px = [0]*9
    po = [0]*9
    turn = 1  # 1 = X, 0 = O

    print("Tic Tac Toe Game")
    while True:
        showBoard(px, po)

        if turn == 1:
            pos = int(input("X, enter position: "))
            px[pos] = 1
        else:
            pos = int(input("O, enter position: "))
            po[pos] = 1

        result = winner(px, po)
        if result != -1:
            print("Game Over")
            break

        # draw check: all 9 cells filled and no winner
        if sum(px) + sum(po) == 9:
            print("It's a draw!")
            print("Game Over")
            break

        turn = 1 - turn