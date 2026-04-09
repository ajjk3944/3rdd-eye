.class public final LDh/T;
.super LDh/s;
.source "SourceFile"

# interfaces
.implements LDh/Q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDh/T$a;
    }
.end annotation


# static fields
.field public static final I:LDh/T$a;

.field static final synthetic J:[Lth/l;


# instance fields
.field private final E:Loi/n;

.field private final F:LBh/k0;

.field private final G:Loi/j;

.field private H:LBh/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LDh/T;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "withDispatchReceiver"

    const-string v3, "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LDh/T;->J:[Lth/l;

    new-instance v0, LDh/T$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDh/T$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LDh/T;->I:LDh/T$a;

    return-void
.end method

.method private constructor <init>(Loi/n;LBh/k0;LBh/d;LDh/Q;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/b$a;LBh/g0;)V
    .locals 7

    .line 2
    sget-object v4, LZh/h;->j:LZh/f;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p4

    move-object v3, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, LDh/s;-><init>(LBh/m;LBh/z;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;)V

    .line 3
    iput-object p1, p0, LDh/T;->E:Loi/n;

    .line 4
    iput-object p2, p0, LDh/T;->F:LBh/k0;

    .line 5
    invoke-virtual {p0}, LDh/T;->p1()LBh/k0;

    move-result-object p2

    invoke-interface {p2}, LBh/C;->F0()Z

    move-result p2

    invoke-virtual {p0, p2}, LDh/s;->V0(Z)V

    .line 6
    new-instance p2, LDh/S;

    invoke-direct {p2, p0, p3}, LDh/S;-><init>(LDh/T;LBh/d;)V

    invoke-interface {p1, p2}, Loi/n;->b(Lmh/a;)Loi/j;

    move-result-object p1

    iput-object p1, p0, LDh/T;->G:Loi/j;

    .line 7
    iput-object p3, p0, LDh/T;->H:LBh/d;

    return-void
.end method

.method public synthetic constructor <init>(Loi/n;LBh/k0;LBh/d;LDh/Q;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/b$a;LBh/g0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LDh/T;-><init>(Loi/n;LBh/k0;LBh/d;LDh/Q;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/b$a;LBh/g0;)V

    return-void
.end method

.method static synthetic k1(LDh/T;LBh/d;)LDh/T;
    .locals 0

    invoke-static {p0, p1}, LDh/T;->r1(LDh/T;LBh/d;)LDh/T;

    move-result-object p0

    return-object p0
.end method

.method private static final r1(LDh/T;LBh/d;)LDh/T;
    .locals 10

    new-instance v9, LDh/T;

    iget-object v1, p0, LDh/T;->E:Loi/n;

    invoke-virtual {p0}, LDh/T;->p1()LBh/k0;

    move-result-object v2

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v5

    invoke-interface {p1}, LBh/b;->h()LBh/b$a;

    move-result-object v6

    const-string v0, "getKind(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDh/T;->p1()LBh/k0;

    move-result-object v0

    invoke-interface {v0}, LBh/p;->j()LBh/g0;

    move-result-object v7

    const-string v0, "getSource(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v9

    move-object v3, p1

    move-object v4, p0

    invoke-direct/range {v0 .. v7}, LDh/T;-><init>(Loi/n;LBh/k0;LBh/d;LDh/Q;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/b$a;LBh/g0;)V

    sget-object v0, LDh/T;->I:LDh/T$a;

    invoke-virtual {p0}, LDh/T;->p1()LBh/k0;

    move-result-object v1

    invoke-static {v0, v1}, LDh/T$a;->a(LDh/T$a;LBh/k0;)Lpi/G0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p1}, LBh/a;->d0()LBh/b0;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2, v0}, LBh/b0;->c(Lpi/G0;)LBh/b0;

    move-result-object v1

    :cond_1
    move-object v2, v1

    invoke-interface {p1}, LBh/a;->p0()Ljava/util/List;

    move-result-object p1

    const-string v1, "getContextReceiverParameters(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/b0;

    invoke-interface {v1, v0}, LBh/b0;->c(Lpi/G0;)LBh/b0;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LDh/T;->p1()LBh/k0;

    move-result-object p1

    invoke-interface {p1}, LBh/i;->w()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, LDh/s;->i()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, LDh/T;->getReturnType()Lpi/S;

    move-result-object v6

    sget-object v7, LBh/D;->FINAL:LBh/D;

    invoke-virtual {p0}, LDh/T;->p1()LBh/k0;

    move-result-object p0

    invoke-interface {p0}, LBh/C;->getVisibility()LBh/u;

    move-result-object v8

    const/4 v1, 0x0

    move-object v0, v9

    invoke-virtual/range {v0 .. v8}, LDh/s;->R0(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;)LDh/s;

    return-object v9
