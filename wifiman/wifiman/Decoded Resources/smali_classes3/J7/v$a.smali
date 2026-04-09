.class final LJ7/v$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/v;->b(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

.field final synthetic b:LJ7/v;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;LJ7/v;)V
    .locals 0

    iput-object p1, p0, LJ7/v$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    iput-object p2, p0, LJ7/v$a;->b:LJ7/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LJ7/v$a;->j(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)LJ7/m;
    .locals 0

    invoke-static {p0, p1}, LJ7/v$a;->l(Lmh/l;Ljava/lang/Object;)LJ7/m;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method

.method private static final l(Lmh/l;Ljava/lang/Object;)LJ7/m;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ7/m;

    return-object p0
.end method


# virtual methods
.method public final h(Ljava/lang/String;)Lgg/D;
    .locals 4

    iget-object v0, p0, LJ7/v$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    instance-of v1, v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    if-eqz v1, :cond_0

    iget-object v0, p0, LJ7/v$a;->b:LJ7/v;

    invoke-static {v0}, LJ7/v;->d(LJ7/v;)LJ7/G;

    move-result-object v0

    invoke-interface {v0}, LJ7/G;->getClientId()Lgg/z;

    move-result-object v0

    new-instance v1, LJ7/v$a$a;

    iget-object v2, p0, LJ7/v$a;->b:LJ7/v;

    iget-object v3, p0, LJ7/v$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    invoke-direct {v1, v2, v3, p1}, LJ7/v$a$a;-><init>(LJ7/v;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;Ljava/lang/String;)V

    new-instance v2, LJ7/s;

    invoke-direct {v2, v1}, LJ7/s;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    if-eqz v1, :cond_1

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object v0

    :goto_0
    new-instance v1, LJ7/v$a$b;

    iget-object v2, p0, LJ7/v$a;->b:LJ7/v;

    invoke-direct {v1, v2, p1}, LJ7/v$a$b;-><init>(LJ7/v;Ljava/lang/String;)V

    new-instance p1, LJ7/t;

    invoke-direct {p1, v1}, LJ7/t;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LJ7/v$a;->h(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
