package j2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends androidx.recyclerview.widget.d0 {

    /* renamed from: c, reason: collision with root package name */
    public static d f27106c;

    @Override // androidx.recyclerview.widget.d0
    public final int[] e(int i4) {
        int length = o().length();
        if (length <= 0 || i4 >= length) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < length && o().charAt(i4) == '\n' && (o().charAt(i4) == '\n' || (i4 != 0 && o().charAt(i4 - 1) != '\n'))) {
            i4++;
        }
        if (i4 >= length) {
            return null;
        }
        int i10 = i4 + 1;
        while (i10 < length && !y(i10)) {
            i10++;
        }
        return h(i4, i10);
    }

    @Override // androidx.recyclerview.widget.d0
    public final int[] r(int i4) {
        int length = o().length();
        if (length <= 0 || i4 <= 0) {
            return null;
        }
        if (i4 > length) {
            i4 = length;
        }
        while (i4 > 0 && o().charAt(i4 - 1) == '\n' && !y(i4)) {
            i4--;
        }
        if (i4 <= 0) {
            return null;
        }
        int i10 = i4 - 1;
        while (i10 > 0 && (o().charAt(i10) == '\n' || (i10 != 0 && o().charAt(i10 - 1) != '\n'))) {
            i10--;
        }
        return h(i10, i4);
    }

    public final boolean y(int i4) {
        if (i4 <= 0 || o().charAt(i4 - 1) == '\n') {
            return false;
        }
        return i4 == o().length() || o().charAt(i4) == '\n';
    }
}
