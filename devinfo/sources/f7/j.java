package f7;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import x.o0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public HashMap f23752c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f23753d;

    /* renamed from: e, reason: collision with root package name */
    public float f23754e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f23755f;
    public ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public o0 f23756h;

    /* renamed from: i, reason: collision with root package name */
    public x.o f23757i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f23758k;

    /* renamed from: l, reason: collision with root package name */
    public float f23759l;

    /* renamed from: m, reason: collision with root package name */
    public float f23760m;

    /* renamed from: n, reason: collision with root package name */
    public float f23761n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23762o;

    /* renamed from: a, reason: collision with root package name */
    public final f0 f23750a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f23751b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f23763p = 0;

    public final void a(String str) {
        r7.d.b(str);
        this.f23751b.add(str);
    }

    public final float b() {
        return (long) (((this.f23760m - this.f23759l) / this.f23761n) * 1000.0f);
    }

    public final Map c() {
        float fC = r7.j.c();
        if (fC != this.f23754e) {
            for (Map.Entry entry : this.f23753d.entrySet()) {
                HashMap map = this.f23753d;
                String str = (String) entry.getKey();
                z zVar = (z) entry.getValue();
                float f10 = this.f23754e / fC;
                int i4 = (int) (zVar.f23827a * f10);
                int i10 = (int) (zVar.f23828b * f10);
                z zVar2 = new z(i4, zVar.f23829c, zVar.f23830d, i10, zVar.f23831e);
                Bitmap bitmap = zVar.f23832f;
                if (bitmap != null) {
                    zVar2.f23832f = Bitmap.createScaledBitmap(bitmap, i4, i10, true);
                }
                map.put(str, zVar2);
            }
        }
        this.f23754e = fC;
        return this.f23753d;
    }

    public final k7.h d(String str) {
        int size = this.g.size();
        for (int i4 = 0; i4 < size; i4++) {
            k7.h hVar = (k7.h) this.g.get(i4);
            String str2 = hVar.f28066a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sb2.append(((n7.d) obj).a("\t"));
        }
        return sb2.toString();
    }
}
