package Q1;

import androidx.datastore.preferences.protobuf.AbstractC3985v;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.N;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.o0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC3985v implements N {
    private static final f DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private G preferences_ = G.n();

    public static final class a extends AbstractC3985v.a implements N {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a x(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            q();
            ((f) this.f30961b).I().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final F f19123a = F.d(o0.b.STRING, "", o0.b.MESSAGE, h.Q());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC3985v.E(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map I() {
        return L();
    }

    private G L() {
        if (!this.preferences_.B()) {
            this.preferences_ = this.preferences_.P();
        }
        return this.preferences_;
    }

    private G M() {
        return this.preferences_;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.n();
    }

    public static f O(InputStream inputStream) {
        return (f) AbstractC3985v.C(DEFAULT_INSTANCE, inputStream);
    }

    public Map K() {
        return Collections.unmodifiableMap(M());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3985v
    protected final Object q(AbstractC3985v.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f19122a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC3985v.B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f19123a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC3985v.b(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } finally {
                        }
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
