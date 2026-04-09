package v3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f extends wd.b {

    /* renamed from: b, reason: collision with root package name */
    public static Class f35803b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f35804c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f35805d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f35806e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f35807f = false;

    public static boolean V(Object obj, String str, int i4, boolean z3) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        W();
        try {
        } catch (IllegalAccessException | InvocationTargetException e2) {
            e = e2;
        }
        try {
            return ((Boolean) f35805d.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (InvocationTargetException e10) {
            e = e10;
            throw new RuntimeException(e);
        }
    }

    public static void W() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f35807f) {
            return;
        }
        f35807f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f35804c = constructor;
        f35803b = cls;
        f35805d = method2;
        f35806e = method;
    }

    @Override // wd.b
    public Typeface h(Context context, u3.e eVar, Resources resources, int i4) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        W();
        try {
            Object objNewInstance = f35804c.newInstance(null);
            for (u3.f fVar : eVar.f35075a) {
                File fileO = a.a.o(context);
                if (fileO == null) {
                    return null;
                }
                try {
                    if (!a.a.d(fileO, resources, fVar.f35081f)) {
                        return null;
                    }
                    if (!V(objNewInstance, fileO.getPath(), fVar.f35077b, fVar.f35078c)) {
                        return null;
                    }
                    fileO.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileO.delete();
                }
            }
            W();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f35803b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f35806e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // wd.b
    public Typeface i(Context context, b4.k[] kVarArr, int i4) throws IOException {
        String str;
        if (kVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(n(kVarArr, i4).f1694a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } catch (ErrnoException unused) {
                        }
                        File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        if (file != null && file.canRead()) {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            Typeface typefaceK = k(context, fileInputStream);
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceK;
                        } finally {
                        }
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
        return null;
    }
}
