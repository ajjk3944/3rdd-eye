package jc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f13597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflater f13598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f13599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f13600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f13601e;

    public g(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f13597a = frameLayout;
        this.f13598b = layoutInflater;
        this.f13599c = viewGroup;
        this.f13600d = bundle;
        Objects.requireNonNull(aVar);
        this.f13601e = aVar;
    }

    @Override // jc.j
    public final int a() {
        return 2;
    }

    @Override // jc.j
    public final void b() {
        FrameLayout frameLayout = this.f13597a;
        frameLayout.removeAllViews();
        frameLayout.addView(this.f13601e.f13586a.d(this.f13598b, this.f13599c, this.f13600d));
    }
}
