package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.google.android.gms.appset.AppSetIdInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k20 implements e81 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k20 f12989b = new k20(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k20 f12990c = new k20(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k20 f12991d = new k20(3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k20 f12992e = new k20(4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k20 f12993f = new k20(5);
    public static final /* synthetic */ k20 g = new k20(6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k20 f12994h = new k20(8);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k20 f12995i = new k20(9);
    public static final /* synthetic */ k20 j = new k20(10);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ k20 f12996k = new k20(11);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ k20 f12997l = new k20(12);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ k20 f12998m = new k20(13);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ k20 f12999n = new k20(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13000a;

    public /* synthetic */ k20(int i4) {
        this.f13000a = i4;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) throws IOException {
        int i4 = -1;
        String str = "";
        int i10 = 8;
        int i11 = 0;
        String str2 = null;
        int i12 = 1;
        switch (this.f13000a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.Ib)).booleanValue()) {
                    ua.j.C.f35265h.h("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th2);
                } else {
                    ua.j.C.f35265h.g("GetTopicsApiWithRecordObservationActionHandler", th2);
                }
                v41 v41Var = x41.f18307b;
                return yo0.e(new q5.c(u51.f17096e));
            case 1:
                ya.a0.n("Error during loading assets.", (Exception) obj);
                return s81.f15906b;
            case 2:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return yo0.w(cause);
            case 3:
                return yo0.w(new uf0(5));
            case 4:
                return yo0.e(((pg0) obj).f15002a);
            case 5:
                return s81.f15906b;
            case 6:
                Throwable cause2 = (ExecutionException) obj;
                if (cause2.getCause() != null) {
                    cause2 = cause2.getCause();
                }
                return yo0.w(cause2);
            case 7:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                fx.f11274a.execute(new uh0(i10, (InputStream) obj, parcelFileDescriptorArrCreatePipe[1]));
                return yo0.e(parcelFileDescriptor);
            case 8:
                return ((Throwable) obj) instanceof TimeoutException ? yo0.e(new ml0(Integer.toString(17), i12)) : yo0.e(new ml0(str2, i12));
            case 9:
                return yo0.e(new ml0((String) obj, i12));
            case 10:
                AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                return appSetIdInfo == null ? yo0.e(new am0(str2, i4, i11)) : yo0.e(new am0(appSetIdInfo.getId(), appSetIdInfo.getScope(), i11));
            case 11:
                q5.c cVar = (q5.c) obj;
                int i13 = 2;
                if (cVar == null) {
                    return yo0.e(new am0(str, i12, i13));
                }
                tp1 tp1VarA = up1.A();
                for (q5.d dVar : cVar.f32184a) {
                    rp1 rp1VarA = sp1.A();
                    int i14 = dVar.f32188c;
                    rp1VarA.b();
                    ((sp1) rp1VarA.f14755b).B(i14);
                    long j8 = dVar.f32187b;
                    rp1VarA.b();
                    ((sp1) rp1VarA.f14755b).C(j8);
                    long j9 = dVar.f32186a;
                    rp1VarA.b();
                    ((sp1) rp1VarA.f14755b).D(j9);
                    sp1 sp1Var = (sp1) rp1VarA.e();
                    tp1VarA.b();
                    ((up1) tp1VarA.f14755b).B(sp1Var);
                }
                return yo0.e(new am0(Base64.encodeToString(((up1) tp1VarA.e()).b(), 1), i12, i13));
            case 12:
                AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                int i15 = 3;
                return appSetIdInfo2 == null ? yo0.e(new am0(str2, i4, i15)) : yo0.e(new am0(appSetIdInfo2.getId(), appSetIdInfo2.getScope(), i15));
            case 13:
                return s81.f15906b;
            case 14:
                return yo0.e("");
            default:
                az0 az0Var = (az0) obj;
                return yo0.G(az0Var.a(), new hu(i10, az0Var), k81.f13081a);
        }
    }
}
