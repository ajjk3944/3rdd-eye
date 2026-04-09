package ib;

import Zg.AbstractC3689v;
import android.os.Build;
import gg.AbstractC5912b;
import ib.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import mh.InterfaceC6835l;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import ub.C8156c;
import wb.C8294d;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f49124c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final String f49125d = Build.BRAND + " " + Build.MODEL;

    /* renamed from: e, reason: collision with root package name */
    private static final DateFormat f49126e = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssSSS");

    /* renamed from: a, reason: collision with root package name */
    private final String f49127a;

    /* renamed from: b, reason: collision with root package name */
    private final e f49128b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(long j10) {
            String str = d.f49126e.format(new Date(j10));
            AbstractC6492s.h(str, "format(...)");
            return str;
        }

        private a() {
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f49129a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(UploadUrlResponse it) {
            AbstractC6492s.i(it, "it");
            return it.getUploadUrl();
        }
    }

    static final class c implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f49131b;

        c(List list) {
            this.f49131b = list;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(String uploadUrl) {
            AbstractC6492s.i(uploadUrl, "uploadUrl");
            return d.this.f49128b.a(uploadUrl, d.this.f(this.f49131b));
        }
    }

    public d(String appVersion) throws SecurityException {
        AbstractC6492s.i(appVersion, "appVersion");
        this.f49127a = appVersion;
        Object objB = new C8294d("https://crash-report-service.svc.ui.com/v1/", null, null, null, null, null, C8156c.f62925a.d(), null, null, 446, null).d().b(e.class);
        AbstractC6492s.h(objB, "create(...)");
        this.f49128b = (e) objB;
    }

    private final byte[] e(String str, String str2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        ZipEntry zipEntry = new ZipEntry(str2);
        zipEntry.setSize(str.length());
        zipOutputStream.putNextEntry(zipEntry);
        byte[] bytes = str.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        zipOutputStream.write(bytes);
        zipOutputStream.closeEntry();
        Util.m(zipOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Util.m(byteArrayOutputStream);
        AbstractC6492s.f(byteArray);
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultipartBody.Part f(List list) {
        RequestBody requestBodyI = RequestBody.Companion.i(RequestBody.INSTANCE, e(i(list), g()), MediaType.INSTANCE.a("application/zip"), 0, 0, 6, null);
        return MultipartBody.Part.INSTANCE.b("log_file", "logs-" + System.currentTimeMillis() + ".zip", requestBodyI);
    }

    private final String g() {
        return "log_" + this.f49127a + "_" + f49125d + ".txt";
    }

    private final String i(List list) {
        return AbstractC3689v.z0(list, "\n", null, null, 0, null, new InterfaceC6835l() { // from class: ib.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return d.j((h.b) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(h.b it) {
        AbstractC6492s.i(it, "it");
        return f49124c.b(it.d()) + " " + it.b() + " - " + it.c() + ":" + it.a();
    }

    public final AbstractC5912b h(String str, List logs) {
        AbstractC6492s.i(logs, "logs");
        AbstractC5912b abstractC5912bT = this.f49128b.b(new UploadUrlRequest(str == null ? "unset" : str, "unset", this.f49127a, f49125d, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 4080, (DefaultConstructorMarker) null)).A(b.f49129a).t(new c(logs));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }
}
