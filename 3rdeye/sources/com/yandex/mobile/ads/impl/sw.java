package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import Q9.C1547o0;
import Q9.C1549p0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

@M9.h
/* loaded from: classes3.dex */
public final class sw {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f33295a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33296b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33297c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33298d;

    public static final class a implements Q9.H<sw> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33299a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f33300b;

        static {
            a aVar = new a();
            f33299a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelAppData", aVar, 4);
            c1547o0.k(CommonUrlParts.APP_ID, false);
            c1547o0.k("app_version", false);
            c1547o0.k("system", false);
            c1547o0.k("api_level", false);
            f33300b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{c02, c02, c02, c02};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f33300b;
            P9.b bVarD = decoder.d(c1547o0);
            int i = 0;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
            String strN4 = null;
            boolean z10 = true;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strN = bVarD.n(c1547o0, 0);
                    i |= 1;
                } else if (iX == 1) {
                    strN2 = bVarD.n(c1547o0, 1);
                    i |= 2;
                } else if (iX == 2) {
                    strN3 = bVarD.n(c1547o0, 2);
                    i |= 4;
                } else {
                    if (iX != 3) {
                        throw new M9.n(iX);
                    }
                    strN4 = bVarD.n(c1547o0, 3);
                    i |= 8;
                }
            }
            bVarD.b(c1547o0);
            return new sw(i, strN, strN2, strN3, strN4);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f33300b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            sw value = (sw) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f33300b;
            P9.c cVarD = encoder.d(c1547o0);
            sw.a(value, cVarD, c1547o0);
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

        public final M9.b<sw> serializer() {
            return a.f33299a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ sw(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            Q9.G0.a(i, 15, a.f33299a.getDescriptor());
            throw null;
        }
        this.f33295a = str;
        this.f33296b = str2;
        this.f33297c = str3;
        this.f33298d = str4;
    }

    public final String a() {
        return this.f33298d;
    }

    public final String b() {
        return this.f33295a;
    }

    public final String c() {
        return this.f33296b;
    }

    public final String d() {
        return this.f33297c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw)) {
            return false;
        }
        sw swVar = (sw) obj;
        return kotlin.jvm.internal.l.b(this.f33295a, swVar.f33295a) && kotlin.jvm.internal.l.b(this.f33296b, swVar.f33296b) && kotlin.jvm.internal.l.b(this.f33297c, swVar.f33297c) && kotlin.jvm.internal.l.b(this.f33298d, swVar.f33298d);
    }

    public final int hashCode() {
        return this.f33298d.hashCode() + C4121h3.a(this.f33297c, C4121h3.a(this.f33296b, this.f33295a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f33295a;
        String str2 = this.f33296b;
        return C1154e9.j(j6.l.d("DebugPanelAppData(appId=", str, ", appVersion=", str2, ", system="), this.f33297c, ", androidApiLevel=", this.f33298d, ")");
    }

    public sw(String appId, String appVersion, String system, String androidApiLevel) {
        kotlin.jvm.internal.l.f(appId, "appId");
        kotlin.jvm.internal.l.f(appVersion, "appVersion");
        kotlin.jvm.internal.l.f(system, "system");
        kotlin.jvm.internal.l.f(androidApiLevel, "androidApiLevel");
        this.f33295a = appId;
        this.f33296b = appVersion;
        this.f33297c = system;
        this.f33298d = androidApiLevel;
    }

    public static final /* synthetic */ void a(sw swVar, P9.c cVar, C1547o0 c1547o0) {
        cVar.k(c1547o0, 0, swVar.f33295a);
        cVar.k(c1547o0, 1, swVar.f33296b);
        cVar.k(c1547o0, 2, swVar.f33297c);
        cVar.k(c1547o0, 3, swVar.f33298d);
    }
}
