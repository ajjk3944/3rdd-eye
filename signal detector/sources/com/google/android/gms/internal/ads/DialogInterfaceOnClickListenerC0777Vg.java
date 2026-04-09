package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.Vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0777Vg implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsResult f12041b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0777Vg(JsResult jsResult, int i) {
        this.f12040a = i;
        this.f12041b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f12040a) {
            case 0:
                this.f12041b.cancel();
                break;
            default:
                this.f12041b.confirm();
                break;
        }
    }
}
