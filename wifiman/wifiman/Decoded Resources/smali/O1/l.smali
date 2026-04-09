.class public final LO1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO1/l$b;,
        LO1/l$c;,
        LO1/l$a;
    }
.end annotation


# static fields
.field public static final k:LO1/l$a;

.field private static final l:Ljava/util/Set;

.field private static final m:Ljava/lang/Object;


# instance fields
.field private final a:Lmh/a;

.field private final b:LO1/j;

.field private final c:LO1/a;

.field private final d:LIi/N;

.field private final e:LLi/g;

.field private final f:Ljava/lang/String;

.field private final g:LYg/m;

.field private final h:LLi/z;

.field private i:Ljava/util/List;

.field private final j:LO1/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LO1/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO1/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LO1/l;->k:LO1/l$a;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, LO1/l;->l:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LO1/l;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lmh/a;LO1/j;Ljava/util/List;LO1/a;LIi/N;)V
    .locals 1

    const-string v0, "produceFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initTasksList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "corruptionHandler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO1/l;->a:Lmh/a;

    iput-object p2, p0, LO1/l;->b:LO1/j;

    iput-object p4, p0, LO1/l;->c:LO1/a;

    iput-object p5, p0, LO1/l;->d:LIi/N;

    new-instance p1, LO1/l$g;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, LO1/l$g;-><init>(LO1/l;Ldh/e;)V

    invoke-static {p1}, LLi/i;->A(Lmh/p;)LLi/g;

    move-result-object p1

    iput-object p1, p0, LO1/l;->e:LLi/g;

    const-string p1, ".tmp"

    iput-object p1, p0, LO1/l;->f:Ljava/lang/String;

    new-instance p1, LO1/l$h;

    invoke-direct {p1, p0}, LO1/l$h;-><init>(LO1/l;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LO1/l;->g:LYg/m;

    sget-object p1, LO1/n;->a:LO1/n;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LO1/l;->h:LLi/z;

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p3}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LO1/l;->i:Ljava/util/List;

    new-instance p1, LO1/k;

    new-instance p3, LO1/l$d;

    invoke-direct {p3, p0}, LO1/l$d;-><init>(LO1/l;)V

    sget-object p4, LO1/l$e;->a:LO1/l$e;

    new-instance v0, LO1/l$f;

    invoke-direct {v0, p0, p2}, LO1/l$f;-><init>(LO1/l;Ldh/e;)V

    invoke-direct {p1, p5, p3, p4, v0}, LO1/k;-><init>(LIi/N;Lmh/l;Lmh/p;Lmh/p;)V

    iput-object p1, p0, LO1/l;->j:LO1/k;

    return-void
.end method

.method public static final synthetic c()Ljava/util/Set;
    .locals 1

    sget-object v0, LO1/l;->l:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic d()Ljava/lang/Object;
    .locals 1

    sget-object v0, LO1/l;->m:Ljava/lang/Object;

    return-object v0
.end method

.method public static final synthetic e(LO1/l;)LO1/k;
    .locals 0

    iget-object p0, p0, LO1/l;->j:LO1/k;

    return-object p0
.end method

.method public static final synthetic f(LO1/l;)LLi/z;
    .locals 0

    iget-object p0, p0, LO1/l;->h:LLi/z;

    return-object p0
.end method

.method public static final synthetic g(LO1/l;)Ljava/io/File;
    .locals 0

    invoke-direct {p0}, LO1/l;->r()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(LO1/l;)Lmh/a;
    .locals 0

    iget-object p0, p0, LO1/l;->a:Lmh/a;

    return-object p0
.end method

