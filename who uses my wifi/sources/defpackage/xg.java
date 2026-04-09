package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class xg implements ej0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ xg(i5 i5Var, int i) {
        this.a = i;
        this.b = i5Var;
    }

    @Override // defpackage.ej0
    public final void a(ch chVar) {
        switch (this.a) {
            case 0:
                i30.m(chVar, "it");
                i5 i5Var = this.b;
                Bundle bundleE = ((vq2) i5Var.i.h).e("android:support:activity-result");
                if (bundleE != null) {
                    bh bhVar = i5Var.m;
                    LinkedHashMap linkedHashMap = bhVar.b;
                    LinkedHashMap linkedHashMap2 = bhVar.a;
                    Bundle bundle = bhVar.g;
                    ArrayList<Integer> integerArrayList = bundleE.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleE.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleE.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        bhVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = bundleE.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if ((linkedHashMap2 instanceof p40) && !(linkedHashMap2 instanceof q40)) {
                                    qb1.r(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        i30.l(num2, "get(...)");
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        i30.l(str2, "get(...)");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        bhVar.b.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
            default:
                kw kwVar = (kw) this.b.w.g;
                kwVar.z.b(kwVar, kwVar, null);
                return;
        }
    }
}
