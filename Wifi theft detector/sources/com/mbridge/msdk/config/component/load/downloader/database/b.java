package com.mbridge.msdk.config.component.load.downloader.database;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.core.app.NotificationCompat;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f13505a;

    /* renamed from: b, reason: collision with root package name */
    private long f13506b;

    /* renamed from: c, reason: collision with root package name */
    private long f13507c;

    /* renamed from: d, reason: collision with root package name */
    private String f13508d;

    /* renamed from: e, reason: collision with root package name */
    private long f13509e;

    /* renamed from: f, reason: collision with root package name */
    private long f13510f;

    /* renamed from: g, reason: collision with root package name */
    private String f13511g;

    /* renamed from: h, reason: collision with root package name */
    private int f13512h;

    /* renamed from: i, reason: collision with root package name */
    private String f13513i;

    private b() {
    }

    public void a(long j10) {
        this.f13506b = j10;
    }

    public long b() {
        return this.f13506b;
    }

    public String c() {
        return this.f13508d;
    }

    public void d(String str) {
        this.f13505a = str;
    }

    public String e() {
        return this.f13505a;
    }

    public int f() {
        return this.f13512h;
    }

    public long g() {
        return this.f13510f;
    }

    public long h() {
        return this.f13509e;
    }

    public long i() {
        return this.f13507c;
    }

    public void a(int i10) {
        this.f13512h = i10;
    }

    public void b(String str) {
        this.f13508d = str;
    }

    public void c(long j10) {
        this.f13509e = j10;
    }

    public void d(long j10) {
        this.f13507c = j10;
    }

    public String a() {
        return this.f13513i;
    }

    public void b(long j10) {
        this.f13510f = j10;
    }

    public void c(String str) {
        this.f13511g = str;
    }

    public String d() {
        return this.f13511g;
    }

    public void a(String str) {
        this.f13513i = str;
    }

    public static b a(String str, String str2, long j10, long j11, long j12, long j13, String str3, int i10, String str4) {
        b bVar = new b();
        bVar.b(str);
        bVar.d(str2);
        bVar.b(j13);
        bVar.a(j10);
        bVar.d(j11);
        bVar.c(j12);
        bVar.a(str3);
        bVar.a(i10);
        bVar.c(str4);
        return bVar;
    }

    public static b a(Cursor cursor) {
        b bVar = new b();
        cursor.moveToFirst();
        for (String str : cursor.getColumnNames()) {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex != -1) {
                str.getClass();
                switch (str) {
                    case "successTime":
                        bVar.d(cursor.getLong(columnIndex));
                        break;
                    case "status":
                        bVar.a(cursor.getInt(columnIndex));
                        break;
                    case "filePath":
                        bVar.d(cursor.getString(columnIndex));
                        break;
                    case "fileSize":
                        bVar.b(cursor.getLong(columnIndex));
                        break;
                    case "contentType":
                        bVar.a(cursor.getString(columnIndex));
                        break;
                    case "URL":
                        bVar.b(cursor.getString(columnIndex));
                        break;
                    case "md5":
                        bVar.c(cursor.getString(columnIndex));
                        break;
                    case "touchTime":
                        bVar.c(cursor.getLong(columnIndex));
                        break;
                    case "createTime":
                        bVar.a(cursor.getLong(columnIndex));
                        break;
                }
            }
        }
        return bVar;
    }

    public static ContentValues a(b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("URL", bVar.c());
        contentValues.put("filePath", bVar.e());
        contentValues.put("fileSize", Long.valueOf(bVar.g()));
        contentValues.put("touchTime", Long.valueOf(bVar.h()));
        contentValues.put("createTime", Long.valueOf(bVar.b()));
        contentValues.put("successTime", Long.valueOf(bVar.i()));
        contentValues.put("md5", bVar.d());
        contentValues.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(bVar.f()));
        return contentValues;
    }
}
