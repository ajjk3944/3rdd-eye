package g;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.d;
import br.l;
import h3.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import mq.b0;
import mq.x;

/* loaded from: classes.dex */
public final class b extends dr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9122a;

    public /* synthetic */ b(int i10) {
        this.f9122a = i10;
    }

    @Override // dr.a
    public final Object D(int i10, Intent intent) {
        switch (this.f9122a) {
            case 0:
                if (i10 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i11 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i11 == 0));
                        }
                        break;
                    }
                }
                break;
        }
        return new ActivityResult(i10, intent);
    }

    @Override // dr.a
    public final Intent i(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f9122a) {
            case 0:
                String[] strArr = (String[]) obj;
                l.e(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                l.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 1:
                Intent intent = (Intent) obj;
                l.e(intent, "input");
                return intent;
            default:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = intentSenderRequest.f920d;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f919a, null, intentSenderRequest.f921g, intentSenderRequest.f922r);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (d.K(2)) {
                    intent2.toString();
                }
                return intent2;
        }
    }

    @Override // dr.a
    public a z(Context context, Object obj) {
        switch (this.f9122a) {
            case 0:
                String[] strArr = (String[]) obj;
                l.e(strArr, "input");
                if (strArr.length == 0) {
                    return new a(x.f16946a);
                }
                for (String str : strArr) {
                    if (c.a(context, str) != 0) {
                        return null;
                    }
                }
                int iP = b0.P(strArr.length);
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new a(linkedHashMap);
            default:
                return super.z(context, obj);
        }
    }
}
