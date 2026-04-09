package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.geckox.e.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f9126a;

    /* renamed from: b, reason: collision with root package name */
    private String f9127b;

    /* renamed from: c, reason: collision with root package name */
    private volatile File f9128c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Long f9129d;

    /* renamed from: e, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a f9130e;

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f9131f = new AtomicBoolean(false);

    public a(String str, String str2) {
        this.f9126a = str;
        this.f9127b = str2;
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(String str) throws Exception {
        if (this.f9130e != null) {
            return this.f9130e;
        }
        File fileE = e(str);
        if (fileE == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileE, "res.macv");
        File file2 = new File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f9130e = new c(fileE);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
            }
            this.f9130e = new com.bykv.vk.openvk.preload.geckox.e.a.b(fileE);
        }
        return this.f9130e;
    }

    private synchronized File e(String str) throws Exception {
        if (this.f9128c != null) {
            return this.f9128c;
        }
        if (this.f9129d != null && this.f9129d.longValue() == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9126a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb.toString());
        try {
            if (this.f9129d == null) {
                this.f9129d = g.a(new File(this.f9126a, str));
            }
            if (this.f9129d == null) {
                this.f9129d = -1L;
                bVarA.a();
                return null;
            }
            File file = new File(this.f9126a, str2 + str + str2 + this.f9129d + str2 + "using.lock");
            this.f9128c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            File file2 = this.f9128c;
            bVarA.a();
            return file2;
        } catch (Throwable th) {
            bVarA.a();
            throw th;
        }
    }

    public final InputStream a(String str) throws Exception {
        return d(this.f9127b).a(a(this.f9127b, str));
    }

    public final boolean b(String str) throws Exception {
        return d(this.f9127b).b(a(this.f9127b, str));
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
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    public final String b() {
        return this.f9127b;
    }

    public final Long a() {
        return this.f9129d;
    }

    public final void c() throws Exception {
        if (this.f9131f.getAndSet(true)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9126a);
        String str = File.separator;
        sb.append(str);
        sb.append(this.f9127b);
        sb.append(str);
        sb.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f9128c == null) {
                return;
            }
            com.bykv.vk.openvk.preload.geckox.f.c.b(this.f9128c.getAbsolutePath() + str + "using.lock");
            bVarA.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.f9126a + str + this.f9127b);
        } finally {
            bVarA.a();
        }
    }
}
