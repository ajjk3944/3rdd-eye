package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import java.util.HashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph0 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15007c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15008d;

    public /* synthetic */ ph0(qh0 qh0Var, Activity activity, xa.i iVar, int i4) {
        this.f15005a = i4;
        this.f15006b = qh0Var;
        this.f15007c = activity;
        this.f15008d = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) throws JSONException, Resources.NotFoundException {
        switch (this.f15005a) {
            case 0:
                qh0 qh0Var = (qh0) this.f15006b;
                Activity activity = (Activity) this.f15007c;
                xa.i iVar = (xa.i) this.f15008d;
                HashMap map = new HashMap();
                map.put("dialog_action", "confirm");
                qh0Var.n4(qh0Var.f15347f, "rtsdc", map);
                activity.startActivity(ua.j.C.f35264f.M(activity));
                qh0Var.l4();
                if (iVar != null) {
                    iVar.m();
                    break;
                }
                break;
            case 1:
                qh0 qh0Var2 = (qh0) this.f15006b;
                Activity activity2 = (Activity) this.f15007c;
                xa.i iVar2 = (xa.i) this.f15008d;
                qh0Var2.getClass();
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "confirm");
                qh0Var2.n4(qh0Var2.f15347f, "dialog_click", map2);
                qh0Var2.k4(activity2, iVar2);
                break;
            default:
                vs vsVar = (vs) this.f15008d;
                DownloadManager downloadManager = (DownloadManager) vsVar.f17698e.getSystemService("download");
                try {
                    String str = (String) this.f15006b;
                    String str2 = (String) this.f15007c;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    ya.f0 f0Var = ua.j.C.f35261c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    break;
                } catch (IllegalStateException unused) {
                    vsVar.y("Could not store picture.");
                }
        }
    }

    public ph0(vs vsVar, String str, String str2) {
        this.f15005a = 2;
        this.f15006b = str;
        this.f15007c = str2;
        this.f15008d = vsVar;
    }
}
