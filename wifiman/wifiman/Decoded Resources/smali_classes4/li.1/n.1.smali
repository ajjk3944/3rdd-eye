.class public final Lli/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Loi/n;

.field private final b:LBh/G;

.field private final c:Lli/o;

.field private final d:Lli/j;

.field private final e:Lli/e;

.field private final f:LBh/N;

.field private final g:Lli/B;

.field private final h:Lli/w;

.field private final i:LIh/c;

.field private final j:Lli/x;

.field private final k:Ljava/lang/Iterable;

.field private final l:LBh/L;

.field private final m:Lli/m;

.field private final n:LCh/a;

.field private final o:LCh/c;

.field private final p:Lkotlin/reflect/jvm/internal/impl/protobuf/f;

.field private final q:Lkotlin/reflect/jvm/internal/impl/types/checker/p;

.field private final r:Lhi/a;

.field private final s:Ljava/util/List;

.field private final t:Lli/v;

.field private final u:Lli/l;


# direct methods
.method public constructor <init>(Loi/n;LBh/G;Lli/o;Lli/j;Lli/e;LBh/N;Lli/B;Lli/w;LIh/c;Lli/x;Ljava/lang/Iterable;LBh/L;Lli/m;LCh/a;LCh/c;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/types/checker/p;Lhi/a;Ljava/util/List;Lli/v;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v0, p16

    const-string v0, "storageManager"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDataFinder"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationAndConstantLoader"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragmentProvider"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localClassifierTypeSettings"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flexibleTypeDeserializer"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fictitiousClassDescriptorFactories"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contractDeserializer"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalClassPartsProvider"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformDependentDeclarationFilter"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extensionRegistryLite"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttributeTranslators"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntriesDeserializationSupport"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v15, p16

    .line 2
    iput-object v1, v0, Lli/n;->a:Loi/n;

    .line 3
    iput-object v2, v0, Lli/n;->b:LBh/G;

    .line 4
    iput-object v3, v0, Lli/n;->c:Lli/o;

    .line 5
    iput-object v4, v0, Lli/n;->d:Lli/j;

    .line 6
    iput-object v5, v0, Lli/n;->e:Lli/e;

    .line 7
    iput-object v6, v0, Lli/n;->f:LBh/N;

    .line 8
    iput-object v7, v0, Lli/n;->g:Lli/B;

    .line 9
    iput-object v8, v0, Lli/n;->h:Lli/w;

    .line 10
    iput-object v9, v0, Lli/n;->i:LIh/c;

    .line 11
    iput-object v10, v0, Lli/n;->j:Lli/x;

    .line 12
    iput-object v11, v0, Lli/n;->k:Ljava/lang/Iterable;

    .line 13
    iput-object v12, v0, Lli/n;->l:LBh/L;

    .line 14
    iput-object v13, v0, Lli/n;->m:Lli/m;

    .line 15
    iput-object v14, v0, Lli/n;->n:LCh/a;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, Lli/n;->o:LCh/c;

    .line 17
    iput-object v15, v0, Lli/n;->p:Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    move-object/from16 v1, p17

    move-object/from16 v2, p18

    .line 18
    iput-object v1, v0, Lli/n;->q:Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    .line 19
    iput-object v2, v0, Lli/n;->r:Lhi/a;

    move-object/from16 v1, p19

    move-object/from16 v2, p20

    .line 20
    iput-object v1, v0, Lli/n;->s:Ljava/util/List;

    .line 21
    iput-object v2, v0, Lli/n;->t:Lli/v;

    .line 22
    new-instance v1, Lli/l;

    invoke-direct {v1, v0}, Lli/l;-><init>(Lli/n;)V

    iput-object v1, v0, Lli/n;->u:Lli/l;

    return-void
.end method

.method public synthetic constructor <init>(Loi/n;LBh/G;Lli/o;Lli/j;Lli/e;LBh/N;Lli/B;Lli/w;LIh/c;Lli/x;Ljava/lang/Iterable;LBh/L;Lli/m;LCh/a;LCh/c;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/types/checker/p;Lhi/a;Ljava/util/List;Lli/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p21

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_0

    .line 23
    sget-object v1, LCh/a$a;->a:LCh/a$a;

    move-object/from16 v16, v1

    goto :goto_0

    :cond_0
    move-object/from16 v16, p14

    :goto_0
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_1

    .line 24
    sget-object v1, LCh/c$a;->a:LCh/c$a;

    move-object/from16 v17, v1

    goto :goto_1

    :cond_1
    move-object/from16 v17, p15

    :goto_1
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_2

    .line 25
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;->a()Lkotlin/reflect/jvm/internal/impl/types/checker/q;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_2

    :cond_2
    move-object/from16 v19, p17

    :goto_2
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_3

    .line 26
    sget-object v1, Lpi/x;->a:Lpi/x;

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v21, v1

    goto :goto_3

    :cond_3
    move-object/from16 v21, p19

    :goto_3
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    .line 27
    sget-object v0, Lli/v$a;->a:Lli/v$a;

    move-object/from16 v22, v0

    goto :goto_4

    :cond_4
    move-object/from16 v22, p20

    :goto_4
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v18, p16

    move-object/from16 v20, p18

    .line 28
    invoke-direct/range {v2 .. v22}, Lli/n;-><init>(Loi/n;LBh/G;Lli/o;Lli/j;Lli/e;LBh/N;Lli/B;Lli/w;LIh/c;Lli/x;Ljava/lang/Iterable;LBh/L;Lli/m;LCh/a;LCh/c;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/types/checker/p;Lhi/a;Ljava/util/List;Lli/v;)V

    return-void
.end method


# virtual methods
.method public final a(LBh/M;LWh/c;LWh/g;LWh/h;LWh/a;Lni/s;)Lli/p;
    .locals 11

    const-string v0, "descriptor"

    move-object v4, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    move-object v5, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    move-object v6, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lli/p;

    const/4 v9, 0x0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v10

    move-object v1, v0

    move-object v2, p0

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v10}, Lli/p;-><init>(Lli/n;LWh/c;LBh/m;LWh/g;LWh/h;LWh/a;Lni/s;Lli/X;Ljava/util/List;)V

    return-object v0
.end method

.method public final b(LZh/b;)LBh/e;
    .locals 3

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lli/n;->u:Lli/l;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lli/l;->f(Lli/l;LZh/b;Lli/i;ILjava/lang/Object;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public final c()LCh/a;
    .locals 1

    iget-object v0, p0, Lli/n;->n:LCh/a;

    return-object v0
.end method

.method public final d()Lli/e;
    .locals 1

    iget-object v0, p0, Lli/n;->e:Lli/e;

    return-object v0
.end method

.method public final e()Lli/j;
    .locals 1

    iget-object v0, p0, Lli/n;->d:Lli/j;

    return-object v0
.end method

.method public final f()Lli/l;
    .locals 1

    iget-object v0, p0, Lli/n;->u:Lli/l;

    return-object v0
.end method

.method public final g()Lli/o;
    .locals 1

    iget-object v0, p0, Lli/n;->c:Lli/o;

    return-object v0
.end method

.method public final h()Lli/m;
    .locals 1

    iget-object v0, p0, Lli/n;->m:Lli/m;

    return-object v0
.end method

.method public final i()Lli/v;
    .locals 1

    iget-object v0, p0, Lli/n;->t:Lli/v;

    return-object v0
.end method

.method public final j()Lli/w;
    .locals 1

    iget-object v0, p0, Lli/n;->h:Lli/w;

    return-object v0
.end method

.method public final k()Lkotlin/reflect/jvm/internal/impl/protobuf/f;
    .locals 1

    iget-object v0, p0, Lli/n;->p:Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    return-object v0
.end method

.method public final l()Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lli/n;->k:Ljava/lang/Iterable;

    return-object v0
.end method

.method public final m()Lli/x;
    .locals 1

    iget-object v0, p0, Lli/n;->j:Lli/x;

    return-object v0
.end method

.method public final n()Lkotlin/reflect/jvm/internal/impl/types/checker/p;
    .locals 1

    iget-object v0, p0, Lli/n;->q:Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    return-object v0
.end method

.method public final o()Lli/B;
    .locals 1

    iget-object v0, p0, Lli/n;->g:Lli/B;

    return-object v0
.end method

.method public final p()LIh/c;
    .locals 1

    iget-object v0, p0, Lli/n;->i:LIh/c;

    return-object v0
.end method

.method public final q()LBh/G;
    .locals 1

    iget-object v0, p0, Lli/n;->b:LBh/G;

    return-object v0
.end method

.method public final r()LBh/L;
    .locals 1

    iget-object v0, p0, Lli/n;->l:LBh/L;

    return-object v0
.end method

.method public final s()LBh/N;
    .locals 1

    iget-object v0, p0, Lli/n;->f:LBh/N;

    return-object v0
.end method

.method public final t()LCh/c;
    .locals 1

    iget-object v0, p0, Lli/n;->o:LCh/c;

    return-object v0
.end method

.method public final u()Loi/n;
    .locals 1

    iget-object v0, p0, Lli/n;->a:Loi/n;

    return-object v0
.end method

.method public final v()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lli/n;->s:Ljava/util/List;

    return-object v0
.end method
