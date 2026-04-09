package h;

import L0.I;
import L0.S;
import android.view.ViewGroup;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4402f f38068b;

    /* compiled from: AppCompatDelegateImpl.java */
    public class a extends A2.l {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f38069c;

        public a(h hVar) {
            super(13);
            this.f38069c = hVar;
        }

        @Override // A2.l, L0.T
        public final void d() {
            this.f38069c.f38068b.f38029w.setVisibility(0);
        }

        @Override // L0.T
        public final void e() {
            LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = this.f38069c.f38068b;
            layoutInflaterFactory2C4402f.f38029w.setAlpha(1.0f);
            layoutInflaterFactory2C4402f.f38032z.d(null);
            layoutInflaterFactory2C4402f.f38032z = null;
        }
    }

    public h(LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f) {
        this.f38068b = layoutInflaterFactory2C4402f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = this.f38068b;
        layoutInflaterFactory2C4402f.f38030x.showAtLocation(layoutInflaterFactory2C4402f.f38029w, 55, 0, 0);
        S s10 = layoutInflaterFactory2C4402f.f38032z;
        if (s10 != null) {
            s10.b();
        }
        if (!(layoutInflaterFactory2C4402f.f37983B && (viewGroup = layoutInflaterFactory2C4402f.f37984C) != null && viewGroup.isLaidOut())) {
            layoutInflaterFactory2C4402f.f38029w.setAlpha(1.0f);
            layoutInflaterFactory2C4402f.f38029w.setVisibility(0);
            return;
        }
        layoutInflaterFactory2C4402f.f38029w.setAlpha(0.0f);
        S sA = I.a(layoutInflaterFactory2C4402f.f38029w);
        sA.a(1.0f);
        layoutInflaterFactory2C4402f.f38032z = sA;
        sA.d(new a(this));
    }
}
