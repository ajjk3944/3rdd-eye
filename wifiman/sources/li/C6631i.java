package li;

import Bh.g0;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: li.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6631i {

    /* renamed from: a, reason: collision with root package name */
    private final Wh.c f52703a;

    /* renamed from: b, reason: collision with root package name */
    private final Uh.c f52704b;

    /* renamed from: c, reason: collision with root package name */
    private final Wh.a f52705c;

    /* renamed from: d, reason: collision with root package name */
    private final g0 f52706d;

    public C6631i(Wh.c nameResolver, Uh.c classProto, Wh.a metadataVersion, g0 sourceElement) {
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(classProto, "classProto");
        AbstractC6492s.i(metadataVersion, "metadataVersion");
        AbstractC6492s.i(sourceElement, "sourceElement");
        this.f52703a = nameResolver;
        this.f52704b = classProto;
        this.f52705c = metadataVersion;
        this.f52706d = sourceElement;
    }

    public final Wh.c a() {
        return this.f52703a;
    }

    public final Uh.c b() {
        return this.f52704b;
    }

    public final Wh.a c() {
        return this.f52705c;
    }

    public final g0 d() {
        return this.f52706d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6631i)) {
            return false;
        }
        C6631i c6631i = (C6631i) obj;
        return AbstractC6492s.d(this.f52703a, c6631i.f52703a) && AbstractC6492s.d(this.f52704b, c6631i.f52704b) && AbstractC6492s.d(this.f52705c, c6631i.f52705c) && AbstractC6492s.d(this.f52706d, c6631i.f52706d);
    }

    public int hashCode() {
        return (((((this.f52703a.hashCode() * 31) + this.f52704b.hashCode()) * 31) + this.f52705c.hashCode()) * 31) + this.f52706d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f52703a + ", classProto=" + this.f52704b + ", metadataVersion=" + this.f52705c + ", sourceElement=" + this.f52706d + ')';
    }
}
