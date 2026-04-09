.class public final Lm2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/io/File;

.field private final c:Ljava/util/concurrent/Callable;

.field private final d:Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;)V
    .locals 1

    const-string v0, "mDelegate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/v;->a:Ljava/lang/String;

    iput-object p2, p0, Lm2/v;->b:Ljava/io/File;

    iput-object p3, p0, Lm2/v;->c:Ljava/util/concurrent/Callable;

    iput-object p4, p0, Lm2/v;->d:Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;

    return-void
.end method


# virtual methods
.method public create(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;
    .locals 8

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm2/u;

    iget-object v2, p1, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;->a:Landroid/content/Context;

    iget-object v3, p0, Lm2/v;->a:Ljava/lang/String;

    iget-object v4, p0, Lm2/v;->b:Ljava/io/File;

    iget-object v5, p0, Lm2/v;->c:Ljava/util/concurrent/Callable;

    iget-object v1, p1, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;->c:Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;

    iget v6, v1, Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;->a:I

    iget-object v1, p0, Lm2/v;->d:Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;

    invoke-interface {v1, p1}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;->create(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lm2/u;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILandroidx/sqlite/db/SupportSQLiteOpenHelper;)V

    return-object v0
.end method
