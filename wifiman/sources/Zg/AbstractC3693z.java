package Zg;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Zg.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3693z extends AbstractC3692y {

    /* renamed from: Zg.z$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Enumeration f25392a;

        a(Enumeration enumeration) {
            this.f25392a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25392a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f25392a.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static Iterator z(Enumeration enumeration) {
        AbstractC6492s.i(enumeration, "<this>");
        return new a(enumeration);
    }
}
