package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@SuppressLint({"CI_StaticFieldLeak"})
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6648a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final b f6649b;

    /* renamed from: c, reason: collision with root package name */
    protected a f6650c;

    /* renamed from: d, reason: collision with root package name */
    protected File f6651d;

    /* renamed from: e, reason: collision with root package name */
    protected List<String> f6652e;

    static {
        new f();
        f6649b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f6650c = aVar;
        this.f6651d = file;
        this.f6652e = list;
    }
}
