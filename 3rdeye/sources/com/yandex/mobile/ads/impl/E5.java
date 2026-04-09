package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.nr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class E5 implements nr0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ed.a f24105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h60 f24106d;

    public /* synthetic */ E5(ed.a aVar, h60 h60Var, int i) {
        this.f24104b = i;
        this.f24105c = aVar;
        this.f24106d = h60Var;
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public final void invoke(Object obj) {
        ed edVar = (ed) obj;
        switch (this.f24104b) {
            case 0:
                ed.a aVar = this.f24105c;
                h60 h60Var = this.f24106d;
                edVar.getClass();
                break;
            default:
                zy.a(this.f24105c, (sh1) this.f24106d, edVar);
                break;
        }
    }
}
