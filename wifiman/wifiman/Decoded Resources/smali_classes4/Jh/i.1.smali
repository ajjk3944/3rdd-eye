.class public final LJh/i;
.super LJh/U;
.source "SourceFile"


# static fields
.field public static final o:LJh/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJh/i;

    invoke-direct {v0}, LJh/i;-><init>()V

    sput-object v0, LJh/i;->o:LJh/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LJh/U;-><init>()V

    return-void
.end method

.method static synthetic i(LBh/b;)Z
    .locals 0

    invoke-static {p0}, LJh/i;->m(LBh/b;)Z

    move-result p0

    return p0
.end method

.method static synthetic j(LBh/b;)Z
    .locals 0

    invoke-static {p0}, LJh/i;->p(LBh/b;)Z

    move-result p0

    return p0
.end method

.method private final k(LBh/b;)Z
    .locals 1

    sget-object v0, LJh/U;->a:LJh/U$a;

    invoke-virtual {v0}, LJh/U$a;->e()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1}, LSh/C;->d(LBh/a;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LZg/v;->f0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public static final l(LBh/z;)LBh/z;
    .locals 4

    const-string v0, "functionDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/i;->o:LJh/i;

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LJh/i;->n(LZh/f;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, LJh/g;->a:LJh/g;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p0, v3, v0, v2, v1}, Lfi/e;->i(LBh/b;ZLmh/l;ILjava/lang/Object;)LBh/b;

    move-result-object p0

    check-cast p0, LBh/z;

    return-object p0
.end method

.method private static final m(LBh/b;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/i;->o:LJh/i;

    invoke-direct {v0, p0}, LJh/i;->k(LBh/b;)Z

    move-result p0

    return p0
.end method

.method public static final o(LBh/b;)LJh/U$b;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/U;->a:LJh/U$a;

    invoke-virtual {v0}, LJh/U$a;->d()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    sget-object v1, LJh/h;->a:LJh/h;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {p0, v4, v1, v3, v2}, Lfi/e;->i(LBh/b;ZLmh/l;ILjava/lang/Object;)LBh/b;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, LSh/C;->d(LBh/a;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p0}, LJh/U$a;->l(Ljava/lang/String;)LJh/U$b;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    return-object v2
.end method

.method private static final p(LBh/b;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LBh/z;

    if-eqz v0, :cond_0

    sget-object v0, LJh/i;->o:LJh/i;

    invoke-direct {v0, p0}, LJh/i;->k(LBh/b;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final n(LZh/f;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/U;->a:LJh/U$a;

    invoke-virtual {v0}, LJh/U$a;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
