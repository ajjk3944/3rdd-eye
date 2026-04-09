package s4;

import F4.c;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1266ha;
import com.google.android.gms.internal.ads.BinderC1804rb;
import com.google.android.gms.internal.ads.C0499Fa;
import com.google.android.gms.internal.ads.C1347j2;
import com.google.android.gms.internal.ads.H9;
import f1.i;
import j2.C2548d;
import j2.C2549e;
import j2.t;
import java.util.ArrayList;
import java.util.HashSet;
import o.U;
import p1.e;
import q2.C2841s;
import q2.E;
import q2.E0;
import q2.H;
import q2.Y0;
import q2.c1;
import u2.AbstractC2953c;
import u2.k;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2898a {

    /* renamed from: e, reason: collision with root package name */
    public static final e f23497e = new e(9);

    /* renamed from: f, reason: collision with root package name */
    public static C2898a f23498f;

    /* renamed from: b, reason: collision with root package name */
    public C2549e f23500b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23501c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23499a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public long f23502d = System.currentTimeMillis();

    public final void a(Context context, String str, boolean z6) {
        if (str == null || str.length() == 0) {
            System.out.println((Object) "谷歌广告id为空");
            return;
        }
        if (this.f23501c) {
            return;
        }
        C2548d c2548d = new C2548d(context, str);
        H h6 = c2548d.f21334b;
        try {
            h6.F0(new BinderC1804rb(1, new c(24, this)));
        } catch (RemoteException e6) {
            k.i("Failed to add google native ad listener", e6);
        }
        C1347j2 c1347j2 = new C1347j2();
        c1347j2.f14862a = true;
        try {
            h6.l2(new C0499Fa(4, false, -1, false, 1, new Y0(new t(c1347j2)), false, 0, 0, false, 1 - 1));
        } catch (RemoteException e7) {
            k.i("Failed to specify native ad options", e7);
        }
        c2548d.b(new com.google.ads.mediation.e(context, 1, this));
        C2549e c2549eA = c2548d.a();
        E e8 = c2549eA.f21336b;
        Context context2 = c2549eA.f21335a;
        this.f23500b = c2549eA;
        this.f23501c = true;
        if (!z6) {
            U u6 = new U();
            ((HashSet) u6.f22435g).add("B3EEABB8EE11C2BE770B684D95219ECB");
            try {
                e8.a1(c1.a(context2, new E0(u6)), 5);
                return;
            } catch (RemoteException e9) {
                k.f("Failed to load ads.", e9);
                return;
            }
        }
        U u7 = new U();
        ((HashSet) u7.f22435g).add("B3EEABB8EE11C2BE770B684D95219ECB");
        E0 e02 = new E0(u7);
        H9.a(context2);
        if (((Boolean) AbstractC1266ha.f14501c.v()).booleanValue()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.tc)).booleanValue()) {
                AbstractC2953c.f23792b.execute(new i(c2549eA, 2, e02));
                return;
            }
        }
        try {
            e8.f0(c1.a(context2, e02));
        } catch (RemoteException e10) {
            k.f("Failed to load ad.", e10);
        }
    }
}
