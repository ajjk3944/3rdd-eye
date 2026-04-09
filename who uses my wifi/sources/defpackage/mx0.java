package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mx0 extends ba {
    public final PointF i;
    public final PointF j;
    public final pu k;
    public final pu l;
    public vq2 m;
    public vq2 n;

    public mx0(pu puVar, pu puVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = puVar;
        this.l = puVar2;
        i(this.d);
    }

    @Override // defpackage.ba
    public final Object e() {
        return l();
    }

    @Override // defpackage.ba
    public final /* bridge */ /* synthetic */ Object f(w40 w40Var, float f) {
        return l();
    }

    @Override // defpackage.ba
    public final void i(float f) {
        pu puVar = this.k;
        puVar.i(f);
        pu puVar2 = this.l;
        puVar2.i(f);
        this.i.set(((Float) puVar.e()).floatValue(), ((Float) puVar2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((x9) arrayList.get(i)).c();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF l() {
        /*
            r12 = this;
            vq2 r0 = r12.m
            r1 = 0
            if (r0 == 0) goto L39
            pu r0 = r12.k
            y9 r2 = r0.c
            w40 r2 = r2.e()
            if (r2 == 0) goto L39
            java.lang.Float r3 = r2.h
            vq2 r4 = r12.m
            float r5 = r2.g
            if (r3 != 0) goto L19
            r6 = r5
            goto L1e
        L19:
            float r3 = r3.floatValue()
            r6 = r3
        L1e:
            java.lang.Object r3 = r2.b
            r7 = r3
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r2 = r2.c
            r8 = r2
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r0.c()
            float r10 = r0.d()
            float r11 = r0.d
            java.lang.Object r0 = r4.j(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L3a
        L39:
            r0 = r1
        L3a:
            vq2 r2 = r12.n
            if (r2 == 0) goto L71
            pu r2 = r12.l
            y9 r3 = r2.c
            w40 r3 = r3.e()
            if (r3 == 0) goto L71
            java.lang.Float r1 = r3.h
            vq2 r4 = r12.n
            float r5 = r3.g
            if (r1 != 0) goto L52
            r6 = r5
            goto L57
        L52:
            float r1 = r1.floatValue()
            r6 = r1
        L57:
            java.lang.Object r1 = r3.b
            r7 = r1
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r1 = r3.c
            r8 = r1
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r2.c()
            float r10 = r2.d()
            float r11 = r2.d
            java.lang.Object r1 = r4.j(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r1 = (java.lang.Float) r1
        L71:
            r2 = 0
            android.graphics.PointF r3 = r12.i
            android.graphics.PointF r4 = r12.j
            if (r0 != 0) goto L7e
            float r0 = r3.x
            r4.set(r0, r2)
            goto L85
        L7e:
            float r0 = r0.floatValue()
            r4.set(r0, r2)
        L85:
            if (r1 != 0) goto L8f
            float r0 = r4.x
            float r1 = r3.y
            r4.set(r0, r1)
            return r4
        L8f:
            float r0 = r4.x
            float r1 = r1.floatValue()
            r4.set(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx0.l():android.graphics.PointF");
    }
}
