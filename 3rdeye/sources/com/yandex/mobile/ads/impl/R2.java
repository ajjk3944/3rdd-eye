package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.yandex.mobile.ads.impl.n00;
import java.util.List;
import s1.ExecutorC5546b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class R2 implements n00.g.a, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24248d;

    public /* synthetic */ R2(boolean z10, Object obj, Object obj2) {
        this.f24247c = obj;
        this.f24248d = obj2;
        this.f24246b = z10;
    }

    @Override // com.yandex.mobile.ads.impl.n00.g.a
    public List a(int i, l52 l52Var, int[] iArr) {
        return ((n00) this.f24247c).a((n00.c) this.f24248d, this.f24246b, i, l52Var, iArr);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? n5.i.a((Context) this.f24247c, (Intent) this.f24248d, this.f24246b).continueWith(new ExecutorC5546b(), new com.google.android.gms.measurement.internal.a()) : task;
    }
}
