package androidx.compose.foundation.relocation;

import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
final class a implements D.b {

    /* renamed from: a, reason: collision with root package name */
    private final V.b f28395a = new V.b(new e[16], 0);

    /* renamed from: androidx.compose.foundation.relocation.a$a, reason: collision with other inner class name */
    static final class C1051a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28396a;

        /* renamed from: b, reason: collision with root package name */
        Object f28397b;

        /* renamed from: c, reason: collision with root package name */
        int f28398c;

        /* renamed from: d, reason: collision with root package name */
        int f28399d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f28400e;

        /* renamed from: g, reason: collision with root package name */
        int f28402g;

        C1051a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28400e = obj;
            this.f28402g |= PduHandle.NONE;
            return a.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
    @Override // D.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(l0.C6533i r8, dh.InterfaceC5380e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.a.C1051a
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.relocation.a$a r0 = (androidx.compose.foundation.relocation.a.C1051a) r0
            int r1 = r0.f28402g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28402g = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.a$a r0 = new androidx.compose.foundation.relocation.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f28400e
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f28402g
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f28399d
            int r2 = r0.f28398c
            java.lang.Object r4 = r0.f28397b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f28396a
            l0.i r5 = (l0.C6533i) r5
            Yg.v.b(r9)
            r9 = r5
            goto L67
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            Yg.v.b(r9)
            V.b r9 = r7.f28395a
            int r2 = r9.o()
            if (r2 <= 0) goto L6a
            java.lang.Object[] r9 = r9.m()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L52:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.e r5 = (androidx.compose.foundation.relocation.e) r5
            r0.f28396a = r9
            r0.f28397b = r4
            r0.f28398c = r2
            r0.f28399d = r8
            r0.f28402g = r3
            java.lang.Object r5 = D.e.a(r5, r9, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            int r8 = r8 + r3
            if (r8 < r2) goto L52
        L6a:
            Yg.J r8 = Yg.J.f24997a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.a.a(l0.i, dh.e):java.lang.Object");
    }

    public final V.b b() {
        return this.f28395a;
    }
}
