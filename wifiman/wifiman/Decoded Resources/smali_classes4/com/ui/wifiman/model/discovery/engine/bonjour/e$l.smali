.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->n(Lgg/h;)LKg/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

.field final synthetic b:Lgg/h;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lgg/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$l;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$l;->b:Lgg/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LKg/c;)V
    .locals 5

    const/4 v0, 0x0

    const-string v1, "BonjourJMDNS"

    if-nez p1, :cond_0

    const-string p1, "serviceRemoved - null event"

    invoke-static {p1, v0, v1}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LKg/c;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "serviceRemoved - "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LKg/c;->d()LKg/d;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$l;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    invoke-static {v2, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->d(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;LKg/d;)Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$l;->b:Lgg/h;

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$b;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$b;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)V

    invoke-interface {v0, v1}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string p1, "serviceRemoved - parse failed"

    invoke-static {p1, v0, v1}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public c(LKg/c;)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LKg/c;->h()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, LKg/c;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "serviceAdded "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public e(LKg/c;)V
    .locals 5

    const/4 v0, 0x0

    const-string v1, "BonjourJMDNS"

    if-nez p1, :cond_0

    const-string p1, "serviceResolved - null event"

    invoke-static {p1, v0, v1}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LKg/c;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Bonjour serviceResolved - "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LKg/c;->d()LKg/d;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$l;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    invoke-static {v2, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->d(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;LKg/d;)Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$l;->b:Lgg/h;

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)V

    invoke-interface {v0, v1}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string p1, "serviceResolved - parse failed"

    invoke-static {p1, v0, v1}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
