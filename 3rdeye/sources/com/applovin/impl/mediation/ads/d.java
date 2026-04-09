package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1781n;
import com.applovin.impl.g4;
import com.applovin.impl.mediation.h;
import com.applovin.impl.r4;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f20301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20305g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f20306h;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Activity activity, Object obj4, Object obj5, int i) {
        this.f20300b = i;
        this.f20302d = obj;
        this.f20303e = obj2;
        this.f20304f = obj3;
        this.f20301c = activity;
        this.f20305g = obj4;
        this.f20306h = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20300b) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f20305g;
                AbstractC1781n abstractC1781n = (AbstractC1781n) this.f20306h;
                ((MaxFullscreenAdImpl) this.f20302d).a((String) this.f20303e, (String) this.f20304f, this.f20301c, viewGroup, abstractC1781n);
                break;
            default:
                g4 g4Var = (g4) this.f20306h;
                ((h) this.f20302d).a((MaxSignalProvider) this.f20303e, (MaxAdapterSignalCollectionParameters) this.f20304f, this.f20301c, (r4) this.f20305g, g4Var);
                break;
        }
    }
}
