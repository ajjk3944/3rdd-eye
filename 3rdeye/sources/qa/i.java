package qa;

import ma.p;
import ma.q;

/* compiled from: TemporalQueries.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f45475a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f45476b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final c f45477c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final d f45478d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final e f45479e = new e();

    /* renamed from: f, reason: collision with root package name */
    public static final f f45480f = new f();

    /* renamed from: g, reason: collision with root package name */
    public static final g f45481g = new g();

    /* compiled from: TemporalQueries.java */
    public class a implements j<p> {
        @Override // qa.j
        public final p a(qa.e eVar) {
            return (p) eVar.query(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    public class b implements j<na.g> {
        @Override // qa.j
        public final na.g a(qa.e eVar) {
            return (na.g) eVar.query(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    public class c implements j<k> {
        @Override // qa.j
        public final k a(qa.e eVar) {
            return (k) eVar.query(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    public class d implements j<p> {
        @Override // qa.j
        public final p a(qa.e eVar) {
            p pVar = (p) eVar.query(i.f45475a);
            return pVar != null ? pVar : (p) eVar.query(i.f45479e);
        }
    }

    /* compiled from: TemporalQueries.java */
    public class e implements j<q> {
        @Override // qa.j
        public final q a(qa.e eVar) {
            qa.a aVar = qa.a.OFFSET_SECONDS;
            if (eVar.isSupported(aVar)) {
                return q.j(eVar.get(aVar));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries.java */
    public class f implements j<ma.e> {
        @Override // qa.j
        public final ma.e a(qa.e eVar) {
            qa.a aVar = qa.a.EPOCH_DAY;
            if (eVar.isSupported(aVar)) {
                return ma.e.D0(eVar.getLong(aVar));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries.java */
    public class g implements j<ma.g> {
        @Override // qa.j
        public final ma.g a(qa.e eVar) {
            qa.a aVar = qa.a.NANO_OF_DAY;
            if (eVar.isSupported(aVar)) {
                return ma.g.m0(eVar.getLong(aVar));
            }
            return null;
        }
    }
}
