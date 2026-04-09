.class public final LKh/h;
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

    const-class v1, LKh/h;

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

    sput-object v1, LKh/h;->h:[Lth/l;

    return-void
.end method

.method public constructor <init>(LQh/a;LMh/k;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->y:LZh/c;

    invoke-direct {p0, p2, p1, v0}, LKh/c;-><init>(LMh/k;LQh/a;LZh/c;)V

    invoke-virtual {p2}, LMh/k;->e()Loi/n;

    move-result-object p1

    sget-object p2, LKh/g;->a:LKh/g;

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LKh/h;->g:Loi/i;

    return-void
.end method

.method static synthetic h()Ljava/util/Map;
    .locals 1

    invoke-static {}, LKh/h;->i()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static final i()Ljava/util/Map;
    .locals 3

    sget-object v0, LKh/d;->a:LKh/d;

    invoke-virtual {v0}, LKh/d;->b()LZh/f;

    move-result-object v0

    new-instance v1, Ldi/x;

    const-string v2, "Deprecated in Java"

    invoke-direct {v1, v2}, Ldi/x;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, LKh/h;->g:Loi/i;

    sget-object v1, LKh/h;->h:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method
