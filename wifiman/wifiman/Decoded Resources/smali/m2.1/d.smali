.class public final Lm2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/sqlite/db/SupportSQLiteOpenHelper;
.implements Lm2/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm2/d$a;,
        Lm2/d$b;,
        Lm2/d$c;
    }
.end annotation


# instance fields
.field private final a:Landroidx/sqlite/db/SupportSQLiteOpenHelper;

.field public final b:Lm2/c;

.field private final c:Lm2/d$a;


# direct methods
.method public constructor <init>(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Lm2/c;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/d;->a:Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    iput-object p2, p0, Lm2/d;->b:Lm2/c;

    invoke-virtual {p0}, Lm2/d;->a()Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm2/c;->k(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)V

    new-instance p1, Lm2/d$a;

    invoke-direct {p1, p2}, Lm2/d$a;-><init>(Lm2/c;)V

    iput-object p1, p0, Lm2/d;->c:Lm2/d$a;

    return-void
.end method


# virtual methods
.method public a()Landroidx/sqlite/db/SupportSQLiteOpenHelper;
    .locals 1

    iget-object v0, p0, Lm2/d;->a:Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lm2/d;->c:Lm2/d$a;

    invoke-virtual {v0}, Lm2/d$a;->close()V

    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm2/d;->a:Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;
    .locals 1

    iget-object v0, p0, Lm2/d;->c:Lm2/d$a;

    invoke-virtual {v0}, Lm2/d$a;->a()V

    iget-object v0, p0, Lm2/d;->c:Lm2/d$a;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lm2/d;->a:Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method
