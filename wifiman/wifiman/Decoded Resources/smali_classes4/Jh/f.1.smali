.class public final LJh/f;
.super LJh/U;
.source "SourceFile"


# static fields
.field public static final o:LJh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJh/f;

    invoke-direct {v0}, LJh/f;-><init>()V

    sput-object v0, LJh/f;->o:LJh/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LJh/U;-><init>()V

    return-void
.end method

.method static synthetic i(LBh/f0;LBh/b;)Z
    .locals 0

    invoke-static {p0, p1}, LJh/f;->l(LBh/f0;LBh/b;)Z

    move-result p0

    return p0
.end method

.method private static final l(LBh/f0;LBh/b;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LJh/U;->a:LJh/U$a;

    invoke-virtual {p1}, LJh/U$a;->j()Ljava/util/Map;

    move-result-object p1

    invoke-static {p0}, LSh/C;->d(LBh/a;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final j(LBh/f0;)LZh/f;
    .locals 1

    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/U;->a:LJh/U$a;

    invoke-virtual {v0}, LJh/U$a;->j()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, LSh/C;->d(LBh/a;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZh/f;

    return-object p1
.end method

.method public final k(LBh/f0;)Z
    .locals 4

    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g0(LBh/m;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, LJh/e;

    invoke-direct {v0, p1}, LJh/e;-><init>(LBh/f0;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v1, v0, v3, v2}, Lfi/e;->i(LBh/b;ZLmh/l;ILjava/lang/Object;)LBh/b;

    move-result-object p1

    if-eqz p1, :cond_0

    move v1, v3

    :cond_0
    return v1
.end method

.method public final m(LBh/f0;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "removeAt"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LSh/C;->d(LBh/a;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, LJh/U;->a:LJh/U$a;

    invoke-virtual {v0}, LJh/U$a;->h()LJh/U$a$a;

    move-result-object v0

    invoke-virtual {v0}, LJh/U$a$a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
