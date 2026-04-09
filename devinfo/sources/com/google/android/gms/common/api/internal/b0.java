package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 extends b5.z implements g {

    /* renamed from: a0, reason: collision with root package name */
    public static final WeakHashMap f9072a0 = new WeakHashMap();
    public final a0 Z = new a0((byte) 0, 0);

    @Override // b5.z
    public final void D(int i4, int i10, Intent intent) {
        super.D(i4, i10, intent);
        Iterator it = ((Map) this.Z.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onActivityResult(i4, i10, intent);
        }
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.Z.r(bundle);
    }

    @Override // b5.z
    public final void H() {
        this.F = true;
        a0 a0Var = this.Z;
        a0Var.f9069b = 5;
        Iterator it = ((Map) a0Var.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onDestroy();
        }
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        a0 a0Var = this.Z;
        a0Var.f9069b = 3;
        Iterator it = ((Map) a0Var.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onResume();
        }
    }

    @Override // b5.z
    public final void O(Bundle bundle) {
        this.Z.s(bundle);
    }

    @Override // b5.z
    public final void P() {
        this.F = true;
        a0 a0Var = this.Z;
        a0Var.f9069b = 2;
        Iterator it = ((Map) a0Var.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onStart();
        }
    }

    @Override // b5.z
    public final void Q() {
        this.F = true;
        a0 a0Var = this.Z;
        a0Var.f9069b = 4;
        Iterator it = ((Map) a0Var.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void a(String str, f fVar) {
        this.Z.q(str, fVar);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final f d(Class cls, String str) {
        return (f) cls.cast(((Map) this.Z.f9070c).get(str));
    }

    @Override // b5.z
    public final void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.l(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.Z.f9070c).values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
