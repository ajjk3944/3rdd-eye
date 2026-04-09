package C0;

import a0.C0244C;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.InterfaceC0298u;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.navigation.fragment.NavHostFragment;
import c5.C0410g;
import c5.C0412i;
import com.apm.insight.R;
import d5.C2280h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import k0.K;
import q0.C2787A;
import q0.C2794g;
import q0.C2795h;
import q0.C2796i;
import q0.M;
import s0.C2883d;
import s0.C2885f;

/* loaded from: classes.dex */
public final class y extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, Object obj) {
        super(0);
        this.f1131b = i;
        this.f1132c = obj;
    }

    @Override // p5.a
    public final Object b() {
        H0.g gVar;
        ArrayList<String> arrayList;
        C0300w c0300wJ;
        switch (this.f1131b) {
            case 0:
                z zVar = (z) this.f1132c;
                String strB = zVar.b();
                p pVar = (p) zVar.f1133a;
                pVar.getClass();
                pVar.a();
                pVar.b();
                return pVar.g().i().d(strB);
            case 1:
                H0.h hVar = (H0.h) this.f1132c;
                s sVar = hVar.f1747c;
                Context context = hVar.f1745a;
                String str = hVar.f1746b;
                if (str == null || !hVar.f1748d) {
                    gVar = new H0.g(context, str, new H0.d(), sVar);
                } else {
                    q5.i.e(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    q5.i.d(noBackupFilesDir, "context.noBackupFilesDir");
                    gVar = new H0.g(context, new File(noBackupFilesDir, str).getAbsolutePath(), new H0.d(), sVar);
                }
                gVar.setWriteAheadLoggingEnabled(hVar.f1750f);
                return gVar;
            case 2:
                File file = (File) ((C0244C) this.f1132c).f4553a.b();
                String absolutePath = file.getAbsolutePath();
                synchronized (C0244C.i) {
                    LinkedHashSet linkedHashSet = C0244C.f4552h;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    q5.i.d(absolutePath, "it");
                    linkedHashSet.add(absolutePath);
                }
                return file;
            case 3:
                return Q.g((b0) this.f1132c);
            case 4:
                C2794g c2794g = (C2794g) this.f1132c;
                Context context2 = c2794g.f22964a;
                Context applicationContext = context2 != null ? context2.getApplicationContext() : null;
                return new U(applicationContext instanceof Application ? (Application) applicationContext : null, c2794g, c2794g.a());
            case 5:
                q0.z zVar2 = (q0.z) this.f1132c;
                return new C2787A(zVar2.f23055a, zVar2.f23074u);
            case 6:
                C2796i c2796i = (C2796i) this.f1132c;
                Iterator it = ((Iterable) ((C5.o) c2796i.f22983f.f73b).I()).iterator();
                while (it.hasNext()) {
                    c2796i.b((C2794g) it.next());
                }
                return C0412i.f5929a;
            default:
                NavHostFragment navHostFragment = (NavHostFragment) this.f1132c;
                Context contextM = navHostFragment.m();
                if (contextM == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                q0.z zVar3 = new q0.z(contextM);
                C0410g c0410g = zVar3.f23053B;
                F0.c cVar = zVar3.f23071r;
                if (!navHostFragment.equals(zVar3.f23067n)) {
                    InterfaceC0298u interfaceC0298u = zVar3.f23067n;
                    if (interfaceC0298u != null && (c0300wJ = interfaceC0298u.j()) != null) {
                        c0300wJ.f(cVar);
                    }
                    zVar3.f23067n = navHostFragment;
                    navHostFragment.b0.a(cVar);
                }
                a0 a0VarD = navHostFragment.d();
                if (!q5.i.a(zVar3.f23068o, R3.b.n(a0VarD))) {
                    if (!zVar3.f23061g.isEmpty()) {
                        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                    }
                    zVar3.f23068o = R3.b.n(a0VarD);
                }
                M m6 = zVar3.f23074u;
                Context contextR = navHostFragment.R();
                K kL = navHostFragment.l();
                q5.i.d(kL, "childFragmentManager");
                m6.a(new C2883d(contextR, kL));
                Context contextR2 = navHostFragment.R();
                K kL2 = navHostFragment.l();
                q5.i.d(kL2, "childFragmentManager");
                int i = navHostFragment.f21688K;
                if (i == 0 || i == -1) {
                    i = R.id.nav_host_fragment_container;
                }
                m6.a(new C2885f(contextR2, kL2, i));
                Bundle bundleC = ((F0.f) navHostFragment.f21713f0.f139b).c("android-support-nav:fragment:navControllerState");
                if (bundleC != null) {
                    LinkedHashMap linkedHashMap = zVar3.f23066m;
                    bundleC.setClassLoader(contextM.getClassLoader());
                    zVar3.f23058d = bundleC.getBundle("android-support-nav:controller:navigatorState");
                    zVar3.f23059e = bundleC.getParcelableArray("android-support-nav:controller:backStack");
                    linkedHashMap.clear();
                    int[] intArray = bundleC.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i3 = 0;
                        int i6 = 0;
                        while (i3 < length) {
                            zVar3.f23065l.put(Integer.valueOf(intArray[i3]), stringArrayList.get(i6));
                            i3++;
                            i6++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        int size = stringArrayList2.size();
                        int i7 = 0;
                        while (i7 < size) {
                            String str2 = stringArrayList2.get(i7);
                            i7++;
                            String str3 = str2;
                            Parcelable[] parcelableArray = bundleC.getParcelableArray("android-support-nav:controller:backStackStates:" + str3);
                            if (parcelableArray != null) {
                                q5.i.d(str3, "id");
                                C2280h c2280h = new C2280h(parcelableArray.length);
                                int i8 = 0;
                                while (true) {
                                    if (i8 < parcelableArray.length) {
                                        int i9 = i8 + 1;
                                        try {
                                            Parcelable parcelable = parcelableArray[i8];
                                            q5.i.c(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                            c2280h.addLast((C2795h) parcelable);
                                            i8 = i9;
                                            stringArrayList2 = stringArrayList2;
                                        } catch (ArrayIndexOutOfBoundsException e6) {
                                            throw new NoSuchElementException(e6.getMessage());
                                        }
                                    } else {
                                        arrayList = stringArrayList2;
                                        linkedHashMap.put(str3, c2280h);
                                    }
                                }
                            } else {
                                arrayList = stringArrayList2;
                            }
                            stringArrayList2 = arrayList;
                        }
                    }
                    zVar3.f23060f = bundleC.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                ((F0.f) navHostFragment.f21713f0.f139b).f("android-support-nav:fragment:navControllerState", new androidx.lifecycle.M(2, zVar3));
                Bundle bundleC2 = ((F0.f) navHostFragment.f21713f0.f139b).c("android-support-nav:fragment:graphId");
                if (bundleC2 != null) {
                    navHostFragment.f5270m0 = bundleC2.getInt("android-support-nav:fragment:graphId");
                }
                ((F0.f) navHostFragment.f21713f0.f139b).f("android-support-nav:fragment:graphId", new androidx.lifecycle.M(3, navHostFragment));
                int i10 = navHostFragment.f5270m0;
                if (i10 != 0) {
                    zVar3.s(((C2787A) c0410g.getValue()).b(i10), null);
                } else {
                    Bundle bundle = navHostFragment.f21712f;
                    int i11 = bundle != null ? bundle.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle2 = bundle != null ? bundle.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i11 != 0) {
                        zVar3.s(((C2787A) c0410g.getValue()).b(i11), bundle2);
                    }
                }
                return zVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C2794g c2794g, C2796i c2796i) {
        super(0);
        this.f1131b = 6;
        this.f1132c = c2796i;
    }
}
