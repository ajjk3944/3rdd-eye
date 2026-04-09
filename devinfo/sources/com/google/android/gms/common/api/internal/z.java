package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z extends Fragment implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f9146b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a0 f9147a = new a0((byte) 0, 0);

    @Override // com.google.android.gms.common.api.internal.g
    public final void a(String str, f fVar) {
        this.f9147a.q(str, fVar);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final f d(Class cls, String str) {
        return (f) cls.cast(((Map) this.f9147a.f9070c).get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f9147a.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final Activity f() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i4, int i10, Intent intent) {
        super.onActivityResult(i4, i10, intent);
        Iterator it = ((Map) this.f9147a.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onActivityResult(i4, i10, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9147a.r(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a0 a0Var = this.f9147a;
        a0Var.f9069b = 5;
        Iterator it = ((Map) a0Var.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a0 a0Var = this.f9147a;
        a0Var.f9069b = 3;
        Iterator it = ((Map) a0Var.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f9147a.s(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a0 a0Var = this.f9147a;
        a0Var.f9069b = 2;
        Iterator it = ((Map) a0Var.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a0 a0Var = this.f9147a;
        a0Var.f9069b = 4;
        Iterator it = ((Map) a0Var.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onStop();
        }
    }
}
