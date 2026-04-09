.class public final Lkotlin/reflect/jvm/internal/impl/types/error/c;
.super LDh/O;
.source "SourceFile"


# direct methods
.method public constructor <init>(LBh/e;)V
    .locals 17

    const-string v0, "containingDeclaration"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/b;->ERROR_FUNCTION:Lkotlin/reflect/jvm/internal/impl/types/error/b;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/b;->getDebugText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZh/f;->n(Ljava/lang/String;)LZh/f;

    move-result-object v5

    sget-object v6, LBh/b$a;->DECLARATION:LBh/b$a;

    sget-object v7, LBh/g0;->a:LBh/g0;

    const/4 v3, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v7}, LDh/O;-><init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v11

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v12

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v13

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/k;->RETURN_TYPE_FOR_FUNCTION:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object v14

    sget-object v15, LBh/D;->OPEN:LBh/D;

    sget-object v16, LBh/t;->e:LBh/u;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v8, p0

    invoke-virtual/range {v8 .. v16}, LDh/O;->n1(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;)LDh/O;

    return-void
.end method


# virtual methods
.method protected L0(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/s;
    .locals 0

    const-string p2, "newOwner"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "kind"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "annotations"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "source"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public bridge synthetic c0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/b;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lkotlin/reflect/jvm/internal/impl/types/error/c;->k1(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/f0;

    move-result-object p1

    return-object p1
.end method

.method public e0(LBh/a$a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public isSuspend()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k1(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/f0;
    .locals 0

    const-string p5, "newOwner"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "modality"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "visibility"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "kind"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public v()LBh/z$a;
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/error/c$a;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/types/error/c$a;-><init>(Lkotlin/reflect/jvm/internal/impl/types/error/c;)V

    return-object v0
.end method

.method public x0(Ljava/util/Collection;)V
    .locals 1

    const-string v0, "overriddenDescriptors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
