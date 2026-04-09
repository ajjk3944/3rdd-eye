package be;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends j3.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a.a f2674h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f2675i;

    public b(d dVar, a.a aVar) {
        this.f2675i = dVar;
        this.f2674h = aVar;
    }

    @Override // j3.b
    public final void h(int i10) {
        this.f2675i.f2691n = true;
        this.f2674h.y(i10);
    }

    @Override // j3.b
    public final void i(Typeface typeface) {
        d dVar = this.f2675i;
        dVar.f2693p = Typeface.create(typeface, dVar.f2683d);
        dVar.f2691n = true;
        this.f2674h.z(dVar.f2693p, false);
    }
}
