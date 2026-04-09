package k3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.y3;
import io.sentry.android.core.e0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import u.i0;

/* loaded from: classes.dex */
public final class i extends y3 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f14028b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f14029c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f14030d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f14031e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            e0.c("TypefaceCompatApi24Impl", e4.getClass().getName(), e4);
            cls = null;
            method = null;
            method2 = null;
        }
        f14029c = constructor;
        f14028b = cls;
        f14030d = method2;
        f14031e = method;
    }

    public static boolean g0(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f14030d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface h0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f14028b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f14031e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final Typeface i(Context context, j3.e eVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f14029c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (j3.f fVar : eVar.f13176a) {
                int i11 = fVar.f13182f;
                File fileH = b4.H(context);
                if (fileH != null) {
                    try {
                        if (b4.o(fileH, resources, i11)) {
                            try {
                                FileInputStream fileInputStreamJ = xu.d.j(fileH, new FileInputStream(fileH));
                                try {
                                    FileChannel channel = fileInputStreamJ.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStreamJ.close();
                                } finally {
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            if (map != null && g0(objNewInstance, map, fVar.f13181e, fVar.f13178b, fVar.f13179c)) {
                            }
                        }
                    } finally {
                        fileH.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return h0(objNewInstance);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final Typeface j(Context context, q3.i[] iVarArr, int i10) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f14029c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i11 = 0;
            i0 i0Var = new i0(0);
            int length = iVarArr.length;
            while (true) {
                if (i11 < length) {
                    q3.i iVar = iVarArr[i11];
                    Uri uri = iVar.f20704a;
                    ByteBuffer byteBufferN = (ByteBuffer) i0Var.get(uri);
                    if (byteBufferN == null) {
                        byteBufferN = b4.N(context, uri);
                        i0Var.put(uri, byteBufferN);
                    }
                    if (byteBufferN == null || !g0(objNewInstance, byteBufferN, iVar.f20705b, iVar.f20706c, iVar.f20707d)) {
                        break;
                    }
                    i11++;
                } else {
                    Typeface typefaceH0 = h0(objNewInstance);
                    if (typefaceH0 != null) {
                        return Typeface.create(typefaceH0, i10);
                    }
                }
            }
        }
        return null;
    }
}
