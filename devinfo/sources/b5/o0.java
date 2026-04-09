package b5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.liuzh.deviceinfo.pro.account.login.LogInActivity;
import com.liuzh.deviceinfo.pro.account.register.RegisterActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o0 extends ci.b {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1846k;

    public /* synthetic */ o0(int i4) {
        this.f1846k = i4;
    }

    @Override // ci.b
    public final Intent i(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f1846k) {
            case 0:
                f.i iVar = (f.i) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = iVar.f23596b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = iVar.f23595a;
                        nk.k.e(intentSender, "intentSender");
                        iVar = new f.i(intentSender, null, iVar.f23597c, iVar.f23598d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
                if (u0.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                Intent intentPutExtra = new Intent(context, (Class<?>) LogInActivity.class).putExtra("key.show_register_entrance", ((Boolean) obj).booleanValue());
                nk.k.d(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            case 2:
                String str = (String) obj;
                nk.k.e(str, "input");
                Intent intentPutExtra2 = new Intent("android.intent.action.CREATE_DOCUMENT").setType("*/*").putExtra("android.intent.extra.TITLE", str);
                nk.k.d(intentPutExtra2, "putExtra(...)");
                return intentPutExtra2;
            case 3:
                String[] strArr = (String[]) obj;
                nk.k.e(strArr, "input");
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                nk.k.d(intentPutExtra3, "putExtra(...)");
                return intentPutExtra3;
            case 4:
                String str2 = (String) obj;
                nk.k.e(str2, "input");
                Intent intentPutExtra4 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str2});
                nk.k.d(intentPutExtra4, "putExtra(...)");
                return intentPutExtra4;
            case 5:
                Intent intent3 = (Intent) obj;
                nk.k.e(intent3, "input");
                return intent3;
            case 6:
                f.i iVar2 = (f.i) obj;
                nk.k.e(iVar2, "input");
                Intent intentPutExtra5 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar2);
                nk.k.d(intentPutExtra5, "putExtra(...)");
                return intentPutExtra5;
            default:
                Intent intentPutExtra6 = new Intent(context, (Class<?>) RegisterActivity.class).putExtra("key.show_login_entrance", ((Boolean) obj).booleanValue());
                nk.k.d(intentPutExtra6, "putExtra(...)");
                return intentPutExtra6;
        }
    }

    @Override // ci.b
    public jf.c p(Context context, Object obj) {
        switch (this.f1846k) {
            case 2:
                nk.k.e((String) obj, "input");
                return null;
            case 3:
                String[] strArr = (String[]) obj;
                nk.k.e(strArr, "input");
                if (strArr.length == 0) {
                    return new jf.c(17, zj.t.f38318a);
                }
                for (String str : strArr) {
                    if (wd.b.c(context, str) != 0) {
                        return null;
                    }
                }
                int iH = zj.w.H(strArr.length);
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new jf.c(17, linkedHashMap);
            case 4:
                String str3 = (String) obj;
                nk.k.e(str3, "input");
                if (wd.b.c(context, str3) != 0) {
                    return null;
                }
                return new jf.c(17, Boolean.TRUE);
            default:
                return super.p(context, obj);
        }
    }

    @Override // ci.b
    public final Object v(Intent intent, int i4) {
        switch (this.f1846k) {
            case 0:
                return new f.a(intent, i4);
            case 1:
                return yj.u.f37649a;
            case 2:
                if (i4 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 3:
                if (i4 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i10 == 0));
                        }
                        ArrayList arrayListY = zj.m.Y(stringArrayExtra);
                        Iterator it = arrayListY.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(zj.o.T(arrayListY, 10), zj.o.T(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new yj.i(it.next(), it2.next()));
                        }
                        return zj.w.K(arrayList2);
                    }
                }
                return zj.t.f38318a;
            case 4:
                if (intent == null || i4 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z3 = false;
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            if (intArrayExtra2[i11] == 0) {
                                z3 = true;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case 5:
                return new f.a(intent, i4);
            case 6:
                return new f.a(intent, i4);
            default:
                return Boolean.valueOf(i4 == -1);
        }
    }
}
