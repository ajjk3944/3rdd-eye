package v;

/* compiled from: Camera2CameraImpl.java */
/* renamed from: v.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5663s implements I.c<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f46858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5664t f46859c;

    public C5663s(C5664t c5664t, Z z10) {
        this.f46859c = c5664t;
        this.f46858b = z10;
    }

    @Override // I.c
    public final void onSuccess(Void r32) {
        this.f46859c.f46884o.remove(this.f46858b);
        int iOrdinal = this.f46859c.f46876f.ordinal();
        if (iOrdinal != 1 && iOrdinal != 4) {
            if (iOrdinal != 5 && (iOrdinal != 6 || this.f46859c.f46882m == 0)) {
                return;
            } else {
                this.f46859c.u("Camera reopen required. Checking if the current camera can be closed safely.", null);
            }
        }
        if (this.f46859c.f46884o.isEmpty()) {
            C5664t c5664t = this.f46859c;
            if (c5664t.f46881l != null) {
                c5664t.u("closing camera", null);
                this.f46859c.f46881l.close();
                this.f46859c.f46881l = null;
            }
        }
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
    }
}
