package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import com.github.appintro.AppIntroBaseFragmentKt;

@M9.h
/* loaded from: classes3.dex */
public final class pw {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f31925a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31926b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31927c;

    public static final class a implements Q9.H<pw> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31928a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f31929b;

        static {
            a aVar = new a();
            f31928a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAlert", aVar, 3);
            c1547o0.k(AppIntroBaseFragmentKt.ARG_TITLE, true);
            c1547o0.k("message", true);
            c1547o0.k("type", true);
            f31929b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{N9.a.b(c02), N9.a.b(c02), N9.a.b(c02)};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f31929b;
            P9.b bVarD = decoder.d(c1547o0);
            String str = null;
            boolean z10 = true;
            int i = 0;
            String str2 = null;
            String str3 = null;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    str = (String) bVarD.G(c1547o0, 0, Q9.C0.f11399a, str);
                    i |= 1;
                } else if (iX == 1) {
                    str2 = (String) bVarD.G(c1547o0, 1, Q9.C0.f11399a, str2);
                    i |= 2;
                } else {
                    if (iX != 2) {
                        throw new M9.n(iX);
                    }
                    str3 = (String) bVarD.G(c1547o0, 2, Q9.C0.f11399a, str3);
                    i |= 4;
                }
            }
            bVarD.b(c1547o0);
            return new pw(i, str, str2, str3);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f31929b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            pw value = (pw) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f31929b;
            P9.c cVarD = encoder.d(c1547o0);
            pw.a(value, cVarD, c1547o0);
            cVarD.b(c1547o0);
        }

        @Override // Q9.H
        public final M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    public static final class b {
        private b() {
        }

        public final M9.b<pw> serializer() {
            return a.f31928a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public pw() {
        this(0);
    }

    public final String a() {
        return this.f31926b;
    }

    public final String b() {
        return this.f31925a;
    }

    public final String c() {
        return this.f31927c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw)) {
            return false;
        }
        pw pwVar = (pw) obj;
        return kotlin.jvm.internal.l.b(this.f31925a, pwVar.f31925a) && kotlin.jvm.internal.l.b(this.f31926b, pwVar.f31926b) && kotlin.jvm.internal.l.b(this.f31927c, pwVar.f31927c);
    }

    public final int hashCode() {
        String str = this.f31925a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31926b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31927c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f31925a;
        String str2 = this.f31926b;
        return B4.f.c(j6.l.d("DebugPanelAlert(title=", str, ", message=", str2, ", type="), this.f31927c, ")");
    }

    public /* synthetic */ pw(int i) {
        this(null, null, null);
    }

    public static final /* synthetic */ void a(pw pwVar, P9.c cVar, C1547o0 c1547o0) {
        if (cVar.F(c1547o0, 0) || pwVar.f31925a != null) {
            cVar.w(c1547o0, 0, Q9.C0.f11399a, pwVar.f31925a);
        }
        if (cVar.F(c1547o0, 1) || pwVar.f31926b != null) {
            cVar.w(c1547o0, 1, Q9.C0.f11399a, pwVar.f31926b);
        }
        if (!cVar.F(c1547o0, 2) && pwVar.f31927c == null) {
            return;
        }
        cVar.w(c1547o0, 2, Q9.C0.f11399a, pwVar.f31927c);
    }

    public /* synthetic */ pw(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f31925a = null;
        } else {
            this.f31925a = str;
        }
        if ((i & 2) == 0) {
            this.f31926b = null;
        } else {
            this.f31926b = str2;
        }
        if ((i & 4) == 0) {
            this.f31927c = null;
        } else {
            this.f31927c = str3;
        }
    }

    public pw(String str, String str2, String str3) {
        this.f31925a = str;
        this.f31926b = str2;
        this.f31927c = str3;
    }
}
