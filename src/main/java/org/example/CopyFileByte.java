package org.example;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CopyFileByte {
    public void traverseDepthFiles(final File fileOrDir)
    {
        if (fileOrDir.isDirectory()) {
            System.out.println(fileOrDir.getAbsolutePath());
            final File[] children = fileOrDir.listFiles();
            if (children == null) {
                return;
            }
            Arrays.sort(children, new Comparator<File>() {
                @Override
                public int compare(final File o1, final File o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            for (final File each : children) {
                // gọi lại hàm traverseDepthFiles()
                traverseDepthFiles(each);
            }
        }else {
            System.out.println(fileOrDir.getAbsolutePath());
            }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File file = new File("D://spring/new.txt");
        // c1
//        FileInputStream fileInputStream = new FileInputStream(file);
//        Scanner scanner = new Scanner(fileInputStream);
//        try {
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        FileInputStream fileInputStream = null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileInputStream = new FileInputStream(file);
//            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
//            String line = bufferedReader.readLine();
//            while (line != null)
//                {
//                    System.out.println(line);
//                    line = bufferedReader.readLine();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Student student = new Student();
//        student.setName("khanh");
//        student.setAge(19);
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(student);
//        Student student = null;
//        FileInputStream fileInputStream = new FileInputStream(file);
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        student = (Student) objectInputStream.readObject() ;
//        System.out.println(student.getName());
//        file = new File();
//        File file = new File("D:\\spring\\ReadFile\\khanh.txt");
////        if (!file.exists()) {
////            if (file.mkdir()) {
////                System.out.println("Directory is created!");
////            } else {
////                System.out.println("Failed to create directory!");
////            }
////        }
//        String currentDirectory = System.getProperty("user.dir");
//        System.out.println(currentDirectory);
////        File file = new File("D:\\Directory1");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        Scanner scanner = new Scanner(fileInputStream);
//        try {
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        } finally {
//            try {
//                scanner.close();
//                fileInputStream.close();
//            } catch (IOException ex) {
////                Logger.getLogger(ReadFileWithBufferedReader.class.getName())
////                        .log(Level.SEVERE, null, ex);
//            }
//        }
        String currentDirectory = System.getProperty("user.dir");
        System.out.println(currentDirectory);
        File file = new File("D:\\spring\\ReadFile");
        System.out.println(file.getAbsolutePath());
//        if (file.isDirectory()) {
//            // check thu muc rong bang phuong thuc file.list()
//            if (file.list().length == 0) {
//                System.out.println("Thu muc "
//                        + file.getAbsolutePath() + " la rong!");
//            } else {
//                System.out.println("Thu muc "
//                        + file.getAbsolutePath() + " khong rong!");
//            }
//        } else {
//            System.out.println(file.getAbsolutePath() + " khong phai la thu muc!");
//        }
//        File file = new File("D:\\spring\\ReadFile\\khanh.txt");
////        Pat
//        file.createNewFile();
//        if (file.createNewFile())
//        {
//            System.out.println("file được tạo thành công");
//        }
//        else {
//            System.out.println("file được tạo rồi công");
//        }
//        private void exposeDirectory(String dirName, ResourceHandlerRegistry registry) {
//            Path uploadDir = Paths.get(dirName);
//            String uploadPath = uploadDir.toFile().getAbsolutePath();
//
//            if (dirName.startsWith("../")) dirName = dirName.replace("../", "");
//
//            registry.addResourceHandler("/" + dirName + "/**").addResourceLocations("file:/"+ uploadPath + "/");
//        }
//        File fileOrDir = new File(currentDirectory);
//        CopyFileByte myFiles = new CopyFileByte();
//        myFiles.traverseDepthFiles(fileOrDir);
    //        System.out.println("current dir: " + currentDirectory);
//        try {
//            if (file.createNewFile())
//            {
//                System.out.println("File is created ");
//            }
//            else {
//                System.out.println("File is already exits");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        FileInputStream fis = null;
//        BufferedInputStream bis = null;
//        DataInputStream dis = null;
//        try {
//            fis = new FileInputStream(file);
//            bis = new BufferedInputStream(fis);
//            dis = new DataInputStream(bis);
//
//            while (dis.available() != 0) {
//                System.out.println(dis.readLine());
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            fis.close();
//            bis.close();
//            dis.close();
//        FileReader fr = new FileReader(file);
//        BufferedReader bf = new BufferedReader(fr);
//        int i;
//        while ((i = bf.read()) != -1)
//        {
//            System.out.println((char) i );
//        }
//       BufferedWriter bw = null;
//        FileWriter fw = null;
//        try {
//            String data = "khanh";
//            fw = new FileWriter(file.getAbsoluteFile(), true);
//            bw = new BufferedWriter(fw);
//            bw.write(data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                //159965
//                if (bw != null)
//                    bw.close();
//                if (fw != null)
//                    fw.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//        FileInputStream inputStream = null;
//        FileOutputStream outputStream = null;
//        try {
//            inputStream = new FileInputStream("inStream.txt");
//            outputStream = new FileOutputStream("outStream.txt");
//            int c;
//            while ((c = inputStream.read()) != -1)
//            {
//                outputStream.write(c);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
