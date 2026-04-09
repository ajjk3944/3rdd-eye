package com.google.gson.internal;

import androidx.lifecycle.f1;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayDeque;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements n, cf.a, de.d, ba.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20747a;

    public /* synthetic */ b(int i4) {
        this.f20747a = i4;
    }

    @Override // com.google.gson.internal.n
    public Object b() {
        switch (this.f20747a) {
            case 0:
                return new TreeSet();
            case 1:
                return new ArrayDeque();
            default:
                return new m(true);
        }
    }

    @Override // de.d
    public Object c(f1 f1Var) {
        switch (this.f20747a) {
            case 9:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(f1Var);
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f20709a.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f20711c.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.f20710b.get();
            default:
                de.m mVar = ExecutorsRegistrar.f20709a;
                return ee.l.f23430a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List g(org.xmlpull.v1.XmlPullParser r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.f20747a
            switch(r0) {
                case 4: goto L6a;
                default: goto L5;
            }
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r9.getEventType()     // Catch: java.lang.Throwable -> L68
            r3 = 0
            r4 = r3
            r5 = r4
        L16:
            r6 = 1
            if (r2 == r6) goto L69
            r7 = 2
            if (r2 != r7) goto L3a
            java.lang.String r2 = "vendor-ndk"
            java.lang.String r7 = r9.getName()     // Catch: java.lang.Throwable -> L68
            boolean r2 = r2.equalsIgnoreCase(r7)     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L2a
            r5 = r6
            goto L60
        L2a:
            if (r5 == 0) goto L60
            java.lang.String r2 = "version"
            java.lang.String r7 = r9.getName()     // Catch: java.lang.Throwable -> L68
            boolean r2 = r2.equalsIgnoreCase(r7)     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L60
            r4 = r6
            goto L60
        L3a:
            r6 = 3
            if (r2 != r6) goto L50
            if (r4 == 0) goto L4d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L68
            r0.add(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r1.<init>()     // Catch: java.lang.Throwable -> L68
            r4 = r3
            goto L60
        L4d:
            if (r5 == 0) goto L60
            goto L69
        L50:
            r6 = 4
            if (r2 != r6) goto L60
            if (r4 == 0) goto L60
            java.lang.String r2 = r9.getText()     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L68
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
        L60:
            r9.next()     // Catch: java.lang.Throwable -> L68
            int r2 = r9.getEventType()     // Catch: java.lang.Throwable -> L68
            goto L16
        L68:
            r0 = 0
        L69:
            return r0
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.getEventType()     // Catch: java.lang.Throwable -> Lb4
            r2 = 0
        L74:
            r3 = 1
            if (r1 == r3) goto La4
            r4 = 2
            if (r1 != r4) goto L88
            java.lang.String r1 = "sepolicy"
            java.lang.String r4 = r9.getName()     // Catch: java.lang.Throwable -> Lb4
            boolean r1 = r1.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto L9c
            r2 = r3
            goto L9c
        L88:
            r3 = 3
            if (r1 != r3) goto L8e
            if (r2 == 0) goto L9c
            goto La4
        L8e:
            r3 = 4
            if (r1 != r3) goto L9c
            java.lang.String r1 = r9.getText()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> Lb4
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb4
        L9c:
            r9.next()     // Catch: java.lang.Throwable -> Lb4
            int r1 = r9.getEventType()     // Catch: java.lang.Throwable -> Lb4
            goto L74
        La4:
            int r9 = r0.length()
            if (r9 != 0) goto Lab
            goto Lb4
        Lab:
            java.lang.String r9 = r0.toString()
            java.util.List r9 = java.util.Collections.singletonList(r9)
            goto Lb5
        Lb4:
            r9 = 0
        Lb5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.b.g(org.xmlpull.v1.XmlPullParser):java.util.List");
    }

    @Override // ba.f
    public void a(Exception exc) {
    }

    @Override // cf.a
    public void d(cf.b bVar) {
    }
}
