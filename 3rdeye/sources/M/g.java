package m;

import A2.l;
import L0.S;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f43988c;

    /* renamed from: d, reason: collision with root package name */
    public l f43989d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f43990e;

    /* renamed from: b, reason: collision with root package name */
    public long f43987b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final a f43991f = new a(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<S> f43986a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    public class a extends l {

        /* renamed from: c, reason: collision with root package name */
        public boolean f43992c;

        /* renamed from: d, reason: collision with root package name */
        public int f43993d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g f43994e;

        public a(g gVar) {
            super(13);
            this.f43994e = gVar;
            this.f43992c = false;
            this.f43993d = 0;
        }

        @Override // A2.l, L0.T
        public final void d() {
            if (this.f43992c) {
                return;
            }
            this.f43992c = true;
            l lVar = this.f43994e.f43989d;
            if (lVar != null) {
                lVar.d();
            }
        }

        @Override // L0.T
        public final void e() {
            int i = this.f43993d + 1;
            this.f43993d = i;
            g gVar = this.f43994e;
            if (i == gVar.f43986a.size()) {
                l lVar = gVar.f43989d;
                if (lVar != null) {
                    lVar.e();
                }
                this.f43993d = 0;
                this.f43992c = false;
                gVar.f43990e = false;
            }
        }
    }

    public final void a() {
        if (this.f43990e) {
            Iterator<S> it = this.f43986a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f43990e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f43990e) {
            return;
        }
        Iterator<S> it = this.f43986a.iterator();
        while (it.hasNext()) {
            S next = it.next();
            long j4 = this.f43987b;
            if (j4 >= 0) {
                next.c(j4);
            }
            BaseInterpolator baseInterpolator = this.f43988c;
            if (baseInterpolator != null && (view = next.f3819a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f43989d != null) {
                next.d(this.f43991f);
            }
            View view2 = next.f3819a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f43990e = true;
    }
}