.end method


# virtual methods
.method public B()Z
    .locals 1

    invoke-virtual {p0}, LDh/T;->n0()LBh/d;

    move-result-object v0

    invoke-interface {v0}, LBh/l;->B()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic B0()LBh/p;
    .locals 1

    invoke-virtual {p0}, LDh/T;->o1()LDh/Q;

    move-result-object v0

    return-object v0
.end method

.method public C()LBh/e;
    .locals 2

    invoke-virtual {p0}, LDh/T;->n0()LBh/d;

    move-result-object v0

    invoke-interface {v0}, LBh/l;->C()LBh/e;

    move-result-object v0

    const-string v1, "getConstructedClass(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic L0(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/s;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LDh/T;->m1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/T;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a()LBh/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/T;->o1()LDh/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/b;
    .locals 1

    .line 2
    invoke-virtual {p0}, LDh/T;->o1()LDh/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/m;
    .locals 1

    .line 3
    invoke-virtual {p0}, LDh/T;->o1()LDh/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/z;
    .locals 1

    .line 4
    invoke-virtual {p0}, LDh/T;->o1()LDh/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()LBh/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/T;->n1()LBh/k0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()LBh/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LDh/T;->n1()LBh/k0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/l;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LDh/T;->q1(Lpi/G0;)LDh/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, LDh/T;->q1(Lpi/G0;)LDh/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/z;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, LDh/T;->q1(Lpi/G0;)LDh/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/b;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LDh/T;->l1(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LDh/Q;

    move-result-object p1

    return-object p1
.end method

.method public getReturnType()Lpi/S;
    .locals 1

    invoke-super {p0}, LDh/s;->getReturnType()Lpi/S;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method public l1(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LDh/Q;
    .locals 1

    const-string v0, "newOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modality"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibility"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDh/s;->v()LBh/z$a;

    move-result-object v0

    invoke-interface {v0, p1}, LBh/z$a;->p(LBh/m;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1, p2}, LBh/z$a;->h(LBh/D;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1, p3}, LBh/z$a;->f(LBh/u;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1, p4}, LBh/z$a;->s(LBh/b$a;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1, p5}, LBh/z$a;->m(Z)LBh/z$a;

    move-result-object p1

    invoke-interface {p1}, LBh/z$a;->a()LBh/z;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LDh/Q;

    return-object p1
.end method

.method protected m1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/T;
    .locals 8

    const-string p2, "newOwner"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "kind"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "annotations"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "source"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LBh/b$a;->DECLARATION:LBh/b$a;

    if-eq p3, v6, :cond_0

    sget-object p1, LBh/b$a;->SYNTHESIZED:LBh/b$a;

    :cond_0
    new-instance p1, LDh/T;

    iget-object v1, p0, LDh/T;->E:Loi/n;

    invoke-virtual {p0}, LDh/T;->p1()LBh/k0;

    move-result-object v2

    invoke-virtual {p0}, LDh/T;->n0()LBh/d;

    move-result-object v3

    move-object v0, p1

    move-object v4, p0

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LDh/T;-><init>(Loi/n;LBh/k0;LBh/d;LDh/Q;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/b$a;LBh/g0;)V

    return-object p1
.end method

.method public n0()LBh/d;
    .locals 1

    iget-object v0, p0, LDh/T;->H:LBh/d;

    return-object v0
.end method

.method public n1()LBh/k0;
    .locals 1

    invoke-virtual {p0}, LDh/T;->p1()LBh/k0;

    move-result-object v0

    return-object v0
.end method

.method public o1()LDh/Q;
    .locals 2

    invoke-super {p0}, LDh/s;->a()LBh/z;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LDh/Q;

    return-object v0
.end method

.method public p1()LBh/k0;
    .locals 1

    iget-object v0, p0, LDh/T;->F:LBh/k0;

    return-object v0
.end method

.method public q1(Lpi/G0;)LDh/Q;
    .locals 2

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LDh/s;->c(Lpi/G0;)LBh/z;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LDh/T;

    invoke-virtual {p1}, LDh/T;->getReturnType()Lpi/S;

    move-result-object v0

    invoke-static {v0}, Lpi/G0;->f(Lpi/S;)Lpi/G0;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDh/T;->n0()LBh/d;

    move-result-object v1

    invoke-interface {v1}, LBh/d;->a()LBh/d;

    move-result-object v1

    invoke-interface {v1, v0}, LBh/d;->c(Lpi/G0;)LBh/d;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iput-object v0, p1, LDh/T;->H:LBh/d;

    return-object p1
.end method
