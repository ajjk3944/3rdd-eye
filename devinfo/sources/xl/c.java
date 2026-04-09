package xl;

import hm.q;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import nk.k;
import rl.n;
import sl.h;
import vk.i;
import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public long f37270e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37271f;
    public final /* synthetic */ g g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, n nVar) {
        super(gVar, nVar);
        k.e(nVar, "url");
        this.g = gVar;
        this.f37270e = -1L;
        this.f37271f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws NumberFormatException {
        boolean zG;
        if (this.f37265c) {
            return;
        }
        if (this.f37271f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = h.f33837a;
            k.e(timeUnit, "timeUnit");
            try {
                zG = h.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.g.f37280b.e();
                c(g.f37278f);
            }
        }
        this.f37265c = true;
    }

    @Override // xl.a, hm.w
    public final long n(hm.e eVar, long j) throws NumberFormatException, IOException {
        long j8;
        byte bP;
        g gVar = this.g;
        i0.f fVar = gVar.f37281c;
        k.e(eVar, "sink");
        if (this.f37265c) {
            throw new IllegalStateException("closed");
        }
        long j9 = -1;
        if (!this.f37271f) {
            return -1L;
        }
        long j10 = this.f37270e;
        if (j10 == 0 || j10 == -1) {
            if (j10 != -1) {
                ((q) fVar.f25417c).readUtf8LineStrict(Long.MAX_VALUE);
            }
            try {
                q qVar = (q) fVar.f25417c;
                hm.e eVar2 = qVar.f25204b;
                qVar.require(1L);
                int i4 = 0;
                while (true) {
                    int i10 = i4 + 1;
                    j8 = j9;
                    if (!qVar.request(i10)) {
                        break;
                    }
                    bP = eVar2.p(i4);
                    if ((bP < 48 || bP > 57) && ((bP < 97 || bP > 102) && (bP < 65 || bP > 70))) {
                        break;
                    }
                    j9 = j8;
                    i4 = i10;
                }
                if (i4 == 0) {
                    com.bumptech.glide.d.g(16);
                    String string = Integer.toString(bP, 16);
                    k.d(string, "toString(...)");
                    throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
                }
                this.f37270e = eVar2.readHexadecimalUnsignedLong();
                String string2 = i.V0(((q) fVar.f25417c).readUtf8LineStrict(Long.MAX_VALUE)).toString();
                if (this.f37270e < 0 || (string2.length() > 0 && !p.w0(string2, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f37270e + string2 + '\"');
                }
                if (this.f37270e == 0) {
                    this.f37271f = false;
                    c(gVar.f37283e.p());
                }
                if (!this.f37271f) {
                    return j8;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        } else {
            j8 = -1;
        }
        long jN = super.n(eVar, Math.min(8192L, this.f37270e));
        if (jN != j8) {
            this.f37270e -= jN;
            return jN;
        }
        gVar.f37280b.e();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        c(g.f37278f);
        throw protocolException;
    }
}
