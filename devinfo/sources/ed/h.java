package ed;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public o f23298a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f23299b;

    /* renamed from: c, reason: collision with root package name */
    public wc.a f23300c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f23301d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f23302e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f23303f;
    public PorterDuff.Mode g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f23304h;

    /* renamed from: i, reason: collision with root package name */
    public final float f23305i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f23306k;

    /* renamed from: l, reason: collision with root package name */
    public int f23307l;

    /* renamed from: m, reason: collision with root package name */
    public float f23308m;

    /* renamed from: n, reason: collision with root package name */
    public float f23309n;

    /* renamed from: o, reason: collision with root package name */
    public int f23310o;

    /* renamed from: p, reason: collision with root package name */
    public int f23311p;

    /* renamed from: q, reason: collision with root package name */
    public int f23312q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint.Style f23313r;

    public h(o oVar) {
        this.f23301d = null;
        this.f23302e = null;
        this.f23303f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.f23304h = null;
        this.f23305i = 1.0f;
        this.j = 1.0f;
        this.f23307l = 255;
        this.f23308m = 0.0f;
        this.f23309n = 0.0f;
        this.f23310o = 0;
        this.f23311p = 0;
        this.f23312q = 0;
        this.f23313r = Paint.Style.FILL_AND_STROKE;
        this.f23298a = oVar;
        this.f23300c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.f23320f = true;
        jVar.g = true;
        return jVar;
    }

    public h(h hVar) {
        this.f23301d = null;
        this.f23302e = null;
        this.f23303f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.f23304h = null;
        this.f23305i = 1.0f;
        this.j = 1.0f;
        this.f23307l = 255;
        this.f23308m = 0.0f;
        this.f23309n = 0.0f;
        this.f23310o = 0;
        this.f23311p = 0;
        this.f23312q = 0;
        this.f23313r = Paint.Style.FILL_AND_STROKE;
        this.f23298a = hVar.f23298a;
        this.f23299b = hVar.f23299b;
        this.f23300c = hVar.f23300c;
        this.f23306k = hVar.f23306k;
        this.f23301d = hVar.f23301d;
        this.f23302e = hVar.f23302e;
        this.g = hVar.g;
        this.f23303f = hVar.f23303f;
        this.f23307l = hVar.f23307l;
        this.f23305i = hVar.f23305i;
        this.f23312q = hVar.f23312q;
        this.f23310o = hVar.f23310o;
        this.j = hVar.j;
        this.f23308m = hVar.f23308m;
        this.f23309n = hVar.f23309n;
        this.f23311p = hVar.f23311p;
        this.f23313r = hVar.f23313r;
        if (hVar.f23304h != null) {
            this.f23304h = new Rect(hVar.f23304h);
        }
    }
}
