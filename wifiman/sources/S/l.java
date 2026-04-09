package S;

import L0.U;
import W0.h;
import com.google.ar.core.ImageMetadata;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final W0.h f20208a;

    /* renamed from: b, reason: collision with root package name */
    private static final U f20209b;

    static {
        W0.h hVar = new W0.h(h.a.f23513a.a(), h.c.f23518a.b(), null);
        f20208a = hVar;
        U uA = U.f11106d.a();
        f20209b = uA.b((15204351 & 1) != 0 ? uA.f11108a.g() : 0L, (15204351 & 2) != 0 ? uA.f11108a.k() : 0L, (15204351 & 4) != 0 ? uA.f11108a.n() : null, (15204351 & 8) != 0 ? uA.f11108a.l() : null, (15204351 & 16) != 0 ? uA.f11108a.m() : null, (15204351 & 32) != 0 ? uA.f11108a.i() : null, (15204351 & 64) != 0 ? uA.f11108a.j() : null, (15204351 & 128) != 0 ? uA.f11108a.o() : 0L, (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uA.f11108a.e() : null, (15204351 & 512) != 0 ? uA.f11108a.u() : null, (15204351 & 1024) != 0 ? uA.f11108a.p() : null, (15204351 & 2048) != 0 ? uA.f11108a.d() : 0L, (15204351 & 4096) != 0 ? uA.f11108a.s() : null, (15204351 & 8192) != 0 ? uA.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? uA.f11108a.h() : null, (15204351 & 32768) != 0 ? uA.f11109b.h() : 0, (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uA.f11109b.i() : 0, (15204351 & 131072) != 0 ? uA.f11109b.e() : 0L, (15204351 & 262144) != 0 ? uA.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? uA.f11110c : R.a.a(), (15204351 & ImageMetadata.SHADING_MODE) != 0 ? uA.f11109b.f() : hVar, (15204351 & 2097152) != 0 ? uA.f11109b.d() : 0, (15204351 & 4194304) != 0 ? uA.f11109b.c() : 0, (15204351 & 8388608) != 0 ? uA.f11109b.k() : null);
    }

    public static final U a() {
        return f20209b;
    }
}
