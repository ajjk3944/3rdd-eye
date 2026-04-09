package Zg;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;

/* renamed from: Zg.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3679k extends AbstractC3670b implements Set, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25380a = new a(null);

    /* renamed from: Zg.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Set c10, Set other) {
            AbstractC6492s.i(c10, "c");
            AbstractC6492s.i(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            return c10.containsAll(other);
        }

        public final int b(Collection c10) {
            AbstractC6492s.i(c10, "c");
            Iterator it = c10.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        private a() {
        }
    }

    protected AbstractC3679k() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f25380a.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f25380a.b(this);
    }
}
