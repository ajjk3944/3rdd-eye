package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f6550a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f6551b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6552c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6553d;

    public j(AssetManager assetManager, String str, int i) {
        this.f6553d = i;
        this.f6551b = assetManager;
        this.f6550a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f6553d) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() throws IOException {
        Object obj = this.f6552c;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f6553d) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, c cVar) throws IOException {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f6551b;
            String str = this.f6550a;
            switch (this.f6553d) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f6552c = objOpenFd;
            cVar.f(objOpenFd);
        } catch (IOException e6) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e6);
            }
            cVar.d(e6);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
