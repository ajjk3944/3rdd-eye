package defpackage;

import android.content.Context;
import android.util.Range;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vd1 {
    public final Context a;
    public final de1 b;
    public yd1 c;
    public boolean d;
    public pz e;
    public boolean f;
    public long g = 15000;
    public final ee1 h;

    public vd1(Context context, de1 de1Var) {
        this.a = context.getApplicationContext();
        this.b = de1Var;
        ee1 ee1Var = new ee1();
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        ee1Var.d = range;
        ee1Var.c = ((Double) range.getUpper()).doubleValue();
        ee1Var.a = -9223372036854775807L;
        ee1Var.b = -9223372036854775807L;
        this.h = ee1Var;
        this.e = pz.o;
    }
}
