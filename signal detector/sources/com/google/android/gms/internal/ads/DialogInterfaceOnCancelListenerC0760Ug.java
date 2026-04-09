package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import s2.BinderC2894d;

/* renamed from: com.google.android.gms.internal.ads.Ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0760Ug implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11709b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0760Ug(int i, Object obj) {
        this.f11708a = i;
        this.f11709b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f11708a) {
            case 0:
                ((JsResult) this.f11709b).cancel();
                break;
            case 1:
                ((JsPromptResult) this.f11709b).cancel();
                break;
            default:
                BinderC2894d binderC2894d = (BinderC2894d) this.f11709b;
                if (binderC2894d != null) {
                    binderC2894d.z();
                    break;
                }
                break;
        }
    }
}
