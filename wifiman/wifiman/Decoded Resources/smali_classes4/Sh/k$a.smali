.class public final LSh/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSh/k$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LSh/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LSh/v;LSh/v;LJh/u;Ljava/lang/String;Lli/w;LPh/b;)LSh/k$a$a;
    .locals 25

    move-object/from16 v0, p4

    const-string v1, "kotlinClassFinder"

    move-object/from16 v14, p1

    invoke-static {v14, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "jvmBuiltInsKotlinClassFinder"

    move-object/from16 v15, p2

    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "javaClassFinder"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "moduleName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "errorReporter"

    move-object/from16 v13, p5

    invoke-static {v13, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "javaSourceElementFactory"

    move-object/from16 v9, p6

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Loi/f;

    const-string v3, "DeserializationComponentsForJava.ModuleData"

    invoke-direct {v1, v3}, Loi/f;-><init>(Ljava/lang/String;)V

    new-instance v12, LAh/k;

    sget-object v3, LAh/k$a;->FROM_DEPENDENCIES:LAh/k$a;

    invoke-direct {v12, v1, v3}, LAh/k;-><init>(Loi/n;LAh/k$a;)V

    new-instance v11, LDh/F;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v4, 0x3c

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3e

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZh/f;->n(Ljava/lang/String;)LZh/f;

    move-result-object v0

    const-string v3, "special(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v23, 0x38

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v16, v11

    move-object/from16 v17, v0

    move-object/from16 v18, v1

    move-object/from16 v19, v12

    invoke-direct/range {v16 .. v24}, LDh/F;-><init>(LZh/f;Loi/n;Lkotlin/reflect/jvm/internal/impl/builtins/i;Lai/a;Ljava/util/Map;LZh/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v12, v11}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->E0(LDh/F;)V

    const/4 v0, 0x1

    invoke-virtual {v12, v11, v0}, LAh/k;->M0(LBh/G;Z)V

    new-instance v10, LSh/n;

    invoke-direct {v10}, LSh/n;-><init>()V

    new-instance v8, LMh/o;

    invoke-direct {v8}, LMh/o;-><init>()V

    new-instance v7, LBh/L;

    invoke-direct {v7, v1, v11}, LBh/L;-><init>(Loi/n;LBh/G;)V

    const/16 v16, 0x200

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v3, v11

    move-object v4, v1

    move-object v5, v7

    move-object/from16 v6, p1

    move-object/from16 v19, v7

    move-object v7, v10

    move-object/from16 p3, v8

    move-object/from16 v8, p5

    move-object/from16 p4, v10

    move-object/from16 v10, p3

    move-object/from16 p6, v11

    move-object/from16 v11, v18

    move-object/from16 v18, v12

    move/from16 v12, v16

    move-object/from16 v13, v17

    invoke-static/range {v2 .. v13}, LSh/l;->c(LJh/u;LBh/G;Loi/n;LBh/L;LSh/v;LSh/n;Lli/w;LPh/b;LMh/n;LSh/D;ILjava/lang/Object;)LMh/j;

    move-result-object v10

    sget-object v9, LYh/e;->i:LYh/e;

    move-object/from16 v2, p6

    move-object v3, v1

    move-object/from16 v4, v19

    move-object v5, v10

    move-object/from16 v7, p4

    invoke-static/range {v2 .. v9}, LSh/l;->a(LBh/G;Loi/n;LBh/L;LMh/j;LSh/v;LSh/n;Lli/w;LYh/e;)LSh/k;

    move-result-object v12

    move-object/from16 v13, p4

    invoke-virtual {v13, v12}, LSh/n;->o(LSh/k;)V

    new-instance v14, Lgi/c;

    sget-object v2, LKh/j;->a:LKh/j;

    const-string v3, "EMPTY"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v14, v10, v2}, Lgi/c;-><init>(LMh/j;LKh/j;)V

    move-object/from16 v2, p3

    invoke-virtual {v2, v14}, LMh/o;->c(Lgi/c;)V

    new-instance v16, LAh/w;

    invoke-virtual/range {v18 .. v18}, LAh/k;->L0()LAh/u;

    move-result-object v7

    invoke-virtual/range {v18 .. v18}, LAh/k;->L0()LAh/u;

    move-result-object v8

    sget-object v9, Lli/o$a;->a:Lli/o$a;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;->a()Lkotlin/reflect/jvm/internal/impl/types/checker/q;

    move-result-object v10

    new-instance v11, Lhi/b;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-direct {v11, v1, v2}, Lhi/b;-><init>(Loi/n;Ljava/lang/Iterable;)V

    move-object/from16 v2, v16

    move-object v3, v1

    move-object/from16 v4, p2

    move-object/from16 v5, p6

    move-object/from16 v6, v19

    invoke-direct/range {v2 .. v11}, LAh/w;-><init>(Loi/n;LSh/v;LBh/G;LBh/L;LCh/a;LCh/c;Lli/o;Lkotlin/reflect/jvm/internal/impl/types/checker/p;Lhi/a;)V

    filled-new-array/range {p6 .. p6}, [LDh/F;

    move-result-object v1

    move-object/from16 v2, p6

    invoke-virtual {v2, v1}, LDh/F;->W0([LDh/F;)V

    new-instance v1, LDh/l;

    invoke-virtual {v14}, Lgi/c;->a()LMh/j;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [LBh/T;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    aput-object v16, v4, v0

    invoke-static {v4}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CompositeProvider@RuntimeModuleData for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v0, v3}, LDh/l;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, LDh/F;->O0(LBh/N;)V

    new-instance v0, LSh/k$a$a;

    invoke-direct {v0, v12, v13}, LSh/k$a$a;-><init>(LSh/k;LSh/n;)V

    return-object v0
.end method
