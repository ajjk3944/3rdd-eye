package h4;

import I9.g;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: TextAppearance.java */
/* loaded from: classes2.dex */
public final class e extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f38239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextPaint f38240c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f38241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4416d f38242e;

    public e(C4416d c4416d, Context context, TextPaint textPaint, g gVar) {
        this.f38242e = c4416d;
        this.f38239b = context;
        this.f38240c = textPaint;
        this.f38241d = gVar;
    }

    @Override // I9.g
    public final void Y(int i) {
        this.f38241d.Y(i);
    }

    @Override // I9.g
    public final void Z(Typeface typeface, boolean z10) {
        this.f38242e.g(this.f38239b, this.f38240c, typeface);
        this.f38241d.Z(typeface, z10);
    }
}
