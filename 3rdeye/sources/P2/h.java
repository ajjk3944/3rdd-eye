package p2;

import o2.C5412c;
import o2.C5413d;

/* compiled from: Mask.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final a f45042a;

    /* renamed from: b, reason: collision with root package name */
    public final C5412c f45043b;

    /* renamed from: c, reason: collision with root package name */
    public final C5413d f45044c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f45045d;

    /* compiled from: Mask.java */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public h(a aVar, C5412c c5412c, C5413d c5413d, boolean z10) {
        this.f45042a = aVar;
        this.f45043b = c5412c;
        this.f45044c = c5413d;
        this.f45045d = z10;
    }
}
