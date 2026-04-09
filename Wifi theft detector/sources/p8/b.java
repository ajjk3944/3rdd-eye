package p8;

import android.content.Context;
import android.os.Handler;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifihacker.detector.mvp.view.activity.MainActivity;
import g8.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.jmdns.impl.constants.DNSConstants;

/* loaded from: classes3.dex */
public class b implements q8.a {

    /* renamed from: b, reason: collision with root package name */
    public v8.a f23905b;

    /* renamed from: c, reason: collision with root package name */
    public Context f23906c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23907d;

    /* renamed from: e, reason: collision with root package name */
    public List f23908e;

    /* renamed from: f, reason: collision with root package name */
    public int f23909f;

    /* renamed from: g, reason: collision with root package name */
    public int f23910g;

    /* renamed from: a, reason: collision with root package name */
    public Handler f23904a = new Handler();

    /* renamed from: h, reason: collision with root package name */
    public Runnable f23911h = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.f(b.this);
            if (b.this.f23909f > 3) {
                b.this.f23909f = 0;
                return;
            }
            try {
                Map mapD = w7.a.b().d(b.this.f23906c.getApplicationContext());
                if (mapD == null || mapD.size() <= b.this.f23910g) {
                    b.this.f23904a.postDelayed(b.this.f23911h, 3000L);
                } else {
                    b.this.f23905b.d();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: p8.b$b, reason: collision with other inner class name */
    public class RunnableC0455b implements Runnable {
        public RunnableC0455b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MainActivity) b.this.f23906c).n0();
        }
    }

    public static /* synthetic */ int f(b bVar) {
        int i10 = bVar.f23909f;
        bVar.f23909f = i10 + 1;
        return i10;
    }

    @Override // q8.a
    public void a() {
        this.f23904a.removeCallbacksAndMessages(null);
    }

    @Override // q8.a
    public void b() {
        if (this.f23907d) {
            this.f23905b.c();
            return;
        }
        a();
        this.f23909f = 0;
        this.f23907d = true;
        this.f23905b.b();
        w7.a.b().f(this.f23906c, new c());
    }

    @Override // q8.a
    public void c(Context context, t8.a aVar) {
        this.f23906c = context;
        this.f23905b = aVar;
    }

    public final void q() {
        Context context = this.f23906c;
        if (context instanceof MainActivity) {
            ((MainActivity) context).runOnUiThread(new RunnableC0455b());
        }
    }

    public class c implements z7.a {

        /* renamed from: a, reason: collision with root package name */
        public List f23914a;

        /* renamed from: b, reason: collision with root package name */
        public HashSet f23915b = null;

        /* renamed from: c, reason: collision with root package name */
        public HashMap f23916c = null;

        public c() {
        }

        @Override // z7.a
        public void c(HostInfo hostInfo) {
            if (this.f23914a == null) {
                this.f23914a = new ArrayList();
            }
            if (b.this.f23908e == null) {
                b bVar = b.this;
                bVar.f23908e = f.b(bVar.f23906c);
            }
            this.f23914a.add(hostInfo);
            b.this.f23905b.a(this.f23914a, b.this.f23908e);
        }

        @Override // z7.a
        public void onFinish() {
            b.this.f23910g = this.f23914a.size();
            b.this.f23907d = false;
            if (b.this.f23908e == null) {
                b bVar = b.this;
                bVar.f23908e = f.b(bVar.f23906c);
            }
            b.this.f23905b.e(this.f23914a, b.this.f23908e);
            f.c(b.this.f23906c, this.f23914a, b.this.f23908e);
            f.d(b.this.f23906c, this.f23914a);
            b.this.f23908e = null;
            b.this.q();
            b.this.f23904a.postDelayed(b.this.f23911h, DNSConstants.SERVICE_INFO_TIMEOUT);
        }

        @Override // z7.a
        public void a(HostInfo hostInfo) {
        }

        @Override // z7.a
        public void b(int i10) {
        }
    }
}
