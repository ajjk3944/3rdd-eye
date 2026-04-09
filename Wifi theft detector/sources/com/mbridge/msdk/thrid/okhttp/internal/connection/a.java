package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final v f17661a;

    public a(v vVar) {
        this.f17661a = vVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.http.g gVar = (com.mbridge.msdk.thrid.okhttp.internal.http.g) aVar;
        y yVarD = gVar.d();
        g gVarI = gVar.i();
        return gVar.a(yVarD, gVarI, gVarI.a(this.f17661a, aVar, !yVarD.e().equals("GET")), gVarI.c());
    }
}
