package k5;

import k5.C5218b;

/* compiled from: TokenResult.java */
/* loaded from: classes2.dex */
public abstract class f {

    /* compiled from: TokenResult.java */
    public static abstract class a {
    }

    /* compiled from: TokenResult.java */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static C5218b.a a() {
        C5218b.a aVar = new C5218b.a();
        aVar.f43397b = 0L;
        return aVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
