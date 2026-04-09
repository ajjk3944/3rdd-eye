package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import com.yandex.mobile.ads.impl.dy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class N2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24206d;

    public /* synthetic */ N2(int i, Object obj, Object obj2) {
        this.f24204b = i;
        this.f24205c = obj;
        this.f24206d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24204b) {
            case 0:
                mz0.b((mz0) this.f24205c, (dy.g) this.f24206d, view);
                break;
            default:
                qb1.a((qb1) this.f24205c, (CheckBox) this.f24206d, view);
                break;
        }
    }
}
