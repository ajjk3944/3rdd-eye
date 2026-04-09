package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class v extends i {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f5987d = {"orientation"};

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Context context, int i10) {
        super(context, 0);
        this.f5988c = i10;
    }

    @Override // com.squareup.picasso.i, com.squareup.picasso.m0
    public final boolean b(k0 k0Var) {
        switch (this.f5988c) {
            case 0:
                Uri uri = k0Var.f5918b;
                return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
            default:
                return "file".equals(k0Var.f5918b.getScheme());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[PHI: r3
  0x0074: PHI (r3v10 android.database.Cursor) = (r3v1 android.database.Cursor), (r3v11 android.database.Cursor) binds: [B:35:0x0083, B:26:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    @Override // com.squareup.picasso.i, com.squareup.picasso.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final qb.p e(com.squareup.picasso.k0 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.v.e(com.squareup.picasso.k0):qb.p");
    }
}
