package s;

import android.view.View;
import android.widget.Magnifier;
import l0.C6531g;

/* loaded from: classes.dex */
public final class W implements V {

    /* renamed from: b, reason: collision with root package name */
    public static final W f60695b = new W();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f60696c = false;

    public static class a implements U {

        /* renamed from: a, reason: collision with root package name */
        private final Magnifier f60697a;

        public a(Magnifier magnifier) {
            this.f60697a = magnifier;
        }

        @Override // s.U
        public void a(long j10, long j11, float f10) {
            this.f60697a.show(C6531g.m(j10), C6531g.n(j10));
        }

        @Override // s.U
        public void b() {
            this.f60697a.update();
        }

        public final Magnifier c() {
            return this.f60697a;
        }

        @Override // s.U
        public void dismiss() {
            this.f60697a.dismiss();
        }

        @Override // s.U
        public long h() {
            return Y0.s.a(this.f60697a.getWidth(), this.f60697a.getHeight());
        }
    }

    private W() {
    }

    @Override // s.V
    public boolean a() {
        return f60696c;
    }

    @Override // s.V
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a b(View view, boolean z10, long j10, float f10, float f11, boolean z11, Y0.d dVar, float f12) {
        return new a(new Magnifier(view));
    }
}
