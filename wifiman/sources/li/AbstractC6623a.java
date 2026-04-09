package li;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC6472a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import li.AbstractC6611N;

/* renamed from: li.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6623a implements InterfaceC6630h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6472a f52691a;

    /* renamed from: li.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1946a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52692a;

        static {
            int[] iArr = new int[EnumC6626d.values().length];
            try {
                iArr[EnumC6626d.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6626d.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6626d.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52692a = iArr;
        }
    }

    public AbstractC6623a(AbstractC6472a protocol) {
        AbstractC6492s.i(protocol, "protocol");
        this.f52691a = protocol;
    }

    @Override // li.InterfaceC6630h
    public List a(AbstractC6611N.a container) {
        AbstractC6492s.i(container, "container");
        List listL = (List) container.f().J(this.f52691a.a());
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        List list = listL;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l((Uh.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // li.InterfaceC6630h
    public List b(AbstractC6611N container, kotlin.reflect.jvm.internal.impl.protobuf.n callableProto, EnumC6626d kind, int i10, Uh.u proto) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(callableProto, "callableProto");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(proto, "proto");
        List listL = (List) proto.J(this.f52691a.h());
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        List list = listL;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l((Uh.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // li.InterfaceC6630h
    public List d(AbstractC6611N container, Uh.g proto) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        List listL = (List) proto.J(this.f52691a.d());
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        List list = listL;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l((Uh.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // li.InterfaceC6630h
    public List f(AbstractC6611N container, Uh.n proto) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        h.f fVarK = this.f52691a.k();
        List listL = fVarK != null ? (List) proto.J(fVarK) : null;
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        List list = listL;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l((Uh.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // li.InterfaceC6630h
    public List g(AbstractC6611N container, Uh.n proto) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        h.f fVarJ = this.f52691a.j();
        List listL = fVarJ != null ? (List) proto.J(fVarJ) : null;
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        List list = listL;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l((Uh.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // li.InterfaceC6630h
    public List h(AbstractC6611N container, kotlin.reflect.jvm.internal.impl.protobuf.n proto, EnumC6626d kind) {
        List listL;
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(kind, "kind");
        if (proto instanceof Uh.d) {
            listL = (List) ((Uh.d) proto).J(this.f52691a.c());
        } else if (proto instanceof Uh.i) {
            listL = (List) ((Uh.i) proto).J(this.f52691a.f());
        } else {
            if (!(proto instanceof Uh.n)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = C1946a.f52692a[kind.ordinal()];
            if (i10 == 1) {
                listL = (List) ((Uh.n) proto).J(this.f52691a.i());
            } else if (i10 == 2) {
                listL = (List) ((Uh.n) proto).J(this.f52691a.m());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listL = (List) ((Uh.n) proto).J(this.f52691a.n());
            }
        }
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        List list = listL;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l((Uh.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // li.InterfaceC6630h
    public List i(Uh.s proto, Wh.c nameResolver) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        List listL = (List) proto.J(this.f52691a.p());
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        List list = listL;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l((Uh.b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // li.InterfaceC6630h
    public List j(Uh.q proto, Wh.c nameResolver) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        List listL = (List) proto.J(this.f52691a.o());
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        List list = listL;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l((Uh.b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // li.InterfaceC6630h
    public List k(AbstractC6611N container, kotlin.reflect.jvm.internal.impl.protobuf.n proto, EnumC6626d kind) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(kind, "kind");
        List listL = null;
        if (proto instanceof Uh.i) {
            h.f fVarG = this.f52691a.g();
            if (fVarG != null) {
                listL = (List) ((Uh.i) proto).J(fVarG);
            }
        } else {
            if (!(proto instanceof Uh.n)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = C1946a.f52692a[kind.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            h.f fVarL = this.f52691a.l();
            if (fVarL != null) {
                listL = (List) ((Uh.n) proto).J(fVarL);
            }
        }
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        List list = listL;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l((Uh.b) it.next(), container.b()));
        }
        return arrayList;
    }

    protected final AbstractC6472a m() {
        return this.f52691a;
    }
}
