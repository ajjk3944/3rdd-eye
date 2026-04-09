package c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3007b;

    public /* synthetic */ e(l lVar, int i10) {
        this.f3006a = i10;
        this.f3007b = lVar;
    }

    @Override // e.a
    public final void a() {
        switch (this.f3006a) {
            case 0:
                l lVar = this.f3007b;
                Bundle bundleK = ((io.sentry.t) lVar.f3031x.f11197d).k("android:support:activity-result");
                if (bundleK != null) {
                    g gVar = lVar.F;
                    HashMap map = gVar.f3013b;
                    HashMap map2 = gVar.f3012a;
                    Bundle bundle = gVar.f3018g;
                    ArrayList<Integer> integerArrayList = bundleK.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleK.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        gVar.f3015d = bundleK.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(bundleK.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                            String str = stringArrayList.get(i10);
                            if (map.containsKey(str)) {
                                Integer num = (Integer) map.remove(str);
                                if (!bundle.containsKey(str)) {
                                    map2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i10);
                            num2.intValue();
                            String str2 = stringArrayList.get(i10);
                            map2.put(num2, str2);
                            gVar.f3013b.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                o4.x xVar = (o4.x) ((i.j) this.f3007b).N.f10199d;
                xVar.f18880y.b(xVar, xVar, null);
                break;
        }
    }
}
