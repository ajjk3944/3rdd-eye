package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i72 implements bd0 {
    public final Set a;
    public final boolean b;
    public final int c;
    public final boolean d;

    public i72(HashSet hashSet, boolean z, int i, boolean z2) {
        this.a = hashSet;
        this.b = z;
        this.c = i;
        this.d = z2;
    }

    @Override // defpackage.bd0
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.bd0
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bd0
    public final Set c() {
        return this.a;
    }

    @Override // defpackage.bd0
    public final int d() {
        return this.c;
    }
}
