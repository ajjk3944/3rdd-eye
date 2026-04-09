package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.d40;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.hf0;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.sz;
import com.yandex.mobile.ads.impl.xv0;
import java.lang.reflect.Constructor;
import java.util.UUID;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class S1 implements nr0.a, d40.b, g60.c, em.a, sr, di0.a, sz.a.InterfaceC0419a, hf0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24253b;

    public /* synthetic */ S1(int i) {
        this.f24253b = i;
    }

    public static void b(StringBuilder sb, String str, boolean z10, String str2, boolean z11) {
        sb.append(str);
        sb.append(z10);
        sb.append(str2);
        sb.append(z11);
    }

    @Override // com.yandex.mobile.ads.impl.g60.c
    public g60 a(UUID uuid) {
        return mc0.b(uuid);
    }

    @Override // com.yandex.mobile.ads.impl.sr
    public void accept(Object obj) {
        ((c40.a) obj).a();
    }

    @Override // com.yandex.mobile.ads.impl.em.a
    public em fromBundle(Bundle bundle) {
        switch (this.f24253b) {
            case 4:
                return mf0.b(bundle);
            default:
                return xv0.h.a(bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        m60.c((bi1.b) obj);
    }

    @Override // com.yandex.mobile.ads.impl.d40.b
    public void release() {
        Y.a();
    }

    @Override // com.yandex.mobile.ads.impl.hf0.a
    public Object a(String str) {
        return tc1.b(str);
    }

    @Override // com.yandex.mobile.ads.impl.sz.a.InterfaceC0419a
    public Constructor a() {
        return sz.b();
    }

    @Override // com.yandex.mobile.ads.impl.di0.a
    public boolean a(int i, int i10, int i11, int i12, int i13) {
        return q11.a(i, i10, i11, i12, i13);
    }
}