.method public static final synthetic i(LO1/l;LO1/l$b$a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LO1/l;->s(LO1/l$b$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(LO1/l;LO1/l$b$b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LO1/l;->t(LO1/l$b$b;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LO1/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LO1/l;->u(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(LO1/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LO1/l;->v(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(LO1/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LO1/l;->w(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(LO1/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LO1/l;->x(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(LO1/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LO1/l;->y(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(LO1/l;Lmh/p;Ldh/i;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LO1/l;->z(Lmh/p;Ldh/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final q(Ljava/io/File;)V
    .locals 2

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unable to create parent directories of "

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final r()Ljava/io/File;
    .locals 1

    iget-object v0, p0, LO1/l;->g:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    return-object v0
.end method

.method private final s(LO1/l$b$a;Ldh/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LO1/l;->h:LLi/z;

    invoke-interface {v0}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO1/m;

    instance-of v1, v0, LO1/b;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, v0, LO1/i;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, LO1/l$b$a;->a()LO1/m;

    move-result-object p1

    if-ne v0, p1, :cond_5

    invoke-direct {p0, p2}, LO1/l;->w(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_2
    sget-object p1, LO1/n;->a:LO1/n;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0, p2}, LO1/l;->w(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_4
    instance-of p1, v0, LO1/g;

    if-nez p1, :cond_6

    :cond_5
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can\'t read in final state."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final t(LO1/l$b$b;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, LO1/l$i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LO1/l$i;

    iget v1, v0, LO1/l$i;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO1/l$i;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, LO1/l$i;

    invoke-direct {v0, p0, p2}, LO1/l$i;-><init>(LO1/l;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LO1/l$i;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO1/l$i;->f:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LO1/l$i;->a:Ljava/lang/Object;

    check-cast p1, LIi/x;

    :goto_1
    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p2

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LO1/l$i;->c:Ljava/lang/Object;

    check-cast p1, LIi/x;

    iget-object v2, v0, LO1/l$i;->b:Ljava/lang/Object;

    check-cast v2, LO1/l;

    iget-object v4, v0, LO1/l$i;->a:Ljava/lang/Object;

    check-cast v4, LO1/l$b$b;

    :try_start_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p2, p1

    move-object p1, v4

    goto :goto_3

    :cond_3
    iget-object p1, v0, LO1/l$i;->a:Ljava/lang/Object;

    check-cast p1, LIi/x;

    goto :goto_1

    :cond_4
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, LO1/l$b$b;->a()LIi/x;

    move-result-object p2

    :try_start_2
    sget-object v2, LYg/u;->b:LYg/u$a;

    iget-object v2, p0, LO1/l;->h:LLi/z;

    invoke-interface {v2}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO1/m;

    instance-of v6, v2, LO1/b;

    if-eqz v6, :cond_6

    invoke-virtual {p1}, LO1/l$b$b;->d()Lmh/p;

    move-result-object v2

    invoke-virtual {p1}, LO1/l$b$b;->b()Ldh/i;

    move-result-object p1

    iput-object p2, v0, LO1/l$i;->a:Ljava/lang/Object;

    iput v5, v0, LO1/l$i;->f:I

    invoke-direct {p0, v2, p1, v0}, LO1/l;->z(Lmh/p;Ldh/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto :goto_5

    :cond_6
    instance-of v6, v2, LO1/i;

    if-eqz v6, :cond_7

    goto :goto_2

    :cond_7
    instance-of v5, v2, LO1/n;

    :goto_2
    if-eqz v5, :cond_a

    invoke-virtual {p1}, LO1/l$b$b;->c()LO1/m;

    move-result-object v5

    if-ne v2, v5, :cond_9

    iput-object p1, v0, LO1/l$i;->a:Ljava/lang/Object;

    iput-object p0, v0, LO1/l$i;->b:Ljava/lang/Object;

    iput-object p2, v0, LO1/l$i;->c:Ljava/lang/Object;

    iput v4, v0, LO1/l$i;->f:I

    invoke-direct {p0, v0}, LO1/l;->v(Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v2, p0

    :goto_3
    invoke-virtual {p1}, LO1/l$b$b;->d()Lmh/p;

    move-result-object v4

    invoke-virtual {p1}, LO1/l$b$b;->b()Ldh/i;

    move-result-object p1

    iput-object p2, v0, LO1/l$i;->a:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, LO1/l$i;->b:Ljava/lang/Object;

    iput-object v5, v0, LO1/l$i;->c:Ljava/lang/Object;

    iput v3, v0, LO1/l$i;->f:I

    invoke-direct {v2, v4, p1, v0}, LO1/l;->z(Lmh/p;Ldh/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_5

    return-object v1

    :goto_4
    :try_start_3
    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_6

    :cond_9
    :try_start_4
    check-cast v2, LO1/i;

    invoke-virtual {v2}, LO1/i;->a()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_a
    instance-of p1, v2, LO1/g;

    if-eqz p1, :cond_b

    check-cast v2, LO1/g;

    invoke-virtual {v2}, LO1/g;->a()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_5
    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-static {p2}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_6
    invoke-static {p1, p2}, LIi/z;->c(LIi/x;Ljava/lang/Object;)Z

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final u(Ldh/e;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p1, LO1/l$j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LO1/l$j;

    iget v1, v0, LO1/l$j;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO1/l$j;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, LO1/l$j;

    invoke-direct {v0, p0, p1}, LO1/l$j;-><init>(LO1/l;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LO1/l$j;->g:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO1/l$j;->i:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, LO1/l$j;->d:Ljava/lang/Object;

    check-cast v1, LTi/a;

    iget-object v2, v0, LO1/l$j;->c:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/J;

    iget-object v3, v0, LO1/l$j;->b:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/N;

    iget-object v0, v0, LO1/l$j;->a:Ljava/lang/Object;

    check-cast v0, LO1/l;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LO1/l$j;->f:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v8, v0, LO1/l$j;->e:Ljava/lang/Object;

    check-cast v8, LO1/l$k;

    iget-object v9, v0, LO1/l$j;->d:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/J;

    iget-object v10, v0, LO1/l$j;->c:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/N;

    iget-object v11, v0, LO1/l$j;->b:Ljava/lang/Object;

    check-cast v11, LTi/a;

    iget-object v12, v0, LO1/l$j;->a:Ljava/lang/Object;

    check-cast v12, LO1/l;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v2, v0, LO1/l$j;->d:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v8, v0, LO1/l$j;->c:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/N;

    iget-object v9, v0, LO1/l$j;->b:Ljava/lang/Object;

    check-cast v9, LTi/a;

    iget-object v10, v0, LO1/l$j;->a:Ljava/lang/Object;

    check-cast v10, LO1/l;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LO1/l;->h:LLi/z;

    invoke-interface {p1}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v2, LO1/n;->a:LO1/n;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, LO1/l;->h:LLi/z;

    invoke-interface {p1}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, LO1/i;

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    move p1, v5

    goto :goto_2

    :cond_6
    :goto_1
    move p1, v6

    :goto_2
    if-eqz p1, :cond_d

    invoke-static {v5, v6, v7}, LTi/g;->b(ZILjava/lang/Object;)LTi/a;

    move-result-object v9

    new-instance v2, Lkotlin/jvm/internal/N;

    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    iput-object p0, v0, LO1/l$j;->a:Ljava/lang/Object;

    iput-object v9, v0, LO1/l$j;->b:Ljava/lang/Object;

    iput-object v2, v0, LO1/l$j;->c:Ljava/lang/Object;

    iput-object v2, v0, LO1/l$j;->d:Ljava/lang/Object;

    iput v6, v0, LO1/l$j;->i:I

    invoke-direct {p0, v0}, LO1/l;->y(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object v10, p0

    move-object v8, v2

    :goto_3
    iput-object p1, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    new-instance p1, Lkotlin/jvm/internal/J;

    invoke-direct {p1}, Lkotlin/jvm/internal/J;-><init>()V

    new-instance v2, LO1/l$k;

    invoke-direct {v2, v9, p1, v8, v10}, LO1/l$k;-><init>(LTi/a;Lkotlin/jvm/internal/J;Lkotlin/jvm/internal/N;LO1/l;)V

    iget-object v11, v10, LO1/l;->i:Ljava/util/List;

    if-nez v11, :cond_8

    move-object v2, p1

    move-object p1, v0

    move-object v0, v10

    goto :goto_5

    :cond_8
    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-object v12, v10

    move-object v10, v8

    move-object v8, v2

    move-object v2, v11

    move-object v11, v9

    move-object v9, p1

    :cond_9
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmh/p;

    iput-object v12, v0, LO1/l$j;->a:Ljava/lang/Object;

    iput-object v11, v0, LO1/l$j;->b:Ljava/lang/Object;

    iput-object v10, v0, LO1/l$j;->c:Ljava/lang/Object;

    iput-object v9, v0, LO1/l$j;->d:Ljava/lang/Object;

    iput-object v8, v0, LO1/l$j;->e:Ljava/lang/Object;

    iput-object v2, v0, LO1/l$j;->f:Ljava/lang/Object;

    iput v4, v0, LO1/l$j;->i:I

    invoke-interface {p1, v8, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_a
    move-object p1, v0

    move-object v2, v9

    move-object v8, v10

    move-object v9, v11

    move-object v0, v12

    :goto_5
    iput-object v7, v0, LO1/l;->i:Ljava/util/List;

    iput-object v0, p1, LO1/l$j;->a:Ljava/lang/Object;

    iput-object v8, p1, LO1/l$j;->b:Ljava/lang/Object;

    iput-object v2, p1, LO1/l$j;->c:Ljava/lang/Object;

    iput-object v9, p1, LO1/l$j;->d:Ljava/lang/Object;

    iput-object v7, p1, LO1/l$j;->e:Ljava/lang/Object;

    iput-object v7, p1, LO1/l$j;->f:Ljava/lang/Object;

    iput v3, p1, LO1/l$j;->i:I

    invoke-interface {v9, v7, p1}, LTi/a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    return-object v1

    :cond_b
    move-object v3, v8

    move-object v1, v9

    :goto_6
    :try_start_0
    iput-boolean v6, v2, Lkotlin/jvm/internal/J;->a:Z

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v7}, LTi/a;->d(Ljava/lang/Object;)V

    iget-object p1, v0, LO1/l;->h:LLi/z;

    new-instance v0, LO1/b;

    iget-object v1, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v5

    :cond_c
    invoke-direct {v0, v1, v5}, LO1/b;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v1, v7}, LTi/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final v(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, LO1/l$l;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LO1/l$l;

    iget v1, v0, LO1/l$l;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO1/l$l;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LO1/l$l;

    invoke-direct {v0, p0, p1}, LO1/l$l;-><init>(LO1/l;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LO1/l$l;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO1/l$l;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, LO1/l$l;->a:Ljava/lang/Object;

    check-cast v0, LO1/l;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v0, LO1/l$l;->a:Ljava/lang/Object;

    iput v3, v0, LO1/l$l;->d:I

    invoke-direct {p0, v0}, LO1/l;->u(Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_2
    iget-object v0, v0, LO1/l;->h:LLi/z;

    new-instance v1, LO1/i;

    invoke-direct {v1, p1}, LO1/i;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    throw p1
.end method

.method private final w(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, LO1/l$m;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LO1/l$m;

    iget v1, v0, LO1/l$m;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO1/l$m;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LO1/l$m;

    invoke-direct {v0, p0, p1}, LO1/l$m;-><init>(LO1/l;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LO1/l$m;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO1/l$m;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, LO1/l$m;->a:Ljava/lang/Object;

    check-cast v0, LO1/l;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v0, LO1/l$m;->a:Ljava/lang/Object;

    iput v3, v0, LO1/l$m;->d:I

    invoke-direct {p0, v0}, LO1/l;->u(Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_1
    iget-object v0, v0, LO1/l;->h:LLi/z;

    new-instance v1, LO1/i;

    invoke-direct {v1, p1}, LO1/i;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    :cond_3
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final x(Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, LO1/l$n;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LO1/l$n;

    iget v1, v0, LO1/l$n;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO1/l$n;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, LO1/l$n;

    invoke-direct {v0, p0, p1}, LO1/l$n;-><init>(LO1/l;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LO1/l$n;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO1/l$n;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, LO1/l$n;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v2, v0, LO1/l$n;->b:Ljava/lang/Object;

    check-cast v2, Ljava/io/Closeable;

    iget-object v0, v0, LO1/l$n;->a:Ljava/lang/Object;

    check-cast v0, LO1/l;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {p0}, LO1/l;->r()Ljava/io/File;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object p1, p0, LO1/l;->b:LO1/j;

    iput-object p0, v0, LO1/l$n;->a:Ljava/lang/Object;

    iput-object v2, v0, LO1/l$n;->b:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v0, LO1/l$n;->c:Ljava/lang/Object;

    iput v3, v0, LO1/l$n;->f:I

    invoke-interface {p1, v2, v0}, LO1/j;->c(Ljava/io/InputStream;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, v4

    :goto_1
    :try_start_3
    invoke-static {v2, v1}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_2
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_5
    invoke-static {v2, p1}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_1
    move-exception p1

    move-object v0, p0

    :goto_3
    invoke-direct {v0}, LO1/l;->r()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object p1, v0, LO1/l;->b:LO1/j;

    invoke-interface {p1}, LO1/j;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    throw p1
.end method

.method private final y(Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, LO1/l$o;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LO1/l$o;

    iget v1, v0, LO1/l$o;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO1/l$o;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LO1/l$o;

    invoke-direct {v0, p0, p1}, LO1/l$o;-><init>(LO1/l;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LO1/l$o;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO1/l$o;->e:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, LO1/l$o;->b:Ljava/lang/Object;

    iget-object v0, v0, LO1/l$o;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/datastore/core/CorruptionException;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LO1/l$o;->b:Ljava/lang/Object;

    check-cast v2, Landroidx/datastore/core/CorruptionException;

    iget-object v4, v0, LO1/l$o;->a:Ljava/lang/Object;

    check-cast v4, LO1/l;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object v2, v0, LO1/l$o;->a:Ljava/lang/Object;

    check-cast v2, LO1/l;

    :try_start_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_4
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, LO1/l$o;->a:Ljava/lang/Object;

    iput v5, v0, LO1/l$o;->e:I

    invoke-direct {p0, v0}, LO1/l;->x(Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_2 .. :try_end_2} :catch_2

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    return-object p1

    :catch_2
    move-exception p1

    move-object v2, p0

    :goto_2
    iget-object v5, v2, LO1/l;->c:LO1/a;

    iput-object v2, v0, LO1/l$o;->a:Ljava/lang/Object;

    iput-object p1, v0, LO1/l$o;->b:Ljava/lang/Object;

    iput v4, v0, LO1/l$o;->e:I

    invoke-interface {v5, p1, v0}, LO1/a;->a(Landroidx/datastore/core/CorruptionException;Ldh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    return-object v1

    :cond_6
    move-object v6, v2

    move-object v2, p1

    move-object p1, v4

    move-object v4, v6

    :goto_3
    :try_start_3
    iput-object v2, v0, LO1/l$o;->a:Ljava/lang/Object;

    iput-object p1, v0, LO1/l$o;->b:Ljava/lang/Object;

    iput v3, v0, LO1/l$o;->e:I

    invoke-virtual {v4, p1, v0}, LO1/l;->A(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    if-ne v0, v1, :cond_7

    return-object v1

    :cond_7
    move-object v1, p1

    :goto_4
    return-object v1

    :catch_3
    move-exception p1

    move-object v0, v2

    :goto_5
    invoke-static {v0, p1}, LYg/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final z(Lmh/p;Ldh/i;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, LO1/l$p;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LO1/l$p;

    iget v1, v0, LO1/l$p;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO1/l$p;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, LO1/l$p;

    invoke-direct {v0, p0, p3}, LO1/l$p;-><init>(LO1/l;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LO1/l$p;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO1/l$p;->f:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, LO1/l$p;->b:Ljava/lang/Object;

    iget-object p2, v0, LO1/l$p;->a:Ljava/lang/Object;

    check-cast p2, LO1/l;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LO1/l$p;->c:Ljava/lang/Object;

    iget-object p2, v0, LO1/l$p;->b:Ljava/lang/Object;

    check-cast p2, LO1/b;

    iget-object v2, v0, LO1/l$p;->a:Ljava/lang/Object;

    check-cast v2, LO1/l;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p3, p0, LO1/l;->h:LLi/z;

    invoke-interface {p3}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LO1/b;

    invoke-virtual {p3}, LO1/b;->a()V

    invoke-virtual {p3}, LO1/b;->b()Ljava/lang/Object;

    move-result-object v2

    new-instance v6, LO1/l$q;

    invoke-direct {v6, p1, v2, v3}, LO1/l$q;-><init>(Lmh/p;Ljava/lang/Object;Ldh/e;)V

    iput-object p0, v0, LO1/l$p;->a:Ljava/lang/Object;

    iput-object p3, v0, LO1/l$p;->b:Ljava/lang/Object;

    iput-object v2, v0, LO1/l$p;->c:Ljava/lang/Object;

    iput v5, v0, LO1/l$p;->f:I

    invoke-static {p2, v6, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object p2, p3

    move-object p3, p1

    move-object p1, v2

    move-object v2, p0

    :goto_1
    invoke-virtual {p2}, LO1/b;->a()V

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_4

    :cond_5
    iput-object v2, v0, LO1/l$p;->a:Ljava/lang/Object;

    iput-object p3, v0, LO1/l$p;->b:Ljava/lang/Object;

    iput-object v3, v0, LO1/l$p;->c:Ljava/lang/Object;

    iput v4, v0, LO1/l$p;->f:I

    invoke-virtual {v2, p3, v0}, LO1/l;->A(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object p1, p3

    move-object p2, v2

    :goto_2
    iget-object p2, p2, LO1/l;->h:LLi/z;

    new-instance p3, LO1/b;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    :goto_3
    invoke-direct {p3, p1, v0}, LO1/b;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p2, p3}, LLi/z;->setValue(Ljava/lang/Object;)V

    :goto_4
    return-object p1
.end method


# virtual methods
.method public final A(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, LO1/l$r;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LO1/l$r;

    iget v1, v0, LO1/l$r;->h:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO1/l$r;->h:I

    goto :goto_0

    :cond_0
    new-instance v0, LO1/l$r;

    invoke-direct {v0, p0, p2}, LO1/l$r;-><init>(LO1/l;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LO1/l$r;->f:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO1/l$r;->h:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LO1/l$r;->e:Ljava/lang/Object;

    check-cast p1, Ljava/io/FileOutputStream;

    iget-object v1, v0, LO1/l$r;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v2, v0, LO1/l$r;->c:Ljava/lang/Object;

    check-cast v2, Ljava/io/Closeable;

    iget-object v3, v0, LO1/l$r;->b:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    iget-object v0, v0, LO1/l$r;->a:Ljava/lang/Object;

    check-cast v0, LO1/l;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-direct {p0}, LO1/l;->r()Ljava/io/File;

    move-result-object p2

    invoke-direct {p0, p2}, LO1/l;->q(Ljava/io/File;)V

    new-instance p2, Ljava/io/File;

    invoke-direct {p0}, LO1/l;->r()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, LO1/l;->f:Ljava/lang/String;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p2, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object v4, p0, LO1/l;->b:LO1/j;

    new-instance v5, LO1/l$c;

    invoke-direct {v5, v2}, LO1/l$c;-><init>(Ljava/io/FileOutputStream;)V

    iput-object p0, v0, LO1/l$r;->a:Ljava/lang/Object;

    iput-object p2, v0, LO1/l$r;->b:Ljava/lang/Object;

    iput-object v2, v0, LO1/l$r;->c:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v0, LO1/l$r;->d:Ljava/lang/Object;

    iput-object v2, v0, LO1/l$r;->e:Ljava/lang/Object;

    iput v3, v0, LO1/l$r;->h:I

    invoke-interface {v4, p1, v5, v0}, LO1/j;->a(Ljava/lang/Object;Ljava/io/OutputStream;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v3, p2

    move-object p1, v2

    move-object v1, v6

    :goto_1
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {v2, v1}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-direct {v0}, LO1/l;->r()Ljava/io/File;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    if-eqz p1, :cond_4

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_4
    :try_start_5
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to rename "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p1

    move-object p2, v3

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v3, p2

    :goto_2
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p2

    :try_start_7
    invoke-static {v2, p1}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    :catch_1
    move-exception p1

    :goto_3
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    :cond_5
    throw p1
.end method

.method public a(Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, LIi/z;->b(LIi/y0;ILjava/lang/Object;)LIi/x;

    move-result-object v0

    iget-object v1, p0, LO1/l;->h:LLi/z;

    invoke-interface {v1}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO1/m;

    new-instance v2, LO1/l$b$b;

    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v3

    invoke-direct {v2, p1, v0, v1, v3}, LO1/l$b$b;-><init>(Lmh/p;LIi/x;LO1/m;Ldh/i;)V

    iget-object p1, p0, LO1/l;->j:LO1/k;

    invoke-virtual {p1, v2}, LO1/k;->e(Ljava/lang/Object;)V

    invoke-interface {v0, p2}, LIi/V;->await(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()LLi/g;
    .locals 1

    iget-object v0, p0, LO1/l;->e:LLi/g;

    return-object v0
.end method
