package t9;

import android.view.View;
import pe.c;
import w9.e;
import w9.f;
import w9.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends b {
    public static final f g;

    static {
        f fVarA = f.a(2, new a(null, 0.0f, null, null));
        g = fVarA;
        fVarA.f36554f = 0.5f;
    }

    public a(h hVar, float f10, c cVar, View view) {
        this.f34523b = new float[2];
        this.f34524c = hVar;
        this.f34525d = f10;
        this.f34526e = cVar;
        this.f34527f = view;
    }

    @Override // w9.e
    public final e a() {
        return new a(this.f34524c, this.f34525d, this.f34526e, this.f34527f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        float[] fArr = this.f34523b;
        fArr[0] = this.f34525d;
        fArr[1] = 0.0f;
        this.f34526e.f(fArr);
        this.f34524c.a(this.f34527f, fArr);
        g.c(this);
    }
}
