package com.solarwindsmsp.chess.pieces;

import com.solarwindsmsp.chess.MovementType;
import com.solarwindsmsp.chess.PieceColor;

public class Pawn extends Piece {

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);
    }

    @Override
    public boolean isValidMoveTransition(MovementType movementType, int newX, int newY) {
        if (newX != getXCoordinate()) {
            return false;
        }

        if (getPieceColor() == PieceColor.WHITE && newY - getYCoordinate() != 1) {
            return false;
        }

        if (getPieceColor() == PieceColor.BLACK && newY - getYCoordinate() != -1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValidCaptureTransition(MovementType movementType, int newX, int newY) {
        if (Math.abs(newX - getXCoordinate()) != 1) {
            return false;
        }

        if (getPieceColor() == PieceColor.WHITE && newY - getYCoordinate() != 1) {
            return false;
        }

        if (getPieceColor() == PieceColor.BLACK && newY - getYCoordinate() != -1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean IsLegalPiecePosition(int xCoordinate, int yCoordinate) {
        if (getPieceColor() == PieceColor.WHITE) {
            return (xCoordinate >= 1);
        } else { //black
            return (xCoordinate <= 6);
        }
    }
}
