package h9;

import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f10449a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10450b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10451c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f10452d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f10453e;

    /* renamed from: f, reason: collision with root package name */
    public f1.a f10454f;

    /* renamed from: g, reason: collision with root package name */
    public f1.a f10455g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10456h;

    public p2() {
        Paint paint = new Paint();
        this.f10452d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f10453e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f10449a = i1.a();
    }

    public p2(p2 p2Var) {
        this.f10450b = p2Var.f10450b;
        this.f10451c = p2Var.f10451c;
        this.f10452d = new Paint(p2Var.f10452d);
        this.f10453e = new Paint(p2Var.f10453e);
        f1.a aVar = p2Var.f10454f;
        if (aVar != null) {
            this.f10454f = new f1.a(aVar);
        }
        f1.a aVar2 = p2Var.f10455g;
        if (aVar2 != null) {
            this.f10455g = new f1.a(aVar2);
        }
        this.f10456h = p2Var.f10456h;
        try {
            this.f10449a = (i1) p2Var.f10449a.clone();
        } catch (CloneNotSupportedException e4) {
            io.sentry.android.core.e0.c("SVGAndroidRenderer", "Unexpected clone error", e4);
            this.f10449a = i1.a();
        }
    }
}
