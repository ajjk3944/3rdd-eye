package o2;

import android.graphics.PointF;
import androidx.camera.core.impl.C0;
import i2.C4448h;
import i2.z;
import k2.InterfaceC5212c;
import p2.InterfaceC5442b;

/* compiled from: AnimatableTransform.java */
/* renamed from: o2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5417h implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final C0 f44816a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5418i<PointF, PointF> f44817b;

    /* renamed from: c, reason: collision with root package name */
    public final C5410a f44818c;

    /* renamed from: d, reason: collision with root package name */
    public final C5411b f44819d;

    /* renamed from: e, reason: collision with root package name */
    public final C5413d f44820e;

    /* renamed from: f, reason: collision with root package name */
    public final C5411b f44821f;

    /* renamed from: g, reason: collision with root package name */
    public final C5411b f44822g;

    /* renamed from: h, reason: collision with root package name */
    public final C5411b f44823h;
    public final C5411b i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f44824j;

    public C5417h() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return null;
    }

    public C5417h(C0 c02, InterfaceC5418i<PointF, PointF> interfaceC5418i, C5410a c5410a, C5411b c5411b, C5413d c5413d, C5411b c5411b2, C5411b c5411b3, C5411b c5411b4, C5411b c5411b5) {
        this.f44824j = false;
        this.f44816a = c02;
        this.f44817b = interfaceC5418i;
        this.f44818c = c5410a;
        this.f44819d = c5411b;
        this.f44820e = c5413d;
        this.f44823h = c5411b2;
        this.i = c5411b3;
        this.f44821f = c5411b4;
        this.f44822g = c5411b5;
    }
}
