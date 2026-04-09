package T1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f21356a;

    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f21357a;

        /* renamed from: b, reason: collision with root package name */
        private final d f21358b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21359c = true;

        a(TextView textView) {
            this.f21357a = textView;
            this.f21358b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f21358b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f21358b;
            return inputFilterArr2;
        }

        private SparseArray e(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayE = e(inputFilterArr);
            if (sparseArrayE.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayE.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayE.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f21357a.setFilters(a(this.f21357a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // T1.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f21359c ? f(inputFilterArr) : d(inputFilterArr);
        }

        @Override // T1.f.b
        void b(boolean z10) {
            if (z10) {
                j();
            }
        }

        @Override // T1.f.b
        void c(boolean z10) {
            this.f21359c = z10;
            j();
            i();
        }

        void g(boolean z10) {
            this.f21359c = z10;
        }

        void j() {
            this.f21357a.setTransformationMethod(l(this.f21357a.getTransformationMethod()));
        }

        TransformationMethod l(TransformationMethod transformationMethod) {
            return this.f21359c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        abstract void b(boolean z10);

        abstract void c(boolean z10);
    }

    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f21360a;

        c(TextView textView) {
            this.f21360a = new a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.f.k();
        }

        @Override // T1.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f21360a.a(inputFilterArr);
        }

        @Override // T1.f.b
        void b(boolean z10) {
            if (d()) {
                return;
            }
            this.f21360a.b(z10);
        }

        @Override // T1.f.b
        void c(boolean z10) {
            if (d()) {
                this.f21360a.g(z10);
            } else {
                this.f21360a.c(z10);
            }
        }
    }

    public f(TextView textView, boolean z10) {
        E1.h.h(textView, "textView cannot be null");
        if (z10) {
            this.f21356a = new a(textView);
        } else {
            this.f21356a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f21356a.a(inputFilterArr);
    }

    public void b(boolean z10) {
        this.f21356a.b(z10);
    }

    public void c(boolean z10) {
        this.f21356a.c(z10);
    }
}
