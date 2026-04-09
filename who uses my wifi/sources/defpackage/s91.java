package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s91 implements xp0 {
    public static final i80 b = k80.d(s91.class);
    public r91 a;

    @Override // defpackage.xp0
    public final void a() {
        this.a.a();
        throw null;
    }

    @Override // defpackage.xp0
    public final List c() {
        return this.a.c();
    }

    @Override // defpackage.xp0
    public final List d() {
        return Collections.unmodifiableList(this.a.c);
    }

    @Override // defpackage.xp0
    public final boolean isEnabled() {
        return this.a != null;
    }
}
