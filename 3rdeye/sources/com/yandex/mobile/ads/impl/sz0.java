package com.yandex.mobile.ads.impl;

import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.uz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class sz0 implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    private final String f33335b;

    /* renamed from: c, reason: collision with root package name */
    private final List<uz0> f33336c;
    public static final b Companion = new b(0);
    public static final Parcelable.Creator<sz0> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final M9.b<Object>[] f33334d = {null, new C1526e(uz0.a.f34257a)};

    public static final class a implements Q9.H<sz0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33337a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f33338b;

        static {
            a aVar = new a();
            f33337a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchAdUnit", aVar, 2);
            c1547o0.k(Constants.ADMON_AD_UNIT_ID, false);
            c1547o0.k("networks", false);
            f33338b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{Q9.C0.f11399a, sz0.f33334d[1]};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f33338b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = sz0.f33334d;
            String strN = null;
            boolean z10 = true;
            int i = 0;
            List list = null;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strN = bVarD.n(c1547o0, 0);
                    i |= 1;
                } else {
                    if (iX != 1) {
                        throw new M9.n(iX);
                    }
                    list = (List) bVarD.h(c1547o0, 1, bVarArr[1], list);
                    i |= 2;
                }
            }
            bVarD.b(c1547o0);
            return new sz0(i, strN, list);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f33338b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            sz0 value = (sz0) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f33338b;
            P9.c cVarD = encoder.d(c1547o0);
            sz0.a(value, cVarD, c1547o0);
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

        public final M9.b<sz0> serializer() {
            return a.f33337a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator<sz0> {
        @Override // android.os.Parcelable.Creator
        public final sz0 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i10 = 0; i10 != i; i10++) {
                arrayList.add(uz0.CREATOR.createFromParcel(parcel));
            }
            return new sz0(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final sz0[] newArray(int i) {
            return new sz0[i];
        }
    }

    public /* synthetic */ sz0(int i, String str, List list) {
        if (3 != (i & 3)) {
            Q9.G0.a(i, 3, a.f33337a.getDescriptor());
            throw null;
        }
        this.f33335b = str;
        this.f33336c = list;
    }

    public static final /* synthetic */ void a(sz0 sz0Var, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f33334d;
        cVar.k(c1547o0, 0, sz0Var.f33335b);
        cVar.y(c1547o0, 1, bVarArr[1], sz0Var.f33336c);
    }

    public final String d() {
        return this.f33335b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<uz0> e() {
        return this.f33336c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz0)) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        return kotlin.jvm.internal.l.b(this.f33335b, sz0Var.f33335b) && kotlin.jvm.internal.l.b(this.f33336c, sz0Var.f33336c);
    }

    public final int hashCode() {
        return this.f33336c.hashCode() + (this.f33335b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnit(adUnitId=" + this.f33335b + ", networks=" + this.f33336c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeString(this.f33335b);
        List<uz0> list = this.f33336c;
        out.writeInt(list.size());
        Iterator<uz0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
    }

    public sz0(String adUnitId, ArrayList networks) {
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.l.f(networks, "networks");
        this.f33335b = adUnitId;
        this.f33336c = networks;
    }
}
