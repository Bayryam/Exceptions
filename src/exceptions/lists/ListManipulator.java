package exceptions.lists;

import exceptions.lists.errors.NoSpaceException;

import java.util.ArrayList;

public class ListManipulator<T> {
    private static final int ARRAY_SIZE = 10;
    private final ArrayList<T> arr = new ArrayList<>(ARRAY_SIZE);


    public void add(T newElement) throws NoSpaceException {
        if (arr.size() == ARRAY_SIZE) {
            throw new NoSpaceException("Full collection!");
        }
        arr.add(newElement);
    }

    public void remove() throws NoSpaceException {
        if (arr.isEmpty()) {
            throw new NoSpaceException("Empty collection!");
        }
        arr.remove(arr.size() - 1);
    }

    public void printAllElements() throws NoSpaceException{
        if (arr.isEmpty()) {
            throw new NoSpaceException("Empty collection!");
        }
        for (T el : arr) {
            System.out.println(el);
        }
    }

}
