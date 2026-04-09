package s;

import android.view.View;
import android.widget.Magnifier;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6537m;
import oh.AbstractC7137b;
import s.W;

/* loaded from: classes.dex */
public final class X implements V {

    /* renamed from: b, reason: collision with root package name */
    public static final X f60698b = new X();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f60699c = true;

    public static final class a extends W.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // s.W.a, s.U
        public void a(long j10, long j11, float f10) {
            if (!Float.isNaN(f10)) {
                c().setZoom(f10);
            }
            if (AbstractC6532h.c(j11)) {
                c().show(C6531g.m(j10), C6531g.n(j10), C6531g.m(j11), C6531g.n(j11));
            } else {
                c().show(C6531g.m(j10), C6531g.n(j10));
            }
        }
    }

    private X() {
    }

    @Override // s.V
    public boolean a() {
        return f60699c;
    }

    @Override // s.V
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a b(View view, boolean z10, long j10, float f10, float f11, boolean z11, Y0.d dVar, float f12) {
        if (z10) {
            return new a(new Magnifier(view));
        }
        long jK1 = dVar.K1(j10);
        float fD1 = dVar.d1(f10);
        float fD12 = dVar.d1(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jK1 != 9205357640488583168L) {
            builder.setSize(AbstractC7137b.e(C6537m.i(jK1)), AbstractC7137b.e(C6537m.g(jK1)));
        }
        if (!Float.isNaN(fD1)) {
            builder.setCornerRadius(fD1);
        }
        if (!Float.isNaN(fD12)) {
            builder.setElevation(fD12);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new a(builder.build());
    }
}
