package o0;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f3043e = "a";

    /* renamed from: a, reason: collision with root package name */
    int f3044a;

    /* renamed from: b, reason: collision with root package name */
    int f3045b;

    /* renamed from: c, reason: collision with root package name */
    int f3046c;

    /* renamed from: d, reason: collision with root package name */
    int f3047d;

    a(int i2, int i3, int i4, int i5) {
        this.f3045b = i2;
        this.f3046c = i3;
        this.f3047d = i4;
        this.f3044a = i5;
    }

    public int a() {
        return this.f3045b;
    }

    public boolean b() {
        int i2 = this.f3045b;
        return !(i2 == -1 || i2 == Integer.MAX_VALUE);
    }

    void c() {
        q0.a.b(f3043e, toString());
    }

    public String toString() {
        return this.f3045b + " dBm " + this.f3046c + " asu level: " + this.f3047d + " type: " + ru.andr7e.siminfo.b.c(this.f3044a);
    }
}
