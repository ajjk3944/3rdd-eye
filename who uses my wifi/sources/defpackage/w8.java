package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class w8 extends pu1 {
    public static void T(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        i30.m(iArr, "<this>");
        i30.m(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void U(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        i30.m(objArr, "<this>");
        i30.m(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void V(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        U(0, i, i2, objArr, objArr2);
    }
}
