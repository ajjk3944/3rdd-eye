package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ru0 {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    public int a;
    public int b;
    public int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public ru0() {
        this.h = new Path();
        Paint paint = new Paint();
        this.g = paint;
        this.d = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f = new Paint(paint2);
    }

    public void a(int i2) {
        this.a = hg.d(i2, 68);
        this.b = hg.d(i2, 20);
        this.c = hg.d(i2, 0);
        ((Paint) this.d).setColor(this.a);
    }

    public ru0(pz pzVar) {
        this.d = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ph(false));
        this.e = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ph(true));
        String str = va1.a;
        this.f = new ua1();
        this.g = new pz(23);
        this.h = new f20(4);
        this.a = 4;
        this.b = Integer.MAX_VALUE;
        this.c = 20;
    }
}
