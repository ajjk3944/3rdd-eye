package com.applovin.impl.adview;

import android.webkit.WebView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19079c;

    public /* synthetic */ x(Object obj, int i) {
        this.f19078b = i;
        this.f19079c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19078b) {
            case 0:
                ((f) this.f19079c).f();
                break;
            case 1:
                ((WebView) this.f19079c).setVisibility(0);
                break;
            default:
                ((a) this.f19079c).r();
                break;
        }
    }
}
