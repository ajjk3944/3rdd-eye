.class public final LNh/n;
.super LDh/j;
.source "SourceFile"

# interfaces
.implements LLh/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNh/n$a;,
        LNh/n$b;
    }
.end annotation


# static fields
.field public static final y:LNh/n$a;

.field private static final z:Ljava/util/Set;


# instance fields
.field private final i:LMh/k;

.field private final j:LQh/g;

.field private final k:LBh/e;

.field private final l:LMh/k;

.field private final m:LYg/m;

.field private final n:LBh/f;

.field private final o:LBh/D;

.field private final p:LBh/w0;

.field private final q:Z

.field private final r:LNh/n$b;

.field private final s:LNh/z;

.field private final t:LBh/e0;

.field private final u:Lii/g;

.field private final v:LNh/a0;

.field private final w:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

.field private final x:Loi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LNh/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LNh/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LNh/n;->y:LNh/n$a;

    const-string v7, "notifyAll"

    const-string v8, "toString"

    const-string v2, "equals"

    const-string v3, "hashCode"

    const-string v4, "getClass"

    const-string v5, "wait"

    const-string v6, "notify"

    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LNh/n;->z:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(LMh/k;LBh/m;LQh/g;LBh/e;)V
    .locals 12

    move-object v8, p0

    move-object v6, p1

    move-object v9, p3

    move-object/from16 v7, p4

    const-string v0, "outerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    move-object v2, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object v1

    invoke-interface {p3}, LQh/t;->getName()LZh/f;

    move-result-object v3

    .line 3
    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->t()LPh/b;

    move-result-object v0

    invoke-interface {v0, p3}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    .line 4
    invoke-direct/range {v0 .. v5}, LDh/j;-><init>(Loi/n;LBh/m;LZh/f;LBh/g0;Z)V

    .line 5
    iput-object v6, v8, LNh/n;->i:LMh/k;

    .line 6
    iput-object v9, v8, LNh/n;->j:LQh/g;

    .line 7
    iput-object v7, v8, LNh/n;->k:LBh/e;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v2, p3

    .line 8
    invoke-static/range {v0 .. v5}, LMh/c;->f(LMh/k;LBh/g;LQh/z;IILjava/lang/Object;)LMh/k;

    move-result-object v10

    iput-object v10, v8, LNh/n;->l:LMh/k;

    .line 9
    invoke-virtual {v10}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->h()LKh/j;

    move-result-object v0

    invoke-interface {v0, p3, p0}, LKh/j;->b(LQh/g;LBh/e;)V

    .line 10
    invoke-interface {p3}, LQh/g;->I()LQh/D;

    .line 11
    new-instance v0, LNh/k;

    invoke-direct {v0, p0}, LNh/k;-><init>(LNh/n;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, v8, LNh/n;->m:LYg/m;

    .line 12
    invoke-interface {p3}, LQh/g;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LBh/f;->ANNOTATION_CLASS:LBh/f;

    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {p3}, LQh/g;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LBh/f;->INTERFACE:LBh/f;

    goto :goto_0

    .line 14
    :cond_1
    invoke-interface {p3}, LQh/g;->A()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LBh/f;->ENUM_CLASS:LBh/f;

    goto :goto_0

    .line 15
    :cond_2
    sget-object v0, LBh/f;->CLASS:LBh/f;

    .line 16
    :goto_0
    iput-object v0, v8, LNh/n;->n:LBh/f;

    .line 17
    invoke-interface {p3}, LQh/g;->n()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_6

    invoke-interface {p3}, LQh/g;->A()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    .line 18
    :cond_3
    sget-object v0, LBh/D;->Companion:LBh/D$a;

    .line 19
    invoke-interface {p3}, LQh/g;->E()Z

    move-result v3

    .line 20
    invoke-interface {p3}, LQh/g;->E()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {p3}, LQh/s;->isAbstract()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {p3}, LQh/g;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    move v4, v1

    goto :goto_2

    :cond_5
    :goto_1
    move v4, v2

    .line 21
    :goto_2
    invoke-interface {p3}, LQh/s;->isFinal()Z

    move-result v5

    xor-int/2addr v5, v2

    .line 22
    invoke-virtual {v0, v3, v4, v5}, LBh/D$a;->a(ZZZ)LBh/D;

    move-result-object v0

    goto :goto_4

    .line 23
    :cond_6
    :goto_3
    sget-object v0, LBh/D;->FINAL:LBh/D;

    :goto_4
    iput-object v0, v8, LNh/n;->o:LBh/D;

    .line 24
    invoke-interface {p3}, LQh/s;->getVisibility()LBh/w0;

    move-result-object v0

    iput-object v0, v8, LNh/n;->p:LBh/w0;

    .line 25
    invoke-interface {p3}, LQh/g;->f()LQh/g;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p3}, LQh/s;->Q()Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v2

    goto :goto_5

    :cond_7
    move v0, v1

    :goto_5
    iput-boolean v0, v8, LNh/n;->q:Z

    .line 26
    new-instance v0, LNh/n$b;

    invoke-direct {v0, p0}, LNh/n$b;-><init>(LNh/n;)V

    iput-object v0, v8, LNh/n;->r:LNh/n$b;

    .line 27
    new-instance v11, LNh/z;

    if-eqz v7, :cond_8

    move v4, v2

    goto :goto_6

    :cond_8
    move v4, v1

    :goto_6
    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, v11

    move-object v1, v10

    move-object v2, p0

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, LNh/z;-><init>(LMh/k;LBh/e;LQh/g;ZLNh/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v11, v8, LNh/n;->s:LNh/z;

    .line 28
    sget-object v0, LBh/e0;->e:LBh/e0$a;

    invoke-virtual {v10}, LMh/k;->e()Loi/n;

    move-result-object v1

    invoke-virtual {v10}, LMh/k;->a()LMh/d;

    move-result-object v2

    invoke-virtual {v2}, LMh/d;->k()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->d()Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    move-result-object v2

    new-instance v3, LNh/l;

    invoke-direct {v3, p0}, LNh/l;-><init>(LNh/n;)V

    invoke-virtual {v0, p0, v1, v2, v3}, LBh/e0$a;->a(LBh/e;Loi/n;Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lmh/l;)LBh/e0;

    move-result-object v0

    iput-object v0, v8, LNh/n;->t:LBh/e0;

    .line 29
    new-instance v0, Lii/g;

    invoke-direct {v0, v11}, Lii/g;-><init>(Lii/k;)V

    iput-object v0, v8, LNh/n;->u:Lii/g;

    .line 30
    new-instance v0, LNh/a0;

    invoke-direct {v0, v10, p3, p0}, LNh/a0;-><init>(LMh/k;LQh/g;LLh/c;)V

    iput-object v0, v8, LNh/n;->v:LNh/a0;

    .line 31
    invoke-static {v10, p3}, LMh/h;->a(LMh/k;LQh/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    iput-object v0, v8, LNh/n;->w:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    .line 32
    invoke-virtual {v10}, LMh/k;->e()Loi/n;

    move-result-object v0

    new-instance v1, LNh/m;

    invoke-direct {v1, p0}, LNh/m;-><init>(LNh/n;)V

    invoke-interface {v0, v1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object v0

    iput-object v0, v8, LNh/n;->x:Loi/i;

    return-void
.end method

.method public synthetic constructor <init>(LMh/k;LBh/m;LQh/g;LBh/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LNh/n;-><init>(LMh/k;LBh/m;LQh/g;LBh/e;)V

    return-void
.end method

.method public static final synthetic K0(LNh/n;)LBh/e;
    .locals 0

    iget-object p0, p0, LNh/n;->k:LBh/e;

    return-object p0
.end method

.method public static final synthetic L0(LNh/n;)LMh/k;
    .locals 0

    iget-object p0, p0, LNh/n;->l:LMh/k;

    return-object p0
.end method

.method static synthetic M0(LNh/n;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LNh/n;->W0(LNh/n;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic N0(LNh/n;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)LNh/z;
    .locals 0

    invoke-static {p0, p1}, LNh/n;->X0(LNh/n;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)LNh/z;

    move-result-object p0

    return-object p0
.end method

.method static synthetic O0(LNh/n;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LNh/n;->Q0(LNh/n;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final Q0(LNh/n;)Ljava/util/List;
    .locals 4

    iget-object v0, p0, LNh/n;->j:LQh/g;

    invoke-interface {v0}, LQh/z;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQh/y;

    iget-object v3, p0, LNh/n;->l:LMh/k;

    invoke-virtual {v3}, LMh/k;->f()LMh/p;

    move-result-object v3

    invoke-interface {v3, v2}, LMh/p;->a(LQh/y;)LBh/l0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Parameter "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " surely belongs to class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LNh/n;->j:LQh/g;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", so it must be resolved"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    return-object v1
.end method

.method private static final W0(LNh/n;)Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lfi/e;->n(LBh/h;)LZh/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p0, p0, LNh/n;->i:LMh/k;

    invoke-virtual {p0}, LMh/k;->a()LMh/d;

    move-result-object p0

    invoke-virtual {p0}, LMh/d;->f()LJh/A;

    move-result-object p0

    invoke-interface {p0, v0}, LJh/A;->a(LZh/b;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final X0(LNh/n;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)LNh/z;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LNh/z;

    iget-object v2, p0, LNh/n;->l:LMh/k;

    iget-object v4, p0, LNh/n;->j:LQh/g;

    iget-object v0, p0, LNh/n;->k:LBh/e;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v6, p0, LNh/n;->s:LNh/z;

    move-object v1, p1

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, LNh/z;-><init>(LMh/k;LBh/e;LQh/g;ZLNh/z;)V

    return-object p1
.end method


# virtual methods
.method public D()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic E0()Lii/k;
    .locals 1

    invoke-virtual {p0}, LNh/n;->U0()LNh/z;

    move-result-object v0

    return-object v0
.end method

.method public F0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, LNh/n;->q:Z

    return v0
.end method

.method public P()LBh/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final P0(LKh/j;LBh/e;)LNh/n;
    .locals 3

    const-string v0, "javaResolverCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LNh/n;

    iget-object v1, p0, LNh/n;->l:LMh/k;

    invoke-virtual {v1}, LMh/k;->a()LMh/d;

    move-result-object v2

    invoke-virtual {v2, p1}, LMh/d;->x(LKh/j;)LMh/d;

    move-result-object p1

    invoke-static {v1, p1}, LMh/c;->m(LMh/k;LMh/d;)LMh/k;

    move-result-object p1

    invoke-virtual {p0}, LDh/j;->b()LBh/m;

    move-result-object v1

    const-string v2, "getContainingDeclaration(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LNh/n;->j:LQh/g;

    invoke-direct {v0, p1, v1, v2, p2}, LNh/n;-><init>(LMh/k;LBh/m;LQh/g;LBh/e;)V

    return-object v0
.end method

.method public Q()Lii/k;
    .locals 1

    iget-object v0, p0, LNh/n;->v:LNh/a0;

    return-object v0
.end method

.method public R0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LNh/n;->s:LNh/z;

    invoke-virtual {v0}, LNh/z;->a1()Loi/i;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public S()LBh/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final S0()LQh/g;
    .locals 1

    iget-object v0, p0, LNh/n;->j:LQh/g;

    return-object v0
.end method

.method public final T0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LNh/n;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public U0()LNh/z;
    .locals 2

    invoke-super {p0}, LDh/a;->E0()Lii/k;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LNh/z;

    return-object v0
.end method

.method protected V0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)LNh/z;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/n;->t:LBh/e0;

    invoke-virtual {v0, p1}, LBh/e0;->c(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p1

    check-cast p1, LNh/z;

    return-object p1
.end method

.method public getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    iget-object v0, p0, LNh/n;->w:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    return-object v0
.end method

.method public getVisibility()LBh/u;
    .locals 2

    iget-object v0, p0, LNh/n;->p:LBh/w0;

    sget-object v1, LBh/t;->a:LBh/u;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LNh/n;->j:LQh/g;

    invoke-interface {v0}, LQh/g;->f()LQh/g;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LJh/y;->a:LBh/u;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LNh/n;->p:LBh/w0;

    invoke-static {v0}, LJh/V;->d(LBh/w0;)LBh/u;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public h()LBh/f;
    .locals 1

    iget-object v0, p0, LNh/n;->n:LBh/f;

    return-object v0
.end method

.method public bridge synthetic i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 0

    invoke-virtual {p0, p1}, LNh/n;->V0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)LNh/z;

    move-result-object p1

    return-object p1
.end method

.method public isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k()Lpi/v0;
    .locals 1

    iget-object v0, p0, LNh/n;->r:LNh/n$b;

    return-object v0
.end method

.method public l()LBh/D;
    .locals 1

    iget-object v0, p0, LNh/n;->o:LBh/D;

    return-object v0
.end method

.method public bridge synthetic m()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LNh/n;->R0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public n()Ljava/util/Collection;
    .locals 8

    iget-object v0, p0, LNh/n;->o:LBh/D;

    sget-object v1, LBh/D;->SEALED:LBh/D;

    if-ne v0, v1, :cond_3

    sget-object v2, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v0

    iget-object v1, p0, LNh/n;->j:LQh/g;

    invoke-interface {v1}, LQh/g;->N()Lzi/j;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LQh/j;

    iget-object v4, p0, LNh/n;->l:LMh/k;

    invoke-virtual {v4}, LMh/k;->g()LOh/e;

    move-result-object v4

    invoke-virtual {v4, v3, v0}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object v3

    invoke-virtual {v3}, Lpi/S;->N0()Lpi/v0;

    move-result-object v3

    invoke-interface {v3}, Lpi/v0;->c()LBh/h;

    move-result-object v3

    instance-of v4, v3, LBh/e;

    if-eqz v4, :cond_1

    check-cast v3, LBh/e;

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, LNh/n$c;

    invoke-direct {v0}, LNh/n$c;-><init>()V

    invoke-static {v2, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    goto :goto_2

    :cond_3
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    :goto_2
    return-object v0
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy Java class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lfi/e;->p(LBh/m;)LZh/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LNh/n;->x:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public y0()Lii/k;
    .locals 1

    iget-object v0, p0, LNh/n;->u:Lii/g;

    return-object v0
.end method

.method public z()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public z0()LBh/q0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
