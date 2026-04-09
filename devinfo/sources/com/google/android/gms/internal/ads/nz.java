package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nz implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsResult f14487b;

    public /* synthetic */ nz(JsResult jsResult, int i4) {
        this.f14486a = i4;
        this.f14487b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f14486a) {
            case 0:
                this.f14487b.cancel();
                break;
            default:
                this.f14487b.confirm();
                break;
        }
    }
}
