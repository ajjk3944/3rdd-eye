package q2;

import C0.f;
import H6.I;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import i2.C4437J;
import i2.C4444d;
import i2.EnumC4441a;
import i2.z;
import j2.C5167a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k2.InterfaceC5212c;
import k2.InterfaceC5214e;
import kotlin.KotlinVersion;
import l2.AbstractC5268a;
import l2.C5271d;
import l2.C5275h;
import l2.p;
import m0.C5309b;
import n2.C5351e;
import n2.InterfaceC5352f;
import o2.C5417h;
import p2.EnumC5447g;
import p2.h;
import q2.e;
import u2.C5627f;
import u2.C5629h;

/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public abstract class b implements InterfaceC5214e, AbstractC5268a.InterfaceC0489a, InterfaceC5352f {

    /* renamed from: A, reason: collision with root package name */
    public float f45329A;

    /* renamed from: B, reason: collision with root package name */
    public BlurMaskFilter f45330B;

    /* renamed from: C, reason: collision with root package name */
    public C5167a f45331C;

    /* renamed from: a, reason: collision with root package name */
    public final Path f45332a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f45333b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f45334c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final C5167a f45335d = new C5167a(1);

    /* renamed from: e, reason: collision with root package name */
    public final C5167a f45336e;

    /* renamed from: f, reason: collision with root package name */
    public final C5167a f45337f;

    /* renamed from: g, reason: collision with root package name */
    public final C5167a f45338g;

    /* renamed from: h, reason: collision with root package name */
    public final C5167a f45339h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f45340j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f45341k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f45342l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f45343m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f45344n;

    /* renamed from: o, reason: collision with root package name */
    public final z f45345o;

    /* renamed from: p, reason: collision with root package name */
    public final e f45346p;

    /* renamed from: q, reason: collision with root package name */
    public final C5275h f45347q;

    /* renamed from: r, reason: collision with root package name */
    public final C5271d f45348r;

    /* renamed from: s, reason: collision with root package name */
    public b f45349s;

    /* renamed from: t, reason: collision with root package name */
    public b f45350t;

    /* renamed from: u, reason: collision with root package name */
    public List<b> f45351u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f45352v;

    /* renamed from: w, reason: collision with root package name */
    public final p f45353w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f45354x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f45355y;

    /* renamed from: z, reason: collision with root package name */
    public C5167a f45356z;

    /* compiled from: BaseLayer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45357a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f45358b;

        static {
            int[] iArr = new int[h.a.values().length];
            f45358b = iArr;
            try {
                iArr[h.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45358b[h.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45358b[h.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45358b[h.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f45357a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45357a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45357a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45357a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45357a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45357a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45357a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(z zVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f45336e = new C5167a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f45337f = new C5167a(mode2);
        C5167a c5167a = new C5167a(1);
        this.f45338g = c5167a;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        C5167a c5167a2 = new C5167a();
        c5167a2.setXfermode(new PorterDuffXfermode(mode3));
        this.f45339h = c5167a2;
        this.i = new RectF();
        this.f45340j = new RectF();
        this.f45341k = new RectF();
        this.f45342l = new RectF();
        this.f45343m = new RectF();
        this.f45344n = new Matrix();
        this.f45352v = new ArrayList();
        this.f45354x = true;
        this.f45329A = 0.0f;
        this.f45345o = zVar;
        this.f45346p = eVar;
        if (eVar.f45393u == e.b.INVERT) {
            c5167a.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c5167a.setXfermode(new PorterDuffXfermode(mode));
        }
        C5417h c5417h = eVar.i;
        c5417h.getClass();
        p pVar = new p(c5417h);
        this.f45353w = pVar;
        pVar.b(this);
        List<p2.h> list = eVar.f45381h;
        if (list != null && !list.isEmpty()) {
            C5275h c5275h = new C5275h(list);
            this.f45347q = c5275h;
            Iterator it = ((ArrayList) c5275h.f43713b).iterator();
            while (it.hasNext()) {
                ((AbstractC5268a) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.f45347q.f43714c).iterator();
            while (it2.hasNext()) {
                AbstractC5268a<?, ?> abstractC5268a = (AbstractC5268a) it2.next();
                e(abstractC5268a);
                abstractC5268a.a(this);
            }
        }
        e eVar2 = this.f45346p;
        if (eVar2.f45392t.isEmpty()) {
            if (true != this.f45354x) {
                this.f45354x = true;
                this.f45345o.invalidateSelf();
                return;
            }
            return;
        }
        C5271d c5271d = new C5271d(eVar2.f45392t);
        this.f45348r = c5271d;
        c5271d.f43687b = true;
        c5271d.a(new AbstractC5268a.InterfaceC0489a() { // from class: q2.a
            @Override // l2.AbstractC5268a.InterfaceC0489a
            public final void a() {
                b bVar = this.f45328a;
                boolean z10 = bVar.f45348r.l() == 1.0f;
                if (z10 != bVar.f45354x) {
                    bVar.f45354x = z10;
                    bVar.f45345o.invalidateSelf();
                }
            }
        });
        boolean z10 = this.f45348r.f().floatValue() == 1.0f;
        if (z10 != this.f45354x) {
            this.f45354x = z10;
            this.f45345o.invalidateSelf();
        }
        e(this.f45348r);
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f45345o.invalidateSelf();
    }

    @Override // n2.InterfaceC5352f
    public void c(ColorFilter colorFilter, B0.f fVar) {
        this.f45353w.c(colorFilter, fVar);
    }

    @Override // k2.InterfaceC5214e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f45344n;
        matrix2.set(matrix);
        if (z10) {
            List<b> list = this.f45351u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.f45351u.get(size).f45353w.e());
                }
            } else {
                b bVar = this.f45350t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f45353w.e());
                }
            }
        }
        matrix2.preConcat(this.f45353w.e());
    }

    public final void e(AbstractC5268a<?, ?> abstractC5268a) {
        if (abstractC5268a == null) {
            return;
        }
        this.f45352v.add(abstractC5268a);
    }

    @Override // n2.InterfaceC5352f
    public final void g(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        b bVar = this.f45349s;
        e eVar = this.f45346p;
        if (bVar != null) {
            String str = bVar.f45346p.f45376c;
            C5351e c5351e3 = new C5351e(c5351e2);
            c5351e3.f44270a.add(str);
            if (c5351e.a(i, this.f45349s.f45346p.f45376c)) {
                b bVar2 = this.f45349s;
                C5351e c5351e4 = new C5351e(c5351e3);
                c5351e4.f44271b = bVar2;
                arrayList.add(c5351e4);
            }
            if (c5351e.d(i, eVar.f45376c)) {
                this.f45349s.q(c5351e, c5351e.b(i, this.f45349s.f45346p.f45376c) + i, arrayList, c5351e3);
            }
        }
        if (c5351e.c(i, eVar.f45376c)) {
            String str2 = eVar.f45376c;
            if (!"__container".equals(str2)) {
                C5351e c5351e5 = new C5351e(c5351e2);
                c5351e5.f44270a.add(str2);
                if (c5351e.a(i, str2)) {
                    C5351e c5351e6 = new C5351e(c5351e5);
                    c5351e6.f44271b = this;
                    arrayList.add(c5351e6);
                }
                c5351e2 = c5351e5;
            }
            if (c5351e.d(i, str2)) {
                q(c5351e, c5351e.b(i, str2) + i, arrayList, c5351e2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k2.InterfaceC5214e
    public final void h(Canvas canvas, Matrix matrix, int i) {
        int i10;
        float f10;
        int i11;
        int i12;
        C5167a c5167a;
        PorterDuff.Mode mode;
        int i13;
        Integer numF;
        int i14 = 1;
        EnumC4441a enumC4441a = C4444d.f38338a;
        if (this.f45354x) {
            e eVar = this.f45346p;
            if (eVar.f45394v) {
                return;
            }
            i();
            Matrix matrix2 = this.f45333b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.f45351u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(this.f45351u.get(size).f45353w.e());
            }
            EnumC4441a enumC4441a2 = C4444d.f38338a;
            p pVar = this.f45353w;
            AbstractC5268a<Integer, Integer> abstractC5268a = pVar.f43742j;
            int iIntValue = (int) ((((i / 255.0f) * ((abstractC5268a == null || (numF = abstractC5268a.f()) == null) ? 100 : numF.intValue())) / 100.0f) * 255.0f);
            int i15 = 0;
            byte b10 = this.f45349s != null;
            EnumC5447g enumC5447g = eVar.f45397y;
            if (b10 != true && !n() && enumC5447g == EnumC5447g.NORMAL) {
                matrix2.preConcat(pVar.e());
                k(canvas, matrix2, iIntValue);
                o();
                return;
            }
            RectF rectF = this.i;
            d(rectF, matrix2, false);
            if (this.f45349s != null) {
                if (eVar.f45393u != e.b.INVERT) {
                    RectF rectF2 = this.f45342l;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f45349s.d(rectF2, matrix, true);
                    if (!rectF.intersect(rectF2)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            matrix2.preConcat(pVar.e());
            RectF rectF3 = this.f45341k;
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zN = n();
            Path path = this.f45332a;
            C5275h c5275h = this.f45347q;
            if (zN) {
                int size2 = ((List) c5275h.f43715d).size();
                while (i15 < size2) {
                    p2.h hVar = (p2.h) ((List) c5275h.f43715d).get(i15);
                    Path path2 = (Path) ((AbstractC5268a) ((ArrayList) c5275h.f43713b).get(i15)).f();
                    if (path2 != null) {
                        path.set(path2);
                        path.transform(matrix2);
                        int i16 = a.f45358b[hVar.f45042a.ordinal()];
                        if (i16 != i14 && i16 != 2) {
                            if (i16 == 3 || i16 == 4) {
                                if (hVar.f45045d) {
                                }
                            }
                            RectF rectF4 = this.f45343m;
                            path.computeBounds(rectF4, false);
                            if (i15 == 0) {
                                rectF3.set(rectF4);
                                i12 = size2;
                                i11 = i14;
                            } else {
                                i11 = i14;
                                i12 = size2;
                                rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                            }
                        }
                        i10 = i14;
                        break;
                    }
                    i12 = size2;
                    i11 = i14;
                    i15++;
                    i14 = i11;
                    size2 = i12;
                }
                i10 = i14;
                if (rectF.intersect(rectF3)) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            } else {
                i10 = i14;
                f10 = 0.0f;
            }
            RectF rectF5 = this.f45340j;
            rectF5.set(f10, f10, canvas.getWidth(), canvas.getHeight());
            Matrix matrix3 = this.f45334c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF.intersect(rectF5)) {
                rectF.set(f10, f10, f10, f10);
            }
            EnumC4441a enumC4441a3 = C4444d.f38338a;
            if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                C5167a c5167a2 = this.f45335d;
                c5167a2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                C0.a nativeBlendMode = enumC5447g.toNativeBlendMode();
                int i17 = C0.f.f805a;
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 29) {
                    f.b.a(c5167a2, nativeBlendMode != null ? C0.c.a(nativeBlendMode) : null);
                } else if (nativeBlendMode != null) {
                    switch (C0.b.f798a[nativeBlendMode.ordinal()]) {
                        case 1:
                            mode = PorterDuff.Mode.CLEAR;
                            break;
                        case 2:
                            mode = PorterDuff.Mode.SRC;
                            break;
                        case 3:
                            mode = PorterDuff.Mode.DST;
                            break;
                        case 4:
                            mode = PorterDuff.Mode.SRC_OVER;
                            break;
                        case 5:
                            mode = PorterDuff.Mode.DST_OVER;
                            break;
                        case 6:
                            mode = PorterDuff.Mode.SRC_IN;
                            break;
                        case 7:
                            mode = PorterDuff.Mode.DST_IN;
                            break;
                        case 8:
                            mode = PorterDuff.Mode.SRC_OUT;
                            break;
                        case 9:
                            mode = PorterDuff.Mode.DST_OUT;
                            break;
                        case 10:
                            mode = PorterDuff.Mode.SRC_ATOP;
                            break;
                        case 11:
                            mode = PorterDuff.Mode.DST_ATOP;
                            break;
                        case 12:
                            mode = PorterDuff.Mode.XOR;
                            break;
                        case 13:
                            mode = PorterDuff.Mode.ADD;
                            break;
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.OVERLAY;
                            break;
                        case 17:
                            mode = PorterDuff.Mode.DARKEN;
                            break;
                        case 18:
                            mode = PorterDuff.Mode.LIGHTEN;
                            break;
                        default:
                            mode = null;
                            break;
                    }
                    c5167a2.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
                } else {
                    c5167a2.setXfermode(null);
                }
                C5629h.f(canvas, rectF, c5167a2);
                if (enumC5447g != EnumC5447g.MULTIPLY) {
                    j(canvas);
                    i13 = 0;
                } else {
                    if (this.f45331C == null) {
                        C5167a c5167a3 = new C5167a();
                        this.f45331C = c5167a3;
                        c5167a3.setColor(-1);
                    }
                    i13 = 0;
                    canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f45331C);
                }
                k(canvas, matrix2, iIntValue);
                if (n()) {
                    C5167a c5167a4 = this.f45336e;
                    canvas.saveLayer(rectF, c5167a4);
                    if (i18 < 28) {
                        j(canvas);
                    }
                    int i19 = i13;
                    while (i19 < ((List) c5275h.f43715d).size()) {
                        List list = (List) c5275h.f43715d;
                        p2.h hVar2 = (p2.h) list.get(i19);
                        ArrayList arrayList = (ArrayList) c5275h.f43713b;
                        AbstractC5268a abstractC5268a2 = (AbstractC5268a) arrayList.get(i19);
                        AbstractC5268a abstractC5268a3 = (AbstractC5268a) ((ArrayList) c5275h.f43714c).get(i19);
                        int i20 = i19;
                        int i21 = a.f45358b[hVar2.f45042a.ordinal()];
                        if (i21 != i10) {
                            C5167a c5167a5 = this.f45337f;
                            boolean z10 = hVar2.f45045d;
                            if (i21 == 2) {
                                if (i20 == 0) {
                                    c5167a2.setColor(-16777216);
                                    c5167a2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                    canvas.drawRect(rectF, c5167a2);
                                }
                                if (z10) {
                                    C5629h.f(canvas, rectF, c5167a5);
                                    canvas.drawRect(rectF, c5167a2);
                                    c5167a5.setAlpha((int) (((Integer) abstractC5268a3.f()).intValue() * 2.55f));
                                    path.set((Path) abstractC5268a2.f());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, c5167a5);
                                    canvas.restore();
                                } else {
                                    path.set((Path) abstractC5268a2.f());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, c5167a5);
                                }
                            } else if (i21 != 3) {
                                if (i21 == 4) {
                                    if (z10) {
                                        C5629h.f(canvas, rectF, c5167a2);
                                        canvas.drawRect(rectF, c5167a2);
                                        path.set((Path) abstractC5268a2.f());
                                        path.transform(matrix2);
                                        c5167a2.setAlpha((int) (((Integer) abstractC5268a3.f()).intValue() * 2.55f));
                                        canvas.drawPath(path, c5167a5);
                                        canvas.restore();
                                    } else {
                                        path.set((Path) abstractC5268a2.f());
                                        path.transform(matrix2);
                                        c5167a2.setAlpha((int) (((Integer) abstractC5268a3.f()).intValue() * 2.55f));
                                        canvas.drawPath(path, c5167a2);
                                    }
                                }
                            } else if (z10) {
                                C5629h.f(canvas, rectF, c5167a4);
                                canvas.drawRect(rectF, c5167a2);
                                c5167a5.setAlpha((int) (((Integer) abstractC5268a3.f()).intValue() * 2.55f));
                                path.set((Path) abstractC5268a2.f());
                                path.transform(matrix2);
                                canvas.drawPath(path, c5167a5);
                                canvas.restore();
                            } else {
                                C5629h.f(canvas, rectF, c5167a4);
                                path.set((Path) abstractC5268a2.f());
                                path.transform(matrix2);
                                c5167a2.setAlpha((int) (((Integer) abstractC5268a3.f()).intValue() * 2.55f));
                                canvas.drawPath(path, c5167a2);
                                canvas.restore();
                            }
                        } else {
                            if (!arrayList.isEmpty()) {
                                for (int i22 = i13; i22 < list.size(); i22++) {
                                    if (((p2.h) list.get(i22)).f45042a == h.a.MASK_MODE_NONE) {
                                    }
                                }
                                i10 = 1;
                                c5167a2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                canvas.drawRect(rectF, c5167a2);
                            }
                            i19 = i20 + 1;
                        }
                        i10 = 1;
                        i19 = i20 + 1;
                    }
                    EnumC4441a enumC4441a4 = C4444d.f38338a;
                    canvas.restore();
                }
                if (this.f45349s != null) {
                    canvas.saveLayer(rectF, this.f45338g);
                    j(canvas);
                    this.f45349s.h(canvas, matrix, iIntValue);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.f45355y && (c5167a = this.f45356z) != null) {
                c5167a.setStyle(Paint.Style.STROKE);
                this.f45356z.setColor(-251901);
                this.f45356z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF, this.f45356z);
                this.f45356z.setStyle(Paint.Style.FILL);
                this.f45356z.setColor(1357638635);
                canvas.drawRect(rectF, this.f45356z);
            }
            o();
        }
    }

    public final void i() {
        if (this.f45351u != null) {
            return;
        }
        if (this.f45350t == null) {
            this.f45351u = Collections.EMPTY_LIST;
            return;
        }
        this.f45351u = new ArrayList();
        for (b bVar = this.f45350t; bVar != null; bVar = bVar.f45350t) {
            this.f45351u.add(bVar);
        }
    }

    public final void j(Canvas canvas) {
        EnumC4441a enumC4441a = C4444d.f38338a;
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f45339h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i);

    public I l() {
        return this.f45346p.f45395w;
    }

    public D3.d m() {
        return this.f45346p.f45396x;
    }

    public final boolean n() {
        C5275h c5275h = this.f45347q;
        return (c5275h == null || ((ArrayList) c5275h.f43713b).isEmpty()) ? false : true;
    }

    public final void o() {
        C4437J c4437j = this.f45345o.f38423b.f38345a;
        String str = this.f45346p.f45376c;
        if (c4437j.f38333a) {
            HashMap map = c4437j.f38335c;
            C5627f c5627f = (C5627f) map.get(str);
            if (c5627f == null) {
                c5627f = new C5627f();
                map.put(str, c5627f);
            }
            int i = c5627f.f46555a + 1;
            c5627f.f46555a = i;
            if (i == Integer.MAX_VALUE) {
                c5627f.f46555a = i / 2;
            }
            if (str.equals("__container")) {
                C5309b c5309b = c4437j.f38334b;
                c5309b.getClass();
                C5309b.a aVar = new C5309b.a();
                while (aVar.hasNext()) {
                    ((C4437J.a) aVar.next()).a();
                }
            }
        }
    }

    public final void p(AbstractC5268a<?, ?> abstractC5268a) {
        this.f45352v.remove(abstractC5268a);
    }

    public void r(boolean z10) {
        if (z10 && this.f45356z == null) {
            this.f45356z = new C5167a();
        }
        this.f45355y = z10;
    }

    public void s(float f10) {
        EnumC4441a enumC4441a = C4444d.f38338a;
        p pVar = this.f45353w;
        AbstractC5268a<Integer, Integer> abstractC5268a = pVar.f43742j;
        if (abstractC5268a != null) {
            abstractC5268a.j(f10);
        }
        AbstractC5268a<?, Float> abstractC5268a2 = pVar.f43745m;
        if (abstractC5268a2 != null) {
            abstractC5268a2.j(f10);
        }
        AbstractC5268a<?, Float> abstractC5268a3 = pVar.f43746n;
        if (abstractC5268a3 != null) {
            abstractC5268a3.j(f10);
        }
        AbstractC5268a<PointF, PointF> abstractC5268a4 = pVar.f43739f;
        if (abstractC5268a4 != null) {
            abstractC5268a4.j(f10);
        }
        AbstractC5268a<?, PointF> abstractC5268a5 = pVar.f43740g;
        if (abstractC5268a5 != null) {
            abstractC5268a5.j(f10);
        }
        AbstractC5268a<v2.c, v2.c> abstractC5268a6 = pVar.f43741h;
        if (abstractC5268a6 != null) {
            abstractC5268a6.j(f10);
        }
        AbstractC5268a<Float, Float> abstractC5268a7 = pVar.i;
        if (abstractC5268a7 != null) {
            abstractC5268a7.j(f10);
        }
        C5271d c5271d = pVar.f43743k;
        if (c5271d != null) {
            c5271d.j(f10);
        }
        C5271d c5271d2 = pVar.f43744l;
        if (c5271d2 != null) {
            c5271d2.j(f10);
        }
        C5275h c5275h = this.f45347q;
        int i = 0;
        if (c5275h != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) c5275h.f43713b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((AbstractC5268a) arrayList.get(i10)).j(f10);
                i10++;
            }
            EnumC4441a enumC4441a2 = C4444d.f38338a;
        }
        C5271d c5271d3 = this.f45348r;
        if (c5271d3 != null) {
            c5271d3.j(f10);
        }
        b bVar = this.f45349s;
        if (bVar != null) {
            bVar.s(f10);
        }
        while (true) {
            ArrayList arrayList2 = this.f45352v;
            if (i >= arrayList2.size()) {
                EnumC4441a enumC4441a3 = C4444d.f38338a;
                return;
            } else {
                ((AbstractC5268a) arrayList2.get(i)).j(f10);
                i++;
            }
        }
    }

    @Override // k2.InterfaceC5212c
    public final void b(List<InterfaceC5212c> list, List<InterfaceC5212c> list2) {
    }

    public void q(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
    }
}
