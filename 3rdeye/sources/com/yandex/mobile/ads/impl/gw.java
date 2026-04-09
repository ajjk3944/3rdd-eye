package com.yandex.mobile.ads.impl;

import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import com.yandex.mobile.ads.impl.dw;
import com.yandex.mobile.ads.impl.jw;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class gw {
    public static final b Companion = new b(0);

    /* renamed from: c, reason: collision with root package name */
    private static final M9.b<Object>[] f28007c = {new C1526e(jw.a.f29368a), new C1526e(dw.a.f26505a)};

    /* renamed from: a, reason: collision with root package name */
    private final List<jw> f28008a;

    /* renamed from: b, reason: collision with root package name */
    private final List<dw> f28009b;

    public static final class a implements Q9.H<gw> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28010a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f28011b;

        static {
            a aVar = new a();
            f28010a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitMediation", aVar, 2);
            c1547o0.k("waterfall", false);
            c1547o0.k("bidding", false);
            f28011b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            M9.b<?>[] bVarArr = gw.f28007c;
            return new M9.b[]{bVarArr[0], bVarArr[1]};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f28011b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = gw.f28007c;
            List list = null;
            boolean z10 = true;
            int i = 0;
            List list2 = null;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    list = (List) bVarD.h(c1547o0, 0, bVarArr[0], list);
                    i |= 1;
                } else {
                    if (iX != 1) {
                        throw new M9.n(iX);
                    }
                    list2 = (List) bVarD.h(c1547o0, 1, bVarArr[1], list2);
                    i |= 2;
                }
            }
            bVarD.b(c1547o0);
            return new gw(i, list, list2);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f28011b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            gw value = (gw) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f28011b;
            P9.c cVarD = encoder.d(c1547o0);
            gw.a(value, cVarD, c1547o0);
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

        public final M9.b<gw> serializer() {
            return a.f28010a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ gw(int i, List list, List list2) {
        if (3 != (i & 3)) {
            Q9.G0.a(i, 3, a.f28010a.getDescriptor());
            throw null;
        }
        this.f28008a = list;
        this.f28009b = list2;
    }

    public static final /* synthetic */ void a(gw gwVar, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f28007c;
        cVar.y(c1547o0, 0, bVarArr[0], gwVar.f28008a);
        cVar.y(c1547o0, 1, bVarArr[1], gwVar.f28009b);
    }

    public final List<dw> b() {
        return this.f28009b;
    }

    public final List<jw> c() {
        return this.f28008a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return kotlin.jvm.internal.l.b(this.f28008a, gwVar.f28008a) && kotlin.jvm.internal.l.b(this.f28009b, gwVar.f28009b);
    }

    public final int hashCode() {
        return this.f28009b.hashCode() + (this.f28008a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediation(waterfall=" + this.f28008a + ", bidding=" + this.f28009b + ")";
    }
}
