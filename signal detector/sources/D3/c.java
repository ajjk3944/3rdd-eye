package D3;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class c extends I.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.d f1262h;
    public final /* synthetic */ e i;

    public c(e eVar, com.bumptech.glide.d dVar) {
        this.i = eVar;
        this.f1262h = dVar;
    }

    @Override // I.b
    public final void h(int i) {
        this.i.f1279n = true;
        this.f1262h.I(i);
    }

    @Override // I.b
    public final void i(Typeface typeface) {
        e eVar = this.i;
        eVar.f1281p = Typeface.create(typeface, eVar.f1270d);
        eVar.f1279n = true;
        this.f1262h.J(eVar.f1281p, false);
    }
}
