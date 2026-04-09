package m4;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: m4.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6773l {

    /* renamed from: m4.l$a */
    static class a implements InterfaceC6772k, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6772k f53133a;

        /* renamed from: b, reason: collision with root package name */
        volatile transient boolean f53134b;

        /* renamed from: c, reason: collision with root package name */
        transient Object f53135c;

        a(InterfaceC6772k interfaceC6772k) {
            this.f53133a = (InterfaceC6772k) AbstractC6769h.i(interfaceC6772k);
        }

        @Override // m4.InterfaceC6772k
        public Object get() {
            if (!this.f53134b) {
                synchronized (this) {
                    try {
                        if (!this.f53134b) {
                            Object obj = this.f53133a.get();
                            this.f53135c = obj;
                            this.f53134b = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return AbstractC6766e.a(this.f53135c);
        }

        public String toString() {
            Object string;
            if (this.f53134b) {
                String strValueOf = String.valueOf(this.f53135c);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(strValueOf);
                sb2.append(">");
                string = sb2.toString();
            } else {
                string = this.f53133a;
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(strValueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    /* renamed from: m4.l$b */
    static class b implements InterfaceC6772k {

        /* renamed from: a, reason: collision with root package name */
        volatile InterfaceC6772k f53136a;

        /* renamed from: b, reason: collision with root package name */
        volatile boolean f53137b;

        /* renamed from: c, reason: collision with root package name */
        Object f53138c;

        b(InterfaceC6772k interfaceC6772k) {
            this.f53136a = (InterfaceC6772k) AbstractC6769h.i(interfaceC6772k);
        }

        @Override // m4.InterfaceC6772k
        public Object get() {
            if (!this.f53137b) {
                synchronized (this) {
                    try {
                        if (!this.f53137b) {
                            InterfaceC6772k interfaceC6772k = this.f53136a;
                            Objects.requireNonNull(interfaceC6772k);
                            Object obj = interfaceC6772k.get();
                            this.f53138c = obj;
                            this.f53137b = true;
                            this.f53136a = null;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return AbstractC6766e.a(this.f53138c);
        }

        public String toString() {
            Object string = this.f53136a;
            if (string == null) {
                String strValueOf = String.valueOf(this.f53138c);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(strValueOf);
                sb2.append(">");
                string = sb2.toString();
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(strValueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    /* renamed from: m4.l$c */
    private static class c implements InterfaceC6772k, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Object f53139a;

        c(Object obj) {
            this.f53139a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return AbstractC6767f.a(this.f53139a, ((c) obj).f53139a);
            }
            return false;
        }

        @Override // m4.InterfaceC6772k
        public Object get() {
            return this.f53139a;
        }

        public int hashCode() {
            return AbstractC6767f.b(this.f53139a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f53139a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
            sb2.append("Suppliers.ofInstance(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static InterfaceC6772k a(InterfaceC6772k interfaceC6772k) {
        return ((interfaceC6772k instanceof b) || (interfaceC6772k instanceof a)) ? interfaceC6772k : interfaceC6772k instanceof Serializable ? new a(interfaceC6772k) : new b(interfaceC6772k);
    }

    public static InterfaceC6772k b(Object obj) {
        return new c(obj);
    }
}
