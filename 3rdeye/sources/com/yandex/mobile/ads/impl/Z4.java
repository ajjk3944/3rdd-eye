package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.nr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class Z4 implements nr0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ed.a f24345c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky f24346d;

    public /* synthetic */ Z4(ed.a aVar, ky kyVar, int i) {
        this.f24344b = i;
        this.f24345c = aVar;
        this.f24346d = kyVar;
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public final void invoke(Object obj) {
        ed edVar = (ed) obj;
        switch (this.f24344b) {
            case 0:
                ed.a aVar = this.f24345c;
                ky kyVar = this.f24346d;
                edVar.getClass();
                break;
            case 1:
                ed.a aVar2 = this.f24345c;
                ky kyVar2 = this.f24346d;
                edVar.getClass();
                break;
            default:
                zy.c(this.f24345c, this.f24346d, edVar);
                break;
        }
    }
}
