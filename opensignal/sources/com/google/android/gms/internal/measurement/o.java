package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f5145a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5146d;

    public o(String str, ArrayList arrayList) {
        this.f5145a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f5146d = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double c() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        String str = oVar.f5145a;
        String str2 = this.f5145a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f5146d.equals(oVar.f5146d);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, kg.r rVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        String str = this.f5145a;
        return this.f5146d.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n m() {
        return this;
    }
}
