package fk;

import a2.g;
import ak.i1;
import bk.i;
import bk.l;
import bm.d;
import ch.n;
import com.google.android.gms.internal.measurement.e5;
import ek.c;
import h0.b;
import h9.p;
import io.sentry.k;
import ir.f0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import mq.x;
import om.f;
import xj.h;
import xj.j;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final g f8960a;

    /* renamed from: b, reason: collision with root package name */
    public final c f8961b;

    /* renamed from: c, reason: collision with root package name */
    public final p f8962c;

    /* renamed from: d, reason: collision with root package name */
    public final h f8963d;

    /* renamed from: e, reason: collision with root package name */
    public final h f8964e;

    /* renamed from: f, reason: collision with root package name */
    public final b9.c f8965f;

    /* renamed from: g, reason: collision with root package name */
    public final k f8966g;

    /* renamed from: h, reason: collision with root package name */
    public final q3.a f8967h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8968i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f8969l;

    /* renamed from: m, reason: collision with root package name */
    public dr.a f8970m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f8971n;

    /* renamed from: o, reason: collision with root package name */
    public i1 f8972o;

    public a(g gVar, c cVar, p pVar, j jVar, h hVar, b9.c cVar2, k kVar, f fVar) {
        br.l.e(jVar, "uploadJobDataMapper");
        br.l.e(cVar2, "hmacHeader");
        this.f8960a = gVar;
        this.f8961b = cVar;
        this.f8962c = pVar;
        this.f8963d = jVar;
        this.f8964e = hVar;
        this.f8965f = cVar2;
        this.f8966g = kVar;
        this.f8967h = new q3.a((io.sentry.internal.debugmeta.c) fVar.f19554d, (cj.a) fVar.f19555g);
        this.f8968i = new Object();
        this.f8971n = new ConcurrentHashMap();
    }

    public static ArrayList e(int i10, ArrayList arrayList) {
        if (i10 <= 0 || i10 <= 0) {
            throw new IllegalArgumentException(b.m("size ", i10, " must be greater than zero.").toString());
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList((size / i10) + (size % i10 == 0 ? 0 : 1));
        int i11 = 0;
        while (i11 >= 0 && i11 < size) {
            int i12 = size - i11;
            if (i10 <= i12) {
                i12 = i10;
            }
            ArrayList arrayList3 = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList3.add(arrayList.get(i13 + i11));
            }
            arrayList2.add(arrayList3);
            i11 += i10;
        }
        return arrayList2;
    }

    @Override // bk.l
    public final void a(int i10, int i11) {
        n.b("JobResultsUploader", b.l("totalBytesUploaded: ", i10, i11, " maxUploadSize: "));
    }

    @Override // bk.l
    public final void b(dr.a aVar) {
        ArrayList arrayList;
        n.b("JobResultsUploader", "onUploadResult() called");
        aVar.toString();
        n.a();
        this.k++;
        if (aVar instanceof i) {
            this.f8969l++;
            i1 i1Var = this.f8972o;
            if (i1Var != null) {
                List list = i1Var.f552b;
                arrayList = new ArrayList(mq.p.a0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((vj.c) it.next()).b()));
                }
            } else {
                arrayList = null;
            }
            boolean z10 = arrayList != null ? !arrayList.isEmpty() : false;
            if (arrayList != null && z10) {
                p pVar = this.f8962c;
                synchronized (pVar.f10444b) {
                    try {
                        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new xi.p(((Number) it2.next()).longValue(), System.currentTimeMillis()));
                        }
                        n.b("MemorySentResultsRepository", "Adding to sent results - " + arrayList2);
                        pVar.f10444b.addAll(arrayList2);
                        pVar.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c cVar = this.f8961b;
                synchronized (cVar.f8192a) {
                    cVar.f8192a.h(cVar.f8193b, arrayList);
                }
            }
        }
        n.b("JobResultsUploader", "Total results attempted to upload: " + this.k + ". Uploaded " + this.f8969l + " out of " + this.j);
    }

    public final ArrayList c(String str) {
        ArrayList arrayListB;
        c cVar = this.f8961b;
        br.l.e(str, "taskName");
        synchronized (cVar.f8192a) {
            arrayListB = cVar.f8192a.b(cVar.f8193b, e5.H("task_name"), e5.H(str));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            long jLongValue = ((Number) next).longValue();
            ArrayList arrayList2 = this.f8962c.f10444b;
            ArrayList arrayList3 = new ArrayList(mq.p.a0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Long.valueOf(((xi.p) it2.next()).f25358a));
            }
            if (!arrayList3.contains(Long.valueOf(jLongValue))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final dr.a d() {
        if (this.k != this.j) {
            n.b("JobResultsUploader", "Not all results attempted to upload. Wait.");
            return null;
        }
        n.b("JobResultsUploader", "All results attempted to upload");
        if (this.f8969l == this.j) {
            n.b("JobResultsUploader", "Uploading success!");
            return new i(new byte[0], x.f16946a);
        }
        n.b("JobResultsUploader", "Uploading failed.");
        return new bk.j(null, 1);
    }

    public final void f(ak.b bVar, i1 i1Var, boolean z10) throws IllegalStateException, NoSuchAlgorithmException, IOException, InvalidKeyException {
        String strJ;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i1Var.f552b.size());
        sb2.append(" job results to upload to ");
        String str = i1Var.f551a;
        sb2.append(str);
        n.b("JobResultsUploader", sb2.toString());
        String str2 = (String) this.f8964e.a(i1Var.f552b);
        d dVar = (d) this.f8960a.f31a;
        String str3 = "";
        if (dVar.w() != null) {
            StringBuilder sb3 = new StringBuilder();
            ak.b bVarW = dVar.w();
            strJ = w.g.j(sb3, bVarW != null ? bVarW.f434h : null, str);
        } else {
            strJ = "";
        }
        Charset charset = tt.a.f22975a;
        byte[] bytes = str2.getBytes(charset);
        br.l.d(bytes, "getBytes(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            br.l.d(byteArray, "toByteArray(...)");
            if (z10) {
                byteArray = this.f8966g.Q(bytes).getBytes(charset);
                br.l.d(byteArray, "getBytes(...)");
            }
            byte[] bArr = byteArray;
            String str4 = bVar.f427a;
            Object obj = this.f8965f.f2478d;
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(f0.n(str4), "HmacSHA256");
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(secretKeySpec);
                byte[] bArrDoFinal = mac.doFinal(bArr);
                br.l.b(bArrDoFinal);
                String upperCase = new String(f0.Y(bArrDoFinal)).toUpperCase();
                br.l.d(upperCase, "toUpperCase(...)");
                str3 = upperCase;
            } catch (InvalidKeyException e4) {
                n.d("HmacHeader", "getDummyHmac() InvalidKeyException", e4);
                cj.a.F("getDummyHmac() InvalidKeyException : " + e4);
            } catch (NoSuchAlgorithmException e10) {
                n.d("HmacHeader", "getDummyHmac() NoSuchAlgorithmException", e10);
                cj.a.F("getDummyHmac() NoSuchAlgorithmException : " + e10);
            }
            HashMap map = new HashMap();
            map.put("Content-Encoding", "gzip");
            map.put("Content-Type", "application/json; charset=utf-8");
            map.put("Accept", "*/*");
            map.put("X-CLIENT-ID", bVar.f428b);
            map.put("X-hmac-version", "2");
            map.put("X-hmac", str3);
            map.put("X-Encrypted", String.valueOf(z10));
            map.put("X-Encryption-Version", "3");
            map.toString();
            n.a();
            this.f8967h.S0(strJ, bArr, map, 0, false);
        } finally {
        }
    }
}
