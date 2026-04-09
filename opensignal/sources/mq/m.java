package mq;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class m extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f16940a;

    public m(int[] iArr) {
        this.f16940a = iArr;
    }

    @Override // mq.a
    public final int a() {
        return this.f16940a.length;
    }

    @Override // mq.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f16940a;
        br.l.e(iArr, "<this>");
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (iIntValue == iArr[i10]) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(this.f16940a[i10]);
    }

    @Override // mq.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f16940a;
        br.l.e(iArr, "<this>");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iIntValue == iArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @Override // mq.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f16940a.length == 0;
    }

    @Override // mq.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f16940a;
        br.l.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }
}
