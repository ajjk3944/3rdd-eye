package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class k extends c {
    public k(Context context, b bVar, d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i4, com.apm.insight.entity.a aVar) throws JSONException {
        com.apm.insight.entity.a aVarA = super.a(i4, aVar);
        if (i4 == 0) {
            Header headerA = Header.a(this.f3433b);
            headerA.c();
            aVarA.a(headerA);
            com.apm.insight.a.a(aVarA, headerA, this.f3432a);
            return aVarA;
        }
        if (i4 == 1) {
            Header headerD = aVarA.d();
            headerD.d();
            headerD.e();
            return aVarA;
        }
        if (i4 == 2) {
            Header.a(aVarA.d());
            try {
                aVarA.d().f().put("launch_did", com.apm.insight.i.a.a(this.f3433b));
            } catch (Throwable unused) {
            }
        } else if (i4 == 5) {
            Header.b(aVarA.d());
            return aVarA;
        }
        return aVarA;
    }
}
