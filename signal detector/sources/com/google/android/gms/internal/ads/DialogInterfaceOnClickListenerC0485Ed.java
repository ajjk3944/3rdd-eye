package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0485Ed implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7971b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0485Ed(int i, Object obj) {
        this.f7970a = i;
        this.f7971b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        switch (this.f7970a) {
            case 0:
                ((C0502Fd) this.f7971b).z("User canceled the download.");
                break;
            default:
                ((JsPromptResult) this.f7971b).cancel();
                break;
        }
    }
}
