.class public abstract LJh/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LZh/c;

.field private static final b:LZh/c;

.field private static final c:LZh/c;

.field private static final d:LZh/c;

.field private static final e:Ljava/lang/String;

.field private static final f:[LZh/c;

.field private static final g:LJh/K;

.field private static final h:LJh/C;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    new-instance v0, LZh/c;

    const-string v1, "org.jspecify.nullness"

    invoke-direct {v0, v1}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LJh/B;->a:LZh/c;

    new-instance v1, LZh/c;

    const-string v2, "org.jspecify.annotations"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v1, LJh/B;->b:LZh/c;

    new-instance v2, LZh/c;

    const-string v3, "io.reactivex.rxjava3.annotations"

    invoke-direct {v2, v3}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v2, LJh/B;->c:LZh/c;

    new-instance v3, LZh/c;

    const-string v4, "org.checkerframework.checker.nullness.compatqual"

    invoke-direct {v3, v4}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v3, LJh/B;->d:LZh/c;

    invoke-virtual {v2}, LZh/c;->b()Ljava/lang/String;

    move-result-object v4

    const-string v5, "asString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v4, LJh/B;->e:Ljava/lang/String;

    new-instance v5, LZh/c;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".Nullable"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v6, LZh/c;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".NonNull"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, LZh/c;-><init>(Ljava/lang/String;)V

    filled-new-array {v5, v6}, [LZh/c;

    move-result-object v4

    sput-object v4, LJh/B;->f:[LZh/c;

    new-instance v4, LJh/M;

    new-instance v5, LZh/c;

    const-string v6, "org.jetbrains.annotations"

    invoke-direct {v5, v6}, LZh/c;-><init>(Ljava/lang/String;)V

    sget-object v6, LJh/C;->d:LJh/C$a;

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v7

    invoke-static {v5, v7}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v8

    new-instance v5, LZh/c;

    const-string v7, "androidx.annotation"

    invoke-direct {v5, v7}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v7

    invoke-static {v5, v7}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v9

    new-instance v5, LZh/c;

    const-string v7, "android.support.annotation"

    invoke-direct {v5, v7}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v7

    invoke-static {v5, v7}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v10

    new-instance v5, LZh/c;

    const-string v7, "android.annotation"

    invoke-direct {v5, v7}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v7

    invoke-static {v5, v7}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v11

    new-instance v5, LZh/c;

    const-string v7, "com.android.annotations"

    invoke-direct {v5, v7}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v7

    invoke-static {v5, v7}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v12

    new-instance v5, LZh/c;

    const-string v7, "org.eclipse.jdt.annotation"

    invoke-direct {v5, v7}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v7

    invoke-static {v5, v7}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v13

    new-instance v5, LZh/c;

    const-string v7, "org.checkerframework.checker.nullness.qual"

    invoke-direct {v5, v7}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v7

    invoke-static {v5, v7}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v14

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v5

    invoke-static {v3, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v15

    new-instance v3, LZh/c;

    const-string v5, "javax.annotation"

    invoke-direct {v3, v5}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v5

    invoke-static {v3, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v16

    new-instance v3, LZh/c;

    const-string v5, "edu.umd.cs.findbugs.annotations"

    invoke-direct {v3, v5}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v5

    invoke-static {v3, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v17

    new-instance v3, LZh/c;

    const-string v5, "io.reactivex.annotations"

    invoke-direct {v3, v5}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v5

    invoke-static {v3, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v18

    new-instance v3, LZh/c;

    const-string v5, "androidx.annotation.RecentlyNullable"

    invoke-direct {v3, v5}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v5, LJh/C;

    sget-object v7, LJh/O;->WARN:LJh/O;

    const/16 v23, 0x4

    const/16 v24, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v5

    move-object/from16 v20, v7

    invoke-direct/range {v19 .. v24}, LJh/C;-><init>(LJh/O;LYg/k;LJh/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v19

    new-instance v3, LZh/c;

    const-string v5, "androidx.annotation.RecentlyNonNull"

    invoke-direct {v3, v5}, LZh/c;-><init>(Ljava/lang/String;)V

    new-instance v5, LJh/C;

    const/16 v24, 0x4

    const/16 v25, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v5

    move-object/from16 v21, v7

    invoke-direct/range {v20 .. v25}, LJh/C;-><init>(LJh/O;LYg/k;LJh/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v20

    new-instance v3, LZh/c;

    const-string v5, "lombok"

    invoke-direct {v3, v5}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, LJh/C$a;->a()LJh/C;

    move-result-object v5

    invoke-static {v3, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v21

    new-instance v3, LJh/C;

    new-instance v5, LYg/k;

    const/4 v6, 0x2

    move-object/from16 v25, v4

    const/4 v4, 0x1

    invoke-direct {v5, v6, v4}, LYg/k;-><init>(II)V

    sget-object v4, LJh/O;->STRICT:LJh/O;

    invoke-direct {v3, v7, v5, v4}, LJh/C;-><init>(LJh/O;LYg/k;LJh/O;)V

    invoke-static {v0, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v22

    new-instance v0, LJh/C;

    new-instance v3, LYg/k;

    const/4 v5, 0x1

    invoke-direct {v3, v6, v5}, LYg/k;-><init>(II)V

    invoke-direct {v0, v7, v3, v4}, LJh/C;-><init>(LJh/O;LYg/k;LJh/O;)V

    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v23

    new-instance v0, LJh/C;

    new-instance v1, LYg/k;

    const/16 v3, 0x8

    invoke-direct {v1, v5, v3}, LYg/k;-><init>(II)V

    invoke-direct {v0, v7, v1, v4}, LJh/C;-><init>(LJh/O;LYg/k;LJh/O;)V

    invoke-static {v2, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v24

    filled-new-array/range {v8 .. v24}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-direct {v1, v0}, LJh/M;-><init>(Ljava/util/Map;)V

    sput-object v1, LJh/B;->g:LJh/K;

    new-instance v0, LJh/C;

    const/16 v23, 0x4

    const/16 v24, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v0

    move-object/from16 v20, v7

    invoke-direct/range {v19 .. v24}, LJh/C;-><init>(LJh/O;LYg/k;LJh/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJh/B;->h:LJh/C;

    return-void
.end method

.method public static final a(LYg/k;)LJh/G;
    .locals 6

    const-string v0, "configuredKotlinVersion"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/B;->h:LJh/C;

    invoke-virtual {v0}, LJh/C;->d()LYg/k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LJh/C;->d()LYg/k;

    move-result-object v1

    invoke-virtual {v1, p0}, LYg/k;->a(LYg/k;)I

    move-result p0

    if-gtz p0, :cond_0

    invoke-virtual {v0}, LJh/C;->b()LJh/O;

    move-result-object p0

    :goto_0
    move-object v1, p0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, LJh/C;->c()LJh/O;

    move-result-object p0

    goto :goto_0

    :goto_1
    invoke-static {v1}, LJh/B;->c(LJh/O;)LJh/O;

    move-result-object v2

    new-instance p0, LJh/G;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LJh/G;-><init>(LJh/O;LJh/O;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public static synthetic b(LYg/k;ILjava/lang/Object;)LJh/G;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    sget-object p0, LYg/k;->f:LYg/k;

    :cond_0
    invoke-static {p0}, LJh/B;->a(LYg/k;)LJh/G;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LJh/O;)LJh/O;
    .locals 1

    const-string v0, "globalReportLevel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/O;->WARN:LJh/O;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method

.method public static final d(LZh/c;)LJh/O;
    .locals 3

    const-string v0, "annotationFqName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/K;->a:LJh/K$a;

    invoke-virtual {v0}, LJh/K$a;->a()LJh/K;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p0, v0, v1, v2, v1}, LJh/B;->h(LZh/c;LJh/K;LYg/k;ILjava/lang/Object;)LJh/O;

    move-result-object p0

    return-object p0
.end method

.method public static final e()LZh/c;
    .locals 1

    sget-object v0, LJh/B;->b:LZh/c;

    return-object v0
.end method

.method public static final f()[LZh/c;
    .locals 1

    sget-object v0, LJh/B;->f:[LZh/c;

    return-object v0
.end method

.method public static final g(LZh/c;LJh/K;LYg/k;)LJh/O;
    .locals 1

    const-string v0, "annotation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuredReportLevels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuredKotlinVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, LJh/K;->a(LZh/c;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJh/O;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LJh/B;->g:LJh/K;

    invoke-interface {p1, p0}, LJh/K;->a(LZh/c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJh/C;

    if-nez p0, :cond_1

    sget-object p0, LJh/O;->IGNORE:LJh/O;

    return-object p0

    :cond_1
    invoke-virtual {p0}, LJh/C;->d()LYg/k;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LJh/C;->d()LYg/k;

    move-result-object p1

    invoke-virtual {p1, p2}, LYg/k;->a(LYg/k;)I

    move-result p1

    if-gtz p1, :cond_2

    invoke-virtual {p0}, LJh/C;->b()LJh/O;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LJh/C;->c()LJh/O;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static synthetic h(LZh/c;LJh/K;LYg/k;ILjava/lang/Object;)LJh/O;
    .locals 1

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    new-instance p2, LYg/k;

    const/4 p3, 0x7

    const/16 p4, 0x14

    const/4 v0, 0x1

    invoke-direct {p2, v0, p3, p4}, LYg/k;-><init>(III)V

    :cond_0
    invoke-static {p0, p1, p2}, LJh/B;->g(LZh/c;LJh/K;LYg/k;)LJh/O;

    move-result-object p0

    return-object p0
.end method
