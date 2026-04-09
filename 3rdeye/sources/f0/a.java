package f0;

import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.InterfaceC1678a0;
import androidx.camera.core.impl.InterfaceC1680b0;
import java.util.HashMap;

/* compiled from: QualityResolutionModifiedEncoderProfilesProvider.java */
/* loaded from: classes.dex */
public final class a implements InterfaceC1678a0 {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1678a0 f37793b;

    /* renamed from: c, reason: collision with root package name */
    public final C0 f37794c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f37795d = new HashMap();

    public a(InterfaceC1678a0 interfaceC1678a0, C0 c02) {
        this.f37793b = interfaceC1678a0;
        this.f37794c = c02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.InterfaceC1680b0 a(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.HashMap r2 = r0.f37795d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L1b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.get(r1)
            androidx.camera.core.impl.b0 r1 = (androidx.camera.core.impl.InterfaceC1680b0) r1
            return r1
        L1b:
            androidx.camera.core.impl.a0 r3 = r0.f37793b
            boolean r4 = r3.b(r1)
            r5 = 0
            if (r4 == 0) goto Ld2
            androidx.camera.core.impl.b0 r3 = r3.f(r1)
            java.util.Objects.requireNonNull(r3)
            androidx.camera.core.impl.C0 r4 = r0.f37794c
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r6 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            java.util.ArrayList r4 = r4.f(r6)
            java.util.Iterator r4 = r4.iterator()
        L37:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r4.next()
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r6 = (androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk) r6
            if (r6 == 0) goto L37
            r4 = 4
            if (r1 == r4) goto L64
            r4 = 5
            if (r1 == r4) goto L5a
            r4 = 6
            if (r1 == r4) goto L50
        L4e:
            r4 = r5
            goto L6d
        L50:
            android.util.Size r4 = new android.util.Size
            r6 = 1440(0x5a0, float:2.018E-42)
            r7 = 1080(0x438, float:1.513E-42)
            r4.<init>(r6, r7)
            goto L6d
        L5a:
            android.util.Size r4 = new android.util.Size
            r6 = 960(0x3c0, float:1.345E-42)
            r7 = 720(0x2d0, float:1.009E-42)
            r4.<init>(r6, r7)
            goto L6d
        L64:
            android.util.Size r4 = new android.util.Size
            r6 = 640(0x280, float:8.97E-43)
            r7 = 480(0x1e0, float:6.73E-43)
            r4.<init>(r6, r7)
        L6d:
            if (r4 != 0) goto L71
            r5 = r3
            goto Ld2
        L71:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = r3.d()
            java.util.Iterator r7 = r7.iterator()
        L7e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lbb
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.b0$c r8 = (androidx.camera.core.impl.InterfaceC1680b0.c) r8
            int r10 = r8.d()
            java.lang.String r11 = r8.h()
            int r12 = r8.b()
            int r13 = r8.e()
            int r14 = r4.getWidth()
            int r15 = r4.getHeight()
            int r16 = r8.i()
            int r17 = r8.a()
            int r18 = r8.c()
            int r19 = r8.f()
            androidx.camera.core.impl.g r9 = new androidx.camera.core.impl.g
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6.add(r9)
            goto L7e
        Lbb:
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto Lc2
            goto Ld2
        Lc2:
            int r4 = r3.a()
            int r5 = r3.b()
            java.util.List r3 = r3.c()
            androidx.camera.core.impl.f r5 = androidx.camera.core.impl.InterfaceC1680b0.b.e(r4, r5, r3, r6)
        Ld2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.put(r1, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.a.a(int):androidx.camera.core.impl.b0");
    }

    @Override // androidx.camera.core.impl.InterfaceC1678a0
    public final boolean b(int i) {
        return this.f37793b.b(i) && a(i) != null;
    }

    @Override // androidx.camera.core.impl.InterfaceC1678a0
    public final InterfaceC1680b0 f(int i) {
        return a(i);
    }
}
