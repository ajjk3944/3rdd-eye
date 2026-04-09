.class public final Lcom/ui/wifiman/model/teleport/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFd/C;


# instance fields
.field private final a:LFd/D;

.field private final b:Lcom/ui/wifiman/model/teleport/k;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/session/TeleportSession;LFd/D;Lcom/ui/wifiman/model/teleport/k;LLd/f;)V
    .locals 1

    const-string v0, "teleportSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportStatusService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudSessionService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/i;->a:LFd/D;

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/i;->b:Lcom/ui/wifiman/model/teleport/k;

    invoke-interface {p4}, LLd/f;->a()Lgg/i;

    move-result-object p2

    sget-object p4, Lcom/ui/wifiman/model/teleport/i$c;->a:Lcom/ui/wifiman/model/teleport/i$c;

    invoke-virtual {p2, p4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string p4, "switchMap(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/i;->c:Lgg/i;

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/session/TeleportSession;->c()Lgg/i;

    move-result-object p1

    invoke-interface {p3}, Lcom/ui/wifiman/model/teleport/k;->getAll()Lgg/i;

    move-result-object p3

    sget-object p4, Lcom/ui/wifiman/model/teleport/i$a;->a:Lcom/ui/wifiman/model/teleport/i$a;

    invoke-static {p1, p3, p2, p4}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/teleport/i$b;->a:Lcom/ui/wifiman/model/teleport/i$b;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p4, 0x1

    invoke-virtual {p1, p2, p3, p4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/i;->d:Lgg/i;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/i;->getAll()Lgg/i;

    move-result-object p1

    sget-object p3, Lcom/ui/wifiman/model/teleport/i$d;->a:Lcom/ui/wifiman/model/teleport/i$d;

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/i;->e:Lgg/i;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/i;->getAll()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/teleport/i$e;->a:Lcom/ui/wifiman/model/teleport/i$e;

    invoke-virtual {p1, p2}, Lgg/i;->Y(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/teleport/i$f;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/teleport/i$f;-><init>(Lcom/ui/wifiman/model/teleport/i;)V

    invoke-virtual {p1, p2}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->c0()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->h1()Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string p2, "ignoreElements(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/i;->f:Lgg/b;

    return-void
.end method

.method public static final synthetic c(Lcom/ui/wifiman/model/teleport/i;)LFd/D;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/i;->a:LFd/D;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/i;->e:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/i;->f:Lgg/b;

    return-object v0
.end method

.method public getAll()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/i;->d:Lgg/i;

    return-object v0
.end method
