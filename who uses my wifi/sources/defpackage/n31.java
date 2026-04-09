package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class n31 extends uk2 {
    public static boolean A = false;
    public static Class w;
    public static Constructor x;
    public static Method y;
    public static Method z;
    public final Class p;
    public final Constructor q;
    public final Method r;
    public final Method s;
    public final Method t;
    public final Method u;
    public final Method v;

    public n31() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodP0;
        Constructor<?> constructor;
        Method methodO0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodO0 = o0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodP0 = p0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodP0 = null;
            constructor = null;
            methodO0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.p = cls;
        this.q = constructor;
        this.r = methodO0;
        this.s = method;
        this.t = method2;
        this.u = method3;
        this.v = methodP0;
    }

    public static boolean k0(Object obj, String str, int i, boolean z2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        n0();
        try {
            return ((Boolean) y.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void n0() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (A) {
            return;
        }
        A = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        x = constructor;
        w = cls;
        y = method2;
        z = method;
    }

    public static Method o0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean j0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.r.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.uk2
    public final Typeface k(Context context, tv tvVar, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        if (this.r != null) {
            try {
                objNewInstance = this.q.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                uv[] uvVarArr = tvVar.a;
                int length = uvVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        uv uvVar = uvVarArr[i2];
                        Context context2 = context;
                        if (j0(context2, objNewInstance, uvVar.a, uvVar.e, uvVar.b, uvVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(uvVar.d))) {
                            i2++;
                            context = context2;
                        } else {
                            try {
                                this.u.invoke(objNewInstance, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (m0(objNewInstance)) {
                        return l0(objNewInstance);
                    }
                }
            }
            return null;
        }
        n0();
        try {
            Object objNewInstance2 = x.newInstance(null);
            for (uv uvVar2 : tvVar.a) {
                File fileJ = wl2.j(context);
                if (fileJ == null) {
                    return null;
                }
                try {
                } catch (RuntimeException unused3) {
                } catch (Throwable th) {
                    fileJ.delete();
                    throw th;
                }
                if (!wl2.d(fileJ, resources, uvVar2.f) || !k0(objNewInstance2, fileJ.getPath(), uvVar2.b, uvVar2.c)) {
                    fileJ.delete();
                    return null;
                }
                fileJ.delete();
            }
            n0();
            try {
                Object objNewInstance3 = Array.newInstance((Class<?>) w, 1);
                Array.set(objNewInstance3, 0, objNewInstance2);
                return (Typeface) z.invoke(null, objNewInstance3);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.uk2
    public final Typeface l(Context context, wv[] wvVarArr, int i) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Typeface typefaceL0;
        boolean zBooleanValue;
        if (wvVarArr.length >= 1) {
            try {
                if (this.r != null) {
                    HashMap map = new HashMap();
                    for (wv wvVar : wvVarArr) {
                        if (wvVar.e == 0) {
                            Uri uri = wvVar.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, wl2.q(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.q.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = wvVarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method = this.u;
                            if (i2 < length) {
                                wv wvVar2 = wvVarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(wvVar2.a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.s.invoke(objNewInstance, byteBuffer, Integer.valueOf(wvVar2.b), null, Integer.valueOf(wvVar2.c), Integer.valueOf(wvVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method.invoke(objNewInstance, null);
                            } else if (m0(objNewInstance) && (typefaceL0 = l0(objNewInstance)) != null) {
                                return Typeface.create(typefaceL0, i);
                            }
                        }
                    }
                } else {
                    wv wvVarO = o(wvVarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(wvVarO.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(wvVarO.c).setItalic(wvVarO.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    public Typeface l0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.p, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.v.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.uk2
    public final Typeface m(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        if (this.r == null) {
            return super.m(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.q.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!j0(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.u.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m0(objNewInstance)) {
                return l0(objNewInstance);
            }
        }
        return null;
    }

    public final boolean m0(Object obj) {
        try {
            return ((Boolean) this.t.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method p0(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
