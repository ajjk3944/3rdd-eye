package hf;

import Ee.C2706g;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class o implements C2706g.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f48694a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f48695b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.b f48696c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f48697d;

    /* renamed from: e, reason: collision with root package name */
    private final List f48698e;

    /* renamed from: f, reason: collision with root package name */
    private final String f48699f;

    public o(String id2, s9.d timestamp, s9.b connectionIcon, s9.d connectionType, List measurements) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(timestamp, "timestamp");
        AbstractC6492s.i(connectionIcon, "connectionIcon");
        AbstractC6492s.i(connectionType, "connectionType");
        AbstractC6492s.i(measurements, "measurements");
        this.f48694a = id2;
        this.f48695b = timestamp;
        this.f48696c = connectionIcon;
        this.f48697d = connectionType;
        this.f48698e = measurements;
        this.f48699f = "speedtestResult";
    }

    public final s9.b a() {
        return this.f48696c;
    }

    public final s9.d b() {
        return this.f48697d;
    }

    public final List c() {
        return this.f48698e;
    }

    public final s9.d d() {
        return this.f48695b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC6492s.d(this.f48694a, oVar.f48694a) && AbstractC6492s.d(this.f48695b, oVar.f48695b) && AbstractC6492s.d(this.f48696c, oVar.f48696c) && AbstractC6492s.d(this.f48697d, oVar.f48697d) && AbstractC6492s.d(this.f48698e, oVar.f48698e);
    }

    @Override // Ee.C2706g.b
    public String getId() {
        return this.f48694a;
    }

    @Override // Ee.C2706g.b
    public String getType() {
        return this.f48699f;
    }

    public int hashCode() {
        return (((((((this.f48694a.hashCode() * 31) + this.f48695b.hashCode()) * 31) + this.f48696c.hashCode()) * 31) + this.f48697d.hashCode()) * 31) + this.f48698e.hashCode();
    }

    public String toString() {
        return "Model(id=" + this.f48694a + ", timestamp=" + this.f48695b + ", connectionIcon=" + this.f48696c + ", connectionType=" + this.f48697d + ", measurements=" + this.f48698e + ")";
    }
}
