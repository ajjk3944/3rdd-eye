package ah;

import android.text.TextUtils;
import android.widget.Toast;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.ProActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rl.e0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements si.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f380a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f381b;

    /* renamed from: c, reason: collision with root package name */
    public Object f382c;

    /* renamed from: d, reason: collision with root package name */
    public Object f383d;

    public f() {
        this.f380a = true;
    }

    public rl.h a() {
        return new rl.h(this.f380a, this.f381b, (String[]) this.f382c, (String[]) this.f383d);
    }

    public void b(String... strArr) {
        nk.k.e(strArr, "cipherSuites");
        if (!this.f380a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        nk.k.d(objArrCopyOf, "copyOf(...)");
        this.f382c = (String[]) objArrCopyOf;
    }

    @Override // si.g
    public void c() {
        h(Collections.EMPTY_LIST);
    }

    public void d(rl.g... gVarArr) {
        nk.k.e(gVarArr, "cipherSuites");
        if (!this.f380a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(gVarArr.length);
        for (rl.g gVar : gVarArr) {
            arrayList.add(gVar.f33083a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void e(String... strArr) {
        nk.k.e(strArr, "tlsVersions");
        if (!this.f380a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        nk.k.d(objArrCopyOf, "copyOf(...)");
        this.f383d = (String[]) objArrCopyOf;
    }

    public void f(e0... e0VarArr) {
        if (!this.f380a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(e0VarArr.length);
        for (e0 e0Var : e0VarArr) {
            arrayList.add(e0Var.f33064a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // si.g
    public void h(List list) {
        ProActivity proActivity = (ProActivity) this.f383d;
        String str = (String) this.f382c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, ((si.c) it.next()).f33798a)) {
                o.f400d.a();
                return;
            }
        }
        if (this.f380a) {
            int i4 = ProActivity.L;
            o.f400d.d(proActivity, new si.f(str), 1, new p6.i(proActivity));
        } else if (this.f381b) {
            Toast.makeText(proActivity, R.string.no_sku_history, 0).show();
        }
    }

    public f(ProActivity proActivity, String str, boolean z3, boolean z10) {
        this.f383d = proActivity;
        this.f382c = str;
        this.f380a = z3;
        this.f381b = z10;
    }
}
