package io.sentry;

import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class a4 implements io.sentry.util.runtime.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11465a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f11466d;

    public /* synthetic */ a4(File file, int i10) {
        this.f11465a = i10;
        this.f11466d = file;
    }

    @Override // io.sentry.util.runtime.a
    public final Object run() {
        switch (this.f11465a) {
            case 0:
                return Boolean.valueOf(this.f11466d.mkdirs());
            case 1:
                return Boolean.valueOf(this.f11466d.mkdirs());
            case 2:
                return Boolean.valueOf(this.f11466d.mkdirs());
            case 3:
                return Boolean.valueOf(this.f11466d.exists());
            default:
                return Boolean.valueOf(this.f11466d.delete());
        }
    }
}
