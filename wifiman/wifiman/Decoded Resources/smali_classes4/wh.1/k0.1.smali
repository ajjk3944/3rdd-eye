.class public final Lwh/k0;
.super Lwh/B0;
.source "SourceFile"

# interfaces
.implements Lth/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/k0$a;
    }
.end annotation


# instance fields
.field private final q:LYg/m;


# direct methods
.method public constructor <init>(Lwh/d0;LBh/Y;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lwh/B0;-><init>(Lwh/d0;LBh/Y;)V

    .line 2
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lwh/j0;

    invoke-direct {p2, p0}, Lwh/j0;-><init>(Lwh/k0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/k0;->q:LYg/m;

    return-void
.end method

.method public constructor <init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lwh/B0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lwh/j0;

    invoke-direct {p2, p0}, Lwh/j0;-><init>(Lwh/k0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/k0;->q:LYg/m;

    return-void
.end method

.method private static final t0(Lwh/k0;)Lwh/k0$a;
    .locals 1

    new-instance v0, Lwh/k0$a;

    invoke-direct {v0, p0}, Lwh/k0$a;-><init>(Lwh/k0;)V

    return-object v0
.end method

.method static synthetic u0(Lwh/k0;)Lwh/k0$a;
    .locals 0

    invoke-static {p0}, Lwh/k0;->t0(Lwh/k0;)Lwh/k0$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic g()Lth/h$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwh/k0;->v0()Lwh/k0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lth/i$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lwh/k0;->v0()Lwh/k0$a;

    move-result-object v0

    return-object v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lwh/k0;->v0()Lwh/k0$a;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwh/A;->call([Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public v0()Lwh/k0$a;
    .locals 1

    iget-object v0, p0, Lwh/k0;->q:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/k0$a;

    return-object v0
.end method
