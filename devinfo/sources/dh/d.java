package dh;

import al.i;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.lifecycle.l0;
import b7.r;
import com.liuzh.deviceinfo.DeviceInfoApp;
import ek.j;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import sg.h;
import xk.v;
import yj.u;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, ck.c cVar, int i4) {
        super(2, cVar);
        this.f22257b = i4;
        this.f22258c = obj;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f22257b) {
            case 0:
                return new d((g) this.f22258c, cVar, 0);
            case 1:
                return new d((r) this.f22258c, cVar, 1);
            case 2:
                return new d((String) this.f22258c, cVar, 2);
            case 3:
                return new d((gh.e) this.f22258c, cVar, 3);
            case 4:
                return new d((ih.c) this.f22258c, cVar, 4);
            case 5:
                return new d((sf.g) this.f22258c, cVar, 5);
            default:
                return new d((sg.f) this.f22258c, cVar, 6);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) throws PackageManager.NameNotFoundException {
        switch (this.f22257b) {
            case 0:
                d dVar = (d) create((i) obj, (ck.c) obj2);
                u uVar = u.f37649a;
                dVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                d dVar2 = (d) create((x6.c) obj, (ck.c) obj2);
                u uVar2 = u.f37649a;
                dVar2.invokeSuspend(uVar2);
                return uVar2;
            case 2:
                return ((d) create((v) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
            case 3:
                d dVar3 = (d) create((i) obj, (ck.c) obj2);
                u uVar3 = u.f37649a;
                dVar3.invokeSuspend(uVar3);
                return uVar3;
            case 4:
                d dVar4 = (d) create((i) obj, (ck.c) obj2);
                u uVar4 = u.f37649a;
                dVar4.invokeSuspend(uVar4);
                return uVar4;
            case 5:
                return ((d) create((sf.g) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
            default:
                d dVar5 = (d) create((v) obj, (ck.c) obj2);
                u uVar5 = u.f37649a;
                dVar5.invokeSuspend(uVar5);
                return uVar5;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
        ArrayList arrayList;
        BufferedReader bufferedReader;
        int i4 = this.f22257b;
        u uVar = u.f37649a;
        Object obj2 = this.f22258c;
        switch (i4) {
            case 0:
                ci.b.D(obj);
                r5.c.t(true, ((g) obj2).f22264b);
                return uVar;
            case 1:
                ci.b.D(obj);
                String str = e7.g.f22444a;
                t6.v.e().a(str, "Constraints changed for " + ((r) obj2));
                return uVar;
            case 2:
                ci.b.D(obj);
                String str2 = (String) obj2;
                PackageManager packageManager = DeviceInfoApp.f21145f.getPackageManager();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                    if (packageInfo == null) {
                        return null;
                    }
                    return cm.g.j(packageInfo, packageManager);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 3:
                ci.b.D(obj);
                r5.c.t(true, ((gh.e) obj2).f24736d);
                return uVar;
            case 4:
                ci.b.D(obj);
                r5.c.t(true, ((ih.c) obj2).f25999d);
                return uVar;
            case 5:
                ci.b.D(obj);
                return (sf.g) obj2;
            default:
                sg.f fVar = (sg.f) obj2;
                l0 l0Var = fVar.f33610e;
                l0 l0Var2 = fVar.f33608c;
                ArrayList arrayList2 = fVar.f33607b;
                ci.b.D(obj);
                try {
                    arrayList = new ArrayList();
                    bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("mount").getInputStream()));
                } catch (Throwable unused2) {
                    arrayList2.clear();
                    l0Var2.h(new h(s.f38317a, new ng.b()));
                    l0Var.h(new ng.a(false));
                }
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            arrayList2.clear();
                            arrayList2.addAll(arrayList);
                            l0Var2.h(new h(arrayList, new ng.b()));
                            l0Var.h(new ng.a(false));
                            return uVar;
                        }
                        List listQ0 = vk.i.Q0(line, new String[]{" on "});
                        if (listQ0.size() == 2) {
                            String str3 = (String) listQ0.get(0);
                            List listQ02 = vk.i.Q0((CharSequence) listQ0.get(1), new String[]{" type "});
                            if (listQ02.size() == 2) {
                                String str4 = (String) listQ02.get(0);
                                List listQ03 = vk.i.Q0(vk.i.V0((String) listQ02.get(1)).toString(), new String[]{" "});
                                if (listQ03.size() == 2) {
                                    String str5 = (String) listQ03.get(0);
                                    vg.c cVar = new vg.c(fi.a.f24058a);
                                    if (!cVar.a(str4)) {
                                        cVar = null;
                                    }
                                    arrayList.add(new sg.g(str4, str3, str5, cVar));
                                }
                            }
                        }
                    } finally {
                    }
                }
        }
    }
}
