package h6;

import Y5.c;
import Yg.J;
import Zg.AbstractC3689v;
import a6.EnumC3767a;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b6.AbstractC4072a;
import e6.InterfaceC5422a;
import g6.C5867c;
import j6.C6254a;
import j6.InterfaceC6255b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k6.C6396c;
import k6.C6397d;
import k6.InterfaceC6394a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.AbstractC6497x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import m6.AbstractC6775a;
import mh.r;
import org.conscrypt.PSKKeyManager;
import r6.InterfaceC7576b;
import sh.AbstractC7978m;
import sh.InterfaceC7970e;
import t6.AbstractC8036d;
import t6.C8034b;
import t6.EnumC8035c;
import th.i;
import u6.InterfaceC8137b;
import x6.InterfaceC8423a;
import y6.AbstractC8612a;
import y6.AbstractC8618g;
import y6.AbstractC8620i;
import z6.C8713a;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5953a extends AbstractC4072a {

    /* renamed from: k, reason: collision with root package name */
    private List f48428k;

    /* renamed from: l, reason: collision with root package name */
    private float f48429l;

    /* renamed from: m, reason: collision with root package name */
    private c.b f48430m;

    /* renamed from: n, reason: collision with root package name */
    private b f48431n;

    /* renamed from: o, reason: collision with root package name */
    private final Path f48432o;

    /* renamed from: p, reason: collision with root package name */
    private final Path f48433p;

    /* renamed from: q, reason: collision with root package name */
    private final C6254a f48434q;

    /* renamed from: r, reason: collision with root package name */
    private final HashMap f48435r;

    /* renamed from: h6.a$b */
    public enum b {
        Start(EnumC3767a.Start, 1),
        Center(EnumC3767a.Center, 0);

        private final int dataLabelsToSkip;
        private final EnumC3767a labelPosition;

        b(EnumC3767a enumC3767a, int i10) {
            this.labelPosition = enumC3767a;
            this.dataLabelsToSkip = i10;
        }

        public final int getDataLabelsToSkip$core_release() {
            return this.dataLabelsToSkip;
        }

        public final EnumC3767a getLabelPosition$core_release() {
            return this.labelPosition;
        }
    }

    /* renamed from: h6.a$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48449a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48449a = iArr;
        }
    }

    /* renamed from: h6.a$d */
    static final class d extends AbstractC6494u implements r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1790a f48451b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f48452c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K f48453d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5422a f48454e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1790a c1790a, K k10, K k11, InterfaceC5422a interfaceC5422a) {
            super(4);
            this.f48451b = c1790a;
            this.f48452c = k10;
            this.f48453d = k11;
            this.f48454e = interfaceC5422a;
        }

        public final void a(int i10, InterfaceC8423a entry, float f10, float f11) {
            AbstractC6492s.i(entry, "entry");
            if (C5953a.this.H().isEmpty()) {
                C5953a.this.H().moveTo(f10, f11);
                if (this.f48451b.h()) {
                    C5953a.this.G().moveTo(f10, C5953a.this.getBounds().bottom);
                    C5953a.this.G().lineTo(f10, f11);
                }
            } else {
                this.f48451b.l().a(C5953a.this.H(), this.f48452c.f51686a, this.f48453d.f51686a, f10, f11, this.f48454e.i(), C5953a.this.getBounds());
                if (this.f48451b.h()) {
                    this.f48451b.l().a(C5953a.this.G(), this.f48452c.f51686a, this.f48453d.f51686a, f10, f11, this.f48454e.i(), C5953a.this.getBounds());
                }
            }
            this.f48452c.f51686a = f10;
            this.f48453d.f51686a = f11;
            float f12 = C5953a.this.getBounds().left;
            if (f10 > C5953a.this.getBounds().right || f12 > f10) {
                return;
            }
            b6.c.a(C5953a.this.m(), f10, AbstractC7978m.j(f11, C5953a.this.getBounds().top, C5953a.this.getBounds().bottom), entry, this.f48451b.i());
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a(((Number) obj).intValue(), (InterfaceC8423a) obj2, ((Number) obj3).floatValue(), ((Number) obj4).floatValue());
            return J.f24997a;
        }
    }

    /* renamed from: h6.a$e */
    static final class e extends AbstractC6494u implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1790a f48455a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5422a f48456b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5953a f48457c;

        /* renamed from: h6.a$e$a, reason: collision with other inner class name */
        public /* synthetic */ class C1792a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48458a;

            static {
                int[] iArr = new int[EnumC8035c.values().length];
                try {
                    iArr[EnumC8035c.Top.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC8035c.Center.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC8035c.Bottom.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f48458a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C1790a c1790a, InterfaceC5422a interfaceC5422a, C5953a c5953a) {
            super(4);
            this.f48455a = c1790a;
            this.f48456b = interfaceC5422a;
            this.f48457c = c5953a;
        }

        public final void a(int i10, InterfaceC8423a chartEntry, float f10, float f11) {
            AbstractC6492s.i(chartEntry, "chartEntry");
            if (this.f48455a.k() != null) {
                this.f48455a.c(this.f48456b, f10, f11);
            }
            C8034b c8034bD = this.f48455a.d();
            if (this.f48457c.I().getDataLabelsToSkip$core_release() > i10) {
                c8034bD = null;
            }
            C8034b c8034b = c8034bD;
            if (c8034b != null) {
                InterfaceC5422a interfaceC5422a = this.f48456b;
                C1790a c1790a = this.f48455a;
                C5953a c5953a = this.f48457c;
                float f12 = 0.0f;
                float fG = interfaceC5422a.g(Math.max(c1790a.j(), c1790a.k() != null ? c1790a.m() : 0.0f) / 2);
                CharSequence charSequenceA = c1790a.f().a(chartEntry.b(), interfaceC5422a.c().a(c5953a.K()));
                EnumC8035c enumC8035cA = AbstractC8036d.a(c1790a.g(), c5953a.getBounds(), fG, C8034b.g(c8034b, interfaceC5422a, charSequenceA, (int) interfaceC5422a.g(interfaceC5422a.i().a()), 0, c1790a.e(), 8, null), f11);
                int i11 = C1792a.f48458a[enumC8035cA.ordinal()];
                if (i11 == 1) {
                    f12 = -fG;
                } else if (i11 != 2) {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = fG;
                }
                C8034b.d(c8034b, interfaceC5422a, charSequenceA, f10, f11 + f12, null, enumC8035cA, (int) interfaceC5422a.g(interfaceC5422a.i().a()), 0, c1790a.e(), 144, null);
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a(((Number) obj).intValue(), (InterfaceC8423a) obj2, ((Number) obj3).floatValue(), ((Number) obj4).floatValue());
            return J.f24997a;
        }
    }

    public /* synthetic */ C5953a(List list, float f10, c.b bVar, b bVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC3689v.e(new C1790a(0, 0.0f, null, null, null, 0.0f, null, null, null, 0.0f, null, 2047, null)) : list, (i10 & 2) != 0 ? 16.0f : f10, (i10 & 4) != 0 ? null : bVar, (i10 & 8) != 0 ? b.Center : bVar2);
    }

    private static final float D(float f10, InterfaceC8137b interfaceC8137b, InterfaceC6255b interfaceC6255b, float f11, float f12, InterfaceC8423a interfaceC8423a) {
        return f10 + (((interfaceC8137b.j() * (interfaceC6255b.g() + interfaceC6255b.e())) * (interfaceC8423a.a() - f11)) / f12);
    }

    private static final float E(C5953a c5953a, float f10, float f11, InterfaceC8423a interfaceC8423a) {
        return c5953a.getBounds().bottom - ((interfaceC8423a.b() - f10) * f11);
    }

    protected void B(InterfaceC5422a interfaceC5422a, C1790a lineSpec, List entries, float f10) {
        AbstractC6492s.i(interfaceC5422a, "<this>");
        AbstractC6492s.i(lineSpec, "lineSpec");
        AbstractC6492s.i(entries, "entries");
        if (lineSpec.k() == null && lineSpec.d() == null) {
            return;
        }
        C(interfaceC5422a, entries, interfaceC5422a.i(), f10, new e(lineSpec, interfaceC5422a, this));
    }

    protected void C(InterfaceC8137b interfaceC8137b, List entries, InterfaceC6255b segment, float f10, r action) {
        float f11;
        Object obj;
        AbstractC6492s.i(interfaceC8137b, "<this>");
        AbstractC6492s.i(entries, "entries");
        AbstractC6492s.i(segment, "segment");
        AbstractC6492s.i(action, "action");
        C6397d c6397dA = interfaceC8137b.c().a(this.f48430m);
        float fE = c6397dA.e();
        float fB = c6397dA.b();
        float fC = c6397dA.c();
        float fA = c6397dA.a();
        float fD = c6397dA.d();
        float fHeight = getBounds().height() / (fA - fC);
        float fC2 = AbstractC8620i.c(getBounds(), interfaceC8137b.h());
        float fJ = fC2 + (interfaceC8137b.j() * getBounds().width());
        InterfaceC7970e interfaceC7970eB = AbstractC7978m.b(fE - fD, fB + fD);
        Iterator it = entries.iterator();
        int i10 = 0;
        InterfaceC8423a interfaceC8423a = null;
        InterfaceC8423a interfaceC8423a2 = null;
        while (it.hasNext()) {
            InterfaceC8423a interfaceC8423a3 = (InterfaceC8423a) it.next();
            if (interfaceC7970eB.f(Float.valueOf(interfaceC8423a3.a()))) {
                InterfaceC8423a interfaceC8423a4 = interfaceC8423a;
                InterfaceC7970e interfaceC7970e = interfaceC7970eB;
                float fD2 = D(f10, interfaceC8137b, segment, fE, fD, interfaceC8423a3);
                float fE2 = E(this, fC, fHeight, interfaceC8423a3);
                if ((interfaceC8137b.h() && fD2 < fC2) || (!interfaceC8137b.h() && fD2 > fC2)) {
                    f11 = fD;
                    interfaceC8423a = interfaceC8423a3;
                } else if (AbstractC8618g.a(fC2, fJ).f(Float.valueOf(fD2))) {
                    if (interfaceC8423a4 != null) {
                        float f12 = fD;
                        f11 = fD;
                        obj = interfaceC8423a3;
                        action.y(Integer.valueOf(i10), interfaceC8423a4, Float.valueOf(D(f10, interfaceC8137b, segment, fE, f12, interfaceC8423a4)), Float.valueOf(E(this, fC, fHeight, interfaceC8423a4)));
                        interfaceC8423a = null;
                    } else {
                        f11 = fD;
                        obj = interfaceC8423a3;
                        interfaceC8423a = interfaceC8423a4;
                    }
                    action.y(Integer.valueOf(i10), obj, Float.valueOf(fD2), Float.valueOf(fE2));
                } else {
                    f11 = fD;
                    if (((interfaceC8137b.h() && fD2 > fJ) || (!interfaceC8137b.h() && fD2 < fJ)) && interfaceC8423a2 == null) {
                        action.y(Integer.valueOf(i10), interfaceC8423a3, Float.valueOf(fD2), Float.valueOf(fE2));
                        interfaceC8423a2 = interfaceC8423a3;
                    }
                    interfaceC8423a = interfaceC8423a4;
                }
                i10++;
                interfaceC7970eB = interfaceC7970e;
                fD = f11;
            }
        }
    }

    @Override // b6.b
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public HashMap m() {
        return this.f48435r;
    }

    protected final Path G() {
        return this.f48433p;
    }

    protected final Path H() {
        return this.f48432o;
    }

    public final b I() {
        return this.f48431n;
    }

    @Override // b6.b
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public InterfaceC6255b f(u6.e context, x6.b model) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(model, "model");
        C6254a c6254a = this.f48434q;
        Iterator it = this.f48428k.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fG = context.g(((C1790a) it.next()).m());
        while (it.hasNext()) {
            fG = Math.max(fG, context.g(((C1790a) it.next()).m()));
        }
        return c6254a.h(fG, context.g(this.f48429l), this.f48431n.getLabelPosition$core_release());
    }

    public final c.b K() {
        return this.f48430m;
    }

    protected final void L() {
        m().clear();
        this.f48432o.rewind();
        this.f48433p.rewind();
    }

    public final void M(List list) {
        AbstractC6492s.i(list, "<set-?>");
        this.f48428k = list;
    }

    public final void N(b bVar) {
        AbstractC6492s.i(bVar, "<set-?>");
        this.f48431n = bVar;
    }

    public final void O(float f10) {
        this.f48429l = f10;
    }

    public final void P(c.b bVar) {
        this.f48430m = bVar;
    }

    @Override // b6.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void k(C6396c chartValuesManager, x6.b model) {
        Float fW;
        Float fU;
        Float fX;
        Float fV;
        AbstractC6492s.i(chartValuesManager, "chartValuesManager");
        AbstractC6492s.i(model, "model");
        InterfaceC6394a interfaceC6394aT = t();
        float fE = ((interfaceC6394aT == null || (fW = interfaceC6394aT.c(model)) == null) && (fW = w()) == null) ? model.e() : fW.floatValue();
        InterfaceC6394a interfaceC6394aT2 = t();
        float fB = ((interfaceC6394aT2 == null || (fU = interfaceC6394aT2.a(model)) == null) && (fU = u()) == null) ? model.b() : fU.floatValue();
        InterfaceC6394a interfaceC6394aT3 = t();
        float fMin = ((interfaceC6394aT3 == null || (fX = interfaceC6394aT3.d(model)) == null) && (fX = x()) == null) ? Math.min(model.c(), 0.0f) : fX.floatValue();
        InterfaceC6394a interfaceC6394aT4 = t();
        chartValuesManager.d(fE, fB, fMin, ((interfaceC6394aT4 == null || (fV = interfaceC6394aT4.b(model)) == null) && (fV = v()) == null) ? model.a() : fV.floatValue(), model, this.f48430m);
    }

    @Override // b6.AbstractC4072a, g6.InterfaceC5865a
    public void i(u6.e context, C5867c outInsets, InterfaceC6255b segmentProperties) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(outInsets, "outInsets");
        AbstractC6492s.i(segmentProperties, "segmentProperties");
        Iterator it = this.f48428k.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        C1790a c1790a = (C1790a) it.next();
        float fMax = c1790a.k() != null ? Math.max(c1790a.j(), c1790a.m()) : c1790a.j();
        while (it.hasNext()) {
            C1790a c1790a2 = (C1790a) it.next();
            fMax = Math.max(fMax, c1790a2.k() != null ? Math.max(c1790a2.j(), c1790a2.m()) : c1790a2.j());
        }
        outInsets.q(context.g(fMax));
    }

    @Override // b6.AbstractC4072a
    protected void n(InterfaceC5422a context, x6.b model) {
        float f10;
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(model, "model");
        L();
        InterfaceC6255b interfaceC6255bI = context.i();
        float f11 = interfaceC6255bI.f();
        float fB = interfaceC6255bI.b();
        int i10 = 0;
        for (Object obj : model.f()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            List list = (List) obj;
            this.f48432o.rewind();
            this.f48433p.rewind();
            C1790a c1790a = (C1790a) AbstractC8612a.a(this.f48428k, i10);
            K k10 = new K();
            k10.f51686a = AbstractC8620i.c(getBounds(), context.h());
            K k11 = new K();
            k11.f51686a = getBounds().bottom;
            float fJ = context.j();
            int i12 = c.f48449a[this.f48431n.ordinal()];
            if (i12 == 1) {
                f10 = 0.0f;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f10 = (fB + f11) / 2;
            }
            float fC = (AbstractC8620i.c(getBounds(), context.h()) + (fJ * f10)) - context.n();
            C(context, list, context.i(), fC, new d(c1790a, k10, k11, context));
            if (c1790a.h()) {
                this.f48433p.lineTo(k10.f51686a, getBounds().bottom);
                this.f48433p.close();
                c1790a.a(context, getBounds(), this.f48433p);
            }
            c1790a.b(context, this.f48432o);
            B(context, c1790a, list, fC);
            i10 = i11;
        }
    }

    public C5953a(List lines, float f10, c.b bVar, b pointPosition) {
        AbstractC6492s.i(lines, "lines");
        AbstractC6492s.i(pointPosition, "pointPosition");
        this.f48428k = lines;
        this.f48429l = f10;
        this.f48430m = bVar;
        this.f48431n = pointPosition;
        this.f48432o = new Path();
        this.f48433p = new Path();
        this.f48434q = new C6254a(0.0f, 0.0f, null, 7, null);
        this.f48435r = new HashMap();
    }

    /* renamed from: h6.a$a, reason: collision with other inner class name */
    public static class C1790a {

        /* renamed from: a, reason: collision with root package name */
        private float f48436a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC7576b f48437b;

        /* renamed from: c, reason: collision with root package name */
        private Paint.Cap f48438c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC6775a f48439d;

        /* renamed from: e, reason: collision with root package name */
        private float f48440e;

        /* renamed from: f, reason: collision with root package name */
        private C8034b f48441f;

        /* renamed from: g, reason: collision with root package name */
        private EnumC8035c f48442g;

        /* renamed from: h, reason: collision with root package name */
        private z6.c f48443h;

        /* renamed from: i, reason: collision with root package name */
        private float f48444i;

        /* renamed from: j, reason: collision with root package name */
        private InterfaceC1791a f48445j;

        /* renamed from: k, reason: collision with root package name */
        private final Paint f48446k;

        /* renamed from: l, reason: collision with root package name */
        private final Paint f48447l;

        /* renamed from: m, reason: collision with root package name */
        private final i f48448m;

        /* renamed from: h6.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC1791a {
            void a(Path path, float f10, float f11, float f12, float f13, InterfaceC6255b interfaceC6255b, RectF rectF);
        }

        public C1790a(int i10, float f10, InterfaceC7576b interfaceC7576b, Paint.Cap lineCap, AbstractC6775a abstractC6775a, float f11, C8034b c8034b, EnumC8035c dataLabelVerticalPosition, z6.c dataLabelValueFormatter, float f12, InterfaceC1791a pointConnector) {
            AbstractC6492s.i(lineCap, "lineCap");
            AbstractC6492s.i(dataLabelVerticalPosition, "dataLabelVerticalPosition");
            AbstractC6492s.i(dataLabelValueFormatter, "dataLabelValueFormatter");
            AbstractC6492s.i(pointConnector, "pointConnector");
            this.f48436a = f10;
            this.f48437b = interfaceC7576b;
            this.f48438c = lineCap;
            this.f48439d = abstractC6775a;
            this.f48440e = f11;
            this.f48441f = c8034b;
            this.f48442g = dataLabelVerticalPosition;
            this.f48443h = dataLabelValueFormatter;
            this.f48444i = f12;
            this.f48445j = pointConnector;
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(i10);
            paint.setStrokeCap(this.f48438c);
            this.f48446k = paint;
            this.f48447l = new Paint(1);
            this.f48448m = new AbstractC6497x(paint) { // from class: h6.a.a.b
                @Override // th.m
                public Object get() {
                    return ((Paint) this.receiver).getStrokeCap();
                }

                @Override // th.i
                public void set(Object obj) {
                    ((Paint) this.receiver).setStrokeCap((Paint.Cap) obj);
                }
            };
        }

        public final void a(InterfaceC8137b context, RectF bounds, Path path) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(bounds, "bounds");
            AbstractC6492s.i(path, "path");
            Paint paint = this.f48447l;
            InterfaceC7576b interfaceC7576b = this.f48437b;
            paint.setShader(interfaceC7576b != null ? interfaceC7576b.a(context, bounds.left, bounds.top, bounds.right, bounds.bottom) : null);
            context.d().drawPath(path, this.f48447l);
        }

        public final void b(InterfaceC8137b context, Path path) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(path, "path");
            this.f48446k.setStrokeWidth(context.g(this.f48436a));
            context.d().drawPath(path, this.f48446k);
        }

        public final void c(InterfaceC8137b context, float f10, float f11) {
            AbstractC6492s.i(context, "context");
            AbstractC6775a abstractC6775a = this.f48439d;
            if (abstractC6775a != null) {
                h6.b.a(abstractC6775a, context, f10, f11, context.g(this.f48440e) / 2);
            }
        }

        public final C8034b d() {
            return this.f48441f;
        }

        public final float e() {
            return this.f48444i;
        }

        public final z6.c f() {
            return this.f48443h;
        }

        public final EnumC8035c g() {
            return this.f48442g;
        }

        public final boolean h() {
            return this.f48437b != null;
        }

        public final int i() {
            return this.f48446k.getColor();
        }

        public final float j() {
            return this.f48436a;
        }

        public final AbstractC6775a k() {
            return this.f48439d;
        }

        public final InterfaceC1791a l() {
            return this.f48445j;
        }

        public final float m() {
            return this.f48440e;
        }

        public /* synthetic */ C1790a(int i10, float f10, InterfaceC7576b interfaceC7576b, Paint.Cap cap, AbstractC6775a abstractC6775a, float f11, C8034b c8034b, EnumC8035c enumC8035c, z6.c cVar, float f12, InterfaceC1791a interfaceC1791a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? -3355444 : i10, (i11 & 2) != 0 ? 2.0f : f10, (i11 & 4) != 0 ? null : interfaceC7576b, (i11 & 8) != 0 ? Paint.Cap.ROUND : cap, (i11 & 16) != 0 ? null : abstractC6775a, (i11 & 32) != 0 ? 16.0f : f11, (i11 & 64) != 0 ? null : c8034b, (i11 & 128) != 0 ? EnumC8035c.Top : enumC8035c, (i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? new C8713a() : cVar, (i11 & 512) != 0 ? 0.0f : f12, (i11 & 1024) != 0 ? new b6.d(0.0f, 1, null) : interfaceC1791a);
        }
    }
}
