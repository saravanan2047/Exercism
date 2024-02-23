class AnnalynsInfiltration 
{
    public static boolean canFastAttack(boolean knightIsAwake) 
    {
        if(knightIsAwake==true) return false;
        else return true;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) 
    {
        if(knightIsAwake==true || archerIsAwake==true || prisonerIsAwake==true) return true;
        else return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake)
    {
        return (!archerIsAwake && prisonerIsAwake);
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) 
    {
        if(petDogIsPresent) return ( !archerIsAwake );
        else return (!knightIsAwake && !archerIsAwake && prisonerIsAwake);
        
    }
}
