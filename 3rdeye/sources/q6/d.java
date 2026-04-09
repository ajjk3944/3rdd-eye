package Q6;

import N7.U3;
import b9.C1992A;
import c9.C2099t;
import i6.C4458a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ErrorCollectors.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f11323a;

    public d(int i) {
        switch (i) {
            case 1:
                this.f11323a = new LinkedHashMap();
                break;
            default:
                this.f11323a = new LinkedHashMap();
                break;
        }
    }

    public c a(U3 u32, C4458a tag) {
        List<? extends Throwable> list;
        c cVar;
        kotlin.jvm.internal.l.f(tag, "tag");
        synchronized (this.f11323a) {
            try {
                LinkedHashMap linkedHashMap = this.f11323a;
                String str = tag.f38455a;
                Object cVar2 = linkedHashMap.get(str);
                if (cVar2 == null) {
                    cVar2 = new c();
                    linkedHashMap.put(str, cVar2);
                }
                c cVar3 = (c) cVar2;
                if (u32 == null || (list = u32.f6381h) == null) {
                    list = C2099t.f18581b;
                }
                cVar3.f11319c = list;
                cVar3.b();
                cVar = (c) cVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public c b(U3 u32, C4458a tag) {
        c cVar;
        List<? extends Throwable> list;
        kotlin.jvm.internal.l.f(tag, "tag");
        synchronized (this.f11323a) {
            cVar = (c) this.f11323a.get(tag.f38455a);
            if (cVar != null) {
                if (u32 == null || (list = u32.f6381h) == null) {
                    list = C2099t.f18581b;
                }
                cVar.f11319c = list;
                cVar.b();
            } else {
                cVar = null;
            }
        }
        return cVar;
    }

    public String c(String str, String path) {
        String str2;
        kotlin.jvm.internal.l.f(path, "path");
        synchronized (this.f11323a) {
            Map map = (Map) this.f11323a.get(str);
            str2 = map != null ? (String) map.get(path) : null;
        }
        return str2;
    }

    public void d(String str, String str2, String str3) {
        synchronized (this.f11323a) {
            try {
                LinkedHashMap linkedHashMap = this.f11323a;
                Object linkedHashMap2 = linkedHashMap.get(str);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(str, linkedHashMap2);
                }
                ((Map) linkedHashMap2).put(str2, str3);
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
