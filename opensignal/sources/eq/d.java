package eq;

import br.l;
import com.survicate.surveys.entities.survey.audience.AudienceRelation;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements zn.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8253a;

    /* renamed from: b, reason: collision with root package name */
    public final AudienceRelation f8254b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8255c;

    /* renamed from: d, reason: collision with root package name */
    public final gq.c f8256d;

    public d(ArrayList arrayList, AudienceRelation audienceRelation, boolean z10, gq.c cVar) {
        l.e(audienceRelation, "relation");
        this.f8253a = arrayList;
        this.f8254b = audienceRelation;
        this.f8255c = z10;
        this.f8256d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r7 = this;
            gq.c r0 = r7.f8256d
            on.k r0 = (on.k) r0
            java.util.List r0 = r0.a()
            java.util.ArrayList r1 = r7.f8253a
            boolean r2 = r1.isEmpty()
            r3 = 1
            if (r2 == 0) goto L13
            goto L90
        L13:
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = mq.p.a0(r1, r4)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.next()
            dq.a r4 = (dq.a) r4
            boolean r4 = r4.a(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.add(r4)
            goto L22
        L3a:
            java.util.Iterator r0 = r2.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r0.next()
        L48:
            boolean r2 = r0.hasNext()
            r4 = 0
            if (r2 == 0) goto L84
            java.lang.Object r2 = r0.next()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            int[] r5 = eq.c.f8252a
            com.survicate.surveys.entities.survey.audience.AudienceRelation r6 = r7.f8254b
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r3) goto L7a
            r6 = 2
            if (r5 != r6) goto L74
            if (r1 != 0) goto L72
            if (r2 == 0) goto L7f
        L72:
            r4 = r3
            goto L7f
        L74:
            bf.n r0 = new bf.n
            r0.<init>()
            throw r0
        L7a:
            if (r1 == 0) goto L7f
            if (r2 == 0) goto L7f
            goto L72
        L7f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            goto L48
        L84:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            boolean r1 = r7.f8255c
            if (r1 == 0) goto L92
            if (r0 != 0) goto L91
        L90:
            return r3
        L91:
            return r4
        L92:
            return r0
        L93:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Empty collection can't be reduced."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.d.a():boolean");
    }
}
