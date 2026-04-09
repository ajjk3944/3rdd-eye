package M6;

import H6.C0675l;
import K6.C0745n;
import N7.C1175g0;
import Q1.f;
import c9.AbstractC2082c;
import c9.C2087h;
import h7.C4421b;
import java.util.List;

/* compiled from: PagerSelectedActionsDispatcher.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final C0675l f4311a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2082c f4312b;

    /* renamed from: c, reason: collision with root package name */
    public final C0745n f4313c;

    /* renamed from: d, reason: collision with root package name */
    public a f4314d;

    /* compiled from: PagerSelectedActionsDispatcher.kt */
    public final class a extends f.e {

        /* renamed from: d, reason: collision with root package name */
        public int f4315d = -1;

        /* renamed from: e, reason: collision with root package name */
        public final C2087h<Integer> f4316e = new C2087h<>();

        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            while (true) {
                C2087h<Integer> c2087h = this.f4316e;
                if (c2087h.isEmpty()) {
                    return;
                }
                int iIntValue = c2087h.n().intValue();
                int i = C4421b.f38269a;
                C4421b.a(C7.a.DEBUG);
                x xVar = x.this;
                i7.b bVar = (i7.b) xVar.f4312b.get(iIntValue);
                List<C1175g0> listN = bVar.f38460a.d().n();
                if (listN != null) {
                    xVar.f4311a.s(new y(xVar, bVar, listN));
                }
            }
        }

        @Override // Q1.f.e
        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                a();
            }
        }

        @Override // Q1.f.e
        public final void onPageSelected(int i) {
            int i10 = C4421b.f38269a;
            C4421b.a(C7.a.DEBUG);
            if (this.f4315d == i) {
                return;
            }
            if (i != -1) {
                this.f4316e.e(Integer.valueOf(i));
            }
            if (this.f4315d == -1) {
                a();
            }
            this.f4315d = i;
        }
    }

    public x(C0675l divView, AbstractC2082c items, C0745n divActionBinder) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(items, "items");
        kotlin.jvm.internal.l.f(divActionBinder, "divActionBinder");
        this.f4311a = divView;
        this.f4312b = items;
        this.f4313c = divActionBinder;
    }
}
