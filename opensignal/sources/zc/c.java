package zc;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class c extends k3 {
    public u.e B;
    public Long D;
    public Long E;

    /* renamed from: x, reason: collision with root package name */
    public String f26878x;

    /* renamed from: y, reason: collision with root package name */
    public HashSet f26879y;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList w1(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.c.w1(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final u3 x1(Integer num) {
        if (this.B.containsKey(num)) {
            return (u3) this.B.get(num);
        }
        u3 u3Var = new u3(this, this.f26878x);
        this.B.put(num, u3Var);
        return u3Var;
    }

    @Override // zc.k3
    public final void v1() {
    }
}
