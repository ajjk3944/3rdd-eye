package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import o.C7010a;

/* loaded from: classes.dex */
final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f34814a = Collections.synchronizedMap(new C7010a());

    /* renamed from: b, reason: collision with root package name */
    private int f34815b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f34816c;

    c0() {
    }

    final AbstractC4278g c(String str, Class cls) {
        return (AbstractC4278g) cls.cast(this.f34814a.get(str));
    }

    final void d(String str, AbstractC4278g abstractC4278g) {
        if (this.f34814a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f34814a.put(str, abstractC4278g);
        if (this.f34815b > 0) {
            new B3.e(Looper.getMainLooper()).post(new b0(this, abstractC4278g, str));
        }
    }

    final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f34814a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4278g) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f34814a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4278g) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    final void g(Bundle bundle) {
        this.f34815b = 1;
        this.f34816c = bundle;
        for (Map.Entry entry : this.f34814a.entrySet()) {
            ((AbstractC4278g) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void h() {
        this.f34815b = 5;
        Iterator it = this.f34814a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4278g) it.next()).onDestroy();
        }
    }

    final void i() {
        this.f34815b = 3;
        Iterator it = this.f34814a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4278g) it.next()).onResume();
        }
    }

    final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f34814a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC4278g) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void k() {
        this.f34815b = 2;
        Iterator it = this.f34814a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4278g) it.next()).onStart();
        }
    }

    final void l() {
        this.f34815b = 4;
        Iterator it = this.f34814a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4278g) it.next()).onStop();
        }
    }
}
