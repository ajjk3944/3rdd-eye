package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.v;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1367a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f1368b;

    static {
        int[] iArr = new int[f0.values().length];
        f1368b = iArr;
        try {
            iArr[f0.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1368b[f0.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1368b[f0.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[v.a.values().length];
        f1367a = iArr2;
        try {
            iArr2[v.a.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f1367a[v.a.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f1367a[v.a.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
