.class final Ls2/d$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls2/d;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls2/d;


# direct methods
.method constructor <init>(Ls2/d;)V
    .locals 0

    iput-object p1, p0, Ls2/d$d;->a:Ls2/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ls2/d$c;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v1}, Ls2/d;->j(Ls2/d;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v1}, Ls2/d;->p(Ls2/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/File;

    iget-object v3, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v3}, Ls2/d;->h(Ls2/d;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lr2/d;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    iget-object v4, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v4}, Ls2/d;->j(Ls2/d;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v3, Ls2/d$c;

    iget-object v4, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v4}, Ls2/d;->h(Ls2/d;)Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ls2/d$b;

    invoke-direct {v8, v2}, Ls2/d$b;-><init>(Ls2/c;)V

    iget-object v1, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v1}, Ls2/d;->g(Ls2/d;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;

    move-result-object v9

    iget-object v1, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v1}, Ls2/d;->a(Ls2/d;)Z

    move-result v10

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Ls2/d$c;-><init>(Landroid/content/Context;Ljava/lang/String;Ls2/d$b;Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;Z)V

    goto :goto_0

    :cond_0
    new-instance v3, Ls2/d$c;

    iget-object v1, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v1}, Ls2/d;->h(Ls2/d;)Landroid/content/Context;

    move-result-object v12

    iget-object v1, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v1}, Ls2/d;->j(Ls2/d;)Ljava/lang/String;

    move-result-object v13

    new-instance v14, Ls2/d$b;

    invoke-direct {v14, v2}, Ls2/d$b;-><init>(Ls2/c;)V

    iget-object v1, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v1}, Ls2/d;->g(Ls2/d;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;

    move-result-object v15

    iget-object v1, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v1}, Ls2/d;->a(Ls2/d;)Z

    move-result v16

    move-object v11, v3

    invoke-direct/range {v11 .. v16}, Ls2/d$c;-><init>(Landroid/content/Context;Ljava/lang/String;Ls2/d$b;Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;Z)V

    :goto_0
    iget-object v1, v0, Ls2/d$d;->a:Ls2/d;

    invoke-static {v1}, Ls2/d;->s(Ls2/d;)Z

    move-result v1

    invoke-static {v3, v1}, Lr2/b;->d(Landroid/database/sqlite/SQLiteOpenHelper;Z)V

    return-object v3
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls2/d$d;->a()Ls2/d$c;

    move-result-object v0

    return-object v0
.end method
