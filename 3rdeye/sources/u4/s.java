package u4;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class s extends m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f46582c;

    public s(t tVar) {
        this.f46582c = tVar;
    }

    @Override // u4.m
    public final void a() {
        u uVar = (u) this.f46582c.f46584b;
        uVar.f46587b.a("unlinkToDeath", new Object[0]);
        uVar.f46597m.asBinder().unlinkToDeath(uVar.f46594j, 0);
        uVar.f46597m = null;
        uVar.f46592g = false;
    }
}
