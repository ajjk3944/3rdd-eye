package B6;

import H6.C0672i;
import N7.C1439yb;
import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class h implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1439yb f535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0672i f536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f537f;

    public h(k kVar, View view, C1439yb c1439yb, C0672i c0672i, boolean z10) {
        this.f533b = kVar;
        this.f534c = view;
        this.f535d = c1439yb;
        this.f536e = c0672i;
        this.f537f = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        view.removeOnLayoutChangeListener(this);
        k.a(this.f533b, this.f534c, this.f535d, this.f536e, this.f537f);
    }
}
