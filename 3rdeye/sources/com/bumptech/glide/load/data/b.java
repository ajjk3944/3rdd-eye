package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final String f22295b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager f22296c;

    /* renamed from: d, reason: collision with root package name */
    public T f22297d;

    public b(AssetManager assetManager, String str) {
        this.f22296c = assetManager;
        this.f22295b = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t10 = this.f22297d;
        if (t10 == null) {
            return;
        }
        try {
            c(t10);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public final L2.a d() {
        return L2.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f22296c, this.f22295b);
            this.f22297d = tF;
            aVar.f(tF);
        } catch (IOException e4) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e4);
            }
            aVar.c(e4);
        }
    }

    public abstract T f(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
