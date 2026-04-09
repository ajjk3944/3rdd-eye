.class public final Lwh/m0;
.super Lwh/E0;
.source "SourceFile"

# interfaces
.implements Lth/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/m0$a;
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

    .line 3
    invoke-direct {p0, p1, p2}, Lwh/E0;-><init>(Lwh/d0;LBh/Y;)V

    .line 4
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lwh/l0;

    invoke-direct {p2, p0}, Lwh/l0;-><init>(Lwh/m0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/m0;->q:LYg/m;

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

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lwh/E0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lwh/l0;

    invoke-direct {p2, p0}, Lwh/l0;-><init>(Lwh/m0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/m0;->q:LYg/m;

    return-void
.end method

.method private static final t0(Lwh/m0;)Lwh/m0$a;
    .locals 1

    new-instance v0, Lwh/m0$a;

    invoke-direct {v0, p0}, Lwh/m0$a;-><init>(Lwh/m0;)V

    return-object v0
.end method

.method static synthetic u0(Lwh/m0;)Lwh/m0$a;
    .locals 0

    invoke-static {p0}, Lwh/m0;->t0(Lwh/m0;)Lwh/m0$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic g()Lth/h$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwh/m0;->v0()Lwh/m0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lth/j$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lwh/m0;->v0()Lwh/m0$a;

    move-result-object v0

    return-object v0
.end method

.method public v0()Lwh/m0$a;
    .locals 1

    iget-object v0, p0, Lwh/m0;->q:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/m0$a;

    return-object v0
.end method

.method public w0(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lwh/m0;->v0()Lwh/m0$a;

    move-result-object v0

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwh/A;->call([Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
