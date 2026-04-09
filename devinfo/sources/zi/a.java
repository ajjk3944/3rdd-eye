package zi;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import km.o;
import nk.k;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38299a;

    /* renamed from: b, reason: collision with root package name */
    public final c f38300b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38301c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38302d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f38303e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f38304f;

    public a(Context context, c cVar, String str, String str2, Long l10, Long l11) {
        this.f38299a = context;
        this.f38300b = cVar;
        this.f38301c = str;
        this.f38302d = str2;
        this.f38303e = l10;
        this.f38304f = l11;
    }

    @Override // zi.b
    public final boolean a() {
        return this.f38300b.a();
    }

    @Override // zi.b
    public final b[] b() throws Throwable {
        Context context = this.f38299a;
        ContentResolver contentResolver = context.getContentResolver();
        c cVar = this.f38300b;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(cVar.f(), DocumentsContract.getDocumentId(cVar.f()));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                k.b(contentResolver);
                k.b(uriBuildChildDocumentsUriUsingTree);
                Cursor cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id", "_display_name", "mime_type", "flags", "_size", "last_modified"}, null, null, null);
                while (true) {
                    try {
                        k.b(cursorQuery);
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        int columnIndex = cursorQuery.getColumnIndex("document_id");
                        String str = (String) (columnIndex < 0 ? null : new c0.a(1, cursorQuery, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0, 0, 8).invoke(Integer.valueOf(columnIndex)));
                        if (str != null) {
                            Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(cVar.f(), str);
                            String treeDocumentId = DocumentsContract.getTreeDocumentId(uriBuildDocumentUriUsingTree);
                            if (DocumentsContract.isDocumentUri(context, uriBuildDocumentUriUsingTree)) {
                                treeDocumentId = DocumentsContract.getDocumentId(uriBuildDocumentUriUsingTree);
                            }
                            arrayList.add(a.a.m(context, new c(new o(false, context, DocumentsContract.buildDocumentUriUsingTree(uriBuildDocumentUriUsingTree, treeDocumentId))), cursorQuery));
                        }
                    } catch (Exception unused) {
                        cursor = cursorQuery;
                        arrayList.clear();
                        n.X(arrayList, cVar.b());
                        wd.b.d(cursor);
                        return (b[]) arrayList.toArray(new b[0]);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        wd.b.d(cursor);
                        throw th;
                    }
                }
                wd.b.d(cursorQuery);
            } catch (Exception unused2) {
            }
            return (b[]) arrayList.toArray(new b[0]);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // zi.b
    public final boolean c() {
        String str = this.f38302d;
        return (str == null || str.length() == 0 || isDirectory()) ? false : true;
    }

    @Override // zi.b
    public final long d() {
        Long l10 = this.f38303e;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    @Override // zi.b
    public final boolean e() {
        return this.f38300b.e();
    }

    @Override // zi.b
    public final Uri f() {
        return this.f38300b.f();
    }

    @Override // zi.b
    public final long getLength() {
        Long l10 = this.f38304f;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    @Override // zi.b
    public final String getName() {
        return this.f38301c;
    }

    @Override // zi.b
    public final boolean isDirectory() {
        return k.a(this.f38302d, "vnd.android.document/directory");
    }
}
