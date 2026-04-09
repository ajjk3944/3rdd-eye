package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6560a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f6561b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f6562c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6563d;

    public m(ContentResolver contentResolver, Uri uri, boolean z6) {
        this.f6562c = contentResolver;
        this.f6561b = uri;
        this.f6560a = z6;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f6563d;
        if (obj != null) {
            try {
                d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    public abstract void d(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, c cVar) {
        try {
            Object objF = f(this.f6562c, this.f6561b);
            this.f6563d = objF;
            cVar.f(objF);
        } catch (FileNotFoundException e6) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e6);
            }
            cVar.d(e6);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);
}
