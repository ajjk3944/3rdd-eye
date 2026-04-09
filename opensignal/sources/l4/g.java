package l4;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.y3;

/* loaded from: classes.dex */
public final class g extends y3 {

    /* renamed from: b, reason: collision with root package name */
    public final f f14670b;

    public g(TextView textView) {
        this.f14670b = new f(textView);
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final boolean B() {
        return this.f14670b.f14669d;
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void L(boolean z10) {
        if (j4.h.c()) {
            this.f14670b.L(z10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void M(boolean z10) {
        boolean zC = j4.h.c();
        f fVar = this.f14670b;
        if (zC) {
            fVar.M(z10);
        } else {
            fVar.f14669d = z10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final TransformationMethod R(TransformationMethod transformationMethod) {
        return !j4.h.c() ? transformationMethod : this.f14670b.R(transformationMethod);
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        return !j4.h.c() ? inputFilterArr : this.f14670b.u(inputFilterArr);
    }
}
