package f1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;
import r0.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f21038a;

    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f21039a;

        /* renamed from: b, reason: collision with root package name */
        public final d f21040b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21041c = true;

        public a(TextView textView) {
            this.f21039a = textView;
            this.f21040b = new d(textView);
        }

        @Override // f1.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f21041c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // f1.f.b
        public boolean b() {
            return this.f21041c;
        }

        @Override // f1.f.b
        public void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // f1.f.b
        public void d(boolean z10) {
            this.f21041c = z10;
            l();
            k();
        }

        @Override // f1.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f21041c ? m(transformationMethod) : j(transformationMethod);
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f21040b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f21040b;
            return inputFilterArr2;
        }

        public final SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        public void i(boolean z10) {
            this.f21041c = z10;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.f21039a.setFilters(a(this.f21039a.getFilters()));
        }

        public void l() {
            this.f21039a.setTransformationMethod(e(this.f21039a.getTransformationMethod()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }
    }

    public static class b {
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        public abstract void c(boolean z10);

        public abstract void d(boolean z10);

        public abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f21042a;

        public c(TextView textView) {
            this.f21042a = new a(textView);
        }

        @Override // f1.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f21042a.a(inputFilterArr);
        }

        @Override // f1.f.b
        public boolean b() {
            return this.f21042a.b();
        }

        @Override // f1.f.b
        public void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f21042a.c(z10);
        }

        @Override // f1.f.b
        public void d(boolean z10) {
            if (f()) {
                this.f21042a.i(z10);
            } else {
                this.f21042a.d(z10);
            }
        }

        @Override // f1.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f21042a.e(transformationMethod);
        }

        public final boolean f() {
            return !EmojiCompat.i();
        }
    }

    public f(TextView textView, boolean z10) {
        i.h(textView, "textView cannot be null");
        if (z10) {
            this.f21038a = new a(textView);
        } else {
            this.f21038a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f21038a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f21038a.b();
    }

    public void c(boolean z10) {
        this.f21038a.c(z10);
    }

    public void d(boolean z10) {
        this.f21038a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f21038a.e(transformationMethod);
    }
}
