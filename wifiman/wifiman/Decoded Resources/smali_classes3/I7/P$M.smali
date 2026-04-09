.class final LI7/P$M;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;Lcom/ubnt/teleport/unifi/stun/TeleportStun;Lcom/wireguard/android/backend/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/P$M$c;
    }
.end annotation


# instance fields
.field final synthetic a:LI7/P;


# direct methods
.method constructor <init>(LI7/P;)V
    .locals 0

    iput-object p1, p0, LI7/P$M;->a:LI7/P;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)Lgg/r;
    .locals 0

    invoke-static {p0, p1}, LI7/P$M;->l(Lmh/l;Ljava/lang/Object;)Lgg/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, LI7/P$M;->j(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method

.method private static final l(Lmh/l;Ljava/lang/Object;)Lgg/r;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/r;

    return-object p0
.end method


# virtual methods
.method public final h(LI7/P$b;)LDj/a;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, LI7/P$M$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-object p1, p0, LI7/P$M;->a:LI7/P;

    new-instance v0, LI7/P$M$d;

    invoke-direct {v0, p1}, LI7/P$M$d;-><init>(LI7/P;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LI7/P$M$a;->a:LI7/P$M$a;

    new-instance v1, LI7/z0;

    invoke-direct {v1, v0}, LI7/z0;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, LI7/P$M$b;

    iget-object v1, p0, LI7/P$M;->a:LI7/P;

    invoke-direct {v0, v1}, LI7/P$M$b;-><init>(LI7/P;)V

    new-instance v1, LI7/A0;

    invoke-direct {v1, v0}, LI7/A0;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI7/P$b;

    invoke-virtual {p0, p1}, LI7/P$M;->h(LI7/P$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
