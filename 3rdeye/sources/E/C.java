package E;

import C.K;
import D9.G;
import androidx.camera.core.impl.S;
import java.util.ArrayList;

/* compiled from: TakePictureManager.java */
/* loaded from: classes.dex */
public final class C implements I.c<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f1286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f1287c;

    public C(D d10, G g10) {
        this.f1287c = d10;
        this.f1286b = g10;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        G g10 = this.f1286b;
        if (((B) g10.f1157c).f1284g) {
            return;
        }
        int iA = ((S) ((ArrayList) g10.f1156b).get(0)).a();
        boolean z10 = th instanceof K;
        D d10 = this.f1287c;
        if (z10) {
            r rVar = d10.f1290c;
            g gVar = new g(iA, (K) th);
            rVar.getClass();
            G.n.a();
            rVar.f1341e.f1304l.accept(gVar);
        } else {
            r rVar2 = d10.f1290c;
            g gVar2 = new g(iA, new K("Failed to submit capture request", th));
            rVar2.getClass();
            G.n.a();
            rVar2.f1341e.f1304l.accept(gVar2);
        }
        d10.f1289b.a();
    }

    @Override // I.c
    public final void onSuccess(Void r12) {
        this.f1287c.f1289b.a();
    }
}
