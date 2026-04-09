.class public final Lni/N;
.super LDh/K;
.source "SourceFile"

# interfaces
.implements Lni/b;


# instance fields
.field private final C:LUh/n;

.field private final D:LWh/c;

.field private final E:LWh/g;

.field private final F:LWh/h;

.field private final G:Lni/s;


# direct methods
.method public constructor <init>(LBh/m;LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/b$a;ZZZZZLUh/n;LWh/c;LWh/g;LWh/h;Lni/s;)V
    .locals 17

    move-object/from16 v15, p0

    move-object/from16 v14, p14

    move-object/from16 v13, p15

    move-object/from16 v12, p16

    move-object/from16 v11, p17

    const-string v0, "containingDeclaration"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modality"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibility"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v7, p7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, LBh/g0;->a:LBh/g0;

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v6, p6

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p13

    move/from16 v13, v16

    move/from16 v14, p11

    move/from16 v15, p12

    invoke-direct/range {v0 .. v15}, LDh/K;-><init>(LBh/m;LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/b$a;LBh/g0;ZZZZZZ)V

    move-object/from16 v1, p14

    iput-object v1, v0, Lni/N;->C:LUh/n;

    move-object/from16 v1, p15

    iput-object v1, v0, Lni/N;->D:LWh/c;

    move-object/from16 v1, p16

    iput-object v1, v0, Lni/N;->E:LWh/g;

    move-object/from16 v1, p17

    iput-object v1, v0, Lni/N;->F:LWh/h;

    move-object/from16 v1, p18

    iput-object v1, v0, Lni/N;->G:Lni/s;

    return-void
.end method


# virtual methods
.method public bridge synthetic F()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, Lni/N;->f1()LUh/n;

    move-result-object v0

    return-object v0
.end method

.method protected P0(LBh/m;LBh/D;LBh/u;LBh/Y;LBh/b$a;LZh/f;LBh/g0;)LDh/K;
    .locals 20

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v2, p4

    move-object/from16 v8, p5

    move-object/from16 v7, p6

    const-string v0, "newOwner"

    move-object/from16 v3, p1

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newModality"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newVisibility"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v3, p5

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newName"

    move-object/from16 v3, p6

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v3, p7

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v19, Lni/N;

    move-object/from16 v0, v19

    invoke-virtual/range {p0 .. p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LDh/Y;->h0()Z

    move-result v6

    invoke-virtual/range {p0 .. p0}, LDh/K;->q0()Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, LDh/K;->A()Z

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lni/N;->isExternal()Z

    move-result v11

    invoke-virtual/range {p0 .. p0}, LDh/K;->N()Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, LDh/K;->L()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lni/N;->f1()LUh/n;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lni/N;->X()LWh/c;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lni/N;->R()LWh/g;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lni/N;->g1()LWh/h;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lni/N;->Z()Lni/s;

    move-result-object v18

    invoke-direct/range {v0 .. v18}, Lni/N;-><init>(LBh/m;LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/b$a;ZZZZZLUh/n;LWh/c;LWh/g;LWh/h;Lni/s;)V

    return-object v19
.end method

.method public R()LWh/g;
    .locals 1

    iget-object v0, p0, Lni/N;->E:LWh/g;

    return-object v0
.end method

.method public X()LWh/c;
    .locals 1

    iget-object v0, p0, Lni/N;->D:LWh/c;

    return-object v0
.end method

.method public Z()Lni/s;
    .locals 1

    iget-object v0, p0, Lni/N;->G:Lni/s;

    return-object v0
.end method

.method public f1()LUh/n;
    .locals 1

    iget-object v0, p0, Lni/N;->C:LUh/n;

    return-object v0
.end method

.method public g1()LWh/h;
    .locals 1

    iget-object v0, p0, Lni/N;->F:LWh/h;

    return-object v0
.end method

.method public isExternal()Z
    .locals 2

    sget-object v0, LWh/b;->E:LWh/b$b;

    invoke-virtual {p0}, Lni/N;->f1()LUh/n;

    move-result-object v1

    invoke-virtual {v1}, LUh/n;->k1()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
