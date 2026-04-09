package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements n1.l {

    /* renamed from: a, reason: collision with root package name */
    public static final c f25585a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f25586b;

    @Override // n1.l
    public final boolean a() {
        Boolean bool = f25586b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw d.h.o("canFocus is read before it is written");
    }

    @Override // n1.l
    public final void d(boolean z3) {
        f25586b = Boolean.valueOf(z3);
    }

    @Override // n1.l
    public final /* synthetic */ void b(g3.r rVar) {
    }

    @Override // n1.l
    public final /* synthetic */ void c(g3.r rVar) {
    }

    @Override // n1.l
    public final /* synthetic */ void e(o1.c cVar) {
    }
}
