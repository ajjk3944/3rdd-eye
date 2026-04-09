package com.google.android.gms.internal.measurement;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e5 {
    public static int A(int i10, ak.x0 x0Var) {
        switch (bk.b.f2801a[dr.a.v(i10).ordinal()]) {
            case 1:
                return x0Var.f781a;
            case 2:
                return x0Var.f782b;
            case 3:
                return x0Var.f783c;
            case 4:
                return x0Var.f784d;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return x0Var.f785e;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return x0Var.f786f;
            default:
                throw new bf.n();
        }
    }

    public static final int G(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static List H(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        br.l.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List I(Object... objArr) {
        br.l.e(objArr, "elements");
        return objArr.length > 0 ? mq.l.X(objArr) : mq.w.f16945a;
    }

    public static List J(Object obj) {
        return obj != null ? H(obj) : mq.w.f16945a;
    }

    public static final List L(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : H(list.get(0)) : mq.w.f16945a;
    }

    public static byte[] M(long j, String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(h0.b.o("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(h0.b.o("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(h0.b.o("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = bufferedInputStream.read(bArr);
                        if (i10 == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String N(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb2.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb2.toString();
                }
                sb2.append("\n");
                sb2.append(line2);
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static lb.g O(lb.g gVar, String[] strArr, Map map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (lb.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                lb.g gVar2 = new lb.g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a((lb.g) map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((lb.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a((lb.g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }

    public static void P() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void Q() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final List R(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(mq.o.r0(list)) : mq.w.f16945a;
    }

    public static final Map S(Map map) {
        int size = map.size();
        if (size == 0) {
            return mq.x.f16946a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) mq.o.q0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final boolean T(Throwable th2, ar.a aVar) {
        Collection collectionX;
        Object objInvoke;
        br.l.e(th2, "<this>");
        Integer num = uq.a.f23619a;
        y0.d dVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th2.getSuppressed();
            br.l.d(suppressed, "getSuppressed(...)");
            collectionX = mq.l.X(suppressed);
        } else {
            Method method = tq.a.f22952b;
            collectionX = (method == null || (objInvoke = method.invoke(th2, null)) == null) ? mq.w.f16945a : mq.l.X((Throwable[]) objInvoke);
        }
        boolean z10 = false;
        if (!collectionX.isEmpty()) {
            Iterator it = collectionX.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof y0.d) {
                    return false;
                }
            }
        }
        try {
            List list = (List) aVar.c();
            boolean zIsEmpty = list.isEmpty();
            z10 = !zIsEmpty;
            if (!zIsEmpty) {
                dVar = new y0.d(list);
            }
        } catch (Throwable th3) {
            dVar = th3;
        }
        if (dVar != null) {
            ir.f0.c(th2, dVar);
        }
        return z10;
    }

    public static dd.r U(List list) {
        if (list == null || list.isEmpty()) {
            return u(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((dd.r) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        dd.r rVar = new dd.r();
        dd.k kVar = new dd.k(list.size(), rVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            dd.r rVar2 = (dd.r) it2.next();
            dd.o oVar = dd.i.f7296b;
            rVar2.d(oVar, kVar);
            rVar2.c(oVar, kVar);
            rVar2.a(oVar, kVar);
        }
        return rVar;
    }

    public static dd.r V(dd.r... rVarArr) {
        if (rVarArr.length == 0) {
            return u(Collections.EMPTY_LIST);
        }
        List listAsList = Arrays.asList(rVarArr);
        return (listAsList == null || listAsList.isEmpty()) ? u(Collections.EMPTY_LIST) : U(listAsList).f(dd.i.f7295a, new dd.s(0, listAsList));
    }

    public static int W(int i10) {
        int[] iArr = {1, 2, 3};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static Object X(dd.r rVar) throws ExecutionException {
        if (rVar.j()) {
            return rVar.h();
        }
        if (rVar.f7321d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(rVar.g());
    }

    public static String Y(y4 y4Var) {
        StringBuilder sb2 = new StringBuilder(y4Var.c());
        for (int i10 = 0; i10 < y4Var.c(); i10++) {
            byte bA = y4Var.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb2.append("\\a");
                        break;
                    case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bA);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static a5 Z() {
        String str;
        ClassLoader classLoader = e5.class.getClassLoader();
        if (a5.class.equals(a5.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!a5.class.getPackage().equals(e5.class.getPackage())) {
                throw new IllegalArgumentException(a5.class.getName());
            }
            str = a5.class.getPackage().getName() + ".BlazeGenerated" + a5.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    w.g.p(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e4) {
                    throw new IllegalStateException(e4);
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new e5[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e13) {
                        Logger.getLogger(z4.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(a5.class.getSimpleName()), (Throwable) e13);
                    }
                }
                if (arrayList.size() == 1) {
                    return (a5) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (a5) a5.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(e14);
                } catch (NoSuchMethodException e15) {
                    throw new IllegalStateException(e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(e16);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ea A[Catch: RejectedExecutionException -> 0x01cf, TryCatch #0 {RejectedExecutionException -> 0x01cf, blocks: (B:125:0x01c8, B:133:0x01d8, B:135:0x01ea, B:141:0x01f7, B:143:0x0209, B:147:0x0213, B:137:0x01f0, B:129:0x01d1), top: B:178:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f0 A[Catch: RejectedExecutionException -> 0x01cf, TryCatch #0 {RejectedExecutionException -> 0x01cf, blocks: (B:125:0x01c8, B:133:0x01d8, B:135:0x01ea, B:141:0x01f7, B:143:0x0209, B:147:0x0213, B:137:0x01f0, B:129:0x01d1), top: B:178:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0209 A[Catch: RejectedExecutionException -> 0x01cf, TryCatch #0 {RejectedExecutionException -> 0x01cf, blocks: (B:125:0x01c8, B:133:0x01d8, B:135:0x01ea, B:141:0x01f7, B:143:0x0209, B:147:0x0213, B:137:0x01f0, B:129:0x01d1), top: B:178:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r21, final z0.m r22, final h2.j0 r23, final ar.k r24, final int r25, final boolean r26, final int r27, final int r28, g1.s r29, n0.p r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e5.a(java.lang.String, z0.m, h2.j0, ar.k, int, boolean, int, int, g1.s, n0.p, int, int):void");
    }

    public static final t2.e b(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        u2.a aVarA = u2.b.a(f10);
        if (aVarA == null) {
            aVarA = new t2.j(f10);
        }
        return new t2.e(f11, f10, aVarA);
    }

    public static void c(Appendable appendable, Object obj, ar.k kVar) {
        br.l.e(appendable, "<this>");
        if (kVar != null) {
            appendable.append((CharSequence) kVar.a(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static final void d(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("?");
            if (i11 < i10 - 1) {
                sb2.append(",");
            }
        }
    }

    public static ArrayList e(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new mq.j(objArr, true));
    }

    public static final String f(Context context) {
        br.l.e(context, "<this>");
        return context.getPackageName() + ".assistant.RECEIVE_BROADCAST_PERMISSION";
    }

    public static Object g(dd.r rVar) throws InterruptedException {
        cc.s.g("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        cc.s.i(rVar, "Task must not be null");
        if (rVar.i()) {
            return X(rVar);
        }
        dd.j jVar = new dd.j();
        Executor executor = dd.i.f7296b;
        rVar.d(executor, jVar);
        rVar.c(executor, jVar);
        rVar.a(executor, jVar);
        jVar.f7297a.await();
        return X(rVar);
    }

    public static Object h(dd.r rVar, long j, TimeUnit timeUnit) throws TimeoutException {
        cc.s.g("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        cc.s.i(rVar, "Task must not be null");
        cc.s.i(timeUnit, "TimeUnit must not be null");
        if (rVar.i()) {
            return X(rVar);
        }
        dd.j jVar = new dd.j();
        Executor executor = dd.i.f7296b;
        rVar.d(executor, jVar);
        rVar.c(executor, jVar);
        rVar.a(executor, jVar);
        if (jVar.f7297a.await(j, timeUnit)) {
            return X(rVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static int i(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        br.l.e(arrayList, "<this>");
        int size2 = arrayList.size();
        int i10 = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i11 = size - 1;
        while (i10 <= i11) {
            int i12 = (i10 + i11) >>> 1;
            int iN = se.b.n((Comparable) arrayList.get(i12), comparable);
            if (iN < 0) {
                i10 = i12 + 1;
            } else {
                if (iN <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final f1.c j(v1.m mVar) {
        v1.m mVarU = mVar.u();
        return mVarU != null ? mVarU.B(mVar, true) : new f1.c(0.0f, 0.0f, (int) (mVar.h() >> 32), (int) (mVar.h() & 4294967295L));
    }

    public static final f1.c k(x1.f1 f1Var) {
        v1.m mVarS = s(f1Var);
        float fH = (int) (mVarS.h() >> 32);
        float fH2 = (int) (mVarS.h() & 4294967295L);
        f1.c cVarB = mVarS.B(f1Var, true);
        float f10 = cVarB.f8404a;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > fH) {
            f10 = fH;
        }
        float f11 = cVarB.f8405b;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > fH2) {
            f11 = fH2;
        }
        float f12 = cVarB.f8406c;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 <= fH) {
            fH = f12;
        }
        float f13 = cVarB.f8407d;
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 <= fH2) {
            fH2 = f14;
        }
        if (f10 == fH || f11 == fH2) {
            return f1.c.f8403e;
        }
        long jA = mVarS.a((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
        long jA2 = mVarS.a((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(fH) << 32));
        long jA3 = mVarS.a((Float.floatToRawIntBits(fH) << 32) | (Float.floatToRawIntBits(fH2) & 4294967295L));
        long jA4 = mVarS.a((Float.floatToRawIntBits(fH2) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jA4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jA3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jA & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jA2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jA4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jA3 & 4294967295L));
        return new f1.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static nq.c l(nq.c cVar) {
        cVar.g();
        cVar.f18500g = true;
        return cVar.f18499d > 0 ? cVar : nq.c.f18497r;
    }

    public static final Bundle m(lq.l... lVarArr) {
        Bundle bundle = new Bundle(lVarArr.length);
        for (lq.l lVar : lVarArr) {
            String str = (String) lVar.f15571a;
            Object obj = lVar.f15572d;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                br.l.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static dd.r n(Executor executor, Callable callable) {
        cc.s.i(executor, "Executor must not be null");
        dd.r rVar = new dd.r();
        executor.execute(new re.a(rVar, 13, callable));
        return rVar;
    }

    public static void o(long j, fb.f fVar, ca.x[] xVarArr) {
        int i10;
        while (true) {
            if (fVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (fVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int iO = fVar.o();
                i11 += iO;
                if (iO != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (fVar.a() == 0) {
                    i12 = -1;
                    break;
                }
                int iO2 = fVar.o();
                i12 += iO2;
                if (iO2 != 255) {
                    break;
                }
            }
            int i13 = fVar.f8801b + i12;
            if (i12 == -1 || i12 > fVar.a()) {
                io.sentry.android.core.e0.p("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = fVar.f8802c;
            } else if (i10 == 4 && i12 >= 8) {
                int iO3 = fVar.o();
                int iT = fVar.t();
                int iD = iT == 49 ? fVar.d() : 0;
                int iO4 = fVar.o();
                if (iT == 47) {
                    fVar.z(1);
                }
                boolean z10 = iO3 == 181 && (iT == 49 || iT == 47) && iO4 == 3;
                if (iT == 49) {
                    z10 &= iD == 1195456820;
                }
                if (z10) {
                    p(j, fVar, xVarArr);
                }
            }
            fVar.y(i13);
        }
    }

    public static void p(long j, fb.f fVar, ca.x[] xVarArr) {
        long j7;
        int iO = fVar.o();
        if ((iO & 64) != 0) {
            fVar.z(1);
            int i10 = (iO & 31) * 3;
            int i11 = fVar.f8801b;
            int length = xVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                ca.x xVar = xVarArr[i12];
                fVar.y(i11);
                xVar.a(i10, fVar);
                if (j != -9223372036854775807L) {
                    j7 = j;
                    xVar.d(j7, 1, i10, 0, null);
                } else {
                    j7 = j;
                }
                i12++;
                j = j7;
            }
        }
    }

    public static at.n q(String str, List list) {
        at.m mVar;
        br.l.e(str, "debugName");
        rt.f fVar = new rt.f();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mVar = at.m.f2303b;
            if (!zHasNext) {
                break;
            }
            at.n nVar = (at.n) it.next();
            if (nVar != mVar) {
                if (nVar instanceof at.a) {
                    at.n[] nVarArr = ((at.a) nVar).f2266c;
                    br.l.e(nVarArr, "elements");
                    fVar.addAll(mq.l.X(nVarArr));
                } else {
                    fVar.add(nVar);
                }
            }
        }
        int i10 = fVar.f21790a;
        return i10 != 0 ? i10 != 1 ? new at.a(str, (at.n[]) fVar.toArray(new at.n[0])) : (at.n) fVar.get(0) : mVar;
    }

    public static boolean r(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!r(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static final v1.m s(v1.m mVar) {
        v1.m mVar2;
        v1.m mVarU = mVar.u();
        while (true) {
            v1.m mVar3 = mVarU;
            mVar2 = mVar;
            mVar = mVar3;
            if (mVar == null) {
                break;
            }
            mVarU = mVar.u();
        }
        x1.f1 f1Var = mVar2 instanceof x1.f1 ? (x1.f1) mVar2 : null;
        if (f1Var == null) {
            return mVar2;
        }
        x1.f1 f1Var2 = f1Var.f24823q;
        while (true) {
            x1.f1 f1Var3 = f1Var2;
            x1.f1 f1Var4 = f1Var;
            f1Var = f1Var3;
            if (f1Var == null) {
                return f1Var4;
            }
            f1Var2 = f1Var.f24823q;
        }
    }

    public static dd.r t(Exception exc) {
        dd.r rVar = new dd.r();
        rVar.n(exc);
        return rVar;
    }

    public static dd.r u(Object obj) {
        dd.r rVar = new dd.r();
        rVar.l(obj);
        return rVar;
    }

    public static ni.j v(String str) {
        if (str != null && str.length() != 0 && !tt.l.D0(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new ni.j(xu.d.K("connection_id", jSONObject), xu.d.C("connection_start_time", jSONObject), xu.d.C("connection_tx_bytes", jSONObject), xu.d.C("connection_tx_bytes_wifi", jSONObject), xu.d.C("connection_tx_bytes_cell", jSONObject), xu.d.C("connection_rx_bytes", jSONObject), xu.d.C("connection_rx_bytes_wifi", jSONObject), xu.d.C("connection_rx_bytes_cell", jSONObject));
            } catch (JSONException unused) {
                ch.n.c("DeviceConnectionCoreResult", "Trying to parse invalid JSON: ".concat(str));
            }
        }
        return null;
    }

    public static js.s w(xu.d dVar) {
        if (dVar instanceof ps.e) {
            ps.e eVar = (ps.e) dVar;
            String str = eVar.j;
            String str2 = eVar.k;
            br.l.e(str, "name");
            br.l.e(str2, "desc");
            return new js.s(str.concat(str2));
        }
        if (!(dVar instanceof ps.d)) {
            throw new bf.n();
        }
        ps.d dVar2 = (ps.d) dVar;
        String str3 = dVar2.j;
        String str4 = dVar2.k;
        br.l.e(str3, "name");
        br.l.e(str4, "desc");
        return new js.s(str3 + '#' + str4);
    }

    public static final ir.d x(iu.e eVar) {
        br.l.e(eVar, "<this>");
        if (eVar instanceof ku.x0) {
            return x(((ku.x0) eVar).f14636a);
        }
        return null;
    }

    public static final jv.a y(ComponentCallbacks componentCallbacks) {
        br.l.e(componentCallbacks, "<this>");
        if (componentCallbacks instanceof kv.a) {
            return ((kv.a) componentCallbacks).getKoin();
        }
        jv.a aVar = lv.a.f15967b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static int z(List list) {
        br.l.e(list, "<this>");
        return list.size() - 1;
    }

    public abstract String B();

    public abstract String C();

    public abstract int D(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int E();

    public abstract ViewPropertyAnimator F(View view, int i10);

    public String K(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] strArrSplit = str.split(B());
        StringBuilder sb2 = new StringBuilder();
        int length = strArrSplit.length - 2;
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            if (i10 < length) {
                sb2.append(strArrSplit[i10]);
            } else {
                sb2.append("x");
            }
            if (i10 < strArrSplit.length - 1) {
                sb2.append(C());
            }
        }
        return sb2.toString();
    }
}
