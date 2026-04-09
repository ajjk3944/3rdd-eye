package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2505v1 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f21176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21178c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21179d;

    public C2505v1(G0 g02, Object obj, int i) {
        this.f21178c = i;
        this.f21176a = g02;
        this.f21177b = 0;
        this.f21179d = obj;
    }

    public C2505v1(C2505v1 c2505v1, G0 g02, int i, byte b5) {
        super(c2505v1);
        this.f21176a = g02;
        this.f21177b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C2505v1 c2505v1A = this;
        while (c2505v1A.f21176a.p() != 0) {
            c2505v1A.setPendingCount(c2505v1A.f21176a.p() - 1);
            int i = 0;
            int iCount = 0;
            while (i < c2505v1A.f21176a.p() - 1) {
                C2505v1 c2505v1A2 = c2505v1A.a(i, c2505v1A.f21177b + iCount);
                iCount = (int) (c2505v1A2.f21176a.count() + iCount);
                c2505v1A2.fork();
                i++;
            }
            c2505v1A = c2505v1A.a(i, c2505v1A.f21177b + iCount);
        }
        switch (c2505v1A.f21178c) {
            case 0:
                ((F0) c2505v1A.f21176a).f(c2505v1A.f21179d, c2505v1A.f21177b);
                break;
            default:
                c2505v1A.f21176a.k((Object[]) c2505v1A.f21179d, c2505v1A.f21177b);
                break;
        }
        c2505v1A.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2505v1(C2505v1 c2505v1, G0 g02, int i) {
        this(c2505v1, g02, i, (byte) 0);
        this.f21178c = 1;
        this.f21179d = (Object[]) c2505v1.f21179d;
    }

    public final C2505v1 a(int i, int i3) {
        switch (this.f21178c) {
            case 0:
                return new C2505v1(this, ((F0) this.f21176a).a(i), i3);
            default:
                return new C2505v1(this, this.f21176a.a(i), i3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2505v1(C2505v1 c2505v1, F0 f02, int i) {
        this(c2505v1, f02, i, (byte) 0);
        this.f21178c = 0;
        this.f21179d = c2505v1.f21179d;
    }
}
