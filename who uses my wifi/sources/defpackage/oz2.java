package defpackage;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class oz2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ oz2(pz2 pz2Var, Activity activity, jh1 jh1Var, int i) {
        this.f = i;
        this.g = pz2Var;
        this.h = activity;
        this.i = jh1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException, IllegalAccessException, Resources.NotFoundException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        switch (this.f) {
            case 0:
                pz2 pz2Var = (pz2) this.g;
                Activity activity = (Activity) this.h;
                jh1 jh1Var = (jh1) this.i;
                HashMap map = new HashMap();
                map.put("dialog_action", "confirm");
                pz2Var.H3(pz2Var.k, "rtsdc", map);
                hg4.C.f.getClass();
                Intent intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
                activity.startActivity(intent);
                pz2Var.F3();
                if (jh1Var != null) {
                    jh1Var.y();
                    break;
                }
                break;
            case 1:
                pz2 pz2Var2 = (pz2) this.g;
                Activity activity2 = (Activity) this.h;
                jh1 jh1Var2 = (jh1) this.i;
                pz2Var2.getClass();
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "confirm");
                pz2Var2.H3(pz2Var2.k, "dialog_click", map2);
                pz2Var2.E3(activity2, jh1Var2);
                break;
            default:
                p82 p82Var = (p82) this.i;
                DownloadManager downloadManager = (DownloadManager) p82Var.i.getSystemService("download");
                try {
                    String str = (String) this.g;
                    String str2 = (String) this.h;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    lf4 lf4Var = hg4.C.c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    break;
                } catch (IllegalStateException unused) {
                    p82Var.G("Could not store picture.");
                }
        }
    }

    public oz2(p82 p82Var, String str, String str2) {
        this.f = 2;
        this.g = str;
        this.h = str2;
        this.i = p82Var;
    }
}
