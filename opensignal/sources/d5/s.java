package d5;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements a5.j, a5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7076a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f7077d;

    public /* synthetic */ s(z zVar, int i10) {
        this.f7076a = i10;
        this.f7077d = zVar;
    }

    @Override // a5.j
    public void a(Object obj) {
        androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj;
        switch (this.f7076a) {
            case 0:
                q0Var.onPlaylistMetadataChanged(this.f7077d.f7126o0);
                break;
            default:
                q0Var.onAvailableCommandsChanged(this.f7077d.f7124m0);
                break;
        }
    }

    @Override // a5.k
    public void h(Object obj, androidx.media3.common.p pVar) {
        ((androidx.media3.common.q0) obj).onEvents(this.f7077d.B, new androidx.media3.common.p0(pVar));
    }
}
