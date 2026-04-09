package o5;

/* loaded from: classes.dex */
public final class r0 implements y {

    /* renamed from: a, reason: collision with root package name */
    public final b5.g f19036a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.android.replay.capture.e f19037b;

    /* renamed from: c, reason: collision with root package name */
    public final i5.c f19038c;

    /* renamed from: d, reason: collision with root package name */
    public final df.c f19039d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19040e;

    public r0(b5.g gVar, u5.i iVar) {
        io.sentry.android.replay.capture.e eVar = new io.sentry.android.replay.capture.e(18, iVar);
        i5.c cVar = new i5.c();
        df.c cVar2 = new df.c();
        this.f19036a = gVar;
        this.f19037b = eVar;
        this.f19038c = cVar;
        this.f19039d = cVar2;
        this.f19040e = 1048576;
    }

    @Override // o5.y
    public final b0 createMediaSource(androidx.media3.common.e0 e0Var) {
        e0Var.f1608d.getClass();
        e0Var.f1608d.getClass();
        return new s0(e0Var, this.f19036a, this.f19037b, this.f19038c.c(e0Var), this.f19039d, this.f19040e);
    }
}
