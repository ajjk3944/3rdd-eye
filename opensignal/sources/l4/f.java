package l4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.y3;

/* loaded from: classes.dex */
public final class f extends y3 {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f14667b;

    /* renamed from: c, reason: collision with root package name */
    public final d f14668c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14669d = true;

    public f(TextView textView) {
        this.f14667b = textView;
        this.f14668c = new d(textView);
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final boolean B() {
        return this.f14669d;
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void L(boolean z10) {
        if (z10) {
            TextView textView = this.f14667b;
            textView.setTransformationMethod(R(textView.getTransformationMethod()));
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void M(boolean z10) {
        this.f14669d = z10;
        TextView textView = this.f14667b;
        textView.setTransformationMethod(R(textView.getTransformationMethod()));
        textView.setFilters(u(textView.getFilters()));
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final TransformationMethod R(TransformationMethod transformationMethod) {
        return this.f14669d ? ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f14675a : transformationMethod;
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        if (!this.f14669d) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            d dVar = this.f14668c;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == dVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }
}
