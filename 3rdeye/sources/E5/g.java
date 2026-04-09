package e5;

/* compiled from: HeartBeatInfo.java */
/* loaded from: classes2.dex */
public interface g {

    /* compiled from: HeartBeatInfo.java */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        a(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    a b();
}
