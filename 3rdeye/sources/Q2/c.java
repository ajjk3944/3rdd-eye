package q2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import i2.C4444d;
import i2.C4448h;
import i2.EnumC4441a;
import i2.InterfaceC4433F;
import i2.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l2.AbstractC5268a;
import l2.C5271d;
import l2.q;
import m0.C5313f;
import n2.C5351e;
import o2.C5411b;
import q2.b;
import q2.e;
import u2.C5624c;
import u2.C5629h;

/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: D, reason: collision with root package name */
    public AbstractC5268a<Float, Float> f45359D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f45360E;

    /* renamed from: F, reason: collision with root package name */
    public final RectF f45361F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f45362G;

    /* renamed from: H, reason: collision with root package name */
    public final Paint f45363H;

    /* renamed from: I, reason: collision with root package name */
    public float f45364I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f45365J;

    /* compiled from: CompositionLayer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45366a;

        static {
            int[] iArr = new int[e.b.values().length];
            f45366a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45366a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(z zVar, e eVar, List<e> list, C4448h c4448h) {
        b bVar;
        b gVar;
        super(zVar, eVar);
        this.f45360E = new ArrayList();
        this.f45361F = new RectF();
        this.f45362G = new RectF();
        this.f45363H = new Paint();
        this.f45365J = true;
        C5411b c5411b = eVar.f45391s;
        if (c5411b != null) {
            C5271d c5271dA = c5411b.a();
            this.f45359D = c5271dA;
            e(c5271dA);
            this.f45359D.a(this);
        } else {
            this.f45359D = null;
        }
        C5313f c5313f = new C5313f(c4448h.f38353j.size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < c5313f.j(); i++) {
                    b bVar3 = (b) c5313f.e(c5313f.h(i));
                    if (bVar3 != null && (bVar = (b) c5313f.e(bVar3.f45346p.f45379f)) != null) {
                        bVar3.f45350t = bVar;
                    }
                }
                return;
            }
            e eVar2 = list.get(size);
            switch (b.a.f45357a[eVar2.f45378e.ordinal()]) {
                case 1:
                    gVar = new g(zVar, eVar2, this, c4448h);
                    break;
                case 2:
                    gVar = new c(zVar, eVar2, (List) c4448h.f38347c.get(eVar2.f45380g), c4448h);
                    break;
                case 3:
                    gVar = new h(zVar, eVar2);
                    break;
                case 4:
                    gVar = new d(zVar, eVar2);
                    break;
                case 5:
                    gVar = new f(zVar, eVar2);
                    break;
                case 6:
                    gVar = new i(zVar, eVar2);
                    break;
                default:
                    C5624c.b("Unknown layer type " + eVar2.f45378e);
                    gVar = null;
                    break;
            }
            if (gVar != null) {
                c5313f.i(gVar.f45346p.f45377d, gVar);
                if (bVar2 != null) {
                    bVar2.f45349s = gVar;
                    bVar2 = null;
                } else {
                    this.f45360E.add(0, gVar);
                    int i10 = a.f45366a[eVar2.f45393u.ordinal()];
                    if (i10 == 1 || i10 == 2) {
                        bVar2 = gVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // q2.b, n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        super.c(colorFilter, fVar);
        if (colorFilter == InterfaceC4433F.f38324z) {
            q qVar = new q(fVar, null);
            this.f45359D = qVar;
            qVar.a(this);
            e(this.f45359D);
        }
    }

    @Override // q2.b, k2.InterfaceC5214e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        ArrayList arrayList = this.f45360E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f45361F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).d(rectF2, this.f45344n, true);
            rectF.union(rectF2);
        }
    }

    @Override // q2.b
    public final void k(Canvas canvas, Matrix matrix, int i) {
        EnumC4441a enumC4441a = C4444d.f38338a;
        RectF rectF = this.f45362G;
        e eVar = this.f45346p;
        rectF.set(0.0f, 0.0f, eVar.f45387o, eVar.f45388p);
        matrix.mapRect(rectF);
        boolean z10 = this.f45345o.f38441u;
        ArrayList arrayList = this.f45360E;
        boolean z11 = z10 && arrayList.size() > 1 && i != 255;
        if (z11) {
            Paint paint = this.f45363H;
            paint.setAlpha(i);
            C5629h.f(canvas, rectF, paint);
        } else {
            canvas.save();
        }
        if (z11) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.f45365J || !"__container".equals(eVar.f45376c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((b) arrayList.get(size)).h(canvas, matrix, i);
            }
        }
        canvas.restore();
        EnumC4441a enumC4441a2 = C4444d.f38338a;
    }

    @Override // q2.b
    public final void q(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f45360E;
            if (i10 >= arrayList2.size()) {
                return;
            }
            ((b) arrayList2.get(i10)).g(c5351e, i, arrayList, c5351e2);
            i10++;
        }
    }

    @Override // q2.b
    public final void r(boolean z10) {
        super.r(z10);
        Iterator it = this.f45360E.iterator();
        while (it.hasNext()) {
            ((b) it.next()).r(z10);
        }
    }

    @Override // q2.b
    public final void s(float f10) {
        EnumC4441a enumC4441a = C4444d.f38338a;
        this.f45364I = f10;
        super.s(f10);
        AbstractC5268a<Float, Float> abstractC5268a = this.f45359D;
        e eVar = this.f45346p;
        if (abstractC5268a != null) {
            C4448h c4448h = this.f45345o.f38423b;
            f10 = ((abstractC5268a.f().floatValue() * eVar.f45375b.f38357n) - eVar.f45375b.f38355l) / ((c4448h.f38356m - c4448h.f38355l) + 0.01f);
        }
        if (this.f45359D == null) {
            C4448h c4448h2 = eVar.f45375b;
            f10 -= eVar.f45386n / (c4448h2.f38356m - c4448h2.f38355l);
        }
        if (eVar.f45385m != 0.0f && !"__container".equals(eVar.f45376c)) {
            f10 /= eVar.f45385m;
        }
        ArrayList arrayList = this.f45360E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).s(f10);
        }
        EnumC4441a enumC4441a2 = C4444d.f38338a;
    }
}
