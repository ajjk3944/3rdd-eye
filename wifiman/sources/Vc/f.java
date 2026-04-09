package Vc;

import Yg.r;
import Zg.AbstractC3689v;
import d7.InterfaceC5304a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class f implements InterfaceC5304a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23354a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g h(f fVar, b7.f fVar2, b7.f it) {
        AbstractC6492s.i(it, "it");
        return fVar.f(fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h l(f fVar, b7.f fVar2, b7.f it) {
        AbstractC6492s.i(it, "it");
        return fVar.j(fVar2);
    }

    @Override // d7.InterfaceC5304a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g b(b7.f reader, b7.b config) throws IOException {
        AbstractC6492s.i(reader, "reader");
        AbstractC6492s.i(config, "config");
        n(reader);
        g gVarF = null;
        while (reader.s()) {
            reader.a();
            String strS = reader.S();
            n(reader);
            if (t.C(strS, "device", true)) {
                gVarF = f(reader);
            } else {
                m(reader);
            }
            reader.h();
            if (gVarF != null) {
                break;
            }
        }
        if (gVarF != null) {
            return gVarF;
        }
        throw new IOException("Device element not found in xml");
    }

    public final g f(b7.f fVar) throws IOException {
        AbstractC6492s.i(fVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listL = AbstractC3689v.l();
        List listL2 = AbstractC3689v.l();
        boolean z10 = true;
        while (z10) {
            if (fVar.p()) {
                fVar.p0();
            } else if (fVar.s()) {
                fVar.a();
                n(fVar);
                String strS = fVar.S();
                if (fVar.s()) {
                    if (t.C(strS, "deviceList", true)) {
                        listL2 = g(fVar);
                    } else if (t.C(strS, "serviceList", true)) {
                        listL = k(fVar);
                    } else {
                        m(fVar);
                    }
                } else if (fVar.v()) {
                    AbstractC6492s.f(strS);
                    String strY = fVar.Y();
                    AbstractC6492s.h(strY, "nextTextContent(...)");
                    linkedHashMap.put(strS, strY);
                } else {
                    m(fVar);
                }
                fVar.h();
            } else {
                z10 = false;
            }
        }
        return new g(linkedHashMap, listL, listL2);
    }

    public final List g(final b7.f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        return i(fVar, "device", new InterfaceC6835l() { // from class: Vc.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.h(this.f23352a, fVar, (b7.f) obj);
            }
        });
    }

    public final List i(b7.f fVar, String requiredName, InterfaceC6835l elementReader) throws IOException {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(requiredName, "requiredName");
        AbstractC6492s.i(elementReader, "elementReader");
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        while (z10) {
            if (fVar.p()) {
                fVar.p0();
            } else if (fVar.s()) {
                fVar.a();
                String strS = fVar.S();
                n(fVar);
                if (t.C(strS, requiredName, true)) {
                    arrayList.add(elementReader.invoke(fVar));
                } else {
                    m(fVar);
                }
                fVar.h();
            } else {
                z10 = false;
            }
        }
        return arrayList;
    }

    public final h j(b7.f fVar) throws IOException {
        AbstractC6492s.i(fVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z10 = true;
        while (z10) {
            if (fVar.p()) {
                fVar.p0();
            } else if (fVar.s()) {
                fVar.a();
                String strS = fVar.S();
                n(fVar);
                if (fVar.s()) {
                    m(fVar);
                } else {
                    AbstractC6492s.f(strS);
                    String strY = fVar.Y();
                    AbstractC6492s.h(strY, "nextTextContent(...)");
                    linkedHashMap.put(strS, strY);
                }
                fVar.h();
            } else {
                z10 = false;
            }
        }
        return new h(linkedHashMap);
    }

    public final List k(final b7.f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        return i(fVar, "service", new InterfaceC6835l() { // from class: Vc.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.l(this.f23350a, fVar, (b7.f) obj);
            }
        });
    }

    public final void m(b7.f fVar) throws IOException {
        AbstractC6492s.i(fVar, "<this>");
        boolean z10 = true;
        while (z10) {
            if (fVar.p()) {
                fVar.p0();
            } else if (fVar.s()) {
                fVar.a();
                fVar.S();
                n(fVar);
                if (fVar.s()) {
                    m(fVar);
                } else {
                    fVar.Y();
                }
                fVar.h();
            } else if (fVar.v()) {
                fVar.Y();
            } else {
                z10 = false;
            }
        }
    }

    public final void n(b7.f fVar) throws IOException {
        AbstractC6492s.i(fVar, "<this>");
        while (fVar.p()) {
            fVar.p0();
        }
    }

    @Override // d7.InterfaceC5304a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void a(b7.h hVar, b7.b bVar, g gVar, String str) {
        throw new r("we'll never parse it back to XML");
    }
}
