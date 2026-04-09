package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class us implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17308b;

    public /* synthetic */ us(int i4, Object obj) {
        this.f17307a = i4;
        this.f17308b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) throws JSONException {
        switch (this.f17307a) {
            case 0:
                ((vs) this.f17308b).y("User canceled the download.");
                break;
            default:
                ((JsPromptResult) this.f17308b).cancel();
                break;
        }
    }
}
