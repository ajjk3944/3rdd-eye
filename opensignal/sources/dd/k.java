package dd;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class k implements e, d, b {
    public Exception B;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7298a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final int f7299d;

    /* renamed from: g, reason: collision with root package name */
    public final r f7300g;

    /* renamed from: r, reason: collision with root package name */
    public int f7301r;

    /* renamed from: x, reason: collision with root package name */
    public int f7302x;

    /* renamed from: y, reason: collision with root package name */
    public int f7303y;

    public k(int i10, r rVar) {
        this.f7299d = i10;
        this.f7300g = rVar;
    }

    public final void a() {
        int i10 = this.f7301r + this.f7302x + this.f7303y;
        int i11 = this.f7299d;
        if (i10 == i11) {
            Exception exc = this.B;
            r rVar = this.f7300g;
            if (exc == null) {
                if (this.D) {
                    rVar.o();
                    return;
                } else {
                    rVar.l(null);
                    return;
                }
            }
            int i12 = this.f7302x;
            int length = String.valueOf(i12).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + length + 8 + 24);
            sb2.append(i12);
            sb2.append(" out of ");
            sb2.append(i11);
            sb2.append(" underlying tasks failed");
            rVar.n(new ExecutionException(sb2.toString(), this.B));
        }
    }

    @Override // dd.e
    public final void h(Object obj) {
        synchronized (this.f7298a) {
            this.f7301r++;
            a();
        }
    }

    @Override // dd.b
    public final void q() {
        synchronized (this.f7298a) {
            this.f7303y++;
            this.D = true;
            a();
        }
    }

    @Override // dd.d
    public final void y(Exception exc) {
        synchronized (this.f7298a) {
            this.f7302x++;
            this.B = exc;
            a();
        }
    }
}
