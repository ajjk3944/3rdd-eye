package io.sentry.hints;

import a5.d0;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.telephony.ServiceState;
import android.view.View;
import androidx.media3.common.j0;
import br.l;
import ca.m;
import ca.u;
import com.google.android.material.tabs.TabLayout;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import mq.w;
import org.json.JSONObject;
import ou.z;
import r5.p;
import rs.r;
import u5.a0;
import u5.n;
import u5.x;

/* loaded from: classes.dex */
public class i implements m, com.opensignal.sdk.common.measurements.base.c, p, kc.d, l5.j, r, m6.d, p5.m, qf.d, rf.a, com.staircase3.opensignal.utils.d, bk.k, u5.m, bg.a {

    /* renamed from: d, reason: collision with root package name */
    public static i f12316d;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i f12317g = new i(28);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12318a;

    public /* synthetic */ i(int i10) {
        this.f12318a = i10;
    }

    public static ArrayList H(List list) {
        l.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((z) obj) != z.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((z) it.next()).toString());
        }
        return arrayList2;
    }

    public static RectF K(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f5717d0 || !(view instanceof ie.j)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        ie.j jVar = (ie.j) view;
        int contentWidth = jVar.getContentWidth();
        int contentHeight = jVar.getContentHeight();
        int iB = (int) xd.l.b(jVar.getContext(), 24);
        if (contentWidth < iB) {
            contentWidth = iB;
        }
        int right = (jVar.getRight() + jVar.getLeft()) / 2;
        int bottom = (jVar.getBottom() + jVar.getTop()) / 2;
        int i10 = contentWidth / 2;
        return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
    }

    public static byte[] L(List list) {
        l.e(list, "protocols");
        cv.g gVar = new cv.g();
        Iterator it = H(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            gVar.p0(str.length());
            gVar.u0(str);
        }
        return gVar.G(gVar.f6706d);
    }

    public static qf.b M(ee.f fVar) {
        return new qf.b(System.currentTimeMillis() + 3600000, new c9.l(8), new qf.a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static boolean P() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // bk.k
    public String A() {
        return null;
    }

    @Override // bk.k
    public List B() {
        return w.f16945a;
    }

    @Override // bk.k
    public Integer C(int i10) {
        return null;
    }

    @Override // com.opensignal.sdk.common.measurements.base.c
    public Integer E(ServiceState serviceState) {
        return null;
    }

    @Override // bk.k
    public Integer F() {
        return null;
    }

    @Override // bk.k
    public Boolean G(int i10) {
        return null;
    }

    @Override // bk.k
    public int I() {
        return -1;
    }

    @Override // bk.k
    public String J(int i10) {
        return null;
    }

    @Override // bk.k
    public String N(int i10) {
        return null;
    }

    @Override // bk.k
    public Integer O() {
        return -1;
    }

    @Override // bk.k
    public int Q() {
        return -1;
    }

    @Override // bk.k
    public Boolean R(int i10) {
        return null;
    }

    public boolean S(CharSequence charSequence) {
        return charSequence instanceof s3.e;
    }

    public void T(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF rectFK = K(tabLayout, view);
        RectF rectFK2 = K(tabLayout, view2);
        drawable.setBounds(fd.a.c((int) rectFK.left, f10, (int) rectFK2.left), drawable.getBounds().top, fd.a.c((int) rectFK.right, f10, (int) rectFK2.right), drawable.getBounds().bottom);
    }

    @Override // p5.m
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // p5.m
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // m6.d
    /* renamed from: c */
    public x mo37c() {
        return new n(-9223372036854775807L);
    }

    @Override // bk.k
    public String e(int i10) {
        return null;
    }

    @Override // bk.k
    public Boolean f(int i10) {
        return null;
    }

    @Override // bk.k
    public Integer g(int i10) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kc.c h(android.content.Context r3, java.lang.String r4, kc.b r5) {
        /*
            r2 = this;
            kc.c r0 = new kc.c
            r0.<init>()
            int r1 = r5.d(r3, r4)
            r0.f14269a = r1
            r1 = 1
            int r3 = r5.c(r3, r4, r1)
            r0.f14270b = r3
            int r4 = r0.f14269a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.f14271c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.hints.i.h(android.content.Context, java.lang.String, kc.b):kc.c");
    }

    @Override // bk.k
    public int i() {
        return -1;
    }

    @Override // ca.m
    public void j() {
        switch (this.f12318a) {
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // bk.k
    public String k(int i10) {
        return null;
    }

    @Override // qf.d
    public qf.b l(ee.f fVar, JSONObject jSONObject) {
        return M(fVar);
    }

    @Override // bk.k
    public int m() {
        return -1;
    }

    @Override // ca.m
    public ca.x n(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // p5.m
    public boolean next() {
        return false;
    }

    @Override // bk.k
    public Integer o(int i10) {
        return null;
    }

    @Override // bk.k
    public Boolean p(int i10) {
        return null;
    }

    @Override // r5.p
    public Object parse(Uri uri, InputStream inputStream) {
        return Long.valueOf(d0.J(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }

    @Override // rf.a
    public StackTraceElement[] q(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // ca.m
    public void r(u uVar) {
        throw new UnsupportedOperationException();
    }

    @Override // m6.d
    public long s(u5.l lVar) {
        return -1L;
    }

    @Override // bk.k
    public Boolean t(int i10) {
        return null;
    }

    @Override // u5.m
    public void u(x xVar) {
        throw new UnsupportedOperationException();
    }

    @Override // l5.j
    public l5.k v(l5.i iVar) {
        int i10 = d0.f105a;
        if (i10 < 23 || i10 < 31) {
            return new sm.m().v(iVar);
        }
        int iG = j0.g(iVar.f14719c.H);
        d0.A(iG);
        a5.a.t();
        l5.b bVar = new l5.b(iG, 0);
        l5.b bVar2 = new l5.b(iG, 1);
        i4.b bVar3 = new i4.b();
        bVar3.f11196a = bVar;
        bVar3.f11197d = bVar2;
        return bVar3.v(iVar);
    }

    @Override // bk.k
    public Boolean w(int i10) {
        return null;
    }

    @Override // bk.k
    public int x() {
        return -1;
    }

    @Override // bk.k
    public Integer y() {
        return null;
    }

    @Override // bk.k
    public Integer z(int i10) {
        return null;
    }

    @Override // u5.m
    /* renamed from: n */
    public a0 mo36n(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.staircase3.opensignal.utils.d
    public void D() {
    }

    @Override // m6.d
    public void d(long j) {
    }
}
