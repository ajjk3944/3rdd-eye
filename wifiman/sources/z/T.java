package z;

/* loaded from: classes.dex */
public interface T {
    static /* synthetic */ long n(T t10, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
        if ((i14 & 16) != 0) {
            z10 = false;
        }
        return t10.g(i10, i11, i12, i13, z10);
    }

    void a(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.m mVar);

    C0.D d(androidx.compose.ui.layout.t[] tVarArr, androidx.compose.ui.layout.m mVar, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15);

    long g(int i10, int i11, int i12, int i13, boolean z10);

    int h(androidx.compose.ui.layout.t tVar);

    int k(androidx.compose.ui.layout.t tVar);
}
