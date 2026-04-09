package p2;

import i2.C4448h;
import i2.z;
import java.util.ArrayList;
import k2.InterfaceC5212c;
import o2.C5411b;
import o2.C5412c;
import o2.C5413d;
import o2.C5414e;
import p2.r;

/* compiled from: GradientStroke.java */
/* renamed from: p2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5445e implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final String f45029a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC5446f f45030b;

    /* renamed from: c, reason: collision with root package name */
    public final C5412c f45031c;

    /* renamed from: d, reason: collision with root package name */
    public final C5413d f45032d;

    /* renamed from: e, reason: collision with root package name */
    public final C5414e f45033e;

    /* renamed from: f, reason: collision with root package name */
    public final C5414e f45034f;

    /* renamed from: g, reason: collision with root package name */
    public final C5411b f45035g;

    /* renamed from: h, reason: collision with root package name */
    public final r.b f45036h;
    public final r.c i;

    /* renamed from: j, reason: collision with root package name */
    public final float f45037j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f45038k;

    /* renamed from: l, reason: collision with root package name */
    public final C5411b f45039l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f45040m;

    public C5445e(String str, EnumC5446f enumC5446f, C5412c c5412c, C5413d c5413d, C5414e c5414e, C5414e c5414e2, C5411b c5411b, r.b bVar, r.c cVar, float f10, ArrayList arrayList, C5411b c5411b2, boolean z10) {
        this.f45029a = str;
        this.f45030b = enumC5446f;
        this.f45031c = c5412c;
        this.f45032d = c5413d;
        this.f45033e = c5414e;
        this.f45034f = c5414e2;
        this.f45035g = c5411b;
        this.f45036h = bVar;
        this.i = cVar;
        this.f45037j = f10;
        this.f45038k = arrayList;
        this.f45039l = c5411b2;
        this.f45040m = z10;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new k2.i(zVar, bVar, this);
    }
}
