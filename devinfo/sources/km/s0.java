package km;

import androidx.lifecycle.f1;
import com.applovin.shadow.okhttp3.HttpUrl;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f28458l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f28459m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f28460a;

    /* renamed from: b, reason: collision with root package name */
    public final rl.n f28461b;

    /* renamed from: c, reason: collision with root package name */
    public String f28462c;

    /* renamed from: d, reason: collision with root package name */
    public ed.a0 f28463d;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f28464e = new f1(24);

    /* renamed from: f, reason: collision with root package name */
    public final y f28465f;
    public rl.p g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28466h;

    /* renamed from: i, reason: collision with root package name */
    public final i0.f f28467i;
    public final n j;

    /* renamed from: k, reason: collision with root package name */
    public rl.x f28468k;

    public s0(String str, rl.n nVar, String str2, rl.m mVar, rl.p pVar, boolean z3, boolean z10, boolean z11) {
        this.f28460a = str;
        this.f28461b = nVar;
        this.f28462c = str2;
        this.g = pVar;
        this.f28466h = z3;
        if (mVar != null) {
            this.f28465f = mVar.d();
        } else {
            this.f28465f = new y(17);
        }
        if (z10) {
            this.j = new n(0);
            return;
        }
        if (z11) {
            i0.f fVar = new i0.f(20);
            this.f28467i = fVar;
            rl.p pVar2 = rl.r.g;
            nk.k.e(pVar2, "type");
            if (pVar2.f33124b.equals("multipart")) {
                fVar.f25417c = pVar2;
            } else {
                throw new IllegalArgumentException(("multipart != " + pVar2).toString());
            }
        }
    }

    public final void a(String str, String str2, boolean z3) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                vk.h hVar = rl.p.f33121d;
                this.g = u6.t.k(str2);
                return;
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(je.u.t("Malformed content type: ", str2), e2);
            }
        }
        y yVar = this.f28465f;
        if (!z3) {
            yVar.u(str, str2);
            return;
        }
        yVar.getClass();
        nk.k.e(str, "name");
        nk.k.e(str2, "value");
        com.bumptech.glide.d.r(str);
        yVar.v(str, str2);
    }

    public final void b(rl.m mVar, rl.x xVar) {
        i0.f fVar = this.f28467i;
        fVar.getClass();
        nk.k.e(xVar, "body");
        if (mVar.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (mVar.a("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) fVar.f25418d).add(new rl.q(mVar, xVar));
    }

    public final void c(String str, String str2, boolean z3) {
        String str3 = this.f28462c;
        if (str3 != null) {
            rl.n nVar = this.f28461b;
            ed.a0 a0VarF = nVar.f(str3);
            this.f28463d = a0VarF;
            if (a0VarF == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + nVar + ", Relative: " + this.f28462c);
            }
            this.f28462c = null;
        }
        if (z3) {
            ed.a0 a0Var = this.f28463d;
            a0Var.getClass();
            nk.k.e(str, "encodedName");
            if (((ArrayList) a0Var.f23262h) == null) {
                a0Var.f23262h = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) a0Var.f23262h;
            nk.k.b(arrayList);
            arrayList.add(gm.a.a(0, 0, 83, str, HttpUrl.QUERY_COMPONENT_REENCODE_SET));
            ArrayList arrayList2 = (ArrayList) a0Var.f23262h;
            nk.k.b(arrayList2);
            arrayList2.add(str2 != null ? gm.a.a(0, 0, 83, str2, HttpUrl.QUERY_COMPONENT_REENCODE_SET) : null);
            return;
        }
        ed.a0 a0Var2 = this.f28463d;
        a0Var2.getClass();
        nk.k.e(str, "name");
        if (((ArrayList) a0Var2.f23262h) == null) {
            a0Var2.f23262h = new ArrayList();
        }
        ArrayList arrayList3 = (ArrayList) a0Var2.f23262h;
        nk.k.b(arrayList3);
        arrayList3.add(gm.a.a(0, 0, 91, str, HttpUrl.QUERY_COMPONENT_ENCODE_SET));
        ArrayList arrayList4 = (ArrayList) a0Var2.f23262h;
        nk.k.b(arrayList4);
        arrayList4.add(str2 != null ? gm.a.a(0, 0, 91, str2, HttpUrl.QUERY_COMPONENT_ENCODE_SET) : null);
    }
}
