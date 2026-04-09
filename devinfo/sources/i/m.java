package i;

import android.view.ViewGroup;
import com.applovin.shadow.okio.internal.Buffer;
import e4.c1;
import e4.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f25337b;

    public /* synthetic */ m(v vVar, int i4) {
        this.f25336a = i4;
        this.f25337b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f25336a) {
            case 0:
                v vVar = this.f25337b;
                if ((vVar.Z & 1) != 0) {
                    vVar.w(0);
                }
                if ((vVar.Z & Buffer.SEGMENTING_THRESHOLD) != 0) {
                    vVar.w(108);
                }
                vVar.Y = false;
                vVar.Z = 0;
                break;
            default:
                v vVar2 = this.f25337b;
                vVar2.f25386w.showAtLocation(vVar2.f25385v, 55, 0, 0);
                c1 c1Var = vVar2.f25388y;
                if (c1Var != null) {
                    c1Var.b();
                }
                if (!vVar2.f25389z || (viewGroup = vVar2.A) == null || !viewGroup.isLaidOut()) {
                    vVar2.f25385v.setAlpha(1.0f);
                    vVar2.f25385v.setVisibility(0);
                    break;
                } else {
                    vVar2.f25385v.setAlpha(0.0f);
                    c1 c1VarB = v0.b(vVar2.f25385v);
                    c1VarB.a(1.0f);
                    vVar2.f25388y = c1VarB;
                    c1VarB.d(new n(0, this));
                    break;
                }
                break;
        }
    }
}
