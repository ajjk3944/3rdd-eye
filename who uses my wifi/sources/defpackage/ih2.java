package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ih2 extends bg2 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // defpackage.qf2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih2.f(java.nio.ByteBuffer):void");
    }

    @Override // defpackage.bg2
    public final ce2 k(ce2 ce2Var) throws af2 {
        int i = ce2Var.c;
        if (i != 3) {
            if (i == 2) {
                return ce2.e;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new af2("Unhandled input format:", ce2Var);
            }
        }
        return new ce2(ce2Var.a, ce2Var.b, 2);
    }
}
