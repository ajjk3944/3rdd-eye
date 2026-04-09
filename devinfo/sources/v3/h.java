package v3;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class h extends f {
    public final Class g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f35812h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f35813i;
    public final Method j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f35814k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f35815l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f35816m;

    public h() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodB0;
        Constructor<?> constructor;
        Method methodA0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodA0 = a0(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodB0 = b0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            methodB0 = null;
            constructor = null;
            methodA0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.g = cls;
        this.f35812h = constructor;
        this.f35813i = methodA0;
        this.j = method;
        this.f35814k = method2;
        this.f35815l = method3;
        this.f35816m = methodB0;
    }

    public static Method a0(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean X(Context context, Object obj, String str, int i4, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f35813i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface Y(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f35816m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean Z(Object obj) {
        try {
            return ((Boolean) this.f35814k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method b0(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // v3.f, wd.b
    public final Typeface h(Context context, u3.e eVar, Resources resources, int i4) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f35813i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.h(context, eVar, resources, i4);
        }
        try {
            objNewInstance = this.f35812h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            u3.f[] fVarArr = eVar.f35075a;
            int length = fVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    u3.f fVar = fVarArr[i10];
                    Context context2 = context;
                    if (X(context2, objNewInstance, fVar.f35076a, fVar.f35080e, fVar.f35077b, fVar.f35078c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f35079d))) {
                        i10++;
                        context = context2;
                    } else {
                        try {
                            this.f35815l.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (Z(objNewInstance)) {
                    return Y(objNewInstance);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009e A[SYNTHETIC] */
    @Override // v3.f, wd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface i(android.content.Context r18, b4.k[] r19, int r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.h.i(android.content.Context, b4.k[], int):android.graphics.Typeface");
    }

    @Override // wd.b
    public final Typeface l(Context context, Resources resources, int i4, String str, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f35813i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.l(context, resources, i4, str, i10);
        }
        try {
            objNewInstance = this.f35812h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!X(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f35815l.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (Z(objNewInstance)) {
                return Y(objNewInstance);
            }
        }
        return null;
    }
}
