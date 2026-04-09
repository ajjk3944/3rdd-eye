package com.ui.wifiman.model.ubiquiti.firmware;

import Mj.w;
import Mj.x;
import Y6.h;
import Y6.r;
import Yg.J;
import Zg.U;
import com.squareup.moshi.JsonDataException;
import com.ui.common.semver.SemVer;
import com.ui.wifiman.model.ubiquiti.firmware.UbiquitiFirmwareClient;
import com.ui.wifiman.model.ubiquiti.firmware.a;
import com.ui.wifiman.model.ubiquiti.firmware.api.ApiUbiquitiFirmware;
import com.ui.wifiman.model.ubiquiti.firmware.api.UbiquitiFirmwareApi;
import fd.InterfaceC5808b;
import gg.D;
import gg.EnumC5911a;
import gg.i;
import gg.j;
import gg.k;
import gg.z;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jh.AbstractC6329b;
import kg.InterfaceC6468e;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.HttpException;

/* loaded from: classes4.dex */
public final class b implements UbiquitiFirmwareClient {

    /* renamed from: f, reason: collision with root package name */
    public static final a f43901f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5808b f43902a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43903b;

    /* renamed from: c, reason: collision with root package name */
    private final r f43904c;

    /* renamed from: d, reason: collision with root package name */
    private final UbiquitiFirmwareApi f43905d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f43906e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.ui.wifiman.model.ubiquiti.firmware.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C1503b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43907a;

