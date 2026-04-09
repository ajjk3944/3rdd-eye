.class public final Lni/O;
.super LDh/O;
.source "SourceFile"

# interfaces
.implements Lni/b;


# instance fields
.field private final E:LUh/i;

.field private final F:LWh/c;

.field private final G:LWh/g;

.field private final H:LWh/h;

.field private final I:Lni/s;


# direct methods
.method public constructor <init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LUh/i;LWh/c;LWh/g;LWh/h;Lni/s;LBh/g0;)V
    .locals 12

    move-object v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    const-string v0, "containingDeclaration"

    move-object v1, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    move-object v3, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p11, :cond_0

    .line 2
    sget-object v0, LBh/g0;->a:LBh/g0;

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p11

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    .line 3
    invoke-direct/range {v0 .. v6}, LDh/O;-><init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;)V

    .line 4
    iput-object v8, v7, Lni/O;->E:LUh/i;

    .line 5
    iput-object v9, v7, Lni/O;->F:LWh/c;

    .line 6
    iput-object v10, v7, Lni/O;->G:LWh/g;

    .line 7
    iput-object v11, v7, Lni/O;->H:LWh/h;

    move-object/from16 v0, p10

    .line 8
    iput-object v0, v7, Lni/O;->I:Lni/s;

    return-void
.end method

.method public synthetic constructor <init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LUh/i;LWh/c;LWh/g;LWh/h;Lni/s;LBh/g0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v12, v0

    goto :goto_0

    :cond_0
    move-object/from16 v12, p11

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    .line 1
    invoke-direct/range {v1 .. v12}, Lni/O;-><init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LUh/i;LWh/c;LWh/g;LWh/h;Lni/s;LBh/g0;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic F()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, Lni/O;->p1()LUh/i;

    move-result-object v0

    return-object v0
.end method

.method protected L0(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/s;
    .locals 13

    const-string v0, "newOwner"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v6, p3

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    move-object/from16 v4, p5

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v12, p6

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lni/O;

    move-object v3, p2

    check-cast v3, LBh/f0;

    if-nez p4, :cond_0

    invoke-virtual {p0}, LDh/m;->getName()LZh/f;

    move-result-object v1

    const-string v5, "getName(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p4

    :goto_0
    invoke-virtual {p0}, Lni/O;->p1()LUh/i;

    move-result-object v7

    invoke-virtual {p0}, Lni/O;->X()LWh/c;

    move-result-object v8

    invoke-virtual {p0}, Lni/O;->R()LWh/g;

    move-result-object v9

    invoke-virtual {p0}, Lni/O;->q1()LWh/h;

    move-result-object v10

    invoke-virtual {p0}, Lni/O;->Z()Lni/s;

    move-result-object v11

    move-object v1, v0

    move-object v2, p1

    move-object/from16 v4, p5

    move-object/from16 v6, p3

    move-object/from16 v12, p6

    invoke-direct/range {v1 .. v12}, Lni/O;-><init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LUh/i;LWh/c;LWh/g;LWh/h;Lni/s;LBh/g0;)V

    invoke-virtual {p0}, LDh/s;->Q0()Z

    move-result v1

    invoke-virtual {v0, v1}, LDh/s;->Y0(Z)V

    return-object v0
.end method

.method public R()LWh/g;
    .locals 1

    iget-object v0, p0, Lni/O;->G:LWh/g;

    return-object v0
.end method

.method public X()LWh/c;
    .locals 1

    iget-object v0, p0, Lni/O;->F:LWh/c;

    return-object v0
.end method

.method public Z()Lni/s;
    .locals 1

    iget-object v0, p0, Lni/O;->I:Lni/s;

    return-object v0
.end method

.method public p1()LUh/i;
    .locals 1

    iget-object v0, p0, Lni/O;->E:LUh/i;

    return-object v0
.end method

.method public q1()LWh/h;
    .locals 1

    iget-object v0, p0, Lni/O;->H:LWh/h;

    return-object v0
.end method
