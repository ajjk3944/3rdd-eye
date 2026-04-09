package j1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.location.Location;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.widget.TextView;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import java.util.Locale;
import je.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27058a;

    public /* synthetic */ q(Object obj) {
        this.f27058a = obj;
    }

    public static String c(double d10) {
        return String.format(Locale.US, "%.2f", Double.valueOf(d10));
    }

    public void a(Location location) {
        qg.d dVar = (qg.d) this.f27058a;
        TextView textView = dVar.f32334c;
        TextView textView2 = (TextView) dVar.f32342m;
        TextView textView3 = dVar.f32333b;
        TextView textView4 = (TextView) dVar.f32341l;
        TextView textView5 = dVar.f32335d;
        if (location == null) {
            return;
        }
        dVar.g.setText(location.getLongitude() + DeviceInfoApp.f21145f.getString(R.string.degree_icon));
        dVar.f32337f.setText(location.getLatitude() + DeviceInfoApp.f21145f.getString(R.string.degree_icon));
        dVar.f32332a.setText(com.liuzh.deviceinfo.utilities.d.e(location.getAltitude()));
        float speed = location.getSpeed();
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        if (com.liuzh.deviceinfo.utilities.f.f21257c.getInt("distance_unit", 0) == 0) {
            textView4.setText(c((speed / 1000.0f) * 60.0f * 60.0f).concat(" km/h") + " = " + c(speed).concat(" m/s"));
        } else {
            textView4.setText(c((((speed * 60.0f) * 60.0f) * 1.0936d) / 1760.0d).concat(" mile/h"));
        }
        if (location.hasBearing()) {
            textView3.setText(c(location.getBearing()) + DeviceInfoApp.f21145f.getString(R.string.degree_icon));
        } else {
            textView3.setText("");
        }
        boolean z3 = com.liuzh.deviceinfo.utilities.d.f21253b;
        if (z3 && location.hasVerticalAccuracy() && location.hasAccuracy()) {
            textView5.setText(com.liuzh.deviceinfo.utilities.d.e(location.getAccuracy()) + " / " + com.liuzh.deviceinfo.utilities.d.e(location.getVerticalAccuracyMeters()));
        } else if (location.hasAccuracy()) {
            textView5.setText(com.liuzh.deviceinfo.utilities.d.e(location.getAccuracy()) + " / -");
        } else {
            textView5.setText("- / -");
        }
        if (z3) {
            if (location.hasSpeedAccuracy()) {
                textView2.setText(com.liuzh.deviceinfo.utilities.d.e(location.getSpeedAccuracyMetersPerSecond()) + "/s");
            } else {
                textView2.setText(R.string.unknown);
            }
            if (!location.hasBearingAccuracy()) {
                textView.setText(R.string.unknown);
                return;
            }
            textView.setText(c(location.getBearingAccuracyDegrees()) + DeviceInfoApp.f21145f.getString(R.string.degree_icon));
        }
    }

    public void b() {
        ((AutofillManager) this.f27058a).commit();
    }

    public ApplicationInfo d(int i4, String str) {
        return ((Context) this.f27058a).getPackageManager().getApplicationInfo(str, i4);
    }

    public PackageInfo e(int i4, String str) {
        return ((Context) this.f27058a).getPackageManager().getPackageInfo(str, i4);
    }

    public boolean f() {
        String nameForUid;
        Context context = (Context) this.f27058a;
        if (Binder.getCallingUid() == Process.myUid()) {
            return ub.a.j(context);
        }
        if (!tb.b.g() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public void g(j2.r rVar, int i4, AutofillValue autofillValue) {
        ((AutofillManager) this.f27058a).notifyValueChanged(rVar, i4, autofillValue);
    }

    public void h(j2.r rVar, int i4, Rect rect) {
        ((AutofillManager) this.f27058a).notifyViewEntered(rVar, i4, rect);
    }

    public void i(j2.r rVar, int i4) {
        ((AutofillManager) this.f27058a).notifyViewExited(rVar, i4);
    }

    public void j(View view, int i4, boolean z3) {
        if (Build.VERSION.SDK_INT >= 27) {
            i.a(view, (AutofillManager) this.f27058a, i4, z3);
        }
    }

    public AutofillId k() {
        return y.b(this.f27058a);
    }

    public q(qg.d dVar) {
        this.f27058a = dVar;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iE = com.liuzh.deviceinfo.utilities.f.e();
        dVar.f32337f.setTextColor(iE);
        dVar.g.setTextColor(iE);
        dVar.f32332a.setTextColor(iE);
        ((TextView) dVar.f32340k).setTextColor(iE);
        ((TextView) dVar.f32341l).setTextColor(iE);
        TextView textView = (TextView) dVar.f32342m;
        textView.setTextColor(iE);
        ((TextView) dVar.f32339i).setTextColor(iE);
        ((TextView) dVar.f32343n).setTextColor(iE);
        dVar.f32336e.setTextColor(iE);
        dVar.f32335d.setTextColor(iE);
        ((TextView) dVar.j).setTextColor(iE);
        dVar.f32333b.setTextColor(iE);
        TextView textView2 = dVar.f32334c;
        textView2.setTextColor(iE);
        if (com.liuzh.deviceinfo.utilities.d.f21253b) {
            return;
        }
        ((View) textView.getParent()).setVisibility(8);
        ((View) textView2.getParent()).setVisibility(8);
    }
}
