package h9;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h0 extends n1 implements j0, k1 {

    /* renamed from: i, reason: collision with root package name */
    public HashSet f10348i = null;
    public String j = null;
    public HashSet k = null;

    /* renamed from: l, reason: collision with root package name */
    public HashSet f10349l = null;

    /* renamed from: m, reason: collision with root package name */
    public HashSet f10350m = null;

    /* renamed from: n, reason: collision with root package name */
    public Matrix f10351n;

    @Override // h9.k1
    public final Set a() {
        return this.k;
    }

    @Override // h9.k1
    public final String b() {
        return this.j;
    }

    @Override // h9.k1
    public final void d(HashSet hashSet) {
        this.f10348i = hashSet;
    }

    @Override // h9.k1
    public final Set e() {
        return this.f10348i;
    }

    @Override // h9.k1
    public final void g(HashSet hashSet) {
        this.f10350m = hashSet;
    }

    @Override // h9.k1
    public final void h(String str) {
        this.j = str;
    }

    @Override // h9.k1
    public final void i(HashSet hashSet) {
        this.f10349l = hashSet;
    }

    @Override // h9.k1
    public final void j(HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // h9.j0
    public final void k(Matrix matrix) {
        this.f10351n = matrix;
    }

    @Override // h9.k1
    public final Set l() {
        return this.f10349l;
    }

    @Override // h9.k1
    public final Set n() {
        return this.f10350m;
    }
}
