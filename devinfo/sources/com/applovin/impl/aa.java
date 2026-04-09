package com.applovin.impl;

import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class aa implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3604b;

    public /* synthetic */ aa(int i4, Object obj) {
        this.f3603a = i4;
        this.f3604b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f3603a) {
            case 0:
                ((p3) this.f3604b).a(dialogInterface, i4);
                break;
            default:
                u0.b((Uri) this.f3604b, dialogInterface, i4);
                break;
        }
    }
}
