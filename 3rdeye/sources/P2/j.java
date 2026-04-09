package p2;

import android.graphics.PointF;
import i2.C4448h;
import i2.z;
import k2.InterfaceC5212c;
import o2.C5411b;
import o2.InterfaceC5418i;

/* compiled from: PolystarShape.java */
/* loaded from: classes.dex */
public final class j implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final String f45048a;

    /* renamed from: b, reason: collision with root package name */
    public final a f45049b;

    /* renamed from: c, reason: collision with root package name */
    public final C5411b f45050c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5418i<PointF, PointF> f45051d;

    /* renamed from: e, reason: collision with root package name */
    public final C5411b f45052e;

    /* renamed from: f, reason: collision with root package name */
    public final C5411b f45053f;

    /* renamed from: g, reason: collision with root package name */
    public final C5411b f45054g;

    /* renamed from: h, reason: collision with root package name */
    public final C5411b f45055h;
    public final C5411b i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f45056j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f45057k;

    /* compiled from: PolystarShape.java */
    public enum a {
        STAR(1),
        POLYGON(2);

        private final int value;

        a(int i) {
            this.value = i;
        }

        public static a forValue(int i) {
            for (a aVar : values()) {
                if (aVar.value == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public j(String str, a aVar, C5411b c5411b, InterfaceC5418i<PointF, PointF> interfaceC5418i, C5411b c5411b2, C5411b c5411b3, C5411b c5411b4, C5411b c5411b5, C5411b c5411b6, boolean z10, boolean z11) {
        this.f45048a = str;
        this.f45049b = aVar;
        this.f45050c = c5411b;
        this.f45051d = interfaceC5418i;
        this.f45052e = c5411b2;
        this.f45053f = c5411b3;
        this.f45054g = c5411b4;
        this.f45055h = c5411b5;
        this.i = c5411b6;
        this.f45056j = z10;
        this.f45057k = z11;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new k2.n(zVar, bVar, this);
    }
}
