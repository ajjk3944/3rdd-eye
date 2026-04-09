package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.geckox.e.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f6732a;

    /* renamed from: b, reason: collision with root package name */
    private String f6733b;

    /* renamed from: c, reason: collision with root package name */
    private volatile File f6734c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Long f6735d;

    /* renamed from: e, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a f6736e;

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f6737f = new AtomicBoolean(false);

    public a(String str, String str2) {
        this.f6732a = str;
        this.f6733b = str2;
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(String str) throws Exception {
        if (this.f6736e != null) {
            return this.f6736e;
        }
        File fileE = e(str);
        if (fileE == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileE, "res.macv");
        File file2 = new File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f6736e = new c(fileE);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
            }
            this.f6736e = new com.bykv.vk.openvk.preload.geckox.e.a.b(fileE);
        }
        return this.f6736e;
    }

    private synchronized File e(String str) throws Exception {
        if (this.f6734c != null) {
            return this.f6734c;
        }
        if (this.f6735d != null && this.f6735d.longValue() == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6732a);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        try {
            if (this.f6735d == null) {
                this.f6735d = g.a(new File(this.f6732a, str));
            }
            if (this.f6735d == null) {
                this.f6735d = -1L;
                bVarA.a();
                return null;
            }
            File file = new File(this.f6732a, str2 + str + str2 + this.f6735d + str2 + "using.lock");
            this.f6734c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            File file2 = this.f6734c;
            bVarA.a();
            return file2;
        } catch (Throwable th2) {
            bVarA.a();
            throw th2;
        }
    }

    public final InputStream a(String str) throws Exception {
        return d(this.f6733b).a(a(this.f6733b, str));
    }

    public final boolean b(String str) throws Exception {
        return d(this.f6733b).b(a(this.f6733b, str));
    }

    public final int c(String str) {
        try {
            File file = new File(e(str), "res");
            if (!file.exists() || !file.isDirectory()) {
                return 0;
            }
            int length = file.listFiles().length;
            if (length > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    public final String b() {
        return this.f6733b;
    }

    public final Long a() {
        return this.f6735d;
    }

    public final void c() throws Exception {
        if (this.f6737f.getAndSet(true)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6732a);
        String str = File.separator;
        sb2.append(str);
        sb2.append(this.f6733b);
        sb2.append(str);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f6734c == null) {
                return;
            }
            com.bykv.vk.openvk.preload.geckox.f.c.b(this.f6734c.getAbsolutePath() + str + "using.lock");
            bVarA.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.f6732a + str + this.f6733b);
        } finally {
            bVarA.a();
        }
    }
}
