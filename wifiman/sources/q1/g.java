package Q1;

import androidx.datastore.preferences.protobuf.AbstractC3965a;
import androidx.datastore.preferences.protobuf.AbstractC3985v;
import androidx.datastore.preferences.protobuf.AbstractC3987x;
import androidx.datastore.preferences.protobuf.N;
import androidx.datastore.preferences.protobuf.V;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends AbstractC3985v implements N {
    private static final g DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC3987x.b strings_ = AbstractC3985v.r();

    public static final class a extends AbstractC3985v.a implements N {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a x(Iterable iterable) {
            q();
            ((g) this.f30961b).I(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC3985v.E(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(Iterable iterable) {
        K();
        AbstractC3965a.a(iterable, this.strings_);
    }

    private void K() {
        if (this.strings_.E()) {
            return;
        }
        this.strings_ = AbstractC3985v.z(this.strings_);
    }

    public static g L() {
        return DEFAULT_INSTANCE;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.n();
    }

    public List M() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3985v
    protected final Object q(AbstractC3985v.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f19122a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC3985v.B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V bVar = PARSER;
                if (bVar == null) {
                    synchronized (g.class) {
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
