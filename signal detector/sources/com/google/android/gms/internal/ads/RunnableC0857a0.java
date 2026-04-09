package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0857a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0697Ql f13014b;

    public /* synthetic */ RunnableC0857a0(int i, long j6, C0697Ql c0697Ql) {
        this.f13013a = 1;
        this.f13014b = c0697Ql;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13013a;
        C0697Ql c0697Ql = this.f13014b;
        c0697Ql.getClass();
        switch (i) {
            case 0:
                String str = Vt.f12096a;
                GO go = ((NN) c0697Ql.f10692c).f9997a.f11649G;
                go.t(go.y(), 1016, new ZJ(29, (byte) 0));
                break;
            case 1:
                String str2 = Vt.f12096a;
                GO go2 = ((NN) c0697Ql.f10692c).f9997a.f11649G;
                go2.t(go2.x((C1749qQ) go2.f8367d.f16141e), 1021, new DO(2));
                break;
            case 2:
                String str3 = Vt.f12096a;
                GO go3 = ((NN) c0697Ql.f10692c).f9997a.f11649G;
                go3.t(go3.y(), 1019, new DO(0));
                break;
            case 3:
                String str4 = Vt.f12096a;
                GO go4 = ((NN) c0697Ql.f10692c).f9997a.f11649G;
                go4.t(go4.y(), 1030, new DO(3));
                break;
            default:
                String str5 = Vt.f12096a;
                GO go5 = ((NN) c0697Ql.f10692c).f9997a.f11649G;
                go5.t(go5.y(), 1015, new ZJ(28, (byte) 0));
                break;
        }
    }

    public /* synthetic */ RunnableC0857a0(C0697Ql c0697Ql, Object obj, int i) {
        this.f13013a = i;
        this.f13014b = c0697Ql;
    }

    public /* synthetic */ RunnableC0857a0(C0697Ql c0697Ql, String str, long j6, long j7) {
        this.f13013a = 0;
        this.f13014b = c0697Ql;
    }
}
