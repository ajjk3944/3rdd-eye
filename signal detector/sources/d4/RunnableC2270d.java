package d4;

import A2.C;
import a4.q;
import android.os.SystemClock;
import b4.C0340e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2270d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19793a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2267a f19794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f19795c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19798f;

    public /* synthetic */ RunnableC2270d(C2267a c2267a, long j6, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f19794b = c2267a;
        this.f19795c = j6;
        this.f19796d = arrayList;
        this.f19797e = arrayList2;
        this.f19798f = arrayList3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19793a) {
            case 0:
                C2267a c2267a = this.f19794b;
                q qVar = c2267a.i;
                if (c2267a.f19786n.get()) {
                    c2267a.g(6, -6, null, null, null, null, null);
                    return;
                }
                qVar.getClass();
                AtomicReference atomicReference = q.f4716b;
                C0340e c0340e = (C0340e) atomicReference.get();
                ArrayList arrayList = this.f19797e;
                ArrayList arrayList2 = this.f19798f;
                long j6 = this.f19795c;
                if (c0340e == null) {
                    c2267a.f19784l.addAll(arrayList);
                    c2267a.f19785m.addAll(arrayList2);
                    Long lValueOf = Long.valueOf(j6);
                    c2267a.g(5, 0, lValueOf, lValueOf, null, null, null);
                    return;
                }
                qVar.getClass();
                C0340e c0340e2 = (C0340e) atomicReference.get();
                ArrayList arrayList3 = this.f19796d;
                C2272f c2272f = new C2272f(c2267a, arrayList, arrayList2, j6, false, arrayList3);
                c0340e2.getClass();
                if (Z3.a.f4523e.get() == null) {
                    throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
                }
                c0340e2.f5752d.execute(new C(c0340e2, arrayList3, c2272f, 12, false));
                return;
            default:
                int i = 0;
                long jMin = 0;
                while (true) {
                    C2267a c2267a2 = this.f19794b;
                    long j7 = this.f19795c;
                    if (i >= 3) {
                        c2267a2.f19781h.execute(new RunnableC2270d(c2267a2, this.f19796d, this.f19797e, this.f19798f, j7));
                        return;
                    }
                    jMin = Math.min(j7, (j7 / 3) + jMin);
                    c2267a2.g(2, 0, Long.valueOf(jMin), Long.valueOf(j7), null, null, null);
                    SystemClock.sleep(C2267a.f19772o);
                    int i3 = ((a4.d) c2267a2.f19783k.get()).f4680b;
                    if (i3 == 9 || i3 == 7 || i3 == 6) {
                        return;
                    } else {
                        i++;
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC2270d(C2267a c2267a, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, long j6) {
        this.f19794b = c2267a;
        this.f19796d = arrayList;
        this.f19797e = arrayList2;
        this.f19798f = arrayList3;
        this.f19795c = j6;
    }
}
