package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.z;

/* loaded from: classes4.dex */
public final class g extends z {

    /* renamed from: e, reason: collision with root package name */
    public final BufferedChannel f22295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f22296f;

    public g(long j10, g gVar, BufferedChannel bufferedChannel, int i10) {
        super(j10, gVar, i10);
        this.f22295e = bufferedChannel;
        this.f22296f = new AtomicReferenceArray(BufferedChannelKt.f22265b * 2);
    }

    public final Object A(int i10) {
        return y().get((i10 * 2) + 1);
    }

    public final void B(int i10, boolean z10) {
        if (z10) {
            x().b1((this.f22569c * BufferedChannelKt.f22265b) + i10);
        }
        s();
    }

    public final Object C(int i10) {
        Object objZ = z(i10);
        v(i10);
        return objZ;
    }

    public final void D(int i10, Object obj) {
        y().set(i10 * 2, obj);
    }

    public final void E(int i10, Object obj) {
        y().set((i10 * 2) + 1, obj);
    }

    public final void F(int i10, Object obj) {
        D(i10, obj);
    }

    @Override // kotlinx.coroutines.internal.z
    public int q() {
        return BufferedChannelKt.f22265b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        v(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        r4 = x().f22255b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(int r4, java.lang.Throwable r5, kotlin.coroutines.d r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r3 = this;
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.f22265b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.z(r4)
        Le:
            java.lang.Object r1 = r3.A(r4)
            boolean r2 = r1 instanceof kotlinx.coroutines.u2
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.p
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.j()
            if (r1 == r2) goto L62
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.p()
            if (r1 == r2) goto Le
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            kotlinx.coroutines.internal.c0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.f()
            if (r1 == r4) goto L99
            kotlinx.coroutines.internal.c0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.f22267d
            if (r1 != r4) goto L40
            goto L99
        L40:
            kotlinx.coroutines.internal.c0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            if (r1 != r4) goto L47
            goto L99
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
            r3.v(r4)
            if (r0 == 0) goto L99
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.x()
            l9.l r4 = r4.f22255b
            if (r4 == 0) goto L99
            kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.j()
            goto L7e
        L7a:
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.i()
        L7e:
            boolean r1 = r3.u(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.v(r4)
            r1 = r0 ^ 1
            r3.B(r4, r1)
            if (r0 == 0) goto L99
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.x()
            l9.l r4 = r4.f22255b
            if (r4 == 0) goto L99
            kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.g.r(int, java.lang.Throwable, kotlin.coroutines.d):void");
    }

    public final boolean u(int i10, Object obj, Object obj2) {
        return f.a(y(), (i10 * 2) + 1, obj, obj2);
    }

    public final void v(int i10) {
        D(i10, null);
    }

    public final Object w(int i10, Object obj) {
        return y().getAndSet((i10 * 2) + 1, obj);
    }

    public final BufferedChannel x() {
        BufferedChannel bufferedChannel = this.f22295e;
        kotlin.jvm.internal.p.b(bufferedChannel);
        return bufferedChannel;
    }

    public final /* synthetic */ AtomicReferenceArray y() {
        return this.f22296f;
    }

    public final Object z(int i10) {
        return y().get(i10 * 2);
    }
}
