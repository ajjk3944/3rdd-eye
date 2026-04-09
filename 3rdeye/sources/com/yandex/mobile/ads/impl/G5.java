package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.nr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class G5 implements nr0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ed.a f24126c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24127d;

    public /* synthetic */ G5(ed.a aVar, Object obj, int i) {
        this.f24125b = i;
        this.f24126c = aVar;
        this.f24127d = obj;
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public final void invoke(Object obj) {
        ed edVar = (ed) obj;
        switch (this.f24125b) {
            case 0:
                ed.a aVar = this.f24126c;
                edVar.getClass();
                break;
            case 1:
                zy.a(this.f24126c, (zv0) this.f24127d, edVar);
                break;
            default:
                ed.a aVar2 = this.f24126c;
                edVar.getClass();
                break;
        }
    }
}
