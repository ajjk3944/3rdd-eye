package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n12 extends w12 {
    public static final int n;
    public static final int o;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        n = Color.rgb(204, 204, 204);
        o = iRgb;
    }

    public n12(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.f = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            p12 p12Var = (p12) list.get(i3);
            this.g.add(p12Var);
            this.h.add(p12Var);
        }
        this.i = num != null ? num.intValue() : n;
        this.j = num2 != null ? num2.intValue() : o;
        this.k = num3 != null ? num3.intValue() : 12;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.x12
    public final String d() {
        return this.f;
    }

    @Override // defpackage.x12
    public final ArrayList h() {
        return this.h;
    }
}
