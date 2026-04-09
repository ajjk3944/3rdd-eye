package s1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class k {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f61038a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f61039b;

        /* renamed from: c, reason: collision with root package name */
        private final s[] f61040c;

        /* renamed from: d, reason: collision with root package name */
        private final s[] f61041d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f61042e;

        /* renamed from: f, reason: collision with root package name */
        boolean f61043f;

        /* renamed from: g, reason: collision with root package name */
        private final int f61044g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f61045h;

        /* renamed from: i, reason: collision with root package name */
        public int f61046i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f61047j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f61048k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f61049l;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.a(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f61048k;
        }

        public boolean b() {
            return this.f61042e;
        }

        public Bundle c() {
            return this.f61038a;
        }

        public IconCompat d() {
            int i10;
            if (this.f61039b == null && (i10 = this.f61046i) != 0) {
                this.f61039b = IconCompat.a(null, "", i10);
            }
            return this.f61039b;
        }

        public s[] e() {
            return this.f61040c;
        }

        public int f() {
            return this.f61044g;
        }

        public boolean g() {
            return this.f61043f;
        }

        public CharSequence h() {
            return this.f61047j;
        }

        public boolean i() {
            return this.f61049l;
        }

        public boolean j() {
            return this.f61045h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, s[] sVarArr, s[] sVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f61043f = true;
            this.f61039b = iconCompat;
            if (iconCompat != null && iconCompat.d() == 2) {
                this.f61046i = iconCompat.b();
            }
            this.f61047j = d.d(charSequence);
            this.f61048k = pendingIntent;
            this.f61038a = bundle == null ? new Bundle() : bundle;
            this.f61040c = sVarArr;
            this.f61041d = sVarArr2;
            this.f61042e = z10;
            this.f61044g = i10;
            this.f61043f = z11;
            this.f61045h = z12;
            this.f61049l = z13;
        }
    }

    public static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f61050e;

        @Override // s1.k.e
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // s1.k.e
        public void b(j jVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(jVar.a()).setBigContentTitle(this.f61099b).bigText(this.f61050e);
            if (this.f61101d) {
                bigTextStyleBigText.setSummaryText(this.f61100c);
            }
        }

        @Override // s1.k.e
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f61050e = d.d(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        protected d f61098a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f61099b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f61100c;

        /* renamed from: d, reason: collision with root package name */
        boolean f61101d = false;

        public void a(Bundle bundle) {
            if (this.f61101d) {
                bundle.putCharSequence("android.summaryText", this.f61100c);
            }
            CharSequence charSequence = this.f61099b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(j jVar);

        protected abstract String c();

        public RemoteViews d(j jVar) {
            return null;
        }

        public RemoteViews e(j jVar) {
            return null;
        }

        public RemoteViews f(j jVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.f61098a != dVar) {
                this.f61098a = dVar;
                if (dVar != null) {
                    dVar.u(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static class d {

        /* renamed from: A, reason: collision with root package name */
        boolean f61051A;

        /* renamed from: B, reason: collision with root package name */
        boolean f61052B;

        /* renamed from: C, reason: collision with root package name */
        String f61053C;

        /* renamed from: D, reason: collision with root package name */
        Bundle f61054D;

        /* renamed from: E, reason: collision with root package name */
        int f61055E;

        /* renamed from: F, reason: collision with root package name */
        int f61056F;

        /* renamed from: G, reason: collision with root package name */
        Notification f61057G;

        /* renamed from: H, reason: collision with root package name */
        RemoteViews f61058H;

        /* renamed from: I, reason: collision with root package name */
        RemoteViews f61059I;

        /* renamed from: J, reason: collision with root package name */
        RemoteViews f61060J;

        /* renamed from: K, reason: collision with root package name */
        String f61061K;

        /* renamed from: L, reason: collision with root package name */
        int f61062L;

        /* renamed from: M, reason: collision with root package name */
        String f61063M;

        /* renamed from: N, reason: collision with root package name */
        long f61064N;

        /* renamed from: O, reason: collision with root package name */
        int f61065O;

        /* renamed from: P, reason: collision with root package name */
        int f61066P;

        /* renamed from: Q, reason: collision with root package name */
        boolean f61067Q;

        /* renamed from: R, reason: collision with root package name */
        Notification f61068R;

        /* renamed from: S, reason: collision with root package name */
        boolean f61069S;

        /* renamed from: T, reason: collision with root package name */
        Object f61070T;

        /* renamed from: U, reason: collision with root package name */
        public ArrayList f61071U;

        /* renamed from: a, reason: collision with root package name */
        public Context f61072a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f61073b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f61074c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f61075d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f61076e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f61077f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f61078g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f61079h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f61080i;

        /* renamed from: j, reason: collision with root package name */
        IconCompat f61081j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f61082k;

        /* renamed from: l, reason: collision with root package name */
        int f61083l;

        /* renamed from: m, reason: collision with root package name */
        int f61084m;

        /* renamed from: n, reason: collision with root package name */
        boolean f61085n;

        /* renamed from: o, reason: collision with root package name */
        boolean f61086o;

        /* renamed from: p, reason: collision with root package name */
        e f61087p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f61088q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f61089r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f61090s;

        /* renamed from: t, reason: collision with root package name */
        int f61091t;

        /* renamed from: u, reason: collision with root package name */
        int f61092u;

        /* renamed from: v, reason: collision with root package name */
        boolean f61093v;

        /* renamed from: w, reason: collision with root package name */
        String f61094w;

        /* renamed from: x, reason: collision with root package name */
        boolean f61095x;

        /* renamed from: y, reason: collision with root package name */
        String f61096y;

        /* renamed from: z, reason: collision with root package name */
        boolean f61097z;

        public d(Context context, String str) {
            this.f61073b = new ArrayList();
            this.f61074c = new ArrayList();
            this.f61075d = new ArrayList();
            this.f61085n = true;
            this.f61097z = false;
            this.f61055E = 0;
            this.f61056F = 0;
            this.f61062L = 0;
            this.f61065O = 0;
            this.f61066P = 0;
            Notification notification = new Notification();
            this.f61068R = notification;
            this.f61072a = context;
            this.f61061K = str;
            notification.when = System.currentTimeMillis();
            this.f61068R.audioStreamType = -1;
            this.f61084m = 0;
            this.f61071U = new ArrayList();
            this.f61067Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void m(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f61068R;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f61068R;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public d a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f61073b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new l(this).c();
        }

        public Bundle c() {
            if (this.f61054D == null) {
                this.f61054D = new Bundle();
            }
            return this.f61054D;
        }

        public d e(boolean z10) {
            m(16, z10);
            return this;
        }

        public d f(String str) {
            this.f61053C = str;
            return this;
        }

        public d g(String str) {
            this.f61061K = str;
            return this;
        }

        public d h(int i10) {
            this.f61055E = i10;
            return this;
        }

        public d i(boolean z10) {
            this.f61051A = z10;
            this.f61052B = true;
            return this;
        }

        public d j(PendingIntent pendingIntent) {
            this.f61078g = pendingIntent;
            return this;
        }

        public d k(CharSequence charSequence) {
            this.f61077f = d(charSequence);
            return this;
        }

        public d l(CharSequence charSequence) {
            this.f61076e = d(charSequence);
            return this;
        }

        public d n(int i10) {
            this.f61066P = i10;
            return this;
        }

        public d o(boolean z10) {
            this.f61097z = z10;
            return this;
        }

        public d p(boolean z10) {
            m(2, z10);
            return this;
        }

        public d q(boolean z10) {
            m(8, z10);
            return this;
        }

        public d r(int i10) {
            this.f61084m = i10;
            return this;
        }

        public d s(int i10, int i11, boolean z10) {
            this.f61091t = i10;
            this.f61092u = i11;
            this.f61093v = z10;
            return this;
        }

        public d t(int i10) {
            this.f61068R.icon = i10;
            return this;
        }

        public d u(e eVar) {
            if (this.f61087p != eVar) {
                this.f61087p = eVar;
                if (eVar != null) {
                    eVar.g(this);
                }
            }
            return this;
        }

        public d v(CharSequence charSequence) {
            this.f61068R.tickerText = d(charSequence);
            return this;
        }

        public d w(int i10) {
            this.f61056F = i10;
            return this;
        }

        public d x(long j10) {
            this.f61068R.when = j10;
            return this;
        }

        public d(Context context) {
            this(context, null);
        }
    }
}
