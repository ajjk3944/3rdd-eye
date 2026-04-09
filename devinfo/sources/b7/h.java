package b7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Looper;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.m9;
import ec.d0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements u8.a, cb.c, e4.w, ec.v {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h f1984b = new h(14);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h f1985c = new h(15);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h f1986d = new h(16);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h f1987e = new h(17);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h f1988f = new h(18);
    public static final /* synthetic */ h g = new h(19);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h f1989h = new h(20);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ h f1990i = new h(21);
    public static final /* synthetic */ h j = new h(22);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ h f1991k = new h(23);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ h f1992l = new h(24);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h f1993m = new h(25);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ h f1994n = new h(26);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ h f1995o = new h(27);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ h f1996p = new h(28);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ h f1997q = new h(29);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1998a;

    public /* synthetic */ h(int i4) {
        this.f1998a = i4;
    }

    public static ArrayList a(List list) {
        nk.k.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((rl.u) obj) != rl.u.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(zj.o.T(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((rl.u) obj2).f33185a);
        }
        return arrayList2;
    }

    public static byte[] c(List list) {
        nk.k.e(list, "protocols");
        hm.e eVar = new hm.e();
        ArrayList arrayListA = a(list);
        int size = arrayListA.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListA.get(i4);
            i4++;
            String str = (String) obj;
            eVar.E(str.length());
            eVar.T(str);
        }
        return eVar.readByteArray(eVar.f25174b);
    }

    public static h d(int i4, Context context) throws Resources.NotFoundException {
        pk.a.c("Cannot create a CalendarItemStyle with a styleResId of 0", i4 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, ic.a.f25959t);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        jm.a.j(context, typedArrayObtainStyledAttributes, 4);
        jm.a.j(context, typedArrayObtainStyledAttributes, 9);
        jm.a.j(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        ed.o.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        h hVar = new h(10);
        pk.a.d(rect.left);
        pk.a.d(rect.top);
        pk.a.d(rect.right);
        pk.a.d(rect.bottom);
        return hVar;
    }

    public static final boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // ec.v
    public Object b() {
        switch (this.f1998a) {
            case 14:
                return new Boolean(((Boolean) k7.f19809b.b()).booleanValue());
            case 15:
                return new Boolean(((Boolean) c8.f19651a.b()).booleanValue());
            case 16:
                List list = d0.f22616a;
                Boolean bool = (Boolean) m9.f19833a.b();
                bool.getClass();
                return bool;
            case 17:
                List list2 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.f19697l.b();
            case 18:
                List list3 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19704o0.b()).longValue());
            case 19:
                List list4 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19709r.b()).longValue());
            case 20:
                List list5 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.M.b();
            case 21:
                List list6 = d0.f22616a;
                c7.f19649b.get();
                Long l10 = (Long) e7.A.b();
                l10.getClass();
                return l10;
            case 22:
                List list7 = d0.f22616a;
                c7.f19649b.get();
                Long l11 = (Long) e7.L.b();
                l11.getClass();
                return l11;
            case 23:
                List list8 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.O.b()).longValue());
            case 24:
                List list9 = d0.f22616a;
                c7.f19649b.get();
                Long l12 = (Long) e7.Q.b();
                l12.getClass();
                return l12;
            case 25:
                List list10 = d0.f22616a;
                c7.f19649b.get();
                Long l13 = (Long) e7.f19688f0.b();
                l13.getClass();
                return l13;
            case 26:
                List list11 = d0.f22616a;
                c7.f19649b.get();
                Long l14 = (Long) e7.E.b();
                l14.getClass();
                return l14;
            case 27:
                List list12 = d0.f22616a;
                c7.f19649b.get();
                Long l15 = (Long) e7.f19722y.b();
                l15.getClass();
                return l15;
            case 28:
                List list13 = d0.f22616a;
                c7.f19649b.get();
                Long l16 = (Long) e7.f19689g0.b();
                l16.getClass();
                return l16;
            default:
                List list14 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19712s0.b()).longValue());
        }
    }

    @Override // u8.a
    public Object h() {
        try {
            return new b8.h(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // e4.w
    public void onScrollLimit(int i4, int i10, int i11, boolean z3) {
    }

    @Override // e4.w
    public void onScrollProgress(int i4, int i10, int i11, int i12) {
    }
}
