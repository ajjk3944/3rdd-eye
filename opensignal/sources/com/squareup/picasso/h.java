package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class h extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final UriMatcher f5902b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5903a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f5902b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public h(Context context) {
        this.f5903a = context;
    }

    @Override // com.squareup.picasso.m0
    public final boolean b(k0 k0Var) {
        Uri uri = k0Var.f5918b;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f5902b.match(uri) != -1;
    }

    @Override // com.squareup.picasso.m0
    public final qb.p e(k0 k0Var) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        ContentResolver contentResolver = this.f5903a.getContentResolver();
        Uri uriLookupContact = k0Var.f5918b;
        int iMatch = f5902b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        throw new IllegalStateException("Invalid uri: " + uriLookupContact);
                    }
                }
            }
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uriLookupContact);
        } else {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
            inputStreamOpenContactPhotoInputStream = uriLookupContact == null ? null : ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        }
        if (inputStreamOpenContactPhotoInputStream != null) {
            return new qb.p((Bitmap) null, inputStreamOpenContactPhotoInputStream, c0.DISK, 0);
        }
        return null;
    }
}
