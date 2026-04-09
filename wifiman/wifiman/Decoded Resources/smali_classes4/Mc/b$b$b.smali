.class public final LMc/b$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMc/b$b;->a(LZc/e;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LZc/e;

.field final synthetic b:LMc/b;


# direct methods
.method public constructor <init>(LZc/e;LMc/b;)V
    .locals 0

    iput-object p1, p0, LMc/b$b$b;->a:LZc/e;

    iput-object p2, p0, LMc/b$b$b;->b:LMc/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    iget-object v3, v1, LMc/b$b$b;->a:LZc/e;

    invoke-virtual {v3}, LZc/e;->b()LZc/e$a;

    move-result-object v3

    if-nez v3, :cond_0

    iget-object v3, v1, LMc/b$b$b;->a:LZc/e;

    invoke-virtual {v3}, LZc/e;->c()LZc/e$a;

    move-result-object v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, LZc/e$a;->b()Linet/ipaddr/g;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v3, v1, LMc/b$b$b;->b:LMc/b;

    invoke-static {v3}, LMc/b;->c(LMc/b;)Lmc/a;

    move-result-object v3

    invoke-interface {v3}, Lmc/a;->getName()Ljava/lang/String;

    move-result-object v5

    iget-object v3, v1, LMc/b$b$b;->b:LMc/b;

    invoke-static {v3}, LMc/b;->c(LMc/b;)Lmc/a;

    move-result-object v3

    invoke-interface {v3}, Lmc/a;->b()Ljava/lang/String;

    move-result-object v6

    iget-object v3, v1, LMc/b$b$b;->b:LMc/b;

    invoke-static {v3}, LMc/b;->c(LMc/b;)Lmc/a;

    move-result-object v3

    invoke-interface {v3}, Lmc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v7

    iget-object v3, v1, LMc/b$b$b;->a:LZc/e;

    invoke-virtual {v3}, LZc/e;->e()Lh9/a;

    move-result-object v8

    iget-object v3, v1, LMc/b$b$b;->b:LMc/b;

    invoke-static {v3}, LMc/b;->c(LMc/b;)Lmc/a;

    move-result-object v3

    invoke-interface {v3}, Lmc/a;->e()J

    move-result-wide v9

    iget-object v3, v1, LMc/b$b$b;->b:LMc/b;

    invoke-static {v3}, LMc/b;->c(LMc/b;)Lmc/a;

    move-result-object v3

    invoke-interface {v3}, Lmc/a;->a()Ljava/lang/String;

    move-result-object v11

    iget-object v3, v1, LMc/b$b$b;->b:LMc/b;

    invoke-static {v3}, LMc/b;->c(LMc/b;)Lmc/a;

    move-result-object v3

    invoke-interface {v3}, Lmc/a;->d()LCc/b;

    move-result-object v12

    const-wide/16 v15, 0x2710

    add-long/2addr v15, v13

    new-instance v3, LMc/a$a;

    move-object/from16 v17, v3

    move-object/from16 v3, v17

    invoke-direct/range {v3 .. v16}, LMc/a$a;-><init>(Linet/ipaddr/g;Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;Lh9/a;JLjava/lang/String;LCc/b;JJ)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {v2, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {v2, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
