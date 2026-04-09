package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

@M9.h
/* loaded from: classes3.dex */
public final class uz0 implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    private static final M9.b<Object>[] f34254d;

    /* renamed from: b, reason: collision with root package name */
    private final String f34255b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f34256c;
    public static final b Companion = new b(0);
    public static final Parcelable.Creator<uz0> CREATOR = new c();

    public static final class a implements Q9.H<uz0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34257a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f34258b;

        static {
            a aVar = new a();
            f34257a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", aVar, 2);
            c1547o0.k("adapter", false);
            c1547o0.k("network_data", false);
            f34258b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{Q9.C0.f11399a, uz0.f34254d[1]};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f34258b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = uz0.f34254d;
            String strN = null;
            boolean z10 = true;
            int i = 0;
            Map map = null;
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
                    map = (Map) bVarD.h(c1547o0, 1, bVarArr[1], map);
                    i |= 2;
                }
            }
            bVarD.b(c1547o0);
            return new uz0(i, strN, map);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f34258b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            uz0 value = (uz0) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f34258b;
            P9.c cVarD = encoder.d(c1547o0);
            uz0.a(value, cVarD, c1547o0);
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

        public final M9.b<uz0> serializer() {
            return a.f34257a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator<uz0> {
        @Override // android.os.Parcelable.Creator
        public final uz0 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i10 = 0; i10 != i; i10++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new uz0(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final uz0[] newArray(int i) {
            return new uz0[i];
        }
    }

    static {
        Q9.C0 c02 = Q9.C0.f11399a;
        f34254d = new M9.b[]{null, new Q9.U(c02, N9.a.b(c02))};
    }

    public /* synthetic */ uz0(int i, String str, Map map) {
        if (3 != (i & 3)) {
            Q9.G0.a(i, 3, a.f34257a.getDescriptor());
            throw null;
        }
        this.f34255b = str;
        this.f34256c = map;
    }

    public static final /* synthetic */ void a(uz0 uz0Var, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f34254d;
        cVar.k(c1547o0, 0, uz0Var.f34255b);
        cVar.y(c1547o0, 1, bVarArr[1], uz0Var.f34256c);
    }

    public final String d() {
        return this.f34255b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Map<String, String> e() {
        return this.f34256c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz0)) {
            return false;
        }
        uz0 uz0Var = (uz0) obj;
        return kotlin.jvm.internal.l.b(this.f34255b, uz0Var.f34255b) && kotlin.jvm.internal.l.b(this.f34256c, uz0Var.f34256c);
    }

    public final int hashCode() {
        return this.f34256c.hashCode() + (this.f34255b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchNetwork(adapter=" + this.f34255b + ", networkData=" + this.f34256c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeString(this.f34255b);
        Map<String, String> map = this.f34256c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public uz0(String adapter, LinkedHashMap networkData) {
        kotlin.jvm.internal.l.f(adapter, "adapter");
        kotlin.jvm.internal.l.f(networkData, "networkData");
        this.f34255b = adapter;
        this.f34256c = networkData;
    }
}
