package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class Q extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2510w1 f20941a;

    /* renamed from: b, reason: collision with root package name */
    public Spliterator f20942b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20943c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f20944d;

    /* renamed from: e, reason: collision with root package name */
    public final P f20945e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f20946f;

    /* renamed from: g, reason: collision with root package name */
    public G0 f20947g;

    public Q(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, P p6) {
        super(null);
        this.f20941a = abstractC2510w1;
        this.f20942b = spliterator;
        this.f20943c = AbstractC2419e.e(spliterator.estimateSize());
        this.f20944d = new ConcurrentHashMap(Math.max(16, AbstractC2419e.f21055g << 1));
        this.f20945e = p6;
        this.f20946f = null;
    }

    public Q(Q q3, Spliterator spliterator, Q q6) {
        super(q3);
        this.f20941a = q3.f20941a;
        this.f20942b = spliterator;
        this.f20943c = q3.f20943c;
        this.f20944d = q3.f20944d;
        this.f20945e = q3.f20945e;
        this.f20946f = q6;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f20942b;
        long j6 = this.f20943c;
        boolean z6 = false;
        Q q3 = this;
        while (spliterator.estimateSize() > j6 && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            Q q6 = new Q(q3, spliteratorTrySplit, q3.f20946f);
            Q q7 = new Q(q3, spliterator, q6);
            q3.addToPendingCount(1);
            q7.addToPendingCount(1);
            q3.f20944d.put(q6, q7);
            if (q3.f20946f != null) {
                q6.addToPendingCount(1);
                if (q3.f20944d.replace(q3.f20946f, q3, q6)) {
                    q3.addToPendingCount(-1);
                } else {
                    q6.addToPendingCount(-1);
                }
            }
            if (z6) {
                spliterator = spliteratorTrySplit;
                q3 = q6;
                q6 = q7;
            } else {
                q3 = q7;
            }
            z6 = !z6;
            q6.fork();
        }
        if (q3.getPendingCount() > 0) {
            C2399a c2399a = new C2399a(28);
            AbstractC2510w1 abstractC2510w1 = q3.f20941a;
            InterfaceC2519y0 interfaceC2519y0T0 = abstractC2510w1.t0(abstractC2510w1.i0(spliterator), c2399a);
            q3.f20941a.w0(spliterator, interfaceC2519y0T0);
            q3.f20947g = interfaceC2519y0T0.build();
            q3.f20942b = null;
        }
        q3.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        G0 g02 = this.f20947g;
        if (g02 != null) {
            g02.forEach(this.f20945e);
            this.f20947g = null;
        } else {
            Spliterator spliterator = this.f20942b;
            if (spliterator != null) {
                this.f20941a.w0(spliterator, this.f20945e);
                this.f20942b = null;
            }
        }
        Q q3 = (Q) this.f20944d.remove(this);
        if (q3 != null) {
            q3.tryComplete();
        }
    }
}
