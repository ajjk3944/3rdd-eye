package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f5213a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kg.r f5214d;

    public u(h hVar, kg.r rVar) {
        this.f5213a = hVar;
        this.f5214d = rVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        if (nVar instanceof r) {
            return !(nVar2 instanceof r) ? 1 : 0;
        }
        if (nVar2 instanceof r) {
            return -1;
        }
        h hVar = this.f5213a;
        return hVar == null ? nVar.l().compareTo(nVar2.l()) : (int) a.a.P(hVar.f(this.f5214d, Arrays.asList(nVar, nVar2)).c().doubleValue());
    }
}
