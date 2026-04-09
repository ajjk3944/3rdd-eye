package b5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.j f1753b;

    public /* synthetic */ c0(d.j jVar, int i4) {
        this.f1752a = i4;
        this.f1753b = jVar;
    }

    @Override // e.a
    public final void a(d.j jVar) {
        switch (this.f1752a) {
            case 0:
                d0 d0Var = (d0) ((i.g) this.f1753b).f25291u.f27642b;
                d0Var.f1768d.b(d0Var, d0Var, null);
                break;
            default:
                nk.k.e(jVar, "it");
                d.j jVar2 = this.f1753b;
                Bundle bundleL = ((yb.i) jVar2.f21606d.f37324b).l("android:support:activity-result");
                if (bundleL != null) {
                    d.i iVar = jVar2.f21610i;
                    LinkedHashMap linkedHashMap = iVar.f21598b;
                    LinkedHashMap linkedHashMap2 = iVar.f21597a;
                    Bundle bundle = iVar.g;
                    ArrayList<Integer> integerArrayList = bundleL.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleL.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleL.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            iVar.f21600d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleL.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            String str = stringArrayList.get(i4);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    nk.x.c(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i4);
                            nk.k.d(num2, "get(...)");
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i4);
                            nk.k.d(str2, "get(...)");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            iVar.f21598b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
        }
    }
}
