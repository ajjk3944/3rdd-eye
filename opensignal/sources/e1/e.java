package e1;

import androidx.compose.ui.platform.AndroidComposeView;
import u.b0;
import u.h0;
import u.z;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a8.f f7641a;

    /* renamed from: b, reason: collision with root package name */
    public final AndroidComposeView f7642b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f7643c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f7644d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7645e;

    public e(a8.f fVar, AndroidComposeView androidComposeView) {
        this.f7641a = fVar;
        this.f7642b = androidComposeView;
        int i10 = h0.f23073a;
        this.f7643c = new b0();
        this.f7644d = new b0();
    }

    public final void a() {
        if (this.f7645e) {
            return;
        }
        bp.a aVar = new bp.a(0, this, e.class, "invalidateNodes", "invalidateNodes()V", 0, 17);
        z zVar = this.f7642b.P0;
        if (zVar.f(aVar) < 0) {
            zVar.a(aVar);
        }
        this.f7645e = true;
    }
}
