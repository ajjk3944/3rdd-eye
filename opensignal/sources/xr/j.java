package xr;

import java.lang.reflect.Member;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends br.j implements ar.k {
    public static final j E = new j(1);

    @Override // br.d
    public final String B() {
        return "isSynthetic()Z";
    }

    @Override // ar.k
    public final Object a(Object obj) {
        Member member = (Member) obj;
        br.l.e(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }

    @Override // br.d, ir.c
    public final String getName() {
        return "isSynthetic";
    }

    @Override // br.d
    public final ir.f z() {
        return br.x.f2918a.b(Member.class);
    }
}
