package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yh2 {
    public final /* synthetic */ int a;
    public final th2 b;
    public m73 c;
    public b73 d;
    public fp2 e;
    public mm2 f;

    public /* synthetic */ yh2(th2 th2Var, int i) {
        this.a = i;
        this.b = th2Var;
    }

    public zh2 a() {
        i41.P(this.e, fp2.class);
        i41.P(this.f, mm2.class);
        return new zh2(this.b, new tv2(0, (byte) 0), this.e, this.f, new f23(25), this.c, this.d);
    }

    public ji2 b() {
        i41.P(this.e, fp2.class);
        i41.P(this.f, mm2.class);
        return new ji2(this.b, new tv2(0, (byte) 0), this.e, this.f, new f23(25), this.c, this.d);
    }

    public final /* bridge */ Object c() {
        switch (this.a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
