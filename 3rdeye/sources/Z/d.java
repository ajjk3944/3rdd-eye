package Z;

import C.S;
import W.F;
import Z.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13900c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13901d;

    public /* synthetic */ d(Object obj, boolean z10, int i) {
        this.f13899b = i;
        this.f13901d = obj;
        this.f13900c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13899b) {
            case 0:
                F f10 = F.this;
                boolean z10 = f10.f13102V;
                boolean z11 = this.f13900c;
                if (z10 == z11) {
                    S.g("Recorder", "Audio source silenced transitions to the same state " + z11);
                    break;
                } else {
                    f10.f13102V = z11;
                    f10.I();
                    break;
                }
            default:
                h hVar = h.this;
                hVar.f13925q = this.f13900c;
                if (hVar.f13916g == h.b.STARTED) {
                    hVar.a();
                    break;
                }
                break;
        }
    }
}
