package net.sqlcipher.database;

import android.database.DataSetObserver;
import android.database.SQLException;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.AbstractWindowedCursor;
import net.sqlcipher.CursorWindow;
import org.snmp4j.mp.MPv3;

/* loaded from: classes4.dex */
public class SQLiteCursor extends AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final String TAG = "Cursor";
    private String[] mColumns;
    private SQLiteDatabase mDatabase;
    private SQLiteCursorDriver mDriver;
    private String mEditTable;
    protected MainThreadNotificationHandler mNotificationHandler;
    private SQLiteQuery mQuery;
    private int mCount = -1;
    private int mCursorWindowCapacity = 0;
    private boolean fillWindowForwardOnly = false;
    private int mMaxRead = MPv3.MAX_MESSAGE_ID;
    private int mInitialRead = MPv3.MAX_MESSAGE_ID;
    private int mCursorState = 0;
    private ReentrantLock mLock = null;
    private boolean mPendingData = false;
    private Throwable mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
    private Map<String, Integer> mColumnNameMap = null;

    protected static class MainThreadNotificationHandler extends Handler {
        private final WeakReference<SQLiteCursor> wrappedCursor;

        MainThreadNotificationHandler(SQLiteCursor sQLiteCursor) {
            this.wrappedCursor = new WeakReference<>(sQLiteCursor);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SQLiteCursor sQLiteCursor = this.wrappedCursor.get();
            if (sQLiteCursor != null) {
                sQLiteCursor.notifyDataSetChange();
            }
        }
    }

    private final class QueryThread implements Runnable {
        private final int mThreadState;

        QueryThread(int i10) {
            this.mThreadState = i10;
        }

        private void sendMessage() {
            SQLiteCursor sQLiteCursor = SQLiteCursor.this;
            MainThreadNotificationHandler mainThreadNotificationHandler = sQLiteCursor.mNotificationHandler;
            if (mainThreadNotificationHandler == null) {
                sQLiteCursor.mPendingData = true;
            } else {
                mainThreadNotificationHandler.sendEmptyMessage(1);
                SQLiteCursor.this.mPendingData = false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        
            r4.this$0.mCount = r1;
            sendMessage();
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.lang.SecurityException, java.lang.IllegalArgumentException {
            /*
                r4 = this;
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this
                net.sqlcipher.CursorWindow r0 = net.sqlcipher.database.SQLiteCursor.access$100(r0)
                int r1 = android.os.Process.myTid()
                r2 = 10
                android.os.Process.setThreadPriority(r1, r2)
            Lf:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.SQLiteCursor.access$200(r1)
                if (r1 != 0) goto L22
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
                r3 = 1
                r2.<init>(r3)
                net.sqlcipher.database.SQLiteCursor.access$202(r1, r2)
            L22:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.SQLiteCursor.access$200(r1)
                r1.lock()
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                int r1 = net.sqlcipher.database.SQLiteCursor.access$300(r1)
                int r2 = r4.mThreadState
                if (r1 == r2) goto L3f
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r0 = net.sqlcipher.database.SQLiteCursor.access$200(r0)
                r0.unlock()
                goto L8e
            L3f:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                net.sqlcipher.database.SQLiteQuery r1 = net.sqlcipher.database.SQLiteCursor.access$600(r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                net.sqlcipher.database.SQLiteCursor r2 = net.sqlcipher.database.SQLiteCursor.this     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                int r2 = net.sqlcipher.database.SQLiteCursor.access$400(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                net.sqlcipher.database.SQLiteCursor r3 = net.sqlcipher.database.SQLiteCursor.this     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                int r3 = net.sqlcipher.database.SQLiteCursor.access$500(r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                int r1 = r1.fillWindow(r0, r2, r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                if (r1 == 0) goto L7a
                r2 = -1
                if (r1 != r2) goto L72
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                int r2 = net.sqlcipher.database.SQLiteCursor.access$400(r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                net.sqlcipher.database.SQLiteCursor.access$512(r1, r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                r4.sendMessage()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.SQLiteCursor.access$200(r1)
                r1.unlock()
                goto Lf
            L70:
                r0 = move-exception
                goto L84
            L72:
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                net.sqlcipher.database.SQLiteCursor.access$502(r0, r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
                r4.sendMessage()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7a
            L7a:
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r0 = net.sqlcipher.database.SQLiteCursor.access$200(r0)
                r0.unlock()
                goto L8e
            L84:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.SQLiteCursor.access$200(r1)
                r1.unlock()
                throw r0
            L8e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCursor.QueryThread.run():void");
        }
    }

    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.mDatabase = sQLiteDatabase;
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mQuery = sQLiteQuery;
        try {
            sQLiteDatabase.lock();
            int iColumnCountLocked = this.mQuery.columnCountLocked();
            this.mColumns = new String[iColumnCountLocked];
            for (int i10 = 0; i10 < iColumnCountLocked; i10++) {
                String strColumnNameLocked = this.mQuery.columnNameLocked(i10);
                this.mColumns[i10] = strColumnNameLocked;
                if ("_id".equals(strColumnNameLocked)) {
                    this.mRowIdColumnIndex = i10;
                }
            }
        } finally {
            sQLiteDatabase.unlock();
        }
    }

    static /* synthetic */ int access$512(SQLiteCursor sQLiteCursor, int i10) {
        int i11 = sQLiteCursor.mCount + i10;
        sQLiteCursor.mCount = i11;
        return i11;
    }

    private void deactivateCommon() {
        this.mCursorState = 0;
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.mWindow = null;
        }
    }

    private void fillWindow(int i10) {
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        int iCursorPickFillWindowStartPosition = this.fillWindowForwardOnly ? i10 : this.mCount == -1 ? cursorPickFillWindowStartPosition(i10, 0) : cursorPickFillWindowStartPosition(i10, this.mCursorWindowCapacity);
        this.mWindow.setStartPosition(iCursorPickFillWindowStartPosition);
        this.mWindow.setRequiredPosition(i10);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = iCursorPickFillWindowStartPosition + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    private void queryThreadLock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void queryThreadUnlock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        deactivateCommon();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        if (!supportsUpdates()) {
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map != null) {
                try {
                    this.mUpdatedRows.putAll(map);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.mUpdatedRows.size() == 0) {
                return true;
            }
            this.mDatabase.beginTransaction();
            try {
                StringBuilder sb2 = new StringBuilder(128);
                for (Map.Entry<Long, Map<String, Object>> entry : this.mUpdatedRows.entrySet()) {
                    Map<String, Object> value = entry.getValue();
                    Long key = entry.getKey();
                    if (key == null || value == null) {
                        throw new IllegalStateException("null rowId or values found! rowId = " + key + ", values = " + value);
                    }
                    if (value.size() != 0) {
                        long jLongValue = key.longValue();
                        Iterator<Map.Entry<String, Object>> it = value.entrySet().iterator();
                        sb2.setLength(0);
                        sb2.append("UPDATE " + this.mEditTable + " SET ");
                        Object[] objArr = new Object[value.size()];
                        int i10 = 0;
                        while (it.hasNext()) {
                            Map.Entry<String, Object> next = it.next();
                            sb2.append(next.getKey());
                            sb2.append("=?");
                            objArr[i10] = next.getValue();
                            if (it.hasNext()) {
                                sb2.append(", ");
                            }
                            i10++;
                        }
                        sb2.append(" WHERE " + this.mColumns[this.mRowIdColumnIndex] + '=' + jLongValue);
                        sb2.append(';');
                        this.mDatabase.execSQL(sb2.toString(), objArr);
                        this.mDatabase.rowUpdated(this.mEditTable, jLongValue);
                    }
                }
                this.mDatabase.setTransactionSuccessful();
                this.mDatabase.endTransaction();
                this.mUpdatedRows.clear();
                onChange(true);
                return true;
            } catch (Throwable th3) {
                this.mDatabase.endTransaction();
                throw th3;
            }
        }
    }

    public int cursorPickFillWindowStartPosition(int i10, int i11) {
        return Math.max(i10 - (i11 / 3), 0);
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        deactivateCommon();
        this.mDriver.cursorDeactivated();
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
        boolean z10;
        checkPosition();
        if (this.mRowIdColumnIndex == -1 || this.mCurrentRowID == null) {
            return false;
        }
        this.mDatabase.lock();
        try {
            try {
                this.mDatabase.delete(this.mEditTable, this.mColumns[this.mRowIdColumnIndex] + "=?", new String[]{this.mCurrentRowID.toString()});
                z10 = true;
            } finally {
                this.mDatabase.unlock();
            }
        } catch (SQLException unused) {
            z10 = false;
        }
        int i10 = this.mPos;
        requery();
        moveToPosition(i10);
        if (!z10) {
            return false;
        }
        onChange(true);
        return true;
    }

    @Override // net.sqlcipher.AbstractCursor
    protected void finalize() {
        try {
            if (this.mWindow != null) {
                this.mQuery.mSql.length();
                close();
                SQLiteDebug.notifyActiveCursorFinalized();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i10 = 0; i10 < length; i10++) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
            this.mColumnNameMap = map;
        }
        if (str.lastIndexOf(46) != -1) {
            new Exception();
        }
        Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    public SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i10, int i11) {
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null && i11 >= cursorWindow.getStartPosition() && i11 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i11);
        return true;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.mMaxRead && Integer.MAX_VALUE == this.mInitialRead) && this.mNotificationHandler == null) {
            queryThreadLock();
            try {
                this.mNotificationHandler = new MainThreadNotificationHandler(this);
                if (this.mPendingData) {
                    notifyDataSetChange();
                    this.mPendingData = false;
                }
            } finally {
                queryThreadUnlock();
            }
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.mDatabase.lock();
        try {
            CursorWindow cursorWindow = this.mWindow;
            if (cursorWindow != null) {
                cursorWindow.clear();
            }
            this.mPos = -1;
            this.mDriver.cursorRequeried(this);
            this.mCount = -1;
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mQuery.requery();
                this.mDatabase.unlock();
                return super.requery();
            } finally {
                queryThreadUnlock();
            }
        } catch (Throwable th2) {
            this.mDatabase.unlock();
            throw th2;
        }
    }

    public void setFillWindowForwardOnly(boolean z10) {
        this.fillWindowForwardOnly = z10;
    }

    public void setLoadStyle(int i10, int i11) {
        this.mMaxRead = i11;
        this.mInitialRead = i10;
        this.mLock = new ReentrantLock(true);
    }

    public void setSelectionArguments(String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    @Override // net.sqlcipher.AbstractWindowedCursor
    public void setWindow(CursorWindow cursorWindow) {
        if (this.mWindow != null) {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.close();
                queryThreadUnlock();
                this.mCount = -1;
            } catch (Throwable th2) {
                queryThreadUnlock();
                throw th2;
            }
        }
        this.mWindow = cursorWindow;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean supportsUpdates() {
        return !TextUtils.isEmpty(this.mEditTable);
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public void fillWindow(int i10, android.database.CursorWindow cursorWindow) {
        int iCursorPickFillWindowStartPosition;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            iCursorPickFillWindowStartPosition = i10;
        } else if (this.mCount == -1) {
            iCursorPickFillWindowStartPosition = cursorPickFillWindowStartPosition(i10, 0);
        } else {
            iCursorPickFillWindowStartPosition = cursorPickFillWindowStartPosition(i10, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(iCursorPickFillWindowStartPosition);
        this.mWindow.setRequiredPosition(i10);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = iCursorPickFillWindowStartPosition + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }
}
