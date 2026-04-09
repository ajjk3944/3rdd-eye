.class public final Lmi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/builtins/b;


# instance fields
.field private final b:Lmi/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmi/d;

    invoke-direct {v0}, Lmi/d;-><init>()V

    iput-object v0, p0, Lmi/b;->b:Lmi/d;

    return-void
.end method


# virtual methods
.method public a(Loi/n;LBh/G;Ljava/lang/Iterable;LCh/c;LCh/a;Z)LBh/N;
    .locals 10

    const-string v0, "storageManager"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtInsModule"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDescriptorFactories"

    move-object v5, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformDependentDeclarationFilter"

    move-object v6, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalClassPartsProvider"

    move-object v7, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o;->H:Ljava/util/Set;

    new-instance v9, Lmi/b$a;

    move-object v0, p0

    iget-object v1, v0, Lmi/b;->b:Lmi/d;

    invoke-direct {v9, v1}, Lmi/b$a;-><init>(Ljava/lang/Object;)V

    move-object v1, p0

    move/from16 v8, p6

    invoke-virtual/range {v1 .. v9}, Lmi/b;->b(Loi/n;LBh/G;Ljava/util/Set;Ljava/lang/Iterable;LCh/c;LCh/a;ZLmh/l;)LBh/N;

    move-result-object v1

    return-object v1
.end method

.method public final b(Loi/n;LBh/G;Ljava/util/Set;Ljava/lang/Iterable;LCh/c;LCh/a;ZLmh/l;)LBh/N;
    .locals 26

    move-object/from16 v11, p1

    move-object/from16 v14, p2

    move-object/from16 v0, p3

    move-object/from16 v6, p8

    const-string v1, "storageManager"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "module"

    invoke-static {v14, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "packageFqNames"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "classDescriptorFactories"

    move-object/from16 v15, p4

    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "platformDependentDeclarationFilter"

    move-object/from16 v13, p5

    invoke-static {v13, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "additionalClassPartsProvider"

    move-object/from16 v10, p6

    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "loadResource"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LZh/c;

    sget-object v0, Lmi/a;->r:Lmi/a;

    invoke-virtual {v0, v1}, Lmi/a;->r(LZh/c;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/io/InputStream;

    if-eqz v4, :cond_0

    sget-object v0, Lmi/c;->o:Lmi/c$a;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p7

    invoke-virtual/range {v0 .. v5}, Lmi/c$a;->a(LZh/c;Loi/n;LBh/G;Ljava/io/InputStream;Z)Lmi/c;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Resource not found in classpath: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v2, LBh/Q;

    move-object v6, v2

    invoke-direct {v2, v9}, LBh/Q;-><init>(Ljava/util/Collection;)V

    new-instance v1, LBh/L;

    move-object v12, v1

    invoke-direct {v1, v11, v14}, LBh/L;-><init>(Loi/n;LBh/G;)V

    new-instance v8, Lli/n;

    move-object v0, v8

    sget-object v3, Lli/o$a;->a:Lli/o$a;

    new-instance v5, Lli/q;

    move-object v4, v5

    invoke-direct {v5, v2}, Lli/q;-><init>(LBh/N;)V

    new-instance v7, Lli/f;

    move-object v5, v7

    move-object/from16 p3, v2

    sget-object v2, Lmi/a;->r:Lmi/a;

    invoke-direct {v7, v14, v1, v2}, Lli/f;-><init>(LBh/G;LBh/L;Lki/a;)V

    sget-object v7, Lli/B$a;->a:Lli/B$a;

    sget-object v1, Lli/w;->a:Lli/w;

    move-object/from16 v23, v8

    move-object v8, v1

    move-object/from16 v16, v9

    const-string v9, "DO_NOTHING"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, LIh/c$a;->a:LIh/c$a;

    move-object/from16 v24, v16

    sget-object v1, Lli/x$a;->a:Lli/x$a;

    move-object v10, v1

    sget-object v1, Lli/m;->a:Lli/m$a;

    invoke-virtual {v1}, Lli/m$a;->a()Lli/m;

    move-result-object v1

    move-object v13, v1

    invoke-virtual {v2}, Lki/a;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    move-result-object v16

    new-instance v1, Lhi/b;

    move-object/from16 v18, v1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-direct {v1, v11, v2}, Lhi/b;-><init>(Loi/n;Ljava/lang/Iterable;)V

    const/high16 v21, 0xd0000

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v1, p1

    move-object/from16 v25, p3

    move-object/from16 v2, p2

    move-object/from16 v11, p4

    move-object/from16 v14, p6

    move-object/from16 v15, p5

    invoke-direct/range {v0 .. v22}, Lli/n;-><init>(Loi/n;LBh/G;Lli/o;Lli/j;Lli/e;LBh/N;Lli/B;Lli/w;LIh/c;Lli/x;Ljava/lang/Iterable;LBh/L;Lli/m;LCh/a;LCh/c;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/types/checker/p;Lhi/a;Ljava/util/List;Lli/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {v24 .. v24}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmi/c;

    move-object/from16 v2, v23

    invoke-virtual {v1, v2}, Lli/u;->L0(Lli/n;)V

    goto :goto_1

    :cond_2
    return-object v25
.end method
