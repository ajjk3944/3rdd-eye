package Ki;

import Ni.z;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class m extends z {

    /* renamed from: e, reason: collision with root package name */
    private final e f10877e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f10878f;

    public m(long j10, m mVar, e eVar, int i10) {
        super(j10, mVar, i10);
        this.f10877e = eVar;
        this.f10878f = new AtomicReferenceArray(f.f10850b * 2);
    }

    private final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f10878f;
    }

    public final Object A(int i10) {
        return z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().m1((this.f16629c * f.f10850b) + i10);
        }
        t();
    }

    public final Object D(int i10) {
        Object objA = A(i10);
        w(i10);
        return objA;
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, Object obj) {
        E(i10, obj);
    }

    @Override // Ni.z
    public int r() {
        return f.f10850b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = y().f10834b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        Ni.v.a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // Ni.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r4, java.lang.Throwable r5, dh.InterfaceC5384i r6) {
        /*
            r3 = this;
            int r5 = Ki.f.f10850b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.A(r4)
        Le:
            java.lang.Object r1 = r3.B(r4)
            boolean r2 = r1 instanceof Ii.a1
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof Ki.x
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            Ni.C r2 = Ki.f.j()
            if (r1 == r2) goto L63
            Ni.C r2 = Ki.f.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            Ni.C r2 = Ki.f.p()
            if (r1 == r2) goto Le
            Ni.C r2 = Ki.f.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            Ni.C r4 = Ki.f.f()
            if (r1 == r4) goto L62
            Ni.C r4 = Ki.f.f10852d
            if (r1 != r4) goto L40
            goto L62
        L40:
            Ni.C r4 = Ki.f.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.w(r4)
            if (r0 == 0) goto L73
            Ki.e r4 = r3.y()
            mh.l r4 = r4.f10834b
            if (r4 == 0) goto L73
            Ni.v.a(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            Ni.C r2 = Ki.f.j()
            goto L7f
        L7b:
            Ni.C r2 = Ki.f.i()
        L7f:
            boolean r1 = r3.v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.w(r4)
            r1 = r0 ^ 1
            r3.C(r4, r1)
            if (r0 == 0) goto L9a
            Ki.e r4 = r3.y()
            mh.l r4 = r4.f10834b
            if (r4 == 0) goto L9a
            Ni.v.a(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ki.m.s(int, java.lang.Throwable, dh.i):void");
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return l.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final e y() {
        e eVar = this.f10877e;
        AbstractC6492s.f(eVar);
        return eVar;
    }
}
