package com.yandex.mobile.ads.impl;

import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import android.os.Parcel;
import android.os.Parcelable;
import c9.C2099t;
import com.yandex.mobile.ads.impl.sz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class vz0 implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    private final long f34744b;

    /* renamed from: c, reason: collision with root package name */
    private final List<sz0> f34745c;
    public static final b Companion = new b(0);
    public static final Parcelable.Creator<vz0> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final M9.b<Object>[] f34743d = {null, new C1526e(sz0.a.f33337a)};

    public static final class a implements Q9.H<vz0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34746a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f34747b;

        static {
            a aVar = new a();
            f34746a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchSettings", aVar, 2);
            c1547o0.k("load_timeout_millis", true);
            c1547o0.k("mediation_prefetch_ad_units", true);
            f34747b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{Q9.Y.f11465a, vz0.f34743d[1]};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f34747b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = vz0.f34743d;
            List list = null;
            long jC = 0;
            boolean z10 = true;
            int i = 0;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    jC = bVarD.C(c1547o0, 0);
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
            return new vz0(i, jC, list);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f34747b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            vz0 value = (vz0) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f34747b;
            P9.c cVarD = encoder.d(c1547o0);
            vz0.a(value, cVarD, c1547o0);
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

        public final M9.b<vz0> serializer() {
            return a.f34746a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator<vz0> {
        @Override // android.os.Parcelable.Creator
        public final vz0 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            long j4 = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i10 = 0; i10 != i; i10++) {
                arrayList.add(sz0.CREATOR.createFromParcel(parcel));
            }
            return new vz0(j4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final vz0[] newArray(int i) {
            return new vz0[i];
        }
    }

    public vz0() {
        this(0);
    }

    public static final /* synthetic */ void a(vz0 vz0Var, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f34743d;
        if (cVar.F(c1547o0, 0) || vz0Var.f34744b != 30000) {
            cVar.m(c1547o0, 0, vz0Var.f34744b);
        }
        if (!cVar.F(c1547o0, 1) && kotlin.jvm.internal.l.b(vz0Var.f34745c, C2099t.f18581b)) {
            return;
        }
        cVar.y(c1547o0, 1, bVarArr[1], vz0Var.f34745c);
    }

    public final long d() {
        return this.f34744b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<sz0> e() {
        return this.f34745c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz0)) {
            return false;
        }
        vz0 vz0Var = (vz0) obj;
        return this.f34744b == vz0Var.f34744b && kotlin.jvm.internal.l.b(this.f34745c, vz0Var.f34745c);
    }

    public final int hashCode() {
        long j4 = this.f34744b;
        return this.f34745c.hashCode() + (((int) (j4 ^ (j4 >>> 32))) * 31);
    }

    public final String toString() {
        return "MediationPrefetchSettings(loadTimeoutMillis=" + this.f34744b + ", mediationPrefetchAdUnits=" + this.f34745c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeLong(this.f34744b);
        List<sz0> list = this.f34745c;
        out.writeInt(list.size());
        Iterator<sz0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
    }

    public /* synthetic */ vz0(int i) {
        this(30000L, C2099t.f18581b);
    }

    public /* synthetic */ vz0(int i, long j4, List list) {
        this.f34744b = (i & 1) == 0 ? 30000L : j4;
        if ((i & 2) == 0) {
            this.f34745c = C2099t.f18581b;
        } else {
            this.f34745c = list;
        }
    }

    public vz0(long j4, List<sz0> mediationPrefetchAdUnits) {
        kotlin.jvm.internal.l.f(mediationPrefetchAdUnits, "mediationPrefetchAdUnits");
        this.f34744b = j4;
        this.f34745c = mediationPrefetchAdUnits;
    }
}
