.class final Lcom/ui/wifiman/model/teleport/b$k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b$k;->a(Lcom/ui/wifiman/model/teleport/h;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/b;

.field final synthetic b:Lcom/ui/wifiman/model/teleport/h;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$k$b;->a:Lcom/ui/wifiman/model/teleport/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/b$k$b;->b:Lcom/ui/wifiman/model/teleport/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/teleport/n;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/teleport/b$k$b;->e(Lcom/ui/wifiman/model/teleport/n;)V

    return-void
.end method

.method public static synthetic b(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/n;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/teleport/b$k$b;->d(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/n;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/n;)Lgg/b;
    .locals 1

    const-string v0, "newTeleport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/ui/wifiman/model/teleport/b;->j(Lcom/ui/wifiman/model/teleport/b;)LFd/D;

    move-result-object p0

    invoke-interface {p0, p1}, LFd/D;->d(Lcom/ui/wifiman/model/teleport/n;)Lgg/b;

    move-result-object p0

    new-instance v0, Lcom/ui/wifiman/model/teleport/d;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/d;-><init>(Lcom/ui/wifiman/model/teleport/n;)V

    invoke-virtual {p0, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p0

    const-string p1, "doOnComplete(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final e(Lcom/ui/wifiman/model/teleport/n;)V
    .locals 2

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object p0

    invoke-virtual {p0}, LKd/a;->g()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TeleportConnection - Tunnel ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] stored"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$k$b;->c(Ll9/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ll9/a;)Lgg/D;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/teleport/n;

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object v2

    invoke-virtual {v2}, LKd/a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/ubnt/teleport/TeleportTunnel$d;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "TeleportConnection - Using tunnel "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "TeleportConnection - No tunnel found. Creating new one."

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/b$k$b;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {p1}, Lcom/ui/wifiman/model/teleport/b;->j(Lcom/ui/wifiman/model/teleport/b;)LFd/D;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$k$b;->b:Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/h;->j()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, LFd/D;->e(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/teleport/b$k$b$a;->a:Lcom/ui/wifiman/model/teleport/b$k$b$a;

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string v0, "doOnSuccess(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$k$b;->a:Lcom/ui/wifiman/model/teleport/b;

    new-instance v1, Lcom/ui/wifiman/model/teleport/e;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/teleport/e;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-static {p1, v1}, Ln9/c;->d(Lgg/z;Lmh/l;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method
