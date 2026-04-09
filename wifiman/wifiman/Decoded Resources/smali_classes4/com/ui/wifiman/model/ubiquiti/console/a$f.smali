.class public final Lcom/ui/wifiman/model/ubiquiti/console/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/a;->c(Ljava/util/List;Ljava/util/UUID;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/console/a;

.field final synthetic c:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/ui/wifiman/model/ubiquiti/console/a;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$f;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$f;->b:Lcom/ui/wifiman/model/ubiquiti/console/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$f;->c:Ljava/util/UUID;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ConsolesManager - caching consoles "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$f;->b:Lcom/ui/wifiman/model/ubiquiti/console/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/a;->h(Lcom/ui/wifiman/model/ubiquiti/console/a;)LNb/e;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$f;->a:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/ubiquiti/console/e;

    iget-object v4, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$f;->b:Lcom/ui/wifiman/model/ubiquiti/console/a;

    iget-object v5, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$f;->c:Ljava/util/UUID;

    invoke-static {v4, v3, v5}, Lcom/ui/wifiman/model/ubiquiti/console/a;->g(Lcom/ui/wifiman/model/ubiquiti/console/a;Lcom/ui/wifiman/model/ubiquiti/console/e;Ljava/util/UUID;)LNb/d;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-interface {v0, v2}, LNb/e;->c(Ljava/util/List;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
