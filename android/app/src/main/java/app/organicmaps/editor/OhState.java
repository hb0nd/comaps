package app.organicmaps.editor;

public class OhState
{
    public enum RuleState
    {
        Open,
        Closed,
        Unknown
    }

    public RuleState state;
    /** Unix timestamp **/
    public long nextTimeOpen;
    /** Unix timestamp **/
    public long nextTimeClosed;

    public OhState(RuleState state, long nextTimeOpen, long nextTimeClosed)
    {
        this.state = state;
        this.nextTimeOpen = nextTimeOpen;
        this.nextTimeClosed = nextTimeClosed;
    }
}