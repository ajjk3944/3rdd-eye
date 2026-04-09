package yh;

import ak.q0;
import android.os.Bundle;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final Random f26298g = new Random();

    /* renamed from: a, reason: collision with root package name */
    public volatile long[] f26299a;

    /* renamed from: b, reason: collision with root package name */
    public volatile List f26300b;

    /* renamed from: c, reason: collision with root package name */
    public DatagramSocket f26301c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26302d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f26303e;

    /* renamed from: f, reason: collision with root package name */
    public Thread f26304f;

    public static void a(q0 q0Var, long[] jArr, long[] jArr2, int[] iArr, j jVar) {
        boolean z10;
        double d6;
        double d10;
        double d11;
        double d12;
        double d13;
        j jVar2;
        double d14;
        int i10;
        int i11;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        int i12;
        double d20;
        int i13;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            if (arrayList.contains(Integer.valueOf(i16))) {
                i14++;
            } else {
                arrayList.add(Integer.valueOf(i16));
                arrayList2.add(Integer.valueOf(i16));
                arrayList3.add(Long.valueOf(jArr[i15]));
            }
            i15++;
        }
        Bundle bundle = new Bundle();
        bundle.putLongArray("srtest_2", b(arrayList3));
        int size = arrayList2.size();
        int[] iArr2 = new int[size];
        if (arrayList2.size() <= 0) {
            iArr2 = new int[]{0};
        } else {
            Iterator it = arrayList2.iterator();
            for (int i17 = 0; i17 < size; i17++) {
                iArr2[i17] = ((Integer) it.next()).intValue();
            }
        }
        bundle.putIntArray("srtest_3", iArr2);
        bundle.putInt("srtest_4", i14);
        long[] longArray = bundle.getLongArray("srtest_2");
        int[] intArray = bundle.getIntArray("srtest_3");
        if (longArray == null || intArray == null) {
            return;
        }
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        long j = 0;
        long j7 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        while (true) {
            int[] iArr3 = intArray;
            z10 = true;
            if (i18 >= longArray.length) {
                z10 = false;
                break;
            }
            long j15 = longArray[i18];
            int i22 = iArr3[i18];
            long j16 = (j15 - jArr2[i22]) / 2;
            if (j16 < 0) {
                ch.n.g("TTQoSHelperFunctions", "Negative latency found - Aborting SR Test", null);
                break;
            }
            j12 += j16;
            i20++;
            if (i20 == 1 || j16 < j7) {
                j7 = j16;
            }
            if (j16 > j10) {
                j10 = j16;
            }
            if (i18 > 0) {
                i13 = i18;
                if (iArr3[i18 - 1] == i22 - 1) {
                    long jAbs = Math.abs(j16 - j14);
                    j13 += jAbs;
                    i21++;
                    if (i21 == 1 || jAbs < j) {
                        j = jAbs;
                    }
                    if (jAbs > j11) {
                        j11 = jAbs;
                    }
                } else {
                    i19++;
                }
            } else {
                i13 = i18;
            }
            i18 = i13 + 1;
            intArray = iArr3;
            j14 = j16;
        }
        int i23 = q0Var.f643c;
        double d21 = -32768.0d;
        if (z10) {
            jVar.f26305a = false;
            i10 = -32768;
            i11 = -32768;
            jVar2 = jVar;
            i12 = i23;
            d20 = -32768.0d;
            d19 = -32768.0d;
            d18 = -32768.0d;
            d17 = -32768.0d;
            d16 = -32768.0d;
            d11 = -32768.0d;
            d15 = -32768.0d;
            d14 = -32768.0d;
        } else {
            if (i21 != 0) {
                d6 = (j13 / i21) / 1000000.0d;
                d11 = j11 / 1000000.0d;
                d10 = j / 1000000.0d;
            } else {
                d6 = -32768.0d;
                d10 = -32768.0d;
                d11 = -32768.0d;
            }
            double d22 = d6;
            if (i20 != 0) {
                d21 = (j12 / i20) / 1000000.0d;
                d12 = j10 / 1000000.0d;
                d13 = j7 / 1000000.0d;
            } else {
                d12 = -32768.0d;
                d13 = -32768.0d;
            }
            int i24 = i23 - i20;
            double d23 = i23;
            double d24 = (i24 * 100) / d23;
            double d25 = d12;
            double d26 = (r8 * 100) / d23;
            jVar2 = jVar;
            jVar2.f26305a = true;
            d14 = d26;
            i10 = i24;
            i11 = i19 + i24;
            d15 = d24;
            d16 = d21;
            d17 = d13;
            d18 = d10;
            d19 = d22;
            i12 = i23;
            d20 = d25;
        }
        jVar2.f26306b = d19;
        jVar2.f26307c = d11;
        jVar2.f26308d = d18;
        jVar2.f26309e = d16;
        jVar2.f26310f = d20;
        jVar2.f26311g = d17;
        jVar2.f26313i = i10;
        jVar2.j = d15;
        jVar2.k = i11;
        jVar2.f26314l = d14;
        jVar2.f26312h = i12;
    }

    public static long[] b(ArrayList arrayList) {
        int size = arrayList.size();
        long[] jArr = new long[size];
        if (arrayList.size() <= 0) {
            return new long[]{0};
        }
        Iterator it = arrayList.iterator();
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) it.next()).longValue();
        }
        return jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ac, code lost:
    
        if (yh.e.j == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ae, code lost:
    
        r12.removeCallbacks(yh.e.f26285x);
        r0 = yh.e.f26274m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b5, code lost:
    
        if (r0 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b7, code lost:
    
        r0.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bc, code lost:
    
        ch.n.g("TTQoSFileIO", "Ex while destroying ping process.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d0, code lost:
    
        yh.e.j = true;
        r5 = r14.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d6, code lost:
    
        r12.removeCallbacks(yh.e.f26285x);
        r0 = yh.e.f26274m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dd, code lost:
    
        if (r0 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01df, code lost:
    
        r0.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e4, code lost:
    
        ch.n.g("TTQoSFileIO", "Ex while destroying ping process.", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0424 A[Catch: Exception -> 0x041e, TRY_LEAVE, TryCatch #12 {Exception -> 0x041e, blocks: (B:203:0x0418, B:206:0x0420, B:208:0x0424), top: B:236:0x0418 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x024f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0431 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0418 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020d A[Catch: all -> 0x01a1, TRY_LEAVE, TryCatch #3 {all -> 0x01a1, blocks: (B:32:0x0161, B:33:0x0168, B:35:0x016e, B:53:0x01aa, B:65:0x01d0, B:85:0x0209, B:87:0x020d), top: B:223:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0224 A[Catch: Exception -> 0x021e, TRY_LEAVE, TryCatch #11 {Exception -> 0x021e, blocks: (B:89:0x0218, B:92:0x0220, B:94:0x0224), top: B:234:0x0218 }] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.os.Handler] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static hk.k c(ak.x r19, io.sentry.t r20, mi.f r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.i.c(ak.x, io.sentry.t, mi.f):hk.k");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|2|(2:93|4)(1:10)|11|101|12|(1:14)(1:17)|(1:19)(1:20)|21|(1:23)(1:24)|25|(1:27)|28|(1:(7:30|99|31|(3:33|(4:46|103|47|(2:106|49)(1:50))(1:(2:105|38)(4:(1:41)(0)|103|47|(0)(0)))|90)(1:53)|95|54|(1:107)(1:57))(2:108|60))|56|97|61|66|(1:68)(1:(1:(1:(1:76)(1:77))(1:78))(1:(1:72)(1:73)))|79|91|80|(2:83|81)|109|87|(1:89)|90|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:30|99|31|(3:33|(4:46|103|47|(2:106|49)(1:50))(1:(2:105|38)(4:(1:41)(0)|103|47|(0)(0)))|90)(1:53)|95|54|(1:107)(1:57)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        r10 = r14;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        r10 = r14;
        r16 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fc, code lost:
    
        r16 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0184, code lost:
    
        ch.n.e("TTQoSHelperFunctions", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d A[Catch: JSONException -> 0x0183, LOOP:1: B:81:0x0157->B:83:0x015d, LOOP_END, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0183, blocks: (B:80:0x0153, B:81:0x0157, B:83:0x015d), top: B:91:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.Bundle e(ak.x r18, java.lang.String r19, java.lang.String r20, mi.f r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.i.e(ak.x, java.lang.String, java.lang.String, mi.f):android.os.Bundle");
    }

    public final void d(int i10, long j, int i11, ThreadFactory threadFactory) {
        try {
            if (this.f26304f == null) {
                try {
                    Thread threadNewThread = threadFactory.newThread(new g(this, i10, j, i11));
                    this.f26304f = threadNewThread;
                    threadNewThread.setName("TURec-t-0");
                    this.f26304f.start();
                } catch (InternalError unused) {
                    ch.n.g("TTQoSHelperFunctions", "InternalError while creating SR test thread.", null);
                } catch (OutOfMemoryError unused2) {
                    ch.n.g("TTQoSHelperFunctions", "OOM while creating SR test thread.", null);
                }
            }
        } catch (InternalError unused3) {
        } catch (OutOfMemoryError unused4) {
        }
    }

    public final void f() {
        try {
            Thread thread = this.f26304f;
            if (thread != null) {
                thread.interrupt();
                this.f26304f = null;
            }
        } catch (Exception unused) {
        }
    }
}
