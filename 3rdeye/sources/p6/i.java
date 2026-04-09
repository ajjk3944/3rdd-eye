package p6;

import b9.C1992A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.l;
import o6.C5426c;
import y9.n;

/* compiled from: RuntimeTree.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f45230a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f45231b = new LinkedHashMap();

    /* compiled from: RuntimeTree.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C5426c f45232a;

        /* renamed from: b, reason: collision with root package name */
        public final String f45233b;

        /* renamed from: c, reason: collision with root package name */
        public final List<a> f45234c;

        public a() {
            throw null;
        }

        public a(C5426c c5426c, String path) {
            ArrayList arrayList = new ArrayList();
            l.f(path, "path");
            this.f45232a = c5426c;
            this.f45233b = path;
            this.f45234c = arrayList;
        }
    }

    public static void b(a aVar, p9.l lVar) {
        lVar.invoke(aVar);
        Iterator<T> it = aVar.f45234c.iterator();
        while (it.hasNext()) {
            b((a) it.next(), lVar);
        }
    }

    public final void a(C5426c expressionsRuntime, String path, p9.l<? super a, C1992A> callback) {
        l.f(expressionsRuntime, "expressionsRuntime");
        l.f(path, "path");
        l.f(callback, "callback");
        a aVar = (a) this.f45230a.get(expressionsRuntime);
        if (aVar == null) {
            return;
        }
        if (n.a0(aVar.f45233b, path, false)) {
            b(aVar, callback);
            return;
        }
        for (a aVar2 : aVar.f45234c) {
            if (n.a0(aVar2.f45233b, path, false)) {
                b(aVar2, callback);
            }
        }
    }

    public final void c(C5426c c5426c, C5426c c5426c2, String path) {
        a aVar;
        List<a> list;
        l.f(path, "path");
        a aVar2 = new a(c5426c, path);
        this.f45231b.put(path, aVar2);
        LinkedHashMap linkedHashMap = this.f45230a;
        linkedHashMap.put(c5426c, aVar2);
        if (c5426c2 == null || (aVar = (a) linkedHashMap.get(c5426c2)) == null || (list = aVar.f45234c) == null) {
            return;
        }
        list.add(aVar2);
    }
}
