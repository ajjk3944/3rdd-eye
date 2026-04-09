package m1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f16138a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16139b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16140c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16141d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16142e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16143f;

    /* renamed from: g, reason: collision with root package name */
    public final float f16144g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16145h;

    /* renamed from: i, reason: collision with root package name */
    public final List f16146i;
    public final ArrayList j;

    public c(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        f10 = (i10 & 2) != 0 ? 0.0f : f10;
        f11 = (i10 & 4) != 0 ? 0.0f : f11;
        f12 = (i10 & 8) != 0 ? 0.0f : f12;
        f13 = (i10 & 16) != 0 ? 1.0f : f13;
        f14 = (i10 & 32) != 0 ? 1.0f : f14;
        f15 = (i10 & 64) != 0 ? 0.0f : f15;
        f16 = (i10 & 128) != 0 ? 0.0f : f16;
        if ((i10 & 256) != 0) {
            int i11 = f0.f16195a;
            list = mq.w.f16945a;
        }
        ArrayList arrayList = new ArrayList();
        this.f16138a = str;
        this.f16139b = f10;
        this.f16140c = f11;
        this.f16141d = f12;
        this.f16142e = f13;
        this.f16143f = f14;
        this.f16144g = f15;
        this.f16145h = f16;
        this.f16146i = list;
        this.j = arrayList;
    }
}
