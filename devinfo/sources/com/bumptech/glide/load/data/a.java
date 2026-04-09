package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6515e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ContentResolver contentResolver, Uri uri, boolean z3, int i4) {
        super(contentResolver, uri, z3);
        this.f6515e = i4;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f6515e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.m
    public final void c(Object obj) throws IOException {
        switch (this.f6515e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.m
    public final Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        switch (this.f6515e) {
            case 0:
                boolean z3 = this.f6538a;
                ContentResolver contentResolver2 = this.f6540c;
                AssetFileDescriptor assetFileDescriptorH = (z3 && f4.d.g(uri) && f4.d.f()) ? f4.d.h(contentResolver2, uri) : contentResolver2.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorH != null) {
                    return assetFileDescriptorH;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                boolean z10 = this.f6538a;
                ContentResolver contentResolver3 = this.f6540c;
                AssetFileDescriptor assetFileDescriptorH2 = (z10 && f4.d.g(uri) && f4.d.f()) ? f4.d.h(contentResolver3, uri) : contentResolver3.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorH2 != null) {
                    return assetFileDescriptorH2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }
}
