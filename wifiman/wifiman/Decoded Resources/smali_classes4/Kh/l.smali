.class public final LKh/l;
.super LKh/c;
.source "SourceFile"


# static fields
.field static final synthetic h:[Lth/l;


# instance fields
.field private final g:Loi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LKh/l;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "allValueArguments"

    const-string v3, "getAllValueArguments()Ljava/util/Map;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LKh/l;->h:[Lth/l;

    return-void
.end method

.method public constructor <init>(LQh/a;LMh/k;)V
    .locals 1

    const-string v0, "annotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->L:LZh/c;

    invoke-direct {p0, p2, p1, v0}, LKh/c;-><init>(LMh/k;LQh/a;LZh/c;)V

    invoke-virtual {p2}, LMh/k;->e()Loi/n;

    move-result-object p1

    new-instance p2, LKh/k;

    invoke-direct {p2, p0}, LKh/k;-><init>(LKh/l;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LKh/l;->g:Loi/i;

    return-void
.end method

.method static synthetic h(LKh/l;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, LKh/l;->i(LKh/l;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final i(LKh/l;)Ljava/util/Map;
    .locals 1

    sget-object v0, LKh/f;->a:LKh/f;

    invoke-virtual {p0}, LKh/c;->c()LQh/b;

    move-result-object p0

    invoke-virtual {v0, p0}, LKh/f;->b(LQh/b;)Ldi/g;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, LKh/d;->a:LKh/d;

    invoke-virtual {v0}, LKh/d;->c()LZh/f;

    move-result-object v0

    invoke-static {v0, p0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    invoke-static {p0}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, LKh/l;->g:Loi/i;

    sget-object v1, LKh/l;->h:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method
