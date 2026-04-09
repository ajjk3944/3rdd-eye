package G0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import e.C4290a;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: BundleCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: BundleCompat.java */
    public static class a {
        public static <T> T a(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        public static <T> T[] b(Bundle bundle, String str, Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        public static <T> ArrayList<T> c(Bundle bundle, String str, Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        public static <T extends Serializable> T d(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }

        public static <T> SparseArray<T> e(Bundle bundle, String str, Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    public static Object a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(bundle, str, C4290a.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C4290a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
