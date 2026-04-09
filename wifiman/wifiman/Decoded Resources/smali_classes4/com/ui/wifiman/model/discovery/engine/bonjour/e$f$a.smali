.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;->b(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LKg/a;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;->d(LKg/a;Lgg/j;)V

    return-void
.end method

.method public static synthetic b(LKg/a;Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;->e(LKg/a;Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;)V

    return-void
.end method

.method private static final d(LKg/a;Lgg/j;)V
    .locals 3

    const-string v0, "BonjourJMDNS"

    const-string v1, "emitter"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;-><init>(Lgg/j;)V

    new-instance v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/k;

    invoke-direct {v2, p0, v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/k;-><init>(LKg/a;Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;)V

    invoke-interface {p1, v2}, Lgg/j;->d(Lkg/e;)V

    :try_start_0
    const-string v2, "Service type discovery STARTING"

    invoke-static {v2, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, LKg/a;->d0(LKg/f;)V

    const-string p0, "Service type discovery STARTED"

    invoke-static {p0, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    const-string v1, "Service type discovery START FAILED"

    invoke-static {v1, p0, v0}, LZ7/b;->i(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;

    const-string v1, "addServiceTypeListener FAILED"

    invoke-direct {v0, v1, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method private static final e(LKg/a;Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;)V
    .locals 2

    const-string v0, "BonjourJMDNS"

    :try_start_0
    const-string v1, "removing service type listener"

    invoke-static {v1, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LKg/a;->o0(LKg/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    const-string p1, "FAILED to remove serviceTypeListener"

    invoke-static {p1, p0, v0}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKg/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;->c(LKg/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final c(LKg/a;)LDj/a;
    .locals 1

    const-string v0, "jmdns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/j;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/j;-><init>(LKg/a;)V

    sget-object p1, Lgg/a;->BUFFER:Lgg/a;

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
