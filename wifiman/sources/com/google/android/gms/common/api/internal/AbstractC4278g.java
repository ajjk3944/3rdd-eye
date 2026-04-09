package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4278g {
    protected final InterfaceC4279h mLifecycleFragment;

    protected AbstractC4278g(InterfaceC4279h interfaceC4279h) {
        this.mLifecycleFragment = interfaceC4279h;
    }

    public static InterfaceC4279h getFragment(Activity activity) {
        return getFragment(new C4277f(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityD = this.mLifecycleFragment.d();
        AbstractC7901p.l(activityD);
        return activityD;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static InterfaceC4279h getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    protected static InterfaceC4279h getFragment(C4277f c4277f) {
        if (c4277f.d()) {
            return d0.D1(c4277f.b());
        }
        if (c4277f.c()) {
            return a0.b(c4277f.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
