.class public final LBh/L;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBh/L$a;,
        LBh/L$b;
    }
.end annotation


# instance fields
.field private final a:Loi/n;

.field private final b:LBh/G;

.field private final c:Loi/g;

.field private final d:Loi/g;


# direct methods
.method public constructor <init>(Loi/n;LBh/G;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBh/L;->a:Loi/n;

    iput-object p2, p0, LBh/L;->b:LBh/G;

    new-instance p2, LBh/J;

    invoke-direct {p2, p0}, LBh/J;-><init>(LBh/L;)V

    invoke-interface {p1, p2}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p2

    iput-object p2, p0, LBh/L;->c:Loi/g;

    new-instance p2, LBh/K;

    invoke-direct {p2, p0}, LBh/K;-><init>(LBh/L;)V

    invoke-interface {p1, p2}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p1

    iput-object p1, p0, LBh/L;->d:Loi/g;

    return-void
.end method

.method static synthetic a(LBh/L;LZh/c;)LBh/M;
    .locals 0

    invoke-static {p0, p1}, LBh/L;->e(LBh/L;LZh/c;)LBh/M;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(LBh/L;LBh/L$a;)LBh/e;
    .locals 0

    invoke-static {p0, p1}, LBh/L;->c(LBh/L;LBh/L$a;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LBh/L;LBh/L$a;)LBh/e;
    .locals 8

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LBh/L$a;->a()LZh/b;

    move-result-object v0

    invoke-virtual {p1}, LBh/L$a;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, LZh/b;->i()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, LZh/b;->e()LZh/b;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    const/4 v3, 0x1

    invoke-static {v2, v3}, LZg/v;->h0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, LBh/L;->d(LZh/b;Ljava/util/List;)LBh/e;

    move-result-object v1

    if-eqz v1, :cond_0

    :goto_0
    move-object v4, v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, LBh/L;->c:Loi/g;

    invoke-virtual {v0}, LZh/b;->f()LZh/c;

    move-result-object v2

    invoke-interface {v1, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/g;

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, LZh/b;->j()Z

    move-result v6

    new-instance v1, LBh/L$b;

    iget-object v3, p0, LBh/L;->a:Loi/n;

    invoke-virtual {v0}, LZh/b;->h()LZh/f;

    move-result-object v5

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    :goto_2
    move v7, p0

    goto :goto_3

    :cond_1
    const/4 p0, 0x0

    goto :goto_2

    :goto_3
    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LBh/L$b;-><init>(Loi/n;LBh/m;LZh/f;ZI)V

    return-object v1

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unresolved local class: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final e(LBh/L;LZh/c;)LBh/M;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDh/p;

    iget-object p0, p0, LBh/L;->b:LBh/G;

    invoke-direct {v0, p0, p1}, LDh/p;-><init>(LBh/G;LZh/c;)V

    return-object v0
.end method


# virtual methods
.method public final d(LZh/b;Ljava/util/List;)LBh/e;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParametersCount"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LBh/L;->d:Loi/g;

    new-instance v1, LBh/L$a;

    invoke-direct {v1, p1, p2}, LBh/L$a;-><init>(LZh/b;Ljava/util/List;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/e;

    return-object p1
.end method
