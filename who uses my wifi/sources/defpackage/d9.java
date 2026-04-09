package defpackage;

import java.text.DecimalFormat;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class d9 extends dh {
    public xm f;
    public int l;
    public int m;
    public final ArrayList s;
    public final int g = -7829368;
    public final float h = 1.0f;
    public int i = -7829368;
    public final float j = 1.0f;
    public float[] k = new float[0];
    public int n = 6;
    public boolean o = false;
    public boolean p = true;
    public final boolean q = true;
    public final boolean r = true;
    public final boolean t = true;
    public boolean u = false;
    public float v = 0.0f;
    public float w = 0.0f;
    public float x = 0.0f;

    public d9() {
        this.d = k41.c(10.0f);
        this.b = k41.c(5.0f);
        this.c = k41.c(5.0f);
        this.s = new ArrayList();
    }

    public void a(float f, float f2) {
        float f3 = this.u ? this.w : f - 0.0f;
        float f4 = f2 + 0.0f;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.w = f3;
        this.v = f4;
        this.x = Math.abs(f4 - f3);
    }

    public final String b() {
        int i = 0;
        String str = "";
        while (true) {
            float[] fArr = this.k;
            if (i >= fArr.length) {
                return str;
            }
            String strA = (i < 0 || i >= fArr.length) ? "" : c().a(this.k[i]);
            if (strA != null && str.length() < strA.length()) {
                str = strA;
            }
            i++;
        }
    }

    public final n41 c() {
        xm xmVar = this.f;
        if (xmVar == null || xmVar.b != this.m) {
            int i = this.m;
            xm xmVar2 = new xm();
            xmVar2.b = i;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 == 0) {
                    stringBuffer.append(".");
                }
                stringBuffer.append("0");
            }
            xmVar2.a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
            this.f = xmVar2;
        }
        return this.f;
    }

    public final void d() {
        this.u = true;
        this.w = 0.0f;
        this.x = Math.abs(this.v - 0.0f);
    }
}
