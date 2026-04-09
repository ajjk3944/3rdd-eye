.class abstract synthetic LLi/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmh/l;

.field private static final b:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LLi/n;

    invoke-direct {v0}, LLi/n;-><init>()V

    sput-object v0, LLi/p;->a:Lmh/l;

    new-instance v0, LLi/o;

    invoke-direct {v0}, LLi/o;-><init>()V

    sput-object v0, LLi/p;->b:Lmh/p;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LLi/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LLi/p;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static final e(LLi/g;)LLi/g;
    .locals 2

    instance-of v0, p0, LLi/N;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LLi/p;->a:Lmh/l;

    sget-object v1, LLi/p;->b:Lmh/p;

    invoke-static {p0, v0, v1}, LLi/p;->h(LLi/g;Lmh/l;Lmh/p;)LLi/g;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final f(LLi/g;Lmh/p;)LLi/g;
    .locals 2

    sget-object v0, LLi/p;->a:Lmh/l;

    const-string v1, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-static {p1, v1}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmh/p;

    invoke-static {p0, v0, p1}, LLi/p;->h(LLi/g;Lmh/l;Lmh/p;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method public static final g(LLi/g;Lmh/l;)LLi/g;
    .locals 1

    sget-object v0, LLi/p;->b:Lmh/p;

    invoke-static {p0, p1, v0}, LLi/p;->h(LLi/g;Lmh/l;Lmh/p;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method private static final h(LLi/g;Lmh/l;Lmh/p;)LLi/g;
    .locals 2

    instance-of v0, p0, LLi/e;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LLi/e;

    iget-object v1, v0, LLi/e;->b:Lmh/l;

    if-ne v1, p1, :cond_0

    iget-object v0, v0, LLi/e;->c:Lmh/p;

    if-ne v0, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LLi/e;

    invoke-direct {v0, p0, p1, p2}, LLi/e;-><init>(LLi/g;Lmh/l;Lmh/p;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
