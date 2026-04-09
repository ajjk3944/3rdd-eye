package com.google.android.exoplayer2;

import android.content.Context;
import p.l2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public Context f4233a;

    public io.sentry.transport.p a() {
        Context context = this.f4233a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        io.sentry.transport.p pVar = new io.sentry.transport.p();
        pVar.f12776d = o9.a.a(m9.l.f16365a);
        a2.a aVar = new a2.a(context);
        pVar.f12777g = aVar;
        pVar.f12778r = o9.a.a(new io.sentry.t(aVar, new i.g0(aVar)));
        a2.a aVar2 = (a2.a) pVar.f12777g;
        pVar.f12779x = new l2(13, aVar2);
        kq.a aVarA = o9.a.a(new om.f((l2) pVar.f12779x, 14, o9.a.a(new t9.e(aVar2, 0))));
        pVar.f12780y = aVarA;
        et.d dVar = new et.d();
        a2.a aVar3 = (a2.a) pVar.f12777g;
        qm.c cVar = new qm.c(aVar3, aVarA, dVar, 1);
        kq.a aVar4 = (kq.a) pVar.f12776d;
        kq.a aVar5 = (kq.a) pVar.f12778r;
        pVar.B = o9.a.a(new io.sentry.k(new cj.a(aVar4, aVar5, cVar, aVarA, aVarA, 26), new of.b(aVar3, aVar5, aVarA, cVar, aVar4, aVarA, aVarA), new js.e(aVar4, aVarA, cVar, aVarA, 14), 13));
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.g[] b(android.os.Handler r9, rb.u r10, y9.j r11, eb.k r12, pa.d r13) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r1 = r8.f4233a
            rb.g r2 = new rb.g
            r2.<init>(r1, r9, r10)
            r0.add(r2)
            y9.s r10 = new y9.s
            y9.d r2 = y9.d.f25912c
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.media.action.HDMI_AUDIO_PLUG"
            r2.<init>(r3)
            r3 = 0
            android.content.Intent r2 = r1.registerReceiver(r3, r2)
            int r3 = qb.v.f20828a
            r4 = 17
            r5 = 0
            if (r3 < r4) goto L48
            java.lang.String r4 = qb.v.f20830c
            java.lang.String r6 = "Amazon"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L38
            java.lang.String r6 = "Xiaomi"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L48
        L38:
            android.content.ContentResolver r4 = r1.getContentResolver()
            java.lang.String r6 = "external_surround_sound_enabled"
            int r4 = android.provider.Settings.Global.getInt(r4, r6, r5)
            r6 = 1
            if (r4 != r6) goto L48
            y9.d r2 = y9.d.f25913d
            goto L7e
        L48:
            r4 = 29
            r6 = 8
            if (r3 < r4) goto L5e
            boolean r3 = qb.v.B(r1)
            if (r3 == 0) goto L5e
            y9.d r2 = new y9.d
            int[] r3 = y9.c.a()
            r2.<init>(r3, r6)
            goto L7e
        L5e:
            if (r2 == 0) goto L7c
            java.lang.String r3 = "android.media.extra.AUDIO_PLUG_STATE"
            int r3 = r2.getIntExtra(r3, r5)
            if (r3 != 0) goto L69
            goto L7c
        L69:
            y9.d r3 = new y9.d
            java.lang.String r4 = "android.media.extra.ENCODINGS"
            int[] r4 = r2.getIntArrayExtra(r4)
            java.lang.String r7 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r2 = r2.getIntExtra(r7, r6)
            r3.<init>(r4, r2)
            r2 = r3
            goto L7e
        L7c:
            y9.d r2 = y9.d.f25912c
        L7e:
            qm.c r3 = new qm.c
            y9.g[] r4 = new y9.g[r5]
            r3.<init>(r4)
            r10.<init>(r2, r3)
            y9.v r2 = new y9.v
            r2.<init>(r1, r9, r11, r10)
            r0.add(r2)
            android.os.Looper r10 = r9.getLooper()
            eb.l r11 = new eb.l
            r11.<init>(r12, r10)
            r0.add(r11)
            android.os.Looper r9 = r9.getLooper()
            com.google.android.exoplayer2.metadata.a r10 = new com.google.android.exoplayer2.metadata.a
            r10.<init>(r13, r9)
            r0.add(r10)
            sb.b r9 = new sb.b
            r9.<init>()
            r0.add(r9)
            com.google.android.exoplayer2.g[] r9 = new com.google.android.exoplayer2.g[r5]
            java.lang.Object[] r9 = r0.toArray(r9)
            com.google.android.exoplayer2.g[] r9 = (com.google.android.exoplayer2.g[]) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.m.b(android.os.Handler, rb.u, y9.j, eb.k, pa.d):com.google.android.exoplayer2.g[]");
    }
}
