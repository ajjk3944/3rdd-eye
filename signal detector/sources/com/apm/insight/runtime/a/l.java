package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeCrashCollector;
import org.json.JSONException;

/* loaded from: classes.dex */
final class l extends c {
    public l(Context context, b bVar, d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) throws JSONException {
        com.apm.insight.entity.a aVarA = super.a(i, aVar);
        if (i == 0) {
            Header headerA = Header.a(this.f6395b);
            headerA.c();
            aVarA.a(headerA);
            com.apm.insight.a.a(aVarA, headerA, this.f6394a);
            return aVarA;
        }
        if (i != 1) {
            if (i != 2) {
                return aVarA;
            }
            Header.a(aVarA.d());
            return aVarA;
        }
        Header headerD = aVarA.d();
        headerD.d();
        headerD.e();
        return aVarA;
    }

    @Override // com.apm.insight.runtime.a.c
    public final boolean c() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public final int a() {
        return NativeCrashCollector.a();
    }
}
