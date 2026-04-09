package p2;

import i2.C4448h;
import i2.z;
import k2.InterfaceC5212c;
import o2.C5411b;
import o2.C5417h;

/* compiled from: Repeater.java */
/* loaded from: classes.dex */
public final class l implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final String f45063a;

    /* renamed from: b, reason: collision with root package name */
    public final C5411b f45064b;

    /* renamed from: c, reason: collision with root package name */
    public final C5411b f45065c;

    /* renamed from: d, reason: collision with root package name */
    public final C5417h f45066d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45067e;

    public l(String str, C5411b c5411b, C5411b c5411b2, C5417h c5417h, boolean z10) {
        this.f45063a = str;
        this.f45064b = c5411b;
        this.f45065c = c5411b2;
        this.f45066d = c5417h;
        this.f45067e = z10;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new k2.p(zVar, bVar, this);
    }
}
