package h8;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.nads.nsdk.WADModel;
import java.util.ArrayList;
import z6.d;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f21444c;

    /* renamed from: a, reason: collision with root package name */
    public int f21445a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f21446b = 0;

    public static synchronized a f() {
        try {
            if (f21444c == null) {
                f21444c = new a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f21444c;
    }

    public final d.c a(String str, String str2) {
        d.c cVar = new d.c();
        cVar.d(str);
        if (!TextUtils.isEmpty(str2)) {
            cVar.c(str2);
        }
        return cVar;
    }

    public void b() {
        this.f21446b++;
    }

    public void c() {
        this.f21445a++;
    }

    public int d() {
        return this.f21446b;
    }

    public int e() {
        return this.f21445a;
    }

    public void g(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(a("wifi_info", "ca-app-pub-8364346218942106/8838749178"));
        arrayList.add(a("wifi_finfo", "ca-app-pub-8364346218942106/2628564048"));
        z6.d.e().f(context, arrayList);
    }

    public void h(Context context, FrameLayout frameLayout, String str, WADModel wADModel, boolean z10, a7.a aVar) {
        if (frameLayout == null) {
            return;
        }
        z6.e eVar = new z6.e(context);
        eVar.m(frameLayout);
        eVar.j(wADModel);
        eVar.l(str);
        eVar.k(z10);
        eVar.i(aVar);
        z6.d.e().g(eVar);
    }

    public void i(int i10) {
        this.f21446b = i10;
    }

    public void j(int i10) {
        this.f21445a = i10;
    }
}
