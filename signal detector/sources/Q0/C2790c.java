package q0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o4.AbstractC2763b;

@K("activity")
/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2790c extends L {

    /* renamed from: c, reason: collision with root package name */
    public final Context f22955c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f22956d;

    public C2790c(Context context) {
        Object next;
        this.f22955c = context;
        Iterator it = x5.h.L(context, C2789b.f22947c).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f22956d = (Activity) next;
    }

    @Override // q0.L
    public final v a() {
        return new C2788a(this);
    }

    @Override // q0.L
    public final v c(v vVar, Bundle bundle, B b5) {
        Intent intent;
        int intExtra;
        C2788a c2788a = (C2788a) vVar;
        if (c2788a.f22945k == null) {
            throw new IllegalStateException(AbstractC2763b.d(c2788a.f23043h, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
        }
        Intent intent2 = new Intent(c2788a.f22945k);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = c2788a.f22946l;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f22956d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (b5 != null && b5.f22908a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c2788a.f23043h);
        Context context = this.f22955c;
        Resources resources = context.getResources();
        if (b5 != null) {
            int i = b5.f22915h;
            int i3 = b5.i;
            if ((i <= 0 || !q5.i.a(resources.getResourceTypeName(i), "animator")) && (i3 <= 0 || !q5.i.a(resources.getResourceTypeName(i3), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i3);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i3) + " when launching " + c2788a);
            }
        }
        context.startActivity(intent2);
        if (b5 == null || activity == null) {
            return null;
        }
        int i6 = b5.f22913f;
        int i7 = b5.f22914g;
        if ((i6 <= 0 || !q5.i.a(resources.getResourceTypeName(i6), "animator")) && (i7 <= 0 || !q5.i.a(resources.getResourceTypeName(i7), "animator"))) {
            if (i6 < 0 && i7 < 0) {
                return null;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            activity.overridePendingTransition(i6, i7 >= 0 ? i7 : 0);
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i6) + " and exit resource " + resources.getResourceName(i7) + "when launching " + c2788a);
        return null;
    }

    @Override // q0.L
    public final boolean j() {
        Activity activity = this.f22956d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
