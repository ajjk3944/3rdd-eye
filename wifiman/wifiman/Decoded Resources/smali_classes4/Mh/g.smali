.class public final LMh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;


# instance fields
.field private final a:LMh/k;

.field private final b:LQh/d;

.field private final c:Z

.field private final d:Loi/h;


# direct methods
.method public constructor <init>(LMh/k;LQh/d;Z)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LMh/g;->a:LMh/k;

    .line 3
    iput-object p2, p0, LMh/g;->b:LQh/d;

    .line 4
    iput-boolean p3, p0, LMh/g;->c:Z

    .line 5
    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object p1

    invoke-virtual {p1}, LMh/d;->u()Loi/n;

    move-result-object p1

    new-instance p2, LMh/f;

    invoke-direct {p2, p0}, LMh/f;-><init>(LMh/g;)V

    invoke-interface {p1, p2}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p1

    iput-object p1, p0, LMh/g;->d:Loi/h;

    return-void
.end method

.method public synthetic constructor <init>(LMh/k;LQh/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LMh/g;-><init>(LMh/k;LQh/d;Z)V

    return-void
.end method

.method static synthetic b(LMh/g;LQh/a;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 0

    invoke-static {p0, p1}, LMh/g;->e(LMh/g;LQh/a;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LMh/g;LQh/a;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 2

    const-string v0, "annotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LKh/d;->a:LKh/d;

    iget-object v1, p0, LMh/g;->a:LMh/k;

    iget-boolean p0, p0, LMh/g;->c:Z

    invoke-virtual {v0, p1, v1, p0}, LKh/d;->e(LQh/a;LMh/k;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public P(LZh/c;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$b;->b(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/c;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LMh/g;->b:LQh/d;

    invoke-interface {v0}, LQh/d;->getAnnotations()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LMh/g;->b:LQh/d;

    invoke-interface {v0}, LQh/d;->h()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5

    iget-object v0, p0, LMh/g;->b:LQh/d;

    invoke-interface {v0}, LQh/d;->getAnnotations()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v0

    iget-object v1, p0, LMh/g;->d:Loi/h;

    invoke-static {v0, v1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    sget-object v1, LKh/d;->a:LKh/d;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->y:LZh/c;

    iget-object v3, p0, LMh/g;->b:LQh/d;

    iget-object v4, p0, LMh/g;->a:LMh/k;

    invoke-virtual {v1, v2, v3, v4}, LKh/d;->a(LZh/c;LQh/d;LMh/k;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object v1

    invoke-static {v0, v1}, Lzi/m;->R(Lzi/j;Ljava/lang/Object;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->E(Lzi/j;)Lzi/j;

    move-result-object v0

    invoke-interface {v0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public l(LZh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 3

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMh/g;->b:LQh/d;

    invoke-interface {v0, p1}, LQh/d;->l(LZh/c;)LQh/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LMh/g;->d:Loi/h;

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LKh/d;->a:LKh/d;

    iget-object v1, p0, LMh/g;->b:LQh/d;

    iget-object v2, p0, LMh/g;->a:LMh/k;

    invoke-virtual {v0, p1, v1, v2}, LKh/d;->a(LZh/c;LQh/d;LMh/k;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object v0

    :cond_1
    return-object v0
.end method
