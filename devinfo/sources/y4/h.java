package y4;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final g f37339a;

    public h(TextView textView) {
        this.f37339a = new g(textView);
    }

    @Override // me.t1
    public final void D(boolean z3) {
        if (w4.i.c()) {
            this.f37339a.D(z3);
        }
    }

    @Override // me.t1
    public final void E(boolean z3) {
        boolean zC = w4.i.c();
        g gVar = this.f37339a;
        if (zC) {
            gVar.E(z3);
        } else {
            gVar.f37338c = z3;
        }
    }

    @Override // me.t1
    public final TransformationMethod H(TransformationMethod transformationMethod) {
        return !w4.i.c() ? transformationMethod : this.f37339a.H(transformationMethod);
    }

    @Override // me.t1
    public final InputFilter[] o(InputFilter[] inputFilterArr) {
        return !w4.i.c() ? inputFilterArr : this.f37339a.o(inputFilterArr);
    }

    @Override // me.t1
    public final boolean t() {
        return this.f37339a.f37338c;
    }
}
