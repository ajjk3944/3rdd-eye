package rf;

import com.ui.wifiman.ui.component.network.C5219q;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public final class e implements C5219q.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f60417a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f60418b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f60419c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f60420d;

    /* renamed from: e, reason: collision with root package name */
    private final com.ui.wifiman.ui.teleport.z f60421e;

    public e(String id2, InterfaceC7929a image, s9.d name, s9.d info, com.ui.wifiman.ui.teleport.z zVar) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(image, "image");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(info, "info");
        this.f60417a = id2;
        this.f60418b = image;
        this.f60419c = name;
        this.f60420d = info;
        this.f60421e = zVar;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.b
    public InterfaceC7929a a() {
        return this.f60418b;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.b
    public s9.d b() {
        return this.f60420d;
    }

    public final com.ui.wifiman.ui.teleport.z c() {
        return this.f60421e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC6492s.d(this.f60417a, eVar.f60417a) && AbstractC6492s.d(this.f60418b, eVar.f60418b) && AbstractC6492s.d(this.f60419c, eVar.f60419c) && AbstractC6492s.d(this.f60420d, eVar.f60420d) && this.f60421e == eVar.f60421e;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.b
    public String getId() {
        return this.f60417a;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.b
    public s9.d getTitle() {
        return this.f60419c;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f60417a.hashCode() * 31) + this.f60418b.hashCode()) * 31) + this.f60419c.hashCode()) * 31) + this.f60420d.hashCode()) * 31;
        com.ui.wifiman.ui.teleport.z zVar = this.f60421e;
        return iHashCode + (zVar == null ? 0 : zVar.hashCode());
    }

    public String toString() {
        return "Item(id=" + this.f60417a + ", image=" + this.f60418b + ", name=" + this.f60419c + ", info=" + this.f60420d + ", reachability=" + this.f60421e + ")";
    }
}
