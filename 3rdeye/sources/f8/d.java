package F8;

import A9.E;
import H0.f;
import android.content.Context;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.i;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: LogsFragment.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.settings.secret.fragments.LogsFragment$setupViews$1$1", f = "LogsFragment.kt", l = {49, 59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1720l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f1721m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f1722n;

    /* compiled from: LogsFragment.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.ui.settings.secret.fragments.LogsFragment$setupViews$1$1$1", f = "LogsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f1723l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ E8.b f1724m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, E8.b bVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f1723l = eVar;
            this.f1724m = bVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f1723l, this.f1724m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            n.b(obj);
            e eVar = this.f1723l;
            f fVar = eVar.f1726b;
            if (fVar == null) {
                l.l("binding");
                throw null;
            }
            RecyclerView recyclerView = (RecyclerView) fVar.f1987g;
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAdapter(this.f1724m);
            f fVar2 = eVar.f1726b;
            if (fVar2 == null) {
                l.l("binding");
                throw null;
            }
            ((ImageView) fVar2.f1983c).setOnClickListener(new c(eVar, 0));
            return C1992A.f18074a;
        }
    }

    /* compiled from: LogsFragment.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f1725a;

        public b(e eVar) {
            this.f1725a = eVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, e eVar, InterfaceC4347e<? super d> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1721m = context;
        this.f1722n = eVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new d(this.f1721m, this.f1722n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((d) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (A9.C0575f.h(r7, r4, r6) == r0) goto L15;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r6.f1720l
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            b9.n.b(r7)
            goto L52
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            b9.n.b(r7)
            goto L32
        L1d:
            b9.n.b(r7)
            r6.f1720l = r4
            I9.b r7 = A9.U.f212b
            D8.a r1 = new D8.a
            android.content.Context r4 = r6.f1721m
            r1.<init>(r4, r2)
            java.lang.Object r7 = A9.C0575f.h(r7, r1, r6)
            if (r7 != r0) goto L32
            goto L51
        L32:
            java.util.List r7 = (java.util.List) r7
            E8.b r1 = new E8.b
            F8.d$b r4 = new F8.d$b
            F8.e r5 = r6.f1722n
            r4.<init>(r5)
            r1.<init>(r7, r4)
            I9.c r7 = A9.U.f211a
            B9.g r7 = F9.q.f1782a
            F8.d$a r4 = new F8.d$a
            r4.<init>(r5, r1, r2)
            r6.f1720l = r3
            java.lang.Object r7 = A9.C0575f.h(r7, r4, r6)
            if (r7 != r0) goto L52
        L51:
            return r0
        L52:
            b9.A r7 = b9.C1992A.f18074a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F8.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
