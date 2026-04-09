package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import Q9.C1526e;
import Q9.C1532h;
import Q9.C1547o0;
import Q9.C1549p0;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class tx {
    public static final b Companion = new b(0);

    /* renamed from: d, reason: collision with root package name */
    private static final M9.b<Object>[] f33795d = {null, null, new C1526e(Q9.C0.f11399a)};

    /* renamed from: a, reason: collision with root package name */
    private final String f33796a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33797b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f33798c;

    public static final class a implements Q9.H<tx> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33799a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f33800b;

        static {
            a aVar = new a();
            f33799a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelSdkData", aVar, 3);
            c1547o0.k("version", false);
            c1547o0.k("is_integrated", false);
            c1547o0.k("integration_messages", false);
            f33800b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{Q9.C0.f11399a, C1532h.f11487a, tx.f33795d[2]};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f33800b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = tx.f33795d;
            String strN = null;
            boolean z10 = true;
            int i = 0;
            boolean zI = false;
            List list = null;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strN = bVarD.n(c1547o0, 0);
                    i |= 1;
                } else if (iX == 1) {
                    zI = bVarD.I(c1547o0, 1);
                    i |= 2;
                } else {
                    if (iX != 2) {
                        throw new M9.n(iX);
                    }
                    list = (List) bVarD.h(c1547o0, 2, bVarArr[2], list);
                    i |= 4;
                }
            }
            bVarD.b(c1547o0);
            return new tx(i, strN, zI, list);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f33800b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            tx value = (tx) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f33800b;
            P9.c cVarD = encoder.d(c1547o0);
            tx.a(value, cVarD, c1547o0);
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

        public final M9.b<tx> serializer() {
            return a.f33799a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ tx(int i, String str, boolean z10, List list) {
        if (7 != (i & 7)) {
            Q9.G0.a(i, 7, a.f33799a.getDescriptor());
            throw null;
        }
        this.f33796a = str;
        this.f33797b = z10;
        this.f33798c = list;
    }

    public static final /* synthetic */ void a(tx txVar, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f33795d;
        cVar.k(c1547o0, 0, txVar.f33796a);
        cVar.B(c1547o0, 1, txVar.f33797b);
        cVar.y(c1547o0, 2, bVarArr[2], txVar.f33798c);
    }

    public final List<String> b() {
        return this.f33798c;
    }

    public final String c() {
        return this.f33796a;
    }

    public final boolean d() {
        return this.f33797b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx)) {
            return false;
        }
        tx txVar = (tx) obj;
        return kotlin.jvm.internal.l.b(this.f33796a, txVar.f33796a) && this.f33797b == txVar.f33797b && kotlin.jvm.internal.l.b(this.f33798c, txVar.f33798c);
    }

    public final int hashCode() {
        return this.f33798c.hashCode() + m6.a(this.f33797b, this.f33796a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f33796a;
        boolean z10 = this.f33797b;
        List<String> list = this.f33798c;
        StringBuilder sb = new StringBuilder("DebugPanelSdkData(version=");
        sb.append(str);
        sb.append(", isIntegratedSuccess=");
        sb.append(z10);
        sb.append(", integrationMessages=");
        return C1094a9.h(sb, list, ")");
    }

    public tx(boolean z10, List integrationMessages) {
        kotlin.jvm.internal.l.f(integrationMessages, "integrationMessages");
        this.f33796a = "7.14.0";
        this.f33797b = z10;
        this.f33798c = integrationMessages;
    }
}
