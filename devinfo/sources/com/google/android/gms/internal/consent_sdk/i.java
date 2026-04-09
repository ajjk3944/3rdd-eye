package com.google.android.gms.internal.consent_sdk;

import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.jq0;
import com.google.android.gms.internal.ads.me;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.sk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19376c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19377d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i4) {
        this.f19374a = i4;
        this.f19375b = obj;
        this.f19376c = obj2;
        this.f19377d = obj3;
    }

    private final Object a() {
        com.google.android.gms.internal.play_billing.c cVar;
        t7.a aVar = (t7.a) this.f19375b;
        pf.u uVar = (pf.u) this.f19376c;
        km.i iVar = (km.i) this.f19377d;
        try {
            if (!aVar.q()) {
                t7.c cVar2 = t7.r.j;
                aVar.B(2, 3, cVar2);
                uVar.g(cVar2);
                return null;
            }
            if (TextUtils.isEmpty((String) iVar.f28426b)) {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Please provide a valid purchase token.");
                t7.c cVar3 = t7.r.g;
                aVar.B(26, 3, cVar3);
                uVar.g(cVar3);
                return null;
            }
            if (!aVar.f34420n) {
                t7.c cVar4 = t7.r.f34477a;
                aVar.B(27, 3, cVar4);
                uVar.g(cVar4);
                return null;
            }
            synchronized (aVar.f34409a) {
                cVar = aVar.f34416i;
            }
            if (cVar == null) {
                aVar.i(uVar, t7.r.j, FacebookMediationAdapter.ERROR_NULL_CONTEXT, null);
                return null;
            }
            String packageName = aVar.g.getPackageName();
            String str = (String) iVar.f28426b;
            String str2 = aVar.f34411c;
            String str3 = aVar.f34412d;
            long jLongValue = aVar.A.longValue();
            int i4 = com.google.android.gms.internal.play_billing.u.f20232a;
            Bundle bundle = new Bundle();
            com.google.android.gms.internal.play_billing.u.b(jLongValue, bundle, str2, str3);
            Bundle bundleR2 = ((com.google.android.gms.internal.play_billing.a) cVar).r2(packageName, str, bundle);
            uVar.g(t7.r.a(com.google.android.gms.internal.play_billing.u.a(bundleR2, "BillingClient"), com.google.android.gms.internal.play_billing.u.f(bundleR2, "BillingClient")));
            return null;
        } catch (DeadObjectException e2) {
            aVar.i(uVar, t7.r.j, 28, e2);
            return null;
        } catch (Exception e10) {
            aVar.i(uVar, t7.r.f34483h, 28, e10);
            return null;
        }
    }

    private final Object b() {
        com.google.android.gms.internal.play_billing.c cVar;
        int i4;
        String strF;
        t7.a aVar = (t7.a) this.f19375b;
        lf.e eVar = (lf.e) this.f19376c;
        cl.u uVar = (cl.u) this.f19377d;
        if (!aVar.q()) {
            t7.c cVar2 = t7.r.j;
            aVar.B(2, 4, cVar2);
            eVar.c(cVar2);
            return null;
        }
        String str = uVar.f2942b;
        try {
            com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str));
            synchronized (aVar.f34409a) {
                cVar = aVar.f34416i;
            }
            if (cVar == null) {
                aVar.j(eVar, t7.r.j, FacebookMediationAdapter.ERROR_NULL_CONTEXT, "Service has been reset to null.", null);
                return null;
            }
            if (aVar.f34420n) {
                String packageName = aVar.g.getPackageName();
                boolean z3 = aVar.f34420n;
                String str2 = aVar.f34411c;
                String str3 = aVar.f34412d;
                long jLongValue = aVar.A.longValue();
                Bundle bundle = new Bundle();
                if (z3) {
                    com.google.android.gms.internal.play_billing.u.b(jLongValue, bundle, str2, str3);
                }
                Bundle bundleD2 = ((com.google.android.gms.internal.play_billing.a) cVar).D2(packageName, str, bundle);
                i4 = bundleD2.getInt("RESPONSE_CODE");
                strF = com.google.android.gms.internal.play_billing.u.f(bundleD2, "BillingClient");
            } else {
                String packageName2 = aVar.g.getPackageName();
                com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                Parcel parcelA2 = aVar2.a2();
                parcelA2.writeInt(3);
                parcelA2.writeString(packageName2);
                parcelA2.writeString(str);
                Parcel parcelF2 = aVar2.f2(parcelA2, 5);
                i4 = parcelF2.readInt();
                parcelF2.recycle();
                strF = "";
            }
            t7.c cVarA = t7.r.a(i4, strF);
            if (i4 == 0) {
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                eVar.c(cVarA);
                return null;
            }
            aVar.j(eVar, cVarA, 23, "Error consuming purchase with token. Response code: " + i4, null);
            return null;
        } catch (DeadObjectException e2) {
            aVar.j(eVar, t7.r.j, 29, "Error consuming purchase!", e2);
            return null;
        } catch (Exception e10) {
            aVar.j(eVar, t7.r.f34483h, 29, "Error consuming purchase!", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c() {
        com.google.android.gms.common.api.internal.a0 a0Var;
        com.google.android.gms.internal.play_billing.c cVar;
        boolean z3;
        ArrayList arrayList;
        int i4;
        t7.a aVar = (t7.a) this.f19375b;
        ri.d dVar = (ri.d) this.f19376c;
        km.i iVar = (km.i) this.f19377d;
        int i10 = 13;
        Exception exc = null;
        if (!aVar.q()) {
            t7.c cVar2 = t7.r.j;
            aVar.B(2, 7, cVar2);
            com.google.android.gms.internal.play_billing.o oVar = com.google.android.gms.internal.play_billing.q.f20213b;
            dVar.a(cVar2, new nm.d0(i10, com.google.android.gms.internal.play_billing.v.f20241e));
            return null;
        }
        if (!aVar.f34424r) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Querying product details is not supported.");
            t7.c cVar3 = t7.r.f34489o;
            aVar.B(20, 7, cVar3);
            com.google.android.gms.internal.play_billing.o oVar2 = com.google.android.gms.internal.play_billing.q.f20213b;
            dVar.a(cVar3, new nm.d0(i10, com.google.android.gms.internal.play_billing.v.f20241e));
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        String str = ((t7.i) ((com.google.android.gms.internal.play_billing.q) iVar.f28426b).get(0)).f34460b;
        com.google.android.gms.internal.play_billing.q qVar = (com.google.android.gms.internal.play_billing.q) iVar.f28426b;
        int size = qVar.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                a0Var = new com.google.android.gms.common.api.internal.a0(0, "", arrayList2, arrayList3);
                break;
            }
            int i13 = i12 + 20;
            ArrayList arrayList4 = new ArrayList(qVar.subList(i12, i13 > size ? size : i13));
            ArrayList<String> arrayList5 = new ArrayList<>();
            int size2 = arrayList4.size();
            for (int i14 = i11; i14 < size2; i14++) {
                arrayList5.add(((t7.i) arrayList4.get(i14)).f34459a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList5);
            String str2 = aVar.f34411c;
            bundle.putString("playBillingLibraryVersion", str2);
            try {
                synchronized (aVar.f34409a) {
                    cVar = aVar.f34416i;
                }
                if (cVar == null) {
                    a0Var = aVar.v(t7.r.j, FacebookMediationAdapter.ERROR_NULL_CONTEXT, "Service has been reset to null.", exc);
                    break;
                }
                if (aVar.f34425s) {
                    aVar.f34430x.getClass();
                    z3 = 1;
                } else {
                    z3 = i11;
                }
                aVar.y();
                aVar.y();
                aVar.y();
                aVar.y();
                com.google.android.gms.internal.play_billing.q qVar2 = qVar;
                ArrayList arrayList6 = arrayList4;
                Bundle bundleH4 = ((com.google.android.gms.internal.play_billing.a) cVar).h4(true != aVar.f34426t ? 17 : 20, aVar.g.getPackageName(), str, bundle, com.google.android.gms.internal.play_billing.u.d(str2, aVar.f34412d, arrayList4, new bh.v(z3), aVar.A.longValue()));
                if (bundleH4 == null) {
                    a0Var = aVar.v(t7.r.f34490p, 44, "queryProductDetailsAsync got empty product details response.", null);
                    break;
                }
                if (bundleH4.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = bundleH4.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        a0Var = aVar.v(t7.r.f34490p, 46, "queryProductDetailsAsync got null response list", null);
                        break;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    int size3 = stringArrayList.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        try {
                            t7.g gVar = new t7.g(stringArrayList.get(i15));
                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got product details: ".concat(gVar.toString()));
                            arrayList7.add(gVar);
                        } catch (JSONException e2) {
                            a0Var = aVar.v(t7.r.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e2);
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundleH4.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                    new ArrayList();
                    try {
                        ArrayList arrayList8 = new ArrayList();
                        if (stringArrayList2 != null) {
                            int size4 = stringArrayList2.size();
                            int i16 = 0;
                            while (i16 < size4) {
                                String str3 = stringArrayList2.get(i16);
                                i16++;
                                t7.j jVar = new t7.j(str3);
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got unfetchedProduct: ".concat(jVar.toString()));
                                arrayList8.add(jVar);
                            }
                        } else {
                            int size5 = arrayList6.size();
                            int i17 = 0;
                            while (i17 < size5) {
                                Object obj = arrayList6.get(i17);
                                i17++;
                                t7.i iVar2 = (t7.i) obj;
                                int size6 = arrayList7.size();
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= size6) {
                                        arrayList = arrayList6;
                                        i4 = size5;
                                        arrayList8.add(new t7.j(new JSONObject().put("productId", iVar2.f34459a).put("type", iVar2.f34460b).put("statusCode", 0).toString()));
                                        break;
                                    }
                                    Object obj2 = arrayList7.get(i18);
                                    i18++;
                                    t7.g gVar2 = (t7.g) obj2;
                                    arrayList = arrayList6;
                                    i4 = size5;
                                    if (!iVar2.f34459a.equals(gVar2.f34452c) || !iVar2.f34460b.equals(gVar2.f34453d)) {
                                        arrayList6 = arrayList;
                                        size5 = i4;
                                    }
                                }
                                arrayList6 = arrayList;
                                size5 = i4;
                            }
                        }
                        arrayList2.addAll(arrayList7);
                        arrayList3.addAll(arrayList8);
                        i12 = i13;
                        qVar = qVar2;
                        exc = null;
                        i11 = 0;
                    } catch (JSONException e10) {
                        a0Var = aVar.v(t7.r.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e10);
                    }
                } else {
                    int iA = com.google.android.gms.internal.play_billing.u.a(bundleH4, "BillingClient");
                    String strF = com.google.android.gms.internal.play_billing.u.f(bundleH4, "BillingClient");
                    a0Var = iA != 0 ? aVar.v(t7.r.a(iA, strF), 23, je.u.r(iA, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : aVar.v(t7.r.a(6, strF), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                }
            } catch (DeadObjectException e11) {
                a0Var = aVar.v(t7.r.j, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e11);
            } catch (Exception e12) {
                a0Var = aVar.v(t7.r.f34483h, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            }
        }
        dVar.a(t7.r.a(a0Var.f9069b, (String) a0Var.f9071d), new nm.d0(13, (ArrayList) a0Var.f9070c));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r0 = r2.A(t7.r.j, com.google.ads.mediation.facebook.FacebookMediationAdapter.ERROR_NULL_CONTEXT, "Service has been reset to null", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object d() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.i.d():java.lang.Object");
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        jq0 jq0Var;
        Bundle bundleC;
        com.google.android.gms.internal.play_billing.c cVar;
        switch (this.f19374a) {
            case 0:
                return Boolean.valueOf(((k0) this.f19375b).c((String) this.f19376c, (JSONObject) this.f19377d));
            case 1:
                fb.h hVar = (fb.h) this.f19375b;
                List<Uri> list = (List) this.f19376c;
                vb.a aVar = (vb.a) this.f19377d;
                me meVar = hVar.f23914d.f14684b;
                String strI = meVar != null ? meVar.i(hVar.f23913c, (View) vb.b.U0(aVar), null) : "";
                if (TextUtils.isEmpty(strI)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list) {
                    if (fb.h.l4(uri, hVar.f23934z, hVar.A)) {
                        arrayList.add(fb.h.o4(uri, "ms", strI));
                    } else {
                        za.i.h("Not a Google URL: ".concat(String.valueOf(uri)));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            case 2:
                fb.h hVar2 = (fb.h) this.f19375b;
                Uri uriB = (Uri) this.f19376c;
                vb.a aVar2 = (vb.a) this.f19377d;
                try {
                    uriB = (!((Boolean) va.s.f36163e.f36166c.a(sk.f16216ld)).booleanValue() || (jq0Var = hVar2.f23915e) == null) ? hVar2.f23914d.b(uriB, hVar2.f23913c, (View) vb.b.U0(aVar2), null) : jq0Var.a(uriB, hVar2.f23913c, (View) vb.b.U0(aVar2), null);
                } catch (pe e2) {
                    za.i.i("", e2);
                }
                if (uriB.getQueryParameter("ms") != null) {
                    return uriB;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 3:
                o7.d.m(((fb.z) this.f19375b).f23997c, (pa.g) this.f19376c, (fb.a0) this.f19377d);
                return Boolean.TRUE;
            case 4:
                return a();
            case 5:
                return b();
            case 6:
                return c();
            case 7:
                return d();
            default:
                t7.a aVar3 = (t7.a) this.f19375b;
                String str = (String) this.f19376c;
                String str2 = (String) this.f19377d;
                try {
                    synchronized (aVar3.f34409a) {
                        cVar = aVar3.f34416i;
                    }
                    return cVar == null ? com.google.android.gms.internal.play_billing.u.c(FacebookMediationAdapter.ERROR_NULL_CONTEXT, t7.r.j) : ((com.google.android.gms.internal.play_billing.a) cVar).h3(aVar3.g.getPackageName(), str, str2);
                } catch (DeadObjectException e10) {
                    t7.c cVar2 = t7.r.j;
                    String strA = t7.p.a(e10);
                    bundleC = com.google.android.gms.internal.play_billing.u.c(5, cVar2);
                    if (strA != null) {
                        bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                    }
                    return bundleC;
                } catch (Exception e11) {
                    t7.c cVar3 = t7.r.f34483h;
                    String strA2 = t7.p.a(e11);
                    bundleC = com.google.android.gms.internal.play_billing.u.c(5, cVar3);
                    if (strA2 != null) {
                        bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                    }
                    return bundleC;
                }
        }
    }

    public i(t7.a aVar, com.applovin.impl.sdk.ad.f fVar, String str) {
        this.f19374a = 7;
        this.f19375b = fVar;
        this.f19376c = str;
        Objects.requireNonNull(aVar);
        this.f19377d = aVar;
    }
}
