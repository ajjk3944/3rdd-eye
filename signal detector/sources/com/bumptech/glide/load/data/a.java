package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import java.io.FileNotFoundException;
import java.io.IOException;
import m1.AbstractC2652a;

/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ContentResolver contentResolver, Uri uri, boolean z6, int i) {
        super(contentResolver, uri, z6);
        this.f6537e = i;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f6537e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.m
    public final void d(Object obj) throws IOException {
        switch (this.f6537e) {
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
        switch (this.f6537e) {
            case 0:
                boolean z6 = this.f6560a;
                ContentResolver contentResolver2 = this.f6562c;
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = (!z6 || !AbstractC2652a.a(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver2.openAssetFileDescriptor(uri, "r") : AbstractC2652a.b(contentResolver2, uri);
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                boolean z7 = this.f6560a;
                ContentResolver contentResolver3 = this.f6562c;
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = (!z7 || !AbstractC2652a.a(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver3.openAssetFileDescriptor(uri, "r") : AbstractC2652a.b(contentResolver3, uri);
                if (assetFileDescriptorOpenAssetFileDescriptor2 != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }
}
