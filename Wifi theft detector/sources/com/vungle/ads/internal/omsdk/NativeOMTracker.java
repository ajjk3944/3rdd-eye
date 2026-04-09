package com.vungle.ads.internal.omsdk;

import android.util.Base64;
import android.view.View;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import i6.a;
import i6.b;
import i6.d;
import i6.e;
import java.net.URL;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlinx.serialization.f;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.g;
import y8.s;
import z8.q;
import z9.c;
import z9.k;

/* loaded from: classes3.dex */
public final class NativeOMTracker {

    @Nullable
    private a adEvents;

    @Nullable
    private b adSession;

    @NotNull
    private final z9.a json;

    public NativeOMTracker(@NotNull String omSdkData, @NotNull String omSdkJS) {
        g gVar;
        p.e(omSdkData, "omSdkData");
        p.e(omSdkJS, "omSdkJS");
        z9.a aVarB = k.b(null, new l() { // from class: com.vungle.ads.internal.omsdk.NativeOMTracker$json$1
            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((c) obj);
                return s.f25199a;
            }

            public final void invoke(@NotNull c Json) {
                p.e(Json, "$this$Json");
                Json.f(true);
                Json.d(true);
                Json.e(false);
            }
        }, 1, null);
        this.json = aVarB;
        try {
            i6.c cVarA = i6.c.a(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            e eVarA = e.a("Vungle", "7.6.3");
            byte[] bArrDecode = Base64.decode(omSdkData, 0);
            if (bArrDecode != null) {
                String str = new String(bArrDecode, s9.c.f24341b);
                kotlinx.serialization.b bVarB = f.b(aVarB.a(), t.m(g.class));
                p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                gVar = (g) aVarB.b(bVarB, str);
            } else {
                gVar = null;
            }
            i6.g verificationScriptResource = i6.g.a(gVar != null ? gVar.getVendorKey() : null, new URL(gVar != null ? gVar.getVendorURL() : null), gVar != null ? gVar.getParams() : null);
            p.d(verificationScriptResource, "verificationScriptResource");
            this.adSession = b.a(cVarA, d.b(eVarA, omSdkJS, q.e(verificationScriptResource), null, null));
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e("NativeOMTracker", "error occured when create omsdk adSession:", e10);
        }
    }

    public final void impressionOccurred() {
        a aVar = this.adEvents;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void start(@NotNull View view) {
        b bVar;
        p.e(view, "view");
        if (!h6.a.b() || (bVar = this.adSession) == null) {
            return;
        }
        bVar.c(view);
        bVar.d();
        a aVarA = a.a(bVar);
        this.adEvents = aVarA;
        if (aVarA != null) {
            aVarA.c();
        }
    }

    public final void stop() {
        b bVar = this.adSession;
        if (bVar != null) {
            bVar.b();
        }
        this.adSession = null;
    }
}
