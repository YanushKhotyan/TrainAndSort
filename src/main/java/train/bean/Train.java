package train.bean;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * Train bean class
 */
public class Train
{
    private String trainDestination;

    private int trainNumber;

    private Date trainDepartureTime;

    public Train(String trainDestination, int trainNumber, Date trainDepartureTime)
    {
        this.trainDestination = trainDestination;
        this.trainNumber = trainNumber;
        this.trainDepartureTime = trainDepartureTime;
    }

    public Train()
    {

    }

    public String getTrainDestination()
    {
        return trainDestination;
    }

    public void setTrainDestination(String trainDestination)
    {
        this.trainDestination = trainDestination;
    }

    public int getTrainNumber()
    {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber)
    {
        this.trainNumber = trainNumber;
    }

    public Date getTrainDepartureTime()
    {
        return trainDepartureTime;
    }

    public void setTrainDepartureTime(Date trainDepartureTime)
    {
        this.trainDepartureTime = trainDepartureTime;
    }

    @Override
    public String toString()
    {
        return "Train{" +
                "trainDestination='" + trainDestination + '\'' +
                ", trainNumber=" + trainNumber +
                ", trainDepartureTime=" + trainDepartureTime +
                '}';
    }
}
