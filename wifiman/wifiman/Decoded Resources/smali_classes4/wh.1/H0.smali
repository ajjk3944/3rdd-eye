.class public Lwh/H0;
.super Lwh/K0;
.source "SourceFile"

# interfaces
.implements Lth/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/H0$a;
    }
.end annotation


# instance fields
.field private final o:LYg/m;

.field private final p:LYg/m;


# direct methods
.method public constructor <init>(Lwh/d0;LBh/Y;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1, p2}, Lwh/K0;-><init>(Lwh/d0;LBh/Y;)V

    .line 6
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lwh/F0;

    invoke-direct {p2, p0}, Lwh/F0;-><init>(Lwh/H0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p2

    iput-object p2, p0, Lwh/H0;->o:LYg/m;

    .line 7
    new-instance p2, Lwh/G0;

    invoke-direct {p2, p0}, Lwh/G0;-><init>(Lwh/H0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/H0;->p:LYg/m;

    return-void
.end method

.method public constructor <init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lkotlin/jvm/internal/f;->NO_RECEIVER:Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lwh/K0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lwh/F0;

    invoke-direct {p2, p0}, Lwh/F0;-><init>(Lwh/H0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p2

    iput-object p2, p0, Lwh/H0;->o:LYg/m;

    .line 4
    new-instance p2, Lwh/G0;

    invoke-direct {p2, p0}, Lwh/G0;-><init>(Lwh/H0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/H0;->p:LYg/m;

    return-void
.end method

.method private static final o0(Lwh/H0;)Lwh/H0$a;
    .locals 1

    new-instance v0, Lwh/H0$a;

    invoke-direct {v0, p0}, Lwh/H0$a;-><init>(Lwh/H0;)V

    return-object v0
.end method

.method static synthetic p0(Lwh/H0;)Lwh/H0$a;
    .locals 0

    invoke-static {p0}, Lwh/H0;->o0(Lwh/H0;)Lwh/H0$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic q0(Lwh/H0;)Ljava/lang/reflect/Member;
    .locals 0

    invoke-static {p0}, Lwh/H0;->r0(Lwh/H0;)Ljava/lang/reflect/Member;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Lwh/H0;)Ljava/lang/reflect/Member;
    .locals 0

    invoke-virtual {p0}, Lwh/K0;->h0()Ljava/lang/reflect/Member;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public P(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwh/H0;->s0()Lwh/H0$a;

    move-result-object v0

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwh/A;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Lth/l$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwh/H0;->s0()Lwh/H0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lth/o$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lwh/H0;->s0()Lwh/H0$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lwh/H0;->P(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l0()Lwh/K0$c;
    .locals 1

    invoke-virtual {p0}, Lwh/H0;->s0()Lwh/H0$a;

    move-result-object v0

    return-object v0
.end method

.method public s0()Lwh/H0$a;
    .locals 1

    iget-object v0, p0, Lwh/H0;->o:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/H0$a;

    return-object v0
.end method
