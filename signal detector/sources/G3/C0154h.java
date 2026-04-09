package G3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: G3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0154h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public o f1560a;

    /* renamed from: b, reason: collision with root package name */
    public G f1561b;

    /* renamed from: c, reason: collision with root package name */
    public t3.a f1562c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f1563d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1564e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f1565f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1566g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f1567h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public float f1568j;

    /* renamed from: k, reason: collision with root package name */
    public float f1569k;

    /* renamed from: l, reason: collision with root package name */
    public int f1570l;

    /* renamed from: m, reason: collision with root package name */
    public float f1571m;

    /* renamed from: n, reason: collision with root package name */
    public float f1572n;

    /* renamed from: o, reason: collision with root package name */
    public int f1573o;

    /* renamed from: p, reason: collision with root package name */
    public int f1574p;

    /* renamed from: q, reason: collision with root package name */
    public int f1575q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint.Style f1576r;

    public C0154h(o oVar) {
        this.f1563d = null;
        this.f1564e = null;
        this.f1565f = null;
        this.f1566g = PorterDuff.Mode.SRC_IN;
        this.f1567h = null;
        this.i = 1.0f;
        this.f1568j = 1.0f;
        this.f1570l = 255;
        this.f1571m = 0.0f;
        this.f1572n = 0.0f;
        this.f1573o = 0;
        this.f1574p = 0;
        this.f1575q = 0;
        this.f1576r = Paint.Style.FILL_AND_STROKE;
        this.f1560a = oVar;
        this.f1562c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.f1601f = true;
        jVar.f1602g = true;
        return jVar;
    }

    public C0154h(C0154h c0154h) {
        this.f1563d = null;
        this.f1564e = null;
        this.f1565f = null;
        this.f1566g = PorterDuff.Mode.SRC_IN;
        this.f1567h = null;
        this.i = 1.0f;
        this.f1568j = 1.0f;
        this.f1570l = 255;
        this.f1571m = 0.0f;
        this.f1572n = 0.0f;
        this.f1573o = 0;
        this.f1574p = 0;
        this.f1575q = 0;
        this.f1576r = Paint.Style.FILL_AND_STROKE;
        this.f1560a = c0154h.f1560a;
        this.f1561b = c0154h.f1561b;
        this.f1562c = c0154h.f1562c;
        this.f1569k = c0154h.f1569k;
        this.f1563d = c0154h.f1563d;
        this.f1564e = c0154h.f1564e;
        this.f1566g = c0154h.f1566g;
        this.f1565f = c0154h.f1565f;
        this.f1570l = c0154h.f1570l;
        this.i = c0154h.i;
        this.f1575q = c0154h.f1575q;
        this.f1573o = c0154h.f1573o;
        this.f1568j = c0154h.f1568j;
        this.f1571m = c0154h.f1571m;
        this.f1572n = c0154h.f1572n;
        this.f1574p = c0154h.f1574p;
        this.f1576r = c0154h.f1576r;
        if (c0154h.f1567h != null) {
            this.f1567h = new Rect(c0154h.f1567h);
        }
    }
}
