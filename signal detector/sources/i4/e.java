package i4;

import g4.InterfaceC2336A;
import g4.z;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l4.AbstractC2649c;
import n4.C2689a;

/* loaded from: classes.dex */
public final class e implements InterfaceC2336A, Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final e f20596c = new e();

    /* renamed from: a, reason: collision with root package name */
    public final List f20597a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20598b;

    public e() {
        List list = Collections.EMPTY_LIST;
        this.f20597a = list;
        this.f20598b = list;
    }

    @Override // g4.InterfaceC2336A
    public final z a(g4.m mVar, C2689a c2689a) {
        Class cls = c2689a.f22327a;
        boolean zB = b(cls, true);
        boolean zB2 = b(cls, false);
        if (zB || zB2) {
            return new d(this, zB2, zB, mVar, c2689a);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z6) {
        if (!z6 && !Enum.class.isAssignableFrom(cls)) {
            R3.b bVar = AbstractC2649c.f21863a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z6 ? this.f20597a : this.f20598b).iterator();
        if (it.hasNext()) {
            throw A.f.f(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (e) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }
}
