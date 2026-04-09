package v1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f35635a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35636b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35637c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35638d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35639e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35640f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f35641h;

    /* renamed from: i, reason: collision with root package name */
    public final List f35642i;
    public final ArrayList j;

    public d(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i4) {
        str = (i4 & 1) != 0 ? "" : str;
        f10 = (i4 & 2) != 0 ? 0.0f : f10;
        f11 = (i4 & 4) != 0 ? 0.0f : f11;
        f12 = (i4 & 8) != 0 ? 0.0f : f12;
        f13 = (i4 & 16) != 0 ? 1.0f : f13;
        f14 = (i4 & 32) != 0 ? 1.0f : f14;
        f15 = (i4 & 64) != 0 ? 0.0f : f15;
        f16 = (i4 & 128) != 0 ? 0.0f : f16;
        if ((i4 & 256) != 0) {
            int i10 = g0.f35694a;
            list = zj.s.f38317a;
        }
        ArrayList arrayList = new ArrayList();
        this.f35635a = str;
        this.f35636b = f10;
        this.f35637c = f11;
        this.f35638d = f12;
        this.f35639e = f13;
        this.f35640f = f14;
        this.g = f15;
        this.f35641h = f16;
        this.f35642i = list;
        this.j = arrayList;
    }
}
