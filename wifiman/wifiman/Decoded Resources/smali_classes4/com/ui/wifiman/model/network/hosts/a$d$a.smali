.class public final Lcom/ui/wifiman/model/network/hosts/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/network/hosts/a$d;->a(Ljava/util/List;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/ui/wifiman/model/network/hosts/a;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/ui/wifiman/model/network/hosts/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a$d$a;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/ui/wifiman/model/network/hosts/a$d$a;->b:Lcom/ui/wifiman/model/network/hosts/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/network/hosts/a$d$a;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 11

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a$d$a;->a:Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a$d$a;->a:Ljava/util/List;

    invoke-static {v0}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRb/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LRb/c;->e()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    :goto_0
    move v5, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    const v0, 0x7fffffff

    goto :goto_0

    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a$d$a;->b:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/network/hosts/a;->g(Lcom/ui/wifiman/model/network/hosts/a;)LRb/a;

    move-result-object v0

    new-instance v10, LRb/c;

    iget-object v4, p0, Lcom/ui/wifiman/model/network/hosts/a$d$a;->c:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v2, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, LRb/c;-><init>(JLjava/lang/String;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v10}, [LRb/c;

    move-result-object v1

    invoke-interface {v0, v1}, LRb/a;->e([LRb/c;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {p1}, Lgg/c;->a()V

    goto :goto_3

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/ui/wifiman/model/network/hosts/a$d$a;->c:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NetworkHostsManager - failed to add host "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " due to a SQLiteConstraintException. Probably because the host is already added"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance v1, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostAlreadyAdded;

    iget-object v2, p0, Lcom/ui/wifiman/model/network/hosts/a$d$a;->c:Ljava/lang/String;

    invoke-direct {v1, v2, v0}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostAlreadyAdded;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
