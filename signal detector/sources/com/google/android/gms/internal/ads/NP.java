package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class NP implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10004c;

    public /* synthetic */ NP(Object obj, int i, Object obj2) {
        this.f10002a = i;
        this.f10003b = obj;
        this.f10004c = obj2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f10002a) {
            case 0:
                PP pp = (PP) this.f10003b;
                pp.f10386Q.set(pp.n((C1879sw) this.f10004c, pp.f10377K, 0));
                break;
            case 1:
                ((InterfaceC0664Om) this.f10003b).mo4b(this.f10004c);
                break;
            default:
                HQ hq = (HQ) this.f10003b;
                L0 l02 = (L0) this.f10004c;
                hq.f8933N = hq.f8925E == null ? l02 : new B0(-9223372036854775807L, 0L);
                hq.f8934O = l02.a();
                boolean z6 = false;
                if (!hq.f8941V && l02.a() == -9223372036854775807L) {
                    z6 = true;
                }
                hq.f8935P = z6;
                hq.f8936Q = true == z6 ? 7 : 1;
                if (!hq.f8930J) {
                    hq.t();
                    break;
                } else {
                    hq.f8952f.s(hq.f8934O, l02, z6);
                    break;
                }
                break;
        }
    }
}
