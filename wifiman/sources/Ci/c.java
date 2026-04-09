package Ci;

import Zg.AbstractC3672d;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public interface c extends List, Ci.b, InterfaceC6944a {

    public static final class a {
        public static c a(c cVar, int i10, int i11) {
            return new b(cVar, i10, i11);
        }
    }

    private static final class b extends AbstractC3672d implements c {

        /* renamed from: b, reason: collision with root package name */
        private final c f2756b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2757c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2758d;

        /* renamed from: e, reason: collision with root package name */
        private int f2759e;

        public b(c source, int i10, int i11) {
            AbstractC6492s.i(source, "source");
            this.f2756b = source;
            this.f2757c = i10;
            this.f2758d = i11;
            Hi.d.c(i10, i11, source.size());
            this.f2759e = i11 - i10;
        }

        @Override // Zg.AbstractC3672d, java.util.List
        public Object get(int i10) {
            Hi.d.a(i10, this.f2759e);
            return this.f2756b.get(this.f2757c + i10);
        }

        @Override // Zg.AbstractC3670b
        public int j() {
            return this.f2759e;
        }

        @Override // Zg.AbstractC3672d, java.util.List
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public c subList(int i10, int i11) {
            Hi.d.c(i10, i11, this.f2759e);
            c cVar = this.f2756b;
            int i12 = this.f2757c;
            return new b(cVar, i10 + i12, i12 + i11);
        }
    }
}
