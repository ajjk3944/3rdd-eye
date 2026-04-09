.class public Lwh/E0;
.super Lwh/K0;
.source "SourceFile"

# interfaces
.implements Lth/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/E0$a;
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

    .line 4
    invoke-direct {p0, p1, p2}, Lwh/K0;-><init>(Lwh/d0;LBh/Y;)V

    .line 5
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lwh/C0;

    invoke-direct {p2, p0}, Lwh/C0;-><init>(Lwh/E0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p2

    iput-object p2, p0, Lwh/E0;->o:LYg/m;

    .line 6
    new-instance p2, Lwh/D0;

    invoke-direct {p2, p0}, Lwh/D0;-><init>(Lwh/E0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/E0;->p:LYg/m;

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
    invoke-direct {p0, p1, p2, p3, p4}, Lwh/K0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lwh/C0;

    invoke-direct {p2, p0}, Lwh/C0;-><init>(Lwh/E0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p2

    iput-object p2, p0, Lwh/E0;->o:LYg/m;

    .line 3
    new-instance p2, Lwh/D0;

    invoke-direct {p2, p0}, Lwh/D0;-><init>(Lwh/E0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/E0;->p:LYg/m;

    return-void
.end method

.method private static final o0(Lwh/E0;)Lwh/E0$a;
    .locals 1

    new-instance v0, Lwh/E0$a;

    invoke-direct {v0, p0}, Lwh/E0$a;-><init>(Lwh/E0;)V

    return-object v0
.end method

.method static synthetic p0(Lwh/E0;)Lwh/E0$a;
    .locals 0

    invoke-static {p0}, Lwh/E0;->o0(Lwh/E0;)Lwh/E0$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic q0(Lwh/E0;)Ljava/lang/reflect/Member;
    .locals 0

    invoke-static {p0}, Lwh/E0;->r0(Lwh/E0;)Ljava/lang/reflect/Member;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Lwh/E0;)Ljava/lang/reflect/Member;
    .locals 0

    invoke-virtual {p0}, Lwh/K0;->h0()Ljava/lang/reflect/Member;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic d()Lth/l$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwh/E0;->s0()Lwh/E0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lth/n$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lwh/E0;->s0()Lwh/E0$a;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwh/E0;->s0()Lwh/E0$a;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwh/A;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lwh/E0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l0()Lwh/K0$c;
    .locals 1

    invoke-virtual {p0}, Lwh/E0;->s0()Lwh/E0$a;

    move-result-object v0

    return-object v0
.end method

.method public s0()Lwh/E0$a;
    .locals 1

    iget-object v0, p0, Lwh/E0;->o:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/E0$a;

    return-object v0
.end method
