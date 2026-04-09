package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

@SuppressLint({"CI_StaticFieldLeak"})
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f9035a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final b f9036b;

    /* renamed from: c, reason: collision with root package name */
    protected a f9037c;

    /* renamed from: d, reason: collision with root package name */
    protected File f9038d;

    /* renamed from: e, reason: collision with root package name */
    protected List<String> f9039e;

    static {
        new f();
        f9036b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f9037c = aVar;
        this.f9038d = file;
        this.f9039e = list;
    }
}
