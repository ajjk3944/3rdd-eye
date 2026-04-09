.class public final Lkx;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/database/sqlite/SQLiteDatabase$CursorFactory;


# instance fields
.field public final synthetic a:Llz0;


# direct methods
.method public constructor <init>(Llz0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkx;->a:Llz0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final newCursor(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 1

    .line 1
    new-instance p1, Llx;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, v0, p4}, Llx;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lkx;->a:Llz0;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Llz0;->c(Llx;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Landroid/database/sqlite/SQLiteCursor;

    .line 13
    .line 14
    invoke-direct {p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method
