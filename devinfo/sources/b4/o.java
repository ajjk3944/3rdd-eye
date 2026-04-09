package b4;

import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.OverScroller;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.ud0;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.appbar.AppBarLayout;
import com.liuzh.deviceinfo.card.CpuCard;
import ec.j3;
import ec.n4;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1704a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1705b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1706c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1707d;

    public /* synthetic */ o() {
        this.f1704a = 0;
    }

    private final void a() {
        String str = (String) this.f1706c;
        Pair[] pairArr = (Pair[]) this.f1707d;
        ud0 ud0Var = (ud0) this.f1705b;
        ud0Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(ud0Var.f17174a);
        if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str)) {
            concurrentHashMap.put("action", str);
        }
        for (Pair pair : pairArr) {
            String str2 = (String) pair.first;
            String str3 = (String) pair.second;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                concurrentHashMap.put(str2, str3);
            }
        }
        ud0Var.a(concurrentHashMap, false);
    }

    private final void b() throws IOException {
        ScrollView scrollView = (ScrollView) this.f1705b;
        TextView textView = (TextView) this.f1706c;
        aj.d dVar = new aj.d(19, scrollView, textView);
        File file = new File("/proc/cpuinfo");
        if (!file.exists()) {
            bi.d.b(new aj.d(20, dVar, textView));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String str = "<font color='" + (i0.n(((CpuCard) ((aa.j) this.f1707d).f283b).getContext()) ? "#F2F2F2" : "#3F3F3F") + "'>";
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split(":", 2);
                    if (strArrSplit.length == 2) {
                        sb2.append(str);
                        sb2.append(strArrSplit[0]);
                        sb2.append("</font>");
                        sb2.append(":");
                        sb2.append(strArrSplit[1]);
                    } else {
                        sb2.append(line);
                    }
                    sb2.append("<br>");
                }
                bufferedReader.close();
            } finally {
            }
        } catch (IOException unused) {
        } catch (OutOfMemoryError e2) {
            bi.d.b(new b5.e(dVar, textView, e2, 23));
        }
        String string = sb2.toString();
        bi.d.b(new b5.e(dVar, textView, Build.VERSION.SDK_INT >= 24 ? j4.f(string) : Html.fromHtml(string), 24));
    }

    private final void c() {
        OverScroller overScroller;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f1705b;
        kc.c cVar = (kc.c) this.f1707d;
        View view = (View) this.f1706c;
        if (view == null || (overScroller = cVar.f28129d) == null) {
            return;
        }
        if (overScroller.computeScrollOffset()) {
            cVar.A(coordinatorLayout, view, cVar.f28129d.getCurrY());
            view.postOnAnimation(this);
            return;
        }
        AppBarLayout appBarLayout = (AppBarLayout) view;
        ((AppBarLayout.BaseBehavior) cVar).G(coordinatorLayout, appBarLayout);
        if (appBarLayout.f20293k) {
            appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
        }
    }

    private final void d() throws InterruptedException {
        qe.c cVar = (qe.c) this.f1707d;
        je.b bVar = (je.b) this.f1705b;
        cVar.b(bVar, (TaskCompletionSource) this.f1706c);
        ((AtomicInteger) cVar.f32284i.f37324b).set(0);
        double dMin = Math.min(3600000.0d, Math.pow(cVar.f32278b, cVar.a()) * (60000.0d / cVar.f32277a));
        String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + bVar.f27536b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        try {
            Thread.sleep((long) dMin);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0507  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.o.run():void");
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i4) {
        this.f1704a = i4;
        this.f1705b = obj2;
        this.f1706c = obj3;
        this.f1707d = obj;
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, boolean z3, int i4) {
        this.f1704a = i4;
        this.f1705b = obj;
        this.f1706c = obj2;
        this.f1707d = obj3;
    }

    public o(j3 j3Var, AtomicReference atomicReference, n4 n4Var) {
        this.f1704a = 9;
        this.f1705b = atomicReference;
        this.f1706c = n4Var;
        Objects.requireNonNull(j3Var);
        this.f1707d = j3Var;
    }
}
