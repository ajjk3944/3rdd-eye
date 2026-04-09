package k3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.y3;
import io.sentry.android.core.e0;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class h extends y3 {

    /* renamed from: b, reason: collision with root package name */
    public static Class f14023b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f14024c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f14025d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f14026e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f14027f = false;

    public static boolean g0(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        h0();
        try {
            return ((Boolean) f14025d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void h0() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f14027f) {
            return;
        }
        f14027f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            e0.c("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f14024c = constructor;
        f14023b = cls;
        f14025d = method2;
        f14026e = method;
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public Typeface i(Context context, j3.e eVar, Resources resources, int i10) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        h0();
        try {
            Object objNewInstance = f14024c.newInstance(null);
            for (j3.f fVar : eVar.f13176a) {
                File fileH = b4.H(context);
                if (fileH == null) {
                    return null;
                }
                try {
                    if (!b4.o(fileH, resources, fVar.f13182f)) {
                        return null;
                    }
                    if (!g0(objNewInstance, fileH.getPath(), fVar.f13178b, fVar.f13179c)) {
                        return null;
                    }
                    fileH.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileH.delete();
                }
            }
            h0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f14023b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f14026e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public Typeface j(Context context, q3.i[] iVarArr, int i10) throws IOException {
        String str;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(r(iVarArr, i10).f20704a, "r", null);
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
                        FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                        FileInputStream fileInputStreamK = xu.d.k(new FileInputStream(fileDescriptor), fileDescriptor);
                        try {
                            Typeface typefaceL = l(context, fileInputStreamK);
                            fileInputStreamK.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceL;
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
