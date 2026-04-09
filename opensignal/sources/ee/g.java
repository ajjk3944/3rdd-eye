package ee;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class g extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public l f8097a;

    /* renamed from: b, reason: collision with root package name */
    public y f8098b;

    /* renamed from: c, reason: collision with root package name */
    public ud.a f8099c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f8100d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f8101e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f8102f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f8103g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f8104h;

    /* renamed from: i, reason: collision with root package name */
    public final float f8105i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public int f8106l;

    /* renamed from: m, reason: collision with root package name */
    public float f8107m;

    /* renamed from: n, reason: collision with root package name */
    public float f8108n;

    /* renamed from: o, reason: collision with root package name */
    public int f8109o;

    /* renamed from: p, reason: collision with root package name */
    public int f8110p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint.Style f8111q;

    public g(l lVar) {
        this.f8100d = null;
        this.f8101e = null;
        this.f8102f = null;
        this.f8103g = PorterDuff.Mode.SRC_IN;
        this.f8104h = null;
        this.f8105i = 1.0f;
        this.j = 1.0f;
        this.f8106l = 255;
        this.f8107m = 0.0f;
        this.f8108n = 0.0f;
        this.f8109o = 0;
        this.f8110p = 0;
        this.f8111q = Paint.Style.FILL_AND_STROKE;
        this.f8097a = lVar;
        this.f8099c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.f8121y = true;
        iVar.B = true;
        return iVar;
    }

    public g(g gVar) {
        this.f8100d = null;
        this.f8101e = null;
        this.f8102f = null;
        this.f8103g = PorterDuff.Mode.SRC_IN;
        this.f8104h = null;
        this.f8105i = 1.0f;
        this.j = 1.0f;
        this.f8106l = 255;
        this.f8107m = 0.0f;
        this.f8108n = 0.0f;
        this.f8109o = 0;
        this.f8110p = 0;
        this.f8111q = Paint.Style.FILL_AND_STROKE;
        this.f8097a = gVar.f8097a;
        this.f8098b = gVar.f8098b;
        this.f8099c = gVar.f8099c;
        this.k = gVar.k;
        this.f8100d = gVar.f8100d;
        this.f8101e = gVar.f8101e;
        this.f8103g = gVar.f8103g;
        this.f8102f = gVar.f8102f;
        this.f8106l = gVar.f8106l;
        this.f8105i = gVar.f8105i;
        this.f8110p = gVar.f8110p;
        this.j = gVar.j;
        this.f8107m = gVar.f8107m;
        this.f8108n = gVar.f8108n;
        this.f8109o = gVar.f8109o;
        this.f8111q = gVar.f8111q;
        if (gVar.f8104h != null) {
            this.f8104h = new Rect(gVar.f8104h);
        }
    }
}
