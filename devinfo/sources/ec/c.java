package ec;

import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends b4 {

    /* renamed from: e, reason: collision with root package name */
    public String f22596e;

    /* renamed from: f, reason: collision with root package name */
    public HashSet f22597f;
    public x.e g;

    /* renamed from: h, reason: collision with root package name */
    public Long f22598h;

    /* renamed from: i, reason: collision with root package name */
    public Long f22599i;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList F(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.c.F(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final o4 G(Integer num) {
        if (this.g.containsKey(num)) {
            return (o4) this.g.get(num);
        }
        o4 o4Var = new o4(this, this.f22596e);
        this.g.put(num, o4Var);
        return o4Var;
    }

    @Override // ec.b4
    public final void E() {
    }
}
