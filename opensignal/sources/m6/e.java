package m6;

import a5.d0;
import a5.v;
import androidx.media3.common.Metadata;
import androidx.media3.common.q;
import androidx.media3.common.r;
import io.sentry.t;
import java.util.ArrayList;
import java.util.Arrays;
import ka.h;
import oe.h0;
import u5.b0;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f16311p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f16312q = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: o, reason: collision with root package name */
    public boolean f16313o;

    public static boolean g(v vVar, byte[] bArr) {
        if (vVar.a() < bArr.length) {
            return false;
        }
        int i10 = vVar.f166b;
        byte[] bArr2 = new byte[bArr.length];
        vVar.e(bArr2, 0, bArr.length);
        vVar.E(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // ka.h
    public final long b(v vVar) {
        byte[] bArr = vVar.f165a;
        return (this.f14253f * u5.b.k(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // ka.h
    public final boolean d(v vVar, long j, t tVar) {
        if (g(vVar, f16311p)) {
            byte[] bArrCopyOf = Arrays.copyOf(vVar.f165a, vVar.f167c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = u5.b.a(bArrCopyOf);
            if (((r) tVar.f12736a) == null) {
                q qVar = new q();
                qVar.k = "audio/opus";
                qVar.f1755x = i10;
                qVar.f1756y = 48000;
                qVar.f1744m = arrayListA;
                tVar.f12736a = new r(qVar);
                return true;
            }
        } else {
            if (!g(vVar, f16312q)) {
                a5.a.j((r) tVar.f12736a);
                return false;
            }
            a5.a.j((r) tVar.f12736a);
            if (!this.f16313o) {
                this.f16313o = true;
                vVar.F(8);
                Metadata metadataA = b0.a(h0.m((String[]) b0.b(vVar, false, false).f18754d));
                if (metadataA != null) {
                    q qVarA = ((r) tVar.f12736a).a();
                    Metadata metadata = ((r) tVar.f12736a).F;
                    if (metadata != null) {
                        Metadata.Entry[] entryArr = metadata.f1549a;
                        if (entryArr.length != 0) {
                            long j7 = metadataA.f1550d;
                            Metadata.Entry[] entryArr2 = metadataA.f1549a;
                            int i11 = d0.f105a;
                            Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                            System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                            metadataA = new Metadata(j7, (Metadata.Entry[]) objArrCopyOf);
                        }
                    }
                    qVarA.f1742i = metadataA;
                    tVar.f12736a = new r(qVarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // ka.h
    public final void f(boolean z10) {
        super.f(z10);
        if (z10) {
            this.f16313o = false;
        }
    }
}
