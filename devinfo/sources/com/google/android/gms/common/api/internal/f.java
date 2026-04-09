package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import b5.u0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class f {
    protected final g mLifecycleFragment;

    public f(g gVar) {
        this.mLifecycleFragment = gVar;
    }

    public static g getFragment(Activity activity) {
        return getFragment(new e(activity));
    }

    public Activity getActivity() {
        Activity activityF = this.mLifecycleFragment.f();
        pb.y.h(activityF);
        return activityF;
    }

    public abstract void onStop();

    public static g getFragment(e eVar) {
        z zVar;
        b0 b0Var;
        Activity activity = eVar.f9094a;
        if (!(activity instanceof i.g)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = z.f9146b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (zVar = (z) weakReference.get()) != null) {
                return zVar;
            }
            try {
                z zVar2 = (z) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (zVar2 == null || zVar2.isRemoving()) {
                    zVar2 = new z();
                    activity.getFragmentManager().beginTransaction().add(zVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(zVar2));
                return zVar2;
            } catch (ClassCastException e2) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
            }
        }
        i.g gVar = (i.g) activity;
        WeakHashMap weakHashMap2 = b0.f9072a0;
        u0 u0VarS = gVar.s();
        WeakHashMap weakHashMap3 = b0.f9072a0;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(gVar);
        if (weakReference2 != null && (b0Var = (b0) weakReference2.get()) != null) {
            return b0Var;
        }
        try {
            b0 b0Var2 = (b0) u0VarS.D("SLifecycleFragmentImpl");
            if (b0Var2 == null || b0Var2.f1939m) {
                b0Var2 = new b0();
                b5.a aVar = new b5.a(u0VarS);
                aVar.h(0, b0Var2, "SLifecycleFragmentImpl", 1);
                aVar.f(true, true);
            }
            weakHashMap3.put(gVar, new WeakReference(b0Var2));
            return b0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    public static g getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onActivityResult(int i4, int i10, Intent intent) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