        static {
            int[] iArr = new int[a.EnumC1501a.values().length];
            try {
                iArr[a.EnumC1501a.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC1501a.BETA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC1501a.INTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43907a = iArr;
        }
    }

    static final class c implements n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            UbiquitiFirmwareClient.Error errorM = b.this.m(error);
            if (errorM != null) {
                error = errorM;
            }
            return i.k0(error);
        }
    }

    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            UbiquitiFirmwareClient.Error errorM = b.this.m(error);
            if (errorM != null) {
                error = errorM;
            }
            return z.p(error);
        }
    }

    static final class e implements n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(UbiquitiFirmwareApi.Firmwares response) {
            List fw;
            AbstractC6492s.i(response, "response");
            UbiquitiFirmwareApi.FwList fwList = response.getFwList();
            if (fwList != null && (fw = fwList.getFw()) != null) {
                b bVar = b.this;
                ArrayList arrayList = new ArrayList();
                Iterator it = fw.iterator();
                while (it.hasNext()) {
                    com.ui.wifiman.model.ubiquiti.firmware.a aVarI = bVar.i((ApiUbiquitiFirmware) it.next());
                    if (aVarI != null) {
                        arrayList.add(aVarI);
                    }
                }
                z zVarZ = z.z(arrayList);
                if (zVarZ != null) {
                    return zVarZ;
                }
            }
            return z.p(new UbiquitiFirmwareClient.Error.InvalidResponse("Missing firmwares in response", null, 2, 0 == true ? 1 : 0));
        }
    }

    static final class f implements n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            UbiquitiFirmwareClient.Error errorM = b.this.m(error);
            if (errorM != null) {
                error = errorM;
            }
            return z.p(error);
        }
    }

    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43912a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(UbiquitiFirmwareApi.TokenResponse it) {
            z zVarZ;
            AbstractC6492s.i(it, "it");
            String token = it.getToken();
            return (token == null || (zVarZ = z.z(token)) == null) ? z.p(new UbiquitiFirmwareClient.Error.InvalidResponse("Missing token in response", null, 2, 0 == true ? 1 : 0)) : zVarZ;
        }
    }

    public b(InterfaceC5808b okHttpClientHolder, String str) throws SecurityException {
        AbstractC6492s.i(okHttpClientHolder, "okHttpClientHolder");
        this.f43902a = okHttpClientHolder;
        this.f43903b = str;
        r rVarC = new r.a().c();
        this.f43904c = rVarC;
        Object objB = new x.b().b(Pj.a.g(rVarC)).c("https://fw-update.ui.com/").a(Nj.g.e()).e().b(UbiquitiFirmwareApi.class);
        AbstractC6492s.h(objB, "create(...)");
        this.f43905d = (UbiquitiFirmwareApi) objB;
        this.f43906e = U.j(Yg.z.a(ApiUbiquitiFirmware.a.RELEASE.getId(), a.EnumC1501a.PROD), Yg.z.a(ApiUbiquitiFirmware.a.BETA.getId(), a.EnumC1501a.BETA), Yg.z.a(ApiUbiquitiFirmware.a.INTERNAL.getId(), a.EnumC1501a.INTERNAL));
    }

    private final ApiUbiquitiFirmware.a h(a.EnumC1501a enumC1501a) {
        int i10 = C1503b.f43907a[enumC1501a.ordinal()];
        if (i10 == 1) {
            return ApiUbiquitiFirmware.a.RELEASE;
        }
        if (i10 == 2) {
            return ApiUbiquitiFirmware.a.BETA;
        }
        if (i10 == 3) {
            return ApiUbiquitiFirmware.a.INTERNAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.model.ubiquiti.firmware.a i(ApiUbiquitiFirmware apiUbiquitiFirmware) {
        a.EnumC1501a enumC1501a;
        Integer versionMajor;
        ApiUbiquitiFirmware.Link data;
        String id2 = apiUbiquitiFirmware.getId();
        if (id2 != null && !t.m0(id2)) {
            if (apiUbiquitiFirmware.getFileSize() != null && apiUbiquitiFirmware.getFileSize().longValue() >= 1) {
                String product = apiUbiquitiFirmware.getProduct();
                if (product != null && !t.m0(product)) {
                    ApiUbiquitiFirmware.Links links = apiUbiquitiFirmware.getLinks();
                    String url = (links == null || (data = links.getData()) == null) ? null : data.getUrl();
                    if (url != null && !t.m0(url)) {
                        String id3 = apiUbiquitiFirmware.getId();
                        String channel = apiUbiquitiFirmware.getChannel();
                        if (channel != null && (enumC1501a = (a.EnumC1501a) this.f43906e.get(channel)) != null && (versionMajor = apiUbiquitiFirmware.getVersionMajor()) != null) {
                            int iIntValue = versionMajor.intValue();
                            Integer versionMinor = apiUbiquitiFirmware.getVersionMinor();
                            if (versionMinor != null) {
                                int iIntValue2 = versionMinor.intValue();
                                Integer versionPatch = apiUbiquitiFirmware.getVersionPatch();
                                if (versionPatch != null) {
                                    SemVer semVer = new SemVer(iIntValue, iIntValue2, versionPatch.intValue(), apiUbiquitiFirmware.getVersionPrerelease(), null, 16, null);
                                    String product2 = apiUbiquitiFirmware.getProduct();
                                    long jLongValue = apiUbiquitiFirmware.getFileSize().longValue();
                                    ApiUbiquitiFirmware.Links links2 = apiUbiquitiFirmware.getLinks();
                                    AbstractC6492s.f(links2);
                                    ApiUbiquitiFirmware.Link data2 = links2.getData();
                                    AbstractC6492s.f(data2);
                                    String url2 = data2.getUrl();
                                    AbstractC6492s.f(url2);
                                    String checksum = apiUbiquitiFirmware.getChecksum();
                                    if (checksum == null) {
                                        return null;
                                    }
                                    return new com.ui.wifiman.model.ubiquiti.firmware.a(id3, enumC1501a, semVer, product2, jLongValue, url2, checksum);
                                }
                            }
                        }
                    }
                }
                return null;
            }
            Z7.b.j("FW " + apiUbiquitiFirmware.getId() + " has invalid filesize: " + apiUbiquitiFirmware.getFileSize(), null, null, 6, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(b bVar, com.ui.wifiman.model.ubiquiti.firmware.a aVar, File file, j emitter) {
        Long lS;
        AbstractC6492s.i(emitter, "emitter");
        try {
            OkHttpClient okHttpClientA = bVar.f43902a.a();
            Request.Builder builderH = new Request.Builder().h(aVar.d());
            String str = bVar.f43903b;
            if (str != null) {
                String str2 = String.format("Bearer token:%s", Arrays.copyOf(new Object[]{str}, 1));
                AbstractC6492s.h(str2, "format(...)");
                Request.Builder builderC = builderH.c("Authorization", str2);
                if (builderC != null) {
                    builderH = builderC;
                }
            }
            Response responseG = okHttpClientA.b(builderH.b()).g();
            final ResponseBody body = responseG.getBody();
            int i10 = 2;
            Throwable th2 = null;
            byte b10 = 0;
            if (body == null) {
                new UbiquitiFirmwareClient.Error.IO("FW file Response doesn't contain a file", th2, i10, b10 == true ? 1 : 0);
                return;
            }
            String strC = Response.C(responseG, "Content-Length", null, 2, null);
            long jC = (strC == null || (lS = t.s(strC)) == null) ? aVar.c() : lS.longValue();
            final FileOutputStream fileOutputStream = new FileOutputStream(file);
            emitter.d(new InterfaceC6468e() { // from class: Wd.d
                @Override // kg.InterfaceC6468e
                public final void cancel() throws IOException {
                    com.ui.wifiman.model.ubiquiti.firmware.b.k(fileOutputStream, body);
                }
            });
            BufferedInputStream bufferedInputStream = new BufferedInputStream(body.a());
            try {
                byte[] bArr = new byte[8096];
                long j10 = 0;
                while (true) {
                    int i11 = bufferedInputStream.read(bArr);
                    if (i11 == -1) {
                        J j11 = J.f24997a;
                        AbstractC6329b.a(bufferedInputStream, null);
                        emitter.h(Float.valueOf(1.0f));
                        emitter.a();
                        return;
                    }
                    j10 += i11;
                    fileOutputStream.write(bArr, 0, i11);
                    emitter.h(Float.valueOf(j10 / jC));
                }
            } finally {
            }
        } catch (IOException e10) {
            emitter.c(new UbiquitiFirmwareClient.Error.IO("Failed to download FW file", e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(FileOutputStream fileOutputStream, ResponseBody responseBody) throws IOException {
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
            Z7.b.j("Failed to close FW download output file stream", null, null, 6, null);
        }
        try {
            responseBody.close();
        } catch (IOException unused2) {
            Z7.b.j("Failed to close FW download response body", null, null, 6, null);
        }
    }

    private final UbiquitiFirmwareClient.Error.ApiError l(HttpException httpException) {
        UbiquitiFirmwareApi.Error error;
        String message;
        ResponseBody responseBodyD;
        h hVarC = new r.a().c().c(UbiquitiFirmwareApi.Error.class);
        AbstractC6492s.h(hVarC, "adapter(...)");
        w wVarD = httpException.d();
        if (wVarD == null) {
            return null;
        }
        try {
            responseBodyD = wVarD.d();
        } catch (JsonDataException e10) {
            Z7.b.j("UI FW API - failed to parse error", e10, null, 4, null);
        } catch (IOException e11) {
            Z7.b.j("UI FW API - failed to parse error", e11, null, 4, null);
        }
        if (responseBodyD != null) {
            try {
                error = (UbiquitiFirmwareApi.Error) hVarC.c(responseBodyD.C());
                AbstractC6329b.a(responseBodyD, null);
            } finally {
            }
        } else {
            error = null;
        }
        int iB = wVarD.b();
        Integer statusCode = error != null ? error.getStatusCode() : null;
        String error2 = error != null ? error.getError() : null;
        if (error == null || (message = error.getMessage()) == null) {
            message = "No error message provided";
        }
        return new UbiquitiFirmwareClient.Error.ApiError(iB, statusCode, error2, message, httpException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UbiquitiFirmwareClient.Error m(Throwable th2) {
        if (th2 instanceof HttpException) {
            return l((HttpException) th2);
        }
        if (th2 instanceof IOException) {
            return new UbiquitiFirmwareClient.Error.IO("IO Error", th2);
        }
        return null;
    }

    @Override // com.ui.wifiman.model.ubiquiti.firmware.UbiquitiFirmwareClient
    public z a(a.EnumC1501a enumC1501a, String str) {
        String str2;
        UbiquitiFirmwareApi ubiquitiFirmwareApi = this.f43905d;
        String str3 = this.f43903b;
        if (str3 != null) {
            str2 = String.format("Bearer token:%s", Arrays.copyOf(new Object[]{str3}, 1));
            AbstractC6492s.h(str2, "format(...)");
        } else {
            str2 = null;
        }
        ArrayList arrayList = new ArrayList();
        if (enumC1501a != null) {
            arrayList.add(new UbiquitiFirmwareApi.a.C1502a(h(enumC1501a)).b());
        }
        if (str != null) {
            arrayList.add(new UbiquitiFirmwareApi.a.b(str).b());
        }
        J j10 = J.f24997a;
        z zVarE = ubiquitiFirmwareApi.b(str2, arrayList).F(new d()).s(new e()).O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        return zVarE;
    }

    @Override // com.ui.wifiman.model.ubiquiti.firmware.UbiquitiFirmwareClient
    public z b(String userId, String ubicAuth) {
        AbstractC6492s.i(userId, "userId");
        AbstractC6492s.i(ubicAuth, "ubicAuth");
        z zVarE = this.f43905d.a(new UbiquitiFirmwareApi.TokenRequest(userId, ubicAuth)).F(new f()).s(g.f43912a).O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        return zVarE;
    }

    @Override // com.ui.wifiman.model.ubiquiti.firmware.UbiquitiFirmwareClient
    public i c(final com.ui.wifiman.model.ubiquiti.firmware.a fw, final File destination) {
        AbstractC6492s.i(fw, "fw");
        AbstractC6492s.i(destination, "destination");
        i iVarX0 = i.N(new k() { // from class: Wd.e
            @Override // gg.k
            public final void a(j jVar) {
                com.ui.wifiman.model.ubiquiti.firmware.b.j(this.f23870a, fw, destination, jVar);
            }
        }, EnumC5911a.LATEST).f1(new c()).F1(Gg.a.d()).X0(Gg.a.a());
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        return iVarX0;
    }
}
