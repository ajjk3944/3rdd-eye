package androidx.camera.core.impl;

import android.util.Size;

/* compiled from: SurfaceConfig.java */
/* loaded from: classes.dex */
public abstract class N0 {

    /* compiled from: SurfaceConfig.java */
    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        a(int i) {
            this.mId = i;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* compiled from: SurfaceConfig.java */
    public enum b {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    public static C1703n a(b bVar, a aVar) {
        return new C1703n(bVar, aVar, 0L);
    }

    public static b d(int i) {
        return i == 35 ? b.YUV : i == 256 ? b.JPEG : i == 4101 ? b.JPEG_R : i == 32 ? b.RAW : b.PRIV;
    }

    public static C1703n f(int i, int i10, Size size, C1705o c1705o) {
        b bVarD = d(i10);
        a aVar = a.NOT_SUPPORT;
        int iA = M.c.a(size);
        if (i == 1) {
            if (iA <= M.c.a(c1705o.f15106b.get(Integer.valueOf(i10)))) {
                aVar = a.s720p;
            } else {
                if (iA <= M.c.a(c1705o.f15108d.get(Integer.valueOf(i10)))) {
                    aVar = a.s1440p;
                }
            }
        } else if (iA <= M.c.a(c1705o.f15105a)) {
            aVar = a.VGA;
        } else if (iA <= M.c.a(c1705o.f15107c)) {
            aVar = a.PREVIEW;
        } else if (iA <= M.c.a(c1705o.f15109e)) {
            aVar = a.RECORD;
        } else if (iA <= M.c.a(c1705o.b().get(Integer.valueOf(i10)))) {
            aVar = a.MAXIMUM;
        } else {
            Size size2 = c1705o.f15111g.get(Integer.valueOf(i10));
            if (size2 != null) {
                if (iA <= size2.getHeight() * size2.getWidth()) {
                    aVar = a.ULTRA_MAXIMUM;
                }
            }
        }
        return a(bVarD, aVar);
    }

    public abstract a b();

    public abstract b c();

    public abstract long e();
}
