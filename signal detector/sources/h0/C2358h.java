package h0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: h0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2358h extends R2.a {

    /* renamed from: e, reason: collision with root package name */
    public final TextView f20456e;

    /* renamed from: f, reason: collision with root package name */
    public final C2356f f20457f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20458g = true;

    public C2358h(TextView textView) {
        this.f20456e = textView;
        this.f20457f = new C2356f(textView);
    }

    @Override // R2.a
    public final void B(boolean z6) {
        if (z6) {
            TextView textView = this.f20456e;
            textView.setTransformationMethod(I(textView.getTransformationMethod()));
        }
    }

    @Override // R2.a
    public final void E(boolean z6) {
        this.f20458g = z6;
        TextView textView = this.f20456e;
        textView.setTransformationMethod(I(textView.getTransformationMethod()));
        textView.setFilters(o(textView.getFilters()));
    }

    @Override // R2.a
    public final TransformationMethod I(TransformationMethod transformationMethod) {
        return this.f20458g ? ((transformationMethod instanceof l) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new l(transformationMethod) : transformationMethod instanceof l ? ((l) transformationMethod).f20465a : transformationMethod;
    }

    @Override // R2.a
    public final InputFilter[] o(InputFilter[] inputFilterArr) {
        if (!this.f20458g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C2356f) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (sparseArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i6];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i7 = 0;
        while (true) {
            C2356f c2356f = this.f20457f;
            if (i7 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c2356f;
                return inputFilterArr3;
            }
            if (inputFilterArr[i7] == c2356f) {
                return inputFilterArr;
            }
            i7++;
        }
    }

    @Override // R2.a
    public final boolean u() {
        return this.f20458g;
    }
}
