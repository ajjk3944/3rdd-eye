package D3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class d extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f1264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.d f1265c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f1266d;

    public d(e eVar, Context context, TextPaint textPaint, com.bumptech.glide.d dVar) {
        this.f1266d = eVar;
        this.f1263a = context;
        this.f1264b = textPaint;
        this.f1265c = dVar;
    }

    @Override // com.bumptech.glide.d
    public final void I(int i) {
        this.f1265c.I(i);
    }

    @Override // com.bumptech.glide.d
    public final void J(Typeface typeface, boolean z6) {
        this.f1266d.f(this.f1263a, this.f1264b, typeface);
        this.f1265c.J(typeface, z6);
    }
}
