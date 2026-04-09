.class public final Lrd/d$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/d$f;->a(LYg/s;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lrd/d$f$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;

    iput-object p2, p0, Lrd/d$f$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lrd/d$f$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;

    instance-of v1, v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->d()Ljava/util/Map;

    move-result-object v1

    const-string v2, "name"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lrd/d$f$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;

    check-cast v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->d()Ljava/util/Map;

    move-result-object v1

    const-string v2, "id"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lrd/d$f$a;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$b;

    if-eqz v1, :cond_3

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Lgg/o;->a()V

    goto :goto_2

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
