.class public final Lye/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lye/d$a;
    }
.end annotation


# static fields
.field public static final a:Lye/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lye/d;

    invoke-direct {v0}, Lye/d;-><init>()V

    sput-object v0, Lye/d;->a:Lye/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    sget-object p2, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lye/d;->b(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)Lye/d$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)Lgg/i;
    .locals 2

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAtLeast"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lye/g;->i0()LLi/g;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LQi/i;->c(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    new-instance v0, Lye/d$b;

    invoke-direct {v0, p2}, Lye/d$b;-><init>(Landroidx/lifecycle/k$b;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, Lye/d$c;

    invoke-direct {p2, p3}, Lye/d$c;-><init>(Lmh/a;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)Lye/d$a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAtLeast"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lye/d$a;

    invoke-direct {v0, p1, p2, p3}, Lye/d$a;-><init>(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)V

    return-object v0
.end method

.method public final d(Lgg/b;Lye/g;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v1

    new-instance v4, Lye/d$e;

    const/4 p2, 0x0

    invoke-direct {v4, p1, p2}, Lye/d$e;-><init>(Lgg/b;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public final e(Lgg/i;Lye/g;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v1

    new-instance v4, Lye/d$d;

    const/4 p2, 0x0

    invoke-direct {v4, p1, p2}, Lye/d$d;-><init>(Lgg/i;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method
