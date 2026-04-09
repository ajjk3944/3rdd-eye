.class public final LKd/e$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKd/e$e;->a(Lwa/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LKd/e;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lwa/a;

.field final synthetic d:LKd/a$a;


# direct methods
.method public constructor <init>(LKd/e;Ljava/lang/String;Lwa/a;LKd/a$a;)V
    .locals 0

    iput-object p1, p0, LKd/e$e$a;->a:LKd/e;

    iput-object p2, p0, LKd/e$e$a;->b:Ljava/lang/String;

    iput-object p3, p0, LKd/e$e$a;->c:Lwa/a;

    iput-object p4, p0, LKd/e$e$a;->d:LKd/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, LKd/e$e$a;->a:LKd/e;

    invoke-static {v0}, LKd/e;->g(LKd/e;)Lac/e;

    move-result-object v0

    iget-object v1, p0, LKd/e$e$a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lac/e;->get(Ljava/lang/String;)Lac/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, LKd/e$e$a;->a:LKd/e;

    iget-object v3, p0, LKd/e$e$a;->c:Lwa/a;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v3, p0, LKd/e$e$a;->c:Lwa/a;

    invoke-static {v2, v0, v3}, LKd/e;->e(LKd/e;Lac/b;Lwa/a;)LKd/a;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v5, p0, LKd/e$e$a;->d:LKd/a$a;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v7}, LKd/a;->b(LKd/a;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;LKd/a$a;ILjava/lang/Object;)LKd/a;

    move-result-object v0

    iget-object v1, p0, LKd/e$e$a;->a:LKd/e;

    invoke-static {v1}, LKd/e;->g(LKd/e;)Lac/e;

    move-result-object v1

    iget-object v2, p0, LKd/e$e$a;->a:LKd/e;

    invoke-static {v2, v0}, LKd/e;->f(LKd/e;LKd/a;)Lac/b;

    move-result-object v0

    invoke-interface {v1, v0}, Lac/e;->c(Lac/b;)J

    goto :goto_1

    :cond_1
    iget-object v0, p0, LKd/e$e$a;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/ubnt/teleport/TeleportTunnel$d;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Can\'t update teleport tunnel console since no Teleport tunnel found with "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x6

    invoke-static {v0, v1, v1, v2, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_1
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
