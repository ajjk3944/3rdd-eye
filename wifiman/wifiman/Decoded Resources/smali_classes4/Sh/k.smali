.class public final LSh/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSh/k$a;
    }
.end annotation


# static fields
.field public static final b:LSh/k$a;


# instance fields
.field private final a:Lli/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LSh/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSh/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSh/k;->b:LSh/k$a;

    return-void
.end method

.method public constructor <init>(Loi/n;LBh/G;Lli/o;LSh/o;LSh/h;LMh/j;LBh/L;Lli/w;LIh/c;Lli/m;Lkotlin/reflect/jvm/internal/impl/types/checker/p;Lqi/a;)V
    .locals 24

    move-object/from16 v1, p1

    const-string v0, "storageManager"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDataFinder"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationAndConstantLoader"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragmentProvider"

    move-object/from16 v6, p6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    move-object/from16 v12, p7

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    move-object/from16 v9, p9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contractDeserializer"

    move-object/from16 v13, p10

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p11

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttributeTranslators"

    move-object/from16 v7, p12

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-interface/range {p2 .. p2}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    instance-of v10, v0, LAh/k;

    if-eqz v10, :cond_0

    check-cast v0, LAh/k;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v14, Lli/n;

    sget-object v10, Lli/B$a;->a:Lli/B$a;

    sget-object v11, LSh/p;->a:LSh/p;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v16

    move-object/from16 v17, v16

    check-cast v17, Ljava/lang/Iterable;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LAh/k;->L0()LAh/u;

    move-result-object v16

    if-eqz v16, :cond_1

    :goto_1
    move-object/from16 v21, v16

    goto :goto_2

    :cond_1
    sget-object v16, LCh/a$a;->a:LCh/a$a;

    goto :goto_1

    :goto_2
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LAh/k;->L0()LAh/u;

    move-result-object v0

    if-eqz v0, :cond_2

    :goto_3
    move-object/from16 v22, v0

    goto :goto_4

    :cond_2
    sget-object v0, LCh/c$b;->a:LCh/c$b;

    goto :goto_3

    :goto_4
    sget-object v0, LYh/i;->a:LYh/i;

    invoke-virtual {v0}, LYh/i;->a()Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    move-result-object v16

    new-instance v0, Lhi/b;

    move-object/from16 v18, v0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v19

    move-object/from16 v2, v19

    check-cast v2, Ljava/lang/Iterable;

    invoke-direct {v0, v1, v2}, Lhi/b;-><init>(Loi/n;Ljava/lang/Iterable;)V

    invoke-virtual/range {p12 .. p12}, Lqi/a;->a()Ljava/util/List;

    move-result-object v19

    sget-object v20, Lli/z;->a:Lli/z;

    move-object v0, v14

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object v7, v10

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object v10, v11

    move-object/from16 v11, v17

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v23, v14

    move-object/from16 v14, v21

    move-object/from16 v15, v22

    move-object/from16 v17, p11

    invoke-direct/range {v0 .. v20}, Lli/n;-><init>(Loi/n;LBh/G;Lli/o;Lli/j;Lli/e;LBh/N;Lli/B;Lli/w;LIh/c;Lli/x;Ljava/lang/Iterable;LBh/L;Lli/m;LCh/a;LCh/c;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/types/checker/p;Lhi/a;Ljava/util/List;Lli/v;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v23

    iput-object v1, v0, LSh/k;->a:Lli/n;

    return-void
.end method


# virtual methods
.method public final a()Lli/n;
    .locals 1

    iget-object v0, p0, LSh/k;->a:Lli/n;

    return-object v0
.end method
