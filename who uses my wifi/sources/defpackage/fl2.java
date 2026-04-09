package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fl2 implements gl2 {
    public final Map a;

    public fl2(Map map) {
        this.a = map;
    }

    @Override // defpackage.gl2
    public final zz2 a(String str, int i) {
        return (zz2) this.a.get(str);
    }
}
