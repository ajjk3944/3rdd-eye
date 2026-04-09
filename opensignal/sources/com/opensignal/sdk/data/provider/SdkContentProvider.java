package com.opensignal.sdk.data.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import ch.l;
import ch.n;
import fi.g;
import io.sentry.android.core.performance.f;
import kotlin.Metadata;
import vi.a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JQ\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0017\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0016\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0016\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J3\u0010!\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/opensignal/sdk/data/provider/SdkContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Landroid/net/Uri;", "uri", "Landroid/database/sqlite/SQLiteQueryBuilder;", "prepareSQLiteQueryBuilder", "(Landroid/net/Uri;)Landroid/database/sqlite/SQLiteQueryBuilder;", "Lvi/a;", "getSdkProviderUris", "()Lvi/a;", "Llq/b0;", "initialiseDatabaseHelper", "", "onCreate", "()Z", "Landroid/content/ContentValues;", "contentValues", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Lfi/g;", "databaseHelper", "Lfi/g;", "sdkProviderUris", "Lvi/a;", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SdkContentProvider extends ContentProvider {
    private g databaseHelper;
    private a sdkProviderUris;

    private final a getSdkProviderUris() {
        if (this.sdkProviderUris == null) {
            l lVar = l.f3962t5;
            if (lVar.f3938z2 == null) {
                lVar.f3938z2 = new a(lVar.d());
            }
            a aVar = lVar.f3938z2;
            if (aVar == null) {
                br.l.l("_sdkProviderUris");
                throw null;
            }
            this.sdkProviderUris = aVar;
        }
        a aVar2 = this.sdkProviderUris;
        if (aVar2 != null) {
            return aVar2;
        }
        br.l.l("sdkProviderUris");
        throw null;
    }

    private final void initialiseDatabaseHelper() {
        if (this.databaseHelper == null) {
            this.databaseHelper = l.f3962t5.x();
        }
    }

    private final SQLiteQueryBuilder prepareSQLiteQueryBuilder(Uri uri) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(getSdkProviderUris().a(uri));
        return sQLiteQueryBuilder;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        br.l.e(uri, "uri");
        String strA = getSdkProviderUris().a(uri);
        if (strA == null) {
            return 0;
        }
        g gVar = this.databaseHelper;
        if (gVar == null) {
            br.l.l("databaseHelper");
            throw null;
        }
        int iDelete = gVar.getWritableDatabase().delete(strA, selection, selectionArgs);
        n.b("SdkContentProvider", "(" + selection + ") deletedRowsCount: " + iDelete);
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        br.l.e(uri, "uri");
        a sdkProviderUris = getSdkProviderUris();
        sdkProviderUris.getClass();
        return c7.a.p("vnd.android.cursor.dir/", sdkProviderUris.a(uri));
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        br.l.e(uri, "uri");
        String strA = getSdkProviderUris().a(uri);
        if (strA != null) {
            try {
                g gVar = this.databaseHelper;
                if (gVar != null) {
                    gVar.getWritableDatabase().insertWithOnConflict(strA, null, contentValues, 5);
                    return uri;
                }
                br.l.l("databaseHelper");
                throw null;
            } catch (SQLiteFullException e4) {
                n.e("SdkContentProvider", e4);
            }
        }
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        f.c(this);
        l lVar = l.f3962t5;
        Context context = getContext();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        br.l.c(applicationContext, "null cannot be cast to non-null type android.content.Context");
        lVar.c1(applicationContext);
        initialiseDatabaseHelper();
        n.b("SdkContentProvider", "SDK Content Provider created");
        f.d(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        br.l.e(uri, "uri");
        SQLiteQueryBuilder sQLiteQueryBuilderPrepareSQLiteQueryBuilder = prepareSQLiteQueryBuilder(uri);
        g gVar = this.databaseHelper;
        if (gVar != null) {
            return sQLiteQueryBuilderPrepareSQLiteQueryBuilder.query(gVar.getReadableDatabase(), projection, selection, selectionArgs, null, null, sortOrder);
        }
        br.l.l("databaseHelper");
        throw null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String selection, String[] selectionArgs) {
        br.l.e(uri, "uri");
        String strA = getSdkProviderUris().a(uri);
        if (strA == null) {
            return 0;
        }
        g gVar = this.databaseHelper;
        if (gVar != null) {
            return gVar.getWritableDatabase().update(strA, contentValues, selection, selectionArgs);
        }
        br.l.l("databaseHelper");
        throw null;
    }
}
