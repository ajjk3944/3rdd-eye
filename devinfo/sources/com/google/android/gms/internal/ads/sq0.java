package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sq0 implements i60 {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f16513a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Context f16514b;

    /* renamed from: c, reason: collision with root package name */
    public final bx f16515c;

    public sq0(Context context, bx bxVar) {
        this.f16514b = context;
        this.f16515c = bxVar;
    }

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.f16513a;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle b() {
        bx bxVar = this.f16515c;
        Context context = this.f16514b;
        bxVar.getClass();
        HashSet hashSet = new HashSet();
        synchronized (bxVar.f9834a) {
            HashSet hashSet2 = bxVar.f9838e;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", bxVar.f9837d.f(context, bxVar.f9836c.p()));
        Bundle bundle2 = new Bundle();
        Iterator it = bxVar.f9839f.iterator();
        if (it.hasNext()) {
            throw je.u.o(it);
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((vw) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        a(hashSet);
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final synchronized void o(va.w1 w1Var) {
        if (w1Var.f36177a != 3) {
            this.f16515c.b(this.f16513a);
        }
    }
}
