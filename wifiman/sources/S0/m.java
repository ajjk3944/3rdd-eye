package s0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public final class m extends o implements Iterable, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final String f60973a;

    /* renamed from: b, reason: collision with root package name */
    private final float f60974b;

    /* renamed from: c, reason: collision with root package name */
    private final float f60975c;

    /* renamed from: d, reason: collision with root package name */
    private final float f60976d;

    /* renamed from: e, reason: collision with root package name */
    private final float f60977e;

    /* renamed from: f, reason: collision with root package name */
    private final float f60978f;

    /* renamed from: g, reason: collision with root package name */
    private final float f60979g;

    /* renamed from: h, reason: collision with root package name */
    private final float f60980h;

    /* renamed from: i, reason: collision with root package name */
    private final List f60981i;

    /* renamed from: j, reason: collision with root package name */
    private final List f60982j;

    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f60983a;

        a(m mVar) {
            this.f60983a = mVar.f60982j.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public o next() {
            return (o) this.f60983a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60983a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
        super(null);
        this.f60973a = str;
        this.f60974b = f10;
        this.f60975c = f11;
        this.f60976d = f12;
        this.f60977e = f13;
        this.f60978f = f14;
        this.f60979g = f15;
        this.f60980h = f16;
        this.f60981i = list;
        this.f60982j = list2;
    }

    public final o e(int i10) {
        return (o) this.f60982j.get(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            return AbstractC6492s.d(this.f60973a, mVar.f60973a) && this.f60974b == mVar.f60974b && this.f60975c == mVar.f60975c && this.f60976d == mVar.f60976d && this.f60977e == mVar.f60977e && this.f60978f == mVar.f60978f && this.f60979g == mVar.f60979g && this.f60980h == mVar.f60980h && AbstractC6492s.d(this.f60981i, mVar.f60981i) && AbstractC6492s.d(this.f60982j, mVar.f60982j);
        }
        return false;
    }

    public final List f() {
        return this.f60981i;
    }

    public final String g() {
        return this.f60973a;
    }

    public int hashCode() {
        return (((((((((((((((((this.f60973a.hashCode() * 31) + Float.hashCode(this.f60974b)) * 31) + Float.hashCode(this.f60975c)) * 31) + Float.hashCode(this.f60976d)) * 31) + Float.hashCode(this.f60977e)) * 31) + Float.hashCode(this.f60978f)) * 31) + Float.hashCode(this.f60979g)) * 31) + Float.hashCode(this.f60980h)) * 31) + this.f60981i.hashCode()) * 31) + this.f60982j.hashCode();
    }

    public final float i() {
        return this.f60975c;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    public final float j() {
        return this.f60976d;
    }

    public final float k() {
        return this.f60974b;
    }

    public final float q() {
        return this.f60977e;
    }

    public final float s() {
        return this.f60978f;
    }

    public final int u() {
        return this.f60982j.size();
    }

    public final float v() {
        return this.f60979g;
    }

    public final float w() {
        return this.f60980h;
    }
}
