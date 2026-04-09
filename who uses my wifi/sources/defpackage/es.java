package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class es extends g82 {
    public final TextView r;
    public final as s;
    public boolean t = true;

    public es(TextView textView) {
        this.r = textView;
        this.s = new as(textView);
    }

    @Override // defpackage.g82
    public final InputFilter[] h(InputFilter[] inputFilterArr) {
        if (!this.t) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof as) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            as asVar = this.s;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = asVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == asVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.g82
    public final boolean k() {
        return this.t;
    }

    @Override // defpackage.g82
    public final void q(boolean z) {
        if (z) {
            TextView textView = this.r;
            textView.setTransformationMethod(t(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.g82
    public final void r(boolean z) {
        this.t = z;
        TextView textView = this.r;
        textView.setTransformationMethod(t(textView.getTransformationMethod()));
        textView.setFilters(h(textView.getFilters()));
    }

    @Override // defpackage.g82
    public final TransformationMethod t(TransformationMethod transformationMethod) {
        return this.t ? ((transformationMethod instanceof is) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new is(transformationMethod) : transformationMethod instanceof is ? ((is) transformationMethod).f : transformationMethod;
    }
}
