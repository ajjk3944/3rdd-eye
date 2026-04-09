package p2;

import android.graphics.PointF;
import i2.C4448h;
import i2.z;
import k2.InterfaceC5212c;
import o2.C5414e;
import o2.InterfaceC5418i;

/* compiled from: CircleShape.java */
/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5441a implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final String f45014a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5418i<PointF, PointF> f45015b;

    /* renamed from: c, reason: collision with root package name */
    public final C5414e f45016c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f45017d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45018e;

    public C5441a(String str, InterfaceC5418i<PointF, PointF> interfaceC5418i, C5414e c5414e, boolean z10, boolean z11) {
        this.f45014a = str;
        this.f45015b = interfaceC5418i;
        this.f45016c = c5414e;
        this.f45017d = z10;
        this.f45018e = z11;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new k2.f(zVar, bVar, this);
    }
}
