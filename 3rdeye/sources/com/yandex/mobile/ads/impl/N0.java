package com.yandex.mobile.ads.impl;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class N0 implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24201c;

    public /* synthetic */ N0(Object obj, int i) {
        this.f24200b = i;
        this.f24201c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f24200b) {
            case 0:
                h10.a((h10) this.f24201c, dialogInterface);
                break;
            default:
                u20.a((u20) this.f24201c, dialogInterface);
                break;
        }
    }
}
