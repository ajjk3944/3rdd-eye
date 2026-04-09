package C0;

import B0.e;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f820f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor<?> f821g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f822h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f823j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f824k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f825l;

    public k() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodM;
        Method method2;
        Method method3;
        Method methodN;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodM = m(cls);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodN = n(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e4.getClass().getName()), e4);
            cls = null;
            method = null;
            constructor = null;
            methodM = null;
            method2 = null;
            method3 = null;
            methodN = null;
        }
        this.f820f = cls;
        this.f821g = constructor;
        this.f822h = methodM;
        this.i = method2;
        this.f823j = method3;
        this.f824k = method;
        this.f825l = methodN;
    }

    public static Method m(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // C0.i, C0.n
    public final Typeface a(Context context, e.c cVar, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f822h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.a(context, cVar, resources, i);
        }
        Object objL = l();
        if (objL != null) {
            e.d[] dVarArr = cVar.f345a;
            int length = dVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                e.d dVar = dVarArr[i10];
                String str = dVar.f346a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(dVar.f349d);
                Context context2 = context;
                if (!i(context2, objL, str, dVar.f350e, dVar.f347b, dVar.f348c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    h(objL);
                    return null;
                }
                i10++;
                context = context2;
            }
            if (k(objL)) {
                return j(objL);
            }
        }
        return null;
    }

    @Override // C0.i, C0.n
    public final Typeface b(Context context, H0.m[] mVarArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceJ;
        boolean zBooleanValue;
        if (mVarArr.length >= 1) {
            Method method = this.f822h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (H0.m mVar : mVarArr) {
                    if (mVar.f2010e == 0) {
                        Uri uri = mVar.f2006a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, o.e(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objL = l();
                if (objL != null) {
                    int length = mVarArr.length;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 < length) {
                        H0.m mVar2 = mVarArr[i10];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(mVar2.f2006a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.i.invoke(objL, byteBuffer, Integer.valueOf(mVar2.f2007b), null, Integer.valueOf(mVar2.f2008c), Integer.valueOf(mVar2.f2009d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                h(objL);
                                return null;
                            }
                            z10 = true;
                        }
                        i10++;
                        z10 = z10;
                    }
                    if (!z10) {
                        h(objL);
                        return null;
                    }
                    if (k(objL) && (typefaceJ = j(objL)) != null) {
                        return Typeface.create(typefaceJ, i);
                    }
                }
            } else {
                H0.m mVarE = e(i, mVarArr);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mVarE.f2006a, Constants.REVENUE_AMOUNT_KEY, null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(mVarE.f2008c).setItalic(mVarE.f2009d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // C0.n
    public final Typeface d(Context context, Resources resources, int i, String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f822h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.d(context, resources, i, str, i10);
        }
        Object objL = l();
        if (objL != null) {
            if (!i(context, objL, str, 0, -1, -1, null)) {
                h(objL);
                return null;
            }
            if (k(objL)) {
                return j(objL);
            }
        }
        return null;
    }

    public final void h(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f824k.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f822h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f820f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f825l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f823j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object l() {
        try {
            return this.f821g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method n(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
