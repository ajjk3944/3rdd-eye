package jc;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f13591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f13592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f13593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f13594d;

    public e(a aVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f13591a = activity;
        this.f13592b = bundle;
        this.f13593c = bundle2;
        Objects.requireNonNull(aVar);
        this.f13594d = aVar;
    }

    @Override // jc.j
    public final int a() {
        return 0;
    }

    @Override // jc.j
    public final void b() {
        this.f13594d.f13586a.b(this.f13591a, this.f13592b, this.f13593c);
    }
}
