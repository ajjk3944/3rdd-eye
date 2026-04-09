package pi;

import android.graphics.Point;
import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f32003a;

    /* renamed from: b, reason: collision with root package name */
    public int f32004b;

    /* renamed from: c, reason: collision with root package name */
    public int f32005c;

    /* renamed from: e, reason: collision with root package name */
    public Point f32007e;

    /* renamed from: f, reason: collision with root package name */
    public int f32008f;
    public a g;

    /* renamed from: d, reason: collision with root package name */
    public int f32006d = 1;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f32009h = new Bundle();

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdItem@");
        sb2.append(hashCode());
        sb2.append("【\ntype               = ");
        sb2.append(this.f32005c);
        sb2.append(", \nsource             = ");
        sb2.append(this.f32004b);
        sb2.append(", \nid                 = ");
        sb2.append(this.f32003a);
        sb2.append(", \nplacement          = null, \nadChoicesPlacement = ");
        sb2.append(this.f32006d);
        sb2.append(", \nadViewSize         = ");
        sb2.append(this.f32007e);
        sb2.append(", \nlayoutId           = ");
        sb2.append(this.f32008f);
        sb2.append(", \nnext               = [AdItem@");
        a aVar = this.g;
        sb2.append(aVar == null ? "null" : Integer.valueOf(aVar.hashCode()));
        sb2.append("]】\n");
        return sb2.toString();
    }
}
