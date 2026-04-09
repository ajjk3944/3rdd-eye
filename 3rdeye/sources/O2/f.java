package O2;

/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes.dex */
public final class f implements a<int[]> {
    @Override // O2.a
    public final int a() {
        return 4;
    }

    @Override // O2.a
    public final int b(int[] iArr) {
        return iArr.length;
    }

    @Override // O2.a
    public final String getTag() {
        return "IntegerArrayPool";
    }

    @Override // O2.a
    public final int[] newArray(int i) {
        return new int[i];
    }
}
