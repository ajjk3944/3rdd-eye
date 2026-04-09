package h9;

import android.graphics.Canvas;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class m2 extends n2 {

    /* renamed from: f, reason: collision with root package name */
    public final Path f10412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r2 f10413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(r2 r2Var, Path path, float f10) {
        super(r2Var, f10, 0.0f);
        this.f10413g = r2Var;
        this.f10412f = path;
    }

    @Override // h9.n2, se.b
    public final void N(String str) {
        r2 r2Var = this.f10413g;
        if (r2Var.y1()) {
            p2 p2Var = (p2) r2Var.f10472g;
            if (p2Var.f10450b) {
                ((Canvas) r2Var.f10470a).drawTextOnPath(str, this.f10412f, this.f10423c, this.f10424d, p2Var.f10452d);
            }
            p2 p2Var2 = (p2) r2Var.f10472g;
            if (p2Var2.f10451c) {
                ((Canvas) r2Var.f10470a).drawTextOnPath(str, this.f10412f, this.f10423c, this.f10424d, p2Var2.f10453e);
            }
        }
        this.f10423c = ((p2) r2Var.f10472g).f10452d.measureText(str) + this.f10423c;
    }
}
