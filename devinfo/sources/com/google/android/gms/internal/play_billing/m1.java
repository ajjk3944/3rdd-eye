package com.google.android.gms.internal.play_billing;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.measurement.d5;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class m1 {
    public static File A(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, d.h.s(str2, ".temp"));
    }

    public static final boolean B(int i4, g3.f fVar, n1.s sVar, o1.c cVar) {
        n1.s sVarK;
        w0.e eVar = new w0.e(new n1.s[16]);
        if (!sVar.f25554a.f25565n) {
            f2.a.b("visitChildren called on an unattached node");
        }
        w0.e eVar2 = new w0.e(new i1.m[16]);
        i1.m mVar = sVar.f25554a;
        i1.m mVar2 = mVar.f25559f;
        if (mVar2 == null) {
            i2.k.b(eVar2, mVar);
        } else {
            eVar2.b(mVar2);
        }
        while (true) {
            int i10 = eVar2.f36399c;
            if (i10 == 0) {
                break;
            }
            i1.m mVarE = (i1.m) eVar2.l(i10 - 1);
            if ((mVarE.f25557d & Segment.SHARE_MINIMUM) == 0) {
                i2.k.b(eVar2, mVarE);
            } else {
                while (true) {
                    if (mVarE == null) {
                        break;
                    }
                    if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0) {
                        w0.e eVar3 = null;
                        while (mVarE != null) {
                            if (mVarE instanceof n1.s) {
                                n1.s sVar2 = (n1.s) mVarE;
                                if (sVar2.f25565n) {
                                    eVar.b(sVar2);
                                }
                            } else if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof i2.j)) {
                                int i11 = 0;
                                for (i1.m mVar3 = ((i2.j) mVarE).f25691p; mVar3 != null; mVar3 = mVar3.f25559f) {
                                    if ((mVar3.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            mVarE = mVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new w0.e(new i1.m[16]);
                                            }
                                            if (mVarE != null) {
                                                eVar3.b(mVarE);
                                                mVarE = null;
                                            }
                                            eVar3.b(mVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            mVarE = i2.k.e(eVar3);
                        }
                    } else {
                        mVarE = mVarE.f25559f;
                    }
                }
            }
        }
        while (eVar.f36399c != 0 && (sVarK = k(eVar, cVar, i4)) != null) {
            if (sVarK.r0().f29530a) {
                return ((Boolean) fVar.invoke(sVarK)).booleanValue();
            }
            if (m(i4, fVar, sVarK, cVar)) {
                return true;
            }
            eVar.k(sVarK);
        }
        return false;
    }

    public static final int C(t6.g0 g0Var) {
        nk.k.e(g0Var, "state");
        int iOrdinal = g0Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i4 = 1;
        if (iOrdinal != 1) {
            i4 = 2;
            if (iOrdinal != 2) {
                i4 = 3;
                if (iOrdinal != 3) {
                    i4 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new ac.m();
                    }
                }
            }
        }
        return i4;
    }

    public static final t4.d D(String str) {
        nk.k.e(str, "name");
        return new t4.d(str);
    }

    public static final c7.h E(byte[] bArr) throws IOException {
        nk.k.e(bArr, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new c7.h(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i4 = objectInputStream.readInt();
                int[] iArr = new int[i4];
                for (int i10 = 0; i10 < i4; i10++) {
                    iArr[i10] = objectInputStream.readInt();
                }
                int i11 = objectInputStream.readInt();
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr2[i12] = objectInputStream.readInt();
                }
                c7.h hVarA = c7.a.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return hVarA;
            } finally {
            }
        } finally {
        }
    }

    public static final Boolean F(int i4, g3.f fVar, n1.s sVar, o1.c cVar) {
        int iOrdinal = sVar.u0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                n1.s sVarI = com.google.android.gms.internal.measurement.z3.i(sVar);
                if (sVarI == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = sVarI.u0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolF = F(i4, fVar, sVarI, cVar);
                        if (!nk.k.a(boolF, Boolean.FALSE)) {
                            return boolF;
                        }
                        if (cVar == null) {
                            if (sVarI.u0() != n1.q.f29545b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            n1.s sVarE = com.google.android.gms.internal.measurement.z3.e(sVarI);
                            if (sVarE == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cVar = com.google.android.gms.internal.measurement.z3.h(sVarE);
                        }
                        return Boolean.valueOf(m(i4, fVar, sVar, cVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new ac.m();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cVar == null) {
                    cVar = com.google.android.gms.internal.measurement.z3.h(sVarI);
                }
                return Boolean.valueOf(m(i4, fVar, sVar, cVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return sVar.r0().f29530a ? (Boolean) fVar.invoke(sVar) : cVar == null ? Boolean.valueOf(l(sVar, i4, fVar)) : Boolean.valueOf(B(i4, fVar, sVar, cVar));
                }
                throw new ac.m();
            }
        }
        return Boolean.valueOf(l(sVar, i4, fVar));
    }

    public static File G(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static void H(Object[] objArr, int i4) {
        for (int i10 = 0; i10 < i4; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(d.h.q(i10, "at index ", new StringBuilder(String.valueOf(i10).length() + 9)));
            }
        }
    }

    public static i1 I() {
        String str;
        ClassLoader classLoader = m1.class.getClassLoader();
        if (i1.class.equals(i1.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!i1.class.getPackage().equals(m1.class.getPackage())) {
                throw new IllegalArgumentException(i1.class.getName());
            }
            str = i1.class.getPackage().getName() + ".BlazeGenerated" + i1.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    d.h.C(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e2) {
                    throw new IllegalStateException(e2);
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
                Iterator it = Arrays.asList(new m1[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e13) {
                        Logger.getLogger(h1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(i1.class.getSimpleName()), (Throwable) e13);
                    }
                }
                if (arrayList.size() == 1) {
                    return (i1) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (i1) i1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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

    public static boolean J(byte b10) {
        return b10 > -65;
    }

    public static final long a(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static float b(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float c(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.f30368c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f30366a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f30369d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f30367b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(o1.c r18, o1.c r19, o1.c r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = e(r3, r2, r0)
            float r5 = r2.f30367b
            float r6 = r2.f30369d
            float r7 = r2.f30366a
            float r2 = r2.f30368c
            float r8 = r0.f30369d
            float r9 = r0.f30367b
            float r10 = r0.f30368c
            float r11 = r0.f30366a
            r12 = 0
            if (r4 != 0) goto La3
            boolean r0 = e(r3, r1, r0)
            if (r0 != 0) goto L27
            goto La3
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L9c
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L44:
            if (r3 != r13) goto L9d
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L9c
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.f30368c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.f30366a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.f30369d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L96
            float r1 = r1.f30367b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L9c:
            return r18
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        La3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.m1.d(o1.c, o1.c, o1.c, int):boolean");
    }

    public static final boolean e(int i4, o1.c cVar, o1.c cVar2) {
        if (i4 == 3 || i4 == 4) {
            return cVar.f30369d > cVar2.f30367b && cVar.f30367b < cVar2.f30369d;
        }
        if (i4 == 5 || i4 == 6) {
            return cVar.f30368c > cVar2.f30366a && cVar.f30366a < cVar2.f30368c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final LinkedHashSet f(byte[] bArr) throws IOException {
        nk.k.e(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i4 = objectInputStream.readInt();
                    for (int i10 = 0; i10 < i4; i10++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z3 = objectInputStream.readBoolean();
                        nk.k.b(uri);
                        linkedHashSet.add(new t6.d(z3, uri));
                    }
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static void g(Object[] objArr, int i4) {
        for (int i10 = 0; i10 < i4; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
    }

    public static final void h(n1.s sVar, w0.e eVar) {
        if (!sVar.f25554a.f25565n) {
            f2.a.b("visitChildren called on an unattached node");
        }
        w0.e eVar2 = new w0.e(new i1.m[16]);
        i1.m mVar = sVar.f25554a;
        i1.m mVar2 = mVar.f25559f;
        if (mVar2 == null) {
            i2.k.b(eVar2, mVar);
        } else {
            eVar2.b(mVar2);
        }
        while (true) {
            int i4 = eVar2.f36399c;
            if (i4 == 0) {
                return;
            }
            i1.m mVarE = (i1.m) eVar2.l(i4 - 1);
            if ((mVarE.f25557d & Segment.SHARE_MINIMUM) == 0) {
                i2.k.b(eVar2, mVarE);
            } else {
                while (true) {
                    if (mVarE == null) {
                        break;
                    }
                    if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0) {
                        w0.e eVar3 = null;
                        while (mVarE != null) {
                            if (mVarE instanceof n1.s) {
                                n1.s sVar2 = (n1.s) mVarE;
                                if (sVar2.f25565n && !i2.k.s(sVar2).R) {
                                    if (sVar2.r0().f29530a) {
                                        eVar.b(sVar2);
                                    } else {
                                        h(sVar2, eVar);
                                    }
                                }
                            } else if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof i2.j)) {
                                int i10 = 0;
                                for (i1.m mVar3 = ((i2.j) mVarE).f25691p; mVar3 != null; mVar3 = mVar3.f25559f) {
                                    if ((mVar3.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            mVarE = mVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new w0.e(new i1.m[16]);
                                            }
                                            if (mVarE != null) {
                                                eVar3.b(mVarE);
                                                mVarE = null;
                                            }
                                            eVar3.b(mVar3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            mVarE = i2.k.e(eVar3);
                        }
                    } else {
                        mVarE = mVarE.f25559f;
                    }
                }
            }
        }
    }

    public static final File i(Context context, String str) {
        nk.k.e(context, "<this>");
        nk.k.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static int j(float f10, int i4, int i10) {
        if (i4 == i10 || f10 <= 0.0f) {
            return i4;
        }
        if (f10 >= 1.0f) {
            return i10;
        }
        float f11 = ((i4 >> 24) & 255) / 255.0f;
        float f12 = ((i10 >> 24) & 255) / 255.0f;
        float fB = b(((i4 >> 16) & 255) / 255.0f);
        float fB2 = b(((i4 >> 8) & 255) / 255.0f);
        float fB3 = b((i4 & 255) / 255.0f);
        float fB4 = b(((i10 >> 16) & 255) / 255.0f);
        float fB5 = b(((i10 >> 8) & 255) / 255.0f);
        float fB6 = b((i10 & 255) / 255.0f);
        float fC = r5.c.c(f12, f11, f10, f11);
        float fC2 = r5.c.c(fB4, fB, f10, fB);
        float fC3 = r5.c.c(fB5, fB2, f10, fB2);
        float fC4 = r5.c.c(fB6, fB3, f10, fB3);
        float fC5 = c(fC2) * 255.0f;
        float fC6 = c(fC3) * 255.0f;
        return Math.round(c(fC4) * 255.0f) | (Math.round(fC5) << 16) | (Math.round(fC * 255.0f) << 24) | (Math.round(fC6) << 8);
    }

    public static final n1.s k(w0.e eVar, o1.c cVar, int i4) {
        o1.c cVarE;
        if (i4 == 3) {
            cVarE = cVar.e((cVar.f30368c - cVar.f30366a) + 1, 0.0f);
        } else if (i4 == 4) {
            cVarE = cVar.e(-((cVar.f30368c - cVar.f30366a) + 1), 0.0f);
        } else if (i4 == 5) {
            cVarE = cVar.e(0.0f, (cVar.f30369d - cVar.f30367b) + 1);
        } else {
            if (i4 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            cVarE = cVar.e(0.0f, -((cVar.f30369d - cVar.f30367b) + 1));
        }
        Object[] objArr = eVar.f36397a;
        int i10 = eVar.f36399c;
        n1.s sVar = null;
        for (int i11 = 0; i11 < i10; i11++) {
            n1.s sVar2 = (n1.s) objArr[i11];
            if (com.google.android.gms.internal.measurement.z3.o(sVar2)) {
                o1.c cVarH = com.google.android.gms.internal.measurement.z3.h(sVar2);
                if (v(cVarH, cVarE, cVar, i4)) {
                    sVar = sVar2;
                    cVarE = cVarH;
                }
            }
        }
        return sVar;
    }

    public static final boolean l(n1.s sVar, int i4, mk.c cVar) {
        o1.c cVar2;
        w0.e eVar = new w0.e(new n1.s[16]);
        h(sVar, eVar);
        int i10 = eVar.f36399c;
        if (i10 <= 1) {
            n1.s sVar2 = (n1.s) (i10 == 0 ? null : eVar.f36397a[0]);
            if (sVar2 != null) {
                return ((Boolean) cVar.invoke(sVar2)).booleanValue();
            }
        } else {
            if (i4 == 7) {
                i4 = 4;
            }
            if (i4 == 4 || i4 == 6) {
                o1.c cVarH = com.google.android.gms.internal.measurement.z3.h(sVar);
                float f10 = cVarH.f30366a;
                float f11 = cVarH.f30367b;
                cVar2 = new o1.c(f10, f11, f10, f11);
            } else {
                if (i4 != 3 && i4 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                o1.c cVarH2 = com.google.android.gms.internal.measurement.z3.h(sVar);
                float f12 = cVarH2.f30368c;
                float f13 = cVarH2.f30369d;
                cVar2 = new o1.c(f12, f13, f12, f13);
            }
            n1.s sVarK = k(eVar, cVar2, i4);
            if (sVarK != null) {
                return ((Boolean) cVar.invoke(sVarK)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean m(int i4, g3.f fVar, n1.s sVar, o1.c cVar) {
        if (B(i4, fVar, sVar, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) com.bumptech.glide.e.Q(sVar, i4, new n1.u(((xz) ((j2.r) i2.k.t(sVar)).getFocusOwner()).h(), sVar, cVar, i4, fVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static String n(String str) {
        nk.k.e(str, "path");
        if (!vk.p.w0(str, "/", false)) {
            str = "/".concat(str);
        }
        String str2 = xi.a.f37164c;
        nk.k.d(str2, "access$getROOT_PATH$cp(...)");
        String strU0 = vk.p.u0(str, str2, "");
        if (vk.p.w0(strU0, "/", false)) {
            strU0 = strU0.substring(1);
            nk.k.d(strU0, "substring(...)");
        }
        return "primary:".concat(strU0);
    }

    public static final tk.b o(kl.d dVar) {
        nk.k.e(dVar, "<this>");
        if (dVar instanceof ml.o) {
            return o(((ml.o) dVar).f29433a);
        }
        return null;
    }

    public static final int q(d6.a aVar) throws Exception {
        nk.k.e(aVar, "connection");
        d6.c cVarS = aVar.S("SELECT changes()");
        try {
            cVarS.P();
            int i4 = (int) cVarS.getLong(0);
            d5.c(cVarS, null);
            return i4;
        } finally {
        }
    }

    public static final t6.a r(int i4) {
        if (i4 == 0) {
            return t6.a.f34308a;
        }
        if (i4 == 1) {
            return t6.a.f34309b;
        }
        throw new IllegalArgumentException(r5.c.h(i4, "Could not convert ", " to BackoffPolicy"));
    }

    public static final t6.w s(int i4) {
        if (i4 == 0) {
            return t6.w.f34401a;
        }
        if (i4 == 1) {
            return t6.w.f34402b;
        }
        if (i4 == 2) {
            return t6.w.f34403c;
        }
        if (i4 == 3) {
            return t6.w.f34404d;
        }
        if (i4 == 4) {
            return t6.w.f34405e;
        }
        if (Build.VERSION.SDK_INT < 30 || i4 != 5) {
            throw new IllegalArgumentException(r5.c.h(i4, "Could not convert ", " to NetworkType"));
        }
        return t6.w.f34406f;
    }

    public static final t6.d0 t(int i4) {
        if (i4 == 0) {
            return t6.d0.f34331a;
        }
        if (i4 == 1) {
            return t6.d0.f34332b;
        }
        throw new IllegalArgumentException(r5.c.h(i4, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final t6.g0 u(int i4) {
        if (i4 == 0) {
            return t6.g0.f34349a;
        }
        if (i4 == 1) {
            return t6.g0.f34350b;
        }
        if (i4 == 2) {
            return t6.g0.f34351c;
        }
        if (i4 == 3) {
            return t6.g0.f34352d;
        }
        if (i4 == 4) {
            return t6.g0.f34353e;
        }
        if (i4 == 5) {
            return t6.g0.f34354f;
        }
        throw new IllegalArgumentException(r5.c.h(i4, "Could not convert ", " to State"));
    }

    public static final boolean v(o1.c cVar, o1.c cVar2, o1.c cVar3, int i4) {
        if (!w(i4, cVar, cVar3)) {
            return false;
        }
        if (w(i4, cVar2, cVar3) && !d(cVar3, cVar, cVar2, i4)) {
            return !d(cVar3, cVar2, cVar, i4) && x(i4, cVar3, cVar) < x(i4, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean w(int i4, o1.c cVar, o1.c cVar2) {
        if (i4 == 3) {
            float f10 = cVar2.f30368c;
            float f11 = cVar2.f30366a;
            float f12 = cVar.f30368c;
            return (f10 > f12 || f11 >= f12) && f11 > cVar.f30366a;
        }
        if (i4 == 4) {
            float f13 = cVar2.f30366a;
            float f14 = cVar2.f30368c;
            float f15 = cVar.f30366a;
            return (f13 < f15 || f14 <= f15) && f14 < cVar.f30368c;
        }
        if (i4 == 5) {
            float f16 = cVar2.f30369d;
            float f17 = cVar2.f30367b;
            float f18 = cVar.f30369d;
            return (f16 > f18 || f17 >= f18) && f17 > cVar.f30367b;
        }
        if (i4 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f19 = cVar2.f30367b;
        float f20 = cVar2.f30369d;
        float f21 = cVar.f30367b;
        return (f19 < f21 || f20 <= f21) && f20 < cVar.f30369d;
    }

    public static final long x(int i4, o1.c cVar, o1.c cVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (i4 == 3) {
            f10 = cVar.f30366a;
            f11 = cVar2.f30368c;
        } else if (i4 == 4) {
            f10 = cVar2.f30366a;
            f11 = cVar.f30368c;
        } else if (i4 == 5) {
            f10 = cVar.f30367b;
            f11 = cVar2.f30369d;
        } else {
            if (i4 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = cVar2.f30367b;
            f11 = cVar.f30369d;
        }
        float f16 = f10 - f11;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        long j = (long) f16;
        if (i4 == 3 || i4 == 4) {
            float f17 = cVar.f30367b;
            f12 = 2;
            f13 = ((cVar.f30369d - f17) / f12) + f17;
            f14 = cVar2.f30367b;
            f15 = cVar2.f30369d;
        } else {
            if (i4 != 5 && i4 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f18 = cVar.f30366a;
            f12 = 2;
            f13 = ((cVar.f30368c - f18) / f12) + f18;
            f14 = cVar2.f30366a;
            f15 = cVar2.f30368c;
        }
        long j8 = (long) (f13 - (((f15 - f14) / f12) + f14));
        return (j8 * j8) + (13 * j * j);
    }

    public abstract void p(ed.x xVar, float f10, float f11);

    public abstract void y(Throwable th2);

    public abstract void z(se.b bVar);
}
