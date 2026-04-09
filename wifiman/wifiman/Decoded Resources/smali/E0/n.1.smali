.class public final LE0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z

.field private final b:LYg/m;

.field private final c:Ljava/util/Comparator;

.field private final d:LE0/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LE0/n;->a:Z

    sget-object p1, LYg/q;->NONE:LYg/q;

    sget-object v0, LE0/n$b;->a:LE0/n$b;

    invoke-static {p1, v0}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE0/n;->b:LYg/m;

    new-instance p1, LE0/n$a;

    invoke-direct {p1}, LE0/n$a;-><init>()V

    iput-object p1, p0, LE0/n;->c:Ljava/util/Comparator;

    new-instance v0, LE0/C0;

    invoke-direct {v0, p1}, LE0/C0;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, LE0/n;->d:LE0/C0;

    return-void
.end method

.method private final c()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LE0/n;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public final a(LE0/G;)V
    .locals 2

    invoke-virtual {p1}, LE0/G;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "DepthSortedSet.add called on an unattached node"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, LE0/n;->a:Z

    if-eqz v0, :cond_3

    invoke-direct {p0}, LE0/n;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    invoke-direct {p0}, LE0/n;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, LE0/G;->L()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LE0/G;->L()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    const-string v0, "invalid node depth"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_3
    :goto_1
    iget-object v0, p0, LE0/n;->d:LE0/C0;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(LE0/G;)Z
    .locals 2

    iget-object v0, p0, LE0/n;->d:LE0/C0;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    iget-boolean v1, p0, LE0/n;->a:Z

    if-eqz v1, :cond_1

    invoke-direct {p0}, LE0/n;->c()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "inconsistency in TreeSet"

    invoke-static {p1}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    return v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, LE0/n;->d:LE0/C0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final e()LE0/G;
    .locals 1

    iget-object v0, p0, LE0/n;->d:LE0/C0;

    invoke-virtual {v0}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE0/G;

    invoke-virtual {p0, v0}, LE0/n;->f(LE0/G;)Z

    return-object v0
.end method

.method public final f(LE0/G;)Z
    .locals 2

    invoke-virtual {p1}, LE0/G;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "DepthSortedSet.remove called on an unattached node"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE0/n;->d:LE0/C0;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-result v0

    iget-boolean v1, p0, LE0/n;->a:Z

    if-eqz v1, :cond_2

    invoke-direct {p0}, LE0/n;->c()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LE0/G;->L()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "invalid node depth"

    invoke-static {p1}, LB0/a;->b(Ljava/lang/String;)V

    :cond_2
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LE0/n;->d:LE0/C0;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
