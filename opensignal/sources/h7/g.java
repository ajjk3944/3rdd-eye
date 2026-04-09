package h7;

import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes.dex */
public final class g implements u3.m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10066a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10067b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10068c;

    public g(ht.b0 b0Var, int i10, boolean z10) {
        this.f10068c = b0Var;
        this.f10066a = i10;
        this.f10067b = z10;
    }

    @Override // u3.m0
    public void a() {
        this.f10067b = true;
    }

    @Override // u3.m0
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f10067b = false;
    }

    @Override // u3.m0
    public void c() {
        if (this.f10067b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f10068c;
        actionBarContextView.f944y = null;
        super/*android.view.View*/.setVisibility(this.f10066a);
    }
}
