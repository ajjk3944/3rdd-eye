package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import Q9.C1547o0;
import Q9.C1549p0;
import android.os.Parcel;
import android.os.Parcelable;

@M9.h
/* renamed from: com.yandex.mobile.ads.impl.f4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4108f4 implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    private final String f27194b;
    public static final b Companion = new b(0);
    public static final Parcelable.Creator<C4108f4> CREATOR = new c();

    /* renamed from: com.yandex.mobile.ads.impl.f4$a */
    public static final class a implements Q9.H<C4108f4> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27195a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f27196b;

        static {
            a aVar = new a();
            f27195a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.common.AdImpressionData", aVar, 1);
            c1547o0.k("rawData", false);
            f27196b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{Q9.C0.f11399a};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f27196b;
            P9.b bVarD = decoder.d(c1547o0);
            String strN = null;
            boolean z10 = true;
            int i = 0;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else {
                    if (iX != 0) {
                        throw new M9.n(iX);
                    }
                    strN = bVarD.n(c1547o0, 0);
                    i = 1;
                }
            }
            bVarD.b(c1547o0);
            return new C4108f4(i, strN);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f27196b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            C4108f4 value = (C4108f4) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f27196b;
            P9.c cVarD = encoder.d(c1547o0);
            C4108f4.a(value, cVarD, c1547o0);
            cVarD.b(c1547o0);
        }

        @Override // Q9.H
        public final M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.f4$b */
    public static final class b {
        private b() {
        }

        public final M9.b<C4108f4> serializer() {
            return a.f27195a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.f4$c */
    public static final class c implements Parcelable.Creator<C4108f4> {
        @Override // android.os.Parcelable.Creator
        public final C4108f4 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            return new C4108f4(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C4108f4[] newArray(int i) {
            return new C4108f4[i];
        }
    }

    public /* synthetic */ C4108f4(int i, String str) {
        if (1 == (i & 1)) {
            this.f27194b = str;
        } else {
            Q9.G0.a(i, 1, a.f27195a.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ void a(C4108f4 c4108f4, P9.c cVar, C1547o0 c1547o0) {
        cVar.k(c1547o0, 0, c4108f4.f27194b);
    }

    public final String c() {
        return this.f27194b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4108f4) && kotlin.jvm.internal.l.b(this.f27194b, ((C4108f4) obj).f27194b);
    }

    public final int hashCode() {
        return this.f27194b.hashCode();
    }

    public final String toString() {
        return C1154e9.i("AdImpressionData(rawData=", this.f27194b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeString(this.f27194b);
    }

    public C4108f4(String rawData) {
        kotlin.jvm.internal.l.f(rawData, "rawData");
        this.f27194b = rawData;
    }
}
