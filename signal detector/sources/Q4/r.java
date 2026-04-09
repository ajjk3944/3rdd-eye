package Q4;

import android.bluetooth.BluetoothSocket;
import c5.C0412i;
import h5.InterfaceC2370d;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class r extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public t f3225e;

    /* renamed from: f, reason: collision with root package name */
    public BluetoothSocket f3226f;

    /* renamed from: g, reason: collision with root package name */
    public int f3227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t f3228h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3228h = tVar;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((r) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new r(this.f3228h, interfaceC2370d);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0048 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:41:0x0091, B:43:0x0097, B:14:0x0027, B:37:0x007c, B:17:0x002e, B:19:0x0032, B:21:0x0038, B:23:0x003b, B:26:0x0042, B:29:0x004e, B:31:0x0052, B:33:0x0059, B:28:0x0048), top: B:55:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:41:0x0091, B:43:0x0097, B:14:0x0027, B:37:0x007c, B:17:0x002e, B:19:0x0032, B:21:0x0038, B:23:0x003b, B:26:0x0042, B:29:0x004e, B:31:0x0052, B:33:0x0059, B:28:0x0048), top: B:55:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:41:0x0091, B:43:0x0097, B:14:0x0027, B:37:0x007c, B:17:0x002e, B:19:0x0032, B:21:0x0038, B:23:0x003b, B:26:0x0042, B:29:0x004e, B:31:0x0052, B:33:0x0059, B:28:0x0048), top: B:55:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    @Override // j5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.f3227g
            c5.i r1 = c5.C0412i.f5929a
            Q4.t r2 = r9.f3228h
            r3 = 2
            r4 = 1
            r5 = 0
            i5.a r6 = i5.EnumC2380a.f20635a
            if (r0 == 0) goto L2b
            if (r0 == r4) goto L23
            if (r0 != r3) goto L1b
            Q4.t r0 = r9.f3225e
            R2.a.H(r10)     // Catch: java.lang.Throwable -> L18
            goto L91
        L18:
            r10 = move-exception
            goto L9c
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            android.bluetooth.BluetoothSocket r0 = r9.f3226f
            Q4.t r7 = r9.f3225e
            R2.a.H(r10)     // Catch: java.lang.Throwable -> L18
            goto L7c
        L2b:
            R2.a.H(r10)
            android.bluetooth.BluetoothDevice r10 = r2.f3236F0     // Catch: java.lang.Throwable -> L18
            if (r10 == 0) goto L48
            android.os.ParcelUuid[] r10 = r10.getUuids()     // Catch: java.lang.Throwable -> L18
            if (r10 == 0) goto L48
            int r0 = r10.length     // Catch: java.lang.Throwable -> L18
            if (r0 <= 0) goto L3f
            r0 = 0
            r10 = r10[r0]     // Catch: java.lang.Throwable -> L18
            goto L40
        L3f:
            r10 = r5
        L40:
            if (r10 == 0) goto L48
            java.util.UUID r10 = r10.getUuid()     // Catch: java.lang.Throwable -> L18
            if (r10 != 0) goto L4e
        L48:
            java.lang.String r10 = "0000110E-0000-1000-8000-00805F9B34FB"
            java.util.UUID r10 = java.util.UUID.fromString(r10)     // Catch: java.lang.Throwable -> L18
        L4e:
            android.bluetooth.BluetoothDevice r0 = r2.f3236F0     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L58
            android.bluetooth.BluetoothSocket r10 = r0.createRfcommSocketToServiceRecord(r10)     // Catch: java.lang.Throwable -> L18
            r0 = r10
            goto L59
        L58:
            r0 = r5
        L59:
            android.content.Context r10 = r2.m()     // Catch: java.lang.Throwable -> L18
            r7 = 2131886288(0x7f1200d0, float:1.940715E38)
            java.lang.String r7 = r2.r(r7)     // Catch: java.lang.Throwable -> L18
            F4.d.b(r10, r7)     // Catch: java.lang.Throwable -> L18
            G5.d r10 = z5.D.f24486b     // Catch: java.lang.Throwable -> L18
            Q4.p r7 = new Q4.p     // Catch: java.lang.Throwable -> L18
            r7.<init>(r0, r5)     // Catch: java.lang.Throwable -> L18
            r9.f3225e = r2     // Catch: java.lang.Throwable -> L18
            r9.f3226f = r0     // Catch: java.lang.Throwable -> L18
            r9.f3227g = r4     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = z5.AbstractC3046w.r(r10, r9, r7)     // Catch: java.lang.Throwable -> L18
            if (r10 != r6) goto L7b
            goto L8f
        L7b:
            r7 = r2
        L7c:
            G5.d r10 = z5.D.f24486b     // Catch: java.lang.Throwable -> L18
            Q4.q r8 = new Q4.q     // Catch: java.lang.Throwable -> L18
            r8.<init>(r0, r5)     // Catch: java.lang.Throwable -> L18
            r9.f3225e = r7     // Catch: java.lang.Throwable -> L18
            r9.f3226f = r5     // Catch: java.lang.Throwable -> L18
            r9.f3227g = r3     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = z5.AbstractC3046w.r(r10, r9, r8)     // Catch: java.lang.Throwable -> L18
            if (r10 != r6) goto L90
        L8f:
            return r6
        L90:
            r0 = r7
        L91:
            boolean r10 = r0.v()     // Catch: java.lang.Throwable -> L18
            if (r10 == 0) goto L9a
            r0.X()     // Catch: java.lang.Throwable -> L18
        L9a:
            r10 = r1
            goto La0
        L9c:
            c5.e r10 = R2.a.d(r10)
        La0:
            java.lang.Throwable r10 = c5.C0409f.a(r10)
            if (r10 == 0) goto Lc0
            boolean r10 = r2.v()
            if (r10 == 0) goto Lc0
            android.content.Context r10 = r2.m()
            java.lang.String r0 = "android.settings.BLUETOOTH_SETTINGS"
            android.content.Intent r10 = com.bumptech.glide.d.x(r10, r0)
            if (r10 == 0) goto Lbd
            com.lefan.signal.MyApplication.f18812d = r4
            r2.W(r10)
        Lbd:
            r2.X()
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.r.l(java.lang.Object):java.lang.Object");
    }
}
