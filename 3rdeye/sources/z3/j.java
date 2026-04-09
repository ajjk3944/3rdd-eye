package z3;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry.java */
/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f48447a;

    /* renamed from: b, reason: collision with root package name */
    public final i f48448b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f48449c;

    /* compiled from: MetadataBackendRegistry.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f48450a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, String> f48451b = null;

        public a(Context context) {
            this.f48450a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final z3.d a(java.lang.String r15) throws android.content.pm.PackageManager.NameNotFoundException {
            /*
                Method dump skipped, instructions count: 272
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z3.j.a.a(java.lang.String):z3.d");
        }
    }

    public j(Context context, i iVar) {
        a aVar = new a(context);
        this.f48449c = new HashMap();
        this.f48447a = aVar;
        this.f48448b = iVar;
    }

    @Override // z3.e
    public final synchronized k get(String str) {
        if (this.f48449c.containsKey(str)) {
            return (k) this.f48449c.get(str);
        }
        d dVarA = this.f48447a.a(str);
        if (dVarA == null) {
            return null;
        }
        i iVar = this.f48448b;
        k kVarCreate = dVarA.create(new c(iVar.f48444a, iVar.f48445b, iVar.f48446c, str));
        this.f48449c.put(str, kVarCreate);
        return kVarCreate;
    }
}
