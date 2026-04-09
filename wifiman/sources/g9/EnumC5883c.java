package g9;

/* renamed from: g9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC5883c {
    REQUEST("request"),
    RESPONSE("response"),
    HTTP_REQUEST("httpRequest"),
    HTTP_RESPONSE("httpResponse"),
    LOG("log"),
    EVENT("event"),
    ERROR("error"),
    CMD("cmd"),
    CMD_RESPONSE("cmdResponse");


    /* renamed from: id, reason: collision with root package name */
    private final String f47754id;

    EnumC5883c(String str) {
        this.f47754id = str;
    }

    public final String getId() {
        return this.f47754id;
    }
}
