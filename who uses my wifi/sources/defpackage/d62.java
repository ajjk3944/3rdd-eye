package defpackage;

import java.util.AbstractMap;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d62 implements m52, c62 {
    public final c62 f;
    public final HashSet g = new HashSet();

    public d62(q52 q52Var) {
        this.f = q52Var;
    }

    @Override // defpackage.c62
    public final void h(String str, y32 y32Var) {
        this.f.h(str, y32Var);
        this.g.remove(new AbstractMap.SimpleEntry(str, y32Var));
    }

    @Override // defpackage.m52, defpackage.r52
    public final void l(String str) {
        this.f.l(str);
    }

    @Override // defpackage.c62
    public final void p(String str, y32 y32Var) {
        this.f.p(str, y32Var);
        this.g.add(new AbstractMap.SimpleEntry(str, y32Var));
    }
}
