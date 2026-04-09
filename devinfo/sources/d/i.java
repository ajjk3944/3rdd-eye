package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f21597a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f21598b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f21599c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f21600d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f21601e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f21602f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f21603h;

    public i(j jVar) {
        this.f21603h = jVar;
    }

    public final boolean a(int i4, int i10, Intent intent) {
        String str = (String) this.f21597a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        f.f fVar = (f.f) this.f21601e.get(str);
        if ((fVar != null ? fVar.f23587a : null) != null) {
            ArrayList arrayList = this.f21600d;
            if (arrayList.contains(str)) {
                fVar.f23587a.k(fVar.f23588b.v(intent, i10));
                arrayList.remove(str);
                return true;
            }
        }
        this.f21602f.remove(str);
        this.g.putParcelable(str, new f.a(intent, i10));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i4, ci.b bVar, Object obj) {
        Bundle bundleExtra;
        int i10;
        j jVar = this.f21603h;
        jf.c cVarP = bVar.p(jVar, obj);
        if (cVarP != null) {
            new Handler(Looper.getMainLooper()).post(new com.applovin.mediation.nativeAds.adPlacer.a(this, i4, cVarP, 1));
            return;
        }
        Intent intentI = bVar.i(jVar, obj);
        if (intentI.getExtras() != null) {
            Bundle extras = intentI.getExtras();
            nk.k.b(extras);
            if (extras.getClassLoader() == null) {
                intentI.setExtrasClassLoader(jVar.getClassLoader());
            }
        }
        if (intentI.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentI.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentI.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentI.getAction())) {
            String[] stringArrayExtra = intentI.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                if (TextUtils.isEmpty(stringArrayExtra[i11])) {
                    throw new IllegalArgumentException(h.w(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr[i12] = stringArrayExtra[i13];
                        i12++;
                    }
                }
            }
            if (jVar instanceof r3.a) {
            }
            jVar.requestPermissions(stringArrayExtra, i4);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentI.getAction())) {
            jVar.startActivityForResult(intentI, i4, bundle);
            return;
        }
        f.i iVar = (f.i) intentI.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            nk.k.b(iVar);
            i10 = i4;
            try {
                jVar.startIntentSenderForResult(iVar.f23595a, i10, iVar.f23596b, iVar.f23597c, iVar.f23598d, 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new com.applovin.mediation.nativeAds.adPlacer.a(this, i10, e, 2));
            }
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            i10 = i4;
        }
    }

    public final f.h c(final String str, androidx.lifecycle.a0 a0Var, final ci.b bVar, final f.b bVar2) {
        nk.k.e(str, "key");
        androidx.lifecycle.c0 c0VarJ = a0Var.j();
        if (c0VarJ.f1110d.compareTo(androidx.lifecycle.s.f1183d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + a0Var + " is attempting to register while current state is " + c0VarJ.f1110d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.f21599c;
        f.g gVar = (f.g) linkedHashMap.get(str);
        if (gVar == null) {
            gVar = new f.g(c0VarJ);
        }
        androidx.lifecycle.y yVar = new androidx.lifecycle.y() { // from class: f.e
            @Override // androidx.lifecycle.y
            public final void g(a0 a0Var2, r rVar) {
                d.i iVar = this.f23583a;
                LinkedHashMap linkedHashMap2 = iVar.f21601e;
                r rVar2 = r.ON_START;
                String str2 = str;
                if (rVar2 != rVar) {
                    if (r.ON_STOP == rVar) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (r.ON_DESTROY == rVar) {
                            iVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = iVar.g;
                LinkedHashMap linkedHashMap3 = iVar.f21602f;
                ci.b bVar3 = bVar;
                b bVar4 = bVar2;
                linkedHashMap2.put(str2, new f(bVar3, bVar4));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar4.k(obj);
                }
                a aVar = (a) com.bumptech.glide.c.o(bundle, str2);
                if (aVar != null) {
                    bundle.remove(str2);
                    bVar4.k(bVar3.v(aVar.f23582b, aVar.f23581a));
                }
            }
        };
        gVar.f23589a.a(yVar);
        gVar.f23590b.add(yVar);
        linkedHashMap.put(str, gVar);
        return new f.h(this, str, bVar, 0);
    }

    public final f.h d(String str, ci.b bVar, f.b bVar2) {
        nk.k.e(str, "key");
        e(str);
        this.f21601e.put(str, new f.f(bVar, bVar2));
        LinkedHashMap linkedHashMap = this.f21602f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar2.k(obj);
        }
        Bundle bundle = this.g;
        f.a aVar = (f.a) com.bumptech.glide.c.o(bundle, str);
        if (aVar != null) {
            bundle.remove(str);
            bVar2.k(bVar.v(aVar.f23582b, aVar.f23581a));
        }
        return new f.h(this, str, bVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f21598b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        b6.a aVar = new b6.a(6);
        Iterator it = new uk.a(new uk.e(aVar, new b7.u(23, aVar))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f21597a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        nk.k.e(str, "key");
        if (!this.f21600d.contains(str) && (num = (Integer) this.f21598b.remove(str)) != null) {
            this.f21597a.remove(num);
        }
        this.f21601e.remove(str);
        LinkedHashMap linkedHashMap = this.f21602f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbA = h.A("Dropping pending result for request ", str, ": ");
            sbA.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbA.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((f.a) com.bumptech.glide.c.o(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f21599c;
        f.g gVar = (f.g) linkedHashMap2.get(str);
        if (gVar != null) {
            ArrayList arrayList = gVar.f23590b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                gVar.f23589a.b((androidx.lifecycle.y) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
