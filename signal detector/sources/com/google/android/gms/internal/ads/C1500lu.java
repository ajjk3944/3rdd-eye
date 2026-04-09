package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.lu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1500lu implements InterfaceC1544mk {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15485a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Context f15486b;

    /* renamed from: c, reason: collision with root package name */
    public final C0572Jf f15487c;

    public C1500lu(Context context, C0572Jf c0572Jf) {
        this.f15486b = context;
        this.f15487c = c0572Jf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1544mk
    public final synchronized void D(C2852x0 c2852x0) {
        if (c2852x0.f23273a != 3) {
            this.f15487c.b(this.f15485a);
        }
    }

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.f15485a;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle b() {
        C0572Jf c0572Jf = this.f15487c;
        Context context = this.f15486b;
        c0572Jf.getClass();
        HashSet hashSet = new HashSet();
        synchronized (c0572Jf.f9319a) {
            HashSet hashSet2 = c0572Jf.f9323e;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", c0572Jf.f9322d.f(context, c0572Jf.f9321c.o()));
        Bundle bundle2 = new Bundle();
        Iterator it = c0572Jf.f9324f.iterator();
        if (it.hasNext()) {
            throw A.f.f(it);
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C0470Df) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        a(hashSet);
        return bundle;
    }
}
