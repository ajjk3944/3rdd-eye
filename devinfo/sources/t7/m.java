package t7;

import a0.c0;
import a0.v0;
import a0.w;
import a0.x0;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.android.gms.internal.ads.a80;
import com.google.android.gms.internal.ads.at0;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.ce1;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.fw0;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.jh;
import com.google.android.gms.internal.ads.jz;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.kh;
import com.google.android.gms.internal.ads.lh0;
import com.google.android.gms.internal.ads.lq0;
import com.google.android.gms.internal.ads.lx1;
import com.google.android.gms.internal.ads.mq0;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.p81;
import com.google.android.gms.internal.ads.r2;
import com.google.android.gms.internal.ads.rc;
import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.sk0;
import com.google.android.gms.internal.ads.t1;
import com.google.android.gms.internal.ads.uc;
import com.google.android.gms.internal.ads.v;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.y61;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.z3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g8.b0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements v0, r2, p81, Continuation, lx1, l8.a, f4.p, za.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34472a;

    /* renamed from: b, reason: collision with root package name */
    public int f34473b;

    /* renamed from: c, reason: collision with root package name */
    public Object f34474c;

    public /* synthetic */ m(char c9, int i4) {
        this.f34472a = i4;
    }

    public static void k(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i4 = 0;
        boolean z3 = false;
        while (i4 <= length) {
            boolean z10 = nk.k.f(str.charAt(!z3 ? i4 : length), 32) <= 0;
            if (z3) {
                if (!z10) {
                    break;
                } else {
                    length--;
                }
            } else if (z10) {
                i4++;
            } else {
                z3 = true;
            }
        }
        if (str.subSequence(i4, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e2) {
            Log.w("SupportSQLite", "delete failed: ", e2);
        }
    }

    public i.e A() {
        i.e eVarF = f();
        eVarF.show();
        return eVarF;
    }

    public void B(String str) {
        nk.k.e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        l(this.f34473b, length);
        str.getChars(0, str.length(), (char[]) this.f34474c, this.f34473b);
        this.f34473b += length;
    }

    public String C(z3 z3Var) {
        o oVar = (o) this.f34474c;
        int i4 = this.f34473b;
        try {
            if (oVar.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = oVar.E;
            String packageName = oVar.C.getPackageName();
            String str = i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? i4 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            n nVar = new n(z3Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel parcelA2 = eVar.a2();
            parcelA2.writeString(packageName);
            parcelA2.writeString(str);
            int i10 = com.google.android.gms.internal.play_billing.d.f20097a;
            parcelA2.writeStrongBinder(nVar);
            try {
                eVar.f303b.transact(1, parcelA2, null, 1);
                parcelA2.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th2) {
                parcelA2.recycle();
                throw th2;
            }
        } catch (Exception e2) {
            oVar.I(95, 28, r.f34492r);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
            z3Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public String D(ArrayList arrayList) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        ?? r32 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            sb2.append(((String) arrayList.get(i4)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Buffer.SEGMENTING_THRESHOLD);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        int i10 = this.f34473b;
        PriorityQueue priorityQueue = new PriorityQueue(i10, new v(6));
        int i11 = 0;
        while (i11 < strArrSplit.length) {
            String[] strArrM = jz.m(strArrSplit[i11], r32);
            if (strArrM.length != 0) {
                int length = strArrM.length;
                if (length < 6) {
                    a80.m(i10, a80.A(length, strArrM), a80.s(strArrM, r32, length), length, priorityQueue);
                } else {
                    long jA = a80.A(6, strArrM);
                    a80.m(i10, jA, a80.s(strArrM, r32, 6), 6, priorityQueue);
                    int i12 = 1;
                    while (true) {
                        int length2 = strArrM.length;
                        if (i12 < length2 - 5) {
                            int iA = jz.a(strArrM[i12 - 1]);
                            int iA2 = jz.a(strArrM[i12 + 5]);
                            int i13 = i12;
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            String strS = a80.s(strArrM, i13, 6);
                            jA = (((iA2 + 2147483647L) % 1073807359) + (((((jA + 1073807359) - ((((iA + 2147483647L) % 1073807359) * a80.w(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            a80.m(i10, jA, strS, length2, priorityQueue);
                            i12 = i13 + 1;
                            strArrSplit = strArrSplit;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    }
                }
            }
            i11++;
            strArrSplit = strArrSplit;
            byteArrayOutputStream = byteArrayOutputStream;
            r32 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((jh) this.f34474c).v1(((kh) it.next()).f13157b));
            } catch (IOException e2) {
                za.i.f("Error while writing hash to byteStream", e2);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e10) {
            za.i.f("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            byteArrayOutputStream3.close();
            return byteArrayOutputStream3.toString();
        } catch (IOException e11) {
            za.i.f("HashManager: Unable to convert to Base64.", e11);
            return "";
        }
    }

    public long F(t1 t1Var) {
        int i4;
        sk0 sk0Var = (sk0) this.f34474c;
        int i10 = 0;
        t1Var.O1(sk0Var.f16446a, 0, 1, false);
        int i11 = sk0Var.f16446a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while (true) {
            i4 = i13 + 1;
            if ((i11 & i12) != 0) {
                break;
            }
            i12 >>= 1;
            i13 = i4;
        }
        int i14 = i11 & (~i12);
        t1Var.O1(sk0Var.f16446a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (sk0Var.f16446a[i10] & 255) + (i14 << 8);
        }
        this.f34473b += i4;
        return i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public int G() {
        Bundle bundle = ((iu) this.f34474c).f12473a.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        return 0;
                    }
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        return 1;
                    }
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        return 2;
                    }
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        return 3;
                    }
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        return 4;
                    }
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        return 5;
                    }
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        return 6;
                    }
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        return 7;
                    }
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        return 8;
                    }
                    break;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public MediaCodecInfo L1(int i4) {
        if (((MediaCodecInfo[]) this.f34474c) == null) {
            this.f34474c = new MediaCodecList(this.f34473b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f34474c)[i4];
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public int b() {
        if (((MediaCodecInfo[]) this.f34474c) == null) {
            this.f34474c = new MediaCodecList(this.f34473b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f34474c).length;
    }

    @Override // f4.p
    public boolean c(View view) {
        ((BottomSheetBehavior) this.f34474c).J(this.f34473b);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public i.e f() {
        i.b bVar = (i.b) this.f34474c;
        i.e eVar = new i.e(bVar.f25230a, this.f34473b);
        View view = bVar.f25234e;
        i.d dVar = eVar.g;
        if (view != null) {
            dVar.f25273x = view;
        } else {
            CharSequence charSequence = bVar.f25233d;
            if (charSequence != null) {
                dVar.f25255d = charSequence;
                TextView textView = dVar.f25271v;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f25232c;
            if (drawable != null) {
                dVar.f25269t = drawable;
                ImageView imageView = dVar.f25270u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    dVar.f25270u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = bVar.f25235f;
        if (charSequence2 != null) {
            dVar.f25256e = charSequence2;
            TextView textView2 = dVar.f25272w;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = bVar.g;
        if (charSequence3 != null) {
            dVar.c(-1, charSequence3, bVar.f25236h);
        }
        CharSequence charSequence4 = bVar.f25237i;
        if (charSequence4 != null) {
            dVar.c(-2, charSequence4, bVar.j);
        }
        CharSequence charSequence5 = bVar.f25238k;
        if (charSequence5 != null) {
            dVar.c(-3, charSequence5, bVar.f25239l);
        }
        if (bVar.f25244q != null || bVar.f25245r != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f25231b.inflate(dVar.B, (ViewGroup) null);
            int i4 = bVar.f25249v ? dVar.C : dVar.D;
            Object obj = bVar.f25245r;
            ?? cVar = obj;
            if (obj == null) {
                cVar = new i.c(bVar.f25230a, i4, R.id.text1, bVar.f25244q);
            }
            dVar.f25274y = cVar;
            dVar.f25275z = bVar.f25250w;
            if (bVar.f25246s != null) {
                alertController$RecycleListView.setOnItemClickListener(new i.a(bVar, dVar));
            }
            if (bVar.f25249v) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            dVar.f25257f = alertController$RecycleListView;
        }
        View view2 = bVar.f25248u;
        if (view2 != null) {
            dVar.g = view2;
            dVar.f25258h = 0;
            dVar.f25259i = false;
        } else {
            int i10 = bVar.f25247t;
            if (i10 != 0) {
                dVar.g = null;
                dVar.f25258h = i10;
                dVar.f25259i = false;
            }
        }
        eVar.setCancelable(bVar.f25240m);
        if (bVar.f25240m) {
            eVar.setCanceledOnTouchOutside(true);
        }
        eVar.setOnCancelListener(bVar.f25241n);
        eVar.setOnDismissListener(bVar.f25242o);
        o.n nVar = bVar.f25243p;
        if (nVar != null) {
            eVar.setOnKeyListener(nVar);
        }
        return eVar;
    }

    @Override // a0.v0
    public long g(a0.r rVar, a0.r rVar2, a0.r rVar3) {
        return this.f34473b * 1000000;
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        switch (this.f34472a) {
            case 7:
                int i4 = this.f34473b;
                d.h.D(ua.j.C.f35267k, ((od0) ((aw) this.f34474c).f9454e).f14678e, d7.f(i4));
                break;
            default:
                lq0 lq0Var = (lq0) this.f34474c;
                String str = (String) obj;
                int i10 = this.f34473b;
                wp0 wp0Var = lq0Var.f13580a;
                if (!wp0Var.f18088i0) {
                    lq0Var.f13582c.b(str, wp0Var.f18117x0, lq0Var.f13584e, null);
                    break;
                } else {
                    at0 at0Var = lq0Var.f13583d;
                    String str2 = lq0Var.f13581b.f18820b;
                    at0Var.getClass();
                    ua.j.C.f35267k.getClass();
                    sa saVar = new sa(str2, str, i10, System.currentTimeMillis());
                    lh0 lh0Var = at0Var.f9410a;
                    lh0Var.getClass();
                    lh0Var.c(new ce1(lh0Var, false, saVar, 15));
                    break;
                }
        }
    }

    @Override // za.e
    public /* synthetic */ void i(JsonWriter jsonWriter) throws IOException {
        int i4 = this.f34473b;
        Map map = (Map) this.f34474c;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i4);
        jsonWriter.endObject();
        za.f.d(jsonWriter, map);
        jsonWriter.endObject();
    }

    @Override // a0.v0
    public a0.r j(long j, a0.r rVar, a0.r rVar2, a0.r rVar3) {
        return ((x0) this.f34474c).j(j, rVar, rVar2, rVar3);
    }

    public void l(int i4, int i10) {
        int i11 = i10 + i4;
        char[] cArr = (char[]) this.f34474c;
        if (cArr.length <= i11) {
            int i12 = i4 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i11);
            nk.k.d(cArrCopyOf, "copyOf(...)");
            this.f34474c = cArrCopyOf;
        }
    }

    @Override // l8.a
    public y m(y yVar, x7.h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) yVar.get()).compress((Bitmap.CompressFormat) this.f34474c, this.f34473b, byteArrayOutputStream);
        yVar.a();
        return new b0(byteArrayOutputStream.toByteArray());
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        switch (this.f34472a) {
            case 7:
                break;
            default:
                ua.j.C.f35265h.f("BufferingUrlPinger.attributionReportingManager", th2);
                break;
        }
    }

    public boolean o() {
        return ((r7.b) this.f34474c) != null;
    }

    public void p(int i4, hm.b bVar) {
        while (true) {
            int i10 = i4 >> 1;
            if (i10 == 0) {
                break;
            }
            hm.b bVar2 = ((hm.b[]) this.f34474c)[i10];
            nk.k.b(bVar2);
            if (nk.k.g(0L, bVar.g - bVar2.g) <= 0) {
                break;
            }
            bVar2.f25168f = i4;
            ((hm.b[]) this.f34474c)[i4] = bVar2;
            i4 = i10;
        }
        ((hm.b[]) this.f34474c)[i4] = bVar;
        bVar.f25168f = i4;
    }

    @Override // a0.v0
    public a0.r q(a0.r rVar, a0.r rVar2, a0.r rVar3) {
        return ((x0) this.f34474c).j(g(rVar, rVar2, rVar3), rVar, rVar2, rVar3);
    }

    @Override // a0.v0
    public a0.r r(long j, a0.r rVar, a0.r rVar2, a0.r rVar3) {
        return ((x0) this.f34474c).r(j, rVar, rVar2, rVar3);
    }

    public void s(f6.c cVar, int i4, int i10) {
        ((t5.p) this.f34474c).e(new w5.a(cVar), i4, i10);
    }

    public void t() {
        ol.b bVar = ol.b.f30582c;
        char[] cArr = (char[]) this.f34474c;
        bVar.getClass();
        nk.k.e(cArr, "array");
        synchronized (bVar) {
            int i4 = bVar.f995a;
            if (cArr.length + i4 < ol.a.f30581a) {
                bVar.f995a = i4 + cArr.length;
                ((zj.l) bVar.f996b).addLast(cArr);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            return Boolean.FALSE;
        }
        int i4 = this.f34473b;
        rc rcVar = (rc) this.f34474c;
        fw0 fw0Var = (fw0) task.getResult();
        byte[] bArrB = ((uc) rcVar.e()).b();
        fw0Var.getClass();
        k5 k5Var = new k5(fw0Var, bArrB);
        k5Var.f13029b = i4;
        k5Var.a();
        return Boolean.TRUE;
    }

    public String toString() {
        switch (this.f34472a) {
            case 5:
                y61 y61Var = (y61) this.f34474c;
                ArrayList arrayList = new ArrayList(y61Var.f18661b);
                int i4 = 0;
                while (true) {
                    int i10 = y61Var.f18661b;
                    if (i4 >= i10) {
                        String strX = bq0.x(this.f34473b);
                        String string = arrayList.toString();
                        StringBuilder sb2 = new StringBuilder(r5.c.f(strX.length() + 37, 1, string));
                        sb2.append("UnsupportedBrands{major=");
                        sb2.append(strX);
                        sb2.append(", compatible=");
                        sb2.append(string);
                        sb2.append("}");
                        return sb2.toString();
                    }
                    mq0.f0(i4, i10);
                    arrayList.add(bq0.x(y61Var.f18660a[i4]));
                    i4++;
                }
            case 18:
                return new String((char[]) this.f34474c, 0, this.f34473b);
            default:
                return super.toString();
        }
    }

    public void u(hm.b bVar) {
        hm.b bVar2;
        int i4 = bVar.f25168f;
        if (i4 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i10 = this.f34473b;
        hm.b bVar3 = ((hm.b[]) this.f34474c)[i10];
        nk.k.b(bVar3);
        bVar.f25168f = -1;
        ((hm.b[]) this.f34474c)[i10] = null;
        this.f34473b = i10 - 1;
        if (bVar == bVar3) {
            return;
        }
        int iG = nk.k.g(0L, bVar3.g - bVar.g);
        if (iG == 0) {
            ((hm.b[]) this.f34474c)[i4] = bVar3;
            bVar3.f25168f = i4;
            return;
        }
        if (iG >= 0) {
            p(i4, bVar3);
            return;
        }
        while (true) {
            int i11 = i4 << 1;
            int i12 = i11 + 1;
            int i13 = this.f34473b;
            if (i12 > i13) {
                if (i11 > i13) {
                    break;
                }
                bVar2 = ((hm.b[]) this.f34474c)[i11];
                nk.k.b(bVar2);
            } else {
                bVar2 = ((hm.b[]) this.f34474c)[i11];
                nk.k.b(bVar2);
                hm.b bVar4 = ((hm.b[]) this.f34474c)[i12];
                nk.k.b(bVar4);
                if (nk.k.g(0L, bVar4.g - bVar2.g) >= 0) {
                    bVar2 = bVar4;
                }
            }
            if (nk.k.g(0L, bVar2.g - bVar3.g) <= 0) {
                break;
            }
            int i14 = bVar2.f25168f;
            bVar2.f25168f = i4;
            ((hm.b[]) this.f34474c)[i4] = bVar2;
            i4 = i14;
        }
        ((hm.b[]) this.f34474c)[i4] = bVar3;
        bVar3.f25168f = i4;
    }

    public void v(int i4) {
        i.b bVar = (i.b) this.f34474c;
        bVar.f25235f = bVar.f25230a.getText(i4);
    }

    public void w(int i4, DialogInterface.OnClickListener onClickListener) {
        i.b bVar = (i.b) this.f34474c;
        bVar.f25237i = bVar.f25230a.getText(i4);
        bVar.j = onClickListener;
    }

    public void x(int i4, DialogInterface.OnClickListener onClickListener) {
        i.b bVar = (i.b) this.f34474c;
        bVar.g = bVar.f25230a.getText(i4);
        bVar.f25236h = onClickListener;
    }

    public void y(int i4) {
        i.b bVar = (i.b) this.f34474c;
        bVar.f25233d = bVar.f25230a.getText(i4);
    }

    public void z(View view) {
        i.b bVar = (i.b) this.f34474c;
        bVar.f25248u = view;
        bVar.f25247t = 0;
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public boolean zzc() {
        return true;
    }

    public /* synthetic */ m(int i4, Object obj, int i10) {
        this.f34472a = i10;
        this.f34473b = i4;
        this.f34474c = obj;
    }

    public /* synthetic */ m(Object obj, int i4, int i10) {
        this.f34472a = i10;
        this.f34474c = obj;
        this.f34473b = i4;
    }

    public m(boolean z3, boolean z10, boolean z11) {
        this.f34472a = 11;
        int i4 = 1;
        if (!z3 && !z10 && !z11) {
            i4 = 0;
        }
        this.f34473b = i4;
    }

    public m(int i4, int i10) {
        this.f34472a = i10;
        switch (i10) {
            case 20:
                this.f34473b = i4;
                break;
            default:
                this.f34474c = new jh(2);
                this.f34473b = i4;
                break;
        }
    }

    public m(int i4, int[] iArr) {
        y61 y61Var;
        this.f34472a = 5;
        this.f34473b = i4;
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            y61Var = new y61(iArrCopyOf.length, iArrCopyOf);
        } else {
            y61Var = y61.f18659c;
        }
        this.f34474c = y61Var;
    }

    public m(nb.b bVar, int i4) {
        this.f34472a = 3;
        pb.y.h(bVar);
        this.f34474c = bVar;
        this.f34473b = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(t5.p pVar, int i4) {
        this(i4, 20);
        this.f34472a = 20;
        this.f34474c = pVar;
    }

    public m(Context context) {
        this.f34472a = 13;
        int iH = i.e.h(0, context);
        this.f34474c = new i.b(new ContextThemeWrapper(context, i.e.h(iH, context)));
        this.f34473b = iH;
    }

    public m(byte b10, int i4) {
        this.f34472a = i4;
        switch (i4) {
            case 4:
                this.f34474c = new sk0(8);
                break;
            case 14:
                this.f34474c = Bitmap.CompressFormat.JPEG;
                this.f34473b = 100;
                break;
            case 19:
                this.f34473b = 255;
                this.f34474c = null;
                break;
            default:
                this.f34473b = 1;
                this.f34474c = Collections.singletonList(null);
                break;
        }
    }

    @Override // a0.v0
    public /* synthetic */ void d() {
    }

    private final void E(Throwable th2) {
    }

    public m(ArrayList arrayList) {
        this.f34472a = 2;
        this.f34473b = 0;
        this.f34474c = arrayList;
    }

    public m(int i4, w wVar) {
        this.f34472a = 1;
        this.f34473b = i4;
        this.f34474c = new x0(new c0(i4, wVar));
    }
}
