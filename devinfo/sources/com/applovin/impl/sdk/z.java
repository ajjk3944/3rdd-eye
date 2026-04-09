package com.applovin.impl.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.f1;
import com.liuzh.deviceinfo.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5755c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5757e;

    public /* synthetic */ z(int i4, int i10, Object obj, Object obj2, Object obj3) {
        this.f5753a = i10;
        this.f5755c = obj;
        this.f5756d = obj2;
        this.f5754b = i4;
        this.f5757e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5753a) {
            case 0:
                ((l) this.f5755c).a((String) this.f5756d, this.f5754b, (String) this.f5757e);
                return;
            case 1:
                com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f5755c;
                ea.i iVar = (ea.i) this.f5756d;
                int i4 = this.f5754b;
                Runnable runnable = (Runnable) this.f5757e;
                ma.c cVar = (ma.c) dVar.f19300f;
                try {
                    try {
                        la.d dVar2 = (la.d) dVar.f19297c;
                        Objects.requireNonNull(dVar2);
                        ((la.h) cVar).v(new ca.b(23, dVar2));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) dVar.f19295a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((la.h) cVar).v(new ej.d(dVar, iVar, i4));
                        } else {
                            dVar.d(iVar, i4);
                        }
                    } catch (ma.a unused) {
                        ((i0.f) dVar.f19298d).N(iVar, i4 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    runnable.run();
                    throw th2;
                }
            case 2:
                List<String> list = (List) this.f5755c;
                f1 f1Var = (f1) this.f5756d;
                si.h hVar = (si.h) this.f5757e;
                ArrayList arrayList = new ArrayList();
                int i10 = this.f5754b;
                String str = i10 == 2 ? "subs" : "inapp";
                ArrayList arrayList2 = new ArrayList(zj.o.T(list, 10));
                for (String str2 : list) {
                    ge.d dVar3 = new ge.d(2);
                    dVar3.f24698c = str;
                    dVar3.f24697b = str2;
                    if ("first_party".equals(str)) {
                        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                    }
                    if (dVar3.f24697b == null) {
                        throw new IllegalArgumentException("Product id must be provided.");
                    }
                    arrayList2.add(new t7.i(dVar3));
                }
                km.y yVar = new km.y(20, false);
                if (arrayList2.isEmpty()) {
                    throw new IllegalArgumentException("Product list cannot be empty.");
                }
                HashSet hashSet = new HashSet();
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    t7.i iVar2 = (t7.i) obj;
                    if (!"play_pass_subs".equals(iVar2.f34460b)) {
                        hashSet.add(iVar2.f34460b);
                    }
                }
                if (hashSet.size() > 1) {
                    throw new IllegalArgumentException("All products should be of the same product type.");
                }
                com.google.android.gms.internal.play_billing.q qVarL = com.google.android.gms.internal.play_billing.q.l(arrayList2);
                yVar.f28522b = qVarL;
                if (qVarL == null) {
                    throw new IllegalArgumentException("Product list must be set to a non empty list.");
                }
                ((t7.a) f1Var.f1134b).e(new km.i(yVar), new ri.d(f1Var, i10, arrayList, hVar));
                return;
            default:
                TextView textView = (TextView) this.f5755c;
                String str3 = (String) this.f5756d;
                ImageView imageView = (ImageView) this.f5757e;
                textView.setText(ii.a.C(str3));
                int i12 = this.f5754b;
                if (i12 == R.drawable.ic_cpu) {
                    imageView.setImageDrawable(z2.k.a());
                    return;
                } else {
                    imageView.setImageResource(i12);
                    return;
                }
        }
    }

    public /* synthetic */ z(int i4, List list, f1 f1Var, si.h hVar) {
        this.f5753a = 2;
        this.f5754b = i4;
        this.f5755c = list;
        this.f5756d = f1Var;
        this.f5757e = hVar;
    }
}
