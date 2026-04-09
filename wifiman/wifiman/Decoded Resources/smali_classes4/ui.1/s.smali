.class public final Lui/s;
.super Lui/b;
.source "SourceFile"


# static fields
.field public static final a:Lui/s;

.field private static final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 46

    new-instance v0, Lui/s;

    invoke-direct {v0}, Lui/s;-><init>()V

    sput-object v0, Lui/s;->a:Lui/s;

    new-instance v1, Lui/h;

    move-object v7, v1

    sget-object v2, Lui/t;->k:LZh/f;

    sget-object v0, Lui/k$b;->b:Lui/k$b;

    new-instance v3, Lui/A$a;

    const/4 v15, 0x1

    invoke-direct {v3, v15}, Lui/A$a;-><init>(I)V

    const/4 v14, 0x2

    new-array v4, v14, [Lui/f;

    const/16 v26, 0x0

    aput-object v0, v4, v26

    aput-object v3, v4, v15

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, v4

    move-object v4, v8

    invoke-direct/range {v1 .. v6}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lui/h;

    move-object v8, v1

    sget-object v2, Lui/t;->l:LZh/f;

    new-instance v3, Lui/A$a;

    invoke-direct {v3, v14}, Lui/A$a;-><init>(I)V

    new-array v4, v14, [Lui/f;

    aput-object v0, v4, v26

    aput-object v3, v4, v15

    sget-object v3, Lui/p;->a:Lui/p;

    invoke-direct {v1, v2, v4, v3}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;)V

    new-instance v16, Lui/h;

    move-object/from16 v9, v16

    sget-object v17, Lui/t;->b:LZh/f;

    sget-object v1, Lui/m;->a:Lui/m;

    new-instance v2, Lui/A$a;

    invoke-direct {v2, v14}, Lui/A$a;-><init>(I)V

    sget-object v3, Lui/j;->a:Lui/j;

    const/4 v4, 0x4

    new-array v5, v4, [Lui/f;

    aput-object v0, v5, v26

    aput-object v1, v5, v15

    aput-object v2, v5, v14

    const/4 v2, 0x3

    aput-object v3, v5, v2

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v18, v5

    invoke-direct/range {v16 .. v21}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lui/h;

    move-object/from16 v10, v27

    sget-object v28, Lui/t;->c:LZh/f;

    new-instance v5, Lui/A$a;

    invoke-direct {v5, v2}, Lui/A$a;-><init>(I)V

    new-array v6, v4, [Lui/f;

    aput-object v0, v6, v26

    aput-object v1, v6, v15

    aput-object v5, v6, v14

    aput-object v3, v6, v2

    const/16 v31, 0x4

    const/16 v32, 0x0

    const/16 v30, 0x0

    move-object/from16 v29, v6

    invoke-direct/range {v27 .. v32}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lui/h;

    move-object/from16 v11, v16

    sget-object v17, Lui/t;->d:LZh/f;

    new-instance v5, Lui/A$b;

    invoke-direct {v5, v14}, Lui/A$b;-><init>(I)V

    new-array v6, v4, [Lui/f;

    aput-object v0, v6, v26

    aput-object v1, v6, v15

    aput-object v5, v6, v14

    aput-object v3, v6, v2

    move-object/from16 v18, v6

    invoke-direct/range {v16 .. v21}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lui/h;

    move-object/from16 v12, v27

    sget-object v28, Lui/t;->i:LZh/f;

    new-array v3, v15, [Lui/f;

    aput-object v0, v3, v26

    move-object/from16 v29, v3

    invoke-direct/range {v27 .. v32}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lui/h;

    move-object/from16 v13, v16

    sget-object v17, Lui/t;->h:LZh/f;

    sget-object v3, Lui/A$d;->b:Lui/A$d;

    sget-object v5, Lui/v$a;->d:Lui/v$a;

    new-array v6, v4, [Lui/f;

    aput-object v0, v6, v26

    aput-object v3, v6, v15

    aput-object v1, v6, v14

    aput-object v5, v6, v2

    move-object/from16 v18, v6

    invoke-direct/range {v16 .. v21}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lui/h;

    move v6, v14

    move-object/from16 v14, v27

    sget-object v28, Lui/t;->j:LZh/f;

    sget-object v33, Lui/A$c;->b:Lui/A$c;

    new-array v4, v6, [Lui/f;

    aput-object v0, v4, v26

    aput-object v33, v4, v15

    move-object/from16 v29, v4

    invoke-direct/range {v27 .. v32}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lui/h;

    move v4, v15

    move-object/from16 v15, v16

    sget-object v17, Lui/t;->m:LZh/f;

    new-array v2, v6, [Lui/f;

    aput-object v0, v2, v26

    aput-object v33, v2, v4

    move-object/from16 v18, v2

    invoke-direct/range {v16 .. v21}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lui/h;

    move-object/from16 v16, v34

    sget-object v35, Lui/t;->n:LZh/f;

    const/4 v2, 0x3

    new-array v6, v2, [Lui/f;

    aput-object v0, v6, v26

    aput-object v33, v6, v4

    const/4 v2, 0x2

    aput-object v5, v6, v2

    const/16 v38, 0x4

    const/16 v39, 0x0

    const/16 v37, 0x0

    move-object/from16 v36, v6

    invoke-direct/range {v34 .. v39}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lui/h;

    move-object/from16 v17, v18

    sget-object v19, Lui/t;->I:LZh/f;

    const/4 v2, 0x3

    new-array v5, v2, [Lui/f;

    aput-object v0, v5, v26

    aput-object v3, v5, v4

    const/4 v2, 0x2

    aput-object v1, v5, v2

    const/16 v22, 0x4

    const/16 v23, 0x0

    move-object/from16 v20, v5

    invoke-direct/range {v18 .. v23}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lui/h;

    move-object/from16 v18, v34

    sget-object v35, Lui/t;->J:LZh/f;

    const/4 v2, 0x3

    new-array v5, v2, [Lui/f;

    aput-object v0, v5, v26

    aput-object v3, v5, v4

    const/4 v2, 0x2

    aput-object v1, v5, v2

    move-object/from16 v36, v5

    invoke-direct/range {v34 .. v39}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lui/h;

    move-object/from16 v19, v2

    sget-object v5, Lui/t;->e:LZh/f;

    new-array v6, v4, [Lui/f;

    sget-object v20, Lui/k$a;->b:Lui/k$a;

    aput-object v20, v6, v26

    sget-object v4, Lui/q;->a:Lui/q;

    invoke-direct {v2, v5, v6, v4}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;)V

    new-instance v34, Lui/h;

    move-object/from16 v20, v34

    sget-object v35, Lui/t;->g:LZh/f;

    const/4 v2, 0x4

    new-array v4, v2, [Lui/f;

    aput-object v0, v4, v26

    sget-object v2, Lui/v$b;->d:Lui/v$b;

    const/4 v5, 0x1

    aput-object v2, v4, v5

    const/4 v2, 0x2

    aput-object v3, v4, v2

    const/4 v2, 0x3

    aput-object v1, v4, v2

    move-object/from16 v36, v4

    invoke-direct/range {v34 .. v39}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v40, Lui/h;

    move-object/from16 v21, v40

    sget-object v2, Lui/t;->Z:Ljava/util/Set;

    move-object/from16 v41, v2

    check-cast v41, Ljava/util/Collection;

    const/4 v2, 0x3

    new-array v4, v2, [Lui/f;

    aput-object v0, v4, v26

    const/4 v2, 0x1

    aput-object v3, v4, v2

    const/4 v2, 0x2

    aput-object v1, v4, v2

    const/16 v44, 0x4

    const/16 v45, 0x0

    const/16 v43, 0x0

    move-object/from16 v42, v4

    invoke-direct/range {v40 .. v45}, Lui/h;-><init>(Ljava/util/Collection;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lui/h;

    move-object/from16 v22, v34

    sget-object v2, Lui/t;->Y:Ljava/util/Set;

    move-object/from16 v35, v2

    check-cast v35, Ljava/util/Collection;

    const/4 v2, 0x2

    new-array v4, v2, [Lui/f;

    aput-object v0, v4, v26

    const/4 v2, 0x1

    aput-object v33, v4, v2

    move-object/from16 v36, v4

    invoke-direct/range {v34 .. v39}, Lui/h;-><init>(Ljava/util/Collection;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lui/h;

    move-object/from16 v23, v2

    sget-object v4, Lui/t;->x:LZh/f;

    sget-object v5, Lui/t;->y:LZh/f;

    filled-new-array {v4, v5}, [LZh/f;

    move-result-object v4

    invoke-static {v4}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    const/4 v5, 0x1

    new-array v6, v5, [Lui/f;

    aput-object v0, v6, v26

    sget-object v5, Lui/r;->a:Lui/r;

    invoke-direct {v2, v4, v6, v5}, Lui/h;-><init>(Ljava/util/Collection;[Lui/f;Lmh/l;)V

    new-instance v34, Lui/h;

    move-object/from16 v24, v34

    sget-object v2, Lui/t;->e0:Ljava/util/Set;

    move-object/from16 v35, v2

    check-cast v35, Ljava/util/Collection;

    const/4 v2, 0x4

    new-array v2, v2, [Lui/f;

    aput-object v0, v2, v26

    sget-object v4, Lui/v$c;->d:Lui/v$c;

    const/4 v5, 0x1

    aput-object v4, v2, v5

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const/4 v3, 0x3

    aput-object v1, v2, v3

    move-object/from16 v36, v2

    invoke-direct/range {v34 .. v39}, Lui/h;-><init>(Ljava/util/Collection;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v40, Lui/h;

    move-object/from16 v25, v40

    sget-object v41, Lui/t;->p:Lkotlin/text/p;

    const/4 v1, 0x2

    new-array v1, v1, [Lui/f;

    aput-object v0, v1, v26

    const/4 v0, 0x1

    aput-object v33, v1, v0

    move-object/from16 v42, v1

    invoke-direct/range {v40 .. v45}, Lui/h;-><init>(Lkotlin/text/p;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v7 .. v25}, [Lui/h;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lui/s;->b:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lui/b;-><init>()V

    return-void
.end method

.method static synthetic c(LBh/z;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lui/s;->f(LBh/z;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(LBh/z;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lui/s;->g(LBh/z;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(LBh/z;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lui/s;->i(LBh/z;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final f(LBh/z;)Ljava/lang/String;
    .locals 2

    const-string v0, "$this$Checks"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/a;->i()Ljava/util/List;

    move-result-object p0

    const-string v0, "getValueParameters(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBh/s0;

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lfi/e;->f(LBh/s0;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, LBh/s0;->j0()Lpi/S;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-nez v0, :cond_1

    const-string p0, "last parameter should not have a default value or be a vararg"

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final g(LBh/z;)Ljava/lang/String;
    .locals 3

    const-string v0, "$this$Checks"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/z;->b()LBh/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lui/s;->h(LBh/m;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p0}, LBh/z;->f()Ljava/util/Collection;

    move-result-object v0

    const-string v2, "getOverriddenDescriptors(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/z;

    invoke-interface {v2}, LBh/z;->b()LBh/m;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lui/s;->h(LBh/m;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p0}, LBh/s;->c(LBh/z;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-nez v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "must override \'\'equals()\'\' in Any"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, LBh/z;->b()LBh/m;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lbi/k;->g(LBh/m;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/n;->j:Lkotlin/reflect/jvm/internal/impl/renderer/n;

    invoke-interface {p0}, LBh/z;->b()LBh/m;

    move-result-object p0

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LBh/e;

    invoke-interface {p0}, LBh/e;->u()Lpi/d0;

    move-result-object p0

    const-string v2, "getDefaultType(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lsi/d;->D(Lpi/S;)Lpi/S;

    move-result-object p0

    invoke-virtual {v1, p0}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->U(Lpi/S;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " or define \'\'equals(other: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "): Boolean\'\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    const/4 p0, 0x0

    :goto_3
    return-object p0
.end method

.method private static final h(LBh/m;)Z
    .locals 1

    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_0

    check-cast p0, LBh/e;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a0(LBh/e;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final i(LBh/z;)Ljava/lang/String;
    .locals 6

    const-string v0, "$this$Checks"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/a;->d0()LBh/b0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0}, LBh/a;->k0()LBh/b0;

    move-result-object v0

    :cond_0
    sget-object v1, Lui/s;->a:Lui/s;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p0}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, LBh/r0;->getType()Lpi/S;

    move-result-object v4

    const-string v5, "getType(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v4}, Lsi/d;->w(Lpi/S;Lpi/S;)Z

    move-result v3

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    if-nez v3, :cond_2

    invoke-direct {v1, p0, v0}, Lui/s;->j(LBh/z;LBh/b0;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    if-nez v2, :cond_4

    const-string p0, "receiver must be a supertype of the return type"

    goto :goto_1

    :cond_4
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method private final j(LBh/z;LBh/b0;)Z
    .locals 2

    invoke-interface {p2}, LBh/b0;->getValue()Lji/g;

    move-result-object p2

    const-string v0, "getValue(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lji/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p2, Lji/e;

    invoke-virtual {p2}, Lji/e;->t()LBh/e;

    move-result-object p2

    invoke-interface {p2}, LBh/C;->L()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-static {p2}, Lfi/e;->n(LBh/h;)LZh/b;

    move-result-object v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-static {p2}, Lfi/e;->s(LBh/m;)LBh/G;

    move-result-object p2

    invoke-static {p2, v0}, LBh/y;->c(LBh/G;LZh/b;)LBh/h;

    move-result-object p2

    instance-of v0, p2, LBh/k0;

    if-eqz v0, :cond_3

    check-cast p2, LBh/k0;

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_4

    return v1

    :cond_4
    invoke-interface {p1}, LBh/a;->getReturnType()Lpi/S;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p2}, LBh/k0;->U()Lpi/d0;

    move-result-object p2

    invoke-static {p1, p2}, Lsi/d;->w(Lpi/S;Lpi/S;)Z

    move-result p1

    return p1

    :cond_5
    return v1
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 1

    sget-object v0, Lui/s;->b:Ljava/util/List;

    return-object v0
.end method
