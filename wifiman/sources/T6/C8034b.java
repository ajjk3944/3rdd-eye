package t6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.AbstractC6497x;
import kotlin.text.t;
import m6.AbstractC6775a;
import mh.InterfaceC6824a;
import n6.InterfaceC6873b;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import sh.AbstractC7978m;
import th.i;
import u6.InterfaceC8137b;
import u6.e;
import y6.AbstractC8619h;
import y6.AbstractC8620i;

/* renamed from: t6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8034b implements InterfaceC6873b {

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f61802a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f61803b;

    /* renamed from: c, reason: collision with root package name */
    private float f61804c;

    /* renamed from: d, reason: collision with root package name */
    private TextUtils.TruncateAt f61805d;

    /* renamed from: e, reason: collision with root package name */
    private int f61806e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC6775a f61807f;

    /* renamed from: g, reason: collision with root package name */
    private final i f61808g;

    /* renamed from: h, reason: collision with root package name */
    private w6.c f61809h;

    /* renamed from: i, reason: collision with root package name */
    private w6.c f61810i;

    /* renamed from: j, reason: collision with root package name */
    private Layout f61811j;

    /* renamed from: t6.b$a */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private Typeface f61814c;

        /* renamed from: f, reason: collision with root package name */
        private AbstractC6775a f61817f;

        /* renamed from: a, reason: collision with root package name */
        private int f61812a = -16777216;

        /* renamed from: b, reason: collision with root package name */
        private float f61813b = 12.0f;

        /* renamed from: d, reason: collision with root package name */
        private TextUtils.TruncateAt f61815d = TextUtils.TruncateAt.END;

        /* renamed from: e, reason: collision with root package name */
        private int f61816e = 1;

        /* renamed from: g, reason: collision with root package name */
        private Paint.Align f61818g = Paint.Align.LEFT;

        /* renamed from: h, reason: collision with root package name */
        private w6.c f61819h = w6.d.a();

        /* renamed from: i, reason: collision with root package name */
        private w6.c f61820i = w6.d.a();

        public final C8034b a() {
            C8034b c8034b = new C8034b();
            c8034b.w(this.f61812a);
            c8034b.A(this.f61813b);
            c8034b.B(this.f61814c);
            c8034b.x(this.f61815d);
            c8034b.y(this.f61816e);
            c8034b.v(this.f61817f);
            c8034b.z(this.f61818g);
            c8034b.j().j(this.f61819h);
            c8034b.a().j(this.f61820i);
            return c8034b;
        }

        public final void b(AbstractC6775a abstractC6775a) {
            this.f61817f = abstractC6775a;
        }

        public final void c(int i10) {
            this.f61812a = i10;
        }

        public final void d(TextUtils.TruncateAt truncateAt) {
            AbstractC6492s.i(truncateAt, "<set-?>");
            this.f61815d = truncateAt;
        }

        public final void e(int i10) {
            this.f61816e = i10;
        }

        public final void f(w6.c cVar) {
            AbstractC6492s.i(cVar, "<set-?>");
            this.f61820i = cVar;
        }

        public final void g(w6.c cVar) {
            AbstractC6492s.i(cVar, "<set-?>");
            this.f61819h = cVar;
        }

        public final void h(Paint.Align align) {
            AbstractC6492s.i(align, "<set-?>");
            this.f61818g = align;
        }

        public final void i(float f10) {
            this.f61813b = f10;
        }

        public final void j(Typeface typeface) {
            this.f61814c = typeface;
        }
    }

    /* renamed from: t6.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C2173b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61821a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f61822b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f61823c;

        static {
            int[] iArr = new int[EnumC8033a.values().length];
            try {
                iArr[EnumC8033a.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8033a.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8033a.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61821a = iArr;
            int[] iArr2 = new int[EnumC8035c.values().length];
            try {
                iArr2[EnumC8035c.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC8035c.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC8035c.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f61822b = iArr2;
            int[] iArr3 = new int[Paint.Align.values().length];
            try {
                iArr3[Paint.Align.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Paint.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Paint.Align.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f61823c = iArr3;
        }
    }

    /* renamed from: t6.b$c */
    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f61825b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f61826c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f61827d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10, CharSequence charSequence, int i10) {
            super(0);
            this.f61825b = f10;
            this.f61826c = charSequence;
            this.f61827d = i10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StaticLayout invoke() {
            C8034b.this.f61802a.setTextSize(C8034b.this.p() * this.f61825b);
            CharSequence charSequence = this.f61826c;
            TextPaint textPaint = C8034b.this.f61802a;
            int i10 = this.f61827d;
            return F6.a.c(charSequence, textPaint, i10, (3568 & 8) != 0 ? Integer.MAX_VALUE : C8034b.this.i(), (3568 & 16) != 0 ? 0 : 0, (3568 & 32) != 0 ? charSequence.length() : 0, (3568 & 64) != 0 ? 1.0f : 0.0f, (3568 & 128) != 0 ? 0.0f : 0.0f, (3568 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0, (3568 & 512) != 0 ? null : C8034b.this.e(), (3568 & 1024) != 0 ? i10 : 0, (3568 & 2048) != 0 ? Layout.Alignment.ALIGN_NORMAL : null);
        }
    }

    protected C8034b() {
        TextPaint textPaint = new TextPaint(1);
        this.f61802a = textPaint;
        this.f61803b = new RectF();
        this.f61805d = TextUtils.TruncateAt.END;
        this.f61806e = 1;
        this.f61808g = new AbstractC6497x(textPaint) { // from class: t6.b.d
            @Override // th.m
            public Object get() {
                return ((TextPaint) this.receiver).getTextAlign();
            }

            @Override // th.i
            public void set(Object obj) {
                ((TextPaint) this.receiver).setTextAlign((Paint.Align) obj);
            }
        };
        this.f61809h = w6.d.a();
        this.f61810i = w6.d.a();
        this.f61811j = F6.a.c("", textPaint, 0, (3568 & 8) != 0 ? Integer.MAX_VALUE : 0, (3568 & 16) != 0 ? 0 : 0, (3568 & 32) != 0 ? "".length() : 0, (3568 & 64) != 0 ? 1.0f : 0.0f, (3568 & 128) != 0 ? 0.0f : 0.0f, (3568 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0, (3568 & 512) != 0 ? null : null, (3568 & 1024) != 0 ? 0 : 0, (3568 & 2048) != 0 ? Layout.Alignment.ALIGN_NORMAL : null);
    }

    public static /* synthetic */ void d(C8034b c8034b, InterfaceC8137b interfaceC8137b, CharSequence charSequence, float f10, float f11, EnumC8033a enumC8033a, EnumC8035c enumC8035c, int i10, int i11, float f12, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawText");
        }
        c8034b.c(interfaceC8137b, charSequence, f10, f11, (i12 & 16) != 0 ? EnumC8033a.Center : enumC8033a, (i12 & 32) != 0 ? EnumC8035c.Center : enumC8035c, (i12 & 64) != 0 ? Integer.MAX_VALUE : i10, (i12 & 128) != 0 ? Integer.MAX_VALUE : i11, (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0.0f : f12);
    }

    public static /* synthetic */ float g(C8034b c8034b, e eVar, CharSequence charSequence, int i10, int i11, float f10, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHeight");
        }
        if ((i12 & 2) != 0) {
            charSequence = "";
        }
        CharSequence charSequence2 = charSequence;
        int i13 = (i12 & 4) != 0 ? Integer.MAX_VALUE : i10;
        int i14 = (i12 & 8) != 0 ? Integer.MAX_VALUE : i11;
        if ((i12 & 16) != 0) {
            f10 = 0.0f;
        }
        return c8034b.f(eVar, charSequence2, i13, i14, f10);
    }

    private final StaticLayout h(e eVar, CharSequence charSequence, float f10, int i10, int i11, float f11) {
        int iO = i10 - eVar.o(a().e());
        int iO2 = i11 - eVar.o(a().h());
        if (f11 % 180.0f != 0.0f) {
            if (f11 % 90.0f == 0.0f) {
                iO = iO2;
            } else {
                float fA = (this.f61806e * AbstractC8619h.a(this.f61802a)) + eVar.o(j().h());
                double radians = Math.toRadians(f11);
                double dAbs = Math.abs(Math.sin(radians));
                double dAbs2 = Math.abs(Math.cos(radians));
                double d10 = fA;
                iO = (int) Math.min((iO - (d10 * dAbs)) / dAbs2, (iO2 - (d10 * dAbs2)) / dAbs);
            }
        }
        int iD = AbstractC7978m.d(iO - eVar.o(j().e()), 0);
        return (StaticLayout) u6.d.b(eVar, "layout_" + ((Object) charSequence) + iD + f11 + this.f61802a.hashCode(), new c(f10, charSequence, iD));
    }

    public static /* synthetic */ RectF m(C8034b c8034b, e eVar, CharSequence charSequence, int i10, int i11, RectF rectF, boolean z10, float f10, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTextBounds");
        }
        CharSequence charSequence2 = (i12 & 2) != 0 ? "" : charSequence;
        int i13 = i12 & 4;
        int i14 = MPv3.MAX_MESSAGE_ID;
        int i15 = i13 != 0 ? Integer.MAX_VALUE : i10;
        if ((i12 & 8) == 0) {
            i14 = i11;
        }
        return c8034b.l(eVar, charSequence2, i15, i14, (i12 & 16) != 0 ? c8034b.f61803b : rectF, (i12 & 32) != 0 ? true : z10, (i12 & 64) != 0 ? 0.0f : f10);
    }

    private final float n(e eVar, float f10) {
        return f10 + eVar.g(j().f(eVar.h())) + eVar.g(a().f(eVar.h()));
    }

    private final float o(e eVar, float f10, float f11) {
        return ((f10 - eVar.g(j().g(eVar.h()))) - eVar.g(a().g(eVar.h()))) - f11;
    }

    private final float q(EnumC8033a enumC8033a, e eVar, float f10, float f11) {
        int i10 = C2173b.f61821a[enumC8033a.ordinal()];
        if (i10 == 1) {
            return eVar.h() ? o(eVar, f10, f11) : n(eVar, f10);
        }
        if (i10 == 2) {
            return eVar.h() ? n(eVar, f10) : o(eVar, f10, f11);
        }
        if (i10 == 3) {
            return f10 - (f11 / 2);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final float r(EnumC8035c enumC8035c, e eVar, float f10, float f11) {
        float fG;
        int i10 = C2173b.f61822b[enumC8035c.ordinal()];
        if (i10 == 1) {
            fG = ((-f11) - eVar.g(j().a())) - eVar.g(a().a());
        } else if (i10 == 2) {
            fG = eVar.g(j().c()) + eVar.g(a().c());
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fG = -(f11 / 2);
        }
        return f10 + fG;
    }

    public static /* synthetic */ float t(C8034b c8034b, e eVar, CharSequence charSequence, int i10, int i11, float f10, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWidth");
        }
        int i13 = (i12 & 4) != 0 ? Integer.MAX_VALUE : i10;
        int i14 = (i12 & 8) != 0 ? Integer.MAX_VALUE : i11;
        if ((i12 & 16) != 0) {
            f10 = 0.0f;
        }
        return c8034b.s(eVar, charSequence, i13, i14, f10);
    }

    private final float u(Paint.Align align, float f10) {
        int i10 = C2173b.f61823c[align.ordinal()];
        if (i10 == 1) {
            return 0.0f;
        }
        if (i10 == 2) {
            return f10 / 2;
        }
        if (i10 == 3) {
            return f10;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void A(float f10) {
        this.f61804c = f10;
    }

    public final void B(Typeface typeface) {
        this.f61802a.setTypeface(typeface);
    }

    @Override // n6.InterfaceC6873b
    public w6.c a() {
        return this.f61810i;
    }

    public final void c(InterfaceC8137b context, CharSequence text, float f10, float f11, EnumC8033a horizontalPosition, EnumC8035c verticalPosition, int i10, int i11, float f12) {
        float f13;
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(text, "text");
        AbstractC6492s.i(horizontalPosition, "horizontalPosition");
        AbstractC6492s.i(verticalPosition, "verticalPosition");
        if (t.m0(text)) {
            return;
        }
        StaticLayout staticLayoutH = h(context, text, context.y(), i10, i11, f12);
        this.f61811j = staticLayoutH;
        float f14 = 0.0f;
        boolean z10 = f12 % 360.0f == 0.0f;
        float fQ = q(horizontalPosition, context, f10, F6.a.b(staticLayoutH));
        float fR = r(verticalPosition, context, f11, this.f61811j.getHeight());
        Canvas canvasD = context.d();
        canvasD.save();
        RectF rectFA = F6.a.a(this.f61811j, this.f61803b);
        float fU = u(k(), rectFA.width());
        rectFA.left -= context.g(j().f(context.h()));
        rectFA.top -= context.g(j().c());
        rectFA.right += context.g(j().g(context.h()));
        rectFA.bottom += context.g(j().a());
        if (z10) {
            f13 = 0.0f;
        } else {
            RectF rectFD = AbstractC8620i.d(AbstractC8620i.a(rectFA), f12);
            float fHeight = rectFA.height() - rectFD.height();
            float fWidth = rectFA.width() - rectFD.width();
            int i12 = C2173b.f61821a[horizontalPosition.ordinal()];
            float fJ = (i12 != 1 ? i12 != 2 ? 0.0f : -(fWidth / 2) : fWidth / 2) * context.j();
            int i13 = C2173b.f61822b[verticalPosition.ordinal()];
            if (i13 == 1) {
                f14 = fHeight / 2;
            } else if (i13 == 2) {
                f14 = -(fHeight / 2);
            }
            f13 = f14;
            f14 = fJ;
        }
        AbstractC8620i.f(rectFA, fQ + f14, fR + f13);
        if (!z10) {
            canvasD.rotate(f12, rectFA.centerX(), rectFA.centerY());
        }
        AbstractC6775a abstractC6775a = this.f61807f;
        if (abstractC6775a != null) {
            abstractC6775a.b(context, rectFA.left, rectFA.top, rectFA.right, rectFA.bottom);
        }
        canvasD.translate(rectFA.left + context.g(j().f(context.h())) + fU, rectFA.top + context.g(j().c()));
        this.f61811j.draw(canvasD);
        canvasD.restore();
    }

    public final TextUtils.TruncateAt e() {
        return this.f61805d;
    }

    public final float f(e context, CharSequence text, int i10, int i11, float f10) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(text, "text");
        return m(this, context, text, i10, i11, null, false, f10, 48, null).height();
    }

    public final int i() {
        return this.f61806e;
    }

    public w6.c j() {
        return this.f61809h;
    }

    public final Paint.Align k() {
        Object obj = this.f61808g.get();
        AbstractC6492s.h(obj, "<get-textAlign>(...)");
        return (Paint.Align) obj;
    }

    public final RectF l(e context, CharSequence text, int i10, int i11, RectF outRect, boolean z10, float f10) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(text, "text");
        AbstractC6492s.i(outRect, "outRect");
        RectF rectFA = F6.a.a(h(context, text, context.y(), i10, i11, f10), outRect);
        if (z10) {
            rectFA.right += context.g(j().e());
            rectFA.bottom += context.g(j().h());
        }
        RectF rectFD = AbstractC8620i.d(rectFA, f10);
        if (z10) {
            rectFD.right += context.g(a().e());
            rectFD.bottom += context.g(a().h());
        }
        return rectFD;
    }

    public final float p() {
        return this.f61804c;
    }

    public final float s(e context, CharSequence text, int i10, int i11, float f10) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(text, "text");
        return m(this, context, text, i10, i11, null, false, f10, 48, null).width();
    }

    public final void v(AbstractC6775a abstractC6775a) {
        this.f61807f = abstractC6775a;
    }

    public final void w(int i10) {
        this.f61802a.setColor(i10);
    }

    public final void x(TextUtils.TruncateAt truncateAt) {
        this.f61805d = truncateAt;
    }

    public final void y(int i10) {
        this.f61806e = i10;
    }

    public final void z(Paint.Align align) {
        AbstractC6492s.i(align, "<set-?>");
        this.f61808g.set(align);
    }
}
