package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a92;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class qz1 extends w61 {

    /* renamed from: f, reason: collision with root package name */
    private final z71 f32378f;

    /* renamed from: g, reason: collision with root package name */
    private final ew1 f32379g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz1(Context context, z71 nativeCompositeAd, q71 assetsValidator, ew1 sdkSettings, a8<?> adResponse) {
        super(context, assetsValidator, adResponse);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeCompositeAd, "nativeCompositeAd");
        kotlin.jvm.internal.l.f(assetsValidator, "assetsValidator");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f32378f = nativeCompositeAd;
        this.f32379g = sdkSettings;
    }

    @Override // com.yandex.mobile.ads.impl.w61
    public final a92 a(Context context, int i, boolean z10, boolean z11) {
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = this.f32379g.a(context);
        a92 a92VarA = (du1VarA == null || du1VarA.o0()) ? super.a(context, i, z10, z11) : new a92(a92.a.f24561c, null);
        if (a92VarA.b() == a92.a.f24561c) {
            List<h61> listE = this.f32378f.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE) {
                if (obj instanceof p81) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p81 p81Var = (p81) it.next();
                    ca1 nativeAdValidator = p81Var.f();
                    vb1 nativeVisualBlock = p81Var.g();
                    kotlin.jvm.internal.l.f(nativeAdValidator, "nativeAdValidator");
                    kotlin.jvm.internal.l.f(nativeVisualBlock, "nativeVisualBlock");
                    du1 du1VarA2 = this.f32379g.a(context);
                    boolean z12 = du1VarA2 == null || du1VarA2.o0();
                    Iterator<tx1> it2 = nativeVisualBlock.e().iterator();
                    while (it2.hasNext()) {
                        int iD = z12 ? it2.next().d() : i;
                        if ((z11 ? nativeAdValidator.b(context, iD) : nativeAdValidator.a(context, iD)).b() != a92.a.f24561c) {
                            break;
                        }
                    }
                }
            }
            a92.a aVar = a92.a.f24561c;
            return a92.a(a92VarA);
        }
        return a92VarA;
    }
}
