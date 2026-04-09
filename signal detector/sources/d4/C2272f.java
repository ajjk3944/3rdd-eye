package d4;

import A2.C;
import R.S;
import R.T;
import a4.m;
import a4.q;
import android.view.View;
import android.view.animation.Interpolator;
import b4.C0340e;
import java.util.ArrayList;

/* renamed from: d4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2272f implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19800a;

    /* renamed from: b, reason: collision with root package name */
    public long f19801b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19802c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19803d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19804e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f19805f;

    public C2272f(C2267a c2267a, ArrayList arrayList, ArrayList arrayList2, long j6, boolean z6, ArrayList arrayList3) {
        this.f19805f = c2267a;
        this.f19800a = arrayList;
        this.f19803d = arrayList2;
        this.f19801b = j6;
        this.f19802c = z6;
        this.f19804e = arrayList3;
    }

    @Override // a4.m
    /* renamed from: a */
    public void mo2a() {
        C2267a c2267a = (C2267a) this.f19805f;
        ArrayList arrayList = (ArrayList) this.f19803d;
        long j6 = this.f19801b;
        c2267a.f19784l.addAll(this.f19800a);
        c2267a.f19785m.addAll(arrayList);
        Long lValueOf = Long.valueOf(j6);
        c2267a.g(5, 0, lValueOf, lValueOf, null, null, null);
    }

    public void b() {
        if (this.f19802c) {
            ArrayList arrayList = this.f19800a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((S) obj).b();
            }
            this.f19802c = false;
        }
    }

    public void c() {
        View view;
        if (this.f19802c) {
            return;
        }
        ArrayList arrayList = this.f19800a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            S s5 = (S) obj;
            long j6 = this.f19801b;
            if (j6 >= 0) {
                s5.c(j6);
            }
            Interpolator interpolator = (Interpolator) this.f19803d;
            if (interpolator != null && (view = (View) s5.f3278a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((T) this.f19804e) != null) {
                s5.d((m.i) this.f19805f);
            }
            View view2 = (View) s5.f3278a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f19802c = true;
    }

    @Override // a4.m
    public void f() {
        if (this.f19802c) {
            return;
        }
        C2267a c2267a = (C2267a) this.f19805f;
        ArrayList arrayList = (ArrayList) this.f19804e;
        ArrayList arrayList2 = (ArrayList) this.f19803d;
        long j6 = this.f19801b;
        c2267a.i.getClass();
        C0340e c0340e = (C0340e) q.f4716b.get();
        C2272f c2272f = new C2272f(c2267a, this.f19800a, arrayList2, j6, true, arrayList);
        c0340e.getClass();
        if (Z3.a.f4523e.get() == null) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        c0340e.f5752d.execute(new C(c0340e, arrayList, c2272f, 12, false));
    }

    @Override // a4.m
    public void h(int i) {
        ((C2267a) this.f19805f).g(6, i, null, null, null, null, null);
    }

    public C2272f() {
        this.f19801b = -1L;
        this.f19805f = new m.i(this);
        this.f19800a = new ArrayList();
    }
}
