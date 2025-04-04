package com.example.templatemodule2;

public class facuilty extends person {
    public String facID;
    public String password;
    public  String degree;
    public String researchInterest;
    public course courseOffered;
    public String officeLocation;
    public String profileImagePath;
    public int courseCounter;
    public static int facCounter = 0;

    public void intital()
    {
        for (int i = 0; i < 10; i ++)
        {
            course c = new course("", "", "", "", "", "", "", "");
            c.name = "";
        }
    }


}
