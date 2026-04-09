.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m;->b(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

.field final synthetic b:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;LKg/a;Lgg/c;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;->d(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;LKg/a;Lgg/c;)V

    return-void
.end method

.method public static synthetic b(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;LKg/a;LKg/d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;->e(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;LKg/a;LKg/d;)V

    return-void
.end method

.method private static final d(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;LKg/a;Lgg/c;)V
    .locals 3

    const-string v0, "BonjourJMDNS"

    const-string v1, "emitter"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->e(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)LKg/d;

    move-result-object p0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/n;

    invoke-direct {v1, p1, p2, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/n;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;LKg/a;LKg/d;)V

    invoke-interface {p3, v1}, Lgg/c;->d(Lkg/e;)V

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "registering service broadcast "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p0}, LKg/a;->m0(LKg/d;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "service broadcast REGISTERED "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    new-instance p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;

    const-string p2, "addServiceListener FAILED"

    invoke-direct {p1, p2, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p3, p1}, Lgg/c;->c(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method private static final e(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;LKg/a;LKg/d;)V
    .locals 3

    const-string v0, "BonjourJMDNS"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "removing service broadcast "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LKg/a;->p0(LKg/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    const-string p1, "FAILED to remove serviceListener"

    invoke-static {p1, p0, v0}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKg/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;->c(LKg/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final c(LKg/a;)Lgg/f;
    .locals 3

    const-string v0, "jmdns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    new-instance v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/m;

    invoke-direct {v2, v0, v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/m;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;LKg/a;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
