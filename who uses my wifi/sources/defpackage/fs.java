package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fs extends g82 {
    public final es r;

    public fs(TextView textView) {
        this.r = new es(textView);
    }

    @Override // defpackage.g82
    public final InputFilter[] h(InputFilter[] inputFilterArr) {
        return !(rr.k != null) ? inputFilterArr : this.r.h(inputFilterArr);
    }

    @Override // defpackage.g82
    public final boolean k() {
        return this.r.t;
    }

    @Override // defpackage.g82
    public final void q(boolean z) {
        if (rr.k != null) {
            this.r.q(z);
        }
    }

    @Override // defpackage.g82
    public final void r(boolean z) {
        es esVar = this.r;
        if (rr.k != null) {
            esVar.r(z);
        } else {
            esVar.t = z;
        }
    }

    @Override // defpackage.g82
    public final TransformationMethod t(TransformationMethod transformationMethod) {
        return !(rr.k != null) ? transformationMethod : this.r.t(transformationMethod);
    }
}
