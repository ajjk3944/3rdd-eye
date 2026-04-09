package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2097r;
import com.yandex.mobile.ads.impl.aa2;
import com.yandex.mobile.ads.impl.me2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ql1 implements pc2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32243a;

    /* renamed from: b, reason: collision with root package name */
    private final List<pl1> f32244b;

    public ql1(Context context, mb2<?> videoAdInfo) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32243a = context.getApplicationContext();
        this.f32244b = a(videoAdInfo);
    }

    private static List a(mb2 mb2Var) {
        nu nuVarB = mb2Var.b();
        long jE = nuVarB.e();
        List<y52> listJ = nuVarB.j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if ("progress".equals(((y52) obj).a())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y52 y52Var = (y52) it.next();
            aa2 aa2VarB = y52Var.b();
            pl1 pl1Var = null;
            if (aa2VarB != null) {
                Long lValueOf = aa2.b.f24585b == aa2VarB.c() ? Long.valueOf((long) aa2VarB.d()) : aa2.b.f24586c == aa2VarB.c() ? Long.valueOf((long) ((aa2VarB.d() / 100) * jE)) : null;
                if (lValueOf != null) {
                    pl1Var = new pl1(y52Var.c(), lValueOf.longValue());
                }
            }
            if (pl1Var != null) {
                arrayList2.add(pl1Var);
            }
        }
        return C2097r.I0(arrayList2);
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        Iterator<pl1> it = this.f32244b.iterator();
        while (it.hasNext()) {
            pl1 next = it.next();
            if (next.a() <= j10) {
                me2.a aVar = me2.f30361c;
                Context context = this.f32243a;
                kotlin.jvm.internal.l.e(context, "context");
                aVar.a(context).a(next.b());
                it.remove();
            }
        }
    }
}
