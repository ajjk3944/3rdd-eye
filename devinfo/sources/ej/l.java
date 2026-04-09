package ej;

import android.os.Bundle;
import androidx.lifecycle.e1;
import androidx.lifecycle.h1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23517a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23518b;

    public /* synthetic */ l(int i4, Object obj) {
        this.f23517a = i4;
        this.f23518b = obj;
    }

    @Override // androidx.lifecycle.h1
    public final e1 a(Class cls) {
        switch (this.f23517a) {
            case 0:
                return new m((String) this.f23518b);
            default:
                return new xg.h((Bundle) this.f23518b);
        }
    }

    @Override // androidx.lifecycle.h1
    public final e1 b(Class cls, h5.c cVar) {
        switch (this.f23517a) {
        }
        return a(cls);
    }

    @Override // androidx.lifecycle.h1
    public final e1 c(nk.e eVar, h5.c cVar) {
        switch (this.f23517a) {
        }
        return a0.g.a(this, eVar, cVar);
    }
}
