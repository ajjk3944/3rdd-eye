.class public final Lm2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;


# instance fields
.field private final a:Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;

.field private final b:Lm2/c;


# direct methods
.method public constructor <init>(Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;Lm2/c;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/e;->a:Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;

    iput-object p2, p0, Lm2/e;->b:Lm2/c;

    return-void
.end method


# virtual methods
.method public a(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Lm2/d;
    .locals 2

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm2/d;

    iget-object v1, p0, Lm2/e;->a:Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;

    invoke-interface {v1, p1}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;->create(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    move-result-object p1

    iget-object v1, p0, Lm2/e;->b:Lm2/c;

    invoke-direct {v0, p1, v1}, Lm2/d;-><init>(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Lm2/c;)V

    return-object v0
.end method

.method public bridge synthetic create(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;
    .locals 0

    invoke-virtual {p0, p1}, Lm2/e;->a(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Lm2/d;

    move-result-object p1

    return-object p1
.end method
