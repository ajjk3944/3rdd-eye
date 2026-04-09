package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a0 extends Fragment implements InterfaceC4279h {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f34800b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final c0 f34801a = new c0();

    public static a0 b(Activity activity) {
        a0 a0Var;
        WeakHashMap weakHashMap = f34800b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (a0Var = (a0) weakReference.get()) != null) {
            return a0Var;
        }
        try {
            a0 a0Var2 = (a0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (a0Var2 == null || a0Var2.isRemoving()) {
                a0Var2 = new a0();
                activity.getFragmentManager().beginTransaction().add(a0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(a0Var2));
            return a0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4279h
    public final void a(String str, AbstractC4278g abstractC4278g) {
        this.f34801a.d(str, abstractC4278g);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4279h
    public final AbstractC4278g c(String str, Class cls) {
        return this.f34801a.c(str, cls);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4279h
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f34801a.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f34801a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34801a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f34801a.h();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f34801a.i();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f34801a.j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f34801a.k();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f34801a.l();
    }
}
