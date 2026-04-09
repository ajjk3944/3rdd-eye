package p2;

import g0.C4356c;
import i2.C4448h;
import i2.z;
import k2.InterfaceC5212c;
import k2.u;
import o2.C5411b;

/* compiled from: ShapeTrimPath.java */
/* loaded from: classes.dex */
public final class s implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final a f45096a;

    /* renamed from: b, reason: collision with root package name */
    public final C5411b f45097b;

    /* renamed from: c, reason: collision with root package name */
    public final C5411b f45098c;

    /* renamed from: d, reason: collision with root package name */
    public final C5411b f45099d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45100e;

    /* compiled from: ShapeTrimPath.java */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException(C4356c.h(i, "Unknown trim path type "));
        }
    }

    public s(String str, a aVar, C5411b c5411b, C5411b c5411b2, C5411b c5411b3, boolean z10) {
        this.f45096a = aVar;
        this.f45097b = c5411b;
        this.f45098c = c5411b2;
        this.f45099d = c5411b3;
        this.f45100e = z10;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new u(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f45097b + ", end: " + this.f45098c + ", offset: " + this.f45099d + "}";
    }
}
