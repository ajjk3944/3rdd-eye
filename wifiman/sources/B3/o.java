package b3;

import b3.C4065e;

/* loaded from: classes.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(AbstractC4061a abstractC4061a);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        b(int i10) {
            this.value = i10;
        }
    }

    public static a a() {
        return new C4065e.b();
    }

    public abstract AbstractC4061a b();

    public abstract b c();
}
