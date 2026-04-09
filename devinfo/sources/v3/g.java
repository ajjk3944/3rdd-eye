package v3;

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
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends wd.b {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f35808b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f35809c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f35810d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f35811e;

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
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f35809c = constructor;
        f35808b = cls;
        f35810d = method2;
        f35811e = method;
    }

    public static boolean V(Object obj, ByteBuffer byteBuffer, int i4, int i10, boolean z3) {
        try {
            return ((Boolean) f35810d.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i10), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface W(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f35808b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f35811e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // wd.b
    public final Typeface h(Context context, u3.e eVar, Resources resources, int i4) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f35809c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (u3.f fVar : eVar.f35075a) {
                int i10 = fVar.f35081f;
                File fileO = a.a.o(context);
                if (fileO != null) {
                    try {
                        if (a.a.d(fileO, resources, i10)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileO);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } finally {
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            if (map != null && V(objNewInstance, map, fVar.f35080e, fVar.f35077b, fVar.f35078c)) {
                            }
                        }
                    } finally {
                        fileO.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return W(objNewInstance);
        }
        return null;
    }

    @Override // wd.b
    public final Typeface i(Context context, b4.k[] kVarArr, int i4) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f35809c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i10 = 0;
            n0 n0Var = new n0(0);
            int length = kVarArr.length;
            while (true) {
                if (i10 < length) {
                    b4.k kVar = kVarArr[i10];
                    Uri uri = kVar.f1694a;
                    ByteBuffer byteBufferV = (ByteBuffer) n0Var.get(uri);
                    if (byteBufferV == null) {
                        byteBufferV = a.a.v(context, uri);
                        n0Var.put(uri, byteBufferV);
                    }
                    if (byteBufferV == null || !V(objNewInstance, byteBufferV, kVar.f1695b, kVar.f1696c, kVar.f1697d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface typefaceW = W(objNewInstance);
                    if (typefaceW != null) {
                        return Typeface.create(typefaceW, i4);
                    }
                }
            }
        }
        return null;
    }
}
