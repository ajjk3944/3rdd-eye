package Y2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import e3.AbstractC4309c;
import g3.C4389b;
import java.util.ArrayList;
import t4.C5606d;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final K2.e f13739a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f13740b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13741c;

    /* renamed from: d, reason: collision with root package name */
    public final l f13742d;

    /* renamed from: e, reason: collision with root package name */
    public final O2.b f13743e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13744f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13745g;

    /* renamed from: h, reason: collision with root package name */
    public k<Bitmap> f13746h;
    public a i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13747j;

    /* renamed from: k, reason: collision with root package name */
    public a f13748k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f13749l;

    /* renamed from: m, reason: collision with root package name */
    public L2.l<Bitmap> f13750m;

    /* renamed from: n, reason: collision with root package name */
    public a f13751n;

    /* renamed from: o, reason: collision with root package name */
    public int f13752o;

    /* renamed from: p, reason: collision with root package name */
    public int f13753p;

    /* renamed from: q, reason: collision with root package name */
    public int f13754q;

    /* compiled from: GifFrameLoader.java */
    public static class a extends AbstractC4309c<Bitmap> {

        /* renamed from: e, reason: collision with root package name */
        public final Handler f13755e;

        /* renamed from: f, reason: collision with root package name */
        public final int f13756f;

        /* renamed from: g, reason: collision with root package name */
        public final long f13757g;

        /* renamed from: h, reason: collision with root package name */
        public Bitmap f13758h;

        public a(Handler handler, int i, long j4) {
            this.f13755e = handler;
            this.f13756f = i;
            this.f13757g = j4;
        }

        @Override // e3.InterfaceC4313g
        public final void c(Object obj) {
            this.f13758h = (Bitmap) obj;
            Handler handler = this.f13755e;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f13757g);
        }

        @Override // e3.InterfaceC4313g
        public final void h(Drawable drawable) {
            this.f13758h = null;
        }
    }

    /* compiled from: GifFrameLoader.java */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            f fVar = f.this;
            if (i == 1) {
                fVar.b((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            fVar.f13742d.i((a) message.obj);
            return false;
        }
    }

    public f(com.bumptech.glide.b bVar, K2.e eVar, int i, int i10, T2.b bVar2, Bitmap bitmap) {
        O2.b bVar3 = bVar.f22237b;
        com.bumptech.glide.e eVar2 = bVar.f22239d;
        l lVarD = com.bumptech.glide.b.d(eVar2.getBaseContext());
        l lVarD2 = com.bumptech.glide.b.d(eVar2.getBaseContext());
        lVarD2.getClass();
        k<Bitmap> kVarS = new k(lVarD2.f22280b, lVarD2, Bitmap.class, lVarD2.f22281c).a(l.f22279l).a(((d3.g) ((d3.g) new d3.g().e(N2.l.f4550a).q()).n()).i(i, i10));
        this.f13741c = new ArrayList();
        this.f13742d = lVarD;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f13743e = bVar3;
        this.f13740b = handler;
        this.f13746h = kVarS;
        this.f13739a = eVar;
        c(bVar2, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f13744f || this.f13745g) {
            return;
        }
        a aVar = this.f13751n;
        if (aVar != null) {
            this.f13751n = null;
            b(aVar);
            return;
        }
        this.f13745g = true;
        K2.e eVar = this.f13739a;
        int i10 = eVar.f3101l.f3079c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i10 <= 0 || (i = eVar.f3100k) < 0) ? 0 : (i < 0 || i >= i10) ? -1 : ((K2.b) r1.f3081e.get(i)).i);
        eVar.b();
        this.f13748k = new a(this.f13740b, eVar.f3100k, jUptimeMillis);
        k<Bitmap> kVarX = this.f13746h.a((d3.g) new d3.g().m(new C4389b(Double.valueOf(Math.random())))).x(eVar);
        kVarX.w(this.f13748k, kVarX);
    }

    public final void b(a aVar) {
        this.f13745g = false;
        boolean z10 = this.f13747j;
        Handler handler = this.f13740b;
        if (z10) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f13744f) {
            this.f13751n = aVar;
            return;
        }
        if (aVar.f13758h != null) {
            Bitmap bitmap = this.f13749l;
            if (bitmap != null) {
                this.f13743e.b(bitmap);
                this.f13749l = null;
            }
            a aVar2 = this.i;
            this.i = aVar;
            ArrayList arrayList = this.f13741c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(L2.l<Bitmap> lVar, Bitmap bitmap) {
        C5606d.l(lVar, "Argument must not be null");
        this.f13750m = lVar;
        C5606d.l(bitmap, "Argument must not be null");
        this.f13749l = bitmap;
        this.f13746h = this.f13746h.a(new d3.g().o(lVar, true));
        this.f13752o = h3.l.c(bitmap);
        this.f13753p = bitmap.getWidth();
        this.f13754q = bitmap.getHeight();
    }
}
