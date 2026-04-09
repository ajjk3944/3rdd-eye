package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.4d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06034d<T> {
    public static byte[] A09;
    public static String[] A0A = {"qNhODmuhOGTzTOdNu4k", "7K2GPWa5EHuyy4", "E4NOCJ5RL4hYeLNooPFdkLqGKDRv", "JwlW7s8WNTa19hdGL1amV", "YNjlntyRTdoFHiJHxz0qVC", "VcHvMaXHchlXNA9aE7EYkOxPZlMykCpc", "sHIyzZJD7qVKB1sd9lWDot", "2KMjU5K0FjJgBGqm2h4w3g2sgyG9pwrH"};
    public boolean A00;
    public boolean A01;
    public final AnonymousClass45 A02;
    public final C4X A03;
    public final InterfaceC06014b<T> A04;
    public final Object A05;
    public final ArrayDeque<Runnable> A06;
    public final ArrayDeque<Runnable> A07;
    public final CopyOnWriteArraySet<C06024c<T>> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C06034d(CopyOnWriteArraySet<C06024c<T>> copyOnWriteArraySet, Looper looper, AnonymousClass45 anonymousClass45, InterfaceC06014b<T> interfaceC06014b) {
        this.A02 = anonymousClass45;
        this.A08 = copyOnWriteArraySet;
        this.A04 = interfaceC06014b;
        this.A05 = new Object();
        this.A06 = new ArrayDeque<>();
        this.A07 = new ArrayDeque<>();
        this.A03 = anonymousClass45.A5P(looper, new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.4Z
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.A00.A05(message);
            }
        });
        this.A01 = true;
        this.A00 = MetaExoPlayerUpgradeConfig.A03(EnumC1974jX.A0E);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{41, 46, 54, 47, 43, 37, 33, 60, 45, 58, 41, 60, 33, 39, 38, 14, 33, 38, 33, 59, 32, 45, 44};
        if (A0A[0].length() == 4) {
            throw new RuntimeException();
        }
        A0A[3] = "KpT";
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public C06034d(Looper looper, AnonymousClass45 anonymousClass45, InterfaceC06014b<T> interfaceC06014b) {
        this(new CopyOnWriteArraySet(), looper, anonymousClass45, interfaceC06014b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private final C06034d<T> A00(Looper looper, AnonymousClass45 anonymousClass45, InterfaceC06014b<T> interfaceC06014b) {
        return new C06034d<>(this.A08, looper, anonymousClass45, interfaceC06014b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private void A02() {
        if (!this.A01) {
            return;
        }
        AbstractC05983y.A08(Thread.currentThread() == this.A03.A8R().getThread());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    public static /* synthetic */ void A04(CopyOnWriteArraySet copyOnWriteArraySet, int i10, InterfaceC06004a interfaceC06004a) {
        Iterator it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(0, 6, 102));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public boolean A05(Message message) {
        Iterator<C06024c<T>> it = this.A08.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(6, 17, 110));
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final C06034d<T> A07(Looper looper, InterfaceC06014b<T> interfaceC06014b) {
        return A00(looper, this.A02, interfaceC06014b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    /* JADX WARN: Incorrect condition in loop: B:12:0x003d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08() {
        /*
            r4 = this;
            r4.A02()
            java.util.ArrayDeque<java.lang.Runnable> r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            return
        Lc:
            com.facebook.ads.redexgen.X.4X r0 = r4.A03
            r2 = 0
            boolean r0 = r0.A9n(r2)
            if (r0 != 0) goto L20
            com.facebook.ads.redexgen.X.4X r1 = r4.A03
            com.facebook.ads.redexgen.X.4X r0 = r4.A03
            com.facebook.ads.redexgen.X.pK r0 = r0.ACg(r2)
            r1.AJD(r0)
        L20:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r4.A06
            boolean r0 = r0.isEmpty()
            r2 = r0 ^ 1
            java.util.ArrayDeque<java.lang.Runnable> r1 = r4.A06
            java.util.ArrayDeque<java.lang.Runnable> r0 = r4.A07
            r1.addAll(r0)
            java.util.ArrayDeque<java.lang.Runnable> r0 = r4.A07
            r0.clear()
            if (r2 == 0) goto L37
            return
        L37:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r4.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L74
            java.util.ArrayDeque<java.lang.Runnable> r0 = r4.A06
            java.lang.Object r3 = r0.peekFirst()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C06034d.A0A
            r0 = 4
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L5f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L5f:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C06034d.A0A
            java.lang.String r1 = "yEp1Grh3pDykJXHd8ndBtu"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "iM1KUlOTpdsgtS4YknLkQB"
            r0 = 6
            r2[r0] = r1
            r3.run()
            java.util.ArrayDeque<java.lang.Runnable> r0 = r4.A06
            r0.removeFirst()
            goto L37
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C06034d.A08():void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A09(final int i10, final InterfaceC06004a<T> interfaceC06004a) {
        A02();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.A08);
        if (this.A00) {
            Iterator it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(0, 6, 102));
            }
            return;
        }
        this.A07.add(new Runnable() { // from class: com.facebook.ads.redexgen.X.4Y
            @Override // java.lang.Runnable
            public final void run() {
                C06034d.A04(copyOnWriteArraySet, i10, interfaceC06004a);
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A0A(int i10, InterfaceC06004a<T> interfaceC06004a) {
        A09(i10, interfaceC06004a);
        A08();
    }
}
