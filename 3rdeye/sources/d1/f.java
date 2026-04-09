package d1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f37335a;

    /* compiled from: EmojiTextViewHelper.java */
    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f37336a;

        /* renamed from: b, reason: collision with root package name */
        public final C4264d f37337b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f37338c = true;

        public a(TextView textView) {
            this.f37336a = textView;
            this.f37337b = new C4264d(textView);
        }

        @Override // d1.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f37338c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof C4264d) {
                        sparseArray.put(i, inputFilter);
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
                C4264d c4264d = this.f37337b;
                if (i12 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = c4264d;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i12] == c4264d) {
                    return inputFilterArr;
                }
                i12++;
            }
        }

        @Override // d1.f.b
        public final boolean b() {
            return this.f37338c;
        }

        @Override // d1.f.b
        public final void c(boolean z10) {
            if (z10) {
                TextView textView = this.f37336a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // d1.f.b
        public final void d(boolean z10) {
            this.f37338c = z10;
            TextView textView = this.f37336a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // d1.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f37338c ? ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod) : transformationMethod instanceof h ? ((h) transformationMethod).f37344a : transformationMethod;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f37339a;

        public c(TextView textView) {
            this.f37339a = new a(textView);
        }

        @Override // d1.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return !(androidx.emoji2.text.c.f15714k != null) ? inputFilterArr : this.f37339a.a(inputFilterArr);
        }

        @Override // d1.f.b
        public final boolean b() {
            return this.f37339a.f37338c;
        }

        @Override // d1.f.b
        public final void c(boolean z10) {
            if (androidx.emoji2.text.c.f15714k != null) {
                this.f37339a.c(z10);
            }
        }

        @Override // d1.f.b
        public final void d(boolean z10) {
            boolean z11 = androidx.emoji2.text.c.f15714k != null;
            a aVar = this.f37339a;
            if (z11) {
                aVar.d(z10);
            } else {
                aVar.f37338c = z10;
            }
        }

        @Override // d1.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return !(androidx.emoji2.text.c.f15714k != null) ? transformationMethod : this.f37339a.e(transformationMethod);
        }
    }

    public f(TextView textView) {
        this.f37335a = new c(textView);
    }
}
