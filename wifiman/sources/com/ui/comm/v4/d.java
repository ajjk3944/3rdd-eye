package com.ui.comm.v4;

import Zg.AbstractC3689v;
import Zg.U;
import com.ui.binme.BinaryMessage;
import com.ui.comm.v4.UiCommV4Error;
import com.ui.comm.v4.UiCommV4MessageHeaderJsonSerializer;
import com.ui.comm.v4.UiCommV4Specs$Header;
import com.ui.comm.v4.a;
import com.ui.comm.v4.b;
import e9.InterfaceC5431c;
import g9.C5882b;
import g9.EnumC5883c;
import g9.InterfaceC5881a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public final class d implements InterfaceC5431c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41318a;

    /* renamed from: b, reason: collision with root package name */
    private final UiCommV4MessageHeaderJsonSerializer f41319b = new com.ui.comm.v4.c();

    /* renamed from: c, reason: collision with root package name */
    private final BinaryMessage.e f41320c = BinaryMessage.e.f41070a.a();

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5881a f41321d = new C5882b();

    /* renamed from: e, reason: collision with root package name */
    private final Map f41322e;

    private static final class a implements InterfaceC5431c.a.InterfaceC1734a {

        /* renamed from: a, reason: collision with root package name */
        private final String f41323a;

        /* renamed from: b, reason: collision with root package name */
        private final String f41324b;

        /* renamed from: c, reason: collision with root package name */
        private final List f41325c;

        public a(String guid, String requestType, List packets) {
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(requestType, "requestType");
            AbstractC6492s.i(packets, "packets");
            this.f41323a = guid;
            this.f41324b = requestType;
            this.f41325c = packets;
        }

        @Override // e9.InterfaceC5431c.a
        public List a() {
            return this.f41325c;
        }

        public String toString() {
            return "PACKED [" + this.f41323a + "] --- " + this.f41324b + " -- NO RESPONSE EXPECTED";
        }
    }

    private static final class b implements InterfaceC5431c.a.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f41326a;

        /* renamed from: b, reason: collision with root package name */
        private final String f41327b;

        /* renamed from: c, reason: collision with root package name */
        private final String f41328c;

        /* renamed from: d, reason: collision with root package name */
        private final List f41329d;

        public b(String guid, String requestType, String responseType, List packets) {
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(requestType, "requestType");
            AbstractC6492s.i(responseType, "responseType");
            AbstractC6492s.i(packets, "packets");
            this.f41326a = guid;
            this.f41327b = requestType;
            this.f41328c = responseType;
            this.f41329d = packets;
        }

        @Override // e9.InterfaceC5431c.a
        public List a() {
            return this.f41329d;
        }

        @Override // e9.InterfaceC5431c.a.b
        public boolean b(InterfaceC5431c.b result) {
            AbstractC6492s.i(result, "result");
            if (result instanceof c) {
                c cVar = (c) result;
                if (AbstractC6492s.d(cVar.a(), this.f41326a)) {
                    if (AbstractC6492s.d(this.f41328c, cVar.c())) {
                        return true;
                    }
                    throw new UiCommV4Error.InvalidResponse("UiCommV4 requires responses on type '" + this.f41327b + "' have type '" + this.f41328c + "' but was " + cVar.c(), null, 2, null);
                }
            }
            return false;
        }

        public String toString() {
            return "PACKED [" + this.f41326a + "] --- " + this.f41327b + " -- EXPECTED RESPONSE " + this.f41328c;
        }
    }

    private static final class c implements InterfaceC5431c.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f41330a;

        /* renamed from: b, reason: collision with root package name */
        private final String f41331b;

        /* renamed from: c, reason: collision with root package name */
        private final com.ui.comm.v4.a f41332c;

        public c(String guid, String type, com.ui.comm.v4.a message) {
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(type, "type");
            AbstractC6492s.i(message, "message");
            this.f41330a = guid;
            this.f41331b = type;
            this.f41332c = message;
        }

        public final String a() {
            return this.f41330a;
        }

        @Override // e9.InterfaceC5431c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.ui.comm.v4.a getMessage() {
            return this.f41332c;
        }

        public final String c() {
            return this.f41331b;
        }

        public String toString() {
            return "UNPACKED [" + this.f41330a + "] --- " + this.f41331b + " -- " + getMessage();
        }
    }

    /* renamed from: com.ui.comm.v4.d$d, reason: collision with other inner class name */
    public /* synthetic */ class C1308d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41333a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f41334b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f41335c;

        static {
            int[] iArr = new int[a.h.EnumC1306a.values().length];
            try {
                iArr[a.h.EnumC1306a.SILLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.h.EnumC1306a.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.h.EnumC1306a.VERBOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.h.EnumC1306a.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.h.EnumC1306a.WARN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.h.EnumC1306a.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.h.EnumC1306a.CRITICAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f41333a = iArr;
            int[] iArr2 = new int[BinaryMessage.c.values().length];
            try {
                iArr2[BinaryMessage.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BinaryMessage.c.JSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BinaryMessage.c.BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f41334b = iArr2;
            int[] iArr3 = new int[b.a.values().length];
            try {
                iArr3[b.a.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[b.a.JSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[b.a.BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f41335c = iArr3;
        }
    }

    public d(boolean z10) {
        this.f41318a = z10;
        a.h.EnumC1306a[] enumC1306aArrValues = a.h.EnumC1306a.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(enumC1306aArrValues.length), 16));
        for (a.h.EnumC1306a enumC1306a : enumC1306aArrValues) {
            linkedHashMap.put(c(enumC1306a).getId(), enumC1306a);
        }
        this.f41322e = linkedHashMap;
    }

    private final UiCommV4Specs$Header.Log.a c(a.h.EnumC1306a enumC1306a) {
        switch (C1308d.f41333a[enumC1306a.ordinal()]) {
            case 1:
                return UiCommV4Specs$Header.Log.a.SILLY;
            case 2:
                return UiCommV4Specs$Header.Log.a.DEBUG;
            case 3:
                return UiCommV4Specs$Header.Log.a.VERBOSE;
            case 4:
                return UiCommV4Specs$Header.Log.a.INFO;
            case 5:
                return UiCommV4Specs$Header.Log.a.WARN;
            case 6:
                return UiCommV4Specs$Header.Log.a.ERROR;
            case 7:
                return UiCommV4Specs$Header.Log.a.CRITICAL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final InterfaceC5431c.a d(UiCommV4Specs$Header uiCommV4Specs$Header, byte[] bArr) {
        if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Response ? true : uiCommV4Specs$Header instanceof UiCommV4Specs$Header.HttpResponse ? true : uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Log ? true : uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Event ? true : uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Error ? true : uiCommV4Specs$Header instanceof UiCommV4Specs$Header.CmdResponse) {
            return new a(uiCommV4Specs$Header.getGuid(), uiCommV4Specs$Header.getType().getId(), AbstractC3689v.e(bArr));
        }
        if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Request) {
            return new b(uiCommV4Specs$Header.getGuid(), EnumC5883c.REQUEST.getId(), EnumC5883c.RESPONSE.getId(), AbstractC3689v.e(bArr));
        }
        if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.HttpRequest) {
            return new b(uiCommV4Specs$Header.getGuid(), EnumC5883c.HTTP_REQUEST.getId(), EnumC5883c.HTTP_RESPONSE.getId(), AbstractC3689v.e(bArr));
        }
        if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Cmd) {
            return new b(uiCommV4Specs$Header.getGuid(), EnumC5883c.CMD.getId(), EnumC5883c.CMD_RESPONSE.getId(), AbstractC3689v.e(bArr));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final com.ui.comm.v4.a f(UiCommV4Specs$Header uiCommV4Specs$Header, com.ui.comm.v4.b bVar) {
        com.ui.comm.v4.a c1305c;
        if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Request) {
            return new a.i(((UiCommV4Specs$Header.Request) uiCommV4Specs$Header).getAction(), bVar);
        }
        if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Response) {
            UiCommV4Specs$Header.Response response = (UiCommV4Specs$Header.Response) uiCommV4Specs$Header;
            if (response.getErrorCode() != 0) {
                return new a.j.C1307a(new a.d(response.getErrorCode(), response.getError()), bVar);
            }
            c1305c = new a.j.b(bVar);
        } else {
            if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.HttpRequest) {
                UiCommV4Specs$Header.HttpRequest httpRequest = (UiCommV4Specs$Header.HttpRequest) uiCommV4Specs$Header;
                String method = httpRequest.getMethod();
                String path = httpRequest.getPath();
                Map headers = httpRequest.getHeaders();
                if (headers == null) {
                    headers = U.h();
                }
                return new a.f(method, path, headers, bVar);
            }
            if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.HttpResponse) {
                UiCommV4Specs$Header.HttpResponse httpResponse = (UiCommV4Specs$Header.HttpResponse) uiCommV4Specs$Header;
                int statusCode = httpResponse.getStatusCode();
                Map headers2 = httpResponse.getHeaders();
                if (headers2 == null) {
                    headers2 = U.h();
                }
                return new a.g(statusCode, headers2, bVar);
            }
            if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Log) {
                UiCommV4Specs$Header.Log log = (UiCommV4Specs$Header.Log) uiCommV4Specs$Header;
                a.h.EnumC1306a enumC1306a = (a.h.EnumC1306a) this.f41322e.get(log.getLevel());
                if (enumC1306a != null) {
                    return new a.h(enumC1306a, bVar);
                }
                throw new UiCommV4Error.HeaderSerialization("Can't deserialize UiCommC4 header. Unkown log level " + log.getLevel(), null, 2, null);
            }
            if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Event) {
                return new a.e(((UiCommV4Specs$Header.Event) uiCommV4Specs$Header).getName(), bVar);
            }
            if (!(uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Error)) {
                if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.Cmd) {
                    return new a.C1303a(bVar);
                }
                if (uiCommV4Specs$Header instanceof UiCommV4Specs$Header.CmdResponse) {
                    return new a.b(((UiCommV4Specs$Header.CmdResponse) uiCommV4Specs$Header).getExitCode(), bVar);
                }
                throw new NoWhenBranchMatchedException();
            }
            UiCommV4Specs$Header.Error error = (UiCommV4Specs$Header.Error) uiCommV4Specs$Header;
            a.d dVar = new a.d(error.getErrorCode(), error.getError());
            int iA = dVar.a();
            c1305c = iA == UiCommV4Specs$Header.Error.a.UNKNOWN_TYPE.getCode() ? new a.c.C1305c(dVar, bVar) : iA == UiCommV4Specs$Header.Error.a.UNSUPPORTED.getCode() ? new a.c.C1304a(dVar, bVar) : iA == UiCommV4Specs$Header.Error.a.NO_REQUEST.getCode() ? new a.c.d(dVar, bVar) : iA == UiCommV4Specs$Header.Error.a.MISMATCHED_TYPE.getCode() ? new a.c.e(dVar, bVar) : new a.c.b(dVar, bVar);
        }
        return c1305c;
    }

    private final UiCommV4Specs$Header g(com.ui.comm.v4.a aVar, String str, long j10) {
        if (aVar instanceof a.i) {
            return new UiCommV4Specs$Header.Request(str, j10, ((a.i) aVar).f());
        }
        if (aVar instanceof a.j.b) {
            return new UiCommV4Specs$Header.Response(str, j10, null, 0);
        }
        if (aVar instanceof a.j.C1307a) {
            a.j.C1307a c1307a = (a.j.C1307a) aVar;
            return new UiCommV4Specs$Header.Response(str, j10, c1307a.f().b(), c1307a.f().a());
        }
        if (aVar instanceof a.f) {
            a.f fVar = (a.f) aVar;
            return new UiCommV4Specs$Header.HttpRequest(str, j10, fVar.g(), fVar.h(), fVar.f());
        }
        if (aVar instanceof a.g) {
            a.g gVar = (a.g) aVar;
            return new UiCommV4Specs$Header.HttpResponse(str, j10, gVar.g(), gVar.f());
        }
        if (aVar instanceof a.h) {
            return new UiCommV4Specs$Header.Log(str, j10, c(((a.h) aVar).f()).getId());
        }
        if (aVar instanceof a.e) {
            return new UiCommV4Specs$Header.Event(str, j10, ((a.e) aVar).f());
        }
        if (aVar instanceof a.c) {
            a.c cVar = (a.c) aVar;
            return new UiCommV4Specs$Header.Error(str, j10, cVar.f().b(), cVar.f().a());
        }
        if (aVar instanceof a.C1303a) {
            return new UiCommV4Specs$Header.Cmd(str, j10);
        }
        if (aVar instanceof a.b) {
            return new UiCommV4Specs$Header.CmdResponse(str, j10, ((a.b) aVar).f());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // e9.InterfaceC5431c
    public InterfaceC5431c.b a(byte[] bytes) {
        b.a aVar;
        AbstractC6492s.i(bytes, "bytes");
        try {
            BinaryMessage binaryMessageB = this.f41320c.b(bytes);
            try {
                UiCommV4Specs$Header uiCommV4Specs$HeaderA = this.f41319b.a(new String(binaryMessageB.b().b(), BinaryMessage.f41053c.b()));
                String guid = uiCommV4Specs$HeaderA.getGuid();
                String id2 = uiCommV4Specs$HeaderA.getType().getId();
                int i10 = C1308d.f41334b[binaryMessageB.a().c().ordinal()];
                if (i10 == 1) {
                    aVar = b.a.STRING;
                } else if (i10 == 2) {
                    aVar = b.a.JSON;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = b.a.BINARY;
                }
                return new c(guid, id2, f(uiCommV4Specs$HeaderA, new com.ui.comm.v4.b(aVar, binaryMessageB.a().b())));
            } catch (UiCommV4MessageHeaderJsonSerializer.Error e10) {
                throw new UiCommV4Error.HeaderSerialization("Failed to deserialized incoming UiCommunication v4 message header", e10);
            }
        } catch (BinaryMessage.Error e11) {
            throw new UiCommV4Error.BinmeSerialization("Failed to deserialized incoming Binme message", e11);
        }
    }

    @Override // e9.InterfaceC5431c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC5431c.a b(com.ui.comm.v4.a message) {
        AbstractC6492s.i(message, "message");
        UiCommV4Specs$Header uiCommV4Specs$HeaderG = g(message, this.f41321d.a(), System.currentTimeMillis());
        try {
            String strB = this.f41319b.b(uiCommV4Specs$HeaderG);
            BinaryMessage.c cVar = BinaryMessage.c.JSON;
            BinaryMessage.b bVarC = message.c();
            if (bVarC == null) {
                bVarC = this.f41318a ? BinaryMessage.b.ENABLED : BinaryMessage.b.DISABLED;
            }
            byte[] bytes = strB.getBytes(BinaryMessage.f41053c.b());
            AbstractC6492s.h(bytes, "this as java.lang.String).getBytes(charset)");
            BinaryMessage.d.b bVar = new BinaryMessage.d.b(cVar, bVarC, bytes);
            int i10 = C1308d.f41335c[message.a().b().ordinal()];
            if (i10 == 1) {
                cVar = BinaryMessage.c.STRING;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = BinaryMessage.c.BINARY;
            }
            BinaryMessage.b bVarB = message.b();
            if (bVarB == null) {
                bVarB = this.f41318a ? BinaryMessage.b.ENABLED : BinaryMessage.b.DISABLED;
            }
            try {
                return d(uiCommV4Specs$HeaderG, this.f41320c.a(new BinaryMessage(bVar, new BinaryMessage.d.a(cVar, bVarB, message.a().a()))));
            } catch (BinaryMessage.Error e10) {
                throw new UiCommV4Error.BinmeSerialization("Failed to serialize outgoing Binme message. Guid: " + uiCommV4Specs$HeaderG.getGuid() + ", type: " + uiCommV4Specs$HeaderG.getType().getId(), e10);
            }
        } catch (UiCommV4MessageHeaderJsonSerializer.Error e11) {
            throw new UiCommV4Error.HeaderSerialization("Failed to serialize UiCommunication v4 message header", e11);
        }
    }
}
