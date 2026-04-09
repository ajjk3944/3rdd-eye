package mj;

import android.util.Base64;
import bk.j;
import bk.l;
import ch.i;
import ch.n;
import h7.h0;
import io.sentry.k;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p.l2;
import xi.u;

/* loaded from: classes.dex */
public final class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final bm.d f16836a;

    /* renamed from: b, reason: collision with root package name */
    public final al.b f16837b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.g f16838c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.a f16839d;

    /* renamed from: e, reason: collision with root package name */
    public final ch.f f16840e;

    /* renamed from: f, reason: collision with root package name */
    public final q3.a f16841f;

    /* renamed from: g, reason: collision with root package name */
    public final i f16842g;

    /* renamed from: h, reason: collision with root package name */
    public final cg.e f16843h;

    /* renamed from: i, reason: collision with root package name */
    public final l2 f16844i;
    public final dj.g j;
    public final h0 k;

    /* renamed from: l, reason: collision with root package name */
    public final k f16845l;

    /* renamed from: m, reason: collision with root package name */
    public final om.f f16846m;

    /* renamed from: n, reason: collision with root package name */
    public final u f16847n;

    /* renamed from: o, reason: collision with root package name */
    public final l2 f16848o;

    /* renamed from: p, reason: collision with root package name */
    public final q3.a f16849p;

    /* renamed from: q, reason: collision with root package name */
    public fj.g f16850q;

    public d(bm.d dVar, al.b bVar, a2.g gVar, q3.a aVar, ch.f fVar, b9.c cVar, q3.a aVar2, i iVar, cg.e eVar, b9.c cVar2, l2 l2Var, dj.g gVar2, h0 h0Var, cj.a aVar3, k kVar, om.f fVar2, u uVar, l2 l2Var2, om.f fVar3) {
        br.l.e(eVar, "dependencyVersion");
        this.f16836a = dVar;
        this.f16837b = bVar;
        this.f16838c = gVar;
        this.f16839d = aVar;
        this.f16840e = fVar;
        this.f16841f = aVar2;
        this.f16842g = iVar;
        this.f16843h = eVar;
        this.f16844i = l2Var;
        this.j = gVar2;
        this.k = h0Var;
        this.f16845l = kVar;
        this.f16846m = fVar2;
        this.f16847n = uVar;
        this.f16848o = l2Var2;
        this.f16849p = new q3.a((io.sentry.internal.debugmeta.c) fVar3.f19554d, (cj.a) fVar3.f19555g);
    }

    @Override // bk.l
    public final void a(int i10, int i11) {
        n.b("ConfigUpdater", h0.b.l("onUploadProgress() called with: totalBytesUploaded = ", i10, i11, ", maxUploadSize = "));
    }

    @Override // bk.l
    public final void b(dr.a aVar) throws Throwable {
        n.b("ConfigUpdater", "onUploadResult - ".concat(aVar.getClass().getSimpleName()));
        boolean z10 = aVar instanceof bk.i;
        al.b bVar = this.f16837b;
        if (!z10) {
            if (aVar.equals(bk.g.f2814b)) {
                n.b("ConfigUpdater", "Not modified. Update last config time.");
                n.b("BackConfigInitialiser", "updating last config update time.");
                ((ch.d) ((q3.a) bVar.f812d).f20679d).U().t(System.currentTimeMillis(), "back");
                return;
            }
            if (aVar.equals(bk.g.f2813a)) {
                n.g("ConfigUpdater", "Connection error. Do nothing");
                return;
            }
            if (aVar instanceof j) {
                n.d("ConfigUpdater", "Unknown error. Do nothing", ((j) aVar).f2818a);
                return;
            } else {
                if (aVar instanceof bk.h) {
                    n.g("ConfigUpdater", h0.b.i(((bk.h) aVar).f2815a, ". Do nothing", new StringBuilder("Endpoint error ")));
                    return;
                }
                return;
            }
        }
        bk.i iVar = (bk.i) aVar;
        byte[] bArr = iVar.f2816a;
        Charset charset = tt.a.f22975a;
        String str = new String(bArr, charset);
        Map map = iVar.f2817b;
        n.b("ConfigUpdater", "downloadSuccess() called with: headerFields = " + map);
        if (map.containsKey("X-Encrypted")) {
            byte[] bytes = str.getBytes(charset);
            br.l.d(bytes, "getBytes(...)");
            byte[] bArrDecode = Base64.decode(bytes, 0);
            br.l.b(bArrDecode);
            byte[] bArrG0 = mq.l.g0(bArrDecode, 0, 16);
            byte[] bArrG02 = mq.l.g0(bArrDecode, 16, bArrDecode.length);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrG0);
            k kVar = this.f16845l;
            SecretKeySpec secretKeySpec = new SecretKeySpec((byte[]) kVar.f12397d, "AES/CBC/PKCS7Padding");
            Cipher cipher = (Cipher) kVar.f12398g;
            cipher.init(2, secretKeySpec, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArrG02);
            br.l.b(bArrDoFinal);
            str = new String(bArrDoFinal, charset);
        }
        bVar.p(str);
    }

    public final void c(JSONObject jSONObject) throws JSONException {
        DecimalFormat decimalFormat = (DecimalFormat) this.f16848o.f20100d;
        ak.u uVar = this.f16847n.G;
        jSONObject.put("device_id_time", this.f16841f.A0());
        if (uVar.c()) {
            String str = decimalFormat.format(uVar.f721a);
            br.l.d(str, "format(...)");
            String str2 = decimalFormat.format(uVar.f722b);
            br.l.d(str2, "format(...)");
            xu.d.Z(jSONObject, "lat", str);
            xu.d.Z(jSONObject, "lng", str2);
        }
    }

    public final fj.g d() {
        if (this.f16850q == null) {
            this.f16850q = this.j.b();
        }
        fj.g gVar = this.f16850q;
        if (gVar != null) {
            return gVar;
        }
        br.l.l("_telephony");
        throw null;
    }
}
