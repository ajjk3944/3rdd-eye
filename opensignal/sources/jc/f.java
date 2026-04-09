package jc;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f13595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f13596b;

    public f(a aVar, Bundle bundle) {
        this.f13595a = bundle;
        Objects.requireNonNull(aVar);
        this.f13596b = aVar;
    }

    @Override // jc.j
    public final int a() {
        return 1;
    }

    @Override // jc.j
    public final void b() {
        this.f13596b.f13586a.j(this.f13595a);
    }
}
