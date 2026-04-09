package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pt extends cr {
    public static final ue0 i;
    public int g;
    public String h;

    static {
        ue0 ue0Var = new ue0("EDNS Extended Error Codes", 1);
        i = ue0Var;
        ue0Var.i = 65535;
        ue0Var.g("EDE");
        ue0Var.b("OTHER", 0);
        ue0Var.b("UNSUPPORTED_DNSKEY_ALGORITHM", 1);
        ue0Var.b("UNSUPPORTED_DS_DIGEST_TYPE", 2);
        ue0Var.b("STALE_ANSWER", 3);
        ue0Var.b("FORGED_ANSWER", 4);
        ue0Var.b("DNSSEC_INDETERMINATE", 5);
        ue0Var.b("DNSSEC_BOGUS", 6);
        ue0Var.b("SIGNATURE_EXPIRED", 7);
        ue0Var.b("SIGNATURE_NOT_YET_VALID", 8);
        ue0Var.b("DNSKEY_MISSING", 9);
        ue0Var.b("RRSIGS_MISSING", 10);
        ue0Var.b("NO_ZONE_KEY_BIT_SET", 11);
        ue0Var.b("NSEC_MISSING", 12);
        ue0Var.b("CACHED_ERROR", 13);
        ue0Var.b("NOT_READY", 14);
        ue0Var.b("BLOCKED", 15);
        ue0Var.b("CENSORED", 16);
        ue0Var.b("FILTERED", 17);
        ue0Var.b("PROHIBITED", 18);
        ue0Var.b("STALE_NXDOMAIN_ANSWER", 19);
        ue0Var.b("NOT_AUTHORITATIVE", 20);
        ue0Var.b("NOT_SUPPORTED", 21);
        ue0Var.b("NO_REACHABLE_AUTHORITY", 22);
        ue0Var.b("NETWORK_ERROR", 23);
        ue0Var.b("INVALID_DATA", 24);
        ue0Var.b("SIGNATURE_EXPIRED_BEFORE_VALID", 25);
        ue0Var.b("TOO_EARLY", 26);
        ue0Var.b("UNSUPPORTED_NSEC3_ITERATIONS_VALUE", 27);
        ue0Var.b("UNABLE_TO_CONFORM_TO_POLICY", 28);
        ue0Var.b("SYNTHESIZED", 29);
    }

    @Override // defpackage.cr
    public final void a(cm cmVar) {
        this.g = cmVar.f();
        if (((ByteBuffer) cmVar.j).remaining() > 0) {
            byte[] bArrB = cmVar.b();
            int length = bArrB.length;
            if (bArrB[bArrB.length - 1] == 0) {
                length--;
            }
            this.h = new String(bArrB, 0, length, StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.cr
    public final String b() {
        String str = this.h;
        ue0 ue0Var = i;
        if (str == null) {
            return ue0Var.e(this.g);
        }
        return ue0Var.e(this.g) + ": " + this.h;
    }

    @Override // defpackage.cr
    public final void c(t3 t3Var) {
        t3Var.m(this.g);
        String str = this.h;
        if (str == null || str.isEmpty()) {
            return;
        }
        t3Var.j(this.h.getBytes(StandardCharsets.UTF_8));
    }
}
