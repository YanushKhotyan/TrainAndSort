package train;

import train.bean.Date;
import train.bean.Train;

import java.util.ArrayList;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class GenerateTrainInfo
{

    private ArrayList<Train> trains = new ArrayList<Train>();

    private ArrayList<Train> generateTrainInfo()
    {

        Train trainOne = new Train("Berlin", 21, new Date(12, 30, 30));
        Train trainTwo = new Train("Prague", 105, new Date(14, 0, 45));
        Train trainThree = new Train("Moscow", 48, new Date(2, 21, 33));
        Train trainFour = new Train("Minsk", 2, new Date(21, 5, 12));
        Train trainFive = new Train("Vein", 8, new Date(8, 59, 59));

        trains.set(0, trainOne);
        trains.set(1, trainTwo);
        trains.set(2, trainThree);
        trains.set(3, trainFour);
        trains.set(5, trainFive);

        return trains;
    }

    private Train getTrainInfoByTrainNumber(ArrayList<Train> trains, int trainNumber)
    {
        for (Train train : trains)
        {
            if (train.getTrainNumber() == trainNumber)
                return train;
        }
        return null;
    }

    private Train sortTrainInfoByTrainDestination(ArrayList<Train> trains, String trainDestination)
    {
        for (Train train : trains)
        {
            if (train.getTrainDestination().equalsIgnoreCase(trainDestination)){
                return train;
            }
        }
        return null;
    }

    private ArrayList<Train> sortByDate(Train train){
        return null;
    }
}
