package ru.andr7e.siminfo;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    static double[] f3232a = {5.0d, 0.0d, 0.0d, 0.0d, 599999.0d, 15.0d, 3000.0d, 600000.0d, 600000.0d, 2016666.0d, 60.0d, 24250.08d, 2016667.0d, 2016667.0d, 3279165.0d};

    /* renamed from: b, reason: collision with root package name */
    static double[] f3233b = {1.0d, 100.0d, 1920.0d, 1980.0d, 384000.0d, 396000.0d, 2110.0d, 2170.0d, 422000.0d, 434000.0d, 2.0d, 100.0d, 1850.0d, 1910.0d, 370000.0d, 382000.0d, 1930.0d, 1990.0d, 386000.0d, 398000.0d, 3.0d, 100.0d, 1710.0d, 1785.0d, 342000.0d, 357000.0d, 1805.0d, 1880.0d, 361000.0d, 376000.0d, 5.0d, 100.0d, 824.0d, 849.0d, 164800.0d, 169800.0d, 869.0d, 894.0d, 173800.0d, 178800.0d, 7.0d, 100.0d, 2500.0d, 2570.0d, 500000.0d, 514000.0d, 2620.0d, 2690.0d, 524000.0d, 538000.0d, 8.0d, 100.0d, 880.0d, 915.0d, 176000.0d, 183000.0d, 925.0d, 960.0d, 185000.0d, 192000.0d, 12.0d, 100.0d, 699.0d, 716.0d, 139800.0d, 143200.0d, 729.0d, 746.0d, 145800.0d, 149200.0d, 14.0d, 100.0d, 788.0d, 798.0d, 157600.0d, 159600.0d, 758.0d, 768.0d, 151600.0d, 153600.0d, 18.0d, 100.0d, 815.0d, 830.0d, 163000.0d, 166000.0d, 860.0d, 875.0d, 172000.0d, 175000.0d, 20.0d, 100.0d, 832.0d, 862.0d, 166400.0d, 172400.0d, 791.0d, 821.0d, 158200.0d, 164200.0d, 25.0d, 100.0d, 1850.0d, 1915.0d, 370000.0d, 383000.0d, 1930.0d, 1995.0d, 386000.0d, 399000.0d, 26.0d, 100.0d, 814.0d, 849.0d, 162800.0d, 169800.0d, 859.0d, 894.0d, 171800.0d, 178800.0d, 28.0d, 100.0d, 703.0d, 748.0d, 140600.0d, 149600.0d, 758.0d, 803.0d, 151600.0d, 160600.0d, 29.0d, 100.0d, -1.0d, -1.0d, -1.0d, -1.0d, 717.0d, 728.0d, 143400.0d, 145600.0d, 30.0d, 100.0d, 2305.0d, 2315.0d, 461000.0d, 463000.0d, 2350.0d, 2360.0d, 470000.0d, 472000.0d, 34.0d, 100.0d, 2010.0d, 2025.0d, 402000.0d, 405000.0d, 2010.0d, 2025.0d, 402000.0d, 405000.0d, 38.0d, 100.0d, 2570.0d, 2620.0d, 514000.0d, 524000.0d, 2570.0d, 2620.0d, 514000.0d, 524000.0d, 39.0d, 100.0d, 1880.0d, 1920.0d, 376000.0d, 384000.0d, 1880.0d, 1920.0d, 376000.0d, 384000.0d, 40.0d, 100.0d, 2300.0d, 2400.0d, 460000.0d, 480000.0d, 2300.0d, 2400.0d, 460000.0d, 480000.0d, 41.0d, 15.0d, 2496.0d, 2690.0d, 499200.0d, 537999.0d, 2496.0d, 2690.0d, 499200.0d, 537999.0d, 41.0d, 30.0d, 2496.0d, 2690.0d, 499200.0d, 537999.0d, 2496.0d, 2690.0d, 499200.0d, 537999.0d, 48.0d, 15.0d, 3550.0d, 3700.0d, 636667.0d, 646666.0d, 3550.0d, 3700.0d, 636667.0d, 646666.0d, 48.0d, 30.0d, 3550.0d, 3700.0d, 636668.0d, 646666.0d, 3550.0d, 3700.0d, 636668.0d, 646666.0d, 50.0d, 100.0d, 1432.0d, 1517.0d, 286400.0d, 303400.0d, 1432.0d, 1517.0d, 286400.0d, 303400.0d, 51.0d, 100.0d, 1427.0d, 1432.0d, 285400.0d, 286400.0d, 1427.0d, 1432.0d, 285400.0d, 286400.0d, 53.0d, 100.0d, 2483.5d, 2495.0d, 496700.0d, 499000.0d, 2483.5d, 2495.0d, 496700.0d, 499000.0d, 65.0d, 100.0d, 1920.0d, 2010.0d, 384000.0d, 402000.0d, 2110.0d, 2200.0d, 422000.0d, 440000.0d, 66.0d, 100.0d, 1710.0d, 1780.0d, 342000.0d, 356000.0d, 2110.0d, 2200.0d, 422000.0d, 440000.0d, 70.0d, 100.0d, 1695.0d, 1710.0d, 339000.0d, 342000.0d, 1995.0d, 2020.0d, 399000.0d, 404000.0d, 71.0d, 100.0d, 663.0d, 698.0d, 132600.0d, 139600.0d, 617.0d, 652.0d, 123400.0d, 130400.0d, 74.0d, 100.0d, 1427.0d, 1470.0d, 285400.0d, 294000.0d, 1475.0d, 1518.0d, 295000.0d, 303600.0d, 75.0d, 100.0d, -1.0d, -1.0d, -1.0d, -1.0d, 1432.0d, 1517.0d, 286400.0d, 303400.0d, 76.0d, 100.0d, -1.0d, -1.0d, -1.0d, -1.0d, 1427.0d, 1432.0d, 285400.0d, 286400.0d, 77.0d, 15.0d, 3300.0d, 4200.0d, 620000.0d, 680000.0d, 3300.0d, 4200.0d, 620000.0d, 680000.0d, 77.0d, 30.0d, 3300.0d, 4200.0d, 620000.0d, 680000.0d, 3300.0d, 4200.0d, 620000.0d, 680000.0d, 78.0d, 15.0d, 3300.0d, 3800.0d, 620000.0d, 653333.0d, 3300.0d, 3800.0d, 620000.0d, 653333.0d, 78.0d, 30.0d, 3300.0d, 3800.0d, 620000.0d, 653332.0d, 3300.0d, 3800.0d, 620000.0d, 653332.0d, 79.0d, 15.0d, 4400.0d, 5000.0d, 693334.0d, 733333.0d, 4400.0d, 5000.0d, 693334.0d, 733333.0d, 79.0d, 30.0d, 4400.0d, 5000.0d, 693334.0d, 733332.0d, 4400.0d, 5000.0d, 693334.0d, 733332.0d, 80.0d, 100.0d, 1710.0d, 1785.0d, 342000.0d, 357000.0d, -1.0d, -1.0d, -1.0d, -1.0d, 81.0d, 100.0d, 880.0d, 915.0d, 176000.0d, 183000.0d, -1.0d, -1.0d, -1.0d, -1.0d, 82.0d, 100.0d, 832.0d, 862.0d, 166400.0d, 172400.0d, -1.0d, -1.0d, -1.0d, -1.0d, 83.0d, 100.0d, 703.0d, 748.0d, 140600.0d, 149600.0d, -1.0d, -1.0d, -1.0d, -1.0d, 84.0d, 100.0d, 1920.0d, 1980.0d, 384000.0d, 396000.0d, -1.0d, -1.0d, -1.0d, -1.0d, 86.0d, 100.0d, 1710.0d, 1780.0d, 342000.0d, 356000.0d, -1.0d, -1.0d, -1.0d, -1.0d, 89.0d, 100.0d, 824.0d, 849.0d, 164800.0d, 169800.0d, -1.0d, -1.0d, -1.0d, -1.0d, 90.0d, 15.0d, 2496.0d, 2690.0d, 499200.0d, 537996.0d, 2496.0d, 2690.0d, 499200.0d, 537996.0d, 90.0d, 30.0d, 2496.0d, 2690.0d, 499200.0d, 537996.0d, 2496.0d, 2690.0d, 499200.0d, 537996.0d, 90.0d, 100.0d, 2496.0d, 2690.0d, 499200.0d, 537996.0d, 2496.0d, 2690.0d, 499200.0d, 537996.0d, 91.0d, 100.0d, 832.0d, 862.0d, 166400.0d, 172400.0d, 1427.0d, 1432.0d, 285400.0d, 286400.0d, 92.0d, 100.0d, 832.0d, 862.0d, 166400.0d, 172400.0d, 1432.0d, 1517.0d, 286400.0d, 303400.0d, 93.0d, 100.0d, 880.0d, 915.0d, 176000.0d, 183000.0d, 1427.0d, 1432.0d, 285400.0d, 286400.0d, 94.0d, 100.0d, 880.0d, 915.0d, 176000.0d, 183000.0d, 1432.0d, 1517.0d, 286400.0d, 303400.0d, 95.0d, 100.0d, 2010.0d, 2025.0d, 402000.0d, 405000.0d, -1.0d, -2.0d, -1.0d};

    /* renamed from: c, reason: collision with root package name */
    static double[] f3234c = {257.0d, 60.0d, 26500.0d, 29500.0d, 2054166.0d, 2104165.0d, -1.0d, -1.0d, -1.0d, -1.0d, 257.0d, 120.0d, 26500.0d, 29500.0d, 2054167.0d, 2104165.0d, -1.0d, -1.0d, -1.0d, -1.0d, 258.0d, 60.0d, 24250.0d, 27500.0d, 2016667.0d, 2070832.0d, -1.0d, -1.0d, -1.0d, -1.0d, 258.0d, 120.0d, 24250.0d, 27500.0d, 2016667.0d, 2070831.0d, -1.0d, -1.0d, -1.0d, -1.0d, 259.0d, 60.0d, 39500.0d, 43500.0d, 2270832.0d, 2337499.0d, -1.0d, -1.0d, -1.0d, -1.0d, 259.0d, 120.0d, 39500.0d, 43500.0d, 2270832.0d, 2337499.0d, -1.0d, -1.0d, -1.0d, -1.0d, 260.0d, 60.0d, 37000.0d, 40000.0d, 2229166.0d, 2279165.0d, -1.0d, -1.0d, -1.0d, -1.0d, 260.0d, 120.0d, 37000.0d, 40000.0d, 2229167.0d, 2279165.0d, -1.0d, -1.0d, -1.0d, -1.0d, 261.0d, 60.0d, 27500.0d, 28350.0d, 2070833.0d, 2084999.0d, -1.0d, -1.0d, -1.0d, -1.0d, 261.0d, 120.0d, 27500.0d, 28350.0d, 2070833.0d, 2084999.0d, -1.0d, -1.0d, -1.0d, -1.0d};

    /* renamed from: d, reason: collision with root package name */
    static int f3235d = 10;

    /* renamed from: e, reason: collision with root package name */
    static int f3236e = 10;

    public static double a(int i2, int i3, double d2) {
        int i4 = f3235d;
        double[] dArr = f3233b;
        int i5 = i2 * i4;
        double d3 = dArr[i5 + 8];
        double d4 = dArr[i5 + 9];
        double d5 = dArr[i5 + 2];
        double d6 = dArr[i5 + 3];
        double d7 = i3;
        Double.isNaN(d7);
        return (((d7 - d3) / (d4 - d3)) * (d6 - d5)) + d5;
    }

    public static int b(int i2) {
        int length = f3232a.length / 5;
        for (int i3 = 0; i3 < length; i3++) {
            double[] dArr = f3232a;
            int i4 = i3 * 5;
            double d2 = dArr[i4 + 3];
            double d3 = dArr[i4 + 4];
            double d4 = i2;
            if (d4 >= d2 && d4 <= d3) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean c(double r10, int r12, java.util.ArrayList<java.lang.Integer> r13) {
        /*
            int r10 = ru.andr7e.siminfo.a.f3235d
            double[] r11 = ru.andr7e.siminfo.a.f3233b
            int r11 = r11.length
            int r11 = r11 / r10
            r0 = 0
            r1 = 0
        L8:
            r2 = 1
            if (r1 >= r11) goto L42
            double[] r3 = ru.andr7e.siminfo.a.f3233b
            int r4 = r1 * r10
            int r5 = r4 + 8
            r5 = r3[r5]
            int r4 = r4 + 9
            r7 = r3[r4]
            r3 = 0
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 < 0) goto L2b
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 < 0) goto L2b
            double r3 = (double) r12
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto L2b
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            if (r2 == 0) goto L3f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r2 = r13.contains(r2)
            if (r2 != 0) goto L3f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r13.add(r2)
        L3f:
            int r1 = r1 + 1
            goto L8
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.andr7e.siminfo.a.c(double, int, java.util.ArrayList):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean d(double r10, int r12, java.util.ArrayList<java.lang.Integer> r13) {
        /*
            int r10 = ru.andr7e.siminfo.a.f3236e
            double[] r11 = ru.andr7e.siminfo.a.f3234c
            int r11 = r11.length
            int r11 = r11 / r10
            r0 = 0
            r1 = 0
        L8:
            r2 = 1
            if (r1 >= r11) goto L42
            double[] r3 = ru.andr7e.siminfo.a.f3234c
            int r4 = r1 * r10
            int r5 = r4 + 4
            r5 = r3[r5]
            int r4 = r4 + 5
            r7 = r3[r4]
            r3 = 0
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 < 0) goto L2b
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 < 0) goto L2b
            double r3 = (double) r12
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto L2b
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            if (r2 == 0) goto L3f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r2 = r13.contains(r2)
            if (r2 != 0) goto L3f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r13.add(r2)
        L3f:
            int r1 = r1 + 1
            goto L8
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.andr7e.siminfo.a.d(double, int, java.util.ArrayList):boolean");
    }

    public static String e(double d2, int i2, b bVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        double d3 = -1.0d;
        if (d2 >= 410.0d && d2 <= 7125.0d) {
            if (n0.b.i()) {
                c(d2, i2, arrayList);
            }
            Iterator it = arrayList.iterator();
            double d4 = -1.0d;
            int i3 = 0;
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                int i4 = (int) f3233b[(f3235d * iIntValue) + 0];
                if (i4 > 0 && !arrayList2.contains(Integer.valueOf(i4))) {
                    double dA = a(iIntValue, i2, d2);
                    arrayList2.add(Integer.valueOf(i4));
                    if (i3 == 0) {
                        d4 = dA;
                    } else if (Math.abs(d4 - dA) > 0.01d) {
                        d4 = -1.0d;
                    }
                    i3++;
                }
            }
            d3 = d4;
        } else if (d2 >= 24250.0d && d2 <= 52600.0d) {
            if (n0.b.i()) {
                d(d2, i2, arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int i5 = (int) f3234c[(((Integer) it2.next()).intValue() * f3235d) + 0];
                if (i5 > 0 && !arrayList2.contains(Integer.valueOf(i5))) {
                    arrayList2.add(Integer.valueOf(i5));
                    d3 = d2;
                }
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            int iIntValue2 = ((Integer) it3.next()).intValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            f.q(iIntValue2, sb, 4);
        }
        String string = sb.toString();
        bVar.f3255s = n0.f.e(0, 1, d2, i0.b.b(d3, 2));
        return string;
    }

    public static double f(int i2, int i3) {
        if (i2 < 0) {
            return 0.0d;
        }
        double[] dArr = f3232a;
        int i4 = i2 * 5;
        double d2 = dArr[i4 + 0] / 1000.0d;
        double d3 = dArr[i4 + 1];
        double d4 = dArr[i4 + 2];
        double d5 = i3;
        Double.isNaN(d5);
        return i0.b.b(d3 + (d2 * (d5 - d4)), 2);
    }
}
