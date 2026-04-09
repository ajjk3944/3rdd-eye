package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f22316b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f22317c;

    /* renamed from: d, reason: collision with root package name */
    public T f22318d;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f22317c = contentResolver;
        this.f22316b = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t10 = this.f22318d;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public final L2.a d() {
        return L2.a.LOCAL;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, d.a<? super T> aVar) {
        try {
            ?? r32 = (T) f(this.f22317c, this.f22316b);
            this.f22318d = r32;
            aVar.f(r32);
        } catch (FileNotFoundException e4) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e4);
            }
            aVar.c(e4);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
