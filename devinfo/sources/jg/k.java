package jg;

import androidx.lifecycle.a0;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements androidx.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StorageCleanActivity f27674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a4.d f27675b;

    public k(StorageCleanActivity storageCleanActivity, a4.d dVar) {
        this.f27674a = storageCleanActivity;
        this.f27675b = dVar;
    }

    @Override // androidx.lifecycle.h
    public final void c(a0 a0Var) {
        StorageCleanActivity storageCleanActivity = this.f27674a;
        storageCleanActivity.f32744a.b(this);
        a4.d dVar = this.f27675b;
        if (dVar.f188a) {
            return;
        }
        int i4 = StorageCleanActivity.K;
        storageCleanActivity.E();
        dVar.f188a = true;
    }

    @Override // androidx.lifecycle.h
    public final void e(a0 a0Var) {
    }

    @Override // androidx.lifecycle.h
    public final /* bridge */ void m(a0 a0Var) {
    }

    @Override // androidx.lifecycle.h
    public final void onDestroy(a0 a0Var) {
    }

    @Override // androidx.lifecycle.h
    public final /* bridge */ void onStart(a0 a0Var) {
    }

    @Override // androidx.lifecycle.h
    public final /* bridge */ void onStop(a0 a0Var) {
    }
}
