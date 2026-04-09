.class public abstract Lf2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/n$a;,
        Lf2/n$b;,
        Lf2/n$c;
    }
.end annotation


# static fields
.field public static final H:Lf2/n$a;

.field private static I:Z


# instance fields
.field private A:Lmh/l;

.field private final B:Ljava/util/Map;

.field private C:I

.field private final D:Ljava/util/List;

.field private final E:LYg/m;

.field private final F:LLi/y;

.field private final G:LLi/g;

.field private final a:Landroid/content/Context;

.field private b:Landroid/app/Activity;

.field private c:Lf2/x;

.field private d:Lf2/t;

.field private e:Landroid/os/Bundle;

.field private f:[Landroid/os/Parcelable;

.field private g:Z

.field private final h:LZg/m;

.field private final i:LLi/z;

.field private final j:LLi/N;

.field private final k:LLi/z;

.field private final l:LLi/N;

.field private final m:Ljava/util/Map;

.field private final n:Ljava/util/Map;

.field private final o:Ljava/util/Map;

.field private final p:Ljava/util/Map;

.field private q:Landroidx/lifecycle/o;

.field private r:Lf2/o;

.field private final s:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private t:Landroidx/lifecycle/k$b;

.field private final u:Landroidx/lifecycle/n;

.field private final v:Lc/F;

.field private w:Z

.field private x:Lf2/E;

.field private final y:Ljava/util/Map;

.field private z:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf2/n;->H:Lf2/n$a;

    const/4 v0, 0x1

    sput-boolean v0, Lf2/n;->I:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/n;->a:Landroid/content/Context;

    sget-object v0, Lf2/n$d;->a:Lf2/n$d;

    invoke-static {p1, v0}, Lzi/m;->n(Ljava/lang/Object;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    instance-of v2, v2, Landroid/app/Activity;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lf2/n;->b:Landroid/app/Activity;

    new-instance p1, LZg/m;

    invoke-direct {p1}, LZg/m;-><init>()V

    iput-object p1, p0, Lf2/n;->h:LZg/m;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lf2/n;->i:LLi/z;

    invoke-static {p1}, LLi/i;->b(LLi/z;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lf2/n;->j:LLi/N;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lf2/n;->k:LLi/z;

    invoke-static {p1}, LLi/i;->b(LLi/z;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lf2/n;->l:LLi/N;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lf2/n;->m:Ljava/util/Map;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lf2/n;->n:Ljava/util/Map;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lf2/n;->o:Ljava/util/Map;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lf2/n;->p:Ljava/util/Map;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lf2/n;->s:Ljava/util/concurrent/CopyOnWriteArrayList;

    sget-object p1, Landroidx/lifecycle/k$b;->INITIALIZED:Landroidx/lifecycle/k$b;

    iput-object p1, p0, Lf2/n;->t:Landroidx/lifecycle/k$b;

    new-instance p1, Lf2/m;

    invoke-direct {p1, p0}, Lf2/m;-><init>(Lf2/n;)V

    iput-object p1, p0, Lf2/n;->u:Landroidx/lifecycle/n;

    new-instance p1, Lf2/n$p;

    invoke-direct {p1, p0}, Lf2/n$p;-><init>(Lf2/n;)V

    iput-object p1, p0, Lf2/n;->v:Lc/F;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lf2/n;->w:Z

    new-instance v0, Lf2/E;

    invoke-direct {v0}, Lf2/E;-><init>()V

    iput-object v0, p0, Lf2/n;->x:Lf2/E;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lf2/n;->y:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lf2/n;->B:Ljava/util/Map;

    iget-object v0, p0, Lf2/n;->x:Lf2/E;

    new-instance v2, Lf2/v;

    invoke-direct {v2, v0}, Lf2/v;-><init>(Lf2/E;)V

    invoke-virtual {v0, v2}, Lf2/E;->b(Lf2/D;)Lf2/D;

    iget-object v0, p0, Lf2/n;->x:Lf2/E;

    new-instance v2, Lf2/a;

    iget-object v3, p0, Lf2/n;->a:Landroid/content/Context;

    invoke-direct {v2, v3}, Lf2/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Lf2/E;->b(Lf2/D;)Lf2/D;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf2/n;->D:Ljava/util/List;

    new-instance v0, Lf2/n$n;

    invoke-direct {v0, p0}, Lf2/n$n;-><init>(Lf2/n;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lf2/n;->E:LYg/m;

    sget-object v0, LKi/a;->DROP_OLDEST:LKi/a;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v3, v0, v2, v1}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p1

    iput-object p1, p0, Lf2/n;->F:LLi/y;

    invoke-static {p1}, LLi/i;->a(LLi/y;)LLi/D;

    move-result-object p1

    iput-object p1, p0, Lf2/n;->G:LLi/g;

    return-void
.end method

.method public static synthetic A(Lf2/n;Lf2/r;IZLf2/r;ILjava/lang/Object;)Lf2/r;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lf2/n;->z(Lf2/r;IZLf2/r;)Lf2/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: findDestinationComprehensive"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final B([I)Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lf2/n;->d:Lf2/t;

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_5

    aget v4, p1, v2

    if-nez v2, :cond_0

    iget-object v5, p0, Lf2/n;->d:Lf2/t;

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lf2/r;->s()I

    move-result v5

    if-ne v5, v4, :cond_1

    iget-object v3, p0, Lf2/n;->d:Lf2/t;

    goto :goto_1

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lf2/t;->N(I)Lf2/r;

    move-result-object v3

    :cond_1
    :goto_1
    if-nez v3, :cond_2

    sget-object p1, Lf2/r;->k:Lf2/r$a;

    iget-object v0, p0, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, v4}, Lf2/r$a;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    array-length v4, p1

    add-int/lit8 v4, v4, -0x1

    if-eq v2, v4, :cond_4

    instance-of v4, v3, Lf2/t;

    if-eqz v4, :cond_4

    check-cast v3, Lf2/t;

    :goto_2
    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lf2/t;->V()I

    move-result v0

    invoke-virtual {v3, v0}, Lf2/t;->N(I)Lf2/r;

    move-result-object v0

    instance-of v0, v0, Lf2/t;

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lf2/t;->V()I

    move-result v0

    invoke-virtual {v3, v0}, Lf2/t;->N(I)Lf2/r;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lf2/t;

    goto :goto_2

    :cond_3
    move-object v0, v3

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-object v3
.end method

.method private final C(Ljava/lang/Object;)Ljava/lang/String;
    .locals 8

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-static {v0}, LVi/w;->d(Lth/d;)LVi/b;

    move-result-object v0

    invoke-static {v0}, Lh2/c;->b(LVi/b;)I

    move-result v3

    invoke-virtual {p0}, Lf2/n;->I()Lf2/t;

    move-result-object v2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lf2/n;->A(Lf2/n;Lf2/r;IZLf2/r;ILjava/lang/Object;)Lf2/r;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lf2/r;->k()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, LZg/U;->d(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/h;

    invoke-virtual {v2}, Lf2/h;->a()Lf2/B;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Lh2/c;->c(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Destination with route "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object p1

    invoke-interface {p1}, Lth/d;->v()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be found in navigation graph "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lf2/n;->d:Lf2/t;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final H()I
    .locals 3

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/k;

    invoke-virtual {v2}, Lf2/k;->f()Lf2/r;

    move-result-object v2

    instance-of v2, v2, Lf2/t;

    if-nez v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    if-gez v1, :cond_1

    invoke-static {}, LZg/v;->u()V

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method private final M(LZg/m;)Lf2/t;
    .locals 1

    invoke-virtual {p1}, LZg/m;->T()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/k;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lf2/k;->f()Lf2/r;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Lf2/n;->d:Lf2/t;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_1
    instance-of v0, p1, Lf2/t;

    if-eqz v0, :cond_2

    check-cast p1, Lf2/t;

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lf2/r;->v()Lf2/t;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method private final P(LZg/m;)Ljava/util/List;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v1}, LZg/m;->T()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lf2/k;->f()Lf2/r;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lf2/n;->I()Lf2/t;

    move-result-object v1

    :cond_1
    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lf2/l;

    invoke-virtual {v9}, Lf2/l;->a()I

    move-result v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, v1

    invoke-static/range {v2 .. v8}, Lf2/n;->A(Lf2/n;Lf2/r;IZLf2/r;ILjava/lang/Object;)Lf2/r;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, p0, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual {p0}, Lf2/n;->J()Landroidx/lifecycle/k$b;

    move-result-object v3

    iget-object v4, p0, Lf2/n;->r:Lf2/o;

    invoke-virtual {v9, v1, v2, v3, v4}, Lf2/l;->c(Landroid/content/Context;Lf2/r;Landroidx/lifecycle/k$b;Lf2/o;)Lf2/k;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v1, v2

    goto :goto_0

    :cond_2
    sget-object p1, Lf2/r;->k:Lf2/r$a;

    iget-object v0, p0, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual {v9}, Lf2/l;->a()I

    move-result v2

    invoke-virtual {p1, v0, v2}, Lf2/r$a;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Restore State failed: destination "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be found from the current destination "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return-object v0
.end method

.method private final Q(Lf2/r;Landroid/os/Bundle;)Z
    .locals 5

    invoke-virtual {p0}, Lf2/n;->F()Lf2/k;

    move-result-object v0

    iget-object v1, p0, Lf2/n;->h:LZg/m;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/k;

    invoke-virtual {v2}, Lf2/k;->f()Lf2/r;

    move-result-object v2

    if-ne v2, p1, :cond_0

    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    move-result v1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    const/4 v2, 0x0

    if-ne v1, v3, :cond_2

    return v2

    :cond_2
    instance-of v3, p1, Lf2/t;

    if-eqz v3, :cond_5

    sget-object v0, Lf2/t;->q:Lf2/t$a;

    check-cast p1, Lf2/t;

    invoke-virtual {v0, p1}, Lf2/t$a;->a(Lf2/t;)Lzi/j;

    move-result-object p1

    sget-object v0, Lf2/n$m;->a:Lf2/n$m;

    invoke-static {p1, v0}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/h;->size()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-eq v0, v3, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/h;->size()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Ljava/util/AbstractList;->subList(II)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf2/k;

    invoke-virtual {v4}, Lf2/k;->f()Lf2/r;

    move-result-object v4

    invoke-virtual {v4}, Lf2/r;->s()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_5
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Lf2/r;->s()I

    move-result p1

    invoke-virtual {v0}, Lf2/r;->s()I

    move-result v0

    if-ne p1, v0, :cond_b

    :cond_6
    new-instance p1, LZg/m;

    invoke-direct {p1}, LZg/m;-><init>()V

    :goto_2
    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-static {v0}, LZg/v;->n(Ljava/util/List;)I

    move-result v0

    if-lt v0, v1, :cond_7

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-static {v0}, LZg/v;->N(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {p0, v0}, Lf2/n;->u0(Lf2/k;)Lf2/k;

    new-instance v2, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v3

    invoke-virtual {v3, p2}, Lf2/r;->g(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lf2/k;-><init>(Lf2/k;Landroid/os/Bundle;)V

    invoke-virtual {p1, v2}, LZg/m;->addFirst(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v1

    invoke-virtual {v1}, Lf2/r;->v()Lf2/t;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lf2/r;->s()I

    move-result v1

    invoke-virtual {p0, v1}, Lf2/n;->D(I)Lf2/k;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lf2/n;->S(Lf2/k;Lf2/k;)V

    :cond_8
    iget-object v1, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v1, v0}, LZg/m;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lf2/k;

    iget-object v0, p0, Lf2/n;->x:Lf2/E;

    invoke-virtual {p2}, Lf2/k;->f()Lf2/r;

    move-result-object v1

    invoke-virtual {v1}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v0

    invoke-virtual {v0, p2}, Lf2/D;->g(Lf2/k;)V

    goto :goto_4

    :cond_a
    const/4 p1, 0x1

    return p1

    :cond_b
    return v2
.end method

.method private static final R(Lf2/n;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/lifecycle/k$a;->getTargetState()Landroidx/lifecycle/k$b;

    move-result-object p1

    iput-object p1, p0, Lf2/n;->t:Landroidx/lifecycle/k$b;

    iget-object p1, p0, Lf2/n;->d:Lf2/t;

    if-eqz p1, :cond_0

    iget-object p0, p0, Lf2/n;->h:LZg/m;

    invoke-static {p0}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/k;

    invoke-virtual {p1, p2}, Lf2/k;->l(Landroidx/lifecycle/k$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final S(Lf2/k;Lf2/k;)V
    .locals 2

    iget-object v0, p0, Lf2/n;->m:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lf2/n;->n:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lf2/n;->n:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p0, Lf2/n;->n:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method private final T(Lf2/r;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)V
    .locals 21

    move-object/from16 v6, p0

    move-object/from16 v3, p3

    iget-object v0, v6, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/n$b;

    invoke-virtual {v1, v2}, Lf2/F;->l(Z)V

    goto :goto_0

    :cond_0
    new-instance v7, Lkotlin/jvm/internal/J;

    invoke-direct {v7}, Lkotlin/jvm/internal/J;-><init>()V

    const/4 v8, 0x0

    if-eqz v3, :cond_4

    invoke-virtual/range {p3 .. p3}, Lf2/y;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p3 .. p3}, Lf2/y;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {p3 .. p3}, Lf2/y;->i()Z

    move-result v1

    invoke-virtual/range {p3 .. p3}, Lf2/y;->k()Z

    move-result v4

    invoke-direct {v6, v0, v1, v4}, Lf2/n;->i0(Ljava/lang/String;ZZ)Z

    move-result v0

    :goto_1
    move v9, v0

    goto :goto_2

    :cond_1
    invoke-virtual/range {p3 .. p3}, Lf2/y;->g()Lth/d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p3 .. p3}, Lf2/y;->g()Lth/d;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, LVi/w;->d(Lth/d;)LVi/b;

    move-result-object v0

    invoke-static {v0}, Lh2/c;->b(LVi/b;)I

    move-result v0

    invoke-virtual/range {p3 .. p3}, Lf2/y;->i()Z

    move-result v1

    invoke-virtual/range {p3 .. p3}, Lf2/y;->k()Z

    move-result v4

    invoke-direct {v6, v0, v1, v4}, Lf2/n;->g0(IZZ)Z

    move-result v0

    goto :goto_1

    :cond_2
    invoke-virtual/range {p3 .. p3}, Lf2/y;->h()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p3 .. p3}, Lf2/y;->h()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {p3 .. p3}, Lf2/y;->i()Z

    move-result v1

    invoke-virtual/range {p3 .. p3}, Lf2/y;->k()Z

    move-result v4

    invoke-direct {v6, v0, v1, v4}, Lf2/n;->h0(Ljava/lang/Object;ZZ)Z

    move-result v0

    goto :goto_1

    :cond_3
    invoke-virtual/range {p3 .. p3}, Lf2/y;->e()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    invoke-virtual/range {p3 .. p3}, Lf2/y;->e()I

    move-result v0

    invoke-virtual/range {p3 .. p3}, Lf2/y;->i()Z

    move-result v1

    invoke-virtual/range {p3 .. p3}, Lf2/y;->k()Z

    move-result v4

    invoke-direct {v6, v0, v1, v4}, Lf2/n;->g0(IZZ)Z

    move-result v0

    goto :goto_1

    :cond_4
    move v9, v8

    :goto_2
    invoke-virtual/range {p1 .. p2}, Lf2/r;->g(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v3, :cond_5

    invoke-virtual/range {p3 .. p3}, Lf2/y;->l()Z

    move-result v1

    if-ne v1, v2, :cond_5

    iget-object v1, v6, Lf2/n;->o:Ljava/util/Map;

    invoke-virtual/range {p1 .. p1}, Lf2/r;->s()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual/range {p1 .. p1}, Lf2/r;->s()I

    move-result v1

    move-object/from16 v4, p4

    invoke-direct {v6, v1, v0, v3, v4}, Lf2/n;->o0(ILandroid/os/Bundle;Lf2/y;Lf2/D$a;)Z

    move-result v0

    iput-boolean v0, v7, Lkotlin/jvm/internal/J;->a:Z

    move/from16 v20, v8

    goto :goto_4

    :cond_5
    move-object/from16 v4, p4

    if-eqz v3, :cond_6

    invoke-virtual/range {p3 .. p3}, Lf2/y;->j()Z

    move-result v1

    if-ne v1, v2, :cond_6

    invoke-direct/range {p0 .. p2}, Lf2/n;->Q(Lf2/r;Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_6

    move/from16 v20, v2

    goto :goto_3

    :cond_6
    move/from16 v20, v8

    :goto_3
    if-nez v20, :cond_7

    sget-object v10, Lf2/k;->o:Lf2/k$a;

    iget-object v11, v6, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lf2/n;->J()Landroidx/lifecycle/k$b;

    move-result-object v14

    iget-object v15, v6, Lf2/n;->r:Lf2/o;

    const/16 v18, 0x60

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v12, p1

    move-object v13, v0

    invoke-static/range {v10 .. v19}, Lf2/k$a;->b(Lf2/k$a;Landroid/content/Context;Lf2/r;Landroid/os/Bundle;Landroidx/lifecycle/k$b;Lf2/C;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)Lf2/k;

    move-result-object v1

    iget-object v2, v6, Lf2/n;->x:Lf2/E;

    invoke-virtual/range {p1 .. p1}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v2

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v10, Lf2/n$o;

    move-object/from16 v1, p1

    invoke-direct {v10, v7, v6, v1, v0}, Lf2/n$o;-><init>(Lkotlin/jvm/internal/J;Lf2/n;Lf2/r;Landroid/os/Bundle;)V

    move-object/from16 v0, p0

    move-object v1, v2

    move-object v2, v5

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lf2/n;->X(Lf2/D;Ljava/util/List;Lf2/y;Lf2/D$a;Lmh/l;)V

    :cond_7
    :goto_4
    invoke-direct/range {p0 .. p0}, Lf2/n;->w0()V

    iget-object v0, v6, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/n$b;

    invoke-virtual {v1, v8}, Lf2/F;->l(Z)V

    goto :goto_5

    :cond_8
    if-nez v9, :cond_a

    iget-boolean v0, v7, Lkotlin/jvm/internal/J;->a:Z

    if-nez v0, :cond_a

    if-eqz v20, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lf2/n;->v0()V

    goto :goto_7

    :cond_a
    :goto_6
    invoke-direct/range {p0 .. p0}, Lf2/n;->t()Z

    :goto_7
    return-void
.end method

.method public static synthetic W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V
    .locals 1

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lf2/n;->U(Ljava/lang/String;Lf2/y;Lf2/D$a;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: navigate"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final X(Lf2/D;Ljava/util/List;Lf2/y;Lf2/D$a;Lmh/l;)V
    .locals 0

    iput-object p5, p0, Lf2/n;->z:Lmh/l;

    invoke-virtual {p1, p2, p3, p4}, Lf2/D;->e(Ljava/util/List;Lf2/y;Lf2/D$a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lf2/n;->z:Lmh/l;

    return-void
.end method

.method private final Y(Landroid/os/Bundle;)V
    .locals 9

    iget-object v0, p0, Lf2/n;->e:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v1, "android-support-nav:controller:navigatorState:names"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lf2/n;->x:Lf2/E;

    const-string v4, "name"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v3

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v3, v2}, Lf2/D;->h(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lf2/n;->f:[Landroid/os/Parcelable;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    array-length v2, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    aget-object v4, v0, v3

    const-string v5, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lf2/l;

    invoke-virtual {v4}, Lf2/l;->a()I

    move-result v5

    const/4 v6, 0x2

    invoke-static {p0, v5, v1, v6, v1}, Lf2/n;->y(Lf2/n;ILf2/r;ILjava/lang/Object;)Lf2/r;

    move-result-object v5

    if-eqz v5, :cond_4

    iget-object v6, p0, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual {p0}, Lf2/n;->J()Landroidx/lifecycle/k$b;

    move-result-object v7

    iget-object v8, p0, Lf2/n;->r:Lf2/o;

    invoke-virtual {v4, v6, v5, v7, v8}, Lf2/l;->c(Landroid/content/Context;Lf2/r;Landroidx/lifecycle/k$b;Lf2/o;)Lf2/k;

    move-result-object v4

    iget-object v6, p0, Lf2/n;->x:Lf2/E;

    invoke-virtual {v5}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v5

    iget-object v6, p0, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_2

    new-instance v7, Lf2/n$b;

    invoke-direct {v7, p0, v5}, Lf2/n$b;-><init>(Lf2/n;Lf2/D;)V

    invoke-interface {v6, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v7, Lf2/n$b;

    iget-object v5, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v5, v4}, LZg/m;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v4}, Lf2/n$b;->n(Lf2/k;)V

    invoke-virtual {v4}, Lf2/k;->f()Lf2/r;

    move-result-object v5

    invoke-virtual {v5}, Lf2/r;->v()Lf2/t;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lf2/r;->s()I

    move-result v5

    invoke-virtual {p0, v5}, Lf2/n;->D(I)Lf2/k;

    move-result-object v5

    invoke-direct {p0, v4, v5}, Lf2/n;->S(Lf2/k;Lf2/k;)V

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    sget-object p1, Lf2/r;->k:Lf2/r$a;

    iget-object v0, p0, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual {v4}, Lf2/l;->a()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lf2/r$a;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Restoring the Navigation back stack failed: destination "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be found from the current destination "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf2/n;->G()Lf2/r;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-direct {p0}, Lf2/n;->w0()V

    iput-object v1, p0, Lf2/n;->f:[Landroid/os/Parcelable;

    :cond_6
    iget-object v0, p0, Lf2/n;->x:Lf2/E;

    invoke-virtual {v0}, Lf2/E;->f()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lf2/D;

    invoke-virtual {v4}, Lf2/D;->c()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/D;

    iget-object v3, p0, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_9

    new-instance v4, Lf2/n$b;

    invoke-direct {v4, p0, v2}, Lf2/n$b;-><init>(Lf2/n;Lf2/D;)V

    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    check-cast v4, Lf2/n$b;

    invoke-virtual {v2, v4}, Lf2/D;->f(Lf2/F;)V

    goto :goto_3

    :cond_a
    iget-object v0, p0, Lf2/n;->d:Lf2/t;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Lf2/n;->g:Z

    if-nez v0, :cond_b

    iget-object v0, p0, Lf2/n;->b:Landroid/app/Activity;

    if-eqz v0, :cond_b

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf2/n;->O(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_4

    :cond_b
    iget-object v0, p0, Lf2/n;->d:Lf2/t;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v0, p1, v1, v1}, Lf2/n;->T(Lf2/r;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)V

    goto :goto_4

    :cond_c
    invoke-direct {p0}, Lf2/n;->t()Z

    :goto_4
    return-void
.end method

.method public static synthetic a(Lf2/n;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lf2/n;->R(Lf2/n;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public static final synthetic b(Lf2/n;Lf2/r;Landroid/os/Bundle;Lf2/k;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lf2/n;->p(Lf2/r;Landroid/os/Bundle;Lf2/k;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic c(Lf2/n;)Lmh/l;
    .locals 0

    iget-object p0, p0, Lf2/n;->z:Lmh/l;

    return-object p0
.end method

.method public static final synthetic d(Lf2/n;)LZg/m;
    .locals 0

    iget-object p0, p0, Lf2/n;->h:LZg/m;

    return-object p0
.end method

.method public static synthetic d0(Lf2/n;Ljava/lang/String;ZZILjava/lang/Object;)Z
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lf2/n;->c0(Ljava/lang/String;ZZ)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: popBackStack"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic e(Lf2/n;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lf2/n;->o:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic f()Z
    .locals 1

    sget-boolean v0, Lf2/n;->I:Z

    return v0
.end method

.method private final f0(Lf2/D;Lf2/k;ZLmh/l;)V
    .locals 0

    iput-object p4, p0, Lf2/n;->A:Lmh/l;

    invoke-virtual {p1, p2, p3}, Lf2/D;->j(Lf2/k;Z)V

    const/4 p1, 0x0

    iput-object p1, p0, Lf2/n;->A:Lmh/l;

    return-void
.end method

.method public static final synthetic g(Lf2/n;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lf2/n;->B:Ljava/util/Map;

    return-object p0
.end method

.method private final g0(IZZ)Z
    .locals 6

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lf2/n;->h:LZg/m;

    invoke-static {v2}, LZg/v;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/k;

    invoke-virtual {v3}, Lf2/k;->f()Lf2/r;

    move-result-object v3

    iget-object v4, p0, Lf2/n;->x:Lf2/E;

    invoke-virtual {v3}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v4

    if-nez p2, :cond_2

    invoke-virtual {v3}, Lf2/r;->s()I

    move-result v5

    if-eq v5, p1, :cond_3

    :cond_2
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {v3}, Lf2/r;->s()I

    move-result v4

    if-ne v4, p1, :cond_1

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_5

    sget-object p2, Lf2/r;->k:Lf2/r$a;

    iget-object p3, p0, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual {p2, p3, p1}, Lf2/r$a;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Ignoring popBackStack to destination "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as it was not found on the current back stack"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "NavController"

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_5
    invoke-direct {p0, v0, v3, p2, p3}, Lf2/n;->v(Ljava/util/List;Lf2/r;ZZ)Z

    move-result p1

    return p1
.end method

.method public static final synthetic h(Lf2/n;)Lf2/x;
    .locals 0

    iget-object p0, p0, Lf2/n;->c:Lf2/x;

    return-object p0
.end method

.method private final h0(Ljava/lang/Object;ZZ)Z
    .locals 0

    invoke-direct {p0, p1}, Lf2/n;->C(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lf2/n;->i0(Ljava/lang/String;ZZ)Z

    move-result p1

    return p1
.end method

.method public static final synthetic i(Lf2/n;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lf2/n;->y:Ljava/util/Map;

    return-object p0
.end method

.method private final i0(Ljava/lang/String;ZZ)Z
    .locals 8

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lf2/n;->h:LZg/m;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lf2/k;

    invoke-virtual {v5}, Lf2/k;->f()Lf2/r;

    move-result-object v6

    invoke-virtual {v5}, Lf2/k;->d()Landroid/os/Bundle;

    move-result-object v7

    invoke-virtual {v6, p1, v7}, Lf2/r;->y(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v6

    if-nez p2, :cond_2

    if-nez v6, :cond_3

    :cond_2
    iget-object v7, p0, Lf2/n;->x:Lf2/E;

    invoke-virtual {v5}, Lf2/k;->f()Lf2/r;

    move-result-object v5

    invoke-virtual {v5}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz v6, :cond_1

    goto :goto_0

    :cond_4
    move-object v3, v4

    :goto_0
    check-cast v3, Lf2/k;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lf2/k;->f()Lf2/r;

    move-result-object v4

    :cond_5
    if-nez v4, :cond_6

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Ignoring popBackStack to route "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as it was not found on the current back stack"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "NavController"

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_6
    invoke-direct {p0, v0, v4, p2, p3}, Lf2/n;->v(Ljava/util/List;Lf2/r;ZZ)Z

    move-result p1

    return p1
.end method

.method public static final synthetic j(Lf2/n;)Lmh/l;
    .locals 0

    iget-object p0, p0, Lf2/n;->A:Lmh/l;

    return-object p0
.end method

.method static synthetic j0(Lf2/n;IZZILjava/lang/Object;)Z
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lf2/n;->g0(IZZ)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: popBackStackInternal"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic k(Lf2/n;)Lf2/o;
    .locals 0

    iget-object p0, p0, Lf2/n;->r:Lf2/o;

    return-object p0
.end method

.method private final k0(Lf2/k;ZLZg/m;)V
    .locals 3

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object p1, p0, Lf2/n;->h:LZg/m;

    invoke-static {p1}, LZg/v;->N(Ljava/util/List;)Ljava/lang/Object;

    invoke-virtual {p0}, Lf2/n;->K()Lf2/E;

    move-result-object p1

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v1

    invoke-virtual {v1}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object p1

    iget-object v1, p0, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/n$b;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lf2/F;->c()LLi/N;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    if-eqz p1, :cond_0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lf2/n;->n:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object p1

    sget-object v2, Landroidx/lifecycle/k$b;->CREATED:Landroidx/lifecycle/k$b;

    invoke-virtual {p1, v2}, Landroidx/lifecycle/k$b;->isAtLeast(Landroidx/lifecycle/k$b;)Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz p2, :cond_2

    invoke-virtual {v0, v2}, Lf2/k;->p(Landroidx/lifecycle/k$b;)V

    new-instance p1, Lf2/l;

    invoke-direct {p1, v0}, Lf2/l;-><init>(Lf2/k;)V

    invoke-virtual {p3, p1}, LZg/m;->addFirst(Ljava/lang/Object;)V

    :cond_2
    if-nez v1, :cond_3

    sget-object p1, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, p1}, Lf2/k;->p(Landroidx/lifecycle/k$b;)V

    invoke-virtual {p0, v0}, Lf2/n;->u0(Lf2/k;)Lf2/k;

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v2}, Lf2/k;->p(Landroidx/lifecycle/k$b;)V

    :cond_4
    :goto_1
    if-nez p2, :cond_5

    if-nez v1, :cond_5

    iget-object p1, p0, Lf2/n;->r:Lf2/o;

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Lf2/k;->i()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lf2/o;->Y(Ljava/lang/String;)V

    :cond_5
    return-void

    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Attempted to pop "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lf2/k;->f()Lf2/r;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", which is not the top of the back stack ("

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic l(Lf2/n;)LLi/z;
    .locals 0

    iget-object p0, p0, Lf2/n;->i:LLi/z;

    return-object p0
.end method

.method static synthetic l0(Lf2/n;Lf2/k;ZLZg/m;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    new-instance p3, LZg/m;

    invoke-direct {p3}, LZg/m;-><init>()V

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lf2/n;->k0(Lf2/k;ZLZg/m;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: popEntryFromBackStack"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic m(Lf2/n;)Lf2/E;
    .locals 0

    iget-object p0, p0, Lf2/n;->x:Lf2/E;

    return-object p0
.end method

.method public static final synthetic n(Lf2/n;)LLi/z;
    .locals 0

    iget-object p0, p0, Lf2/n;->k:LLi/z;

    return-object p0
.end method

.method public static final synthetic o(Lf2/n;Lf2/k;ZLZg/m;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lf2/n;->k0(Lf2/k;ZLZg/m;)V

    return-void
.end method

.method private final o0(ILandroid/os/Bundle;Lf2/y;Lf2/D$a;)Z
    .locals 2

    iget-object v0, p0, Lf2/n;->o:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lf2/n;->o:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lf2/n;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Lf2/n$q;

    invoke-direct {v1, p1}, Lf2/n$q;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, LZg/v;->I(Ljava/lang/Iterable;Lmh/l;)Z

    iget-object v0, p0, Lf2/n;->p:Ljava/util/Map;

    invoke-static {v0}, Lkotlin/jvm/internal/V;->d(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZg/m;

    invoke-direct {p0, p1}, Lf2/n;->P(LZg/m;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3, p4}, Lf2/n;->w(Ljava/util/List;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)Z

    move-result p1

    return p1
.end method

.method private final p(Lf2/r;Landroid/os/Bundle;Lf2/k;Ljava/util/List;)V
    .locals 30

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v15, p2

    move-object/from16 v14, p3

    move-object/from16 v13, p4

    invoke-virtual/range {p3 .. p3}, Lf2/k;->f()Lf2/r;

    move-result-object v12

    instance-of v0, v12, Lf2/d;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    instance-of v0, v0, Lf2/d;

    if-eqz v0, :cond_1

    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    invoke-virtual {v0}, Lf2/r;->s()I

    move-result v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Lf2/n;->j0(Lf2/n;IZZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    new-instance v5, LZg/m;

    invoke-direct {v5}, LZg/m;-><init>()V

    instance-of v0, v7, Lf2/t;

    const/16 v18, 0x0

    if-eqz v0, :cond_8

    move-object v0, v12

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf2/r;->v()Lf2/t;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v13, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lf2/k;

    invoke-virtual {v2}, Lf2/k;->f()Lf2/r;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_3
    move-object/from16 v1, v18

    :goto_1
    check-cast v1, Lf2/k;

    if-nez v1, :cond_4

    sget-object v8, Lf2/k;->o:Lf2/k$a;

    iget-object v9, v6, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lf2/n;->J()Landroidx/lifecycle/k$b;

    move-result-object v0

    iget-object v1, v6, Lf2/n;->r:Lf2/o;

    const/16 v16, 0x60

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v10, v4

    move-object/from16 v11, p2

    move-object/from16 v19, v12

    move-object v12, v0

    move-object v0, v13

    move-object v13, v1

    move-object v1, v14

    move-object v14, v2

    move-object v2, v15

    move-object v15, v3

    invoke-static/range {v8 .. v17}, Lf2/k$a;->b(Lf2/k$a;Landroid/content/Context;Lf2/r;Landroid/os/Bundle;Landroidx/lifecycle/k$b;Lf2/C;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)Lf2/k;

    move-result-object v3

    move-object v8, v1

    move-object v1, v3

    goto :goto_2

    :cond_4
    move-object/from16 v19, v12

    move-object v0, v13

    move-object v8, v14

    move-object v2, v15

    :goto_2
    invoke-virtual {v5, v1}, LZg/m;->addFirst(Ljava/lang/Object;)V

    iget-object v1, v6, Lf2/n;->h:LZg/m;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v1}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    invoke-virtual {v1}, Lf2/k;->f()Lf2/r;

    move-result-object v1

    if-ne v1, v4, :cond_5

    iget-object v1, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v1}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    move-object v12, v0

    move-object/from16 v0, p0

    move-object v13, v2

    move v2, v3

    move-object v3, v11

    move-object v11, v4

    move v4, v9

    move-object v9, v5

    move-object v5, v10

    invoke-static/range {v0 .. v5}, Lf2/n;->l0(Lf2/n;Lf2/k;ZLZg/m;ILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    move-object v12, v0

    move-object v13, v2

    move-object v11, v4

    move-object v9, v5

    goto :goto_3

    :cond_6
    move-object v11, v4

    move-object v9, v5

    move-object/from16 v19, v12

    move-object v12, v13

    move-object v8, v14

    move-object v13, v15

    :goto_3
    if-eqz v11, :cond_9

    if-ne v11, v7, :cond_7

    goto :goto_4

    :cond_7
    move-object v14, v8

    move-object v5, v9

    move-object v0, v11

    move-object v15, v13

    move-object v13, v12

    move-object/from16 v12, v19

    goto/16 :goto_0

    :cond_8
    move-object v9, v5

    move-object/from16 v19, v12

    move-object v12, v13

    move-object v8, v14

    move-object v13, v15

    :cond_9
    :goto_4
    invoke-virtual {v9}, LZg/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    move-object/from16 v0, v19

    goto :goto_5

    :cond_a
    invoke-virtual {v9}, LZg/m;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    :cond_b
    :goto_5
    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lf2/r;->s()I

    move-result v1

    invoke-virtual {v6, v1, v0}, Lf2/n;->x(ILf2/r;)Lf2/r;

    move-result-object v1

    if-eq v1, v0, :cond_10

    invoke-virtual {v0}, Lf2/r;->v()Lf2/t;

    move-result-object v0

    if-eqz v0, :cond_b

    if-eqz v13, :cond_c

    invoke-virtual/range {p2 .. p2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_c

    move-object/from16 v15, v18

    goto :goto_6

    :cond_c
    move-object v15, v13

    :goto_6
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v12, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_d
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lf2/k;

    invoke-virtual {v3}, Lf2/k;->f()Lf2/r;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_7

    :cond_e
    move-object/from16 v2, v18

    :goto_7
    check-cast v2, Lf2/k;

    if-nez v2, :cond_f

    sget-object v20, Lf2/k;->o:Lf2/k$a;

    iget-object v1, v6, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual {v0, v15}, Lf2/r;->g(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lf2/n;->J()Landroidx/lifecycle/k$b;

    move-result-object v24

    iget-object v2, v6, Lf2/n;->r:Lf2/o;

    const/16 v28, 0x60

    const/16 v29, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v21, v1

    move-object/from16 v22, v0

    move-object/from16 v25, v2

    invoke-static/range {v20 .. v29}, Lf2/k$a;->b(Lf2/k$a;Landroid/content/Context;Lf2/r;Landroid/os/Bundle;Landroidx/lifecycle/k$b;Lf2/C;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)Lf2/k;

    move-result-object v2

    :cond_f
    invoke-virtual {v9, v2}, LZg/m;->addFirst(Ljava/lang/Object;)V

    goto :goto_5

    :cond_10
    invoke-virtual {v9}, LZg/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_8

    :cond_11
    invoke-virtual {v9}, LZg/m;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    move-object/from16 v19, v0

    :goto_8
    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    instance-of v0, v0, Lf2/t;

    if-eqz v0, :cond_12

    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.navigation.NavGraph"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lf2/t;

    invoke-virtual {v0}, Lf2/t;->T()Lo/W;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Lf2/r;->s()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/W;->f(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_12

    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lf2/k;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Lf2/n;->l0(Lf2/n;Lf2/k;ZLZg/m;ILjava/lang/Object;)V

    goto :goto_8

    :cond_12
    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->J()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    if-nez v0, :cond_13

    invoke-virtual {v9}, LZg/m;->J()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    :cond_13
    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    goto :goto_9

    :cond_14
    move-object/from16 v0, v18

    :goto_9
    iget-object v1, v6, Lf2/n;->d:Lf2/t;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v12, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_15
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lf2/k;

    invoke-virtual {v2}, Lf2/k;->f()Lf2/r;

    move-result-object v2

    iget-object v3, v6, Lf2/n;->d:Lf2/t;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    move-object/from16 v18, v1

    :cond_16
    check-cast v18, Lf2/k;

    if-nez v18, :cond_17

    sget-object v19, Lf2/k;->o:Lf2/k$a;

    iget-object v0, v6, Lf2/n;->a:Landroid/content/Context;

    iget-object v1, v6, Lf2/n;->d:Lf2/t;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v2, v6, Lf2/n;->d:Lf2/t;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2, v13}, Lf2/r;->g(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lf2/n;->J()Landroidx/lifecycle/k$b;

    move-result-object v23

    iget-object v2, v6, Lf2/n;->r:Lf2/o;

    const/16 v27, 0x60

    const/16 v28, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v20, v0

    move-object/from16 v21, v1

    move-object/from16 v24, v2

    invoke-static/range {v19 .. v28}, Lf2/k$a;->b(Lf2/k$a;Landroid/content/Context;Lf2/r;Landroid/os/Bundle;Landroidx/lifecycle/k$b;Lf2/C;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)Lf2/k;

    move-result-object v18

    :cond_17
    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, LZg/m;->addFirst(Ljava/lang/Object;)V

    :cond_18
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    iget-object v2, v6, Lf2/n;->x:Lf2/E;

    invoke-virtual {v1}, Lf2/k;->f()Lf2/r;

    move-result-object v3

    invoke-virtual {v3}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v2

    iget-object v3, v6, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_19

    check-cast v2, Lf2/n$b;

    invoke-virtual {v2, v1}, Lf2/n$b;->n(Lf2/k;)V

    goto :goto_a

    :cond_19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NavigatorBackStack for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " should already be created"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1a
    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0, v9}, LZg/m;->addAll(Ljava/util/Collection;)Z

    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0, v8}, LZg/m;->add(Ljava/lang/Object;)Z

    invoke-static {v9, v8}, LZg/v;->N0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1b
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    invoke-virtual {v1}, Lf2/k;->f()Lf2/r;

    move-result-object v2

    invoke-virtual {v2}, Lf2/r;->v()Lf2/t;

    move-result-object v2

    if-eqz v2, :cond_1b

    invoke-virtual {v2}, Lf2/r;->s()I

    move-result v2

    invoke-virtual {v6, v2}, Lf2/n;->D(I)Lf2/k;

    move-result-object v2

    invoke-direct {v6, v1, v2}, Lf2/n;->S(Lf2/k;Lf2/k;)V

    goto :goto_b

    :cond_1c
    return-void
.end method

.method static synthetic q(Lf2/n;Lf2/r;Landroid/os/Bundle;Lf2/k;Ljava/util/List;ILjava/lang/Object;)V
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p4

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lf2/n;->p(Lf2/r;Landroid/os/Bundle;Lf2/k;Ljava/util/List;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addEntryToBackStack"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final s(I)Z
    .locals 5

    iget-object v0, p0, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/n$b;

    invoke-virtual {v1, v2}, Lf2/F;->l(Z)V

    goto :goto_0

    :cond_0
    sget-object v0, Lf2/n$e;->a:Lf2/n$e;

    invoke-static {v0}, Lf2/A;->a(Lmh/l;)Lf2/y;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, Lf2/n;->o0(ILandroid/os/Bundle;Lf2/y;Lf2/D$a;)Z

    move-result v0

    iget-object v1, p0, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/n$b;

    invoke-virtual {v3, v4}, Lf2/F;->l(Z)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    invoke-direct {p0, p1, v2, v4}, Lf2/n;->g0(IZZ)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    return v2
.end method

.method private final t()Z
    .locals 8

    :goto_0
    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    instance-of v0, v0, Lf2/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lf2/k;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lf2/n;->l0(Lf2/n;Lf2/k;ZLZg/m;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->T()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lf2/n;->D:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    iget v1, p0, Lf2/n;->C:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lf2/n;->C:I

    invoke-virtual {p0}, Lf2/n;->v0()V

    iget v1, p0, Lf2/n;->C:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lf2/n;->C:I

    if-nez v1, :cond_4

    iget-object v1, p0, Lf2/n;->D:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    iget-object v3, p0, Lf2/n;->D:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/k;

    iget-object v4, p0, Lf2/n;->s:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf2/n$c;

    invoke-virtual {v3}, Lf2/k;->f()Lf2/r;

    move-result-object v6

    invoke-virtual {v3}, Lf2/k;->d()Landroid/os/Bundle;

    move-result-object v7

    invoke-interface {v5, p0, v6, v7}, Lf2/n$c;->a(Lf2/n;Lf2/r;Landroid/os/Bundle;)V

    goto :goto_2

    :cond_2
    iget-object v4, p0, Lf2/n;->F:LLi/y;

    invoke-interface {v4, v3}, LLi/y;->j(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lf2/n;->i:LLi/z;

    iget-object v3, p0, Lf2/n;->h:LZg/m;

    invoke-static {v3}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, LLi/y;->j(Ljava/lang/Object;)Z

    iget-object v1, p0, Lf2/n;->k:LLi/z;

    invoke-virtual {p0}, Lf2/n;->m0()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, LLi/y;->j(Ljava/lang/Object;)Z

    :cond_4
    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    return v2
.end method

.method private final v(Ljava/util/List;Lf2/r;ZZ)Z
    .locals 15

    move-object v6, p0

    move/from16 v7, p4

    new-instance v8, Lkotlin/jvm/internal/J;

    invoke-direct {v8}, Lkotlin/jvm/internal/J;-><init>()V

    new-instance v9, LZg/m;

    invoke-direct {v9}, LZg/m;-><init>()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lf2/D;

    new-instance v12, Lkotlin/jvm/internal/J;

    invoke-direct {v12}, Lkotlin/jvm/internal/J;-><init>()V

    iget-object v0, v6, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lf2/k;

    new-instance v14, Lf2/n$f;

    move-object v0, v14

    move-object v1, v12

    move-object v2, v8

    move-object v3, p0

    move/from16 v4, p4

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lf2/n$f;-><init>(Lkotlin/jvm/internal/J;Lkotlin/jvm/internal/J;Lf2/n;ZLZg/m;)V

    invoke-direct {p0, v11, v13, v7, v14}, Lf2/n;->f0(Lf2/D;Lf2/k;ZLmh/l;)V

    iget-boolean v0, v12, Lkotlin/jvm/internal/J;->a:Z

    if-nez v0, :cond_0

    :cond_1
    if-eqz v7, :cond_5

    const/4 v0, 0x0

    if-nez p3, :cond_3

    sget-object v1, Lf2/n$g;->a:Lf2/n$g;

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lzi/m;->n(Ljava/lang/Object;Lmh/l;)Lzi/j;

    move-result-object v1

    new-instance v2, Lf2/n$h;

    invoke-direct {v2, p0}, Lf2/n$h;-><init>(Lf2/n;)V

    invoke-static {v1, v2}, Lzi/m;->W(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v1

    invoke-interface {v1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/r;

    iget-object v3, v6, Lf2/n;->o:Ljava/util/Map;

    invoke-virtual {v2}, Lf2/r;->s()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v9}, LZg/m;->J()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf2/l;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lf2/l;->b()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v0

    :goto_1
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v9}, LZg/m;->first()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/l;

    invoke-virtual {v1}, Lf2/l;->a()I

    move-result v2

    const/4 v3, 0x2

    invoke-static {p0, v2, v0, v3, v0}, Lf2/n;->y(Lf2/n;ILf2/r;ILjava/lang/Object;)Lf2/r;

    move-result-object v0

    sget-object v2, Lf2/n$i;->a:Lf2/n$i;

    invoke-static {v0, v2}, Lzi/m;->n(Ljava/lang/Object;Lmh/l;)Lzi/j;

    move-result-object v0

    new-instance v2, Lf2/n$j;

    invoke-direct {v2, p0}, Lf2/n$j;-><init>(Lf2/n;)V

    invoke-static {v0, v2}, Lzi/m;->W(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-interface {v0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/r;

    iget-object v3, v6, Lf2/n;->o:Ljava/util/Map;

    invoke-virtual {v2}, Lf2/r;->s()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1}, Lf2/l;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    iget-object v0, v6, Lf2/n;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v1}, Lf2/l;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v6, Lf2/n;->p:Ljava/util/Map;

    invoke-virtual {v1}, Lf2/l;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-direct {p0}, Lf2/n;->w0()V

    iget-boolean v0, v8, Lkotlin/jvm/internal/J;->a:Z

    return v0
.end method

.method private final w(Ljava/util/List;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)Z
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lf2/k;

    invoke-virtual {v4}, Lf2/k;->f()Lf2/r;

    move-result-object v4

    instance-of v4, v4, Lf2/t;

    if-nez v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/k;

    invoke-static {v0}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_2

    invoke-static {v3}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf2/k;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lf2/k;->f()Lf2/r;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v2}, Lf2/k;->f()Lf2/r;

    move-result-object v5

    invoke-virtual {v5}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    filled-new-array {v2}, [Lf2/k;

    move-result-object v2

    invoke-static {v2}, LZg/v;->r([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v1, Lkotlin/jvm/internal/J;

    invoke-direct {v1}, Lkotlin/jvm/internal/J;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, Lf2/n;->x:Lf2/E;

    invoke-static {v2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf2/k;

    invoke-virtual {v4}, Lf2/k;->f()Lf2/r;

    move-result-object v4

    invoke-virtual {v4}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v9

    new-instance v6, Lkotlin/jvm/internal/L;

    invoke-direct {v6}, Lkotlin/jvm/internal/L;-><init>()V

    new-instance v10, Lf2/n$k;

    move-object v3, v10

    move-object v4, v1

    move-object v5, p1

    move-object v7, p0

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lf2/n$k;-><init>(Lkotlin/jvm/internal/J;Ljava/util/List;Lkotlin/jvm/internal/L;Lf2/n;Landroid/os/Bundle;)V

    move-object v3, p0

    move-object v4, v9

    move-object v5, v2

    move-object v6, p3

    move-object v7, p4

    move-object v8, v10

    invoke-direct/range {v3 .. v8}, Lf2/n;->X(Lf2/D;Ljava/util/List;Lf2/y;Lf2/D$a;Lmh/l;)V

    goto :goto_3

    :cond_5
    iget-boolean p1, v1, Lkotlin/jvm/internal/J;->a:Z

    return p1
.end method

.method private final w0()V
    .locals 3

    iget-object v0, p0, Lf2/n;->v:Lc/F;

    iget-boolean v1, p0, Lf2/n;->w:Z

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lf2/n;->H()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lc/F;->j(Z)V

    return-void
.end method

.method public static synthetic y(Lf2/n;ILf2/r;ILjava/lang/Object;)Lf2/r;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lf2/n;->x(ILf2/r;)Lf2/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: findDestination"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public D(I)Lf2/k;
    .locals 3

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lf2/k;

    invoke-virtual {v2}, Lf2/k;->f()Lf2/r;

    move-result-object v2

    invoke-virtual {v2}, Lf2/r;->s()I

    move-result v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lf2/k;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No destination with ID "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is on the NavController\'s back stack. The current destination is "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf2/n;->G()Lf2/r;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final E()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lf2/n;->a:Landroid/content/Context;

    return-object v0
.end method

.method public F()Lf2/k;
    .locals 1

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->T()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    return-object v0
.end method

.method public G()Lf2/r;
    .locals 1

    invoke-virtual {p0}, Lf2/n;->F()Lf2/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public I()Lf2/t;
    .locals 2

    iget-object v0, p0, Lf2/n;->d:Lf2/t;

    if-eqz v0, :cond_0

    const-string v1, "null cannot be cast to non-null type androidx.navigation.NavGraph"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call setGraph() before calling getGraph()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final J()Landroidx/lifecycle/k$b;
    .locals 1

    iget-object v0, p0, Lf2/n;->q:Landroidx/lifecycle/o;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/lifecycle/k$b;->CREATED:Landroidx/lifecycle/k$b;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lf2/n;->t:Landroidx/lifecycle/k$b;

    :goto_0
    return-object v0
.end method

.method public K()Lf2/E;
    .locals 1

    iget-object v0, p0, Lf2/n;->x:Lf2/E;

    return-object v0
.end method

.method public L()Lf2/k;
    .locals 3

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-static {v0}, LZg/v;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    :cond_0
    invoke-static {v0}, Lzi/m;->g(Ljava/util/Iterator;)Lzi/j;

    move-result-object v0

    invoke-interface {v0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lf2/k;

    invoke-virtual {v2}, Lf2/k;->f()Lf2/r;

    move-result-object v2

    instance-of v2, v2, Lf2/t;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lf2/k;

    return-object v1
.end method

.method public final N()LLi/N;
    .locals 1

    iget-object v0, p0, Lf2/n;->l:LLi/N;

    return-object v0
.end method

.method public O(Landroid/content/Intent;)Z
    .locals 19

    move-object/from16 v7, p0

    move-object/from16 v1, p1

    const/4 v8, 0x0

    if-nez v1, :cond_0

    return v8

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "NavController"

    const/4 v9, 0x0

    if-eqz v2, :cond_1

    :try_start_0
    const-string v0, "android-support-nav:controller:deepLinkIds"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "handleDeepLink() could not extract deepLink from "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    move-object v0, v9

    :goto_0
    if-eqz v2, :cond_2

    const-string v4, "android-support-nav:controller:deepLinkArgs"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v9

    :goto_1
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    if-eqz v2, :cond_3

    const-string v6, "android-support-nav:controller:deepLinkExtras"

    invoke-virtual {v2, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v9

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_4
    const/4 v10, 0x1

    if-eqz v0, :cond_5

    array-length v2, v0

    if-nez v2, :cond_7

    :cond_5
    iget-object v2, v7, Lf2/n;->h:LZg/m;

    invoke-direct {v7, v2}, Lf2/n;->M(LZg/m;)Lf2/t;

    move-result-object v2

    new-instance v6, Lf2/q;

    invoke-direct {v6, v1}, Lf2/q;-><init>(Landroid/content/Intent;)V

    invoke-virtual {v2, v6, v10, v10, v2}, Lf2/t;->X(Lf2/q;ZZLf2/r;)Lf2/r$b;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lf2/r$b;->b()Lf2/r;

    move-result-object v0

    invoke-static {v0, v9, v10, v9}, Lf2/r;->j(Lf2/r;Lf2/r;ILjava/lang/Object;)[I

    move-result-object v4

    invoke-virtual {v2}, Lf2/r$b;->c()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v2}, Lf2/r;->g(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_6
    move-object v0, v4

    move-object v4, v9

    :cond_7
    if-eqz v0, :cond_18

    array-length v2, v0

    if-nez v2, :cond_8

    goto/16 :goto_9

    :cond_8
    invoke-direct {v7, v0}, Lf2/n;->B([I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not find destination "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " in the navigation graph, ignoring the deep link from "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v8

    :cond_9
    const-string v2, "android-support-nav:controller:deepLinkIntent"

    invoke-virtual {v5, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    array-length v2, v0

    new-array v11, v2, [Landroid/os/Bundle;

    move v3, v8

    :goto_3
    if-ge v3, v2, :cond_b

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v6, v5}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    if-eqz v4, :cond_a

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/os/Bundle;

    if-eqz v12, :cond_a

    invoke-virtual {v6, v12}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_a
    aput-object v6, v11, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getFlags()I

    move-result v2

    const/high16 v3, 0x10000000

    and-int/2addr v3, v2

    if-eqz v3, :cond_d

    const v4, 0x8000

    and-int/2addr v2, v4

    if-nez v2, :cond_d

    invoke-virtual {v1, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v0, v7, Lf2/n;->a:Landroid/content/Context;

    invoke-static {v0}, Ls1/u;->i(Landroid/content/Context;)Ls1/u;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls1/u;->e(Landroid/content/Intent;)Ls1/u;

    move-result-object v0

    const-string v1, "create(context).addNextI\u2026ntWithParentStack(intent)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ls1/u;->m()V

    iget-object v0, v7, Lf2/n;->b:Landroid/app/Activity;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    invoke-virtual {v0, v8, v8}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_c
    return v10

    :cond_d
    const-string v12, "Deep Linking failed: destination "

    if-eqz v3, :cond_11

    iget-object v1, v7, Lf2/n;->h:LZg/m;

    invoke-virtual {v1}, LZg/m;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_e

    iget-object v1, v7, Lf2/n;->d:Lf2/t;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lf2/r;->s()I

    move-result v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lf2/n;->j0(Lf2/n;IZZILjava/lang/Object;)Z

    :cond_e
    :goto_4
    array-length v1, v0

    if-ge v8, v1, :cond_10

    aget v1, v0, v8

    add-int/lit8 v2, v8, 0x1

    aget-object v3, v11, v8

    const/4 v4, 0x2

    invoke-static {v7, v1, v9, v4, v9}, Lf2/n;->y(Lf2/n;ILf2/r;ILjava/lang/Object;)Lf2/r;

    move-result-object v4

    if-eqz v4, :cond_f

    new-instance v1, Lf2/n$l;

    invoke-direct {v1, v4, v7}, Lf2/n$l;-><init>(Lf2/r;Lf2/n;)V

    invoke-static {v1}, Lf2/A;->a(Lmh/l;)Lf2/y;

    move-result-object v1

    invoke-direct {v7, v4, v3, v1, v9}, Lf2/n;->T(Lf2/r;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)V

    move v8, v2

    goto :goto_4

    :cond_f
    sget-object v0, Lf2/r;->k:Lf2/r$a;

    iget-object v2, v7, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual {v0, v2, v1}, Lf2/r$a;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " cannot be found from the current destination "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Lf2/n;->G()Lf2/r;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    iput-boolean v10, v7, Lf2/n;->g:Z

    return v10

    :cond_11
    iget-object v1, v7, Lf2/n;->d:Lf2/t;

    array-length v2, v0

    move v3, v8

    :goto_5
    if-ge v3, v2, :cond_17

    aget v4, v0, v3

    aget-object v5, v11, v3

    if-nez v3, :cond_12

    iget-object v6, v7, Lf2/n;->d:Lf2/t;

    goto :goto_6

    :cond_12
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1, v4}, Lf2/t;->N(I)Lf2/r;

    move-result-object v6

    :goto_6
    if-eqz v6, :cond_16

    array-length v4, v0

    sub-int/2addr v4, v10

    if-eq v3, v4, :cond_14

    instance-of v4, v6, Lf2/t;

    if-eqz v4, :cond_15

    check-cast v6, Lf2/t;

    :goto_7
    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lf2/t;->V()I

    move-result v1

    invoke-virtual {v6, v1}, Lf2/t;->N(I)Lf2/r;

    move-result-object v1

    instance-of v1, v1, Lf2/t;

    if-eqz v1, :cond_13

    invoke-virtual {v6}, Lf2/t;->V()I

    move-result v1

    invoke-virtual {v6, v1}, Lf2/t;->N(I)Lf2/r;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lf2/t;

    goto :goto_7

    :cond_13
    move-object v1, v6

    goto :goto_8

    :cond_14
    new-instance v13, Lf2/y$a;

    invoke-direct {v13}, Lf2/y$a;-><init>()V

    iget-object v4, v7, Lf2/n;->d:Lf2/t;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lf2/r;->s()I

    move-result v14

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lf2/y$a;->k(Lf2/y$a;IZZILjava/lang/Object;)Lf2/y$a;

    move-result-object v4

    invoke-virtual {v4, v8}, Lf2/y$a;->b(I)Lf2/y$a;

    move-result-object v4

    invoke-virtual {v4, v8}, Lf2/y$a;->c(I)Lf2/y$a;

    move-result-object v4

    invoke-virtual {v4}, Lf2/y$a;->a()Lf2/y;

    move-result-object v4

    invoke-direct {v7, v6, v5, v4, v9}, Lf2/n;->T(Lf2/r;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)V

    :cond_15
    :goto_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_16
    sget-object v0, Lf2/r;->k:Lf2/r$a;

    iget-object v2, v7, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual {v0, v2, v4}, Lf2/r$a;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " cannot be found in graph "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_17
    iput-boolean v10, v7, Lf2/n;->g:Z

    return v10

    :cond_18
    :goto_9
    return v8
.end method

.method public final U(Ljava/lang/String;Lf2/y;Lf2/D$a;)V
    .locals 4

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n;->d:Lf2/t;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-direct {p0, v0}, Lf2/n;->M(LZg/m;)Lf2/t;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, v1, v0}, Lf2/t;->Y(Ljava/lang/String;ZZLf2/r;)Lf2/r$b;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lf2/r$b;->b()Lf2/r;

    move-result-object p1

    invoke-virtual {v0}, Lf2/r$b;->c()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p1, v1}, Lf2/r;->g(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    :cond_0
    invoke-virtual {v0}, Lf2/r$b;->b()Lf2/r;

    move-result-object v0

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    sget-object v3, Lf2/r;->k:Lf2/r$a;

    invoke-virtual {p1}, Lf2/r;->w()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lf2/r$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v3, "Uri.parse(this)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v2, p1, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "android-support-nav:controller:deepLinkIntent"

    invoke-virtual {v1, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-direct {p0, v0, v1, p2, p3}, Lf2/n;->T(Lf2/r;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)V

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Navigation destination that matches route "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be found in the navigation graph "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lf2/n;->d:Lf2/t;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Cannot navigate to "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Navigation graph has not been set for NavController "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final V(Ljava/lang/String;Lmh/l;)V
    .locals 7

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lf2/A;->a(Lmh/l;)Lf2/y;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    return-void
.end method

.method public Z()Z
    .locals 2

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lf2/n;->G()Lf2/r;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf2/r;->s()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lf2/n;->a0(IZ)Z

    move-result v0

    :goto_0
    return v0
.end method

.method public a0(IZ)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lf2/n;->b0(IZZ)Z

    move-result p1

    return p1
.end method

.method public b0(IZZ)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lf2/n;->g0(IZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lf2/n;->t()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c0(Ljava/lang/String;ZZ)Z
    .locals 1

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lf2/n;->i0(Ljava/lang/String;ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lf2/n;->t()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final e0(Lf2/k;Lmh/a;)V
    .locals 9

    const-string v0, "popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0, p1}, LZg/m;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Ignoring pop of "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " as it was not found on the current back stack"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "NavController"

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v2}, LZg/h;->size()I

    move-result v2

    if-eq v0, v2, :cond_1

    iget-object v2, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v2, v0}, LZg/m;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    invoke-virtual {v0}, Lf2/r;->s()I

    move-result v0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lf2/n;->g0(IZZ)Z

    :cond_1
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lf2/n;->l0(Lf2/n;Lf2/k;ZLZg/m;ILjava/lang/Object;)V

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    invoke-direct {p0}, Lf2/n;->w0()V

    invoke-direct {p0}, Lf2/n;->t()Z

    return-void
.end method

.method public final m0()Ljava/util/List;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/n$b;

    invoke-virtual {v2}, Lf2/F;->c()LLi/N;

    move-result-object v2

    invoke-interface {v2}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lf2/k;

    invoke-interface {v0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v5}, Lf2/k;->j()Landroidx/lifecycle/k$b;

    move-result-object v5

    sget-object v6, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-virtual {v5, v6}, Landroidx/lifecycle/k$b;->isAtLeast(Landroidx/lifecycle/k$b;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v0, v3}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lf2/n;->h:LZg/m;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lf2/k;

    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v4}, Lf2/k;->j()Landroidx/lifecycle/k$b;

    move-result-object v4

    sget-object v5, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-virtual {v4, v5}, Landroidx/lifecycle/k$b;->isAtLeast(Landroidx/lifecycle/k$b;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {v0, v2}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lf2/k;

    invoke-virtual {v3}, Lf2/k;->f()Lf2/r;

    move-result-object v3

    instance-of v3, v3, Lf2/t;

    if-nez v3, :cond_5

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    return-object v1
.end method

.method public n0(Landroid/os/Bundle;)V
    .locals 8

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf2/n;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v0, "android-support-nav:controller:navigatorState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lf2/n;->e:Landroid/os/Bundle;

    const-string v0, "android-support-nav:controller:backStack"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, p0, Lf2/n;->f:[Landroid/os/Parcelable;

    iget-object v0, p0, Lf2/n;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const-string v0, "android-support-nav:controller:backStackDestIds"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v0

    const-string v1, "android-support-nav:controller:backStackIds"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_1

    aget v5, v0, v3

    add-int/lit8 v6, v4, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v7, p0, Lf2/n;->o:Ljava/util/Map;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v7, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    move v4, v6

    goto :goto_0

    :cond_1
    const-string v0, "android-support-nav:controller:backStackStates"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "android-support-nav:controller:backStackStates:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v3, p0, Lf2/n;->p:Ljava/util/Map;

    const-string v4, "id"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LZg/m;

    array-length v5, v2

    invoke-direct {v4, v5}, LZg/m;-><init>(I)V

    invoke-static {v2}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/Parcelable;

    const-string v6, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lf2/l;

    invoke-virtual {v4, v5}, LZg/m;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    const-string v0, "android-support-nav:controller:deepLinkHandled"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lf2/n;->g:Z

    return-void
.end method

.method public p0()Landroid/os/Bundle;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lf2/n;->x:Lf2/E;

    invoke-virtual {v2}, Lf2/E;->f()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/D;

    invoke-virtual {v3}, Lf2/D;->i()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "android-support-nav:controller:navigatorState:names"

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "android-support-nav:controller:navigatorState"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    if-nez v2, :cond_3

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_3
    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/h;->size()I

    move-result v0

    new-array v0, v0, [Landroid/os/Parcelable;

    iget-object v3, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v1

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf2/k;

    add-int/lit8 v6, v4, 0x1

    new-instance v7, Lf2/l;

    invoke-direct {v7, v5}, Lf2/l;-><init>(Lf2/k;)V

    aput-object v7, v0, v4

    move v4, v6

    goto :goto_2

    :cond_4
    const-string v3, "android-support-nav:controller:backStack"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_5
    iget-object v0, p0, Lf2/n;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    if-nez v2, :cond_6

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_6
    iget-object v0, p0, Lf2/n;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p0, Lf2/n;->o:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v1

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    add-int/lit8 v8, v5, 0x1

    aput v7, v0, v5

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v5, v8

    goto :goto_3

    :cond_7
    const-string v4, "android-support-nav:controller:backStackDestIds"

    invoke-virtual {v2, v4, v0}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    const-string v0, "android-support-nav:controller:backStackIds"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_8
    iget-object v0, p0, Lf2/n;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    if-nez v2, :cond_9

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lf2/n;->p:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LZg/m;

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4}, LZg/h;->size()I

    move-result v6

    new-array v6, v6, [Landroid/os/Parcelable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v7, v1

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v7, 0x1

    if-gez v7, :cond_a

    invoke-static {}, LZg/v;->v()V

    :cond_a
    check-cast v8, Lf2/l;

    aput-object v8, v6, v7

    move v7, v9

    goto :goto_5

    :cond_b
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "android-support-nav:controller:backStackStates:"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v6}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_4

    :cond_c
    const-string v1, "android-support-nav:controller:backStackStates"

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_d
    iget-boolean v0, p0, Lf2/n;->g:Z

    if-eqz v0, :cond_f

    if-nez v2, :cond_e

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_e
    const-string v0, "android-support-nav:controller:deepLinkHandled"

    iget-boolean v1, p0, Lf2/n;->g:Z

    invoke-virtual {v2, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_f
    return-object v2
.end method

.method public q0(Lf2/t;)V
    .locals 1

    const-string v0, "graph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lf2/n;->r0(Lf2/t;Landroid/os/Bundle;)V

    return-void
.end method

.method public r(Lf2/n$c;)V
    .locals 2

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n;->s:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v1

    invoke-virtual {v0}, Lf2/k;->d()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {p1, p0, v1, v0}, Lf2/n$c;->a(Lf2/n;Lf2/r;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public r0(Lf2/t;Landroid/os/Bundle;)V
    .locals 9

    const-string v0, "graph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lf2/n;->J()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lf2/n;->d:Lf2/t;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lf2/n;->d:Lf2/t;

    if-eqz v0, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lf2/n;->o:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const-string v3, "id"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {p0, v2}, Lf2/n;->s(I)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lf2/r;->s()I

    move-result v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lf2/n;->j0(Lf2/n;IZZILjava/lang/Object;)Z

    :cond_3
    iput-object p1, p0, Lf2/n;->d:Lf2/t;

    invoke-direct {p0, p2}, Lf2/n;->Y(Landroid/os/Bundle;)V

    goto/16 :goto_5

    :cond_4
    invoke-virtual {p1}, Lf2/t;->T()Lo/W;

    move-result-object p2

    invoke-virtual {p2}, Lo/W;->p()I

    move-result p2

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p2, :cond_5

    invoke-virtual {p1}, Lf2/t;->T()Lo/W;

    move-result-object v1

    invoke-virtual {v1, v0}, Lo/W;->q(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/r;

    iget-object v2, p0, Lf2/n;->d:Lf2/t;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lf2/t;->T()Lo/W;

    move-result-object v2

    invoke-virtual {v2, v0}, Lo/W;->k(I)I

    move-result v2

    iget-object v3, p0, Lf2/n;->d:Lf2/t;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lf2/t;->T()Lo/W;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Lo/W;->o(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    iget-object p2, p0, Lf2/n;->h:LZg/m;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    sget-object v1, Lf2/r;->k:Lf2/r$a;

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lf2/r$a;->c(Lf2/r;)Lzi/j;

    move-result-object v1

    invoke-static {v1}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LZg/v;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, Lf2/n;->d:Lf2/t;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/r;

    iget-object v4, p0, Lf2/n;->d:Lf2/t;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    instance-of v4, v2, Lf2/t;

    if-eqz v4, :cond_6

    check-cast v2, Lf2/t;

    invoke-virtual {v3}, Lf2/r;->s()I

    move-result v3

    invoke-virtual {v2, v3}, Lf2/t;->N(I)Lf2/r;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v0, v2}, Lf2/k;->n(Lf2/r;)V

    goto :goto_3

    :cond_9
    :goto_5
    return-void
.end method

.method public s0(Landroidx/lifecycle/o;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n;->q:Landroidx/lifecycle/o;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf2/n;->q:Landroidx/lifecycle/o;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lf2/n;->u:Landroidx/lifecycle/n;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    :cond_1
    iput-object p1, p0, Lf2/n;->q:Landroidx/lifecycle/o;

    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p1

    iget-object v0, p0, Lf2/n;->u:Landroidx/lifecycle/n;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    return-void
.end method

.method public t0(Landroidx/lifecycle/Q;)V
    .locals 3

    const-string v0, "viewModelStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n;->r:Lf2/o;

    sget-object v1, Lf2/o;->c:Lf2/o$b;

    invoke-virtual {v1, p1}, Lf2/o$b;->a(Landroidx/lifecycle/Q;)Lf2/o;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Lf2/o$b;->a(Landroidx/lifecycle/Q;)Lf2/o;

    move-result-object p1

    iput-object p1, p0, Lf2/n;->r:Lf2/o;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ViewModelStore should be set before setGraph call"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public u(Z)V
    .locals 0

    iput-boolean p1, p0, Lf2/n;->w:Z

    invoke-direct {p0}, Lf2/n;->w0()V

    return-void
.end method

.method public final u0(Lf2/k;)Lf2/k;
    .locals 2

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/k;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lf2/n;->n:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lf2/n;->x:Lf2/E;

    invoke-virtual {p1}, Lf2/k;->f()Lf2/r;

    move-result-object v1

    invoke-virtual {v1}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v0

    iget-object v1, p0, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/n$b;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Lf2/n$b;->e(Lf2/k;)V

    :cond_3
    iget-object v0, p0, Lf2/n;->n:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_0
    return-object p1
.end method

.method public final v0()V
    .locals 10

    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-static {v0}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    invoke-virtual {v1}, Lf2/k;->f()Lf2/r;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    instance-of v3, v1, Lf2/d;

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, LZg/v;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf2/k;

    invoke-virtual {v4}, Lf2/k;->f()Lf2/r;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    instance-of v5, v4, Lf2/d;

    if-nez v5, :cond_1

    instance-of v4, v4, Lf2/t;

    if-nez v4, :cond_1

    :cond_2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, LZg/v;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf2/k;

    invoke-virtual {v5}, Lf2/k;->j()Landroidx/lifecycle/k$b;

    move-result-object v6

    invoke-virtual {v5}, Lf2/k;->f()Lf2/r;

    move-result-object v7

    if-eqz v1, :cond_9

    invoke-virtual {v7}, Lf2/r;->s()I

    move-result v8

    invoke-virtual {v1}, Lf2/r;->s()I

    move-result v9

    if-ne v8, v9, :cond_9

    sget-object v8, Landroidx/lifecycle/k$b;->RESUMED:Landroidx/lifecycle/k$b;

    if-eq v6, v8, :cond_7

    invoke-virtual {p0}, Lf2/n;->K()Lf2/E;

    move-result-object v6

    invoke-virtual {v5}, Lf2/k;->f()Lf2/r;

    move-result-object v9

    invoke-virtual {v9}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v6

    iget-object v9, p0, Lf2/n;->y:Ljava/util/Map;

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf2/n$b;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lf2/F;->c()LLi/N;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-interface {v6}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Set;

    if-eqz v6, :cond_4

    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    :goto_1
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    iget-object v6, p0, Lf2/n;->n:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    if-nez v6, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v3, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    :goto_2
    sget-object v6, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_3
    invoke-static {v2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf2/r;

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Lf2/r;->s()I

    move-result v5

    invoke-virtual {v7}, Lf2/r;->s()I

    move-result v6

    if-ne v5, v6, :cond_8

    invoke-static {v2}, LZg/v;->L(Ljava/util/List;)Ljava/lang/Object;

    :cond_8
    invoke-virtual {v1}, Lf2/r;->v()Lf2/t;

    move-result-object v1

    goto/16 :goto_0

    :cond_9
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_c

    invoke-virtual {v7}, Lf2/r;->s()I

    move-result v7

    invoke-static {v2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf2/r;

    invoke-virtual {v8}, Lf2/r;->s()I

    move-result v8

    if-ne v7, v8, :cond_c

    invoke-static {v2}, LZg/v;->L(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf2/r;

    sget-object v8, Landroidx/lifecycle/k$b;->RESUMED:Landroidx/lifecycle/k$b;

    if-ne v6, v8, :cond_a

    sget-object v6, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-virtual {v5, v6}, Lf2/k;->p(Landroidx/lifecycle/k$b;)V

    goto :goto_4

    :cond_a
    sget-object v8, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    if-eq v6, v8, :cond_b

    invoke-interface {v3, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    :goto_4
    invoke-virtual {v7}, Lf2/r;->v()Lf2/t;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_c
    sget-object v6, Landroidx/lifecycle/k$b;->CREATED:Landroidx/lifecycle/k$b;

    invoke-virtual {v5, v6}, Lf2/k;->p(Landroidx/lifecycle/k$b;)V

    goto/16 :goto_0

    :cond_d
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/k$b;

    if-eqz v2, :cond_e

    invoke-virtual {v1, v2}, Lf2/k;->p(Landroidx/lifecycle/k$b;)V

    goto :goto_5

    :cond_e
    invoke-virtual {v1}, Lf2/k;->q()V

    goto :goto_5

    :cond_f
    return-void
.end method

.method public final x(ILf2/r;)Lf2/r;
    .locals 2

    iget-object v0, p0, Lf2/n;->d:Lf2/t;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf2/r;->s()I

    move-result v0

    if-ne v0, p1, :cond_2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lf2/n;->d:Lf2/t;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lf2/r;->v()Lf2/t;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object p1, p0, Lf2/n;->d:Lf2/t;

    return-object p1

    :cond_1
    iget-object p1, p0, Lf2/n;->d:Lf2/t;

    return-object p1

    :cond_2
    iget-object v0, p0, Lf2/n;->h:LZg/m;

    invoke-virtual {v0}, LZg/m;->T()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lf2/n;->d:Lf2/t;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_4
    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, Lf2/n;->z(Lf2/r;IZLf2/r;)Lf2/r;

    move-result-object p1

    return-object p1
.end method

.method public final z(Lf2/r;IZLf2/r;)Lf2/r;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf2/r;->s()I

    move-result v0

    if-ne v0, p2, :cond_1

    if-eqz p4, :cond_0

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lf2/r;->v()Lf2/t;

    move-result-object v0

    invoke-virtual {p4}, Lf2/r;->v()Lf2/t;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-object p1

    :cond_1
    instance-of v0, p1, Lf2/t;

    if-eqz v0, :cond_2

    check-cast p1, Lf2/t;

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lf2/r;->v()Lf2/t;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3, p4}, Lf2/t;->R(ILf2/r;ZLf2/r;)Lf2/r;

    move-result-object p1

    return-object p1
.end method
