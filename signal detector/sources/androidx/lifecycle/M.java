package androidx.lifecycle;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import c5.C0407d;
import d5.AbstractC2283k;
import d5.C2280h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import q0.C2794g;
import q0.C2795h;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements F0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5197b;

    public /* synthetic */ M(int i, Object obj) {
        this.f5196a = i;
        this.f5197b = obj;
    }

    @Override // F0.e
    public final Bundle a() {
        Bundle bundle;
        int i = this.f5196a;
        Object obj = this.f5197b;
        switch (i) {
            case 0:
                return N.a((N) obj);
            case 1:
                return ((k0.K) obj).V();
            case 2:
                q0.z zVar = (q0.z) obj;
                LinkedHashMap linkedHashMap = zVar.f23066m;
                LinkedHashMap linkedHashMap2 = zVar.f23065l;
                C2280h c2280h = zVar.f23061g;
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : d5.v.L(zVar.f23074u.f22941a).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle bundleH = ((q0.L) entry.getValue()).h();
                    if (bundleH != null) {
                        arrayList.add(str);
                        bundle2.putBundle(str, bundleH);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
                }
                if (!c2280h.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[c2280h.f19820c];
                    Iterator<E> it = c2280h.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        parcelableArr[i3] = new C2795h((C2794g) it.next());
                        i3++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i6 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int iIntValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        iArr[i6] = iIntValue;
                        arrayList2.add(str2);
                        i6++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        C2280h c2280h2 = (C2280h) entry3.getValue();
                        arrayList3.add(str3);
                        Parcelable[] parcelableArr2 = new Parcelable[c2280h2.f19820c];
                        Iterator it2 = c2280h2.iterator();
                        int i7 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                AbstractC2283k.O();
                                throw null;
                            }
                            parcelableArr2[i7] = (C2795h) next;
                            i7 = i8;
                        }
                        bundle.putParcelableArray(A.f.l("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (zVar.f23060f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", zVar.f23060f);
                }
                if (bundle != null) {
                    return bundle;
                }
                Bundle bundle3 = Bundle.EMPTY;
                q5.i.d(bundle3, "EMPTY");
                return bundle3;
            default:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                q5.i.e(navHostFragment, "this$0");
                int i9 = navHostFragment.f5270m0;
                if (i9 != 0) {
                    return I5.b.c(new C0407d("android-support-nav:fragment:graphId", Integer.valueOf(i9)));
                }
                Bundle bundle4 = Bundle.EMPTY;
                q5.i.d(bundle4, "{\n                    Bu…e.EMPTY\n                }");
                return bundle4;
        }
    }
}
