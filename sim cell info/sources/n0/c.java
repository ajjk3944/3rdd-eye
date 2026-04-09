package n0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3015a = "c";

    /* renamed from: b, reason: collision with root package name */
    static int f3016b = 6;

    /* renamed from: c, reason: collision with root package name */
    static double[] f3017c = {1.0d, 890.0d, 0.0d, 1.0d, 124.0d, 45.0d, 2.0d, 890.0d, 0.0d, 0.0d, 124.0d, 45.0d, 2.0d, 890.0d, -1024.0d, 975.0d, 1023.0d, 45.0d, 3.0d, 890.0d, 0.0d, 0.0d, 124.0d, 45.0d, 3.0d, 890.0d, -1024.0d, 955.0d, 1023.0d, 45.0d, 4.0d, 890.0d, 0.0d, 0.0d, 124.0d, 45.0d, 4.0d, 890.0d, -1024.0d, 940.0d, 1023.0d, 45.0d, 5.0d, 1710.2d, -512.0d, 512.0d, 885.0d, 95.0d, 6.0d, 1850.2d, -512.0d, 512.0d, 810.0d, 80.0d, 7.0d, 450.6d, -259.0d, 259.0d, 293.0d, 10.0d, 8.0d, 479.0d, -306.0d, 306.0d, 340.0d, 10.0d, 9.0d, 824.2d, -128.0d, 128.0d, 251.0d, 45.0d};

    /* renamed from: d, reason: collision with root package name */
    static String[] f3018d = {"GSM900-P", "GSM900-E", "GSM900-R", "GSM900-ER", "DCS1800", "PCS1900", "GSM450", "GSM480", "GSM850"};

    /* renamed from: e, reason: collision with root package name */
    public static ArrayList<Integer> f3019e = new ArrayList<>();

    public static int a(int i2) {
        if (i2 >= 0) {
            return (int) f3017c[(i2 * f3016b) + 0];
        }
        return 0;
    }

    public static String b(int i2, int i3) {
        if (i2 < 0) {
            return null;
        }
        int i4 = (int) f3017c[(f3016b * i2) + 0];
        if (f3019e.size() > 1 && f3019e.contains(7)) {
            f3019e.contains(8);
        }
        double[] dArr = f3017c;
        int i5 = f3016b;
        double d2 = dArr[(i2 * i5) + 2];
        double d3 = dArr[(i2 * i5) + 1];
        double d4 = dArr[(i2 * i5) + 5];
        double d5 = i3;
        Double.isNaN(d5);
        double d6 = d3 + ((d5 + d2) * 0.2d);
        double d7 = d6 + d4;
        q0.a.b(f3015a, "FDL=" + d7 + ", FUP=" + d6);
        return f.e(i3, i4, d7, d6);
    }

    public static ArrayList<Integer> c(int i2) {
        f3019e.clear();
        int length = f3017c.length / f3016b;
        for (int i3 = 0; i3 <= length - 1; i3++) {
            double[] dArr = f3017c;
            int i4 = f3016b;
            double d2 = dArr[(i3 * i4) + 3];
            double d3 = dArr[(i4 * i3) + 4];
            double d4 = i2;
            if (d4 >= d2 && d4 <= d3) {
                f3019e.add(Integer.valueOf(i3));
            }
        }
        return f3019e;
    }

    public static String d(int i2) {
        int i3 = i2 - 1;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = f3018d;
        if (i3 >= strArr.length) {
            return null;
        }
        String str = strArr[i3];
        return (f3019e.size() <= 1 || !str.startsWith("GSM900")) ? str : "GSM900";
    }

    public static String e(int i2) {
        ArrayList<Integer> arrayListC = c(i2);
        if (arrayListC.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(arrayListC.size());
        arrayList.addAll(arrayListC);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (arrayList.size() > 1) {
            if (!(arrayList.contains(7) && arrayList.contains(8))) {
                int iIntValue = ((Integer) arrayList.get(size - 1)).intValue();
                arrayList.clear();
                arrayList.add(Integer.valueOf(iIntValue));
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                int iA = a(iIntValue2);
                if (iA > 0) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    String strD = d(iA);
                    if (strD != null) {
                        sb.append(strD);
                        sb.append(" ");
                    }
                    String strB = b(iIntValue2, i2);
                    if (strB != null) {
                        sb.append(strB);
                    }
                }
            }
        }
        return sb.toString();
    }
}
