package y4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f37336a;

    /* renamed from: b, reason: collision with root package name */
    public final e f37337b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37338c = true;

    public g(TextView textView) {
        this.f37336a = textView;
        this.f37337b = new e(textView);
    }

    @Override // me.t1
    public final void D(boolean z3) {
        if (z3) {
            TextView textView = this.f37336a;
            textView.setTransformationMethod(H(textView.getTransformationMethod()));
        }
    }

    @Override // me.t1
    public final void E(boolean z3) {
        this.f37338c = z3;
        TextView textView = this.f37336a;
        textView.setTransformationMethod(H(textView.getTransformationMethod()));
        textView.setFilters(o(textView.getFilters()));
    }

    @Override // me.t1
    public final TransformationMethod H(TransformationMethod transformationMethod) {
        return this.f37338c ? ((transformationMethod instanceof k) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new k(transformationMethod) : transformationMethod instanceof k ? ((k) transformationMethod).f37344a : transformationMethod;
    }

    @Override // me.t1
    public final InputFilter[] o(InputFilter[] inputFilterArr) {
        if (!this.f37338c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i4 = 0; i4 < inputFilterArr.length; i4++) {
                InputFilter inputFilter = inputFilterArr[i4];
                if (inputFilter instanceof e) {
                    sparseArray.put(i4, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            e eVar = this.f37337b;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = eVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == eVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }

    @Override // me.t1
    public final boolean t() {
        return this.f37338c;
    }
}
