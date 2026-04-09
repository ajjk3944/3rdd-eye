package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6538a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f6539b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f6540c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6541d;

    public m(ContentResolver contentResolver, Uri uri, boolean z3) {
        this.f6540c = contentResolver;
        this.f6539b = uri;
        this.f6538a = z3;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f6541d;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.i iVar, c cVar) {
        try {
            Object objF = f(this.f6540c, this.f6539b);
            this.f6541d = objF;
            cVar.f(objF);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            cVar.c(e2);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
