package androidx.compose.foundation.gestures;

import dh.InterfaceC5380e;
import l0.C6531g;
import org.snmp4j.mp.PduHandle;
import w.C8234A;
import x0.InterfaceC8412a;

/* loaded from: classes.dex */
final class e implements InterfaceC8412a {

    /* renamed from: a, reason: collision with root package name */
    private final C8234A f27967a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27968b;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        long f27969a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27970b;

        /* renamed from: d, reason: collision with root package name */
        int f27972d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27970b = obj;
            this.f27972d |= PduHandle.NONE;
            return e.this.g1(0L, 0L, this);
        }
    }

    public e(C8234A c8234a, boolean z10) {
        this.f27967a = c8234a;
        this.f27968b = z10;
    }

    @Override // x0.InterfaceC8412a
    public long L1(long j10, long j11, int i10) {
        return this.f27968b ? this.f27967a.r(j11) : C6531g.f52335b.c();
    }

    public final void a(boolean z10) {
        this.f27968b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // x0.InterfaceC8412a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g1(long r3, long r5, dh.InterfaceC5380e r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.e.a
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.e$a r3 = (androidx.compose.foundation.gestures.e.a) r3
            int r4 = r3.f27972d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f27972d = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.e$a r3 = new androidx.compose.foundation.gestures.e$a
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.f27970b
            java.lang.Object r7 = eh.AbstractC5467b.g()
            int r0 = r3.f27972d
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.f27969a
            Yg.v.b(r4)
            goto L47
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            Yg.v.b(r4)
            boolean r4 = r2.f27968b
            if (r4 == 0) goto L52
            w.A r4 = r2.f27967a
            r3.f27969a = r5
            r3.f27972d = r1
            java.lang.Object r4 = r4.n(r5, r3)
            if (r4 != r7) goto L47
            return r7
        L47:
            Y0.y r4 = (Y0.y) r4
            long r3 = r4.o()
            long r3 = Y0.y.k(r5, r3)
            goto L58
        L52:
            Y0.y$a r3 = Y0.y.f24558b
            long r3 = r3.a()
        L58:
            Y0.y r3 = Y0.y.b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.g1(long, long, dh.e):java.lang.Object");
    }
}
