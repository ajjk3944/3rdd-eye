package bd;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f2122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f2123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f2124c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f2125d;

    public c(d dVar, Context context, TextPaint textPaint, t1 t1Var) {
        this.f2125d = dVar;
        this.f2122a = context;
        this.f2123b = textPaint;
        this.f2124c = t1Var;
    }

    @Override // me.t1
    public final void w(int i4) {
        this.f2124c.w(i4);
    }

    @Override // me.t1
    public final void x(Typeface typeface, boolean z3) {
        this.f2125d.f(this.f2122a, this.f2123b, typeface);
        this.f2124c.x(typeface, z3);
    }
}
