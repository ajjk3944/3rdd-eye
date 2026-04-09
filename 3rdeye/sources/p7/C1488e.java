package P7;

import D9.InterfaceC0645g;
import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* compiled from: Emitters.kt */
/* renamed from: P7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1488e<T> implements InterfaceC0645g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0645g f10738b;

    /* compiled from: Emitters.kt */
    @h9.e(c = "com.zipoapps.ads.AdManager$handleConfigurationReady$1$invokeSuspend$$inlined$filter$1$2", f = "AdManager.kt", l = {219}, m = "emit")
    /* renamed from: P7.e$a */
    public static final class a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f10739l;

        /* renamed from: m, reason: collision with root package name */
        public int f10740m;

        public a(InterfaceC4347e interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f10739l = obj;
            this.f10740m |= RecyclerView.UNDEFINED_DURATION;
            return C1488e.this.emit(null, this);
        }
    }

    public C1488e(InterfaceC0645g interfaceC0645g) {
        this.f10738b = interfaceC0645g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // D9.InterfaceC0645g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, f9.InterfaceC4347e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof P7.C1488e.a
            if (r0 == 0) goto L13
            r0 = r6
            P7.e$a r0 = (P7.C1488e.a) r0
            int r1 = r0.f10740m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10740m = r1
            goto L18
        L13:
            P7.e$a r0 = new P7.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10739l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f10740m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            b9.n.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            b9.n.b(r6)
            r6 = r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.l.b(r6, r2)
            if (r6 == 0) goto L48
            r0.f10740m = r3
            D9.g r6 = r4.f10738b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            b9.A r5 = b9.C1992A.f18074a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.C1488e.emit(java.lang.Object, f9.e):java.lang.Object");
    }
}
