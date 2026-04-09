package b7;

import a7.EnumC1667d;
import java.util.List;
import y9.InterfaceC5823e;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class R0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final R0 f17501a = new R0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17502b = "encodeRegex";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17503c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17504d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17505e;

    /* compiled from: StringFunctions.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<InterfaceC5823e, CharSequence> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f17506g = new a(1);

        @Override // p9.l
        public final CharSequence invoke(InterfaceC5823e interfaceC5823e) {
            InterfaceC5823e it = interfaceC5823e;
            kotlin.jvm.internal.l.f(it, "it");
            return "\\".concat(it.getValue());
        }
    }

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17503c = E.u.G(new a7.j(enumC1667d, false));
        f17504d = enumC1667d;
        f17505e = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    @Override // a7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(X0.n r12, a7.AbstractC1664a r13, java.util.List<? extends java.lang.Object> r14) {
        /*
            r11 = this;
            r12 = 0
            java.lang.Object r13 = r14.get(r12)
            java.lang.String r14 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.l.d(r13, r14)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "[.*+?^${}()|\\[\\]\\\\]"
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r14)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.l.e(r14, r0)
            b7.R0$a r0 = b7.R0.a.f17506g
            java.lang.String r1 = "transform"
            kotlin.jvm.internal.l.f(r0, r1)
            java.util.regex.Matcher r14 = r14.matcher(r13)
            java.lang.String r1 = "matcher(...)"
            kotlin.jvm.internal.l.e(r14, r1)
            boolean r2 = r14.find(r12)
            r3 = 0
            if (r2 != 0) goto L30
            r2 = r3
            goto L35
        L30:
            y9.g r2 = new y9.g
            r2.<init>(r14, r13)
        L35:
            if (r2 != 0) goto L3c
            java.lang.String r12 = r13.toString()
            return r12
        L3c:
            int r14 = r13.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            r5 = r12
        L46:
            v9.g r6 = r2.a()
            int r6 = r6.f47096b
            r4.append(r13, r5, r6)
            java.lang.Object r5 = r0.invoke(r2)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.append(r5)
            v9.g r5 = r2.a()
            int r5 = r5.f47097c
            r6 = 1
            int r5 = r5 + r6
            java.util.regex.Matcher r7 = r2.f48378a
            int r8 = r7.end()
            int r9 = r7.end()
            int r10 = r7.start()
            if (r9 != r10) goto L71
            goto L72
        L71:
            r6 = r12
        L72:
            int r8 = r8 + r6
            java.lang.String r2 = r2.f48379b
            int r6 = r2.length()
            if (r8 > r6) goto L8c
            java.util.regex.Pattern r6 = r7.pattern()
            java.util.regex.Matcher r6 = r6.matcher(r2)
            kotlin.jvm.internal.l.e(r6, r1)
            boolean r7 = r6.find(r8)
            if (r7 != 0) goto L8e
        L8c:
            r2 = r3
            goto L94
        L8e:
            y9.g r7 = new y9.g
            r7.<init>(r6, r2)
            r2 = r7
        L94:
            if (r5 >= r14) goto L98
            if (r2 != 0) goto L46
        L98:
            if (r5 >= r14) goto L9d
            r4.append(r13, r5, r14)
        L9d:
            java.lang.String r12 = r4.toString()
            java.lang.String r13 = "toString(...)"
            kotlin.jvm.internal.l.e(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.R0.a(X0.n, a7.a, java.util.List):java.lang.Object");
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17503c;
    }

    @Override // a7.g
    public final String c() {
        return f17502b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17504d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17505e;
    }
}
