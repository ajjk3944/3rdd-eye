package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import f4.InterfaceFutureC2326a;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import q2.C2841s;
import t2.AbstractC2907C;
import z0.C3015b;

/* renamed from: com.google.android.gms.internal.ads.pi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1704pi implements InterfaceC1736qD {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16201b = new C1704pi(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16202c = new C1704pi(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16203d = new C1704pi(3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16204e = new C1704pi(4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16205f = new C1704pi(5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16206g = new C1704pi(6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16207h = new C1704pi(8);
    public static final /* synthetic */ C1704pi i = new C1704pi(9);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16208j = new C1704pi(10);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16209k = new C1704pi(11);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16210l = new C1704pi(12);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16211m = new C1704pi(13);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1704pi f16212n = new C1704pi(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16213a;

    public /* synthetic */ C1704pi(int i3) {
        this.f16213a = i3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) throws IOException {
        int i3 = -1;
        String str = "";
        int i6 = 0;
        String str2 = null;
        int i7 = 1;
        switch (this.f16213a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.Gb)).booleanValue()) {
                    p2.j.f22785C.f22795h.h("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    p2.j.f22785C.f22795h.g("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                JB jb = LB.f9635b;
                return AbstractC1984ut.e(new C3015b(C1197gC.f14227e));
            case 1:
                AbstractC2907C.n("Error during loading assets.", (Exception) obj);
                return ED.f7928b;
            case 2:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return AbstractC1984ut.w(cause);
            case 3:
                return AbstractC1984ut.w(new C0836Yo(5));
            case 4:
                return AbstractC1984ut.e(((C1818rp) obj).f16618a);
            case 5:
                return ED.f7928b;
            case 6:
                Throwable cause2 = (ExecutionException) obj;
                if (cause2.getCause() != null) {
                    cause2 = cause2.getCause();
                }
                return AbstractC1984ut.w(cause2);
            case 7:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                AbstractC0640Nf.f10005a.execute(new RunnableC0786Vp((InputStream) obj, 9, parcelFileDescriptorArrCreatePipe[1]));
                return AbstractC1984ut.e(parcelFileDescriptor);
            case 8:
                return ((Throwable) obj) instanceof TimeoutException ? AbstractC1984ut.e(new Or(Integer.toString(17), i7)) : AbstractC1984ut.e(new Or(str2, i7));
            case 9:
                return AbstractC1984ut.e(new Or((String) obj, i7));
            case 10:
                G2.b bVar = (G2.b) obj;
                return bVar == null ? AbstractC1984ut.e(new C0958bs(str2, i3, i6)) : AbstractC1984ut.e(new C0958bs(bVar.f1513a, bVar.f1514b, i6));
            case 11:
                C3015b c3015b = (C3015b) obj;
                int i8 = 2;
                if (c3015b == null) {
                    return AbstractC1984ut.e(new C0958bs(str, i7, i8));
                }
                C1261hM c1261hMA = C1315iM.A();
                for (z0.c cVar : c3015b.f24439a) {
                    C1152fM c1152fMA = C1207gM.A();
                    int i9 = cVar.f24442c;
                    c1152fMA.b();
                    ((C1207gM) c1152fMA.f13551b).B(i9);
                    long j6 = cVar.f24441b;
                    c1152fMA.b();
                    ((C1207gM) c1152fMA.f13551b).C(j6);
                    long j7 = cVar.f24440a;
                    c1152fMA.b();
                    ((C1207gM) c1152fMA.f13551b).D(j7);
                    C1207gM c1207gM = (C1207gM) c1152fMA.d();
                    c1261hMA.b();
                    ((C1315iM) c1261hMA.f13551b).B(c1207gM);
                }
                return AbstractC1984ut.e(new C0958bs(Base64.encodeToString(((C1315iM) c1261hMA.d()).b(), 1), i7, i8));
            case 12:
                G2.b bVar2 = (G2.b) obj;
                int i10 = 3;
                return bVar2 == null ? AbstractC1984ut.e(new C0958bs(str2, i3, i10)) : AbstractC1984ut.e(new C0958bs(bVar2.f1513a, bVar2.f1514b, i10));
            case 13:
                return ED.f7928b;
            case 14:
                return AbstractC1984ut.e("");
            default:
                My my = (My) obj;
                return AbstractC1984ut.G(my.c(), new C1754qe(8, my), EnumC2059wD.f17407a);
        }
    }
}
