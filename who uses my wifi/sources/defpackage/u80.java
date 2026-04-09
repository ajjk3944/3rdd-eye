package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u80 {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public jx0 h;
    public l80 i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final qk0 a = new qk0();
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        j80.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = l41.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                l90 l90Var = (l90) entry.getValue();
                float f = this.e / fC;
                int i = (int) (l90Var.a * f);
                int i2 = (int) (l90Var.b * f);
                l90 l90Var2 = new l90(i, i2, l90Var.c, l90Var.d, l90Var.e);
                Bitmap bitmap = l90Var.f;
                if (bitmap != null) {
                    l90Var2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, l90Var2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final hb0 d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            hb0 hb0Var = (hb0) this.g.get(i);
            String str2 = hb0Var.a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hb0Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(((f50) obj).a("\t"));
        }
        return sb.toString();
    }
}
