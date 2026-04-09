package C0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import m0.C5316i;

/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f816a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor<?> f817b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f818c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f819d;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            try {
                Class<?> cls2 = Integer.TYPE;
                method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
                method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            } catch (NoSuchMethodException e4) {
                e = e4;
                Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
                cls = null;
                method = null;
                constructor = null;
                method2 = null;
                f817b = constructor;
                f816a = cls;
                f818c = method2;
                f819d = method;
            }
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            e = e10;
        }
        f817b = constructor;
        f816a = cls;
        f818c = method2;
        f819d = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i, int i10, boolean z10) {
        try {
            return ((Boolean) f818c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(f816a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f819d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068 A[SYNTHETIC] */
    @Override // C0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface a(android.content.Context r17, B0.e.c r18, android.content.res.Resources r19, int r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r16 = this;
            r1 = 0
            r0 = 0
            java.lang.reflect.Constructor<?> r2 = C0.j.f817b     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 != 0) goto Lf
            goto L68
        Lf:
            r3 = r18
            B0.e$d[] r3 = r3.f345a
            int r4 = r3.length
            r5 = r0
        L15:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f351f
            java.io.File r7 = C0.o.d(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L59
        L25:
            r8 = r19
            boolean r0 = C0.o.b(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            goto L68
        L5c:
            int r7 = r6.f347b
            boolean r9 = r6.f348c
            int r6 = r6.f350e
            boolean r0 = f(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
        L68:
            return r1
        L69:
            int r5 = r5 + 1
            goto L15
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.j.a(android.content.Context, B0.e$c, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // C0.n
    public final Typeface b(Context context, H0.m[] mVarArr, int i) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        int i10 = 0;
        try {
            objNewInstance = f817b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C5316i c5316i = new C5316i();
            int length = mVarArr.length;
            while (true) {
                if (i10 >= length) {
                    Typeface typefaceG = g(objNewInstance);
                    if (typefaceG != null) {
                        return Typeface.create(typefaceG, i);
                    }
                } else {
                    H0.m mVar = mVarArr[i10];
                    Uri uri = mVar.f2006a;
                    ByteBuffer byteBufferE = (ByteBuffer) c5316i.get(uri);
                    if (byteBufferE == null) {
                        byteBufferE = o.e(context, uri);
                        c5316i.put(uri, byteBufferE);
                    }
                    if (byteBufferE == null) {
                        break;
                    }
                    if (!f(objNewInstance, byteBufferE, mVar.f2007b, mVar.f2008c, mVar.f2009d)) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return null;
    }
}
