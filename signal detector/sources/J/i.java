package J;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: h, reason: collision with root package name */
    public final Class f2025h;
    public final Constructor i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f2026j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f2027k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f2028l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f2029m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f2030n;

    public i() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodH;
        Constructor<?> constructor;
        Method methodG;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodG = G(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodH = H(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            methodH = null;
            constructor = null;
            methodG = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f2025h = cls;
        this.i = constructor;
        this.f2026j = methodG;
        this.f2027k = method;
        this.f2028l = method2;
        this.f2029m = method3;
        this.f2030n = methodH;
    }

    public static Method G(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean D(Context context, Object obj, String str, int i, int i3, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2026j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface E(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2025h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2030n.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean F(Object obj) {
        try {
            return ((Boolean) this.f2028l.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method H(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // J.g, com.bumptech.glide.e
    public final Typeface d(Context context, I.f fVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f2026j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.d(context, fVar, resources, i);
        }
        try {
            objNewInstance = this.i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            I.g[] gVarArr = fVar.f1853a;
            int length = gVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    I.g gVar = gVarArr[i3];
                    Context context2 = context;
                    if (D(context2, objNewInstance, gVar.f1854a, gVar.f1858e, gVar.f1855b, gVar.f1856c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f1857d))) {
                        i3++;
                        context = context2;
                    } else {
                        try {
                            this.f2029m.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (F(objNewInstance)) {
                    return E(objNewInstance);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009e A[SYNTHETIC] */
    @Override // J.g, com.bumptech.glide.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface e(android.content.Context r18, O.i[] r19, int r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J.i.e(android.content.Context, O.i[], int):android.graphics.Typeface");
    }

    @Override // com.bumptech.glide.e
    public final Typeface h(Context context, Resources resources, int i, String str, int i3) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f2026j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.h(context, resources, i, str, i3);
        }
        try {
            objNewInstance = this.i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!D(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f2029m.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (F(objNewInstance)) {
                return E(objNewInstance);
            }
        }
        return null;
    }
}
