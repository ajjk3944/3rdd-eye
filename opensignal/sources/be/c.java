package be;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f2676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextPaint f2677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a.a f2678h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f2679i;

    public c(d dVar, Context context, TextPaint textPaint, a.a aVar) {
        this.f2679i = dVar;
        this.f2676f = context;
        this.f2677g = textPaint;
        this.f2678h = aVar;
    }

    @Override // a.a
    public final void y(int i10) {
        this.f2678h.y(i10);
    }

    @Override // a.a
    public final void z(Typeface typeface, boolean z10) {
        this.f2679i.f(this.f2676f, this.f2677g, typeface);
        this.f2678h.z(typeface, z10);
    }
}
