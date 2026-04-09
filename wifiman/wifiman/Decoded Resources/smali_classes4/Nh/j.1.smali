.class public final LNh/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLh/g;


# static fields
.field static final synthetic i:[Lth/l;


# instance fields
.field private final a:LMh/k;

.field private final b:LQh/a;

.field private final c:Loi/j;

.field private final d:Loi/i;

.field private final e:LPh/a;

.field private final f:Loi/i;

.field private final g:Z

.field private final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LNh/j;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "fqName"

    const-string v4, "getFqName()Lorg/jetbrains/kotlin/name/FqName;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v3

    const-string v4, "type"

    const-string v5, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    invoke-direct {v2, v3, v4, v5}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v4, "allValueArguments"

    const-string v5, "getAllValueArguments()Ljava/util/Map;"

    invoke-direct {v3, v1, v4, v5}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Lth/l;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, LNh/j;->i:[Lth/l;

    return-void
.end method

.method public constructor <init>(LMh/k;LQh/a;Z)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaAnnotation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LNh/j;->a:LMh/k;

    .line 3
    iput-object p2, p0, LNh/j;->b:LQh/a;

    .line 4
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object v0

    new-instance v1, LNh/g;

    invoke-direct {v1, p0}, LNh/g;-><init>(LNh/j;)V

    invoke-interface {v0, v1}, Loi/n;->b(Lmh/a;)Loi/j;

    move-result-object v0

    iput-object v0, p0, LNh/j;->c:Loi/j;

    .line 5
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object v0

    new-instance v1, LNh/h;

    invoke-direct {v1, p0}, LNh/h;-><init>(LNh/j;)V

    invoke-interface {v0, v1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object v0

    iput-object v0, p0, LNh/j;->d:Loi/i;

    .line 6
    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->t()LPh/b;

    move-result-object v0

    invoke-interface {v0, p2}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v0

    iput-object v0, p0, LNh/j;->e:LPh/a;

    .line 7
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p1

    new-instance v0, LNh/i;

    invoke-direct {v0, p0}, LNh/i;-><init>(LNh/j;)V

    invoke-interface {p1, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LNh/j;->f:Loi/i;

    .line 8
    invoke-interface {p2}, LQh/a;->d()Z

    move-result p1

    iput-boolean p1, p0, LNh/j;->g:Z

    .line 9
    invoke-interface {p2}, LQh/a;->u()Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, LNh/j;->h:Z

    return-void
.end method

.method public synthetic constructor <init>(LMh/k;LQh/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LNh/j;-><init>(LMh/k;LQh/a;Z)V

    return-void
.end method

.method static synthetic b(LNh/j;)LZh/c;
    .locals 0

    invoke-static {p0}, LNh/j;->i(LNh/j;)LZh/c;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(LNh/j;)Lpi/d0;
    .locals 0

    invoke-static {p0}, LNh/j;->s(LNh/j;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(LNh/j;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, LNh/j;->g(LNh/j;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LNh/j;)Ljava/util/Map;
    .locals 4

    iget-object v0, p0, LNh/j;->b:LQh/a;

    invoke-interface {v0}, LQh/a;->j()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQh/b;

    invoke-interface {v2}, LQh/b;->getName()LZh/f;

    move-result-object v3

    if-nez v3, :cond_1

    sget-object v3, LJh/I;->c:LZh/f;

    :cond_1
    invoke-direct {p0, v2}, LNh/j;->n(LQh/b;)Ldi/g;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v3, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v1}, LZg/U;->r(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final h(LZh/c;)LBh/e;
    .locals 2

    iget-object v0, p0, LNh/j;->a:LMh/k;

    invoke-virtual {v0}, LMh/k;->d()LBh/G;

    move-result-object v0

    sget-object v1, LZh/b;->d:LZh/b$a;

    invoke-virtual {v1, p1}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object p1

    iget-object v1, p0, LNh/j;->a:LMh/k;

    invoke-virtual {v1}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {v1}, LMh/d;->b()LSh/n;

    move-result-object v1

    invoke-virtual {v1}, LSh/n;->f()Lli/n;

    move-result-object v1

    invoke-virtual {v1}, Lli/n;->r()LBh/L;

    move-result-object v1

    invoke-static {v0, p1, v1}, LBh/y;->d(LBh/G;LZh/b;LBh/L;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method private static final i(LNh/j;)LZh/c;
    .locals 0

    iget-object p0, p0, LNh/j;->b:LQh/a;

    invoke-interface {p0}, LQh/a;->b()LZh/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LZh/b;->a()LZh/c;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private final n(LQh/b;)Ldi/g;
    .locals 3

    instance-of v0, p1, LQh/o;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Ldi/i;->a:Ldi/i;

    check-cast p1, LQh/o;

    invoke-interface {p1}, LQh/o;->getValue()Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Ldi/i;->f(Ldi/i;Ljava/lang/Object;LBh/G;ILjava/lang/Object;)Ldi/g;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LQh/m;

    if-eqz v0, :cond_1

    check-cast p1, LQh/m;

    invoke-interface {p1}, LQh/m;->b()LZh/b;

    move-result-object v0

    invoke-interface {p1}, LQh/m;->d()LZh/f;

    move-result-object p1

    invoke-direct {p0, v0, p1}, LNh/j;->q(LZh/b;LZh/f;)Ldi/g;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LQh/e;

    if-eqz v0, :cond_3

    check-cast p1, LQh/e;

    invoke-interface {p1}, LQh/b;->getName()LZh/f;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, LJh/I;->c:LZh/f;

    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p1}, LQh/e;->e()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, p1}, LNh/j;->p(LZh/f;Ljava/util/List;)Ldi/g;

    move-result-object v1

    goto :goto_0

    :cond_3
    instance-of v0, p1, LQh/c;

    if-eqz v0, :cond_4

    check-cast p1, LQh/c;

    invoke-interface {p1}, LQh/c;->a()LQh/a;

    move-result-object p1

    invoke-direct {p0, p1}, LNh/j;->o(LQh/a;)Ldi/g;

    move-result-object v1

    goto :goto_0

    :cond_4
    instance-of v0, p1, LQh/h;

    if-eqz v0, :cond_5

    check-cast p1, LQh/h;

    invoke-interface {p1}, LQh/h;->c()LQh/x;

    move-result-object p1

    invoke-direct {p0, p1}, LNh/j;->r(LQh/x;)Ldi/g;

    move-result-object v1

    :cond_5
    :goto_0
    return-object v1
.end method

.method private final o(LQh/a;)Ldi/g;
    .locals 8

    new-instance v0, Ldi/a;

    new-instance v7, LNh/j;

    iget-object v2, p0, LNh/j;->a:LMh/k;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, LNh/j;-><init>(LMh/k;LQh/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v7}, Ldi/a;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)V

    return-object v0
.end method

.method private final p(LZh/f;Ljava/util/List;)Ldi/g;
    .locals 3

    invoke-virtual {p0}, LNh/j;->l()Lpi/d0;

    move-result-object v0

    invoke-static {v0}, Lpi/W;->a(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p0}, Lfi/e;->l(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)LBh/e;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1, v0}, LKh/a;->b(LZh/f;LBh/e;)LBh/s0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, LBh/r0;->getType()Lpi/S;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, p0, LNh/j;->a:LMh/k;

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object p1

    invoke-virtual {p1}, LMh/d;->m()LBh/G;

    move-result-object p1

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    sget-object v0, Lpi/N0;->INVARIANT:Lpi/N0;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/error/k;->UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->l(Lpi/N0;Lpi/S;)Lpi/d0;

    move-result-object p1

    const-string v0, "getArrayType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQh/b;

    invoke-direct {p0, v1}, LNh/j;->n(LQh/b;)Ldi/g;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Ldi/u;

    invoke-direct {v1}, Ldi/u;-><init>()V

    :cond_3
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    sget-object p2, Ldi/i;->a:Ldi/i;

    invoke-virtual {p2, v0, p1}, Ldi/i;->c(Ljava/util/List;Lpi/S;)Ldi/b;

    move-result-object p1

    return-object p1
.end method

.method private final q(LZh/b;LZh/f;)Ldi/g;
    .locals 1

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ldi/k;

    invoke-direct {v0, p1, p2}, Ldi/k;-><init>(LZh/b;LZh/f;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final r(LQh/x;)Ldi/g;
    .locals 8

    sget-object v0, Ldi/s;->b:Ldi/s$a;

    iget-object v1, p0, LNh/j;->a:LMh/k;

    invoke-virtual {v1}, LMh/k;->g()LOh/e;

    move-result-object v1

    sget-object v2, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object p1

    invoke-virtual {v0, p1}, Ldi/s$a;->a(Lpi/S;)Ldi/g;

    move-result-object p1

    return-object p1
.end method

.method private static final s(LNh/j;)Lpi/d0;
    .locals 7

    invoke-virtual {p0}, LNh/j;->e()LZh/c;

    move-result-object v6

    if-nez v6, :cond_0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/k;->NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    iget-object p0, p0, LNh/j;->b:LQh/a;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, LAh/d;->a:LAh/d;

    iget-object v1, p0, LNh/j;->a:LMh/k;

    invoke-virtual {v1}, LMh/k;->d()LBh/G;

    move-result-object v1

    invoke-interface {v1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, v6

    invoke-static/range {v0 .. v5}, LAh/d;->f(LAh/d;LZh/c;Lkotlin/reflect/jvm/internal/impl/builtins/i;Ljava/lang/Integer;ILjava/lang/Object;)LBh/e;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, LNh/j;->b:LQh/a;

    invoke-interface {v0}, LQh/a;->y()LQh/g;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LNh/j;->a:LMh/k;

    invoke-virtual {v1}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {v1}, LMh/d;->n()LMh/n;

    move-result-object v1

    invoke-interface {v1, v0}, LMh/n;->a(LQh/g;)LBh/e;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    invoke-direct {p0, v6}, LNh/j;->h(LZh/c;)LBh/e;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, LNh/j;->f:Loi/i;

    sget-object v1, LNh/j;->i:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LNh/j;->g:Z

    return v0
.end method

.method public e()LZh/c;
    .locals 3

    iget-object v0, p0, LNh/j;->c:Loi/j;

    sget-object v1, LNh/j;->i:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->b(Loi/j;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZh/c;

    return-object v0
.end method

.method public bridge synthetic getType()Lpi/S;
    .locals 1

    invoke-virtual {p0}, LNh/j;->l()Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j()LBh/g0;
    .locals 1

    invoke-virtual {p0}, LNh/j;->k()LPh/a;

    move-result-object v0

    return-object v0
.end method

.method public k()LPh/a;
    .locals 1

    iget-object v0, p0, LNh/j;->e:LPh/a;

    return-object v0
.end method

.method public l()Lpi/d0;
    .locals 3

    iget-object v0, p0, LNh/j;->d:Loi/i;

    sget-object v1, LNh/j;->i:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/d0;

    return-object v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, LNh/j;->h:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/n;->h:Lkotlin/reflect/jvm/internal/impl/renderer/n;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p0, v1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->Q(Lkotlin/reflect/jvm/internal/impl/renderer/n;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/e;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
