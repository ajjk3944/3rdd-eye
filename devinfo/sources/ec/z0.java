package ec;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23238a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23239b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23240c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f23242e;

    public z0(b1 b1Var, String str, boolean z3) {
        this.f23242e = b1Var;
        pb.y.e(str);
        this.f23238a = str;
        this.f23239b = z3;
    }

    public final boolean a() {
        if (!this.f23240c) {
            this.f23240c = true;
            this.f23241d = this.f23242e.F().getBoolean(this.f23238a, this.f23239b);
        }
        return this.f23241d;
    }

    public final void b(boolean z3) {
        SharedPreferences.Editor editorEdit = this.f23242e.F().edit();
        editorEdit.putBoolean(this.f23238a, z3);
        editorEdit.apply();
        this.f23241d = z3;
    }
}
