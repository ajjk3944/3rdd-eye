package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mz implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14075b;

    public /* synthetic */ mz(int i4, Object obj) {
        this.f14074a = i4;
        this.f14075b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f14074a) {
            case 0:
                ((JsResult) this.f14075b).cancel();
                break;
            case 1:
                ((JsPromptResult) this.f14075b).cancel();
                break;
            default:
                xa.i iVar = (xa.i) this.f14075b;
                if (iVar != null) {
                    iVar.m();
                    break;
                }
                break;
        }
    }
}
