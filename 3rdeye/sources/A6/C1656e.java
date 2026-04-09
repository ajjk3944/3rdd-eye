package a6;

import E.u;
import M9.n;
import Q9.C0;
import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.H;
import Q9.Q;
import Q9.x0;
import R9.AbstractC1564a;
import R9.C1568e;
import R9.s;
import R9.t;
import a6.C1653b;
import android.util.Base64;
import b9.C1992A;
import com.facebook.ads.AdSDKNotificationListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.x;

/* compiled from: BidPayload.kt */
@M9.h
/* renamed from: a6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1656e {
    public static final c Companion = new c(null);
    private final C1653b ad;
    private final String adunit;
    private final List<String> impression;
    private final AbstractC1564a json;
    private final Integer version;

    /* compiled from: BidPayload.kt */
    /* renamed from: a6.e$a */
    public static final class a implements H<C1656e> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.BidPayload", aVar, 4);
            c1547o0.k("version", true);
            c1547o0.k("adunit", true);
            c1547o0.k(AdSDKNotificationListener.IMPRESSION_EVENT, true);
            c1547o0.k("ad", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            M9.b<?> bVarB = N9.a.b(Q.f11448a);
            C0 c02 = C0.f11399a;
            return new M9.b[]{bVarB, N9.a.b(c02), N9.a.b(new C1526e(c02)), N9.a.b(C1653b.a.INSTANCE)};
        }

        @Override // M9.b
        public C1656e deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objG = null;
            boolean z10 = true;
            int i = 0;
            Object objG2 = null;
            Object objG3 = null;
            Object objG4 = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objG = bVarD.G(descriptor2, 0, Q.f11448a, objG);
                    i |= 1;
                } else if (iX == 1) {
                    objG2 = bVarD.G(descriptor2, 1, C0.f11399a, objG2);
                    i |= 2;
                } else if (iX == 2) {
                    objG3 = bVarD.G(descriptor2, 2, new C1526e(C0.f11399a), objG3);
                    i |= 4;
                } else {
                    if (iX != 3) {
                        throw new n(iX);
                    }
                    objG4 = bVarD.G(descriptor2, 3, C1653b.a.INSTANCE, objG4);
                    i |= 8;
                }
            }
            bVarD.b(descriptor2);
            return new C1656e(i, (Integer) objG, (String) objG2, (List) objG3, (C1653b) objG4, null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, C1656e value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            C1656e.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: BidPayload.kt */
    /* renamed from: a6.e$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<C1568e, C1992A> {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(C1568e c1568e) {
            invoke2(c1568e);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1568e Json) {
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11793c = true;
            Json.f11791a = true;
            Json.f11792b = false;
        }
    }

    /* compiled from: BidPayload.kt */
    /* renamed from: a6.e$c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<C1656e> serializer() {
            return a.INSTANCE;
        }

        private c() {
        }
    }

    /* compiled from: BidPayload.kt */
    /* renamed from: a6.e$d */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<C1568e, C1992A> {
        public static final d INSTANCE = new d();

        public d() {
            super(1);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(C1568e c1568e) {
            invoke2(c1568e);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1568e Json) {
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11793c = true;
            Json.f11791a = true;
            Json.f11792b = false;
        }
    }

    public C1656e() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C1656e copy$default(C1656e c1656e, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c1656e.version;
        }
        if ((i & 2) != 0) {
            str = c1656e.adunit;
        }
        if ((i & 4) != 0) {
            list = c1656e.impression;
        }
        return c1656e.copy(num, str, list);
    }

    private final String gzipDecode(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i = gZIPInputStream.read(bArr2);
                    if (i == -1) {
                        C1992A c1992a = C1992A.f18074a;
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        String string = byteArrayOutputStream.toString();
                        kotlin.jvm.internal.l.e(string, "result.toString()");
                        return string;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                }
            } finally {
            }
        } finally {
        }
    }

    public static final void write$Self(C1656e self, P9.c output, O9.e serialDesc) {
        String decodedAdsResponse;
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        if (output.F(serialDesc, 0) || self.version != null) {
            output.w(serialDesc, 0, Q.f11448a, self.version);
        }
        if (output.F(serialDesc, 1) || self.adunit != null) {
            output.w(serialDesc, 1, C0.f11399a, self.adunit);
        }
        if (output.F(serialDesc, 2) || self.impression != null) {
            output.w(serialDesc, 2, new C1526e(C0.f11399a), self.impression);
        }
        if (!output.F(serialDesc, 3)) {
            C1653b c1653b = self.ad;
            C1653b c1653b2 = null;
            if (self.adunit != null && (decodedAdsResponse = self.getDecodedAdsResponse()) != null) {
                AbstractC1564a abstractC1564a = self.json;
                c1653b2 = (C1653b) abstractC1564a.a(u.L(abstractC1564a.f11782b, x.b(C1653b.class)), decodedAdsResponse);
            }
            if (kotlin.jvm.internal.l.b(c1653b, c1653b2)) {
                return;
            }
        }
        output.w(serialDesc, 3, C1653b.a.INSTANCE, self.ad);
    }

    public final Integer component1() {
        return this.version;
    }

    public final String component2() {
        return this.adunit;
    }

    public final List<String> component3() {
        return this.impression;
    }

    public final C1656e copy(Integer num, String str, List<String> list) {
        return new C1656e(num, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1656e)) {
            return false;
        }
        C1656e c1656e = (C1656e) obj;
        return kotlin.jvm.internal.l.b(this.version, c1656e.version) && kotlin.jvm.internal.l.b(this.adunit, c1656e.adunit) && kotlin.jvm.internal.l.b(this.impression, c1656e.impression);
    }

    public final C1653b getAdPayload() {
        return this.ad;
    }

    public final String getAdunit() {
        return this.adunit;
    }

    public final String getDecodedAdsResponse() throws Throwable {
        byte[] bArrDecode = Base64.decode(this.adunit, 0);
        if (bArrDecode != null) {
            return gzipDecode(bArrDecode);
        }
        return null;
    }

    public final String getEventId() {
        C1653b c1653b = this.ad;
        if (c1653b != null) {
            return c1653b.eventId();
        }
        return null;
    }

    public final List<String> getImpression() {
        return this.impression;
    }

    public final String getPlacementId() {
        C1653b c1653b = this.ad;
        if (c1653b != null) {
            return c1653b.placementId();
        }
        return null;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    public C1656e(int i, Integer num, String str, List list, C1653b c1653b, x0 x0Var) {
        String decodedAdsResponse;
        C1653b c1653b2 = null;
        if ((i & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        s sVarA = t.a(b.INSTANCE);
        this.json = sVarA;
        if ((i & 8) != 0) {
            this.ad = c1653b;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            c1653b2 = (C1653b) sVarA.a(u.L(sVarA.f11782b, x.b(C1653b.class)), decodedAdsResponse);
        }
        this.ad = c1653b2;
    }

    public C1656e(Integer num, String str, List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        s sVarA = t.a(d.INSTANCE);
        this.json = sVarA;
        C1653b c1653b = null;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            c1653b = (C1653b) sVarA.a(u.L(sVarA.f11782b, x.b(C1653b.class)), decodedAdsResponse);
        }
        this.ad = c1653b;
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    public /* synthetic */ C1656e(Integer num, String str, List list, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
