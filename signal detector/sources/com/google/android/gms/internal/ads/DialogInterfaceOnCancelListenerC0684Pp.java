package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.HashMap;
import s2.BinderC2894d;

/* renamed from: com.google.android.gms.internal.ads.Pp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0684Pp implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinderC0718Rp f10515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC2894d f10516c;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0684Pp(BinderC0718Rp binderC0718Rp, BinderC2894d binderC2894d, int i) {
        this.f10514a = i;
        this.f10515b = binderC0718Rp;
        this.f10516c = binderC2894d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        switch (this.f10514a) {
            case 0:
                BinderC0718Rp binderC0718Rp = this.f10515b;
                binderC0718Rp.f11051e.b(binderC0718Rp.f11052f);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                binderC0718Rp.Q3(binderC0718Rp.f11052f, map, "dialog_click");
                BinderC2894d binderC2894d = this.f10516c;
                if (binderC2894d != null) {
                    binderC2894d.z();
                    break;
                }
                break;
            default:
                BinderC0718Rp binderC0718Rp2 = this.f10515b;
                binderC0718Rp2.f11051e.b(binderC0718Rp2.f11052f);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                binderC0718Rp2.Q3(binderC0718Rp2.f11052f, map2, "rtsdc");
                BinderC2894d binderC2894d2 = this.f10516c;
                if (binderC2894d2 != null) {
                    binderC2894d2.z();
                    break;
                }
                break;
        }
    }
}
