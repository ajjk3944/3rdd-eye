.class final LI7/P$y$d$e$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$y$d$e;->n(Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;


# direct methods
.method constructor <init>(LI7/P;)V
    .locals 0

    iput-object p1, p0, LI7/P$y$d$e$f;->a:LI7/P;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, LI7/P$y$d$e$f;->v()V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, LI7/P$y$d$e$f;->o()V

    return-void
.end method

.method public static synthetic h(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$y$d$e$f;->t(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$y$d$e$f;->r(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$y$d$e$f;->p(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final o()V
    .locals 1

    sget-object v0, LI7/P$y$d$e$f$b;->a:LI7/P$y$d$e$f$b;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method private static final p(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final r(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final t(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final v()V
    .locals 1

    sget-object v0, LI7/P$y$d$e$f$f;->a:LI7/P$y$d$e$f$f;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/wireguard/android/backend/c$a;

    invoke-virtual {p0, p1}, LI7/P$y$d$e$f;->n(Lcom/wireguard/android/backend/c$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lcom/wireguard/android/backend/c$a;)Lgg/f;
    .locals 2

    new-instance v0, LI7/P$y$d$e$f$a;

    invoke-direct {v0, p1}, LI7/P$y$d$e$f$a;-><init>(Lcom/wireguard/android/backend/c$a;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    iget-object p1, p0, LI7/P$y$d$e$f;->a:LI7/P;

    invoke-static {p1}, LI7/P;->J(LI7/P;)Lcom/ubnt/teleport/unifi/stun/TeleportStun;

    move-result-object p1

    invoke-interface {p1}, Lcom/ubnt/teleport/unifi/stun/TeleportStun;->activateConnection()Lgg/b;

    move-result-object p1

    new-instance v0, LI7/s0;

    invoke-direct {v0}, LI7/s0;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    sget-object v0, LI7/P$y$d$e$f$c;->a:LI7/P$y$d$e$f$c;

    new-instance v1, LI7/t0;

    invoke-direct {v1, v0}, LI7/t0;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, LI7/P$y$d$e$f$d;

    iget-object v1, p0, LI7/P$y$d$e$f;->a:LI7/P;

    invoke-direct {v0, v1}, LI7/P$y$d$e$f$d;-><init>(LI7/P;)V

    new-instance v1, LI7/u0;

    invoke-direct {v1, v0}, LI7/u0;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    sget-object v0, LI7/P$y$d$e$f$e;->a:LI7/P$y$d$e$f$e;

    new-instance v1, LI7/v0;

    invoke-direct {v1, v0}, LI7/v0;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, LI7/w0;

    invoke-direct {v0}, LI7/w0;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
