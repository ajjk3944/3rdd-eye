package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f6528a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f6529b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6531d;

    public j(AssetManager assetManager, String str, int i4) {
        this.f6531d = i4;
        this.f6529b = assetManager;
        this.f6528a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f6531d) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() throws IOException {
        Object obj = this.f6530c;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f6531d) {
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
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.i iVar, c cVar) throws IOException {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f6529b;
            String str = this.f6528a;
            switch (this.f6531d) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f6530c = objOpenFd;
            cVar.f(objOpenFd);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            cVar.c(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
