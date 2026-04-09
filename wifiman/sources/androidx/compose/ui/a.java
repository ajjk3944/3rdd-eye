package androidx.compose.ui;

import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final e f28732a;

    /* renamed from: b, reason: collision with root package name */
    private final e f28733b;

    /* renamed from: androidx.compose.ui.a$a, reason: collision with other inner class name */
    static final class C1063a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C1063a f28734a = new C1063a();

        C1063a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, e.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public a(e eVar, e eVar2) {
        this.f28732a = eVar;
        this.f28733b = eVar2;
    }

    @Override // androidx.compose.ui.e
    public Object L(Object obj, InterfaceC6839p interfaceC6839p) {
        return this.f28733b.L(this.f28732a.L(obj, interfaceC6839p), interfaceC6839p);
    }

    public final e a() {
        return this.f28733b;
    }

    public final e c() {
        return this.f28732a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (AbstractC6492s.d(this.f28732a, aVar.f28732a) && AbstractC6492s.d(this.f28733b, aVar.f28733b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f28732a.hashCode() + (this.f28733b.hashCode() * 31);
    }

    @Override // androidx.compose.ui.e
    public boolean s(InterfaceC6835l interfaceC6835l) {
        return this.f28732a.s(interfaceC6835l) && this.f28733b.s(interfaceC6835l);
    }

    public String toString() {
        return '[' + ((String) L("", C1063a.f28734a)) + ']';
    }
}
