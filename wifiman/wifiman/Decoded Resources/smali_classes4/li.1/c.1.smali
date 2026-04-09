.class public abstract Lli/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBh/T;


# instance fields
.field private final a:Loi/n;

.field private final b:Lli/A;

.field private final c:LBh/G;

.field protected d:Lli/n;

.field private final e:Loi/h;


# direct methods
.method public constructor <init>(Loi/n;Lli/A;LBh/G;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/c;->a:Loi/n;

    iput-object p2, p0, Lli/c;->b:Lli/A;

    iput-object p3, p0, Lli/c;->c:LBh/G;

    new-instance p2, Lli/b;

    invoke-direct {p2, p0}, Lli/b;-><init>(Lli/c;)V

    invoke-interface {p1, p2}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p1

    iput-object p1, p0, Lli/c;->e:Loi/h;

    return-void
.end method

.method static synthetic d(Lli/c;LZh/c;)LBh/M;
    .locals 0

    invoke-static {p0, p1}, Lli/c;->f(Lli/c;LZh/c;)LBh/M;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lli/c;LZh/c;)LBh/M;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lli/c;->e(LZh/c;)Lli/r;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lli/c;->g()Lli/n;

    move-result-object p0

    invoke-virtual {p1, p0}, Lli/r;->L0(Lli/n;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(LZh/c;Ljava/util/Collection;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lli/c;->e:Loi/h;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    return-void
.end method

.method public b(LZh/c;)Z
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lli/c;->e:Loi/h;

    invoke-interface {v0, p1}, Loi/h;->C(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lli/c;->e:Loi/h;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/M;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lli/c;->e(LZh/c;)Lli/r;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public c(LZh/c;)Ljava/util/List;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lli/c;->e:Loi/h;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LZg/v;->p(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected abstract e(LZh/c;)Lli/r;
.end method

.method protected final g()Lli/n;
    .locals 1

    iget-object v0, p0, Lli/c;->d:Lli/n;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "components"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method protected final h()Lli/A;
    .locals 1

    iget-object v0, p0, Lli/c;->b:Lli/A;

    return-object v0
.end method

.method protected final i()LBh/G;
    .locals 1

    iget-object v0, p0, Lli/c;->c:LBh/G;

    return-object v0
.end method

.method protected final j()Loi/n;
    .locals 1

    iget-object v0, p0, Lli/c;->a:Loi/n;

    return-object v0
.end method

.method protected final k(Lli/n;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lli/c;->d:Lli/n;

    return-void
.end method

.method public s(LZh/c;Lmh/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method
