package S6;

import T.AbstractC3528f1;
import T.InterfaceC3545n0;
import T.InterfaceC3551q0;
import T.S0;
import T.t1;
import Y0.t;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6537m;
import m0.AbstractC6670H;
import m0.AbstractC6672I;
import m0.AbstractC6735w0;
import m0.InterfaceC6717n0;
import mh.InterfaceC6824a;
import o0.InterfaceC7039f;
import oh.AbstractC7137b;
import r0.AbstractC7554d;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public final class c extends AbstractC7554d implements S0 {

    /* renamed from: g, reason: collision with root package name */
    private final Drawable f20286g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3545n0 f20287h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3551q0 f20288i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f20289j;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20290a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20290a = iArr;
        }
    }

    public static final class b implements Drawable.Callback {
        b() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable d10) {
            AbstractC6492s.i(d10, "d");
            c.this.x(c.this.u() + 1);
            c cVar = c.this;
            cVar.y(e.e(cVar.v()));
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable d10, Runnable what, long j10) {
            AbstractC6492s.i(d10, "d");
            AbstractC6492s.i(what, "what");
            e.f().postAtTime(what, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable d10, Runnable what) {
            AbstractC6492s.i(d10, "d");
            AbstractC6492s.i(what, "what");
            e.f().removeCallbacks(what);
        }
    }

    public c(Drawable drawable) {
        AbstractC6492s.i(drawable, "drawable");
        this.f20286g = drawable;
        this.f20287h = AbstractC3528f1.a(0);
        this.f20288i = t1.d(C6537m.c(e.e(drawable)), null, 2, null);
        this.f20289j = Yg.n.b(new InterfaceC6824a() { // from class: S6.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return c.s(this.f20285a);
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(c cVar) {
        return cVar.new b();
    }

    private final Drawable.Callback t() {
        return (Drawable.Callback) this.f20289j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int u() {
        return this.f20287h.e();
    }

    private final long w() {
        return ((C6537m) this.f20288i.getValue()).m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i10) {
        this.f20287h.l(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(long j10) {
        this.f20288i.setValue(C6537m.c(j10));
    }

    @Override // r0.AbstractC7554d
    protected boolean a(float f10) {
        this.f20286g.setAlpha(AbstractC7978m.k(AbstractC7137b.e(f10 * 255), 0, 255));
        return true;
    }

    @Override // T.S0
    public void b() {
        c();
    }

    @Override // T.S0
    public void c() {
        Object obj = this.f20286g;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.f20286g.setVisible(false, false);
        this.f20286g.setCallback(null);
    }

    @Override // T.S0
    public void d() {
        this.f20286g.setCallback(t());
        this.f20286g.setVisible(true, true);
        Object obj = this.f20286g;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // r0.AbstractC7554d
    protected boolean e(AbstractC6735w0 abstractC6735w0) {
        this.f20286g.setColorFilter(abstractC6735w0 != null ? AbstractC6672I.b(abstractC6735w0) : null);
        return true;
    }

    @Override // r0.AbstractC7554d
    protected boolean f(t layoutDirection) {
        AbstractC6492s.i(layoutDirection, "layoutDirection");
        Drawable drawable = this.f20286g;
        int i10 = a.f20290a[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i11);
    }

    @Override // r0.AbstractC7554d
    public long l() {
        return w();
    }

    @Override // r0.AbstractC7554d
    protected void n(InterfaceC7039f interfaceC7039f) {
        AbstractC6492s.i(interfaceC7039f, "<this>");
        InterfaceC6717n0 interfaceC6717n0D = interfaceC7039f.k1().d();
        u();
        this.f20286g.setBounds(0, 0, AbstractC7137b.e(C6537m.i(interfaceC7039f.c())), AbstractC7137b.e(C6537m.g(interfaceC7039f.c())));
        try {
            interfaceC6717n0D.j();
            this.f20286g.draw(AbstractC6670H.d(interfaceC6717n0D));
        } finally {
            interfaceC6717n0D.r();
        }
    }

    public final Drawable v() {
        return this.f20286g;
    }
}
