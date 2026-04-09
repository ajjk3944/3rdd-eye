package com.applovin.impl.sdk.ad;

import androidx.camera.view.PreviewView;
import com.applovin.impl.v4;
import r.InterfaceC5503a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC5503a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21080b;

    public /* synthetic */ g(Object obj, int i) {
        this.f21079a = i;
        this.f21080b = obj;
    }

    @Override // r.InterfaceC5503a
    public final Object apply(Object obj) {
        switch (this.f21079a) {
            case 0:
                return ((b) this.f21080b).d((v4) obj);
            case 1:
                return ((b) this.f21080b).j((v4) obj);
            default:
                androidx.camera.view.a aVar = (androidx.camera.view.a) this.f21080b;
                aVar.getClass();
                aVar.b(PreviewView.e.STREAMING);
                return null;
        }
    }
}
