package C0;

import B0.e;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.singular.sdk.internal.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes.dex */
public class i extends n {

    /* renamed from: a, reason: collision with root package name */
    public static Class<?> f811a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor<?> f812b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f813c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f814d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f815e = false;

    public static boolean f(Object obj, String str, int i, boolean z10) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        g();
        try {
        } catch (IllegalAccessException | InvocationTargetException e4) {
            e = e4;
        }
        try {
            return ((Boolean) f813c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z10))).booleanValue();
        } catch (InvocationTargetException e10) {
            e = e10;
            throw new RuntimeException(e);
        }
    }

    public static void g() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f815e) {
            return;
        }
        f815e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            try {
                method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            } catch (NoSuchMethodException e4) {
                e = e4;
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                cls = null;
                method = null;
                constructor = null;
                method2 = null;
                f812b = constructor;
                f811a = cls;
                f813c = method2;
                f814d = method;
            }
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            e = e10;
        }
        f812b = constructor;
        f811a = cls;
        f813c = method2;
        f814d = method;
    }

    @Override // C0.n
    public Typeface a(Context context, e.c cVar, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        g();
        try {
            Object objNewInstance = f812b.newInstance(new Object[0]);
            for (e.d dVar : cVar.f345a) {
                File fileD = o.d(context);
                if (fileD == null) {
                    return null;
                }
                try {
                    if (!o.b(fileD, resources, dVar.f351f)) {
                        return null;
                    }
                    if (!f(objNewInstance, fileD.getPath(), dVar.f347b, dVar.f348c)) {
                        return null;
                    }
                    fileD.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileD.delete();
                }
            }
            g();
            try {
                Object objNewInstance2 = Array.newInstance(f811a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f814d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // C0.n
    public Typeface b(Context context, H0.m[] mVarArr, int i) throws IOException {
        String str;
        if (mVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(e(i, mVarArr).f2006a, Constants.REVENUE_AMOUNT_KEY, null);
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
                            Typeface typefaceC = c(context, fileInputStream);
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceC;
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
