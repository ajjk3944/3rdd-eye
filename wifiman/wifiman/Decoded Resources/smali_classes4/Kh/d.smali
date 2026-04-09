.class public final LKh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LKh/d;

.field private static final b:LZh/f;

.field private static final c:LZh/f;

.field private static final d:LZh/f;

.field private static final e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LKh/d;

    invoke-direct {v0}, LKh/d;-><init>()V

    sput-object v0, LKh/d;->a:LKh/d;

    const-string v0, "message"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LKh/d;->b:LZh/f;

    const-string v0, "allowedTargets"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LKh/d;->c:LZh/f;

    const-string v0, "value"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LKh/d;->d:LZh/f;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->H:LZh/c;

    sget-object v1, LJh/I;->d:LZh/c;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->L:LZh/c;

    sget-object v2, LJh/I;->f:LZh/c;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->P:LZh/c;

    sget-object v3, LJh/I;->i:LZh/c;

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LKh/d;->e:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f(LKh/d;LQh/a;LMh/k;ZILjava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LKh/d;->e(LQh/a;LMh/k;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LZh/c;LQh/d;LMh/k;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 7

    const-string v0, "kotlinName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->y:LZh/c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LJh/I;->h:LZh/c;

    const-string v1, "DEPRECATED_ANNOTATION"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, LQh/d;->l(LZh/c;)LQh/a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p2}, LQh/d;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance p1, LKh/h;

    invoke-direct {p1, v0, p3}, LKh/h;-><init>(LQh/a;LMh/k;)V

    return-object p1

    :cond_1
    sget-object v0, LKh/d;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZh/c;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p2, p1}, LQh/d;->l(LZh/c;)LQh/a;

    move-result-object v2

    if-eqz v2, :cond_2

    sget-object v1, LKh/d;->a:LKh/d;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p3

    invoke-static/range {v1 .. v6}, LKh/d;->f(LKh/d;LQh/a;LMh/k;ZILjava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final b()LZh/f;
    .locals 1

    sget-object v0, LKh/d;->b:LZh/f;

    return-object v0
.end method

.method public final c()LZh/f;
    .locals 1

    sget-object v0, LKh/d;->d:LZh/f;

    return-object v0
.end method

.method public final d()LZh/f;
    .locals 1

    sget-object v0, LKh/d;->c:LZh/f;

    return-object v0
.end method

.method public final e(LQh/a;LMh/k;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 4

    const-string v0, "annotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LQh/a;->b()LZh/b;

    move-result-object v0

    sget-object v1, LZh/b;->d:LZh/b$a;

    sget-object v2, LJh/I;->d:LZh/c;

    const-string v3, "TARGET_ANNOTATION"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance p3, LKh/n;

    invoke-direct {p3, p1, p2}, LKh/n;-><init>(LQh/a;LMh/k;)V

    goto :goto_0

    :cond_0
    sget-object v2, LJh/I;->f:LZh/c;

    const-string v3, "RETENTION_ANNOTATION"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p3, LKh/l;

    invoke-direct {p3, p1, p2}, LKh/l;-><init>(LQh/a;LMh/k;)V

    goto :goto_0

    :cond_1
    sget-object v2, LJh/I;->i:LZh/c;

    const-string v3, "DOCUMENTED_ANNOTATION"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance p3, LKh/c;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->P:LZh/c;

    invoke-direct {p3, p2, p1, v0}, LKh/c;-><init>(LMh/k;LQh/a;LZh/c;)V

    goto :goto_0

    :cond_2
    sget-object v2, LJh/I;->h:LZh/c;

    const-string v3, "DEPRECATED_ANNOTATION"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p3, 0x0

    goto :goto_0

    :cond_3
    new-instance v0, LNh/j;

    invoke-direct {v0, p2, p1, p3}, LNh/j;-><init>(LMh/k;LQh/a;Z)V

    move-object p3, v0

    :goto_0
    return-object p3
.end method
