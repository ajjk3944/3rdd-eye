package R;

import C.m0;
import G.n;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.T0;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements H0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f11557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T0 f11560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L0 f11561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L0 f11562f;

    public /* synthetic */ b(c cVar, String str, String str2, T0 t02, L0 l02, L0 l03) {
        this.f11557a = cVar;
        this.f11558b = str;
        this.f11559c = str2;
        this.f11560d = t02;
        this.f11561e = l02;
        this.f11562f = l03;
    }

    @Override // androidx.camera.core.impl.H0.d
    public final void a(H0 h02, H0.g gVar) {
        c cVar = this.f11557a;
        if (cVar.b() == null) {
            return;
        }
        cVar.C();
        cVar.B(cVar.D(this.f11558b, this.f11559c, this.f11560d, this.f11561e, this.f11562f));
        cVar.o();
        h hVar = cVar.f11566q;
        hVar.getClass();
        n.a();
        Iterator it = hVar.f11584b.iterator();
        while (it.hasNext()) {
            hVar.c((m0) it.next());
        }
    }
}
