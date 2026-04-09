.class public final LAh/w;
.super Lli/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAh/w$a;
    }
.end annotation


# static fields
.field public static final f:LAh/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LAh/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LAh/w$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LAh/w;->f:LAh/w$a;

    return-void
.end method

.method public constructor <init>(Loi/n;LSh/v;LBh/G;LBh/L;LCh/a;LCh/c;Lli/o;Lkotlin/reflect/jvm/internal/impl/types/checker/p;Lhi/a;)V
    .locals 25

    move-object/from16 v13, p0

    move-object/from16 v11, p1

    move-object/from16 v10, p3

    move-object/from16 v7, p4

    move-object/from16 v6, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v12, p4

    move-object/from16 v14, p5

    move-object/from16 v15, p6

    move-object/from16 v3, p7

    move-object/from16 v17, p8

    move-object/from16 v18, p9

    const-string v0, "storageManager"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalClassPartsProvider"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformDependentDeclarationFilter"

    move-object/from16 v5, p6

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializationConfiguration"

    move-object/from16 v5, p7

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v5, p8

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    move-object/from16 v5, p9

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p3}, Lli/c;-><init>(Loi/n;Lli/A;LBh/G;)V

    new-instance v9, Lli/n;

    move-object v0, v9

    new-instance v5, Lli/q;

    move-object v4, v5

    invoke-direct {v5, v13}, Lli/q;-><init>(LBh/N;)V

    new-instance v8, Lli/f;

    move-object v5, v8

    move-object/from16 p2, v0

    sget-object v0, Lmi/a;->r:Lmi/a;

    invoke-direct {v8, v10, v7, v0}, Lli/f;-><init>(LBh/G;LBh/L;Lki/a;)V

    sget-object v7, Lli/B$a;->a:Lli/B$a;

    sget-object v8, Lli/w;->a:Lli/w;

    move-object/from16 p4, v8

    move-object/from16 p5, v9

    const-string v9, "DO_NOTHING"

    move-object/from16 v10, p4

    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, LIh/c$a;->a:LIh/c$a;

    move-object/from16 v10, p5

    sget-object v16, Lli/x$a;->a:Lli/x$a;

    move-object/from16 v13, p3

    move-object/from16 v23, v10

    move-object/from16 v10, v16

    move-object/from16 v24, v1

    new-instance v1, Lzh/a;

    invoke-direct {v1, v11, v13}, Lzh/a;-><init>(Loi/n;LBh/G;)V

    new-instance v16, LAh/g;

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 p4, v16

    move-object/from16 p5, p1

    move-object/from16 p6, p3

    move-object/from16 p7, v21

    move/from16 p8, v19

    move-object/from16 p9, v20

    invoke-direct/range {p4 .. p9}, LAh/g;-><init>(Loi/n;LBh/G;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x2

    new-array v11, v11, [LCh/b;

    const/4 v13, 0x0

    aput-object v1, v11, v13

    const/4 v1, 0x1

    aput-object v16, v11, v1

    invoke-static {v11}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/lang/Iterable;

    sget-object v1, Lli/m;->a:Lli/m$a;

    invoke-virtual {v1}, Lli/m$a;->a()Lli/m;

    move-result-object v13

    move-object/from16 v1, p0

    invoke-virtual {v0}, Lki/a;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    move-result-object v16

    sget-object v20, Lli/z;->a:Lli/z;

    const/high16 v21, 0x40000

    const/16 v22, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, p2

    move-object/from16 v1, v24

    invoke-direct/range {v0 .. v22}, Lli/n;-><init>(Loi/n;LBh/G;Lli/o;Lli/j;Lli/e;LBh/N;Lli/B;Lli/w;LIh/c;Lli/x;Ljava/lang/Iterable;LBh/L;Lli/m;LCh/a;LCh/c;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/types/checker/p;Lhi/a;Ljava/util/List;Lli/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lli/c;->k(Lli/n;)V

    return-void
.end method


# virtual methods
.method protected e(LZh/c;)Lli/r;
    .locals 7

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lli/c;->h()Lli/A;

    move-result-object v0

    invoke-interface {v0, p1}, Lli/A;->c(LZh/c;)Ljava/io/InputStream;

    move-result-object v5

    if-eqz v5, :cond_0

    sget-object v1, Lmi/c;->o:Lmi/c$a;

    invoke-virtual {p0}, Lli/c;->j()Loi/n;

    move-result-object v3

    invoke-virtual {p0}, Lli/c;->i()LBh/G;

    move-result-object v4

    const/4 v6, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lmi/c$a;->a(LZh/c;Loi/n;LBh/G;Ljava/io/InputStream;Z)Lmi/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
