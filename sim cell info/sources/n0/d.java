package n0;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3020a = "d";

    /* renamed from: b, reason: collision with root package name */
    static int f3021b = 11;

    /* renamed from: c, reason: collision with root package name */
    static double[] f3022c = {1.0d, 0.0d, 2112.4d, 2167.6d, 10562.0d, 10838.0d, 0.0d, 1922.4d, 1977.6d, 9612.0d, 9888.0d, 2.0d, 0.0d, 1932.4d, 1987.6d, 9662.0d, 9938.0d, 0.0d, 1852.4d, 1907.6d, 9262.0d, 9538.0d, 3.0d, 1575.0d, 1807.4d, 1877.6d, 1162.0d, 1513.0d, 1525.0d, 1712.4d, 1782.6d, 937.0d, 1288.0d, 4.0d, 1805.0d, 2112.4d, 2152.6d, 1537.0d, 1738.0d, 1450.0d, 1712.4d, 1752.6d, 1312.0d, 1513.0d, 5.0d, 0.0d, 871.4d, 891.6d, 4357.0d, 4458.0d, 0.0d, 826.4d, 846.6d, 4132.0d, 4233.0d, 6.0d, 0.0d, 877.4d, 882.6d, 4387.0d, 4413.0d, 0.0d, 832.4d, 837.6d, 4162.0d, 4188.0d, 7.0d, 2175.0d, 2622.4d, 2687.6d, 2237.0d, 2563.0d, 2100.0d, 2502.4d, 2567.6d, 2012.0d, 2338.0d, 8.0d, 340.0d, 927.4d, 957.6d, 2937.0d, 3088.0d, 340.0d, 882.4d, 912.6d, 2712.0d, 2863.0d, 9.0d, 0.0d, 1847.4d, 1877.4d, 9237.0d, 9387.0d, 0.0d, 1752.4d, 1782.4d, 8762.0d, 8912.0d, 10.0d, 1490.0d, 2112.4d, 2167.6d, 3112.0d, 3388.0d, 1135.0d, 1712.4d, 1767.6d, 2887.0d, 3163.0d, 11.0d, 736.0d, 1478.4d, 1498.4d, 3712.0d, 3812.0d, 733.0d, 1430.4d, 1450.4d, 3487.0d, 3587.0d, 12.0d, -37.0d, 730.4d, 743.6d, 3837.0d, 3903.0d, -22.0d, 700.4d, 713.6d, 3612.0d, 3678.0d, 13.0d, -55.0d, 748.4d, 753.6d, 4017.0d, 4043.0d, 21.0d, 779.4d, 784.6d, 3792.0d, 3818.0d, 14.0d, -63.0d, 760.4d, 765.6d, 4117.0d, 4143.0d, 12.0d, 790.4d, 795.6d, 3892.0d, 3918.0d, 19.0d, 735.0d, 877.4d, 887.6d, 712.0d, 763.0d, 770.0d, 832.4d, 842.6d, 312.0d, 363.0d, 20.0d, -109.0d, 793.4d, 818.6d, 4512.0d, 4638.0d, -23.0d, 834.4d, 859.6d, 4287.0d, 4413.0d, 21.0d, 1326.0d, 1498.4d, 1508.4d, 862.0d, 912.0d, 1358.0d, 1450.4d, 1460.4d, 462.0d, 512.0d, 22.0d, 2580.0d, 3512.4d, 3587.6d, 4662.0d, 5038.0d, 2525.0d, 3412.4d, 3487.6d, 4437.0d, 4813.0d, 25.0d, 910.0d, 1932.4d, 1992.6d, 5112.0d, 5413.0d, 875.0d, 1852.4d, 1912.6d, 4887.0d, 5188.0d};

    /* renamed from: d, reason: collision with root package name */
    static String[] f3023d = {"2100", "1900", "1800", "1700", "850", "800", "2600", "900", "1700", "1700E", "1500", "700L", "700U", "700U", "", "", "", "", "800", "800", "1500", "3500", "", "", "1900E", "850E"};

    public static int a(int i2) {
        if (i2 >= 0) {
            return (int) f3022c[(i2 * f3021b) + 0];
        }
        return 0;
    }

    public static String b(int i2, int i3) {
        if (i2 < 0) {
            return null;
        }
        double[] dArr = f3022c;
        int i4 = f3021b;
        int i5 = (int) dArr[(i2 * i4) + 0];
        double d2 = dArr[(i2 * i4) + 1];
        double d3 = i3;
        Double.isNaN(d3);
        double d4 = d2 + ((d3 * 1.0d) / 5.0d);
        double d5 = dArr[(i2 * i4) + 4];
        double d6 = dArr[(i2 * i4) + 5];
        double d7 = dArr[(i2 * i4) + 5 + 2];
        double d8 = dArr[(i2 * i4) + 5 + 1];
        double d9 = dArr[(i2 * i4) + 9];
        double d10 = dArr[(i4 * i2) + 10];
        Double.isNaN(d3);
        double d11 = ((((((d3 - d5) / (d6 - d5)) * (d10 - d9)) + d9) * 1.0d) / 5.0d) + d8;
        q0.a.b(f3020a, "FDL=" + d4 + ", FUP=" + d11);
        return f.e(i3, i5, d4, d11);
    }

    public static int c(int i2) {
        int length = f3022c.length / f3021b;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            double[] dArr = f3022c;
            int i5 = f3021b;
            double d2 = dArr[(i4 * i5) + 4];
            double d3 = dArr[(i5 * i4) + 5];
            double d4 = i2;
            if (d4 >= d2 && d4 <= d3) {
                i3 = i4;
            }
        }
        return i3;
    }
}
