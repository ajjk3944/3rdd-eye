package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.cz;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class g00 implements vo1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27497a;

    /* renamed from: b, reason: collision with root package name */
    private final a00 f27498b = new a00();

    /* renamed from: c, reason: collision with root package name */
    private cv0 f27499c = cv0.f25774a;

    public g00(Context context) {
        this.f27497a = context;
    }

    @Override // com.yandex.mobile.ads.impl.vo1
    public final so1[] a(Handler handler, if2 if2Var, oh ohVar, h42 h42Var, c01 c01Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jv0(this.f27497a, this.f27498b, this.f27499c, handler, if2Var));
        cz czVarA = new cz.e().a(kh.a(this.f27497a)).c().b().d().a();
        arrayList.add(new vu0(this.f27497a, this.f27498b, this.f27499c, handler, ohVar, czVarA));
        arrayList.add(new i42(h42Var, handler.getLooper()));
        arrayList.add(new d01(c01Var, handler.getLooper()));
        arrayList.add(new rn());
        return (so1[]) arrayList.toArray(new so1[0]);
    }
}
