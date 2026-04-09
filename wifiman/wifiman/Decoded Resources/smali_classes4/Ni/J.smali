.class public abstract LNi/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LNi/C;

.field private static final b:Lmh/p;

.field private static final c:Lmh/p;

.field private static final d:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LNi/C;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LNi/J;->a:LNi/C;

    new-instance v0, LNi/G;

    invoke-direct {v0}, LNi/G;-><init>()V

    sput-object v0, LNi/J;->b:Lmh/p;

    new-instance v0, LNi/H;

    invoke-direct {v0}, LNi/H;-><init>()V

    sput-object v0, LNi/J;->c:Lmh/p;

    new-instance v0, LNi/I;

    invoke-direct {v0}, LNi/I;-><init>()V

    sput-object v0, LNi/J;->d:Lmh/p;

    return-void
.end method

.method public static synthetic a(LIi/T0;Ldh/i$b;)LIi/T0;
    .locals 0

    invoke-static {p0, p1}, LNi/J;->e(LIi/T0;Ldh/i$b;)LIi/T0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Ldh/i$b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LNi/J;->d(Ljava/lang/Object;Ldh/i$b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LNi/N;Ldh/i$b;)LNi/N;
    .locals 0

    invoke-static {p0, p1}, LNi/J;->h(LNi/N;Ldh/i$b;)LNi/N;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/Object;Ldh/i$b;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LIi/T0;

    if-eqz v0, :cond_3

    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_1

    :cond_1
    move p0, v0

    :goto_1
    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_3
    return-object p0
.end method

.method private static final e(LIi/T0;Ldh/i$b;)LIi/T0;
    .locals 0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    instance-of p0, p1, LIi/T0;

    if-eqz p0, :cond_1

    check-cast p1, LIi/T0;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public static final f(Ldh/i;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LNi/J;->a:LNi/C;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, LNi/N;

    if-eqz v0, :cond_1

    check-cast p1, LNi/N;

    invoke-virtual {p1, p0}, LNi/N;->b(Ldh/i;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    sget-object v1, LNi/J;->c:Lmh/p;

    invoke-interface {p0, v0, v1}, Ldh/i;->fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LIi/T0;

    invoke-interface {v0, p0, p1}, LIi/T0;->T(Ldh/i;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final g(Ldh/i;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, LNi/J;->b:Lmh/p;

    invoke-interface {p0, v0, v1}, Ldh/i;->fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final h(LNi/N;Ldh/i$b;)LNi/N;
    .locals 1

    instance-of v0, p1, LIi/T0;

    if-eqz v0, :cond_0

    check-cast p1, LIi/T0;

    iget-object v0, p0, LNi/N;->a:Ldh/i;

    invoke-interface {p1, v0}, LIi/T0;->f0(Ldh/i;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LNi/N;->a(LIi/T0;Ljava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public static final i(Ldh/i;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, LNi/J;->g(Ldh/i;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, LNi/J;->a:LNi/C;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, LNi/N;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, LNi/N;-><init>(Ldh/i;I)V

    sget-object p1, LNi/J;->d:Lmh/p;

    invoke-interface {p0, v0, p1}, Ldh/i;->fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LIi/T0;

    invoke-interface {p1, p0}, LIi/T0;->f0(Ldh/i;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
