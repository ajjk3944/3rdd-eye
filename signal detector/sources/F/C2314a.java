package f;

import G.c;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import c5.C0407d;
import d4.h;
import d5.l;
import d5.t;
import d5.v;
import e.C2284a;
import e.C2292i;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k0.K;
import q5.i;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2314a extends R2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19977e;

    public /* synthetic */ C2314a(int i) {
        this.f19977e = i;
    }

    @Override // R2.a
    public final Intent e(AbstractActivityC2349g abstractActivityC2349g, Object obj) {
        Bundle bundleExtra;
        switch (this.f19977e) {
            case 0:
                String str = (String) obj;
                i.e(str, "input");
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
                i.d(type, "Intent(Intent.ACTION_GET…          .setType(input)");
                return type;
            case 1:
                String[] strArr = (String[]) obj;
                i.e(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                i.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 2:
                String str2 = (String) obj;
                i.e(str2, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str2});
                i.d(intentPutExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra2;
            case 3:
                Intent intent = (Intent) obj;
                i.e(intent, "input");
                return intent;
            case 4:
                C2292i c2292i = (C2292i) obj;
                i.e(c2292i, "input");
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c2292i);
                i.d(intentPutExtra3, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return intentPutExtra3;
            default:
                C2292i c2292i2 = (C2292i) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = c2292i2.f19854b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c2292i2 = new C2292i(c2292i2.f19853a, null, c2292i2.f19855c, c2292i2.f19856d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c2292i2);
                if (K.H(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    @Override // R2.a
    public h q(AbstractActivityC2349g abstractActivityC2349g, Object obj) {
        switch (this.f19977e) {
            case 0:
                i.e((String) obj, "input");
                return null;
            case 1:
                String[] strArr = (String[]) obj;
                i.e(strArr, "input");
                if (strArr.length == 0) {
                    return new h(1, t.f19825a);
                }
                for (String str : strArr) {
                    if (c.a(abstractActivityC2349g, str) != 0) {
                        return null;
                    }
                }
                int iJ = v.J(strArr.length);
                if (iJ < 16) {
                    iJ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new h(1, linkedHashMap);
            case 2:
                String str3 = (String) obj;
                i.e(str3, "input");
                if (c.a(abstractActivityC2349g, str3) != 0) {
                    return null;
                }
                return new h(1, Boolean.TRUE);
            default:
                return super.q(abstractActivityC2349g, obj);
        }
    }

    @Override // R2.a
    public final Object x(Intent intent, int i) {
        switch (this.f19977e) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i3 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(l.P(arrayList2), l.P(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new C0407d(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (intent == null || i != -1) {
                    break;
                } else {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z6 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 < length) {
                                if (intArrayExtra2[i6] == 0) {
                                    z6 = true;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return new C2284a(intent, i);
    }
}
