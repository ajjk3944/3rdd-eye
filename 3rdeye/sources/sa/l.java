package sa;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: KotlinExtensions.kt */
/* loaded from: classes3.dex */
public final class l {

    /* compiled from: KotlinExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f46219b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Exception f46220c;

        public a(b bVar, Exception exc) {
            this.f46219b = bVar;
            this.f46220c = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.google.gson.internal.c.r(this.f46219b).resumeWith(b9.n.a(this.f46220c));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @h9.e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    public static final class b extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46221l;

        /* renamed from: m, reason: collision with root package name */
        public int f46222m;

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f46221l = obj;
            this.f46222m |= RecyclerView.UNDEFINED_DURATION;
            return l.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.lang.Exception r4, f9.InterfaceC4347e<?> r5) {
        /*
            boolean r0 = r5 instanceof sa.l.b
            if (r0 == 0) goto L13
            r0 = r5
            sa.l$b r0 = (sa.l.b) r0
            int r1 = r0.f46222m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46222m = r1
            goto L18
        L13:
            sa.l$b r0 = new sa.l$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f46221l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f46222m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            b9.n.b(r5)
            b9.A r4 = b9.C1992A.f18074a
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            b9.n.b(r5)
            r0.f46222m = r3
            I9.c r5 = A9.U.f211a
            f9.h r2 = r0.getContext()
            sa.l$a r3 = new sa.l$a
            r3.<init>(r0, r4)
            r5.N0(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.l.a(java.lang.Exception, f9.e):java.lang.Object");
    }
}
