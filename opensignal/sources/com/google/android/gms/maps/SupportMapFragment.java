package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.b;
import jc.a;
import jc.c;
import jc.e;
import jc.f;
import jc.g;
import jc.i;
import uc.k;

/* loaded from: classes.dex */
public class SupportMapFragment extends b {

    /* renamed from: w0, reason: collision with root package name */
    public final k f5337w0 = new k(this);

    @Override // androidx.fragment.app.b
    public final void B(Activity activity) {
        this.f1410c0 = true;
        k kVar = this.f5337w0;
        kVar.f23537g = activity;
        kVar.e();
    }

    @Override // androidx.fragment.app.b
    public final void D(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.D(bundle);
            k kVar = this.f5337w0;
            kVar.getClass();
            kVar.d(bundle, new f(kVar, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k kVar = this.f5337w0;
        kVar.getClass();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        kVar.d(bundle, new g(kVar, frameLayout, layoutInflater, viewGroup, bundle));
        if (kVar.f13586a == null) {
            a.b(frameLayout);
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    @Override // androidx.fragment.app.b
    public final void G() {
        k kVar = this.f5337w0;
        c cVar = kVar.f13586a;
        if (cVar != null) {
            cVar.g();
        } else {
            kVar.c(1);
        }
        this.f1410c0 = true;
    }

    @Override // androidx.fragment.app.b
    public final void H() {
        k kVar = this.f5337w0;
        c cVar = kVar.f13586a;
        if (cVar != null) {
            cVar.i();
        } else {
            kVar.c(2);
        }
        this.f1410c0 = true;
    }

    @Override // androidx.fragment.app.b
    public final void K(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f1410c0 = true;
            k kVar = this.f5337w0;
            kVar.f23537g = activity;
            kVar.e();
            GoogleMapOptions googleMapOptionsD = GoogleMapOptions.d(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsD);
            kVar.d(bundle, new e(kVar, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.b
    public final void N() {
        k kVar = this.f5337w0;
        c cVar = kVar.f13586a;
        if (cVar != null) {
            cVar.e();
        } else {
            kVar.c(5);
        }
        this.f1410c0 = true;
    }

    @Override // androidx.fragment.app.b
    public final void O() {
        this.f1410c0 = true;
        k kVar = this.f5337w0;
        kVar.getClass();
        kVar.d(null, new i(kVar, 1));
    }

    @Override // androidx.fragment.app.b
    public final void P(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        k kVar = this.f5337w0;
        c cVar = kVar.f13586a;
        if (cVar != null) {
            cVar.f(bundle);
            return;
        }
        Bundle bundle2 = kVar.f13587b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @Override // androidx.fragment.app.b
    public final void Q() {
        this.f1410c0 = true;
        k kVar = this.f5337w0;
        kVar.getClass();
        kVar.d(null, new i(kVar, 0));
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        k kVar = this.f5337w0;
        c cVar = kVar.f13586a;
        if (cVar != null) {
            cVar.h();
        } else {
            kVar.c(4);
        }
        this.f1410c0 = true;
    }

    @Override // androidx.fragment.app.b, android.content.ComponentCallbacks
    public final void onLowMemory() {
        c cVar = this.f5337w0.f13586a;
        if (cVar != null) {
            cVar.onLowMemory();
        }
        this.f1410c0 = true;
    }

    @Override // androidx.fragment.app.b
    public final void z(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f1410c0 = true;
    }
}
