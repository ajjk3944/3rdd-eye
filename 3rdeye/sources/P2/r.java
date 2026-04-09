package p2;

import android.graphics.Paint;
import i2.C4448h;
import i2.z;
import java.util.ArrayList;
import k2.InterfaceC5212c;
import o2.C5410a;
import o2.C5411b;
import o2.C5413d;

/* compiled from: ShapeStroke.java */
/* loaded from: classes.dex */
public final class r implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final String f45085a;

    /* renamed from: b, reason: collision with root package name */
    public final C5411b f45086b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f45087c;

    /* renamed from: d, reason: collision with root package name */
    public final C5410a f45088d;

    /* renamed from: e, reason: collision with root package name */
    public final C5413d f45089e;

    /* renamed from: f, reason: collision with root package name */
    public final C5411b f45090f;

    /* renamed from: g, reason: collision with root package name */
    public final b f45091g;

    /* renamed from: h, reason: collision with root package name */
    public final c f45092h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f45093j;

    /* compiled from: ShapeStroke.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45094a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f45095b;

        static {
            int[] iArr = new int[c.values().length];
            f45095b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45095b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45095b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f45094a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45094a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45094a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = a.f45094a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* compiled from: ShapeStroke.java */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = a.f45095b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public r(String str, C5411b c5411b, ArrayList arrayList, C5410a c5410a, C5413d c5413d, C5411b c5411b2, b bVar, c cVar, float f10, boolean z10) {
        this.f45085a = str;
        this.f45086b = c5411b;
        this.f45087c = arrayList;
        this.f45088d = c5410a;
        this.f45089e = c5413d;
        this.f45090f = c5411b2;
        this.f45091g = bVar;
        this.f45092h = cVar;
        this.i = f10;
        this.f45093j = z10;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new k2.t(zVar, bVar, this);
    }
}
