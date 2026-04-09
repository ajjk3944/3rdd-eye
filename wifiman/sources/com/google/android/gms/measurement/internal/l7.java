package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class l7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36586a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36587b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Bundle f36588c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ i7 f36589d;

    l7(i7 i7Var, String str, String str2, Bundle bundle) {
        this.f36586a = str;
        this.f36587b = str2;
        this.f36588c = bundle;
        this.f36589d = i7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36589d.f36542a.v((L) AbstractC7901p.l(this.f36589d.f36542a.I0().D(this.f36586a, this.f36587b, this.f36588c, "auto", this.f36589d.f36542a.zzb().a(), false, true)), this.f36586a);
    }
}
