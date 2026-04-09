package z6;

import E.u;
import b9.C2001h;
import b9.l;
import b9.p;
import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import y9.q;

/* compiled from: DivStatePath.kt */
/* renamed from: z6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5865d {

    /* renamed from: a, reason: collision with root package name */
    public final long f48458a;

    /* renamed from: b, reason: collision with root package name */
    public final List<l<String, String>> f48459b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f48460c;

    /* renamed from: d, reason: collision with root package name */
    public final p f48461d;

    /* renamed from: e, reason: collision with root package name */
    public final p f48462e;

    /* compiled from: DivStatePath.kt */
    /* renamed from: z6.d$a */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static List a(List list, List list2, boolean z10) {
            Iterator it = list2.iterator();
            int size = 0;
            while (it.hasNext()) {
                l lVar = (l) it.next();
                int size2 = list.size() - 1;
                while (true) {
                    if (size >= size2) {
                        size = list.size();
                        break;
                    }
                    if (kotlin.jvm.internal.l.b(list.get(size), (String) lVar.f18083b)) {
                        int i = size + 1;
                        if (kotlin.jvm.internal.l.b(list.get(i), (String) lVar.f18084c)) {
                            size = i;
                            break;
                        }
                    }
                    size++;
                }
            }
            if (z10) {
                size++;
            }
            return list.subList(0, size);
        }

        public static C5865d b(String path) throws NumberFormatException, h {
            kotlin.jvm.internal.l.f(path, "path");
            ArrayList arrayList = new ArrayList();
            List listR0 = q.r0(path, new String[]{"/"});
            try {
                long j4 = Long.parseLong((String) listR0.get(0));
                if (listR0.size() % 2 != 1) {
                    throw new h("Must be even number of states in path: ".concat(path), null);
                }
                v9.e eVarN = v9.h.N(v9.h.O(1, listR0.size()), 2);
                int i = eVarN.f47096b;
                int i10 = eVarN.f47097c;
                int i11 = eVarN.f47098d;
                if ((i11 > 0 && i <= i10) || (i11 < 0 && i10 <= i)) {
                    while (true) {
                        arrayList.add(new l(listR0.get(i), listR0.get(i + 1)));
                        if (i == i10) {
                            break;
                        }
                        i += i11;
                    }
                }
                return new C5865d(j4, arrayList, listR0);
            } catch (NumberFormatException e4) {
                throw new h("Top level id must be number: ".concat(path), e4);
            }
        }
    }

    /* compiled from: DivStatePath.kt */
    /* renamed from: z6.d$b */
    public static final class b extends m implements InterfaceC5480a<String> {
        public b() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final String invoke() {
            return C2097r.u0(C5865d.this.f48460c, "/", null, null, null, 62);
        }
    }

    /* compiled from: DivStatePath.kt */
    /* renamed from: z6.d$c */
    public static final class c extends m implements InterfaceC5480a<String> {
        public c() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p9.InterfaceC5480a
        public final String invoke() {
            C5865d c5865d = C5865d.this;
            boolean zIsEmpty = c5865d.f48459b.isEmpty();
            long j4 = c5865d.f48458a;
            if (zIsEmpty) {
                return String.valueOf(j4);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(j4);
            sb.append('/');
            List<l<String, String>> list = c5865d.f48459b;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                C2095p.b0(C2092m.W((String) lVar.f18083b, (String) lVar.f18084c), arrayList);
            }
            sb.append(C2097r.u0(arrayList, "/", null, null, null, 62));
            return sb.toString();
        }
    }

    public C5865d(long j4, List<l<String, String>> states, List<String> path) {
        kotlin.jvm.internal.l.f(states, "states");
        kotlin.jvm.internal.l.f(path, "path");
        this.f48458a = j4;
        this.f48459b = states;
        this.f48460c = path;
        this.f48461d = C2001h.b(new b());
        this.f48462e = C2001h.b(new c());
    }

    public final C5865d a(String str, String stateId) {
        kotlin.jvm.internal.l.f(stateId, "stateId");
        List<l<String, String>> list = this.f48459b;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(new l(str, stateId));
        List<String> list2 = this.f48460c;
        ArrayList arrayList2 = new ArrayList(list2.size() + 1);
        arrayList2.addAll(list2);
        arrayList2.add(stateId);
        return new C5865d(this.f48458a, arrayList, arrayList2);
    }

    public final String b() {
        return (String) this.f48461d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String c() {
        List<l<String, String>> list = this.f48459b;
        if (list.isEmpty()) {
            return null;
        }
        return ((String) new C5865d(this.f48458a, list.subList(0, list.size() - 1)).f48462e.getValue()) + '/' + ((String) ((l) C2097r.v0(list)).f18083b);
    }

    public final C5865d d() {
        List<l<String, String>> list = this.f48459b;
        if (list.isEmpty()) {
            return this;
        }
        ArrayList arrayListI0 = C2097r.I0(list);
        arrayListI0.remove(C2092m.V(arrayListI0));
        return new C5865d(this.f48458a, arrayListI0, a.a(this.f48460c, list, false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5865d)) {
            return false;
        }
        C5865d c5865d = (C5865d) obj;
        return this.f48458a == c5865d.f48458a && kotlin.jvm.internal.l.b(this.f48459b, c5865d.f48459b) && kotlin.jvm.internal.l.b(this.f48460c, c5865d.f48460c);
    }

    public final int hashCode() {
        long j4 = this.f48458a;
        return this.f48460c.hashCode() + ((this.f48459b.hashCode() + (((int) (j4 ^ (j4 >>> 32))) * 31)) * 31);
    }

    public final String toString() {
        return b();
    }

    public /* synthetic */ C5865d(long j4, List list) {
        this(j4, list, u.G(String.valueOf(j4)));
    }
}
