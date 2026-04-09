package androidx.compose.ui.layout;

import E0.m0;
import androidx.compose.ui.layout.t;

/* loaded from: classes.dex */
final class s extends t.a {

    /* renamed from: b, reason: collision with root package name */
    private final m0 f29060b;

    public s(m0 m0Var) {
        this.f29060b = m0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.t.a
    public Y0.t d() {
        return this.f29060b.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.t.a
    public int e() {
        return this.f29060b.getRoot().t0();
    }
}
