package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import br.n;
import fj.o;
import io.sentry.android.replay.t;

/* loaded from: classes.dex */
public final class e extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11975d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f11976g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, int i10) {
        super(0);
        this.f11975d = i10;
        this.f11976g = oVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, lq.h] */
    @Override // ar.a
    public final Object c() {
        switch (this.f11975d) {
            case 0:
                Matrix matrix = new Matrix();
                t tVar = (t) this.f11976g.f8944c;
                matrix.preScale(tVar.f11987c, tVar.f11988d);
                return matrix;
            default:
                return new Canvas((Bitmap) this.f11976g.f8947f.getValue());
        }
    }
}
