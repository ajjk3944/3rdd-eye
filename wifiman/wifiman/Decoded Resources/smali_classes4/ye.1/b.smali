.class public final Lye/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lye/b$a;
    }
.end annotation


# static fields
.field public static final a:Lye/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lye/b;

    invoke-direct {v0}, Lye/b;-><init>()V

    sput-object v0, Lye/b;->a:Lye/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lye/b;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/b$a;
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    sget-object p2, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lye/b;->b(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)Lye/b$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)LLi/g;
    .locals 7

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAtLeast"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lye/g;->i0()LLi/g;

    move-result-object v0

    new-instance v1, Lye/b$c;

    invoke-direct {v1, v0, p2}, Lye/b$c;-><init>(LLi/g;Landroidx/lifecycle/k$b;)V

    invoke-static {v1}, LLi/i;->n(LLi/g;)LLi/g;

    move-result-object p2

    new-instance v0, Lye/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p3}, Lye/b$b;-><init>(Ldh/e;Lmh/a;)V

    invoke-static {p2, v0}, LLi/i;->O(LLi/g;Lmh/q;)LLi/g;

    move-result-object p2

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object p3

    invoke-static {p2, p3}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object p2

    invoke-static {p1}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object p1

    sget-object v0, LLi/J;->a:LLi/J$a;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v0 .. v6}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object p3

    const/4 v0, 0x1

    invoke-static {p2, p1, p3, v0}, LLi/i;->K(LLi/g;LIi/N;LLi/J;I)LLi/D;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)Lye/b$a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAtLeast"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lye/b$a;

    invoke-direct {v0, p1, p2, p3}, Lye/b$a;-><init>(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)V

    return-object v0
.end method
