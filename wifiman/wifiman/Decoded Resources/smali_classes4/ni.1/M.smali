.class public Lni/M;
.super Lni/w;
.source "SourceFile"


# instance fields
.field private final g:LBh/M;

.field private final h:Ljava/lang/String;

.field private final i:LZh/c;


# direct methods
.method public constructor <init>(LBh/M;LUh/l;LWh/c;LWh/a;Lni/s;Lli/n;Ljava/lang/String;Lmh/a;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v14, p1

    move-object/from16 v15, p7

    const-string v0, "packageDescriptor"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    move-object/from16 v2, p3

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    move-object/from16 v3, p4

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "components"

    move-object/from16 v4, p6

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugName"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classNames"

    move-object/from16 v5, p8

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, LWh/g;

    invoke-virtual/range {p2 .. p2}, LUh/l;->f1()LUh/t;

    move-result-object v0

    const-string v7, "getTypeTable(...)"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v10, v0}, LWh/g;-><init>(LUh/t;)V

    sget-object v0, LWh/h;->b:LWh/h$a;

    invoke-virtual/range {p2 .. p2}, LUh/l;->g1()LUh/w;

    move-result-object v7

    const-string v8, "getVersionRequirementTable(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, LWh/h$a;->a(LUh/w;)LWh/h;

    move-result-object v11

    move-object/from16 v7, p6

    move-object/from16 v8, p1

    move-object/from16 v9, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    invoke-virtual/range {v7 .. v13}, Lli/n;->a(LBh/M;LWh/c;LWh/g;LWh/h;LWh/a;Lni/s;)Lli/p;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, LUh/l;->Y0()Ljava/util/List;

    move-result-object v3

    const-string v0, "getFunctionList(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, LUh/l;->b1()Ljava/util/List;

    move-result-object v4

    const-string v0, "getPropertyList(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, LUh/l;->e1()Ljava/util/List;

    move-result-object v7

    const-string v0, "getTypeAliasList(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v7

    invoke-direct/range {v0 .. v5}, Lni/w;-><init>(Lli/p;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lmh/a;)V

    iput-object v14, v6, Lni/M;->g:LBh/M;

    iput-object v15, v6, Lni/M;->h:Ljava/lang/String;

    invoke-interface/range {p1 .. p1}, LBh/M;->e()LZh/c;

    move-result-object v0

    iput-object v0, v6, Lni/M;->i:LZh/c;

    return-void
.end method


# virtual methods
.method public B(Lii/d;Lmh/l;)Ljava/util/List;
    .locals 3

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LIh/d;->WHEN_GET_ALL_DESCRIPTORS:LIh/d;

    invoke-virtual {p0, p1, p2, v0}, Lni/w;->m(Lii/d;Lmh/l;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->c()Lli/n;

    move-result-object p2

    invoke-virtual {p2}, Lli/n;->l()Ljava/lang/Iterable;

    move-result-object p2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCh/b;

    iget-object v2, p0, Lni/M;->i:LZh/c;

    invoke-interface {v1, v2}, LCh/b;->c(LZh/c;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public C(LZh/f;LIh/b;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object v0

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->p()LIh/c;

    move-result-object v0

    iget-object v1, p0, Lni/M;->g:LBh/M;

    invoke-static {v0, p2, v1, p1}, LHh/a;->b(LIh/c;LIh/b;LBh/M;LZh/f;)V

    return-void
.end method

.method public bridge synthetic e(Lii/d;Lmh/l;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lni/M;->B(Lii/d;Lmh/l;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public g(LZh/f;LIh/b;)LBh/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lni/M;->C(LZh/f;LIh/b;)V

    invoke-super {p0, p1, p2}, Lni/w;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p1

    return-object p1
.end method

.method protected j(Ljava/util/Collection;Lmh/l;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected p(LZh/f;)LZh/b;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZh/b;

    iget-object v1, p0, Lni/M;->i:LZh/c;

    invoke-direct {v0, v1, p1}, LZh/b;-><init>(LZh/c;LZh/f;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lni/M;->h:Ljava/lang/String;

    return-object v0
.end method

.method protected v()Ljava/util/Set;
    .locals 1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected w()Ljava/util/Set;
    .locals 1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected x()Ljava/util/Set;
    .locals 1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected z(LZh/f;)Z
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lni/w;->z(LZh/f;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object v0

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->l()Ljava/lang/Iterable;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCh/b;

    iget-object v2, p0, Lni/M;->i:LZh/c;

    invoke-interface {v1, v2, p1}, LCh/b;->a(LZh/c;LZh/f;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x1

    :goto_2
    return p1
.end method
