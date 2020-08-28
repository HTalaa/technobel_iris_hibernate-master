package be.technobel.formation.iris.hibernate;

import be.technobel.formation.iris.hibernate.model.Car;
import org.hibernate.Session;

public class CarDAO {
    public void insert(Car car){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(car);

        //Commit the transaction
        session.getTransaction().commit();
        HibernateUtil.shutdown();


    }
    /*
    public void edit(Car car){
        delete(car.getId());
        insert(car);


    }
    public Car getOne(int id){

        Car rslt = null;

        try(BufferedReader br = new BufferedReader(new FileReader(new File(filePath))))
        {
            rslt = br.lines()
                    .map(OutilCar::stringToCar).filter(car -> car.getId()==id).findFirst().get();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        return rslt;
    }
    public List<Car> getAll(){

        List<Car> rslt = null;

        try(BufferedReader br = new BufferedReader(new FileReader(new File(filePath))))
        {
            rslt = br.lines()
                    .map(OutilCar::stringToCar)
                    .collect(Collectors.toList());
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        return rslt;
    }
    public void delete(int id){

        List<String> remainingLines = null;

        try(BufferedReader br = new BufferedReader(new FileReader(new File(filePath))))
        {
            remainingLines = br.lines()
                    .filter(line -> Integer.parseInt( line.split("-")[0] ) != id )
                    .collect(Collectors.toList());

            try(PrintWriter pw = new PrintWriter(new File(filePath))){

                for (int i = 0; i < remainingLines.size(); i++) {
                    pw.append(remainingLines.get(i));
                    if(i!=remainingLines.size()-1)
                        pw.append("\n");
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("file not found");
            }

        }
        catch (IOException e)
        {
            System.out.println(e);
        }



    }*/
}
