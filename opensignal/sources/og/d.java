package og;

/* loaded from: classes.dex */
public enum d {
    UNKNOWN(0),
    CONFIG_UPDATE_STREAM_ERROR(1),
    CONFIG_UPDATE_MESSAGE_INVALID(2),
    CONFIG_UPDATE_NOT_FETCHED(3),
    CONFIG_UPDATE_UNAVAILABLE(4);

    private final int value;

    d(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
