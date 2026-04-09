package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC3999j;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d0 extends Fragment implements InterfaceC4279h {

    /* renamed from: u1, reason: collision with root package name */
    private static final WeakHashMap f34817u1 = new WeakHashMap();

    /* renamed from: t1, reason: collision with root package name */
    private final c0 f34818t1 = new c0();

    public static d0 D1(AbstractActivityC3999j abstractActivityC3999j) {
        d0 d0Var;
        WeakHashMap weakHashMap = f34817u1;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC3999j);
        if (weakReference != null && (d0Var = (d0) weakReference.get()) != null) {
            return d0Var;
        }
        try {
            d0 d0Var2 = (d0) abstractActivityC3999j.v0().f0("SLifecycleFragmentImpl");
            if (d0Var2 == null || d0Var2.f0()) {
                d0Var2 = new d0();
                abstractActivityC3999j.v0().m().e(d0Var2, "SLifecycleFragmentImpl").h();
            }
            weakHashMap.put(abstractActivityC3999j, new WeakReference(d0Var2));
            return d0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void J0() {
        super.J0();
        this.f34818t1.i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void K0(Bundle bundle) {
        super.K0(bundle);
        this.f34818t1.j(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void L0() {
        super.L0();
        this.f34818t1.k();
    }

    @Override // androidx.fragment.app.Fragment
    public final void M0() {
        super.M0();
        this.f34818t1.l();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4279h
    public final void a(String str, AbstractC4278g abstractC4278g) {
        this.f34818t1.d(str, abstractC4278g);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4279h
    public final AbstractC4278g c(String str, Class cls) {
        return this.f34818t1.c(str, cls);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4279h
    public final Activity d() {
        return l();
    }

    @Override // androidx.fragment.app.Fragment
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        this.f34818t1.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.Fragment
    public final void j0(int i10, int i11, Intent intent) {
        super.j0(i10, i11, intent);
        this.f34818t1.f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void o0(Bundle bundle) {
        super.o0(bundle);
        this.f34818t1.g(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void t0() {
        super.t0();
        this.f34818t1.h();
    }
}
