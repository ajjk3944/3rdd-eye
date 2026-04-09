package r7;

import H6.I;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.util.ChooserReceiver;
import kotlin.KotlinVersion;
import t4.C5606d;
import t4.InterfaceC5604b;
import u4.InterfaceC5634c;

/* compiled from: TransientView.kt */
/* loaded from: classes.dex */
public final class s {
    public static float a(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static InterfaceC5604b c(Activity activity) {
        I i;
        synchronized (C5606d.class) {
            try {
                if (C5606d.f46403c == null) {
                    Context applicationContext = activity.getApplicationContext();
                    if (applicationContext != null) {
                        activity = applicationContext;
                    }
                    C5606d.f46403c = new I(new A3.c(activity, 7));
                }
                i = C5606d.f46403c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (InterfaceC5604b) ((InterfaceC5634c) i.f2053c).zza();
    }

    public static int d(float f10, int i, int i10) {
        if (i == i10 || f10 <= 0.0f) {
            return i;
        }
        if (f10 >= 1.0f) {
            return i10;
        }
        float f11 = ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f12 = ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f13 = ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f14 = ((i10 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f15 = ((i10 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f16 = ((i10 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float fA = a(f12);
        float fA2 = a(f13);
        float fA3 = a((i & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float fA4 = a(f15);
        float fA5 = a(f16);
        float fA6 = a((i10 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float fE = com.google.android.gms.measurement.internal.a.e(f14, f11, f10, f11);
        float fE2 = com.google.android.gms.measurement.internal.a.e(fA4, fA, f10, fA);
        float fE3 = com.google.android.gms.measurement.internal.a.e(fA5, fA2, f10, fA2);
        float fE4 = com.google.android.gms.measurement.internal.a.e(fA6, fA3, f10, fA3);
        float fB = b(fE2) * 255.0f;
        float fB2 = b(fE3) * 255.0f;
        return Math.round(b(fE4) * 255.0f) | (Math.round(fB) << 16) | (Math.round(fE * 255.0f) << 24) | (Math.round(fB2) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(View view) {
        kotlin.jvm.internal.l.f(view, "<this>");
        if (!(view instanceof r)) {
            return false;
        }
        if (((r) view).g()) {
            return true;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            return e(viewGroup);
        }
        return false;
    }

    public void f(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + context.getPackageName());
        String string = context.getString(R.string.ph_share_app);
        kotlin.jvm.internal.l.e(string, "getString(...)");
        context.startActivity(Intent.createChooser(intent, string, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) ChooserReceiver.class), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728).getIntentSender()));
    }
}
