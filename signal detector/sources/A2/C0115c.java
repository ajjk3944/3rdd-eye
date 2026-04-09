package A2;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import c5.InterfaceC0405b;
import com.google.android.gms.internal.ads.AbstractC1049da;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C0436Bf;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC1970uf;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Xu;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import f4.InterfaceFutureC2326a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import n0.AbstractC2680b;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: A2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115c implements BD, O0.a, M1.b, InterfaceC0405b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234a;

    /* renamed from: b, reason: collision with root package name */
    public Object f235b;

    /* renamed from: c, reason: collision with root package name */
    public Object f236c;

    /* renamed from: d, reason: collision with root package name */
    public Object f237d;

    /* renamed from: e, reason: collision with root package name */
    public Object f238e;

    /* renamed from: f, reason: collision with root package name */
    public Object f239f;

    public /* synthetic */ C0115c() {
        this.f234a = 4;
    }

    public static HashSet c() {
        com.bykv.vk.openvk.emc.emc.emc.xq.b bVar;
        com.bykv.vk.openvk.emc.emc.emc.xq.b bVar2;
        HashSet hashSet = new HashSet();
        for (S1.a aVar : S1.a.f3474e.values()) {
            if (aVar != null && (bVar2 = aVar.f3478d) != null) {
                hashSet.add(R3.b.A(bVar2.bw(), bVar2.aa()).getAbsolutePath());
                hashSet.add(R3.b.z(bVar2.bw(), bVar2.aa()).getAbsolutePath());
            }
        }
        for (U1.c cVar : U1.a.f3688a.values()) {
            if (cVar != null && (bVar = cVar.f3693b) != null) {
                hashSet.add(R3.b.A(bVar.bw(), bVar.aa()).getAbsolutePath());
                hashSet.add(R3.b.z(bVar.bw(), bVar.aa()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    public synchronized void a() {
        try {
            ArrayList arrayListF = f();
            int size = arrayListF.size();
            HashSet hashSetC = null;
            int i = 0;
            while (i < size) {
                Object obj = arrayListF.get(i);
                i++;
                M1.a aVar = (M1.a) obj;
                File[] fileArr = aVar.f2703a;
                if (fileArr != null && fileArr.length >= aVar.f2704b) {
                    if (hashSetC == null) {
                        hashSetC = c();
                    }
                    int i3 = aVar.f2704b - 2;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    File[] fileArr2 = aVar.f2703a;
                    if (i3 >= 0 && fileArr2 != null) {
                        try {
                            if (fileArr2.length > i3) {
                                List listAsList = Arrays.asList(fileArr2);
                                Collections.sort(listAsList, new E.h(3));
                                while (i3 < listAsList.size()) {
                                    if (!hashSetC.contains(((File) listAsList.get(i3)).getAbsolutePath())) {
                                        ((File) listAsList.get(i3)).delete();
                                    }
                                    i3++;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String b() {
        if (((String) this.f236c) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f235b);
            this.f236c = A.f.p(sb, File.separator, "video_reward_full");
            File file = new File((String) this.f236c);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f236c;
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        InterfaceC1970uf interfaceC1970uf = (InterfaceC1970uf) this.f237d;
        Su su = (Su) this.f238e;
        InterfaceFutureC2326a interfaceFutureC2326a = (InterfaceFutureC2326a) this.f235b;
        BinderC0126n binderC0126n = (BinderC0126n) this.f239f;
        AtomicBoolean atomicBoolean = binderC0126n.f284Q;
        w wVar = (w) obj;
        Xu xuT3 = BinderC0126n.T3(interfaceFutureC2326a, (C0436Bf) this.f236c);
        atomicBoolean.set(true);
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.w8)).booleanValue()) {
            if (interfaceC1970uf != null) {
                try {
                    interfaceC1970uf.v("QueryInfo generation has been disabled.");
                } catch (RemoteException e6) {
                    u2.k.e("QueryInfo generation has been disabled.".concat(e6.toString()));
                }
            }
            if (!((Boolean) AbstractC1049da.f13770e.v()).booleanValue() || xuT3 == null) {
                return;
            }
            su.g("QueryInfo generation has been disabled.");
            su.b(false);
            xuT3.a(su);
            xuT3.h();
            return;
        }
        try {
            try {
                if (wVar == null) {
                    if (interfaceC1970uf != null) {
                        interfaceC1970uf.F3(null, null, null);
                    }
                    su.b(true);
                    if (!((Boolean) AbstractC1049da.f13770e.v()).booleanValue() || xuT3 == null) {
                        return;
                    }
                    xuT3.a(su);
                    xuT3.h();
                    return;
                }
                try {
                    String str = wVar.f340a;
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(wVar.f342c) ? new JSONObject(wVar.f342c) : new JSONObject(wVar.f341b)).optString("request_id", ""))) {
                        u2.k.h("The request ID is empty in request JSON.");
                        if (interfaceC1970uf != null) {
                            interfaceC1970uf.v("Internal error: request ID is empty in request JSON.");
                        }
                        su.g("Request ID empty");
                        su.b(false);
                        if (!((Boolean) AbstractC1049da.f13770e.v()).booleanValue() || xuT3 == null) {
                            return;
                        }
                        xuT3.a(su);
                        xuT3.h();
                        return;
                    }
                    Bundle bundle = wVar.f345f;
                    boolean z6 = binderC0126n.f273E;
                    String str2 = binderC0126n.f274F;
                    String str3 = binderC0126n.f275G;
                    if (z6 && bundle != null && bundle.getInt(str3, -1) == -1) {
                        bundle.putInt(str3, binderC0126n.f276H.get());
                    }
                    if (binderC0126n.f272D && bundle != null && TextUtils.isEmpty(bundle.getString(str2))) {
                        if (TextUtils.isEmpty(binderC0126n.f278J)) {
                            binderC0126n.f278J = p2.j.f22785C.f22790c.F(binderC0126n.f290c, binderC0126n.f277I.f23784a);
                        }
                        bundle.putString(str2, binderC0126n.f278J);
                    }
                    if (interfaceC1970uf != null) {
                        if (TextUtils.isEmpty(wVar.f342c)) {
                            interfaceC1970uf.F3(str, bundle, wVar.f341b);
                        } else {
                            interfaceC1970uf.F3(str, bundle, wVar.f342c);
                        }
                    }
                    su.b(true);
                    if (!((Boolean) AbstractC1049da.f13770e.v()).booleanValue() || xuT3 == null) {
                        return;
                    }
                    xuT3.a(su);
                    xuT3.h();
                } catch (JSONException e7) {
                    u2.k.h("Failed to create JSON object from the request string.");
                    if (interfaceC1970uf != null) {
                        String string = e7.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(string);
                        interfaceC1970uf.v(sb.toString());
                    }
                    su.d(e7);
                    su.b(false);
                    p2.j.f22785C.f22795h.f("SignalGeneratorImpl.generateSignals.onSuccess", e7);
                    if (!((Boolean) AbstractC1049da.f13770e.v()).booleanValue() || xuT3 == null) {
                        return;
                    }
                    xuT3.a(su);
                    xuT3.h();
                }
            } catch (RemoteException e8) {
                su.d(e8);
                su.b(false);
                u2.k.f("", e8);
                p2.j.f22785C.f22795h.f("SignalGeneratorImpl.generateSignals.onSuccess", e8);
                if (!((Boolean) AbstractC1049da.f13770e.v()).booleanValue() || xuT3 == null) {
                    return;
                }
                xuT3.a(su);
                xuT3.h();
            }
        } catch (Throwable th) {
            if (((Boolean) AbstractC1049da.f13770e.v()).booleanValue() && xuT3 != null) {
                xuT3.a(su);
                xuT3.h();
            }
            throw th;
        }
    }

    public String e() {
        if (((String) this.f239f) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f235b);
            this.f239f = A.f.p(sb, File.separator, "video_default");
            File file = new File((String) this.f239f);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f239f;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new M1.a(new File(b()).listFiles(), d5.y.f19831b));
        arrayList.add(new M1.a(new File(g()).listFiles(), d5.y.f19830a));
        if (((String) this.f237d) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f235b);
            this.f237d = A.f.p(sb, File.separator, "video_brand");
            File file = new File((String) this.f237d);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        arrayList.add(new M1.a(new File((String) this.f237d).listFiles(), d5.y.f19832c));
        arrayList.add(new M1.a(new File(e()).listFiles(), d5.y.f19833d));
        return arrayList;
    }

    public String g() {
        if (((String) this.f238e) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f235b);
            this.f238e = A.f.p(sb, File.separator, "video_splash");
            File file = new File((String) this.f238e);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f238e;
    }

    @Override // O0.a
    public View getRoot() {
        switch (this.f234a) {
            case 1:
                return (LinearLayoutCompat) this.f235b;
            case 2:
                return (ConstraintLayout) this.f235b;
            default:
                return (RelativeLayout) this.f235b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [p5.a, q5.j] */
    /* JADX WARN: Type inference failed for: r2v1, types: [p5.a, q5.j] */
    @Override // c5.InterfaceC0405b
    public Object getValue() {
        X x6 = (X) this.f239f;
        if (x6 != null) {
            return x6;
        }
        a0 a0Var = (a0) ((q5.j) this.f236c).b();
        Z z6 = (Z) ((p5.a) this.f237d).b();
        AbstractC2680b abstractC2680b = (AbstractC2680b) ((q5.j) this.f238e).b();
        q5.i.e(a0Var, "store");
        q5.i.e(z6, "factory");
        q5.i.e(abstractC2680b, "extras");
        V2.e eVar = new V2.e(a0Var, z6, abstractC2680b);
        q5.d dVar = (q5.d) this.f235b;
        String strS = com.bumptech.glide.d.s(dVar);
        if (strS == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        X xQ = eVar.q(dVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS));
        this.f239f = xQ;
        return xQ;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.C8)).booleanValue()) {
            p2.j.f22785C.f22795h.g("SignalGeneratorImpl.generateSignals", th);
        } else {
            p2.j.f22785C.f22795h.f("SignalGeneratorImpl.generateSignals", th);
        }
        Xu xuT3 = BinderC0126n.T3((InterfaceFutureC2326a) this.f235b, (C0436Bf) this.f236c);
        if (((Boolean) AbstractC1049da.f13770e.v()).booleanValue() && xuT3 != null) {
            Su su = (Su) this.f238e;
            su.d(th);
            su.b(false);
            xuT3.a(su);
            xuT3.h();
        }
        InterfaceC1970uf interfaceC1970uf = (InterfaceC1970uf) this.f237d;
        if (interfaceC1970uf == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            interfaceC1970uf.v(message);
        } catch (RemoteException e6) {
            u2.k.f("", e6);
        }
    }

    public /* synthetic */ C0115c(ViewGroup viewGroup, AppBarLayout appBarLayout, FrameLayout frameLayout, View view, Toolbar toolbar, int i) {
        this.f234a = i;
        this.f235b = viewGroup;
        this.f236c = appBarLayout;
        this.f237d = frameLayout;
        this.f238e = view;
        this.f239f = toolbar;
    }

    public C0115c(BinderC0126n binderC0126n, InterfaceFutureC2326a interfaceFutureC2326a, C0436Bf c0436Bf, InterfaceC1970uf interfaceC1970uf, Su su) {
        this.f234a = 0;
        this.f235b = interfaceFutureC2326a;
        this.f236c = c0436Bf;
        this.f237d = interfaceC1970uf;
        this.f238e = su;
        this.f239f = binderC0126n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0115c(q5.d dVar, p5.a aVar, p5.a aVar2, p5.a aVar3) {
        this.f234a = 5;
        this.f235b = dVar;
        this.f236c = (q5.j) aVar;
        this.f237d = aVar2;
        this.f238e = (q5.j) aVar3;
    }

    public C0115c(RelativeLayout relativeLayout, MaterialButton materialButton, RecyclerView recyclerView, MaterialButton materialButton2, View view, View view2) {
        this.f234a = 3;
        this.f235b = relativeLayout;
        this.f236c = recyclerView;
        this.f237d = materialButton2;
        this.f238e = view;
        this.f239f = view2;
    }
}
