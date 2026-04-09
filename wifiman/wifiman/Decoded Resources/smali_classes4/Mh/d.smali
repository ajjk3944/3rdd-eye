.class public final LMh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Loi/n;

.field private final b:LJh/u;

.field private final c:LSh/v;

.field private final d:LSh/n;

.field private final e:LKh/o;

.field private final f:Lli/w;

.field private final g:LKh/j;

.field private final h:LKh/i;

.field private final i:Lhi/a;

.field private final j:LPh/b;

.field private final k:LMh/n;

.field private final l:LSh/D;

.field private final m:LBh/j0;

.field private final n:LIh/c;

.field private final o:LBh/G;

.field private final p:Lkotlin/reflect/jvm/internal/impl/builtins/n;

.field private final q:LJh/d;

.field private final r:LRh/e0;

.field private final s:LJh/v;

.field private final t:LMh/e;

.field private final u:Lkotlin/reflect/jvm/internal/impl/types/checker/p;

.field private final v:LJh/D;

.field private final w:LJh/A;

.field private final x:Lgi/f;


# direct methods
.method public constructor <init>(Loi/n;LJh/u;LSh/v;LSh/n;LKh/o;Lli/w;LKh/j;LKh/i;Lhi/a;LPh/b;LMh/n;LSh/D;LBh/j0;LIh/c;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/n;LJh/d;LRh/e0;LJh/v;LMh/e;Lkotlin/reflect/jvm/internal/impl/types/checker/p;LJh/D;LJh/A;Lgi/f;)V
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

    const-string v0, "finder"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signaturePropagator"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaResolverCache"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaPropertyInitializerEvaluator"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElementFactory"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleClassResolver"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packagePartProvider"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertypeLoopChecker"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reflectionTypes"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationTypeQualifierResolver"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signatureEnhancement"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaClassesTracker"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaTypeEnhancementState"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaModuleResolver"

    move-object/from16 v15, p23

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticPartsProvider"

    move-object/from16 v15, p24

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v15, p16

    .line 2
    iput-object v1, v0, LMh/d;->a:Loi/n;

    .line 3
    iput-object v2, v0, LMh/d;->b:LJh/u;

    .line 4
    iput-object v3, v0, LMh/d;->c:LSh/v;

    .line 5
    iput-object v4, v0, LMh/d;->d:LSh/n;

    .line 6
    iput-object v5, v0, LMh/d;->e:LKh/o;

    .line 7
    iput-object v6, v0, LMh/d;->f:Lli/w;

    .line 8
    iput-object v7, v0, LMh/d;->g:LKh/j;

    .line 9
    iput-object v8, v0, LMh/d;->h:LKh/i;

    .line 10
    iput-object v9, v0, LMh/d;->i:Lhi/a;

    .line 11
    iput-object v10, v0, LMh/d;->j:LPh/b;

    .line 12
    iput-object v11, v0, LMh/d;->k:LMh/n;

    .line 13
    iput-object v12, v0, LMh/d;->l:LSh/D;

    .line 14
    iput-object v13, v0, LMh/d;->m:LBh/j0;

    .line 15
    iput-object v14, v0, LMh/d;->n:LIh/c;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, LMh/d;->o:LBh/G;

    .line 17
    iput-object v15, v0, LMh/d;->p:Lkotlin/reflect/jvm/internal/impl/builtins/n;

    move-object/from16 v1, p17

    move-object/from16 v2, p18

    .line 18
    iput-object v1, v0, LMh/d;->q:LJh/d;

    .line 19
    iput-object v2, v0, LMh/d;->r:LRh/e0;

    move-object/from16 v1, p19

    move-object/from16 v2, p20

    .line 20
    iput-object v1, v0, LMh/d;->s:LJh/v;

    .line 21
    iput-object v2, v0, LMh/d;->t:LMh/e;

    move-object/from16 v1, p21

    move-object/from16 v2, p22

    .line 22
    iput-object v1, v0, LMh/d;->u:Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    .line 23
    iput-object v2, v0, LMh/d;->v:LJh/D;

    move-object/from16 v1, p23

    move-object/from16 v2, p24

    .line 24
    iput-object v1, v0, LMh/d;->w:LJh/A;

    .line 25
    iput-object v2, v0, LMh/d;->x:Lgi/f;

    return-void
