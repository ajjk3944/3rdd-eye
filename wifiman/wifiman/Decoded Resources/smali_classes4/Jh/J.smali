.class public abstract LJh/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LZh/c;

.field private static final b:LZh/c;

.field private static final c:LZh/c;

.field private static final d:LZh/c;

.field private static final e:LZh/c;

.field private static final f:LZh/c;

.field private static final g:LZh/c;

.field private static final h:LZh/c;

.field private static final i:LZh/c;

.field private static final j:LZh/c;

.field private static final k:LZh/c;

.field private static final l:LZh/c;

.field private static final m:LZh/c;

.field private static final n:LZh/c;

.field private static final o:LZh/c;

.field private static final p:LZh/c;

.field private static final q:Ljava/util/Set;

.field private static final r:Ljava/util/Set;

.field private static final s:Ljava/util/Set;

.field private static final t:Ljava/util/Set;

.field private static final u:Ljava/util/Set;

.field private static final v:Ljava/util/Set;

.field private static final w:Ljava/util/Set;

.field private static final x:Ljava/util/Map;

.field private static final y:LZh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 44

    new-instance v0, LZh/c;

    move-object v1, v0

    const-string v2, "org.jspecify.nullness.Nullable"

    invoke-direct {v0, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LJh/J;->a:LZh/c;

    new-instance v15, LZh/c;

    const-string v0, "org.jspecify.nullness.NullMarked"

    invoke-direct {v15, v0}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v15, LJh/J;->b:LZh/c;

    new-instance v14, LZh/c;

    const-string v0, "org.jspecify.nullness.NullnessUnspecified"

    invoke-direct {v14, v0}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v14, LJh/J;->c:LZh/c;

    new-instance v0, LZh/c;

    const-string v2, "org.jspecify.annotations.NonNull"

    invoke-direct {v0, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LJh/J;->d:LZh/c;

    new-instance v3, LZh/c;

    move-object v2, v3

    const-string v4, "org.jspecify.annotations.Nullable"

    invoke-direct {v3, v4}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v3, LJh/J;->e:LZh/c;

    new-instance v13, LZh/c;

    const-string v3, "org.jspecify.annotations.NullMarked"

    invoke-direct {v13, v3}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v13, LJh/J;->f:LZh/c;

    new-instance v12, LZh/c;

    const-string v3, "org.jspecify.annotations.NullnessUnspecified"

    invoke-direct {v12, v3}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v12, LJh/J;->g:LZh/c;

    new-instance v11, LZh/c;

    const-string v3, "org.jspecify.annotations.NullUnmarked"

    invoke-direct {v11, v3}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v11, LJh/J;->h:LZh/c;

    new-instance v3, LZh/c;

    const-string v4, "javax.annotation.meta.TypeQualifier"

    invoke-direct {v3, v4}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v3, LJh/J;->i:LZh/c;

    new-instance v3, LZh/c;

    const-string v4, "javax.annotation.meta.TypeQualifierNickname"

    invoke-direct {v3, v4}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v3, LJh/J;->j:LZh/c;

    new-instance v3, LZh/c;

    const-string v4, "javax.annotation.meta.TypeQualifierDefault"

    invoke-direct {v3, v4}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v3, LJh/J;->k:LZh/c;

    new-instance v10, LZh/c;

    const-string v3, "javax.annotation.Nonnull"

    invoke-direct {v10, v3}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v10, LJh/J;->l:LZh/c;

    new-instance v4, LZh/c;

    move-object v3, v4

    const-string v5, "javax.annotation.Nullable"

    invoke-direct {v4, v5}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v4, LJh/J;->m:LZh/c;

    new-instance v5, LZh/c;

    move-object v4, v5

    const-string v6, "javax.annotation.CheckForNull"

    invoke-direct {v5, v6}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v5, LJh/J;->n:LZh/c;

    new-instance v6, LZh/c;

    const-string v7, "javax.annotation.ParametersAreNonnullByDefault"

    invoke-direct {v6, v7}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v6, LJh/J;->o:LZh/c;

    new-instance v6, LZh/c;

    const-string v7, "javax.annotation.ParametersAreNullableByDefault"

    invoke-direct {v6, v7}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v6, LJh/J;->p:LZh/c;

    filled-new-array {v10, v5}, [LZh/c;

    move-result-object v5

    invoke-static {v5}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    sput-object v5, LJh/J;->q:Ljava/util/Set;

    sget-object v16, LJh/I;->l:LZh/c;

    new-instance v5, LZh/c;

    const-string v6, "android.annotation.NonNull"

    invoke-direct {v5, v6}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v6, LZh/c;

    const-string v7, "androidx.annotation.NonNull"

    invoke-direct {v6, v7}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v7, LZh/c;

    const-string v8, "androidx.annotation.RecentlyNonNull"

    invoke-direct {v7, v8}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v8, LZh/c;

    const-string v9, "android.support.annotation.NonNull"

    invoke-direct {v8, v9}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v9, LZh/c;

    move-object/from16 v30, v10

    const-string v10, "com.android.annotations.NonNull"

    invoke-direct {v9, v10}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v10, LZh/c;

    move-object/from16 v31, v11

    const-string v11, "org.checkerframework.checker.nullness.compatqual.NonNullDecl"

    invoke-direct {v10, v11}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v11, LZh/c;

    move-object/from16 v32, v12

    const-string v12, "org.checkerframework.checker.nullness.qual.NonNull"

    invoke-direct {v11, v12}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v12, LZh/c;

    move-object/from16 v33, v13

    const-string v13, "edu.umd.cs.findbugs.annotations.NonNull"

    invoke-direct {v12, v13}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v13, LZh/c;

    move-object/from16 v34, v14

    const-string v14, "io.reactivex.annotations.NonNull"

    invoke-direct {v13, v14}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v14, LZh/c;

    move-object/from16 v35, v15

    const-string v15, "io.reactivex.rxjava3.annotations.NonNull"

    invoke-direct {v14, v15}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v15, LZh/c;

    move-object/from16 v36, v1

    const-string v1, "org.eclipse.jdt.annotation.NonNull"

    invoke-direct {v15, v1}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object/from16 v37, v2

    const-string v2, "lombok.NonNull"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    move-object/from16 v21, v8

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    move-object/from16 v25, v12

    move-object/from16 v26, v13

    move-object/from16 v27, v14

    move-object/from16 v28, v15

    move-object/from16 v29, v1

    filled-new-array/range {v16 .. v29}, [LZh/c;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v18

    sput-object v18, LJh/J;->r:Ljava/util/Set;

    sget-object v0, LJh/I;->m:LZh/c;

    new-instance v1, LZh/c;

    move-object v5, v1

    const-string v2, "android.annotation.Nullable"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object v6, v1

    const-string v2, "androidx.annotation.Nullable"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object v7, v1

    const-string v2, "androidx.annotation.RecentlyNullable"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object v8, v1

    const-string v2, "android.support.annotation.Nullable"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object v9, v1

    const-string v2, "com.android.annotations.Nullable"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object/from16 v2, v30

    move-object v10, v1

    const-string v11, "org.checkerframework.checker.nullness.compatqual.NullableDecl"

    invoke-direct {v1, v11}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object/from16 v15, v31

    move-object v11, v1

    const-string v12, "org.checkerframework.checker.nullness.qual.Nullable"

    invoke-direct {v1, v12}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object/from16 v14, v32

    move-object v12, v1

    const-string v13, "edu.umd.cs.findbugs.annotations.Nullable"

    invoke-direct {v1, v13}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object/from16 v38, v33

    move-object v13, v1

    const-string v2, "edu.umd.cs.findbugs.annotations.PossiblyNull"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object/from16 v39, v14

    move-object/from16 v2, v34

    move-object v14, v1

    const-string v2, "edu.umd.cs.findbugs.annotations.CheckForNull"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object/from16 v40, v15

    move-object/from16 v2, v35

    move-object v15, v1

    const-string v2, "io.reactivex.annotations.Nullable"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object/from16 v16, v1

    const-string v2, "io.reactivex.rxjava3.annotations.Nullable"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v1, LZh/c;

    move-object/from16 v17, v1

    const-string v2, "org.eclipse.jdt.annotation.Nullable"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    move-object/from16 v43, v30

    move-object/from16 v42, v34

    move-object/from16 v41, v35

    move-object/from16 v1, v36

    move-object/from16 v2, v37

    filled-new-array/range {v0 .. v17}, [LZh/c;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LJh/J;->s:Ljava/util/Set;

    move-object/from16 v2, v39

    move-object/from16 v1, v42

    filled-new-array {v1, v2}, [LZh/c;

    move-result-object v1

    invoke-static {v1}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, LJh/J;->t:Ljava/util/Set;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    move-object/from16 v2, v18

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    move-object/from16 v1, v43

    invoke-static {v0, v1}, LZg/d0;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    move-object/from16 v1, v41

    invoke-static {v0, v1}, LZg/d0;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    move-object/from16 v1, v38

    invoke-static {v0, v1}, LZg/d0;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-static {v0, v1}, LZg/d0;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LJh/J;->u:Ljava/util/Set;

    sget-object v0, LJh/I;->o:LZh/c;

    sget-object v1, LJh/I;->p:LZh/c;

    filled-new-array {v0, v1}, [LZh/c;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LJh/J;->v:Ljava/util/Set;

    sget-object v0, LJh/I;->n:LZh/c;

    sget-object v1, LJh/I;->q:LZh/c;

    filled-new-array {v0, v1}, [LZh/c;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LJh/J;->w:Ljava/util/Set;

    sget-object v0, LJh/I;->d:LZh/c;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->H:LZh/c;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    sget-object v1, LJh/I;->f:LZh/c;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->L:LZh/c;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    sget-object v2, LJh/I;->h:LZh/c;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->y:LZh/c;

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    sget-object v3, LJh/I;->i:LZh/c;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->P:LZh/c;

    invoke-static {v3, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LJh/J;->x:Ljava/util/Map;

    new-instance v0, LZh/c;

    const-string v1, "kotlin.annotations.jvm.UnderMigration"

    invoke-direct {v0, v1}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LJh/J;->y:LZh/c;

    return-void
.end method

.method public static final a()Ljava/util/Set;
    .locals 1

    sget-object v0, LJh/J;->q:Ljava/util/Set;

    return-object v0
.end method

.method public static final b()Ljava/util/Set;
    .locals 1

    sget-object v0, LJh/J;->t:Ljava/util/Set;

    return-object v0
.end method

.method public static final c()LZh/c;
    .locals 1

    sget-object v0, LJh/J;->l:LZh/c;

    return-object v0
.end method

.method public static final d()LZh/c;
    .locals 1

    sget-object v0, LJh/J;->o:LZh/c;

    return-object v0
.end method

.method public static final e()LZh/c;
    .locals 1

    sget-object v0, LJh/J;->p:LZh/c;

    return-object v0
.end method

.method public static final f()LZh/c;
    .locals 1

    sget-object v0, LJh/J;->i:LZh/c;

    return-object v0
.end method

.method public static final g()LZh/c;
    .locals 1

    sget-object v0, LJh/J;->k:LZh/c;

    return-object v0
.end method

.method public static final h()LZh/c;
    .locals 1

    sget-object v0, LJh/J;->j:LZh/c;

    return-object v0
.end method

.method public static final i()LZh/c;
    .locals 1

    sget-object v0, LJh/J;->f:LZh/c;

    return-object v0
.end method

.method public static final j()LZh/c;
    .locals 1

    sget-object v0, LJh/J;->h:LZh/c;

    return-object v0
.end method

.method public static final k()LZh/c;
    .locals 1

    sget-object v0, LJh/J;->b:LZh/c;

    return-object v0
.end method

.method public static final l()Ljava/util/Set;
    .locals 1

    sget-object v0, LJh/J;->w:Ljava/util/Set;

    return-object v0
.end method

.method public static final m()Ljava/util/Set;
    .locals 1

    sget-object v0, LJh/J;->r:Ljava/util/Set;

    return-object v0
.end method

.method public static final n()Ljava/util/Set;
    .locals 1

    sget-object v0, LJh/J;->s:Ljava/util/Set;

    return-object v0
.end method

.method public static final o()Ljava/util/Set;
    .locals 1

    sget-object v0, LJh/J;->v:Ljava/util/Set;

    return-object v0
.end method

.method public static final p()LZh/c;
    .locals 1

    sget-object v0, LJh/J;->y:LZh/c;

    return-object v0
.end method
