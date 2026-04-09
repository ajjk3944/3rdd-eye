package J;

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

/* loaded from: classes.dex */
public class g extends com.bumptech.glide.e {

    /* renamed from: c, reason: collision with root package name */
    public static Class f2016c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f2017d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f2018e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f2019f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2020g = false;

    public static boolean B(Object obj, String str, int i, boolean z6) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        C();
        try {
        } catch (IllegalAccessException | InvocationTargetException e6) {
            e = e6;
        }
        try {
            return ((Boolean) f2018e.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z6))).booleanValue();
        } catch (InvocationTargetException e7) {
            e = e7;
            throw new RuntimeException(e);
        }
    }

    public static void C() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2020g) {
            return;
        }
        f2020g = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
            method = null;
            cls = null;
            method2 = null;
        }
        f2017d = constructor;
        f2016c = cls;
        f2018e = method2;
        f2019f = method;
    }

    @Override // com.bumptech.glide.e
    public Typeface d(Context context, I.f fVar, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        C();
        try {
            Object objNewInstance = f2017d.newInstance(null);
            for (I.g gVar : fVar.f1853a) {
                File fileQ = I5.b.q(context);
                if (fileQ == null) {
                    return null;
                }
                try {
                    if (!I5.b.h(fileQ, resources, gVar.f1859f)) {
                        return null;
                    }
                    if (!B(objNewInstance, fileQ.getPath(), gVar.f1855b, gVar.f1856c)) {
                        return null;
                    }
                    fileQ.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileQ.delete();
                }
            }
            C();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f2016c, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f2019f.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // com.bumptech.glide.e
    public Typeface e(Context context, O.i[] iVarArr, int i) throws IOException {
        String str;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(j(iVarArr, i).f3052a, "r", null);
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
                            Typeface typefaceG = g(context, fileInputStream);
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceG;
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
