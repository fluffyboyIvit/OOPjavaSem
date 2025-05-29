package lesson3.taskHW1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FileOperationsImpl implements FileOperations {

@Override
public void saveToFile(FamilyTree familyTree, String fileName) throws IOException {
try (ObjectOutputStream oos = new ObjectOutputStream(new
    FileOutputStream(fileName))) {
    oos.writeObject(familyTree);
}
}
@Override
public FamilyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException {
    try (ObjectInputStream ois = new ObjectInputStream(new
    FileInputStream(fileName))) {
    return (FamilyTree) ois.readObject();
}
}


    
}