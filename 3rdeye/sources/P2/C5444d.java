package p2;

import android.graphics.Path;
import i2.C4448h;
import i2.z;
import k2.InterfaceC5212c;
import o2.C5412c;
import o2.C5413d;
import o2.C5414e;

/* compiled from: GradientFill.java */
/* renamed from: p2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5444d implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC5446f f45021a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f45022b;

    /* renamed from: c, reason: collision with root package name */
    public final C5412c f45023c;

    /* renamed from: d, reason: collision with root package name */
    public final C5413d f45024d;

    /* renamed from: e, reason: collision with root package name */
    public final C5414e f45025e;

    /* renamed from: f, reason: collision with root package name */
    public final C5414e f45026f;

    /* renamed from: g, reason: collision with root package name */
    public final String f45027g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f45028h;

    public C5444d(String str, EnumC5446f enumC5446f, Path.FillType fillType, C5412c c5412c, C5413d c5413d, C5414e c5414e, C5414e c5414e2, boolean z10) {
        this.f45021a = enumC5446f;
        this.f45022b = fillType;
        this.f45023c = c5412c;
        this.f45024d = c5413d;
        this.f45025e = c5414e;
        this.f45026f = c5414e2;
        this.f45027g = str;
        this.f45028h = z10;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new k2.h(zVar, c4448h, bVar, this);
    }
}
