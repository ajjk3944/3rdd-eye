package j6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.B9;
import N7.C1175g0;
import N7.C1179g4;
import N7.C1223j4;
import N7.C1370tc;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import k6.C5236o;
import k8.F;
import org.json.JSONObject;

/* compiled from: DivActionHandler.java */
/* loaded from: classes.dex */
public class h {
    private static final String AUTHORITY_HIDE_TOOLTIP = "hide_tooltip";
    private static final String AUTHORITY_SET_VARIABLE = "set_variable";
    private static final String AUTHORITY_SHOW_TOOLTIP = "show_tooltip";
    private static final String AUTHORITY_SWITCH_STATE = "set_state";
    private static final String AUTHORITY_TIMER = "timer";
    private static final String AUTHORITY_VIDEO = "video";
    private static final String PARAM_ACTION = "action";
    private static final String PARAM_ID = "id";
    private static final String PARAM_MULTIPLE = "multiple";
    private static final String PARAM_STATE_ID = "state_id";
    private static final String PARAM_TEMPORARY = "temporary";
    private static final String PARAM_VARIABLE_NAME = "name";
    private static final String PARAM_VARIABLE_VALUE = "value";
    private static final String SCHEME_DIV_ACTION = "div-action";

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static A7.d findExpressionResolverById(H6.C0675l r5, java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            goto L61
        L4:
            java.lang.String r1 = "divView"
            kotlin.jvm.internal.l.f(r5, r1)
            H6.l r1 = r5.getView()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            B7.d.k(r1, r6, r2)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L1d
        L1b:
            r5 = r0
            goto L52
        L1d:
            int r1 = r2.size()
            r3 = 1
            if (r1 <= r3) goto L4c
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Ambiguous scope id. There are "
            r3.<init>(r4)
            int r2 = r2.size()
            r3.append(r2)
            java.lang.String r2 = " divs with id '"
            r3.append(r2)
            r3.append(r6)
            r6 = 39
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1.<init>(r6)
            k6.C5246y.d(r5, r1)
            goto L1b
        L4c:
            java.lang.Object r5 = c9.C2097r.p0(r2)
            android.view.View r5 = (android.view.View) r5
        L52:
            boolean r6 = r5 instanceof O6.l
            if (r6 == 0) goto L61
            O6.l r5 = (O6.l) r5
            H6.i r5 = r5.getBindingContext()
            if (r5 == 0) goto L61
            A7.d r5 = r5.f2147b
            return r5
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.h.findExpressionResolverById(H6.l, java.lang.String):A7.d");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean handleActionInternal(java.lang.String r19, android.net.Uri r20, j6.y r21, A7.d r22) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.h.handleActionInternal(java.lang.String, android.net.Uri, j6.y, A7.d):boolean");
    }

    public boolean getUseActionUid() {
        return false;
    }

    public boolean handleAction(C1175g0 c1175g0, y view, A7.d dVar) {
        Uri uriA;
        A7.d resolver = findExpressionResolverById((C0675l) view, c1175g0.f8260h);
        if (resolver == null) {
            resolver = dVar;
        }
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        C1223j4 c1223j4 = c1175g0.f8253a;
        AbstractC1192h2 abstractC1192h2 = c1175g0.f8261j;
        String str = c1175g0.f8260h;
        if (C5236o.a(str, abstractC1192h2, view, resolver, c1223j4)) {
            return true;
        }
        A7.b<Uri> bVar = c1175g0.f8262k;
        Uri uriA2 = bVar != null ? bVar.a(dVar) : null;
        if (!F.c(uriA2, view)) {
            return handleAction(str, uriA2, view, resolver);
        }
        C0675l c0675l = (C0675l) view;
        if (bVar == null || (uriA = bVar.a(resolver)) == null || uriA.getQueryParameter(ImagesContract.URL) == null) {
            return false;
        }
        c0675l.getDiv2Component$div_release().s().b();
        throw null;
    }

    public boolean handleActionUrl(Uri uri, y yVar) {
        return handleActionUrl(uri, yVar, yVar.getExpressionResolver());
    }

    public boolean handleActionWithReason(C1175g0 c1175g0, y yVar, A7.d dVar, String str) {
        return handleAction(c1175g0, yVar, dVar);
    }

    public final boolean handleActionUrl(Uri uri, y yVar, A7.d dVar) {
        return handleActionUrl(null, uri, yVar, dVar);
    }

    public boolean handleActionWithReason(C1175g0 c1175g0, y yVar, A7.d dVar, String str, String str2) {
        return handleAction(c1175g0, yVar, dVar, str);
    }

    public final boolean handleActionUrl(String str, Uri uri, y yVar, A7.d dVar) {
        A7.d dVarFindExpressionResolverById = findExpressionResolverById((C0675l) yVar, str);
        if (dVarFindExpressionResolverById != null) {
            dVar = dVarFindExpressionResolverById;
        }
        return handleAction(str, uri, yVar, dVar);
    }

    public boolean handleAction(C1175g0 c1175g0, y yVar, A7.d dVar, String str) {
        return handleAction(c1175g0, yVar, dVar);
    }

    public boolean handleAction(C1370tc c1370tc, y yVar, A7.d dVar) {
        return handleAction((B9) c1370tc, yVar, dVar);
    }

    public boolean handleAction(C1179g4 c1179g4, y yVar, A7.d dVar) {
        return handleAction((B9) c1179g4, yVar, dVar);
    }

    public boolean handleAction(B9 b92, y view, A7.d dVar) {
        Uri uriA;
        A7.d resolver = findExpressionResolverById((C0675l) view, b92.d());
        if (resolver == null) {
            resolver = dVar;
        }
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (C5236o.a(b92.d(), b92.a(), view, resolver, b92.b())) {
            return true;
        }
        Uri uriA2 = b92.getUrl() != null ? b92.getUrl().a(dVar) : null;
        if (F.c(uriA2, view)) {
            C0675l c0675l = (C0675l) view;
            A7.b<Uri> url = b92.getUrl();
            if (url == null || (uriA = url.a(resolver)) == null || uriA.getQueryParameter(ImagesContract.URL) == null) {
                return false;
            }
            c0675l.getDiv2Component$div_release().s().b();
            throw null;
        }
        return handleAction(b92.d(), uriA2, view, dVar);
    }

    public boolean handleAction(C1370tc c1370tc, y yVar, A7.d dVar, String str) {
        return handleAction(c1370tc, yVar, dVar);
    }

    public boolean handleAction(C1179g4 c1179g4, y yVar, A7.d dVar, String str) {
        return handleAction(c1179g4, yVar, dVar);
    }

    public boolean handleAction(B9 b92, y yVar, A7.d dVar, String str) {
        return handleAction(b92, yVar, dVar);
    }

    public void handlePayload(JSONObject jSONObject) {
    }

    private boolean handleAction(String str, Uri uri, y yVar, A7.d dVar) {
        if (uri != null && SCHEME_DIV_ACTION.equals(uri.getScheme())) {
            return handleActionInternal(str, uri, yVar, dVar);
        }
        return false;
    }
}
