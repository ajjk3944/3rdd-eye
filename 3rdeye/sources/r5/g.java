package r5;

/* compiled from: FirebaseRemoteConfigException.java */
/* loaded from: classes2.dex */
public class g extends B4.j {

    /* compiled from: FirebaseRemoteConfigException.java */
    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        a(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    public g(String str) {
        super(str);
        a aVar = a.UNKNOWN;
    }

    public g(String str, Exception exc) {
        super(str, exc);
        a aVar = a.UNKNOWN;
    }
}
