package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import java.util.HashMap;
import org.json.JSONException;
import s2.BinderC2894d;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Qp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0701Qp implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10709d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0701Qp(BinderC0718Rp binderC0718Rp, Activity activity, BinderC2894d binderC2894d, int i) {
        this.f10706a = i;
        this.f10707b = binderC0718Rp;
        this.f10708c = activity;
        this.f10709d = binderC2894d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException, Resources.NotFoundException {
        switch (this.f10706a) {
            case 0:
                BinderC0718Rp binderC0718Rp = (BinderC0718Rp) this.f10707b;
                Activity activity = (Activity) this.f10708c;
                BinderC2894d binderC2894d = (BinderC2894d) this.f10709d;
                HashMap map = new HashMap();
                map.put("dialog_action", "confirm");
                binderC0718Rp.Q3(binderC0718Rp.f11052f, map, "rtsdc");
                activity.startActivity(p2.j.f22785C.f22793f.s(activity));
                binderC0718Rp.O3();
                if (binderC2894d != null) {
                    binderC2894d.z();
                    break;
                }
                break;
            case 1:
                BinderC0718Rp binderC0718Rp2 = (BinderC0718Rp) this.f10707b;
                Activity activity2 = (Activity) this.f10708c;
                BinderC2894d binderC2894d2 = (BinderC2894d) this.f10709d;
                binderC0718Rp2.getClass();
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "confirm");
                binderC0718Rp2.Q3(binderC0718Rp2.f11052f, map2, "dialog_click");
                binderC0718Rp2.N3(activity2, binderC2894d2);
                break;
            default:
                C0502Fd c0502Fd = (C0502Fd) this.f10709d;
                DownloadManager downloadManager = (DownloadManager) c0502Fd.f8143d.getSystemService("download");
                try {
                    String str = (String) this.f10707b;
                    String str2 = (String) this.f10708c;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    C2911G c2911g = p2.j.f22785C.f22790c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    break;
                } catch (IllegalStateException unused) {
                    c0502Fd.z("Could not store picture.");
                }
        }
    }

    public DialogInterfaceOnClickListenerC0701Qp(C0502Fd c0502Fd, String str, String str2) {
        this.f10706a = 2;
        this.f10707b = str;
        this.f10708c = str2;
        this.f10709d = c0502Fd;
    }
}
