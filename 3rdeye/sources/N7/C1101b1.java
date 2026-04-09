package N7;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivActionDownloadJsonParser.kt */
/* renamed from: N7.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1101b1 implements D7.j<JSONObject, C1116c1, Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7914a;

    public C1101b1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7914a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Y0 a(D7.f context, C1116c1 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f7914a;
        List listQ = l7.d.q(context, template.f7955a, data, "on_fail_actions", uc.f6789j1, uc.f6766h1);
        List listQ2 = l7.d.q(context, template.f7956b, data, "on_success_actions", uc.f6789j1, uc.f6766h1);
        A7.b bVarD = l7.d.d(context, template.f7957c, data, ImagesContract.URL, l7.k.f43900e, l7.h.f43883d);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
        return new Y0(listQ, listQ2, bVarD);
    }
}
