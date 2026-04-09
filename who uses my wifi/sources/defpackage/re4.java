package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class re4 extends bg2 {
    public int[] i;
    public int[] j;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    @Override // defpackage.qf2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re4.f(java.nio.ByteBuffer):void");
    }

    @Override // defpackage.bg2
    public final ce2 k(ce2 ce2Var) throws af2 {
        int[] iArr = this.i;
        if (iArr == null) {
            return ce2.e;
        }
        int i = ce2Var.c;
        if (!v23.a(i)) {
            throw new af2("Unhandled input format:", ce2Var);
        }
        int i2 = ce2Var.b;
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            if (i3 >= length) {
                return z ? new ce2(ce2Var.a, length, i) : ce2.e;
            }
            int i4 = iArr[i3];
            if (i4 >= i2) {
                String string = Arrays.toString(iArr);
                throw new af2(ex0.l(new StringBuilder(String.valueOf(string).length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), ce2Var);
            }
            z |= i4 != i3;
            i3++;
        }
    }

    @Override // defpackage.bg2
    public final void m() {
        this.j = this.i;
    }

    @Override // defpackage.bg2
    public final void n() {
        this.j = null;
        this.i = null;
    }
}
