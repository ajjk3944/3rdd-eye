package wl;

import b5.i0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import nk.k;
import rl.o;
import rl.t;
import rl.x;
import rl.z;
import vl.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36826a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36827b;

    public a(rl.b bVar) {
        k.e(bVar, "cookieJar");
        this.f36827b = bVar;
    }

    public static int d(z zVar, int i4) throws NumberFormatException {
        String strA = zVar.f33209f.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i4;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        k.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        k.d(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v47 vl.o, still in use, count: 2, list:
          (r0v47 vl.o) from 0x0076: MOVE (r18v0 vl.o) = (r0v47 vl.o) (LINE:119)
          (r0v47 vl.o) from 0x0063: MOVE (r18v3 vl.o) = (r0v47 vl.o) (LINE:100)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // rl.o
    public final rl.z a(wl.h r34) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.a.a(wl.h):rl.z");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public va.o b(rl.z r12, b5.i0 r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.a.b(rl.z, b5.i0):va.o");
    }

    public boolean c(IOException iOException, m mVar, va.o oVar) {
        x xVar;
        boolean z3 = iOException instanceof yl.a;
        if (!((t) this.f36827b).f33158e) {
            return false;
        }
        if ((!z3 && (((xVar = (x) oVar.f36149e) != null && xVar.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z3) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        i0 i0Var = mVar.f36346q;
        if (i0Var == null || !i0Var.f1820a) {
            return false;
        }
        vl.g gVar = mVar.g;
        k.b(gVar);
        vl.o oVarG = gVar.g();
        i0 i0Var2 = mVar.f36346q;
        return oVarG.a(i0Var2 != null ? i0Var2.c() : null);
    }

    public a(t tVar) {
        this.f36827b = tVar;
    }
}
