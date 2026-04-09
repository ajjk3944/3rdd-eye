package p;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.common.MediaLibraryInfo;
import com.google.android.gms.location.LocationSettingsRequest;
import java.io.File;
import java.io.FileInputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l2 implements o.k, bc.i, dd.e, dd.d, dd.b, oh.d, com.squareup.picasso.g, o9.b, vg.b, u3.c, w.m, w0.b, ya.u0, com.squareup.picasso.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20099a;

    /* renamed from: d, reason: collision with root package name */
    public Object f20100d;

    public /* synthetic */ l2(int i10, Object obj) {
        this.f20099a = i10;
        this.f20100d = obj;
    }

    public static String E() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException {
        try {
            Class<?> cls = Class.forName(MediaLibraryInfo.class.getName());
            Object obj = cls.getDeclaredField("VERSION").get(cls);
            br.l.c(obj, "null cannot be cast to non-null type kotlin.String");
            return (String) obj;
        } catch (Exception e4) {
            ch.n.g("Media3VersionChecker", e4, "Cannot find the MediaLibraryInfo class.");
            return null;
        } catch (NoClassDefFoundError e10) {
            ch.n.g("Media3VersionChecker", e10, "Cannot find the MediaLibraryInfo class.");
            return null;
        }
    }

    @Override // o.k
    public void A(o.m mVar) {
        Toolbar toolbar = (Toolbar) this.f20100d;
        androidx.appcompat.widget.b bVar = toolbar.f1011a.P;
        if (bVar == null || !bVar.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1018f0.f20918d).iterator();
            while (it.hasNext()) {
                ((o4.d0) it.next()).f18787a.t();
            }
        }
        h7.h0 h0Var = toolbar.f1027n0;
        if (h0Var != null) {
            h0Var.A(mVar);
        }
    }

    public void B(pv.a aVar, String str) {
        if (((pv.a) this.f20100d).compareTo(aVar) <= 0) {
            br.l.e(aVar, "level");
            br.l.e(str, "msg");
            System.err.println("should not see this - " + aVar + " - " + str);
        }
    }

    public i.g0 C(qs.b bVar, ps.f fVar) {
        wr.b bVarJ;
        br.l.e(bVar, "classId");
        br.l.e(fVar, "jvmMetadataVersion");
        String strK0 = tt.s.k0(bVar.h().b(), '.', '$');
        if (!bVar.g().d()) {
            strK0 = bVar.g() + '.' + strK0;
        }
        Class clsX = kc.f.X((ClassLoader) this.f20100d, strK0);
        if (clsX == null || (bVarJ = lf.t1.j(clsX)) == null) {
            return null;
        }
        return new i.g0(bVarJ);
    }

    public boolean D() {
        return ((om.f) this.f20100d).k("gdpr_consent_given");
    }

    public boolean F(pv.a aVar) {
        br.l.e(aVar, "lvl");
        return ((pv.a) this.f20100d).compareTo(aVar) <= 0;
    }

    public void G(ar.a aVar) {
        ((Handler) this.f20100d).post(new fj.k(aVar, 1));
    }

    public q3.a H(om.f fVar, AndroidComposeView androidComposeView) {
        int i10;
        long jC;
        long j;
        boolean z10;
        u.o oVar = (u.o) this.f20100d;
        List list = (List) fVar.f19554d;
        u.o oVar2 = new u.o(list.size());
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            r1.l lVar = (r1.l) list.get(i11);
            long j7 = lVar.f21182a;
            r1.k kVar = (r1.k) oVar.b(j7);
            if (kVar == null) {
                i10 = i11;
                j = lVar.f21183b;
                jC = lVar.f21185d;
                z10 = false;
            } else {
                long j10 = kVar.f21179a;
                boolean z11 = kVar.f21181c;
                i10 = i11;
                jC = androidComposeView.C(kVar.f21180b);
                j = j10;
                z10 = z11;
            }
            long j11 = lVar.f21182a;
            List list2 = list;
            int i12 = size;
            oVar2.e(new r1.j(j11, lVar.f21183b, lVar.f21185d, lVar.f21186e, lVar.f21187f, j, jC, z10, lVar.f21188g, lVar.f21190i, lVar.j, lVar.k), j11);
            boolean z12 = lVar.f21186e;
            if (z12) {
                oVar.e(new r1.k(lVar.f21183b, z12, lVar.f21184c), j7);
            } else {
                oVar.f(j7);
            }
            i11 = i10 + 1;
            list = list2;
            size = i12;
        }
        return new q3.a(oVar2, 2, fVar);
    }

    public JSONObject I() throws Throwable {
        Exception e4;
        FileInputStream fileInputStreamJ;
        File file;
        JSONObject jSONObject;
        Log.isLoggable("FirebaseCrashlytics", 3);
        FileInputStream fileInputStream = null;
        try {
            try {
                file = (File) this.f20100d;
            } catch (Throwable th2) {
                th = th2;
                hf.f.b(fileInputStream, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e10) {
            e4 = e10;
        }
        try {
            if (file.exists()) {
                fileInputStreamJ = xu.d.j(file, new FileInputStream(file));
                try {
                    try {
                        jSONObject = new JSONObject(hf.f.i(fileInputStreamJ));
                        fileInputStream = fileInputStreamJ;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = fileInputStreamJ;
                        hf.f.b(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e11) {
                    e4 = e11;
                    io.sentry.android.core.e0.c("FirebaseCrashlytics", "Failed to fetch cached settings", e4);
                    hf.f.b(fileInputStreamJ, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                Log.isLoggable("FirebaseCrashlytics", 2);
                jSONObject = null;
            }
            hf.f.b(fileInputStream, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e12) {
            e4 = e12;
            fileInputStreamJ = null;
            io.sentry.android.core.e0.c("FirebaseCrashlytics", "Failed to fetch cached settings", e4);
            hf.f.b(fileInputStreamJ, "Error while closing settings cache file.");
            return null;
        }
    }

    public void J(ak.x xVar) {
        al.b bVar = (al.b) this.f20100d;
        Locale locale = Locale.ENGLISH;
        bVar.f812d = h0.b.h(xVar.f761c, " -c ");
        bVar.f813e = h0.b.h(xVar.f769m, " -c ");
        bVar.f814f = h0.b.h(xVar.f763e, " -s ");
        bVar.f815g = String.format(locale, " -i %f", Float.valueOf(xVar.f779w));
        bVar.f816h = String.format(locale, " -i %f", Float.valueOf(xVar.f780x));
        String str = xVar.f765g;
        if (str == null) {
            str = "";
        }
        bVar.f809a = (str.equals("") || !str.contains("-")) ? (String) bVar.f809a : " ".concat(str);
    }

    @Override // u3.c
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.f20100d).setLinkUri(uri);
    }

    @Override // bc.i
    public void accept(Object obj, Object obj2) {
        dd.h hVar = (dd.h) obj2;
        pc.h hVar2 = (pc.h) obj;
        LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) this.f20100d;
        cc.s.a("locationSettingsRequest can't be null", locationSettingsRequest != null);
        pc.r rVar = (pc.r) hVar2.m();
        pc.d dVar = new pc.d(0, hVar);
        Parcel parcelR = rVar.R();
        pc.b.b(parcelR, locationSettingsRequest);
        parcelR.writeStrongBinder(dVar);
        parcelR.writeString(null);
        rVar.S(parcelR, 63);
    }

    @Override // oh.d
    public long b() {
        return ((ya.r) this.f20100d).f26152g;
    }

    @Override // u3.c
    public u3.f build() {
        return new u3.f(new oh.p(((ContentInfo.Builder) this.f20100d).build()));
    }

    @Override // u3.c
    public void c(int i10) {
        ((ContentInfo.Builder) this.f20100d).setFlags(i10);
    }

    @Override // ya.u0
    public long d() {
        long jMin = Long.MAX_VALUE;
        for (ya.u0 u0Var : (ya.u0[]) this.f20100d) {
            long jD = u0Var.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // kq.a
    public Object get() {
        switch (this.f20099a) {
            case 13:
                return new t9.j(Integer.valueOf(t9.j.f22686r).intValue(), (Context) ((kq.a) this.f20100d).get(), "com.google.android.datatransport.events");
            case 14:
                return new tg.l((eg.b) ((i5.c) this.f20100d).f11238a);
            default:
                return new tg.t0((tg.a1) ((vg.c) this.f20100d).get());
        }
    }

    @Override // dd.e
    public void h(Object obj) {
        ((CountDownLatch) this.f20100d).countDown();
    }

    @Override // ya.u0
    public boolean i(long j) {
        boolean zI;
        boolean z10 = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                return z10;
            }
            zI = false;
            for (ya.u0 u0Var : (ya.u0[]) this.f20100d) {
                long jD2 = u0Var.d();
                boolean z11 = jD2 != Long.MIN_VALUE && jD2 <= j;
                if (jD2 == jD || z11) {
                    zI |= u0Var.i(j);
                }
            }
            z10 |= zI;
        } while (zI);
        return z10;
    }

    @Override // ya.u0
    public boolean isLoading() {
        for (ya.u0 u0Var : (ya.u0[]) this.f20100d) {
            if (u0Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.squareup.picasso.g
    public void j() {
        ((ImageView) this.f20100d).setBackgroundResource(qk.f.ic_logo_placeholder);
    }

    @Override // ya.u0
    public long m() {
        long jMin = Long.MAX_VALUE;
        for (ya.u0 u0Var : (ya.u0[]) this.f20100d) {
            long jM = u0Var.m();
            if (jM != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jM);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // o.k
    public boolean n(o.m mVar, MenuItem menuItem) {
        return false;
    }

    @Override // ya.u0
    public void o(long j) {
        for (ya.u0 u0Var : (ya.u0[]) this.f20100d) {
            u0Var.o(j);
        }
    }

    @Override // dd.b
    public void q() {
        ((CountDownLatch) this.f20100d).countDown();
    }

    @Override // oh.d
    public int r() {
        return ((ya.r) this.f20100d).f26146a;
    }

    @Override // u3.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f20100d).setExtras(bundle);
    }

    @Override // com.squareup.picasso.q
    public com.squareup.picasso.o t(Uri uri, int i10) throws com.squareup.picasso.p {
        ou.h hVar = i10 != 0 ? com.squareup.picasso.x.isOfflineOnly(i10) ? ou.h.f19909o : new ou.h(!com.squareup.picasso.x.shouldReadFromDiskCache(i10), !com.squareup.picasso.x.shouldWriteToDiskCache(i10), -1, -1, false, false, false, -1, -1, false, false, false, null) : null;
        cj.a aVar = new cj.a();
        aVar.N(uri.toString());
        if (hVar != null) {
            aVar.s(hVar);
        }
        ou.c0 c0VarE = ((ou.x) this.f20100d).a(aVar.r()).e();
        ou.e0 e0Var = c0VarE.B;
        int i11 = c0VarE.f19887r;
        if (i11 < 300) {
            return new com.squareup.picasso.o(e0Var.h().l0(), c0VarE.E != null, e0Var.b());
        }
        e0Var.close();
        throw new com.squareup.picasso.p(i11 + " " + c0VarE.f19886g, i10, i11);
    }

    @Override // oh.d
    public oh.l v() {
        return new ph.h(((ya.r) this.f20100d).f26148c);
    }

    @Override // oh.d
    public long w() {
        return ((ya.r) this.f20100d).f26151f;
    }

    @Override // oh.d
    public int x() {
        return ((ya.r) this.f20100d).f26147b;
    }

    @Override // dd.d
    public void y(Exception exc) {
        ((CountDownLatch) this.f20100d).countDown();
    }

    public void z(String str) {
        br.l.e(str, "msg");
        B(pv.a.DEBUG, str);
    }

    public /* synthetic */ l2(int i10, boolean z10) {
        this.f20099a = i10;
    }

    public l2(jc.b bVar) {
        this.f20099a = 17;
        cc.s.h(bVar);
        this.f20100d = bVar;
    }

    public l2(ya.r rVar) {
        this.f20099a = 3;
        br.l.e(rVar, "mediaLoadDataDelegate");
        this.f20100d = rVar;
    }

    public l2(Context context) {
        this.f20099a = 28;
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        ou.w wVar = new ou.w();
        wVar.k = new ou.g(file, 10485760L);
        this.f20100d = new ou.x(wVar);
    }

    @Override // w.m
    public w.q get(int i10) {
        return (ee.z) this.f20100d;
    }

    public l2(of.b bVar) {
        this.f20099a = 5;
        this.f20100d = new File((File) bVar.f19423g, "com.crashlytics.settings.json");
    }

    public l2(LinkedHashMap linkedHashMap) {
        u.a0 a0Var;
        this.f20099a = 20;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            a0Var = null;
        } else {
            a0Var = new u.a0(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                a0Var.l(entry.getKey(), entry.getValue());
            }
        }
        this.f20100d = a0Var;
    }

    public l2(int i10) {
        this.f20099a = i10;
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f20100d = new u.o((Object) null);
                break;
            case 12:
                this.f20100d = new LinkedHashSet();
                break;
            case 19:
                this.f20100d = new ee.z(0.01f);
                break;
            case 22:
                DecimalFormat decimalFormat = new DecimalFormat("#.####", new DecimalFormatSymbols(Locale.US));
                decimalFormat.setRoundingMode(RoundingMode.DOWN);
                this.f20100d = decimalFormat;
                break;
            case 29:
                al.b bVar = new al.b();
                bVar.f809a = "";
                bVar.f817i = null;
                this.f20100d = bVar;
                break;
            default:
                this.f20100d = new CountDownLatch(1);
                break;
        }
    }

    public l2(ClipData clipData, int i10) {
        this.f20099a = 16;
        this.f20100d = fj.i.h(clipData, i10);
    }
}
