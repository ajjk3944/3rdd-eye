package y5;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.Map;
import p9.p;
import y5.C5806a;

/* compiled from: RemoteSettingsFetcher.kt */
@h9.e(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
/* renamed from: y5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5807b extends h9.i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f48147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C5808c f48148m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f48149n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C5806a.b f48150o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C5806a.c f48151p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5807b(C5808c c5808c, Map map, C5806a.b bVar, C5806a.c cVar, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f48148m = c5808c;
        this.f48149n = map;
        this.f48150o = bVar;
        this.f48151p = cVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        C5806a.b bVar = this.f48150o;
        C5806a.c cVar = this.f48151p;
        return new C5807b(this.f48148m, this.f48149n, bVar, cVar, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C5807b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if (r2.invoke(r9, r8) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (r2.invoke(r1, r8) != r0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.String] */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.io.IOException {
        /*
            r8 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r8.f48147l
            y5.a$c r2 = r8.f48151p
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L26
            if (r1 == r5) goto L1e
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            b9.n.b(r9)
            goto Ldf
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            b9.n.b(r9)     // Catch: java.lang.Exception -> L23
            goto Ldf
        L23:
            r9 = move-exception
            goto Lcc
        L26:
            b9.n.b(r9)
            y5.c r9 = r8.f48148m     // Catch: java.lang.Exception -> L23
            java.net.URL r9 = y5.C5808c.a(r9)     // Catch: java.lang.Exception -> L23
            java.net.URLConnection r9 = r9.openConnection()     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            kotlin.jvm.internal.l.d(r9, r1)     // Catch: java.lang.Exception -> L23
            javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "GET"
            r9.setRequestMethod(r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "Accept"
            java.lang.String r6 = "application/json"
            r9.setRequestProperty(r1, r6)     // Catch: java.lang.Exception -> L23
            java.lang.Object r1 = r8.f48149n     // Catch: java.lang.Exception -> L23
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L23
        L50:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Exception -> L23
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Exception -> L23
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> L23
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Exception -> L23
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L23
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L23
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L23
            r9.setRequestProperty(r7, r6)     // Catch: java.lang.Exception -> L23
            goto L50
        L6c:
            int r1 = r9.getResponseCode()     // Catch: java.lang.Exception -> L23
            r6 = 200(0xc8, float:2.8E-43)
            if (r1 != r6) goto Lb2
            java.io.InputStream r9 = r9.getInputStream()     // Catch: java.lang.Exception -> L23
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L23
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L23
            r4.<init>(r9)     // Catch: java.lang.Exception -> L23
            r1.<init>(r4)     // Catch: java.lang.Exception -> L23
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r4.<init>()     // Catch: java.lang.Exception -> L23
            kotlin.jvm.internal.w r6 = new kotlin.jvm.internal.w     // Catch: java.lang.Exception -> L23
            r6.<init>()     // Catch: java.lang.Exception -> L23
        L8c:
            java.lang.String r7 = r1.readLine()     // Catch: java.lang.Exception -> L23
            r6.f43660b = r7     // Catch: java.lang.Exception -> L23
            if (r7 == 0) goto L98
            r4.append(r7)     // Catch: java.lang.Exception -> L23
            goto L8c
        L98:
            r1.close()     // Catch: java.lang.Exception -> L23
            r9.close()     // Catch: java.lang.Exception -> L23
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L23
            r9.<init>(r1)     // Catch: java.lang.Exception -> L23
            y5.a$b r1 = r8.f48150o     // Catch: java.lang.Exception -> L23
            r8.f48147l = r5     // Catch: java.lang.Exception -> L23
            java.lang.Object r9 = r1.invoke(r9, r8)     // Catch: java.lang.Exception -> L23
            if (r9 != r0) goto Ldf
            goto Lde
        Lb2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r9.<init>()     // Catch: java.lang.Exception -> L23
            java.lang.String r5 = "Bad response code: "
            r9.append(r5)     // Catch: java.lang.Exception -> L23
            r9.append(r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L23
            r8.f48147l = r4     // Catch: java.lang.Exception -> L23
            java.lang.Object r9 = r2.invoke(r9, r8)     // Catch: java.lang.Exception -> L23
            if (r9 != r0) goto Ldf
            goto Lde
        Lcc:
            java.lang.String r1 = r9.getMessage()
            if (r1 != 0) goto Ld6
            java.lang.String r1 = r9.toString()
        Ld6:
            r8.f48147l = r3
            java.lang.Object r9 = r2.invoke(r1, r8)
            if (r9 != r0) goto Ldf
        Lde:
            return r0
        Ldf:
            b9.A r9 = b9.C1992A.f18074a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.C5807b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
