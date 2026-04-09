package t5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public j[] f34215b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f34216c;

    /* renamed from: d, reason: collision with root package name */
    public w f34217d;

    /* renamed from: e, reason: collision with root package name */
    public int f34218e;

    /* renamed from: f, reason: collision with root package name */
    public int f34219f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f34220h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j[] f34221i;
    public final /* synthetic */ f0 j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f34222k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(j[] jVarArr, f0 f0Var, w wVar, ck.c cVar) {
        super(2, cVar);
        this.f34221i = jVarArr;
        this.j = f0Var;
        this.f34222k = wVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        return new e0(this.f34221i, this.j, this.f34222k, cVar);
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((v5.l) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (t5.f0.c(r6, r5, r11, r10) == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0075 -> B:27:0x0076). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f34220h
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 == r2) goto La
            if (r0 != r1) goto L1a
        La:
            int r0 = r10.g
            int r3 = r10.f34219f
            int r4 = r10.f34218e
            t5.w r5 = r10.f34217d
            t5.f0 r6 = r10.f34216c
            t5.j[] r7 = r10.f34215b
            ci.b.D(r11)
            goto L58
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            ci.b.D(r11)
            t5.j[] r11 = r10.f34221i
            int r0 = r11.length
            r3 = 0
            t5.f0 r4 = r10.j
            t5.w r5 = r10.f34222k
            r7 = r11
            r11 = r3
            r6 = r4
        L30:
            if (r3 >= r0) goto L78
            r4 = r7[r3]
            int r8 = r11 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L75
            dk.a r9 = dk.a.f22275a
            if (r4 == r2) goto L60
            if (r4 != r1) goto L5a
            r10.f34215b = r7
            r10.f34216c = r6
            r10.f34217d = r5
            r10.f34218e = r8
            r10.f34219f = r3
            r10.g = r0
            r10.f34220h = r1
            java.lang.Object r11 = t5.f0.d(r6, r5, r11, r10)
            if (r11 != r9) goto L57
            goto L74
        L57:
            r4 = r8
        L58:
            r11 = r4
            goto L76
        L5a:
            ac.m r11 = new ac.m
            r11.<init>()
            throw r11
        L60:
            r10.f34215b = r7
            r10.f34216c = r6
            r10.f34217d = r5
            r10.f34218e = r8
            r10.f34219f = r3
            r10.g = r0
            r10.f34220h = r2
            java.lang.Object r11 = t5.f0.c(r6, r5, r11, r10)
            if (r11 != r9) goto L57
        L74:
            return r9
        L75:
            r11 = r8
        L76:
            int r3 = r3 + r2
            goto L30
        L78:
            yj.u r11 = yj.u.f37649a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
