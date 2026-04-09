package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
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
public class TreeWalker implements a.InterfaceC0130a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f21108i = new TreeWalker();
    private static Handler j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f21109k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f21110l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f21111m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f21113b;

    /* renamed from: h, reason: collision with root package name */
    private long f21118h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f21112a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f21114c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f21115d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f21117f = new com.iab.omid.library.bytedance2.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f21116e = new com.iab.omid.library.bytedance2.processor.b();
    private com.iab.omid.library.bytedance2.walking.b g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i4, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i4, long j);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.g.b();
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
            if (TreeWalker.f21109k != null) {
                TreeWalker.f21109k.post(TreeWalker.f21110l);
                TreeWalker.f21109k.postDelayed(TreeWalker.f21111m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f21118h);
    }

    private void e() {
        this.f21113b = 0;
        this.f21115d.clear();
        this.f21114c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f21114c = true;
                break;
            }
        }
        this.f21118h = f.b();
    }

    public static TreeWalker getInstance() {
        return f21108i;
    }

    private void i() {
        if (f21109k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21109k = handler;
            handler.post(f21110l);
            f21109k.postDelayed(f21111m, 200L);
        }
    }

    private void k() {
        Handler handler = f21109k;
        if (handler != null) {
            handler.removeCallbacks(f21111m);
            f21109k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21112a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f21112a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f21117f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f21116e.a();
        if (this.f21117f.b().size() > 0) {
            Iterator<String> it = this.f21117f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f21117f.a(next), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f21117f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            treeWalker.g.b(jSONObjectA2, treeWalker.f21117f.c(), jB);
            if (treeWalker.f21114c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it2 = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f21115d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.g.b();
        }
        treeWalker.f21117f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f21112a.clear();
        j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21112a.contains(treeWalkerTimeLogger)) {
            this.f21112a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j8) {
        if (this.f21112a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f21112a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21113b, TimeUnit.NANOSECONDS.toMillis(j8));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21113b, j8);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strD = this.f21117f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f21117f.f(view)));
        this.f21117f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z3) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z3);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0130a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z3) throws JSONException {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f21117f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z10 = z3 || a(view, jSONObjectA);
                if (this.f21114c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z10) {
                    this.f21115d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z10);
            }
            treeWalker.f21113b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f21116e.b();
        String strB = this.f21117f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0132a c0132aC = this.f21117f.c(view);
        if (c0132aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0132aC);
        return true;
    }
}
