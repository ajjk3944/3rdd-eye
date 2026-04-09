package qk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32443a;

    static {
        Integer num = ik.a.f26014a;
        f32443a = (num == null || num.intValue() >= 34) ? new rk.a() : new b();
    }

    public abstract int a();

    public int b() {
        int iA;
        int i4;
        do {
            iA = a() >>> 1;
            i4 = iA % 100;
        } while ((iA - i4) + 99 < 0);
        return i4;
    }
}
