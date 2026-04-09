.class public abstract LSh/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LBh/G;Loi/n;LBh/L;LMh/j;LSh/v;LSh/n;Lli/w;LYh/e;)LSh/k;
    .locals 15

    move-object v2, p0

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    move-object/from16 v0, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p7

    const-string v5, "module"

    invoke-static {p0, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "storageManager"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "notFoundClasses"

    invoke-static {v7, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "lazyJavaPackageFragmentProvider"

    move-object/from16 v6, p3

    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "reflectKotlinClassFinder"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "deserializedDescriptorResolver"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "errorReporter"

    move-object/from16 v8, p6

    invoke-static {v8, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "jvmMetadataVersion"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, LSh/o;

    invoke-direct {v5, v0, v3}, LSh/o;-><init>(LSh/v;LSh/n;)V

    invoke-static {p0, v7, v1, v0, v4}, LSh/i;->a(LBh/G;LBh/L;Loi/n;LSh/v;LYh/e;)LSh/h;

    move-result-object v9

    new-instance v13, LSh/k;

    sget-object v3, Lli/o$a;->a:Lli/o$a;

    sget-object v10, LIh/c$a;->a:LIh/c$a;

    sget-object v0, Lli/m;->a:Lli/m$a;

    invoke-virtual {v0}, Lli/m$a;->a()Lli/m;

    move-result-object v11

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;->a()Lkotlin/reflect/jvm/internal/impl/types/checker/q;

    move-result-object v12

    new-instance v14, Lqi/a;

    sget-object v0, Lpi/x;->a:Lpi/x;

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v14, v0}, Lqi/a;-><init>(Ljava/util/List;)V

    move-object v0, v13

    move-object v4, v5

    move-object v5, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v14

    invoke-direct/range {v0 .. v12}, LSh/k;-><init>(Loi/n;LBh/G;Lli/o;LSh/o;LSh/h;LMh/j;LBh/L;Lli/w;LIh/c;Lli/m;Lkotlin/reflect/jvm/internal/impl/types/checker/p;Lqi/a;)V

    return-object v13
.end method

.method public static final b(LJh/u;LBh/G;Loi/n;LBh/L;LSh/v;LSh/n;Lli/w;LPh/b;LMh/n;LSh/D;)LMh/j;
    .locals 31

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move-object/from16 v9, p3

    move-object/from16 v2, p0

    move-object/from16 v15, p1

    move-object/from16 v1, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v6, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    const-string v0, "javaClassFinder"

    move-object/from16 v5, p0

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reflectKotlinClassFinder"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    move-object/from16 v5, p6

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaSourceElementFactory"

    move-object/from16 v5, p7

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "singleModuleClassResolver"

    move-object/from16 v5, p8

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packagePartProvider"

    move-object/from16 v5, p9

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, LMh/d;

    move-object v0, v8

    sget-object v7, LKh/o;->a:LKh/o;

    move-object v5, v7

    move-object/from16 p0, v8

    const-string v8, "DO_NOTHING"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, LKh/j;->a:LKh/j;

    move-object v7, v8

    const-string v9, "EMPTY"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, LKh/i$a;->a:LKh/i$a;

    move-object/from16 v9, p0

    new-instance v14, Lhi/b;

    move-object/from16 p0, v0

    move-object/from16 v27, v9

    move-object/from16 v0, p3

    move-object v9, v14

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v16

    move-object/from16 v28, v1

    move-object/from16 v1, v16

    check-cast v1, Ljava/lang/Iterable;

    invoke-direct {v14, v13, v1}, Lhi/b;-><init>(Loi/n;Ljava/lang/Iterable;)V

    sget-object v13, LBh/j0$a;->a:LBh/j0$a;

    sget-object v14, LIh/c$a;->a:LIh/c$a;

    move-object/from16 v1, p1

    move-object/from16 v29, v2

    new-instance v2, Lkotlin/reflect/jvm/internal/impl/builtins/n;

    move-object/from16 v16, v2

    invoke-direct {v2, v1, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/n;-><init>(LBh/G;LBh/L;)V

    new-instance v0, LJh/d;

    move-object/from16 v17, v0

    sget-object v1, LJh/D;->d:LJh/D$b;

    invoke-virtual {v1}, LJh/D$b;->a()LJh/D;

    move-result-object v2

    invoke-direct {v0, v2}, LJh/d;-><init>(LJh/D;)V

    new-instance v0, LRh/e0;

    move-object/from16 v18, v0

    new-instance v2, LRh/g;

    move-object/from16 v30, v3

    sget-object v3, LMh/e$a;->a:LMh/e$a;

    move-object/from16 v20, v3

    invoke-direct {v2, v3}, LRh/g;-><init>(LMh/e;)V

    invoke-direct {v0, v2}, LRh/e0;-><init>(LRh/g;)V

    sget-object v19, LJh/v$a;->a:LJh/v$a;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;->a()Lkotlin/reflect/jvm/internal/impl/types/checker/q;

    move-result-object v21

    invoke-virtual {v1}, LJh/D$b;->a()LJh/D;

    move-result-object v22

    new-instance v0, LSh/l$a;

    move-object/from16 v23, v0

    invoke-direct {v0}, LSh/l$a;-><init>()V

    const/high16 v25, 0x800000

    const/16 v26, 0x0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v28

    move-object/from16 v2, v29

    move-object/from16 v3, v30

    invoke-direct/range {v0 .. v26}, LMh/d;-><init>(Loi/n;LJh/u;LSh/v;LSh/n;LKh/o;Lli/w;LKh/j;LKh/i;Lhi/a;LPh/b;LMh/n;LSh/D;LBh/j0;LIh/c;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/n;LJh/d;LRh/e0;LJh/v;LMh/e;Lkotlin/reflect/jvm/internal/impl/types/checker/p;LJh/D;LJh/A;Lgi/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LMh/j;

    move-object/from16 v1, v27

    invoke-direct {v0, v1}, LMh/j;-><init>(LMh/d;)V

    return-object v0
.end method

.method public static synthetic c(LJh/u;LBh/G;Loi/n;LBh/L;LSh/v;LSh/n;Lli/w;LPh/b;LMh/n;LSh/D;ILjava/lang/Object;)LMh/j;
    .locals 11

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    sget-object v0, LSh/D$a;->a:LSh/D$a;

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p9

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-static/range {v1 .. v10}, LSh/l;->b(LJh/u;LBh/G;Loi/n;LBh/L;LSh/v;LSh/n;Lli/w;LPh/b;LMh/n;LSh/D;)LMh/j;

    move-result-object v0

    return-object v0
.end method
