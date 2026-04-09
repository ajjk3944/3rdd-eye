package h;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* compiled from: ResourcesFlusher.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static Field f38088a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f38089b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f38090c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f38091d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f38092e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f38093f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f38094g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f38095h;

    public static void a(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!f38091d) {
            try {
                f38090c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e4) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e4);
            }
            f38091d = true;
        }
        Class<?> cls = f38090c;
        if (cls == null) {
            return;
        }
        if (!f38093f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f38092e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
            }
            f38093f = true;
        }
        Field field = f38092e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
