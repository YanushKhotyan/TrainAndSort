package train;

import train.service.GenerateTrainInfo;

import java.util.Scanner;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class TrainInformationboard
{
    public static void main(String[] args)
    {
        GenerateTrainInfo trains = new GenerateTrainInfo();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some train number: ");
        trains.printTrain(trains.getTrainInfoByTrainNumber(in.nextInt()));
        System.out.println("Train information board:  ");
        trains.printTrainInformationBoard(trains.sortTrainInfoByTrainDestination());
    }
}
