package com.yandex.mobile.ads.impl;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.nz;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class mc0 implements g60 {

    /* renamed from: d, reason: collision with root package name */
    private static final nc0 f30340d = hm1.b();

    /* renamed from: e, reason: collision with root package name */
    public static final g60.c f30341e = new S1(3);

    /* renamed from: a, reason: collision with root package name */
    private final UUID f30342a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDrm f30343b;

    /* renamed from: c, reason: collision with root package name */
    private int f30344c;

    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void a(MediaDrm mediaDrm, byte[] bArr, gi1 gi1Var) {
            LogSessionId logSessionIdA = gi1Var.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(logSessionIdA);
        }
    }

    private mc0(UUID uuid) throws UnsupportedSchemeException {
        zf.a(uuid);
        zf.a("Use C.CLEARKEY_UUID instead", !lm.f30039b.equals(uuid));
        this.f30342a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f30343b = mediaDrm;
        this.f30344c = 1;
        if (lm.f30041d.equals(uuid) && d()) {
            a(mediaDrm);
        }
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final int b() {
        return 2;
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final byte[] c() throws MediaDrmException {
        return this.f30343b.openSession();
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final synchronized void release() {
        int i = this.f30344c - 1;
        this.f30344c = i;
        if (i == 0) {
            this.f30343b.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    @Override // com.yandex.mobile.ads.impl.g60
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.g60.a a(byte[] r15, java.util.List<com.yandex.mobile.ads.impl.a40.b> r16, int r17, java.util.HashMap<java.lang.String, java.lang.String> r18) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mc0.a(byte[], java.util.List, int, java.util.HashMap):com.yandex.mobile.ads.impl.g60$a");
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final void b(byte[] bArr) {
        this.f30343b.closeSession(bArr);
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final void c(byte[] bArr) throws DeniedByServerException {
        this.f30343b.provideProvisionResponse(bArr);
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final yu d(byte[] bArr) throws MediaCryptoException {
        return new lc0(a(this.f30342a), bArr, s82.f32899a < 21 && lm.f30041d.equals(this.f30342a) && "L3".equals(this.f30343b.getPropertyString("securityLevel")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g60 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (y72 unused) {
            rs0.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k40();
        }
    }

    public static mc0 c(UUID uuid) throws y72 {
        try {
            return new mc0(uuid);
        } catch (UnsupportedSchemeException e4) {
            throw new y72(e4);
        } catch (Exception e10) {
            throw new y72(e10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final byte[] b(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (lm.f30040c.equals(this.f30342a)) {
            bArr2 = ko.a(bArr2);
        }
        return this.f30343b.provideKeyResponse(bArr, bArr2);
    }

    private static boolean d() {
        return f30340d.a().equals(s82.f32902d);
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final g60.d a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f30343b.getProvisionRequest();
        return new g60.d(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(g60.b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i10, byte[] bArr2) {
        nz.c cVar = nz.this.f31083y;
        cVar.getClass();
        cVar.obtainMessage(i, bArr).sendToTarget();
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final Map<String, String> a(byte[] bArr) {
        return this.f30343b.queryKeyStatus(bArr);
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final void a(byte[] bArr, byte[] bArr2) {
        this.f30343b.restoreKeys(bArr, bArr2);
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final void a(final g60.b bVar) {
        this.f30343b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.yandex.mobile.ads.impl.A2
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i10, byte[] bArr2) {
                this.f24053a.a(bVar, mediaDrm, bArr, i, i10, bArr2);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final void a(byte[] bArr, gi1 gi1Var) {
        if (s82.f32899a >= 31) {
            try {
                a.a(this.f30343b, bArr, gi1Var);
            } catch (UnsupportedOperationException unused) {
                rs0.d("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final boolean a(String str, byte[] bArr) {
        if (s82.f32899a >= 31) {
            return a.a(this.f30343b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f30342a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private static UUID a(UUID uuid) {
        return (s82.f32899a >= 27 || !lm.f30040c.equals(uuid)) ? uuid : lm.f30039b;
    }
}
