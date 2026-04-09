package y1;

import java.util.concurrent.atomic.AtomicBoolean;
import k8.F;
import w1.AbstractC5715a;
import z9.C5870a;
import z9.EnumC5872c;

/* compiled from: ConnectionPoolImpl.kt */
/* renamed from: y1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5796g implements InterfaceC5791b {

    /* renamed from: b, reason: collision with root package name */
    public final j f47943b;

    /* renamed from: c, reason: collision with root package name */
    public final j f47944c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<k> f47945d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f47946e;

    /* renamed from: f, reason: collision with root package name */
    public final long f47947f;

    public C5796g(AbstractC5715a.C0543a c0543a) {
        this.f47945d = new ThreadLocal<>();
        this.f47946e = new AtomicBoolean(false);
        int i = C5870a.f48496e;
        this.f47947f = F.w(30, EnumC5872c.SECONDS);
        j jVar = new j(1, new H8.e(c0543a, 9));
        this.f47943b = jVar;
        this.f47944c = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e3 A[Catch: all -> 0x01f9, TRY_LEAVE, TryCatch #4 {all -> 0x01f9, blocks: (B:107:0x01dd, B:109:0x01e3, B:112:0x01ee, B:114:0x01f2), top: B:151:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[Catch: all -> 0x019b, TryCatch #5 {all -> 0x019b, blocks: (B:88:0x0176, B:90:0x017c, B:95:0x0197, B:99:0x01a0, B:103:0x01aa, B:116:0x01fa, B:117:0x0201, B:118:0x0202, B:119:0x0203, B:120:0x0208), top: B:153:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017c A[Catch: all -> 0x019b, TryCatch #5 {all -> 0x019b, blocks: (B:88:0x0176, B:90:0x017c, B:95:0x0197, B:99:0x01a0, B:103:0x01aa, B:116:0x01fa, B:117:0x0201, B:118:0x0202, B:119:0x0203, B:120:0x0208), top: B:153:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019f  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [T, y1.k] */
    /* JADX WARN: Type inference failed for: r11v15 */
    @Override // y1.InterfaceC5791b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z(boolean r21, p9.p r22, h9.c r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.C5796g.Z(boolean, p9.p, h9.c):java.lang.Object");
    }

    public final void a(boolean z10) {
        String str = z10 ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.f47944c.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.f47943b.c(sb);
        A2.l.G(5, sb.toString());
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f47946e.compareAndSet(false, true)) {
            this.f47943b.b();
            this.f47944c.b();
        }
    }

    public C5796g(AbstractC5715a.C0543a c0543a, String fileName, int i) {
        int i10 = 1;
        kotlin.jvm.internal.l.f(fileName, "fileName");
        this.f47945d = new ThreadLocal<>();
        this.f47946e = new AtomicBoolean(false);
        int i11 = C5870a.f48496e;
        this.f47947f = F.w(30, EnumC5872c.SECONDS);
        if (i > 0) {
            this.f47943b = new j(i, new w8.d(i10, c0543a, fileName));
            this.f47944c = new j(1, new A8.m(2, c0543a, fileName));
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
