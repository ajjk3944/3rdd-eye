package k3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.measurement.b4;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class j extends h {

    /* renamed from: g, reason: collision with root package name */
    public final Class f14032g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f14033h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f14034i;
    public final Method j;
    public final Method k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f14035l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f14036m;

    public j() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodM0;
        Constructor<?> constructor;
        Method methodL0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodL0 = l0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodM0 = m0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            e0.c("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e4.getClass().getName()), e4);
            methodM0 = null;
            constructor = null;
            methodL0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f14032g = cls;
        this.f14033h = constructor;
        this.f14034i = methodL0;
        this.j = method;
        this.k = method2;
        this.f14035l = method3;
        this.f14036m = methodM0;
    }

    public static Method l0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // k3.h, com.google.android.gms.internal.measurement.y3
    public final Typeface i(Context context, j3.e eVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f14034i;
        if (method == null) {
            e0.p("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.i(context, eVar, resources, i10);
        }
        try {
            objNewInstance = this.f14033h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            j3.f[] fVarArr = eVar.f13176a;
            int length = fVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    j3.f fVar = fVarArr[i11];
                    Context context2 = context;
                    if (i0(context2, objNewInstance, fVar.f13177a, fVar.f13181e, fVar.f13178b, fVar.f13179c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f13180d))) {
                        i11++;
                        context = context2;
                    } else {
                        try {
                            this.f14035l.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (k0(objNewInstance)) {
                    return j0(objNewInstance);
                }
            }
        }
        return null;
    }

    public final boolean i0(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f14034i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // k3.h, com.google.android.gms.internal.measurement.y3
    public final Typeface j(Context context, q3.i[] iVarArr, int i10) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Typeface typefaceJ0;
        boolean zBooleanValue;
        if (iVarArr.length >= 1) {
            Method method = this.f14034i;
            if (method == null) {
                e0.p("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (q3.i iVar : iVarArr) {
                        if (iVar.f20708e == 0) {
                            Uri uri = iVar.f20704a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, b4.N(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f14033h.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = iVarArr.length;
                        int i11 = 0;
                        boolean z10 = false;
                        while (true) {
                            Method method2 = this.f14035l;
                            if (i11 < length) {
                                q3.i iVar2 = iVarArr[i11];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(iVar2.f20704a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.j.invoke(objNewInstance, byteBuffer, Integer.valueOf(iVar2.f20705b), null, Integer.valueOf(iVar2.f20706c), Integer.valueOf(iVar2.f20707d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z10 = true;
                                }
                                i11++;
                                z10 = z10;
                            } else if (!z10) {
                                method2.invoke(objNewInstance, null);
                            } else if (k0(objNewInstance) && (typefaceJ0 = j0(objNewInstance)) != null) {
                                return Typeface.create(typefaceJ0, i10);
                            }
                        }
                    }
                } else {
                    q3.i iVarR = r(iVarArr, i10);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(iVarR.f20704a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(iVarR.f20706c).setItalic(iVarR.f20707d).build();
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

    public Typeface j0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f14032g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f14036m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k0(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final Typeface m(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f14034i;
        if (method == null) {
            e0.p("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.m(context, resources, i10, str, i11);
        }
        try {
            objNewInstance = this.f14033h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!i0(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f14035l.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (k0(objNewInstance)) {
                return j0(objNewInstance);
            }
        }
        return null;
    }

    public Method m0(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
