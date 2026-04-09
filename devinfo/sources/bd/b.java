package bd;

import android.graphics.Typeface;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends u3.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t1 f2120h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f2121i;

    public b(d dVar, t1 t1Var) {
        this.f2121i = dVar;
        this.f2120h = t1Var;
    }

    @Override // u3.b
    public final void i(int i4) {
        this.f2121i.f2137n = true;
        this.f2120h.w(i4);
    }

    @Override // u3.b
    public final void j(Typeface typeface) {
        d dVar = this.f2121i;
        dVar.f2139p = Typeface.create(typeface, dVar.f2129d);
        dVar.f2137n = true;
        this.f2120h.x(dVar.f2139p, false);
    }
}
