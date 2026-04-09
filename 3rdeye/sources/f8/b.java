package F8;

import A9.E;
import H0.f;
import android.webkit.WebView;
import b9.C1992A;
import b9.n;
import com.singular.sdk.internal.Constants;
import f9.InterfaceC4347e;
import h9.i;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: LogsFragment.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.settings.secret.fragments.LogsFragment$openLog$2", f = "LogsFragment.kt", l = {81, 83}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1713l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f1714m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G8.a f1715n;

    /* compiled from: LogsFragment.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.ui.settings.secret.fragments.LogsFragment$openLog$2$1", f = "LogsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f1716l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f1717m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, String str, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f1716l = eVar;
            this.f1717m = str;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f1716l, this.f1717m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            n.b(obj);
            f fVar = this.f1716l.f1726b;
            if (fVar != null) {
                ((WebView) fVar.f1986f).loadData(this.f1717m, "text/html", Constants.ENCODING);
                return C1992A.f18074a;
            }
            l.l("binding");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, G8.a aVar, InterfaceC4347e<? super b> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1714m = eVar;
        this.f1715n = aVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new b(this.f1714m, this.f1715n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (A9.C0575f.h(r1, r4, r6) == r0) goto L28;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.io.IOException {
        /*
            r6 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r6.f1713l
            F8.e r2 = r6.f1714m
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            b9.n.b(r7)
            goto L78
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            b9.n.b(r7)
            goto L63
        L1e:
            b9.n.b(r7)
            G8.a r7 = r6.f1715n
            java.lang.String r7 = r7.f1939b
            r6.f1713l = r4
            android.content.Context r1 = r2.getContext()
            if (r1 != 0) goto L30
            java.lang.String r7 = ""
            goto L60
        L30:
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L4e
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Exception -> L4e
            r5.<init>(r1)     // Catch: java.lang.Exception -> L4e
            r4.<init>(r5)     // Catch: java.lang.Exception -> L4e
        L44:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L50
            r7.append(r1)     // Catch: java.lang.Exception -> L4e
            goto L44
        L4e:
            r1 = move-exception
            goto L54
        L50:
            r4.close()     // Catch: java.lang.Exception -> L4e
            goto L57
        L54:
            r1.printStackTrace()
        L57:
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.l.e(r7, r1)
        L60:
            if (r7 != r0) goto L63
            goto L77
        L63:
            java.lang.String r7 = (java.lang.String) r7
            I9.c r1 = A9.U.f211a
            B9.g r1 = F9.q.f1782a
            F8.b$a r4 = new F8.b$a
            r5 = 0
            r4.<init>(r2, r7, r5)
            r6.f1713l = r3
            java.lang.Object r7 = A9.C0575f.h(r1, r4, r6)
            if (r7 != r0) goto L78
        L77:
            return r0
        L78:
            b9.A r7 = b9.C1992A.f18074a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F8.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
