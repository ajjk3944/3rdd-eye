package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.internal.s0;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public class JsonTreeDecoder extends c {

    /* renamed from: f, reason: collision with root package name */
    public final JsonObject f22974f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22975g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22976h;

    /* renamed from: i, reason: collision with root package name */
    public int f22977i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22978j;

    public /* synthetic */ JsonTreeDecoder(z9.a aVar, JsonObject jsonObject, String str, kotlinx.serialization.descriptors.f fVar, int i10, kotlin.jvm.internal.i iVar) {
        this(aVar, jsonObject, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : fVar);
    }

    @Override // kotlinx.serialization.json.internal.c, kotlinx.serialization.internal.TaggedDecoder, y9.e
    public boolean D() {
        return !this.f22978j && super.D();
    }

    @Override // kotlinx.serialization.internal.e1
    public String a0(kotlinx.serialization.descriptors.f desc, int i10) {
        Object next;
        kotlin.jvm.internal.p.e(desc, "desc");
        String strE = desc.e(i10);
        if (this.f22998e.j() && !s0().keySet().contains(strE)) {
            Map map = (Map) z9.r.a(d()).b(desc, JsonNamesMapKt.c(), new JsonTreeDecoder$elementName$alternativeNamesMap$1(desc));
            Iterator it = s0().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i10) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strE;
    }

    @Override // kotlinx.serialization.json.internal.c, y9.e
    public y9.c b(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return descriptor == this.f22976h ? this : super.b(descriptor);
    }

    @Override // kotlinx.serialization.json.internal.c, y9.c
    public void c(kotlinx.serialization.descriptors.f descriptor) {
        Set setH;
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        if (this.f22998e.g() || (descriptor.getKind() instanceof kotlinx.serialization.descriptors.d)) {
            return;
        }
        if (this.f22998e.j()) {
            Set setA = s0.a(descriptor);
            Map map = (Map) z9.r.a(d()).a(descriptor, JsonNamesMapKt.c());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = z8.j0.d();
            }
            setH = z8.k0.h(setA, setKeySet);
        } else {
            setH = s0.a(descriptor);
        }
        for (String str : s0().keySet()) {
            if (!setH.contains(str) && !kotlin.jvm.internal.p.a(str, this.f22975g)) {
                throw s.g(str, s0().toString());
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.c
    public kotlinx.serialization.json.b e0(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        return (kotlinx.serialization.json.b) kotlin.collections.a.i(s0(), tag);
    }

    @Override // y9.c
    public int o(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        while (this.f22977i < descriptor.d()) {
            int i10 = this.f22977i;
            this.f22977i = i10 + 1;
            String strV = V(descriptor, i10);
            int i11 = this.f22977i - 1;
            this.f22978j = false;
            if (s0().containsKey(strV) || u0(descriptor, i11)) {
                if (!this.f22998e.d() || !v0(descriptor, i11, strV)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public final boolean u0(kotlinx.serialization.descriptors.f fVar, int i10) {
        boolean z10 = (d().e().f() || fVar.i(i10) || !fVar.g(i10).b()) ? false : true;
        this.f22978j = z10;
        return z10;
    }

    public final boolean v0(kotlinx.serialization.descriptors.f fVar, int i10, String str) {
        z9.a aVarD = d();
        kotlinx.serialization.descriptors.f fVarG = fVar.g(i10);
        if (!fVarG.b() && (e0(str) instanceof JsonNull)) {
            return true;
        }
        if (kotlin.jvm.internal.p.a(fVarG.getKind(), h.b.f22785a)) {
            kotlinx.serialization.json.b bVarE0 = e0(str);
            kotlinx.serialization.json.c cVar = bVarE0 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVarE0 : null;
            String strF = cVar != null ? z9.g.f(cVar) : null;
            if (strF != null && JsonNamesMapKt.d(fVarG, aVarD, strF) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.json.internal.c
    /* renamed from: w0 */
    public JsonObject s0() {
        return this.f22974f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(z9.a json, JsonObject value, String str, kotlinx.serialization.descriptors.f fVar) {
        super(json, value, null);
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(value, "value");
        this.f22974f = value;
        this.f22975g = str;
        this.f22976h = fVar;
    }
}
