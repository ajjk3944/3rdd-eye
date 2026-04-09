package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

@SuppressLint({"CI_StaticFieldLeak"})
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6656a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final b f6657b;

    /* renamed from: c, reason: collision with root package name */
    protected a f6658c;

    /* renamed from: d, reason: collision with root package name */
    protected File f6659d;

    /* renamed from: e, reason: collision with root package name */
    protected List<String> f6660e;

    static {
        new f();
        f6657b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f6658c = aVar;
        this.f6659d = file;
        this.f6660e = list;
    }
}
