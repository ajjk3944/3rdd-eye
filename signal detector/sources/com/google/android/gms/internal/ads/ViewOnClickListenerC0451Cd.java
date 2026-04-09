package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0451Cd implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7627a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7628b;

    public /* synthetic */ ViewOnClickListenerC0451Cd(C2248zn c2248zn) {
        this.f7628b = c2248zn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7627a) {
            case 0:
                ((C0468Dd) this.f7628b).E(true);
                break;
            default:
                ((C2248zn) this.f7628b).f17949j.f22747b = true;
                break;
        }
    }

    public ViewOnClickListenerC0451Cd(C0468Dd c0468Dd) {
        Objects.requireNonNull(c0468Dd);
        this.f7628b = c0468Dd;
    }
}
