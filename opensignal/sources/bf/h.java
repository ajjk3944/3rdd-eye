package bf;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import h9.r2;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements eg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2715c;

    public /* synthetic */ h(Object obj, int i10, Object obj2) {
        this.f2713a = i10;
        this.f2714b = obj;
        this.f2715c = obj2;
    }

    @Override // eg.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f2713a) {
            case 0:
                i iVar = (i) this.f2714b;
                c cVar = (c) this.f2715c;
                f fVar = cVar.f2708f;
                r2 r2Var = new r2();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<l> set = cVar.f2705c;
                Set set2 = cVar.f2709g;
                for (l lVar : set) {
                    int i10 = lVar.f2729c;
                    int i11 = lVar.f2728b;
                    boolean z10 = i10 == 0;
                    u uVar = lVar.f2727a;
                    if (z10) {
                        if (i11 == 2) {
                            hashSet4.add(uVar);
                        } else {
                            hashSet.add(uVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(uVar);
                    } else if (i11 == 2) {
                        hashSet5.add(uVar);
                    } else {
                        hashSet2.add(uVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(u.a(bg.b.class));
                }
                r2Var.f10470a = Collections.unmodifiableSet(hashSet);
                r2Var.f10471d = Collections.unmodifiableSet(hashSet2);
                r2Var.f10472g = Collections.unmodifiableSet(hashSet3);
                r2Var.f10473r = Collections.unmodifiableSet(hashSet4);
                r2Var.f10474x = Collections.unmodifiableSet(hashSet5);
                r2Var.f10475y = iVar;
                return fVar.f(r2Var);
            case 1:
                return new cg.l((Context) this.f2714b, (String) this.f2715c);
            default:
                se.f fVar2 = (se.f) this.f2714b;
                Context context = (Context) this.f2715c;
                String strD = fVar2.d();
                jg.a aVar = new jg.a();
                Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + strD, 0);
                boolean z11 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z11 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f13710a = z11;
                return aVar;
        }
    }
}
