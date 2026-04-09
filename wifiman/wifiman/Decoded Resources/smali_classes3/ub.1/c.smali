.class public final Lub/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lub/c;

.field private static final b:Laj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lub/c;

    invoke-direct {v0}, Lub/c;-><init>()V

    sput-object v0, Lub/c;->a:Lub/c;

    new-instance v0, Lub/a;

    invoke-direct {v0}, Lub/a;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object v0

    sput-object v0, Lub/c;->b:Laj/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)LVi/a;
    .locals 0

    invoke-static {p0}, Lub/c;->f(Ljava/lang/String;)LVi/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Laj/e;)LYg/J;
    .locals 0

    invoke-static {p0}, Lub/c;->e(Laj/e;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Laj/e;)LYg/J;
    .locals 3

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "name"

    invoke-virtual {p0, v0}, Laj/e;->c(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Laj/e;->d(Z)V

    invoke-virtual {p0, v0}, Laj/e;->f(Z)V

    invoke-virtual {p0, v0}, Laj/e;->g(Z)V

    new-instance v0, Lcj/f;

    invoke-direct {v0}, Lcj/f;-><init>()V

    const-class v1, Lmb/x;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    new-instance v2, Lub/b;

    invoke-direct {v2}, Lub/b;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcj/f;->d(Lth/d;Lmh/l;)V

    invoke-virtual {v0}, Lcj/f;->h()Lcj/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Laj/e;->h(Lcj/e;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Ljava/lang/String;)LVi/a;
    .locals 0

    sget-object p0, Lmb/E;->Companion:Lmb/E$b;

    invoke-virtual {p0}, Lmb/E$b;->serializer()LVi/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/util/Map;)Ljava/util/Map;
    .locals 2

    const-string/jumbo v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LZg/U;->t(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final d()Laj/b;
    .locals 1

    sget-object v0, Lub/c;->b:Laj/b;

    return-object v0
.end method
