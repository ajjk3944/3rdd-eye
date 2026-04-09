package com.squareup.picasso;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public class i extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5905a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5906b;

    public /* synthetic */ i(Context context, int i10) {
        this.f5905a = i10;
        this.f5906b = context;
    }

    @Override // com.squareup.picasso.m0
    public boolean b(k0 k0Var) {
        switch (this.f5905a) {
            case 0:
                return "content".equals(k0Var.f5918b.getScheme());
            case 1:
                if (k0Var.f5919c != 0) {
                    return true;
                }
                return "android.resource".equals(k0Var.f5918b.getScheme());
            default:
                Uri uri = k0Var.f5918b;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
        }
    }

    @Override // com.squareup.picasso.m0
    public qb.p e(k0 k0Var) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        Resources resources;
        switch (this.f5905a) {
            case 0:
                return new qb.p(((Context) this.f5906b).getContentResolver().openInputStream(k0Var.f5918b), c0.DISK);
            case 1:
                Context context = (Context) this.f5906b;
                int i10 = k0Var.f5919c;
                Uri uri = k0Var.f5918b;
                if (i10 != 0 || uri == null) {
                    resources = context.getResources();
                } else {
                    String authority = uri.getAuthority();
                    if (authority == null) {
                        throw new FileNotFoundException("No package provided: " + uri);
                    }
                    try {
                        resources = context.getPackageManager().getResourcesForApplication(authority);
                    } catch (PackageManager.NameNotFoundException unused) {
                        throw new FileNotFoundException("Unable to obtain resources for package: " + uri);
                    }
                }
                int identifier = k0Var.f5919c;
                if (identifier == 0 && uri != null) {
                    String authority2 = uri.getAuthority();
                    if (authority2 == null) {
                        throw new FileNotFoundException("No package provided: " + uri);
                    }
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments == null || pathSegments.isEmpty()) {
                        throw new FileNotFoundException("No path segments: " + uri);
                    }
                    if (pathSegments.size() == 1) {
                        try {
                            identifier = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused2) {
                            throw new FileNotFoundException("Last path segment is not a resource ID: " + uri);
                        }
                    } else {
                        if (pathSegments.size() != 2) {
                            throw new FileNotFoundException("More than two path segments: " + uri);
                        }
                        identifier = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    }
                }
                BitmapFactory.Options optionsC = m0.c(k0Var);
                if (optionsC != null && optionsC.inJustDecodeBounds) {
                    BitmapFactory.decodeResource(resources, identifier, optionsC);
                    m0.a(k0Var.f5921e, k0Var.f5922f, optionsC.outWidth, optionsC.outHeight, optionsC, k0Var);
                }
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, identifier, optionsC);
                c0 c0Var = c0.DISK;
                if (bitmapDecodeResource != null) {
                    return new qb.p(bitmapDecodeResource, (InputStream) null, c0Var, 0);
                }
                throw new NullPointerException("bitmap == null");
            default:
                return new qb.p(((AssetManager) this.f5906b).open(k0Var.f5918b.toString().substring(22)), c0.DISK);
        }
    }

    public i(Context context) {
        this.f5905a = 2;
        this.f5906b = context.getAssets();
    }
}
