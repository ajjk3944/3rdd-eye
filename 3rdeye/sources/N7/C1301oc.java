package N7;

import N7.C1259lc;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: DivVideoSourceJsonParser.kt */
/* renamed from: N7.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1301oc implements D7.j<JSONObject, C1329qc, C1259lc> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8876a;

    public C1301oc(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8876a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1329qc template = (C1329qc) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarK = l7.d.k(context, template.f9003a, data, "bitrate", l7.k.f43897b, l7.h.f43886g);
        A7.b bVarC = l7.d.c(context, template.f9004b, data, "mime_type", l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ype\", TYPE_HELPER_STRING)");
        Uc uc = this.f8876a;
        C1259lc.a aVar = (C1259lc.a) l7.d.h(context, template.f9005c, data, "resolution", uc.f6796j9, uc.f6774h9);
        A7.b bVarD = l7.d.d(context, template.f9006d, data, ImagesContract.URL, l7.k.f43900e, l7.h.f43883d);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
        return new C1259lc(bVarK, bVarC, aVar, bVarD);
    }
}
