.class public final LSh/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSh/n$a;
    }
.end annotation


# static fields
.field public static final b:LSh/n$a;

.field private static final c:Ljava/util/Set;

.field private static final d:Ljava/util/Set;

.field private static final e:LYh/e;

.field private static final f:LYh/e;

.field private static final g:LYh/e;


# instance fields
.field public a:Lli/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LSh/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSh/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSh/n;->b:LSh/n$a;

    sget-object v0, LTh/a$a;->CLASS:LTh/a$a;

    invoke-static {v0}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LSh/n;->c:Ljava/util/Set;

    sget-object v0, LTh/a$a;->FILE_FACADE:LTh/a$a;

    sget-object v1, LTh/a$a;->MULTIFILE_CLASS_PART:LTh/a$a;

    filled-new-array {v0, v1}, [LTh/a$a;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LSh/n;->d:Ljava/util/Set;

    new-instance v0, LYh/e;

    const/4 v1, 0x2

    const/4 v2, 0x1

    filled-new-array {v2, v2, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1}, LYh/e;-><init>([I)V

    sput-object v0, LSh/n;->e:LYh/e;

    new-instance v0, LYh/e;

    const/16 v1, 0xb

    filled-new-array {v2, v2, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1}, LYh/e;-><init>([I)V

    sput-object v0, LSh/n;->f:LYh/e;

    new-instance v0, LYh/e;

    const/16 v1, 0xd

    filled-new-array {v2, v2, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1}, LYh/e;-><init>([I)V

    sput-object v0, LSh/n;->g:LYh/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()LYh/e;
    .locals 1

    sget-object v0, LSh/n;->g:LYh/e;

    return-object v0
.end method

.method static synthetic b()Ljava/util/Collection;
    .locals 1

    invoke-static {}, LSh/n;->d()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method private static final d()Ljava/util/Collection;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method private final e(LSh/x;)Lni/r;
    .locals 1

    invoke-virtual {p0}, LSh/n;->f()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->g()Lli/o;

    move-result-object v0

    invoke-interface {v0}, Lli/o;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lni/r;->STABLE:Lni/r;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object p1

    invoke-virtual {p1}, LTh/a;->j()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lni/r;->UNSTABLE:Lni/r;

    goto :goto_0

    :cond_1
    sget-object p1, Lni/r;->STABLE:Lni/r;

    :goto_0
    return-object p1
.end method

.method private final g(LSh/x;)Lli/y;
    .locals 8

    invoke-direct {p0}, LSh/n;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object v0

    invoke-virtual {v0}, LTh/a;->d()LYh/e;

    move-result-object v0

    invoke-direct {p0}, LSh/n;->h()LYh/e;

    move-result-object v1

    invoke-virtual {v0, v1}, LYh/e;->h(LYh/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lli/y;

    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object v1

    invoke-virtual {v1}, LTh/a;->d()LYh/e;

    move-result-object v2

    sget-object v3, LYh/e;->i:LYh/e;

    invoke-direct {p0}, LSh/n;->h()LYh/e;

    move-result-object v4

    invoke-direct {p0}, LSh/n;->h()LYh/e;

    move-result-object v1

    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object v5

    invoke-virtual {v5}, LTh/a;->d()LYh/e;

    move-result-object v5

    invoke-virtual {v5}, LYh/e;->j()Z

    move-result v5

    invoke-virtual {v1, v5}, LYh/e;->k(Z)LYh/e;

    move-result-object v5

    invoke-interface {p1}, LSh/x;->getLocation()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p1}, LSh/x;->b()LZh/b;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lli/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LZh/b;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final h()LYh/e;
    .locals 1

    invoke-virtual {p0}, LSh/n;->f()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->g()Lli/o;

    move-result-object v0

    invoke-static {v0}, Lxi/c;->a(Lli/o;)LYh/e;

    move-result-object v0

    return-object v0
.end method

.method private final i()Z
    .locals 1

    invoke-virtual {p0}, LSh/n;->f()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->g()Lli/o;

    move-result-object v0

    invoke-interface {v0}, Lli/o;->e()Z

    move-result v0

    return v0
.end method

.method private final j(LSh/x;)Z
    .locals 1

    invoke-virtual {p0}, LSh/n;->f()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->g()Lli/o;

    move-result-object v0

    invoke-interface {v0}, Lli/o;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object v0

    invoke-virtual {v0}, LTh/a;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object p1

    invoke-virtual {p1}, LTh/a;->d()LYh/e;

    move-result-object p1

    sget-object v0, LSh/n;->f:LYh/e;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final k(LSh/x;)Z
    .locals 2

    invoke-virtual {p0}, LSh/n;->f()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->g()Lli/o;

    move-result-object v0

    invoke-interface {v0}, Lli/o;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object v0

    invoke-virtual {v0}, LTh/a;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object v0

    invoke-virtual {v0}, LTh/a;->d()LYh/e;

    move-result-object v0

    sget-object v1, LSh/n;->e:LYh/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-direct {p0, p1}, LSh/n;->j(LSh/x;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final m(LSh/x;Ljava/util/Set;)[Ljava/lang/String;
    .locals 2

    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object p1

    invoke-virtual {p1}, LTh/a;->a()[Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LTh/a;->b()[Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LTh/a;->c()LTh/a$a;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    return-object v0
.end method


# virtual methods
.method public final c(LBh/M;LSh/x;)Lii/k;
    .locals 12

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSh/n;->d:Ljava/util/Set;

    invoke-direct {p0, p2, v0}, LSh/n;->m(LSh/x;Ljava/util/Set;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p2}, LSh/x;->a()LTh/a;

    move-result-object v2

    invoke-virtual {v2}, LTh/a;->g()[Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    :try_start_0
    invoke-static {v0, v2}, LYh/i;->m([Ljava/lang/String;[Ljava/lang/String;)LYg/s;

    move-result-object v0
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not read data from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, LSh/x;->getLocation()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-direct {p0}, LSh/n;->i()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-interface {p2}, LSh/x;->a()LTh/a;

    move-result-object v2

    invoke-virtual {v2}, LTh/a;->d()LYh/e;

    move-result-object v2

    invoke-direct {p0}, LSh/n;->h()LYh/e;

    move-result-object v3

    invoke-virtual {v2, v3}, LYh/e;->h(LYh/e;)Z

    move-result v2

    if-nez v2, :cond_3

    move-object v0, v1

    :goto_1
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYh/f;

    invoke-virtual {v0}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUh/l;

    new-instance v9, LSh/r;

    invoke-direct {p0, p2}, LSh/n;->g(LSh/x;)Lli/y;

    move-result-object v6

    invoke-direct {p0, p2}, LSh/n;->k(LSh/x;)Z

    move-result v7

    invoke-direct {p0, p2}, LSh/n;->e(LSh/x;)Lni/r;

    move-result-object v8

    move-object v2, v9

    move-object v3, p2

    move-object v4, v0

    move-object v5, v1

    invoke-direct/range {v2 .. v8}, LSh/r;-><init>(LSh/x;LUh/l;LWh/c;Lli/y;ZLni/r;)V

    new-instance v11, Lni/M;

    invoke-interface {p2}, LSh/x;->a()LTh/a;

    move-result-object p2

    invoke-virtual {p2}, LTh/a;->d()LYh/e;

    move-result-object v6

    invoke-virtual {p0}, LSh/n;->f()Lli/n;

    move-result-object v8

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "scope for "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " in "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v10, LSh/m;->a:LSh/m;

    move-object v2, v11

    move-object v3, p1

    move-object v7, v9

    move-object v9, p2

    invoke-direct/range {v2 .. v10}, Lni/M;-><init>(LBh/M;LUh/l;LWh/c;LWh/a;Lni/s;Lli/n;Ljava/lang/String;Lmh/a;)V

    return-object v11

    :cond_3
    throw v0
.end method

.method public final f()Lli/n;
    .locals 1

    iget-object v0, p0, LSh/n;->a:Lli/n;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "components"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l(LSh/x;)Lli/i;
    .locals 6

    const-string v0, "kotlinClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSh/n;->c:Ljava/util/Set;

    invoke-direct {p0, p1, v0}, LSh/n;->m(LSh/x;Ljava/util/Set;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object v2

    invoke-virtual {v2}, LTh/a;->g()[Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    :try_start_0
    invoke-static {v0, v2}, LYh/i;->i([Ljava/lang/String;[Ljava/lang/String;)LYg/s;

    move-result-object v0
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not read data from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LSh/x;->getLocation()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-direct {p0}, LSh/n;->i()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object v2

    invoke-virtual {v2}, LTh/a;->d()LYh/e;

    move-result-object v2

    invoke-direct {p0}, LSh/n;->h()LYh/e;

    move-result-object v3

    invoke-virtual {v2, v3}, LYh/e;->h(LYh/e;)Z

    move-result v2

    if-nez v2, :cond_3

    move-object v0, v1

    :goto_1
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYh/f;

    invoke-virtual {v0}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUh/c;

    new-instance v2, LSh/z;

    invoke-direct {p0, p1}, LSh/n;->g(LSh/x;)Lli/y;

    move-result-object v3

    invoke-direct {p0, p1}, LSh/n;->k(LSh/x;)Z

    move-result v4

    invoke-direct {p0, p1}, LSh/n;->e(LSh/x;)Lni/r;

    move-result-object v5

    invoke-direct {v2, p1, v3, v4, v5}, LSh/z;-><init>(LSh/x;Lli/y;ZLni/r;)V

    new-instance v3, Lli/i;

    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object p1

    invoke-virtual {p1}, LTh/a;->d()LYh/e;

    move-result-object p1

    invoke-direct {v3, v1, v0, p1, v2}, Lli/i;-><init>(LWh/c;LUh/c;LWh/a;LBh/g0;)V

    return-object v3

    :cond_3
    throw v0
.end method

.method public final n(LSh/x;)LBh/e;
    .locals 2

    const-string v0, "kotlinClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LSh/n;->l(LSh/x;)Lli/i;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, LSh/n;->f()Lli/n;

    move-result-object v1

    invoke-virtual {v1}, Lli/n;->f()Lli/l;

    move-result-object v1

    invoke-interface {p1}, LSh/x;->b()LZh/b;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lli/l;->e(LZh/b;Lli/i;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public final o(LSh/k;)V
    .locals 1

    const-string v0, "components"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LSh/k;->a()Lli/n;

    move-result-object p1

    invoke-virtual {p0, p1}, LSh/n;->p(Lli/n;)V

    return-void
.end method

.method public final p(Lli/n;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LSh/n;->a:Lli/n;

    return-void
.end method
