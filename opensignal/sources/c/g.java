package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3012a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3013b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3014c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3015d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f3016e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3017f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f3018g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f3019h;

    public g(l lVar) {
        this.f3019h = lVar;
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f3012a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        f.e eVar = (f.e) this.f3016e.get(str);
        if (eVar != null) {
            f.a aVar = eVar.f8377a;
            if (this.f3015d.contains(str)) {
                aVar.a(eVar.f8378b.D(i11, intent));
                this.f3015d.remove(str);
                return true;
            }
        }
        this.f3017f.remove(str);
        this.f3018g.putParcelable(str, new ActivityResult(i11, intent));
        return true;
    }

    public final void b(int i10, dr.a aVar, Object obj) throws IntentSender.SendIntentException {
        Bundle bundleExtra;
        int i11;
        l lVar = this.f3019h;
        g.a aVarZ = aVar.z(lVar, obj);
        if (aVarZ != null) {
            new Handler(Looper.getMainLooper()).post(new f(this, i10, aVarZ, 0));
            return;
        }
        Intent intentI = aVar.i(lVar, obj);
        if (intentI.getExtras() != null && intentI.getExtras().getClassLoader() == null) {
            intentI.setExtrasClassLoader(lVar.getClassLoader());
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
            g3.b.e(i10, lVar, stringArrayExtra);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentI.getAction())) {
            lVar.startActivityForResult(intentI, i10, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentI.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i11 = i10;
        } catch (IntentSender.SendIntentException e4) {
            e = e4;
            i11 = i10;
        }
        try {
            lVar.startIntentSenderForResult(intentSenderRequest.f919a, i11, intentSenderRequest.f920d, intentSenderRequest.f921g, intentSenderRequest.f922r, 0, bundle);
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            new Handler(Looper.getMainLooper()).post(new f(this, i11, e, 1));
        }
    }

    public final f.d c(String str, dr.a aVar, f.a aVar2) {
        d(str);
        this.f3016e.put(str, new f.e(aVar2, aVar));
        HashMap map = this.f3017f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            aVar2.a(obj);
        }
        Bundle bundle = this.f3018g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            aVar2.a(aVar.D(activityResult.f917a, activityResult.f918d));
        }
        return new f.d(this, str, aVar, 1);
    }

    public final void d(String str) {
        HashMap map = this.f3013b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iE = fr.d.f9050a.e(2147418112);
        while (true) {
            int i10 = iE + 65536;
            Integer numValueOf = Integer.valueOf(i10);
            HashMap map2 = this.f3012a;
            if (!map2.containsKey(numValueOf)) {
                map2.put(Integer.valueOf(i10), str);
                map.put(str, Integer.valueOf(i10));
                return;
            }
            iE = fr.d.f9050a.e(2147418112);
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.f3015d.contains(str) && (num = (Integer) this.f3013b.remove(str)) != null) {
            this.f3012a.remove(num);
        }
        this.f3016e.remove(str);
        HashMap map = this.f3017f;
        if (map.containsKey(str)) {
            StringBuilder sbU = c7.a.u("Dropping pending result for request ", str, ": ");
            sbU.append(map.get(str));
            e0.p("ActivityResultRegistry", sbU.toString());
            map.remove(str);
        }
        Bundle bundle = this.f3018g;
        if (bundle.containsKey(str)) {
            StringBuilder sbU2 = c7.a.u("Dropping pending result for request ", str, ": ");
            sbU2.append(bundle.getParcelable(str));
            e0.p("ActivityResultRegistry", sbU2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f3014c;
        f.f fVar = (f.f) map2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f8380b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f8379a.m1((androidx.lifecycle.t) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
