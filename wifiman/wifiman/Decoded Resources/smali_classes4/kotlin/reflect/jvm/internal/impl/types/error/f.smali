.class public final Lkotlin/reflect/jvm/internal/impl/types/error/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBh/Y;


# instance fields
.field private final synthetic a:LDh/K;


# direct methods
.method public constructor <init>()V
    .locals 21

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->h()Lkotlin/reflect/jvm/internal/impl/types/error/a;

    move-result-object v1

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    sget-object v3, LBh/D;->OPEN:LBh/D;

    sget-object v4, LBh/t;->e:LBh/u;

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/types/error/b;->ERROR_PROPERTY:Lkotlin/reflect/jvm/internal/impl/types/error/b;

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/types/error/b;->getDebugText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LZh/f;->n(Ljava/lang/String;)LZh/f;

    move-result-object v6

    sget-object v7, LBh/b$a;->DECLARATION:LBh/b$a;

    sget-object v8, LBh/g0;->a:LBh/g0;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v14}, LDh/K;->O0(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/b$a;LBh/g0;ZZZZZZ)LDh/K;

    move-result-object v1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->k()Lpi/S;

    move-result-object v16

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v17

    const/16 v19, 0x0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v20

    const/16 v18, 0x0

    move-object v15, v1

    invoke-virtual/range {v15 .. v20}, LDh/K;->b1(Lpi/S;Ljava/util/List;LBh/b0;LBh/b0;Ljava/util/List;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->A()Z

    move-result v0

    return v0
.end method

.method public F0()Z
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->F0()Z

    move-result v0

    return v0
.end method

.method public H()Z
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/X;->H()Z

    move-result v0

    return v0
.end method

.method public L()Z
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->L()Z

    move-result v0

    return v0
.end method

.method public N()Z
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->N()Z

    move-result v0

    return v0
.end method

.method public V()Ldi/g;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/Y;->V()Ldi/g;

    move-result-object v0

    return-object v0
.end method

.method public a()LBh/Y;
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->a()LBh/Y;

    move-result-object v0

    const-string v1, "getOriginal(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic a()LBh/a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a()LBh/Y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/b;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a()LBh/Y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/m;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a()LBh/Y;

    move-result-object v0

    return-object v0
.end method

.method public b()LBh/m;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/n;->b()LBh/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Lpi/G0;)LBh/Y;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0, p1}, LDh/K;->c(Lpi/G0;)LBh/Y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/f;->c(Lpi/G0;)LBh/Y;

    move-result-object p1

    return-object p1
.end method

.method public c0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/b;
    .locals 6

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, LDh/K;->N0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/Y;

    move-result-object p1

    const-string p2, "copy(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d()LBh/Z;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->R0()LDh/L;

    move-result-object v0

    return-object v0
.end method

.method public d0()LBh/b0;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->d0()LBh/b0;

    move-result-object v0

    return-object v0
.end method

.method public e0(LBh/a$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0, p1}, LDh/K;->e0(LBh/a$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->f()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getOverriddenDescriptors(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public g()LBh/a0;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->g()LBh/a0;

    move-result-object v0

    return-object v0
.end method

.method public getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    const-string v1, "<get-annotations>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getName()LZh/f;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/m;->getName()LZh/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getReturnType()Lpi/S;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->getReturnType()Lpi/S;

    move-result-object v0

    return-object v0
.end method

.method public getType()Lpi/S;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/X;->getType()Lpi/S;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getVisibility()LBh/u;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->getVisibility()LBh/u;

    move-result-object v0

    const-string v1, "getVisibility(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public h()LBh/b$a;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->h()LBh/b$a;

    move-result-object v0

    const-string v1, "getKind(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public h0()Z
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/Y;->h0()Z

    move-result v0

    return v0
.end method

.method public i()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/X;->i()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->isExternal()Z

    move-result v0

    return v0
.end method

.method public j()LBh/g0;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/n;->j()LBh/g0;

    move-result-object v0

    const-string v1, "getSource(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public k0()LBh/b0;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->k0()LBh/b0;

    move-result-object v0

    return-object v0
.end method

.method public l()LBh/D;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->l()LBh/D;

    move-result-object v0

    const-string v1, "getModality(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public l0()LBh/w;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->l0()LBh/w;

    move-result-object v0

    return-object v0
.end method

.method public o0()LBh/w;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->o0()LBh/w;

    move-result-object v0

    return-object v0
.end method

.method public p0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->p0()Ljava/util/List;

    move-result-object v0

    const-string v1, "getContextReceiverParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public q0()Z
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->q0()Z

    move-result v0

    return v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0, p1, p2}, LDh/K;->t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public x()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0}, LDh/K;->x()Ljava/util/List;

    move-result-object v0

    const-string v1, "getAccessors(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public x0(Ljava/util/Collection;)V
    .locals 1

    const-string v0, "overriddenDescriptors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/f;->a:LDh/K;

    invoke-virtual {v0, p1}, LDh/K;->x0(Ljava/util/Collection;)V

    return-void
.end method
