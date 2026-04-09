.class public final LBh/L$b;
.super LDh/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBh/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final i:Z

.field private final j:Ljava/util/List;

.field private final k:Lpi/u;


# direct methods
.method public constructor <init>(Loi/n;LBh/m;LZh/f;ZI)V
    .locals 7

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LBh/g0;->a:LBh/g0;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, LDh/j;-><init>(Loi/n;LBh/m;LZh/f;LBh/g0;Z)V

    iput-boolean p4, p0, LBh/L$b;->i:Z

    const/4 p2, 0x0

    invoke-static {p2, p5}, Lsh/m;->s(II)Lsh/i;

    move-result-object p2

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    move-object p4, p2

    check-cast p4, LZg/Q;

    invoke-virtual {p4}, LZg/Q;->d()I

    move-result v5

    sget-object p4, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {p4}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    sget-object v3, Lpi/N0;->INVARIANT:Lpi/N0;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p5, 0x54

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v4

    const/4 v2, 0x0

    move-object v0, p0

    move-object v6, p1

    invoke-static/range {v0 .. v6}, LDh/U;->R0(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLpi/N0;LZh/f;ILoi/n;)LBh/l0;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object p3, p0, LBh/L$b;->j:Ljava/util/List;

    new-instance p2, Lpi/u;

    invoke-static {p0}, LBh/p0;->g(LBh/i;)Ljava/util/List;

    move-result-object p3

    invoke-static {p0}, Lfi/e;->s(LBh/m;)LBh/G;

    move-result-object p4

    invoke-interface {p4}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p4

    invoke-virtual {p4}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i()Lpi/d0;

    move-result-object p4

    invoke-static {p4}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p4

    check-cast p4, Ljava/util/Collection;

    invoke-direct {p2, p0, p3, p4, p1}, Lpi/u;-><init>(LBh/e;Ljava/util/List;Ljava/util/Collection;Loi/n;)V

    iput-object p2, p0, LBh/L$b;->k:Lpi/u;

    return-void
.end method


# virtual methods
.method public D()Z
    .locals 1

    const/4 v0, 0x0

    return v0
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

.method public K0()Lii/k$b;
    .locals 1

    sget-object v0, Lii/k$b;->b:Lii/k$b;

    return-object v0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public L0()Lpi/u;
    .locals 1

    iget-object v0, p0, LBh/L$b;->k:Lpi/u;

    return-object v0
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, LBh/L$b;->i:Z

    return v0
.end method

.method protected M0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k$b;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lii/k$b;->b:Lii/k$b;

    return-object p1
.end method

.method public P()LBh/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic Q()Lii/k;
    .locals 1

    invoke-virtual {p0}, LBh/L$b;->K0()Lii/k$b;

    move-result-object v0

    return-object v0
.end method

.method public S()LBh/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()LBh/u;
    .locals 2

    sget-object v0, LBh/t;->e:LBh/u;

    const-string v1, "PUBLIC"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public h()LBh/f;
    .locals 1

    sget-object v0, LBh/f;->CLASS:LBh/f;

    return-object v0
.end method

.method public bridge synthetic i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 0

    invoke-virtual {p0, p1}, LBh/L$b;->M0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k$b;

    move-result-object p1

    return-object p1
.end method

.method public isExternal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic k()Lpi/v0;
    .locals 1

    invoke-virtual {p0}, LBh/L$b;->L0()Lpi/u;

    move-result-object v0

    return-object v0
.end method

.method public l()LBh/D;
    .locals 1

    sget-object v0, LBh/D;->FINAL:LBh/D;

    return-object v0
.end method

.method public m()Ljava/util/Collection;
    .locals 1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public n()Ljava/util/Collection;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

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

    const-string v1, "class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LDh/a;->getName()LZh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " (not found)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LBh/L$b;->j:Ljava/util/List;

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
