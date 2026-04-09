package com.ui.comm.v4;

import Y6.h;
import Y6.r;
import Y6.w;
import com.squareup.moshi.JsonDataException;
import com.ui.comm.v4.UiCommV4MessageHeaderJsonSerializer;
import com.ui.comm.v4.UiCommV4Specs$Header;
import g9.EnumC5883c;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;

/* loaded from: classes3.dex */
public final class c implements UiCommV4MessageHeaderJsonSerializer {

    /* renamed from: a, reason: collision with root package name */
    private final r f41316a;

    /* renamed from: b, reason: collision with root package name */
    private final h f41317b;

    public c() {
        r moshi = new r.a().a(Z6.a.b(UiCommV4Specs$Header.class, "type").c(UiCommV4Specs$Header.Request.class, EnumC5883c.REQUEST.getId()).c(UiCommV4Specs$Header.Response.class, EnumC5883c.RESPONSE.getId()).c(UiCommV4Specs$Header.HttpRequest.class, EnumC5883c.HTTP_REQUEST.getId()).c(UiCommV4Specs$Header.HttpResponse.class, EnumC5883c.HTTP_RESPONSE.getId()).c(UiCommV4Specs$Header.Log.class, EnumC5883c.LOG.getId()).c(UiCommV4Specs$Header.Event.class, EnumC5883c.EVENT.getId()).c(UiCommV4Specs$Header.Error.class, EnumC5883c.ERROR.getId()).c(UiCommV4Specs$Header.Cmd.class, EnumC5883c.CMD.getId()).c(UiCommV4Specs$Header.CmdResponse.class, EnumC5883c.CMD_RESPONSE.getId())).c();
        this.f41316a = moshi;
        AbstractC6492s.h(moshi, "moshi");
        this.f41317b = w.a(moshi, O.l(UiCommV4Specs$Header.class));
    }

    @Override // com.ui.comm.v4.UiCommV4MessageHeaderJsonSerializer
    public UiCommV4Specs$Header a(String message) {
        AbstractC6492s.i(message, "message");
        try {
            UiCommV4Specs$Header uiCommV4Specs$Header = (UiCommV4Specs$Header) this.f41317b.c(message);
            if (uiCommV4Specs$Header != null) {
                return uiCommV4Specs$Header;
            }
            throw new UiCommV4MessageHeaderJsonSerializer.Error.JsonParsingFailed("no JSON found in message", null, 2, null);
        } catch (JsonDataException e10) {
            throw new UiCommV4MessageHeaderJsonSerializer.Error.JsonParsingFailed("the JSON is well-formed, but doesn’t match the expected format", e10);
        } catch (IOException e11) {
            throw new UiCommV4MessageHeaderJsonSerializer.Error.JsonParsingFailed("there is an error reading the JSON, or it is malformed", e11);
        }
    }

    @Override // com.ui.comm.v4.UiCommV4MessageHeaderJsonSerializer
    public String b(UiCommV4Specs$Header message) {
        AbstractC6492s.i(message, "message");
        String strI = this.f41317b.i(message);
        AbstractC6492s.h(strI, "messageAdapter.toJson(message)");
        return strI;
    }
}
