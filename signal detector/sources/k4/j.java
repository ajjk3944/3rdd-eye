package K4;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.BinderC1168fk;
import com.google.android.gms.internal.ads.C0424Ak;
import com.google.android.gms.internal.ads.C0458Ck;
import com.google.android.gms.internal.ads.C0697Ql;
import com.google.android.gms.internal.ads.C0712Rj;
import com.google.android.gms.internal.ads.C0764Uk;
import com.google.android.gms.internal.ads.C1280ho;
import com.google.android.gms.internal.ads.C1391jt;
import com.google.android.gms.internal.ads.C1814rl;
import com.google.android.gms.internal.ads.C1888t4;
import com.google.android.gms.internal.ads.C2137xk;
import com.google.android.gms.internal.ads.C2158y4;
import com.google.android.gms.internal.ads.C4;
import com.google.android.gms.internal.ads.L6;
import com.google.android.gms.internal.ads.N4;
import com.google.android.gms.internal.ads.Qt;
import com.google.android.gms.internal.ads.Xt;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class j implements O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2315a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2316b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2317c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2318d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2319e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2320f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2321g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2322h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2323j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2324k;

    public j(Xt xt, Qt qt, C2137xk c2137xk, C0424Ak c0424Ak, C1391jt c1391jt, BinderC1168fk binderC1168fk, C0764Uk c0764Uk, C0458Ck c0458Ck, C1814rl c1814rl, C0712Rj c0712Rj, C1280ho c1280ho) {
        this.f2315a = xt;
        this.f2316b = qt;
        this.f2317c = c2137xk;
        this.f2318d = c0424Ak;
        this.f2319e = c1391jt;
        this.f2320f = binderC1168fk;
        this.f2321g = c0764Uk;
        this.f2322h = c0458Ck;
        this.i = c1814rl;
        this.f2323j = c0712Rj;
        this.f2324k = c1280ho;
    }

    public void a() {
        C1888t4 c1888t4 = (C1888t4) this.f2322h;
        if (c1888t4 != null) {
            c1888t4.f16852d = true;
            c1888t4.interrupt();
        }
        C2158y4[] c2158y4Arr = (C2158y4[]) this.f2321g;
        for (int i = 0; i < 4; i++) {
            C2158y4 c2158y4 = c2158y4Arr[i];
            if (c2158y4 != null) {
                c2158y4.f17676d = true;
                c2158y4.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) this.f2317c;
        PriorityBlockingQueue priorityBlockingQueue2 = (PriorityBlockingQueue) this.f2318d;
        N4 n42 = (N4) this.f2319e;
        L6 l6 = (L6) this.f2324k;
        C1888t4 c1888t42 = new C1888t4(priorityBlockingQueue, priorityBlockingQueue2, n42, l6);
        this.f2322h = c1888t42;
        c1888t42.start();
        for (int i3 = 0; i3 < 4; i3++) {
            C2158y4 c2158y42 = new C2158y4(priorityBlockingQueue2, (C0697Ql) this.f2320f, n42, l6);
            c2158y4Arr[i3] = c2158y42;
            c2158y42.start();
        }
    }

    public void b(C4 c42) {
        c42.f7523h = this;
        HashSet hashSet = (HashSet) this.f2316b;
        synchronized (hashSet) {
            hashSet.add(c42);
        }
        c42.f7522g = Integer.valueOf(((AtomicInteger) this.f2315a).incrementAndGet());
        c42.a("add-to-queue");
        c();
        ((PriorityBlockingQueue) this.f2317c).add(c42);
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f2323j;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O0.a
    public View getRoot() {
        return (CoordinatorLayout) this.f2315a;
    }

    public j(N4 n42, C0697Ql c0697Ql) {
        L6 l6 = new L6(new Handler(Looper.getMainLooper()));
        this.f2315a = new AtomicInteger();
        this.f2316b = new HashSet();
        this.f2317c = new PriorityBlockingQueue();
        this.f2318d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.f2323j = new ArrayList();
        this.f2319e = n42;
        this.f2320f = c0697Ql;
        this.f2321g = new C2158y4[4];
        this.f2324k = l6;
    }

    public j(CoordinatorLayout coordinatorLayout, CollapsingToolbarLayout collapsingToolbarLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, CircularProgressIndicator circularProgressIndicator2, Toolbar toolbar, AppCompatTextView appCompatTextView3, MaterialButton materialButton, AppCompatTextView appCompatTextView4) {
        this.f2315a = coordinatorLayout;
        this.f2316b = collapsingToolbarLayout;
        this.f2317c = appCompatTextView;
        this.f2318d = appCompatTextView2;
        this.f2321g = circularProgressIndicator;
        this.i = recyclerView;
        this.f2322h = circularProgressIndicator2;
        this.f2323j = toolbar;
        this.f2319e = appCompatTextView3;
        this.f2324k = materialButton;
        this.f2320f = appCompatTextView4;
    }
}
