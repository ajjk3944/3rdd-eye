package Xb;

import Zg.AbstractC3689v;
import b8.EnumC4076c;
import com.google.ar.core.ImageMetadata;
import gg.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final a f24272a = new a(null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public abstract i a();

    public abstract i b(int i10);

    public final i c(EnumC4076c connectionType) {
        AbstractC6492s.i(connectionType, "connectionType");
        return d(Qb.b.a(connectionType));
    }

    public abstract i d(String str);

    public final i e(EnumC4076c connectionType, String str, int i10) {
        AbstractC6492s.i(connectionType, "connectionType");
        return f(Qb.b.a(connectionType), str, i10);
    }

    public abstract i f(String str, String str2, int i10);

    public boolean g(long... resultId) {
        AbstractC6492s.i(resultId, "resultId");
        return j(Arrays.copyOf(resultId, resultId.length)) >= 1 && h(Arrays.copyOf(resultId, resultId.length)) >= 1 && i(Arrays.copyOf(resultId, resultId.length)) >= 1;
    }

    protected abstract int h(long... jArr);

    protected abstract int i(long... jArr);

    protected abstract int j(long... jArr);

    public abstract i k(long j10);

    public d l(d result) {
        AbstractC6492s.i(result, "result");
        long jN = n(result.b());
        if (jN < 0) {
            throw new IllegalStateException();
        }
        Xb.a aVarA = result.a();
        Xb.a aVarA2 = aVarA.a((32766 & 1) != 0 ? aVarA.f24220a : jN, (32766 & 2) != 0 ? aVarA.f24221b : null, (32766 & 4) != 0 ? aVarA.f24222c : null, (32766 & 8) != 0 ? aVarA.f24223d : null, (32766 & 16) != 0 ? aVarA.f24224e : null, (32766 & 32) != 0 ? aVarA.f24225f : null, (32766 & 64) != 0 ? aVarA.f24226g : null, (32766 & 128) != 0 ? aVarA.f24227h : null, (32766 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? aVarA.f24228i : null, (32766 & 512) != 0 ? aVarA.f24229j : null, (32766 & 1024) != 0 ? aVarA.f24230k : null, (32766 & 2048) != 0 ? aVarA.f24231l : null, (32766 & 4096) != 0 ? aVarA.f24232m : null, (32766 & 8192) != 0 ? aVarA.f24233n : null, (32766 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? aVarA.f24234o : null);
        if (m(aVarA2) < 0) {
            throw new IllegalStateException();
        }
        List<c> listC = result.c();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listC, 10));
        for (c cVar : listC) {
            Xb.a aVar = aVarA2;
            ArrayList arrayList2 = arrayList;
            long jO = o(cVar.a((33554429 & 1) != 0 ? cVar.f24241a : 0L, (33554429 & 2) != 0 ? cVar.f24242b : jN, (33554429 & 4) != 0 ? cVar.f24243c : null, (33554429 & 8) != 0 ? cVar.f24244d : null, (33554429 & 16) != 0 ? cVar.f24245e : null, (33554429 & 32) != 0 ? cVar.f24246f : null, (33554429 & 64) != 0 ? cVar.f24247g : null, (33554429 & 128) != 0 ? cVar.f24248h : null, (33554429 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? cVar.f24249i : null, (33554429 & 512) != 0 ? cVar.f24250j : null, (33554429 & 1024) != 0 ? cVar.f24251k : null, (33554429 & 2048) != 0 ? cVar.f24252l : null, (33554429 & 4096) != 0 ? cVar.f24253m : null, (33554429 & 8192) != 0 ? cVar.f24254n : null, (33554429 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? cVar.f24255o : null, (33554429 & 32768) != 0 ? cVar.f24256p : null, (33554429 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? cVar.f24257q : null, (33554429 & 131072) != 0 ? cVar.f24258r : null, (33554429 & 262144) != 0 ? cVar.f24259s : null, (33554429 & ImageMetadata.LENS_APERTURE) != 0 ? cVar.f24260t : null, (33554429 & ImageMetadata.SHADING_MODE) != 0 ? cVar.f24261u : null, (33554429 & 2097152) != 0 ? cVar.f24262v : null, (33554429 & 4194304) != 0 ? cVar.f24263w : null, (33554429 & 8388608) != 0 ? cVar.f24264x : null, (33554429 & 16777216) != 0 ? cVar.f24265y : null));
            if (jO < 0) {
                throw new IllegalStateException();
            }
            arrayList2.add(cVar.a((33554429 & 1) != 0 ? cVar.f24241a : jO, (33554429 & 2) != 0 ? cVar.f24242b : jN, (33554429 & 4) != 0 ? cVar.f24243c : null, (33554429 & 8) != 0 ? cVar.f24244d : null, (33554429 & 16) != 0 ? cVar.f24245e : null, (33554429 & 32) != 0 ? cVar.f24246f : null, (33554429 & 64) != 0 ? cVar.f24247g : null, (33554429 & 128) != 0 ? cVar.f24248h : null, (33554429 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? cVar.f24249i : null, (33554429 & 512) != 0 ? cVar.f24250j : null, (33554429 & 1024) != 0 ? cVar.f24251k : null, (33554429 & 2048) != 0 ? cVar.f24252l : null, (33554429 & 4096) != 0 ? cVar.f24253m : null, (33554429 & 8192) != 0 ? cVar.f24254n : null, (33554429 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? cVar.f24255o : null, (33554429 & 32768) != 0 ? cVar.f24256p : null, (33554429 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? cVar.f24257q : null, (33554429 & 131072) != 0 ? cVar.f24258r : null, (33554429 & 262144) != 0 ? cVar.f24259s : null, (33554429 & ImageMetadata.LENS_APERTURE) != 0 ? cVar.f24260t : null, (33554429 & ImageMetadata.SHADING_MODE) != 0 ? cVar.f24261u : null, (33554429 & 2097152) != 0 ? cVar.f24262v : null, (33554429 & 4194304) != 0 ? cVar.f24263w : null, (33554429 & 8388608) != 0 ? cVar.f24264x : null, (33554429 & 16777216) != 0 ? cVar.f24265y : null));
            arrayList = arrayList2;
            aVarA2 = aVar;
        }
        return new d(b.b(result.b(), jN, null, null, 0L, 14, null), aVarA2, arrayList);
    }

    protected abstract long m(Xb.a aVar);

    protected abstract long n(b bVar);

    protected abstract long o(c cVar);

    public boolean p(d result) {
        AbstractC6492s.i(result, "result");
        if (r(result.b()) < 1 || q(result.a()) < 1) {
            return false;
        }
        Iterator it = result.c().iterator();
        while (it.hasNext()) {
            if (s((c) it.next()) < 1) {
                return false;
            }
        }
        return true;
    }

    protected abstract int q(Xb.a aVar);

    protected abstract int r(b bVar);

    protected abstract int s(c cVar);
}
