package r3;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.AbstractActivityC3999j;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC4279h;
import org.snmp4j.util.SnmpConfigurator;
import q3.AbstractC7420a;
import q3.AbstractC7421b;
import s1.k;
import s3.AbstractC7884A;
import s3.AbstractC7901p;
import w3.AbstractC8255a;

/* renamed from: r3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7567e extends C7568f {

    /* renamed from: c, reason: collision with root package name */
    private String f60084c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f60082e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final C7567e f60083f = new C7567e();

    /* renamed from: d, reason: collision with root package name */
    public static final int f60081d = C7568f.f60085a;

    public static C7567e n() {
        return f60083f;
    }

    @Override // r3.C7568f
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // r3.C7568f
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // r3.C7568f
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // r3.C7568f
    public int g(Context context) {
        return super.g(context);
    }

    @Override // r3.C7568f
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // r3.C7568f
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog l(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return q(activity, i10, s3.D.b(activity, b(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent m(Context context, C7564b c7564b) {
        return c7564b.g() ? c7564b.f() : c(context, c7564b.b(), 0);
    }

    public boolean o(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogL = l(activity, i10, i11, onCancelListener);
        if (dialogL == null) {
            return false;
        }
        t(activity, dialogL, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void p(Context context, int i10) throws Resources.NotFoundException {
        u(context, i10, null, d(context, i10, 0, SnmpConfigurator.O_CONTEXT_NAME));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Dialog q(Context context, int i10, s3.D d10, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC7884A.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = AbstractC7884A.b(context, i10);
        if (strB != null) {
            if (d10 == null) {
                d10 = onClickListener;
            }
            builder.setPositiveButton(strB, d10);
        }
        String strF = AbstractC7884A.f(context, i10);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog r(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC7884A.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        t(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final com.google.android.gms.common.api.internal.G s(Context context, com.google.android.gms.common.api.internal.F f10) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        com.google.android.gms.common.api.internal.G g10 = new com.google.android.gms.common.api.internal.G(f10);
        A3.f.o(context, g10, intentFilter);
        g10.a(context);
        if (i(context, "com.google.android.gms")) {
            return g10;
        }
        f10.a();
        g10.b();
        return null;
    }

    final void t(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC3999j) {
                k.R1(dialog, onCancelListener).Q1(((AbstractActivityC3999j) activity).v0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC7565c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void u(Context context, int i10, String str, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            v(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = AbstractC7884A.e(context, i10);
        String strD = AbstractC7884A.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC7901p.l(context.getSystemService("notification"));
        k.d dVarU = new k.d(context).o(true).e(true).l(strE).u(new k.b().h(strD));
        if (com.google.android.gms.common.util.h.c(context)) {
            AbstractC7901p.o(com.google.android.gms.common.util.k.b());
            dVarU.t(context.getApplicationInfo().icon).r(2);
            if (com.google.android.gms.common.util.h.d(context)) {
                dVarU.a(AbstractC7420a.f58366a, resources.getString(AbstractC7421b.f58381o), pendingIntent);
            } else {
                dVarU.j(pendingIntent);
            }
        } else {
            dVarU.t(R.drawable.stat_sys_warning).v(resources.getString(AbstractC7421b.f58374h)).x(System.currentTimeMillis()).j(pendingIntent).k(strD);
        }
        if (com.google.android.gms.common.util.k.d()) {
            AbstractC7901p.o(com.google.android.gms.common.util.k.d());
            synchronized (f60082e) {
                str2 = this.f60084c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(AbstractC7421b.f58373g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVarU.g(str2);
        }
        Notification notificationB = dVarU.b();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            AbstractC7570h.f60089b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationB);
    }

    final void v(Context context) {
        new l(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean w(Activity activity, InterfaceC4279h interfaceC4279h, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogQ = q(activity, i10, s3.D.c(interfaceC4279h, b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogQ == null) {
            return false;
        }
        t(activity, dialogQ, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean x(Context context, C7564b c7564b, int i10) throws Resources.NotFoundException {
        PendingIntent pendingIntentM;
        if (AbstractC8255a.a(context) || (pendingIntentM = m(context, c7564b)) == null) {
            return false;
        }
        u(context, c7564b.b(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentM, i10, true), A3.g.f279a | 134217728));
        return true;
    }
}