.end method

.method public synthetic constructor <init>(Loi/n;LJh/u;LSh/v;LSh/n;LKh/o;Lli/w;LKh/j;LKh/i;Lhi/a;LPh/b;LMh/n;LSh/D;LBh/j0;LIh/c;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/n;LJh/d;LRh/e0;LJh/v;LMh/e;Lkotlin/reflect/jvm/internal/impl/types/checker/p;LJh/D;LJh/A;Lgi/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 26

    const/high16 v0, 0x800000

    and-int v0, p25, v0

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Lgi/f;->a:Lgi/f$a;

    invoke-virtual {v0}, Lgi/f$a;->a()Lgi/a;

    move-result-object v0

    move-object/from16 v25, v0

    goto :goto_0

    :cond_0
    move-object/from16 v25, p24

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    .line 27
    invoke-direct/range {v1 .. v25}, LMh/d;-><init>(Loi/n;LJh/u;LSh/v;LSh/n;LKh/o;Lli/w;LKh/j;LKh/i;Lhi/a;LPh/b;LMh/n;LSh/D;LBh/j0;LIh/c;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/n;LJh/d;LRh/e0;LJh/v;LMh/e;Lkotlin/reflect/jvm/internal/impl/types/checker/p;LJh/D;LJh/A;Lgi/f;)V

    return-void
.end method


# virtual methods
.method public final a()LJh/d;
    .locals 1

    iget-object v0, p0, LMh/d;->q:LJh/d;

    return-object v0
.end method

.method public final b()LSh/n;
    .locals 1

    iget-object v0, p0, LMh/d;->d:LSh/n;

    return-object v0
.end method

.method public final c()Lli/w;
    .locals 1

    iget-object v0, p0, LMh/d;->f:Lli/w;

    return-object v0
.end method

.method public final d()LJh/u;
    .locals 1

    iget-object v0, p0, LMh/d;->b:LJh/u;

    return-object v0
.end method

.method public final e()LJh/v;
    .locals 1

    iget-object v0, p0, LMh/d;->s:LJh/v;

    return-object v0
.end method

.method public final f()LJh/A;
    .locals 1

    iget-object v0, p0, LMh/d;->w:LJh/A;

    return-object v0
.end method

.method public final g()LKh/i;
    .locals 1

    iget-object v0, p0, LMh/d;->h:LKh/i;

    return-object v0
.end method

.method public final h()LKh/j;
    .locals 1

    iget-object v0, p0, LMh/d;->g:LKh/j;

    return-object v0
.end method

.method public final i()LJh/D;
    .locals 1

    iget-object v0, p0, LMh/d;->v:LJh/D;

    return-object v0
.end method

.method public final j()LSh/v;
    .locals 1

    iget-object v0, p0, LMh/d;->c:LSh/v;

    return-object v0
.end method

.method public final k()Lkotlin/reflect/jvm/internal/impl/types/checker/p;
    .locals 1

    iget-object v0, p0, LMh/d;->u:Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    return-object v0
.end method

.method public final l()LIh/c;
    .locals 1

    iget-object v0, p0, LMh/d;->n:LIh/c;

    return-object v0
.end method

.method public final m()LBh/G;
    .locals 1

    iget-object v0, p0, LMh/d;->o:LBh/G;

    return-object v0
.end method

.method public final n()LMh/n;
    .locals 1

    iget-object v0, p0, LMh/d;->k:LMh/n;

    return-object v0
.end method

.method public final o()LSh/D;
    .locals 1

    iget-object v0, p0, LMh/d;->l:LSh/D;

    return-object v0
.end method

.method public final p()Lkotlin/reflect/jvm/internal/impl/builtins/n;
    .locals 1

    iget-object v0, p0, LMh/d;->p:Lkotlin/reflect/jvm/internal/impl/builtins/n;

    return-object v0
.end method

.method public final q()LMh/e;
    .locals 1

    iget-object v0, p0, LMh/d;->t:LMh/e;

    return-object v0
.end method

.method public final r()LRh/e0;
    .locals 1

    iget-object v0, p0, LMh/d;->r:LRh/e0;

    return-object v0
.end method

.method public final s()LKh/o;
    .locals 1

    iget-object v0, p0, LMh/d;->e:LKh/o;

    return-object v0
.end method

.method public final t()LPh/b;
    .locals 1

    iget-object v0, p0, LMh/d;->j:LPh/b;

    return-object v0
.end method

.method public final u()Loi/n;
    .locals 1

    iget-object v0, p0, LMh/d;->a:Loi/n;

    return-object v0
.end method

.method public final v()LBh/j0;
    .locals 1

    iget-object v0, p0, LMh/d;->m:LBh/j0;

    return-object v0
.end method

.method public final w()Lgi/f;
    .locals 1

    iget-object v0, p0, LMh/d;->x:Lgi/f;

    return-object v0
.end method

.method public final x(LKh/j;)LMh/d;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    const-string v1, "javaResolverCache"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v28, LMh/d;

    move-object/from16 v1, v28

    iget-object v2, v0, LMh/d;->a:Loi/n;

    iget-object v3, v0, LMh/d;->b:LJh/u;

    iget-object v4, v0, LMh/d;->c:LSh/v;

    iget-object v5, v0, LMh/d;->d:LSh/n;

    iget-object v6, v0, LMh/d;->e:LKh/o;

    iget-object v7, v0, LMh/d;->f:Lli/w;

    iget-object v9, v0, LMh/d;->h:LKh/i;

    iget-object v10, v0, LMh/d;->i:Lhi/a;

    iget-object v11, v0, LMh/d;->j:LPh/b;

    iget-object v12, v0, LMh/d;->k:LMh/n;

    iget-object v13, v0, LMh/d;->l:LSh/D;

    iget-object v14, v0, LMh/d;->m:LBh/j0;

    iget-object v15, v0, LMh/d;->n:LIh/c;

    move-object/from16 p1, v1

    iget-object v1, v0, LMh/d;->o:LBh/G;

    move-object/from16 v16, v1

    iget-object v1, v0, LMh/d;->p:Lkotlin/reflect/jvm/internal/impl/builtins/n;

    move-object/from16 v17, v1

    iget-object v1, v0, LMh/d;->q:LJh/d;

    move-object/from16 v18, v1

    iget-object v1, v0, LMh/d;->r:LRh/e0;

    move-object/from16 v19, v1

    iget-object v1, v0, LMh/d;->s:LJh/v;

    move-object/from16 v20, v1

    iget-object v1, v0, LMh/d;->t:LMh/e;

    move-object/from16 v21, v1

    iget-object v1, v0, LMh/d;->u:Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-object/from16 v22, v1

    iget-object v1, v0, LMh/d;->v:LJh/D;

    move-object/from16 v23, v1

    iget-object v1, v0, LMh/d;->w:LJh/A;

    move-object/from16 v24, v1

    const/high16 v26, 0x800000

    const/16 v27, 0x0

    const/16 v25, 0x0

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v27}, LMh/d;-><init>(Loi/n;LJh/u;LSh/v;LSh/n;LKh/o;Lli/w;LKh/j;LKh/i;Lhi/a;LPh/b;LMh/n;LSh/D;LBh/j0;LIh/c;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/n;LJh/d;LRh/e0;LJh/v;LMh/e;Lkotlin/reflect/jvm/internal/impl/types/checker/p;LJh/D;LJh/A;Lgi/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v28
.end method
