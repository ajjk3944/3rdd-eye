package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lh1;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class tg0 extends v32 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ sg0 f33583e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ zg0 f33584f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(String str, sg0 sg0Var, zg0 zg0Var) {
        super(str, true);
        this.f33583e = sg0Var;
        this.f33584f = zg0Var;
    }

    @Override // com.yandex.mobile.ads.impl.v32
    public final long e() {
        try {
            this.f33583e.e().a(this.f33584f);
            return -1L;
        } catch (IOException e4) {
            int i = lh1.f30001c;
            lh1 lh1VarA = lh1.a.a();
            String str = "Http2Connection.Listener failure for " + this.f33583e.c();
            lh1VarA.getClass();
            lh1.a(4, str, e4);
            try {
                this.f33584f.a(o50.f31187e, e4);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
