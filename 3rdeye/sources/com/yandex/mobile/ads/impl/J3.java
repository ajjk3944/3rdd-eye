package com.yandex.mobile.ads.impl;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class J3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24155c;

    public /* synthetic */ J3(Object obj, int i) {
        this.f24154b = i;
        this.f24155c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24154b) {
            case 0:
                sk0.a((sk0) this.f24155c, view);
                break;
            default:
                C4201t0.b((C4201t0) this.f24155c, view);
                break;
        }
    }
}
