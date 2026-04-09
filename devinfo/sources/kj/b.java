package kj;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Pair;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements aj.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f28343e = {R.color.md_blue_400, R.color.md_deep_purple_400, R.color.md_deep_orange_400, R.color.md_pink_400, R.color.md_deep_orange_400, R.color.md_blue_grey_400};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f28344f = {R.string.fa_root_images, R.string.fa_root_videos, R.string.fa_root_audio, R.string.fa_root_documents, R.string.fa_root_apk, R.string.fa_others};

    /* renamed from: a, reason: collision with root package name */
    public final String f28345a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f28346b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28347c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f28348d = new HashMap();

    public b(String str) {
        long[] jArr = new long[6];
        this.f28346b = jArr;
        this.f28345a = str;
        Arrays.fill(jArr, 0L);
        b(0, ej.b.f23488a);
        b(1, ej.b.f23489b);
        b(2, ej.b.f23490c);
        b(3, ej.b.f23491d);
        b(4, ej.b.f23492e);
    }

    @Override // aj.a
    public final void a(long j, boolean z3, aj.b bVar) {
        c(wi.c.i(bVar.f410e), j);
        if (z3) {
            bVar.e(this);
        }
        d();
    }

    public final void b(int i4, String str) {
        for (String str2 : str.split("\n")) {
            boolean zContains = str2.contains("*");
            HashMap map = this.f28348d;
            if (zContains) {
                int iIndexOf = str2.indexOf("/");
                if (iIndexOf > -1) {
                    map.put(str2.substring(0, iIndexOf), Integer.valueOf(i4));
                }
            } else {
                map.put(str2, Integer.valueOf(i4));
            }
        }
    }

    public final void c(String str, double d10) {
        int iIndexOf;
        HashMap map = this.f28348d;
        Integer num = (Integer) map.get(str);
        if ((num == null || num.intValue() < 0) && (iIndexOf = str.indexOf("/")) > -1) {
            num = (Integer) map.get(str.substring(0, iIndexOf));
        }
        if (num == null || num.intValue() < 0) {
            num = 5;
        }
        int iIntValue = num.intValue();
        this.f28346b[iIntValue] = (long) (r0[iIntValue] + d10);
    }

    public final void d() {
        synchronized (this.f28347c) {
            try {
                this.f28347c.clear();
                for (int i4 = 0; i4 < this.f28346b.length; i4++) {
                    String string = ((ContextWrapper) jm.a.f27720a.f1134b).getString(f28344f[i4]);
                    Context context = pk.a.f32022a;
                    k.b(context);
                    int integer = context.getResources().getInteger(R.integer.fa_overview_txt_maxlen);
                    if (string.length() > integer) {
                        string = string.substring(0, integer) + "…";
                    }
                    this.f28347c.add(new Pair(Float.valueOf(this.f28346b[i4]), string + " " + wi.c.e(this.f28346b[i4])));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (long j : this.f28346b) {
            sb2.append(wi.c.e(j));
            sb2.append(",");
        }
        return "AnalyzeOverview{sizeData=" + sb2.toString() + '}';
    }
}
