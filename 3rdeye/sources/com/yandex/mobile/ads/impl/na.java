package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a92;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class na extends ma {

    /* renamed from: f, reason: collision with root package name */
    private final z71 f30818f;

    /* renamed from: g, reason: collision with root package name */
    private final ew1 f30819g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private na(Context context, z71 nativeCompositeAd, q71 assetsValidator, Set<? extends String> rules, ew1 sdkSettings) {
        super(context, assetsValidator, rules);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeCompositeAd, "nativeCompositeAd");
        kotlin.jvm.internal.l.f(assetsValidator, "assetsValidator");
        kotlin.jvm.internal.l.f(rules, "rules");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        this.f30818f = nativeCompositeAd;
        this.f30819g = sdkSettings;
    }

    @Override // com.yandex.mobile.ads.impl.ma
    public final a92 a(Context context, int i, boolean z10, boolean z11) {
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = this.f30819g.a(context);
        a92 a92VarA = (du1VarA == null || du1VarA.o0()) ? super.a(context, i, z10, z11) : new a92(a92.a.f24561c, null);
        if (a92VarA.b() == a92.a.f24561c) {
            List<h61> listE = this.f30818f.e();
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
                    du1 du1VarA2 = this.f30819g.a(context);
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

    public /* synthetic */ na(Context context, z71 z71Var, q71 q71Var, Set set, ew1 ew1Var, int i) {
        this(context, z71Var, q71Var, set, ew1Var);
    }
}
