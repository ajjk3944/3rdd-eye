.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d;->b(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Ljava/lang/String;LKg/a;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;->d(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Ljava/lang/String;LKg/a;Lgg/j;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;LKg/a;Ljava/lang/String;LKg/e;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;->e(Ljava/lang/String;LKg/a;Ljava/lang/String;LKg/e;)V

    return-void
.end method

.method private static final d(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Ljava/lang/String;LKg/a;Lgg/j;)V
    .locals 5

    const-string v0, "BonjourJMDNS"

    const-string v1, "Service browse "

    const-string v2, "emitter"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->i(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lgg/h;)LKg/e;

    move-result-object v2

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->f(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v3, Lcom/ui/wifiman/model/discovery/engine/bonjour/h;

    invoke-direct {v3, p1, p2, p0, v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/h;-><init>(Ljava/lang/String;LKg/a;Ljava/lang/String;LKg/e;)V

    invoke-interface {p3, v3}, Lgg/j;->d(Lkg/e;)V

    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " STARTING"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p0, v2}, LKg/a;->b0(Ljava/lang/String;LKg/e;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " STARTED"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " START FAILED"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p0, v0}, LZ7/b;->i(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "addServiceListener \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' FAILED"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p3, p2}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method private static final e(Ljava/lang/String;LKg/a;Ljava/lang/String;LKg/e;)V
    .locals 4

    const-string v0, "BonjourJMDNS"

    const-string v1, "\' listener"

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "removing service \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, LKg/a;->n0(Ljava/lang/String;LKg/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "FAILED to remove service\'"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1, v0}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKg/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;->c(LKg/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final c(LKg/a;)LDj/a;
    .locals 3

    const-string v0, "jmdns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;->b:Ljava/lang/String;

    new-instance v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/g;

    invoke-direct {v2, v0, v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/g;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Ljava/lang/String;LKg/a;)V

    sget-object p1, Lgg/a;->BUFFER:Lgg/a;

    invoke-static {v2, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
