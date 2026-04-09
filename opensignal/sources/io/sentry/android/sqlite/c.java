package io.sentry.android.sqlite;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import br.l;
import io.sentry.k;

/* loaded from: classes.dex */
public final class c implements CrossProcessCursor {

    /* renamed from: a, reason: collision with root package name */
    public final CrossProcessCursor f12049a;

    /* renamed from: d, reason: collision with root package name */
    public final k f12050d;

    /* renamed from: g, reason: collision with root package name */
    public final String f12051g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12052r;

    public c(CrossProcessCursor crossProcessCursor, k kVar, String str) {
        l.e(str, "sql");
        this.f12049a = crossProcessCursor;
        this.f12050d = kVar;
        this.f12051g = str;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12049a.close();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
        this.f12049a.copyStringToBuffer(i10, charArrayBuffer);
    }

    @Override // android.database.Cursor
    public final void deactivate() {
        this.f12049a.deactivate();
    }

    @Override // android.database.CrossProcessCursor
    public final void fillWindow(int i10, CursorWindow cursorWindow) throws Throwable {
        if (this.f12052r) {
            this.f12049a.fillWindow(i10, cursorWindow);
            return;
        }
        this.f12052r = true;
        this.f12050d.j0(this.f12051g, new a(i10, this, cursorWindow, 0));
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i10) {
        return this.f12049a.getBlob(i10);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.f12049a.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        return this.f12049a.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return this.f12049a.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i10) {
        return this.f12049a.getColumnName(i10);
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.f12049a.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        if (this.f12052r) {
            return this.f12049a.getCount();
        }
        this.f12052r = true;
        return ((Number) this.f12050d.j0(this.f12051g, new ht.g(8, this))).intValue();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i10) {
        return this.f12049a.getDouble(i10);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.f12049a.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i10) {
        return this.f12049a.getFloat(i10);
    }

    @Override // android.database.Cursor
    public final int getInt(int i10) {
        return this.f12049a.getInt(i10);
    }

    @Override // android.database.Cursor
    public final long getLong(int i10) {
        return this.f12049a.getLong(i10);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.f12049a.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f12049a.getPosition();
    }

    @Override // android.database.Cursor
    public final short getShort(int i10) {
        return this.f12049a.getShort(i10);
    }

    @Override // android.database.Cursor
    public final String getString(int i10) {
        return this.f12049a.getString(i10);
    }

    @Override // android.database.Cursor
    public final int getType(int i10) {
        return this.f12049a.getType(i10);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.f12049a.getWantsAllOnMoveCalls();
    }

    @Override // android.database.CrossProcessCursor
    public final CursorWindow getWindow() {
        return this.f12049a.getWindow();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return this.f12049a.isAfterLast();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.f12049a.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.f12049a.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f12049a.isFirst();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.f12049a.isLast();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i10) {
        return this.f12049a.isNull(i10);
    }

    @Override // android.database.Cursor
    public final boolean move(int i10) {
        return this.f12049a.move(i10);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return this.f12049a.moveToFirst();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return this.f12049a.moveToLast();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.f12049a.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i10) {
        return this.f12049a.moveToPosition(i10);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.f12049a.moveToPrevious();
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i10, int i11) {
        if (this.f12052r) {
            return this.f12049a.onMove(i10, i11);
        }
        this.f12052r = true;
        return ((Boolean) this.f12050d.j0(this.f12051g, new b(this, i10, i11))).booleanValue();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.f12049a.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f12049a.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public final boolean requery() {
        return this.f12049a.requery();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return this.f12049a.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.f12049a.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.f12049a.setNotificationUri(contentResolver, uri);
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.f12049a.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f12049a.unregisterDataSetObserver(dataSetObserver);
    }
}
