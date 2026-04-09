package x5;

import java.util.Iterator;
import p5.l;

/* loaded from: classes3.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final f f24192a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24193b;

    /* renamed from: c, reason: collision with root package name */
    public final l f24194c;

    public d(f fVar, boolean z6, l lVar) {
        this.f24192a = fVar;
        this.f24193b = z6;
        this.f24194c = lVar;
    }

    @Override // x5.g
    public final Iterator iterator() {
        return new c(this);
    }
}
