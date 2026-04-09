.class public final Lni/c;
.super LDh/i;
.source "SourceFile"

# interfaces
.implements Lni/b;


# instance fields
.field private final F:LUh/d;

.field private final G:LWh/c;

.field private final H:LWh/g;

.field private final I:LWh/h;

.field private final J:Lni/s;


# direct methods
.method public constructor <init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LUh/d;LWh/c;LWh/g;LWh/h;Lni/s;LBh/g0;)V
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

    move/from16 v4, p4

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v6}, LDh/i;-><init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LBh/g0;)V

    .line 3
    iput-object v8, v7, Lni/c;->F:LUh/d;

    .line 4
    iput-object v9, v7, Lni/c;->G:LWh/c;

    .line 5
    iput-object v10, v7, Lni/c;->H:LWh/g;

    .line 6
    iput-object v11, v7, Lni/c;->I:LWh/h;

    move-object/from16 v0, p10

    .line 7
    iput-object v0, v7, Lni/c;->J:Lni/s;

    return-void
.end method

.method public synthetic constructor <init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LUh/d;LWh/c;LWh/g;LWh/h;Lni/s;LBh/g0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    .line 1
    invoke-direct/range {v1 .. v12}, Lni/c;-><init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LUh/d;LWh/c;LWh/g;LWh/h;Lni/s;LBh/g0;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic F()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, Lni/c;->t1()LUh/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic L0(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/s;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lni/c;->s1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)Lni/c;

    move-result-object p1

    return-object p1
.end method

.method public O()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public R()LWh/g;
    .locals 1

    iget-object v0, p0, Lni/c;->H:LWh/g;

    return-object v0
.end method

.method public X()LWh/c;
    .locals 1

    iget-object v0, p0, Lni/c;->G:LWh/c;

    return-object v0
.end method

.method public Z()Lni/s;
    .locals 1

    iget-object v0, p0, Lni/c;->J:Lni/s;

    return-object v0
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

.method public isSuspend()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic o1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/i;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lni/c;->s1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)Lni/c;

    move-result-object p1

    return-object p1
.end method

.method protected s1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)Lni/c;
    .locals 14

    move-object v0, p1

    const-string v1, "newOwner"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "kind"

    move-object/from16 v7, p3

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "annotations"

    move-object/from16 v5, p5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "source"

    move-object/from16 v13, p6

    invoke-static {v13, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lni/c;

    move-object v3, v0

    check-cast v3, LBh/e;

    move-object/from16 v4, p2

    check-cast v4, LBh/l;

    move-object v0, p0

    iget-boolean v6, v0, LDh/i;->E:Z

    invoke-virtual {p0}, Lni/c;->t1()LUh/d;

    move-result-object v8

    invoke-virtual {p0}, Lni/c;->X()LWh/c;

    move-result-object v9

    invoke-virtual {p0}, Lni/c;->R()LWh/g;

    move-result-object v10

    invoke-virtual {p0}, Lni/c;->u1()LWh/h;

    move-result-object v11

    invoke-virtual {p0}, Lni/c;->Z()Lni/s;

    move-result-object v12

    move-object v2, v1

    invoke-direct/range {v2 .. v13}, Lni/c;-><init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LUh/d;LWh/c;LWh/g;LWh/h;Lni/s;LBh/g0;)V

    invoke-virtual {p0}, LDh/s;->Q0()Z

    move-result v2

    invoke-virtual {v1, v2}, LDh/s;->Y0(Z)V

    return-object v1
.end method

.method public t1()LUh/d;
    .locals 1

    iget-object v0, p0, Lni/c;->F:LUh/d;

    return-object v0
.end method

.method public u1()LWh/h;
    .locals 1

    iget-object v0, p0, Lni/c;->I:LWh/h;

    return-object v0
.end method
