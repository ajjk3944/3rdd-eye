package K0;

import java.io.PrintWriter;

/* compiled from: TimeUtils.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2945a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static char[] f2946b = new char[24];

    public static void a(long j4, PrintWriter printWriter) {
        synchronized (f2945a) {
            printWriter.print(new String(f2946b, 0, b(j4)));
        }
    }

    public static int b(long j4) {
        char c10;
        int i;
        int i10;
        int i11;
        if (f2946b.length < 0) {
            f2946b = new char[0];
        }
        char[] cArr = f2946b;
        if (j4 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j4 > 0) {
            c10 = '+';
        } else {
            j4 = -j4;
            c10 = '-';
        }
        int i12 = (int) (j4 % 1000);
        int iFloor = (int) Math.floor(j4 / 1000);
        if (iFloor > 86400) {
            i = iFloor / 86400;
            iFloor -= 86400 * i;
        } else {
            i = 0;
        }
        if (iFloor > 3600) {
            i10 = iFloor / 3600;
            iFloor -= i10 * 3600;
        } else {
            i10 = 0;
        }
        if (iFloor > 60) {
            int i13 = iFloor / 60;
            iFloor -= i13 * 60;
            i11 = i13;
        } else {
            i11 = 0;
        }
        cArr[0] = c10;
        int iC = c(cArr, i, 'd', 1, false, 0);
        int iC2 = c(cArr, i10, 'h', iC, iC != 1, 0);
        int iC3 = c(cArr, i11, 'm', iC2, iC2 != 1, 0);
        int iC4 = c(cArr, i12, 'm', c(cArr, iFloor, 's', iC3, iC3 != 1, 0), true, 0);
        cArr[iC4] = 's';
        return iC4 + 1;
    }

    public static int c(char[] cArr, int i, char c10, int i10, boolean z10, int i11) {
        int i12;
        if (!z10 && i <= 0) {
            return i10;
        }
        if ((!z10 || i11 < 3) && i <= 99) {
            i12 = i10;
        } else {
            int i13 = i / 100;
            cArr[i10] = (char) (i13 + 48);
            i12 = i10 + 1;
            i -= i13 * 100;
        }
        if ((z10 && i11 >= 2) || i > 9 || i10 != i12) {
            int i14 = i / 10;
            cArr[i12] = (char) (i14 + 48);
            i12++;
            i -= i14 * 10;
        }
        cArr[i12] = (char) (i + 48);
        cArr[i12 + 1] = c10;
        return i12 + 2;
    }
}
