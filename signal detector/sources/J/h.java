package J;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
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
import u.C2940i;

/* loaded from: classes.dex */
public final class h extends com.bumptech.glide.e {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f2021c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f2022d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f2023e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f2024f;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi24Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            method2 = null;
        }
        f2022d = constructor;
        f2021c = cls;
        f2023e = method2;
        f2024f = method;
    }

    public static boolean B(Object obj, ByteBuffer byteBuffer, int i, int i3, boolean z6) {
        try {
            return ((Boolean) f2023e.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i3), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface C(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f2021c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f2024f.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.bumptech.glide.e
    public final Typeface d(Context context, I.f fVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f2022d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (I.g gVar : fVar.f1853a) {
                int i3 = gVar.f1859f;
                File fileQ = I5.b.q(context);
                if (fileQ != null) {
                    try {
                        if (I5.b.h(fileQ, resources, i3)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileQ);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } finally {
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            if (map != null && B(objNewInstance, map, gVar.f1858e, gVar.f1855b, gVar.f1856c)) {
                            }
                        }
                    } finally {
                        fileQ.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return C(objNewInstance);
        }
        return null;
    }

    @Override // com.bumptech.glide.e
    public final Typeface e(Context context, O.i[] iVarArr, int i) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f2022d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i3 = 0;
            C2940i c2940i = new C2940i(0);
            int length = iVarArr.length;
            while (true) {
                if (i3 < length) {
                    O.i iVar = iVarArr[i3];
                    Uri uri = iVar.f3052a;
                    ByteBuffer byteBufferT = (ByteBuffer) c2940i.get(uri);
                    if (byteBufferT == null) {
                        byteBufferT = I5.b.t(context, uri);
                        c2940i.put(uri, byteBufferT);
                    }
                    if (byteBufferT == null || !B(objNewInstance, byteBufferT, iVar.f3053b, iVar.f3054c, iVar.f3055d)) {
                        break;
                    }
                    i3++;
                } else {
                    Typeface typefaceC = C(objNewInstance);
                    if (typefaceC != null) {
                        return Typeface.create(typefaceC, i);
                    }
                }
            }
        }
        return null;
    }
}
