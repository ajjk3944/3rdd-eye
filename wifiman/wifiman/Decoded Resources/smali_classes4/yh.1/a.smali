.class public final Lyh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lyh/a;

.field private static final b:Ljava/util/Set;

.field private static final c:LZh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lyh/a;

    invoke-direct {v0}, Lyh/a;-><init>()V

    sput-object v0, Lyh/a;->a:Lyh/a;

    sget-object v1, LJh/I;->a:LZh/c;

    sget-object v2, LJh/I;->l:LZh/c;

    sget-object v3, LJh/I;->m:LZh/c;

    sget-object v4, LJh/I;->d:LZh/c;

    sget-object v5, LJh/I;->f:LZh/c;

    sget-object v6, LJh/I;->i:LZh/c;

    filled-new-array/range {v1 .. v6}, [LZh/c;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v2, LZh/b;->d:LZh/b$a;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZh/c;

    invoke-virtual {v2, v3}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sput-object v1, Lyh/a;->b:Ljava/util/Set;

    sget-object v0, LZh/b;->d:LZh/b$a;

    sget-object v1, LJh/I;->j:LZh/c;

    const-string v2, "REPEATABLE_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v0

    sput-object v0, Lyh/a;->c:LZh/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LZh/b;
    .locals 1

    sget-object v0, Lyh/a;->c:LZh/b;

    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 1

    sget-object v0, Lyh/a;->b:Ljava/util/Set;

    return-object v0
.end method

.method public final c(LSh/x;)Z
    .locals 3

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/J;

    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    new-instance v1, Lyh/a$a;

    invoke-direct {v1, v0}, Lyh/a$a;-><init>(Lkotlin/jvm/internal/J;)V

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, LSh/x;->d(LSh/x$c;[B)V

    iget-boolean p1, v0, Lkotlin/jvm/internal/J;->a:Z

    return p1
.end method
