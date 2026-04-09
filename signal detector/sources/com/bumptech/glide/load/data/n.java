package com.bumptech.glide.load.data;

import android.content.UriMatcher;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final UriMatcher f6564e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6564e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.m
    public final void d(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    @Override // com.bumptech.glide.load.data.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(android.content.ContentResolver r4, android.net.Uri r5) throws java.io.IOException {
        /*
            r3 = this;
            android.content.UriMatcher r0 = com.bumptech.glide.load.data.n.f6564e
            int r0 = r0.match(r5)
            r1 = 1
            if (r0 == r1) goto L62
            r2 = 3
            if (r0 == r2) goto L5d
            r2 = 5
            if (r0 == r2) goto L62
            boolean r0 = r3.f6560a
            if (r0 == 0) goto L58
            boolean r0 = m1.AbstractC2652a.a(r5)
            if (r0 == 0) goto L58
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L58
            int r0 = Z4.b.D()
            r1 = 17
            if (r0 < r1) goto L58
            android.content.res.AssetFileDescriptor r4 = m1.AbstractC2652a.b(r4, r5)
            if (r4 == 0) goto L44
            java.io.FileInputStream r4 = r4.createInputStream()     // Catch: java.io.IOException -> L32
            goto L6c
        L32:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Exception -> L36
        L36:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r0 = "Unable to create stream"
            r4.<init>(r0)
            java.lang.Throwable r4 = r4.initCause(r5)
            java.io.FileNotFoundException r4 = (java.io.FileNotFoundException) r4
            throw r4
        L44:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FileDescriptor is null for: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L58:
            java.io.InputStream r4 = r4.openInputStream(r5)
            goto L6c
        L5d:
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r5, r1)
            goto L6c
        L62:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r4, r5)
            if (r0 == 0) goto L83
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r0, r1)
        L6c:
            if (r4 == 0) goto L6f
            return r4
        L6f:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InputStream is null for "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L83:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.n.f(android.content.ContentResolver, android.net.Uri):java.lang.Object");
    }
}
