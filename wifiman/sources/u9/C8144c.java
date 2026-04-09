package u9;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: u9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8144c {

    /* renamed from: a, reason: collision with root package name */
    private final List f62742a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62743b;

    public C8144c(List fields, String divider) {
        AbstractC6492s.i(fields, "fields");
        AbstractC6492s.i(divider, "divider");
        this.f62742a = fields;
        this.f62743b = divider;
    }

    public final int a() {
        Iterator it = this.f62742a.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((C8143b) it.next()).a();
        }
        return iA;
    }

    public final String b() {
        return this.f62743b;
    }

    public final List c() {
        return this.f62742a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8144c)) {
            return false;
        }
        C8144c c8144c = (C8144c) obj;
        return AbstractC6492s.d(this.f62742a, c8144c.f62742a) && AbstractC6492s.d(this.f62743b, c8144c.f62743b);
    }

    public int hashCode() {
        return (this.f62742a.hashCode() * 31) + this.f62743b.hashCode();
    }

    public String toString() {
        return "Params(fields=" + this.f62742a + ", divider=" + this.f62743b + ")";
    }
}
