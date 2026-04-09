package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f19944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.x0 f19945b;

    public u(h hVar, a0.x0 x0Var) {
        this.f19944a = hVar;
        this.f19945b = x0Var;
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
        h hVar = this.f19944a;
        return hVar == null ? nVar.zzc().compareTo(nVar2.zzc()) : (int) com.bumptech.glide.c.C(hVar.b(this.f19945b, Arrays.asList(nVar, nVar2)).f().doubleValue());
    }
}
