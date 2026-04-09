package P;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6737x0;
import m0.C6733v0;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
final class v extends RippleDrawable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f17988e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17989a;

    /* renamed from: b, reason: collision with root package name */
    private C6733v0 f17990b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f17991c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17992d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17993a = new b();

        private b() {
        }

        public final void a(RippleDrawable rippleDrawable, int i10) {
            rippleDrawable.setRadius(i10);
        }
    }

    public v(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f17989a = z10;
    }

    private final long a(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        return C6733v0.k(j10, AbstractC7978m.f(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j10, float f10) {
        long jA = a(j10, f10);
        C6733v0 c6733v0 = this.f17990b;
        if (c6733v0 == null ? false : C6733v0.m(c6733v0.u(), jA)) {
            return;
        }
        this.f17990b = C6733v0.g(jA);
        setColor(ColorStateList.valueOf(AbstractC6737x0.j(jA)));
    }

    public final void c(int i10) {
        Integer num = this.f17991c;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f17991c = Integer.valueOf(i10);
        b.f17993a.a(this, i10);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f17989a) {
            this.f17992d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f17992d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f17992d;
    }
}
