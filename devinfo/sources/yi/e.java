package yi;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.google.android.gms.internal.play_billing.m1;
import d.h;
import java.io.File;
import java.util.ArrayList;
import km.o;
import nk.k;
import r0.i0;
import vk.p;
import yj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends wb.e {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f37629f = new ArrayList(2);
    public final n g = a.a.u(new i0(10));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [zi.a] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // wb.e
    public final d h(String str) throws Throwable {
        String strE;
        o oVar;
        Throwable th2;
        Cursor cursorQuery;
        k.e(str, "path");
        ArrayList arrayList = this.f37629f;
        if (arrayList.isEmpty()) {
            return new b(str);
        }
        String str2 = File.separator;
        k.d(str2, "separator");
        if (p.p0(str, str2, false)) {
            strE = str.substring(0, str.length() - 1);
            k.d(strE, "substring(...)");
        } else {
            strE = str;
        }
        String str3 = c.f37626a;
        if (!p.w0(strE, str3, false)) {
            if (p.w0(strE, str2, false)) {
                strE = strE.substring(1);
                k.d(strE, "substring(...)");
            }
            strE = h.E(str3, str2, strE);
        }
        Context context = pk.a.f32022a;
        k.b(context);
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            if (p.w0(strE, (String) obj, false)) {
                n nVar = this.g;
                if (((xi.a) nVar.getValue()).a()) {
                    xi.a aVar = (xi.a) nVar.getValue();
                    aVar.getClass();
                    Cursor cursor = null;
                    M = 0;
                    ?? M = 0;
                    if (aVar.a()) {
                        Context context2 = aVar.f37165a;
                        String str4 = xi.a.f37164c;
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(DocumentsContract.buildTreeDocumentUri("com.android.externalstorage.documents", m1.n(aVar.f37166b)), m1.n(strE));
                        k.d(uriBuildDocumentUriUsingTree, "buildDocumentUriUsingTree(...)");
                        String treeDocumentId = DocumentsContract.getTreeDocumentId(uriBuildDocumentUriUsingTree);
                        if (DocumentsContract.isDocumentUri(context2, uriBuildDocumentUriUsingTree)) {
                            treeDocumentId = DocumentsContract.getDocumentId(uriBuildDocumentUriUsingTree);
                        }
                        oVar = new o(false, context2, DocumentsContract.buildDocumentUriUsingTree(uriBuildDocumentUriUsingTree, treeDocumentId));
                    } else {
                        oVar = null;
                    }
                    zi.c cVar = oVar != null ? new zi.c(oVar) : null;
                    if (cVar != null) {
                        try {
                            ContentResolver contentResolver = context.getContentResolver();
                            k.d(contentResolver, "getContentResolver(...)");
                            cursorQuery = contentResolver.query(cVar.f(), new String[]{"document_id", "_display_name", "mime_type", "flags", "_size", "last_modified"}, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.moveToFirst();
                                } catch (Exception unused) {
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    cursor = cursorQuery;
                                    wd.b.d(cursor);
                                    throw th2;
                                }
                            }
                            M = a.a.m(context, cVar, cursorQuery);
                        } catch (Exception unused2) {
                            cursorQuery = null;
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                        wd.b.d(cursorQuery);
                        if (M != 0) {
                            cVar = M;
                        }
                    }
                    return new a(cVar, strE);
                }
            }
        }
        return new b(str);
    }

    @Override // wb.e
    public final d i(String str) {
        k.e(str, "path");
        return h(str);
    }
}
