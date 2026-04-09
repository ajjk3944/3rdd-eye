package P;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;
import l0.C6537m;
import mh.InterfaceC6824a;
import oh.AbstractC7137b;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
public final class n extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final a f17939f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f17940g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f17941h = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f17942i = new int[0];

    /* renamed from: a, reason: collision with root package name */
    private v f17943a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f17944b;

    /* renamed from: c, reason: collision with root package name */
    private Long f17945c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f17946d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6824a f17947e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n(Context context) {
        super(context);
    }

    private final void c(boolean z10) {
        v vVar = new v(z10);
        setBackground(vVar);
        this.f17943a = vVar;
    }

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f17946d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f17945c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f17941h : f17942i;
            v vVar = this.f17943a;
            if (vVar != null) {
                vVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: P.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.setRippleState$lambda$2(this.f17938a);
                }
            };
            this.f17946d = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f17945c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(n nVar) {
        v vVar = nVar.f17943a;
        if (vVar != null) {
            vVar.setState(f17942i);
        }
        nVar.f17946d = null;
    }

    public final void b(InterfaceC8560o.b bVar, boolean z10, long j10, int i10, long j11, float f10, InterfaceC6824a interfaceC6824a) {
        if (this.f17943a == null || !AbstractC6492s.d(Boolean.valueOf(z10), this.f17944b)) {
            c(z10);
            this.f17944b = Boolean.valueOf(z10);
        }
        v vVar = this.f17943a;
        AbstractC6492s.f(vVar);
        this.f17947e = interfaceC6824a;
        vVar.c(i10);
        f(j10, j11, f10);
        if (z10) {
            vVar.setHotspot(C6531g.m(bVar.a()), C6531g.n(bVar.a()));
        } else {
            vVar.setHotspot(vVar.getBounds().centerX(), vVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.f17947e = null;
        Runnable runnable = this.f17946d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f17946d;
            AbstractC6492s.f(runnable2);
            runnable2.run();
        } else {
            v vVar = this.f17943a;
            if (vVar != null) {
                vVar.setState(f17942i);
            }
        }
        v vVar2 = this.f17943a;
        if (vVar2 == null) {
            return;
        }
        vVar2.setVisible(false, false);
        unscheduleDrawable(vVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j10, long j11, float f10) {
        v vVar = this.f17943a;
        if (vVar == null) {
            return;
        }
        vVar.b(j11, f10);
        Rect rect = new Rect(0, 0, AbstractC7137b.e(C6537m.i(j10)), AbstractC7137b.e(C6537m.g(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        vVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        InterfaceC6824a interfaceC6824a = this.f17947e;
        if (interfaceC6824a != null) {
            interfaceC6824a.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
