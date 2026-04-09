package c;

import android.os.Bundle;
import d.InterfaceC2261a;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0382g implements InterfaceC2261a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f5829b;

    public /* synthetic */ C0382g(AbstractActivityC2349g abstractActivityC2349g, int i) {
        this.f5828a = i;
        this.f5829b = abstractActivityC2349g;
    }

    @Override // d.InterfaceC2261a
    public final void a(AbstractActivityC0389n abstractActivityC0389n) {
        switch (this.f5828a) {
            case 0:
                q5.i.e(abstractActivityC0389n, "it");
                AbstractActivityC2349g abstractActivityC2349g = this.f5829b;
                Bundle bundleC = ((F0.f) abstractActivityC2349g.f5857d.f139b).c("android:support:activity-result");
                if (bundleC != null) {
                    C0387l c0387l = abstractActivityC2349g.i;
                    LinkedHashMap linkedHashMap = c0387l.f5840b;
                    LinkedHashMap linkedHashMap2 = c0387l.f5839a;
                    Bundle bundle = c0387l.f5845g;
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            c0387l.f5842d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    q5.r.b(linkedHashMap2);
                                    linkedHashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            q5.i.d(num2, "rcs[i]");
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i);
                            q5.i.d(str2, "keys[i]");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            c0387l.f5840b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                k0.x xVar = (k0.x) this.f5829b.f20341I.f19807b;
                xVar.f21728l.b(xVar, xVar, null);
                break;
        }
    }
}
