package wg;

import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f36661b;

    public /* synthetic */ e(a aVar, int i4) {
        this.f36660a = i4;
        this.f36661b = aVar;
    }

    public static String a(long j, String str) {
        if (j <= 0) {
            return str.concat(" 0.00K/s");
        }
        String[] strArr = com.liuzh.deviceinfo.utilities.h.f21261a;
        float f10 = j;
        int i4 = 0;
        while (f10 > 1.0f && i4 < 3) {
            float f11 = f10 / 1024.0f;
            if (f11 < 1.0f) {
                break;
            }
            i4++;
            f10 = f11;
        }
        String strReplace = com.liuzh.deviceinfo.utilities.h.f21261a[i4];
        if (strReplace.length() > 1) {
            strReplace = strReplace.replace("B", "");
        }
        Locale locale = Locale.US;
        String[] strArr2 = {String.format(locale, "%.2f", Float.valueOf(f10)).replace(".00", ""), strReplace};
        return String.format(locale, str + " %.2f" + strArr2[1] + "/s", Arrays.copyOf(new Object[]{Float.valueOf(Float.parseFloat(strArr2[0]))}, 1));
    }

    public static void c(TextView textView, long j, String str) {
        if (j <= 0) {
            textView.setText(str.concat("0.00K/s"));
            return;
        }
        String[] strArrF = wi.c.f(j);
        if (strArrF[0].contains(".")) {
            String[] strArrSplit = strArrF[0].split("\\.");
            if (strArrSplit[0].length() == 2) {
                strArrF[0] = strArrSplit[0] + "." + strArrSplit[1].charAt(0);
            } else if (strArrSplit[0].length() >= 3) {
                strArrF[0] = strArrSplit[0];
            }
        } else if (strArrF[0].length() == 1) {
            strArrF[0] = d.h.w(new StringBuilder(), strArrF[0], ".00");
        } else if (strArrF[0].length() == 2) {
            strArrF[0] = d.h.w(new StringBuilder(), strArrF[0], ".0");
        }
        strArrF[1] = strArrF[1].substring(0, 1);
        StringBuilder sbZ = d.h.z(str);
        sbZ.append(strArrF[0]);
        sbZ.append(strArrF[1]);
        sbZ.append("/s");
        textView.setText(sbZ.toString());
    }

    public final void b(long j, long j8) {
        switch (this.f36660a) {
            case 0:
                g gVar = (g) this.f36661b;
                gVar.f36670i = a(j8, "↑");
                gVar.j = a(j, "↓");
                gVar.j(s.j);
                gVar.j(s.f36701k);
                break;
            default:
                v vVar = (v) this.f36661b;
                if (!vVar.f36640a) {
                    TextView textView = vVar.f36721d;
                    if (textView != null) {
                        c(textView, j8, "↑");
                    }
                    TextView textView2 = vVar.f36722e;
                    if (textView2 != null) {
                        c(textView2, j, "↓");
                        break;
                    }
                }
                break;
        }
    }
}
