.class LZb/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZb/b;->e()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm2/t;

.field final synthetic b:LZb/b;


# direct methods
.method constructor <init>(LZb/b;Lm2/t;)V
    .locals 0

    iput-object p1, p0, LZb/b$c;->b:LZb/b;

    iput-object p2, p0, LZb/b$c;->a:Lm2/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 10

    iget-object v0, p0, LZb/b$c;->b:LZb/b;

    invoke-static {v0}, LZb/b;->h(LZb/b;)Lm2/q;

    move-result-object v0

    iget-object v1, p0, LZb/b$c;->a:Lm2/t;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2}, Lp2/b;->b(Lm2/q;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v0

    :try_start_0
    const-string/jumbo v1, "id"

    invoke-static {v0, v1}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    const-string/jumbo v2, "uispReportEnabled"

    invoke-static {v0, v2}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    const-string/jumbo v4, "advancedTestEnabled"

    invoke-static {v0, v4}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_0

    move v7, v8

    goto :goto_1

    :cond_0
    move v7, v3

    :goto_1
    invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_2

    :cond_1
    move v8, v3

    :goto_2
    new-instance v9, LZb/c;

    invoke-direct {v9, v6, v7, v8}, LZb/c;-><init>(IZZ)V

    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object v5

    :goto_3
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    throw v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZb/b$c;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected finalize()V
    .locals 1

    iget-object v0, p0, LZb/b$c;->a:Lm2/t;

    invoke-virtual {v0}, Lm2/t;->s()V

    return-void
.end method
