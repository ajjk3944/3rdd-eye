package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.processor.a;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import com.iab.omid.library.bytedance2.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TreeWalker implements a.InterfaceC0227a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f12413i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f12414j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f12415k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f12416l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f12417m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f12419b;

    /* renamed from: h, reason: collision with root package name */
    private long f12425h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f12418a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f12420c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f12421d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f12423f = new com.iab.omid.library.bytedance2.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f12422e = new com.iab.omid.library.bytedance2.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f12424g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f12424g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f12415k != null) {
                TreeWalker.f12415k.post(TreeWalker.f12416l);
                TreeWalker.f12415k.postDelayed(TreeWalker.f12417m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f12425h);
    }

    private void e() {
        this.f12419b = 0;
        this.f12421d.clear();
        this.f12420c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f12420c = true;
                break;
            }
        }
        this.f12425h = f.b();
    }

    public static TreeWalker getInstance() {
        return f12413i;
    }

    private void i() {
        if (f12415k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f12415k = handler;
            handler.post(f12416l);
            f12415k.postDelayed(f12417m, 200L);
        }
    }

    private void k() {
        Handler handler = f12415k;
        if (handler != null) {
            handler.removeCallbacks(f12417m);
            f12415k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f12418a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f12418a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f12423f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f12422e.a();
        if (this.f12423f.b().size() > 0) {
            Iterator<String> it = this.f12423f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f12423f.a(next), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f12424g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f12423f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            treeWalker.f12424g.b(jSONObjectA2, treeWalker.f12423f.c(), jB);
            if (treeWalker.f12420c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it2 = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f12421d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f12424g.b();
        }
        treeWalker.f12423f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f12418a.clear();
        f12414j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f12418a.contains(treeWalkerTimeLogger)) {
            this.f12418a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f12418a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f12418a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f12419b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f12419b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strD = this.f12423f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f12423f.f(view)));
        this.f12423f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0227a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f12423f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f12420c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f12421d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f12419b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f12422e.b();
        String strB = this.f12423f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0229a c0229aC = this.f12423f.c(view);
        if (c0229aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0229aC);
        return true;
    }
}
