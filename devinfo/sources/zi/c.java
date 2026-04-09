package zi;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import km.o;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final o f38305a;

    public c(o oVar) {
        this.f38305a = oVar;
    }

    @Override // zi.b
    public final boolean a() {
        o oVar = this.f38305a;
        Cursor cursorQuery = null;
        try {
            cursorQuery = ((Context) oVar.f28445a).getContentResolver().query((Uri) oVar.f28446b, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e2) {
            Log.w("DocumentFile", "Failed query: " + e2);
            return false;
        } finally {
            com.bumptech.glide.c.i(cursorQuery);
        }
    }

    @Override // zi.b
    public final b[] b() {
        o oVar = this.f38305a;
        Context context = (Context) oVar.f28445a;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = (Uri) oVar.f28446b;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(0)));
                    }
                    try {
                        r5.c.s(cursorQuery);
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            r5.c.s(cursorQuery);
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            } catch (Exception e11) {
                Log.w("DocumentFile", "Failed query: " + e11);
                if (cursorQuery != null) {
                    try {
                        r5.c.s(cursorQuery);
                    } catch (RuntimeException e12) {
                        throw e12;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        int length = uriArr.length;
        o[] oVarArr = new o[length];
        for (int i4 = 0; i4 < uriArr.length; i4++) {
            oVarArr[i4] = new o(false, context, uriArr[i4]);
        }
        ArrayList arrayList2 = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            o oVar2 = oVarArr[i10];
            k.b(oVar2);
            arrayList2.add(new c(oVar2));
        }
        return (b[]) arrayList2.toArray(new b[0]);
    }

    @Override // zi.b
    public final boolean c() throws Throwable {
        o oVar = this.f38305a;
        String strR = com.bumptech.glide.c.r((Context) oVar.f28445a, (Uri) oVar.f28446b, "mime_type");
        return ("vnd.android.document/directory".equals(strR) || TextUtils.isEmpty(strR)) ? false : true;
    }

    @Override // zi.b
    public final long d() {
        o oVar = this.f38305a;
        return com.bumptech.glide.c.q((Context) oVar.f28445a, (Uri) oVar.f28446b, "last_modified");
    }

    @Override // zi.b
    public final boolean e() {
        o oVar = this.f38305a;
        oVar.getClass();
        try {
            return DocumentsContract.deleteDocument(((Context) oVar.f28445a).getContentResolver(), (Uri) oVar.f28446b);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // zi.b
    public final Uri f() {
        Uri uri = (Uri) this.f38305a.f28446b;
        k.d(uri, "getUri(...)");
        return uri;
    }

    @Override // zi.b
    public final long getLength() {
        o oVar = this.f38305a;
        return com.bumptech.glide.c.q((Context) oVar.f28445a, (Uri) oVar.f28446b, "_size");
    }

    @Override // zi.b
    public final String getName() {
        o oVar = this.f38305a;
        return com.bumptech.glide.c.r((Context) oVar.f28445a, (Uri) oVar.f28446b, "_display_name");
    }

    @Override // zi.b
    public final boolean isDirectory() {
        o oVar = this.f38305a;
        return "vnd.android.document/directory".equals(com.bumptech.glide.c.r((Context) oVar.f28445a, (Uri) oVar.f28446b, "mime_type"));
    }
}
