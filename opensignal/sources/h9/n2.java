package h9;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public class n2 extends se.b {

    /* renamed from: c, reason: collision with root package name */
    public float f10423c;

    /* renamed from: d, reason: collision with root package name */
    public float f10424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r2 f10425e;

    public n2(r2 r2Var, float f10, float f11) {
        this.f10425e = r2Var;
        this.f10423c = f10;
        this.f10424d = f11;
    }

    @Override // se.b
    public void N(String str) {
        r2 r2Var = this.f10425e;
        if (r2Var.y1()) {
            p2 p2Var = (p2) r2Var.f10472g;
            if (p2Var.f10450b) {
                ((Canvas) r2Var.f10470a).drawText(str, this.f10423c, this.f10424d, p2Var.f10452d);
            }
            p2 p2Var2 = (p2) r2Var.f10472g;
            if (p2Var2.f10451c) {
                ((Canvas) r2Var.f10470a).drawText(str, this.f10423c, this.f10424d, p2Var2.f10453e);
            }
        }
        this.f10423c = ((p2) r2Var.f10472g).f10452d.measureText(str) + this.f10423c;
    }
}
