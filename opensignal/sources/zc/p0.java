package zc;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27070a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27071b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27072c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f27074e;

    public p0(r0 r0Var, String str, boolean z10) {
        this.f27074e = r0Var;
        cc.s.e(str);
        this.f27070a = str;
        this.f27071b = z10;
    }

    public final boolean a() {
        if (!this.f27072c) {
            this.f27072c = true;
            this.f27073d = this.f27074e.w1().getBoolean(this.f27070a, this.f27071b);
        }
        return this.f27073d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f27074e.w1().edit();
        editorEdit.putBoolean(this.f27070a, z10);
        editorEdit.apply();
        this.f27073d = z10;
    }
}
