.class final LI7/P$C;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->B0(Lcom/wireguard/crypto/b;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/wireguard/crypto/b;


# direct methods
.method constructor <init>(LI7/P;Ljava/lang/String;Lcom/wireguard/crypto/b;)V
    .locals 0

    iput-object p1, p0, LI7/P$C;->a:LI7/P;

    iput-object p2, p0, LI7/P$C;->b:Ljava/lang/String;

    iput-object p3, p0, LI7/P$C;->c:Lcom/wireguard/crypto/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LI7/P$C;->l(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LI7/P$C;->j(Lmh/l;Ljava/lang/Object;)Lgg/D;

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

.method private static final l(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method


# virtual methods
.method public final h(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)Lgg/D;
    .locals 4

    invoke-interface {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;->d()Lgg/z;

    move-result-object v0

    new-instance v1, LI7/P$C$a;

    iget-object v2, p0, LI7/P$C;->a:LI7/P;

    iget-object v3, p0, LI7/P$C;->b:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, LI7/P$C$a;-><init>(LI7/P;Ljava/lang/String;)V

    new-instance v2, LI7/x0;

    invoke-direct {v2, v1}, LI7/x0;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, LI7/P$C$b;

    iget-object v2, p0, LI7/P$C;->c:Lcom/wireguard/crypto/b;

    iget-object v3, p0, LI7/P$C;->b:Ljava/lang/String;

    invoke-direct {v1, p1, v2, v3}, LI7/P$C$b;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;Lcom/wireguard/crypto/b;Ljava/lang/String;)V

    new-instance p1, LI7/y0;

    invoke-direct {p1, v1}, LI7/y0;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;

    invoke-virtual {p0, p1}, LI7/P$C;->h(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
