.class public abstract Landroidx/transition/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/k$f;,
        Landroidx/transition/k$d;,
        Landroidx/transition/k$g;,
        Landroidx/transition/k$e;
    }
.end annotation


# static fields
.field private static final I:[Landroid/animation/Animator;

.field private static final J:[I

.field private static final N:Landroidx/transition/g;

.field private static X:Ljava/lang/ThreadLocal;


# instance fields
.field private A:Z

.field B:Z

.field private C:Landroidx/transition/k;

.field private D:Ljava/util/ArrayList;

.field E:Ljava/util/ArrayList;

.field private F:Landroidx/transition/k$e;

.field private G:Lo/a;

.field private H:Landroidx/transition/g;

.field private a:Ljava/lang/String;

.field private b:J

.field c:J

.field private d:Landroid/animation/TimeInterpolator;

.field e:Ljava/util/ArrayList;

.field f:Ljava/util/ArrayList;

.field private g:Ljava/util/ArrayList;

.field private h:Ljava/util/ArrayList;

.field private i:Ljava/util/ArrayList;

.field private j:Ljava/util/ArrayList;

.field private k:Ljava/util/ArrayList;

.field private l:Ljava/util/ArrayList;

.field private m:Ljava/util/ArrayList;

.field private n:Ljava/util/ArrayList;

.field private o:Ljava/util/ArrayList;

.field private p:Landroidx/transition/w;

.field private q:Landroidx/transition/w;

.field r:Landroidx/transition/t;

.field private s:[I

.field private t:Ljava/util/ArrayList;

.field private u:Ljava/util/ArrayList;

.field private v:[Landroidx/transition/k$f;

.field w:Z

.field x:Ljava/util/ArrayList;

.field private y:[Landroid/animation/Animator;

.field z:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/animation/Animator;

    sput-object v0, Landroidx/transition/k;->I:[Landroid/animation/Animator;

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Landroidx/transition/k;->J:[I

    new-instance v0, Landroidx/transition/k$a;

    invoke-direct {v0}, Landroidx/transition/k$a;-><init>()V

    sput-object v0, Landroidx/transition/k;->N:Landroidx/transition/g;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Landroidx/transition/k;->X:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/transition/k;->a:Ljava/lang/String;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroidx/transition/k;->b:J

    iput-wide v0, p0, Landroidx/transition/k;->c:J

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/transition/k;->d:Landroid/animation/TimeInterpolator;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/transition/k;->g:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/transition/k;->h:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/transition/k;->i:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/transition/k;->j:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/transition/k;->k:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/transition/k;->l:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/transition/k;->m:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/transition/k;->n:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/transition/k;->o:Ljava/util/ArrayList;

    new-instance v1, Landroidx/transition/w;

    invoke-direct {v1}, Landroidx/transition/w;-><init>()V

    iput-object v1, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    new-instance v1, Landroidx/transition/w;

    invoke-direct {v1}, Landroidx/transition/w;-><init>()V

    iput-object v1, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    iput-object v0, p0, Landroidx/transition/k;->r:Landroidx/transition/t;

    sget-object v1, Landroidx/transition/k;->J:[I

    iput-object v1, p0, Landroidx/transition/k;->s:[I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/transition/k;->w:Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Landroidx/transition/k;->x:Ljava/util/ArrayList;

    sget-object v2, Landroidx/transition/k;->I:[Landroid/animation/Animator;

    iput-object v2, p0, Landroidx/transition/k;->y:[Landroid/animation/Animator;

    iput v1, p0, Landroidx/transition/k;->z:I

    iput-boolean v1, p0, Landroidx/transition/k;->A:Z

    iput-boolean v1, p0, Landroidx/transition/k;->B:Z

    iput-object v0, p0, Landroidx/transition/k;->C:Landroidx/transition/k;

    iput-object v0, p0, Landroidx/transition/k;->D:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/k;->E:Ljava/util/ArrayList;

    sget-object v0, Landroidx/transition/k;->N:Landroidx/transition/g;

    iput-object v0, p0, Landroidx/transition/k;->H:Landroidx/transition/g;

    return-void
.end method

.method private static E()Lo/a;
    .locals 2

    sget-object v0, Landroidx/transition/k;->X:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/a;

    if-nez v0, :cond_0

    new-instance v0, Lo/a;

    invoke-direct {v0}, Lo/a;-><init>()V

    sget-object v1, Landroidx/transition/k;->X:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method private static P(Landroidx/transition/v;Landroidx/transition/v;Ljava/lang/String;)Z
    .locals 0

    iget-object p0, p0, Landroidx/transition/v;->a:Ljava/util/Map;

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p1, Landroidx/transition/v;->a:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_1

    :cond_0
    const/4 p2, 0x1

    if-eqz p0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, p2

    goto :goto_1

    :cond_2
    :goto_0
    move p0, p2

    :goto_1
    return p0
.end method

.method private Q(Lo/a;Lo/a;Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    .locals 7

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v2}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/transition/v;

    invoke-virtual {p2, v3}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/transition/v;

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v6, p0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Lo/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v3}, Lo/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private R(Lo/a;Lo/a;)V
    .locals 4

    invoke-virtual {p1}, Lo/V;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p1, v0}, Lo/V;->h(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2, v1}, Lo/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/v;

    if-eqz v1, :cond_0

    iget-object v2, v1, Landroidx/transition/v;->b:Landroid/view/View;

    invoke-virtual {p0, v2}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0}, Lo/V;->j(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/v;

    iget-object v3, p0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private S(Lo/a;Lo/a;Lo/t;Lo/t;)V
    .locals 7

    invoke-virtual {p3}, Lo/t;->o()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p3, v1}, Lo/t;->p(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3, v1}, Lo/t;->i(I)J

    move-result-wide v3

    invoke-virtual {p4, v3, v4}, Lo/t;->e(J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v2}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/transition/v;

    invoke-virtual {p2, v3}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/transition/v;

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v6, p0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Lo/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v3}, Lo/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private U(Lo/a;Lo/a;Lo/a;Lo/a;)V
    .locals 7

    invoke-virtual {p3}, Lo/V;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p3, v1}, Lo/V;->l(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3, v1}, Lo/V;->h(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p4, v3}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v2}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/transition/v;

    invoke-virtual {p2, v3}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/transition/v;

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v6, p0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Lo/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v3}, Lo/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private V(Landroidx/transition/w;Landroidx/transition/w;)V
    .locals 5

    new-instance v0, Lo/a;

    iget-object v1, p1, Landroidx/transition/w;->a:Lo/a;

    invoke-direct {v0, v1}, Lo/a;-><init>(Lo/V;)V

    new-instance v1, Lo/a;

    iget-object v2, p2, Landroidx/transition/w;->a:Lo/a;

    invoke-direct {v1, v2}, Lo/a;-><init>(Lo/V;)V

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Landroidx/transition/k;->s:[I

    array-length v4, v3

    if-ge v2, v4, :cond_4

    aget v3, v3, v2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p1, Landroidx/transition/w;->c:Lo/t;

    iget-object v4, p2, Landroidx/transition/w;->c:Lo/t;

    invoke-direct {p0, v0, v1, v3, v4}, Landroidx/transition/k;->S(Lo/a;Lo/a;Lo/t;Lo/t;)V

    goto :goto_1

    :cond_1
    iget-object v3, p1, Landroidx/transition/w;->b:Landroid/util/SparseArray;

    iget-object v4, p2, Landroidx/transition/w;->b:Landroid/util/SparseArray;

    invoke-direct {p0, v0, v1, v3, v4}, Landroidx/transition/k;->Q(Lo/a;Lo/a;Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    goto :goto_1

    :cond_2
    iget-object v3, p1, Landroidx/transition/w;->d:Lo/a;

    iget-object v4, p2, Landroidx/transition/w;->d:Lo/a;

    invoke-direct {p0, v0, v1, v3, v4}, Landroidx/transition/k;->U(Lo/a;Lo/a;Lo/a;Lo/a;)V

    goto :goto_1

    :cond_3
    invoke-direct {p0, v0, v1}, Landroidx/transition/k;->R(Lo/a;Lo/a;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    invoke-direct {p0, v0, v1}, Landroidx/transition/k;->d(Lo/a;Lo/a;)V

    return-void
.end method

.method private W(Landroidx/transition/k;Landroidx/transition/k$g;Z)V
    .locals 5

    iget-object v0, p0, Landroidx/transition/k;->C:Landroidx/transition/k;

    if-eqz v0, :cond_0

    invoke-direct {v0, p1, p2, p3}, Landroidx/transition/k;->W(Landroidx/transition/k;Landroidx/transition/k$g;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/transition/k;->D:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/transition/k;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Landroidx/transition/k;->v:[Landroidx/transition/k$f;

    if-nez v1, :cond_1

    new-array v1, v0, [Landroidx/transition/k$f;

    :cond_1
    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/transition/k;->v:[Landroidx/transition/k$f;

    iget-object v3, p0, Landroidx/transition/k;->D:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroidx/transition/k$f;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, v1, v3

    invoke-interface {p2, v4, p1, p3}, Landroidx/transition/k$g;->a(Landroidx/transition/k$f;Landroidx/transition/k;Z)V

    aput-object v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput-object v1, p0, Landroidx/transition/k;->v:[Landroidx/transition/k$f;

    :cond_3
    return-void
.end method

.method private d(Lo/a;Lo/a;)V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Lo/V;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_1

    invoke-virtual {p1, v1}, Lo/V;->l(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/v;

    iget-object v4, v2, Landroidx/transition/v;->b:Landroid/view/View;

    invoke-virtual {p0, v4}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p2}, Lo/V;->size()I

    move-result p1

    if-ge v0, p1, :cond_3

    invoke-virtual {p2, v0}, Lo/V;->l(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/transition/v;

    iget-object v1, p1, Landroidx/transition/v;->b:Landroid/view/View;

    invoke-virtual {p0, v1}, Landroidx/transition/k;->O(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method private static e(Landroidx/transition/w;Landroid/view/View;Landroidx/transition/v;)V
    .locals 3

    iget-object v0, p0, Landroidx/transition/w;->a:Lo/a;

    invoke-virtual {v0, p1, p2}, Lo/V;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 v0, 0x0

    if-ltz p2, :cond_1

    iget-object v1, p0, Landroidx/transition/w;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v1

    if-ltz v1, :cond_0

    iget-object v1, p0, Landroidx/transition/w;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/transition/w;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-static {p1}, LF1/W;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object v1, p0, Landroidx/transition/w;->d:Lo/a;

    invoke-virtual {v1, p2}, Lo/a;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/transition/w;->d:Lo/a;

    invoke-virtual {v1, p2, v0}, Lo/V;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Landroidx/transition/w;->d:Lo/a;

    invoke-virtual {v1, p2, p1}, Lo/V;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/ListView;

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    invoke-virtual {p2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/Adapter;->hasStableIds()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/AdapterView;->getItemIdAtPosition(I)J

    move-result-wide v1

    iget-object p2, p0, Landroidx/transition/w;->c:Lo/t;

    invoke-virtual {p2, v1, v2}, Lo/t;->f(J)I

    move-result p2

    if-ltz p2, :cond_4

    iget-object p1, p0, Landroidx/transition/w;->c:Lo/t;

    invoke-virtual {p1, v1, v2}, Lo/t;->e(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_5

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setHasTransientState(Z)V

    iget-object p0, p0, Landroidx/transition/w;->c:Lo/t;

    invoke-virtual {p0, v1, v2, v0}, Lo/t;->k(JLjava/lang/Object;)V

    goto :goto_2

    :cond_4
    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setHasTransientState(Z)V

    iget-object p0, p0, Landroidx/transition/w;->c:Lo/t;

    invoke-virtual {p0, v1, v2, p1}, Lo/t;->k(JLjava/lang/Object;)V

    :cond_5
    :goto_2
    return-void
.end method

.method private e0(Landroid/animation/Animator;Lo/a;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Landroidx/transition/k$b;

    invoke-direct {v0, p0, p2}, Landroidx/transition/k$b;-><init>(Landroidx/transition/k;Lo/a;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0, p1}, Landroidx/transition/k;->f(Landroid/animation/Animator;)V

    :cond_0
    return-void
.end method

.method private i(Landroid/view/View;Z)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/transition/k;->i:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Landroidx/transition/k;->j:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, Landroidx/transition/k;->k:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    iget-object v4, p0, Landroidx/transition/k;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    return-void

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_7

    new-instance v1, Landroidx/transition/v;

    invoke-direct {v1, p1}, Landroidx/transition/v;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_5

    invoke-virtual {p0, v1}, Landroidx/transition/k;->l(Landroidx/transition/v;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v1}, Landroidx/transition/k;->h(Landroidx/transition/v;)V

    :goto_1
    iget-object v3, v1, Landroidx/transition/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v1}, Landroidx/transition/k;->k(Landroidx/transition/v;)V

    if-eqz p2, :cond_6

    iget-object v3, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    invoke-static {v3, p1, v1}, Landroidx/transition/k;->e(Landroidx/transition/w;Landroid/view/View;Landroidx/transition/v;)V

    goto :goto_2

    :cond_6
    iget-object v3, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    invoke-static {v3, p1, v1}, Landroidx/transition/k;->e(Landroidx/transition/w;Landroid/view/View;Landroidx/transition/v;)V

    :cond_7
    :goto_2
    instance-of v1, p1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_c

    iget-object v1, p0, Landroidx/transition/k;->m:Ljava/util/ArrayList;

    if-eqz v1, :cond_8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Landroidx/transition/k;->n:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return-void

    :cond_9
    iget-object v0, p0, Landroidx/transition/k;->o:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v1, v2

    :goto_3
    if-ge v1, v0, :cond_b

    iget-object v3, p0, Landroidx/transition/k;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    return-void

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_b
    check-cast p1, Landroid/view/ViewGroup;

    :goto_4
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_c

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroidx/transition/k;->i(Landroid/view/View;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_c
    return-void
.end method


# virtual methods
.method public A()Landroidx/transition/g;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->H:Landroidx/transition/g;

    return-object v0
.end method

.method public B()Landroidx/transition/s;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final D()Landroidx/transition/k;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->r:Landroidx/transition/t;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/transition/k;->D()Landroidx/transition/k;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public F()J
    .locals 2

    iget-wide v0, p0, Landroidx/transition/k;->b:J

    return-wide v0
.end method

.method public G()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method public H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method public I()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method public K()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method public L()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public M(Landroid/view/View;Z)Landroidx/transition/v;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->r:Landroidx/transition/t;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/transition/k;->M(Landroid/view/View;Z)Landroidx/transition/v;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    :goto_0
    iget-object p2, p2, Landroidx/transition/w;->a:Lo/a;

    invoke-virtual {p2, p1}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/transition/v;

    return-object p1
.end method

.method public N(Landroidx/transition/v;Landroidx/transition/v;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Landroidx/transition/k;->L()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    array-length v3, v1

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v1, v4

    invoke-static {p1, p2, v5}, Landroidx/transition/k;->P(Landroidx/transition/v;Landroidx/transition/v;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p1, Landroidx/transition/v;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {p1, p2, v3}, Landroidx/transition/k;->P(Landroidx/transition/v;Landroidx/transition/v;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    move v0, v2

    :cond_3
    return v0
.end method

.method O(Landroid/view/View;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/transition/k;->i:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, Landroidx/transition/k;->j:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Landroidx/transition/k;->k:Ljava/util/ArrayList;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    iget-object v4, p0, Landroidx/transition/k;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Landroidx/transition/k;->l:Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    invoke-static {p1}, LF1/W;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Landroidx/transition/k;->l:Ljava/util/ArrayList;

    invoke-static {p1}, LF1/W;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_7

    iget-object v1, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Landroidx/transition/k;->h:Ljava/util/ArrayList;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_5
    iget-object v1, p0, Landroidx/transition/k;->g:Ljava/util/ArrayList;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    return v3

    :cond_7
    iget-object v1, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_2

    :cond_8
    iget-object v0, p0, Landroidx/transition/k;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    invoke-static {p1}, LF1/W;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return v3

    :cond_9
    iget-object v0, p0, Landroidx/transition/k;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    move v0, v2

    :goto_1
    iget-object v1, p0, Landroidx/transition/k;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_b

    iget-object v1, p0, Landroidx/transition/k;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    return v3

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_b
    return v2

    :cond_c
    :goto_2
    return v3
.end method

.method X(Landroidx/transition/k$g;Z)V
    .locals 0

    invoke-direct {p0, p0, p1, p2}, Landroidx/transition/k;->W(Landroidx/transition/k;Landroidx/transition/k$g;Z)V

    return-void
.end method

.method public Y(Landroid/view/View;)V
    .locals 4

    iget-boolean p1, p0, Landroidx/transition/k;->B:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/transition/k;->x:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget-object v0, p0, Landroidx/transition/k;->x:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/transition/k;->y:[Landroid/animation/Animator;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/Animator;

    sget-object v1, Landroidx/transition/k;->I:[Landroid/animation/Animator;

    iput-object v1, p0, Landroidx/transition/k;->y:[Landroid/animation/Animator;

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    :goto_0
    if-ltz p1, :cond_0

    aget-object v2, v0, p1

    const/4 v3, 0x0

    aput-object v3, v0, p1

    invoke-virtual {v2}, Landroid/animation/Animator;->pause()V

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Landroidx/transition/k;->y:[Landroid/animation/Animator;

    sget-object p1, Landroidx/transition/k$g;->d:Landroidx/transition/k$g;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/transition/k;->X(Landroidx/transition/k$g;Z)V

    iput-boolean v1, p0, Landroidx/transition/k;->A:Z

    :cond_1
    return-void
.end method

.method Z(Landroid/view/ViewGroup;)V
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    iget-object v1, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    invoke-direct {p0, v0, v1}, Landroidx/transition/k;->V(Landroidx/transition/w;Landroidx/transition/w;)V

    invoke-static {}, Landroidx/transition/k;->E()Lo/a;

    move-result-object v0

    invoke-virtual {v0}, Lo/V;->size()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object v2

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    :goto_0
    if-ltz v1, :cond_5

    invoke-virtual {v0, v1}, Lo/V;->h(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    if-eqz v4, :cond_4

    invoke-virtual {v0, v4}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/transition/k$d;

    if-eqz v5, :cond_4

    iget-object v6, v5, Landroidx/transition/k$d;->a:Landroid/view/View;

    if-eqz v6, :cond_4

    iget-object v6, v5, Landroidx/transition/k$d;->d:Landroid/view/WindowId;

    invoke-virtual {v2, v6}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, v5, Landroidx/transition/k$d;->c:Landroidx/transition/v;

    iget-object v7, v5, Landroidx/transition/k$d;->a:Landroid/view/View;

    invoke-virtual {p0, v7, v3}, Landroidx/transition/k;->M(Landroid/view/View;Z)Landroidx/transition/v;

    move-result-object v8

    invoke-virtual {p0, v7, v3}, Landroidx/transition/k;->x(Landroid/view/View;Z)Landroidx/transition/v;

    move-result-object v9

    if-nez v8, :cond_0

    if-nez v9, :cond_0

    iget-object v9, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    iget-object v9, v9, Landroidx/transition/w;->a:Lo/a;

    invoke-virtual {v9, v7}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Landroidx/transition/v;

    :cond_0
    if-nez v8, :cond_1

    if-eqz v9, :cond_4

    :cond_1
    iget-object v7, v5, Landroidx/transition/k$d;->e:Landroidx/transition/k;

    invoke-virtual {v7, v6, v9}, Landroidx/transition/k;->N(Landroidx/transition/v;Landroidx/transition/v;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v5, v5, Landroidx/transition/k$d;->e:Landroidx/transition/k;

    invoke-virtual {v5}, Landroidx/transition/k;->D()Landroidx/transition/k;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Landroid/animation/Animator;->isRunning()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v4}, Landroid/animation/Animator;->isStarted()Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v4}, Lo/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_5
    iget-object v6, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    iget-object v7, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    iget-object v8, p0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    iget-object v9, p0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    move-object v4, p0

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, Landroidx/transition/k;->q(Landroid/view/ViewGroup;Landroidx/transition/w;Landroidx/transition/w;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {p0}, Landroidx/transition/k;->f0()V

    return-void
.end method

.method public a0(Landroidx/transition/k$f;)Landroidx/transition/k;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->D:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/transition/k;->C:Landroidx/transition/k;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroidx/transition/k;->a0(Landroidx/transition/k$f;)Landroidx/transition/k;

    :cond_1
    iget-object p1, p0, Landroidx/transition/k;->D:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/transition/k;->D:Ljava/util/ArrayList;

    :cond_2
    return-object p0
.end method

.method public b(Landroidx/transition/k$f;)Landroidx/transition/k;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->D:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/k;->D:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Landroidx/transition/k;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c(Landroid/view/View;)Landroidx/transition/k;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c0(Landroid/view/View;)Landroidx/transition/k;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method protected cancel()V
    .locals 4

    iget-object v0, p0, Landroidx/transition/k;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Landroidx/transition/k;->x:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/transition/k;->y:[Landroid/animation/Animator;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/animation/Animator;

    sget-object v2, Landroidx/transition/k;->I:[Landroid/animation/Animator;

    iput-object v2, p0, Landroidx/transition/k;->y:[Landroid/animation/Animator;

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget-object v2, v1, v0

    const/4 v3, 0x0

    aput-object v3, v1, v0

    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Landroidx/transition/k;->y:[Landroid/animation/Animator;

    sget-object v0, Landroidx/transition/k$g;->c:Landroidx/transition/k$g;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/transition/k;->X(Landroidx/transition/k$g;Z)V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/transition/k;->o()Landroidx/transition/k;

    move-result-object v0

    return-object v0
.end method

.method public d0(Landroid/view/View;)V
    .locals 4

    iget-boolean p1, p0, Landroidx/transition/k;->A:Z

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Landroidx/transition/k;->B:Z

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/transition/k;->x:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget-object v1, p0, Landroidx/transition/k;->x:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/transition/k;->y:[Landroid/animation/Animator;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/animation/Animator;

    sget-object v2, Landroidx/transition/k;->I:[Landroid/animation/Animator;

    iput-object v2, p0, Landroidx/transition/k;->y:[Landroid/animation/Animator;

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_0

    aget-object v2, v1, p1

    const/4 v3, 0x0

    aput-object v3, v1, p1

    invoke-virtual {v2}, Landroid/animation/Animator;->resume()V

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Landroidx/transition/k;->y:[Landroid/animation/Animator;

    sget-object p1, Landroidx/transition/k$g;->e:Landroidx/transition/k$g;

    invoke-virtual {p0, p1, v0}, Landroidx/transition/k;->X(Landroidx/transition/k$g;Z)V

    :cond_1
    iput-boolean v0, p0, Landroidx/transition/k;->A:Z

    :cond_2
    return-void
.end method

.method protected f(Landroid/animation/Animator;)V
    .locals 4

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/transition/k;->r()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/transition/k;->t()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Landroidx/transition/k;->t()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    :cond_1
    invoke-virtual {p0}, Landroidx/transition/k;->F()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    invoke-virtual {p0}, Landroidx/transition/k;->F()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setStartDelay(J)V

    :cond_2
    invoke-virtual {p0}, Landroidx/transition/k;->w()Landroid/animation/TimeInterpolator;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/transition/k;->w()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_3
    new-instance v0, Landroidx/transition/k$c;

    invoke-direct {v0, p0}, Landroidx/transition/k$c;-><init>(Landroidx/transition/k;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    :goto_0
    return-void
.end method

.method protected f0()V
    .locals 4

    invoke-virtual {p0}, Landroidx/transition/k;->m0()V

    invoke-static {}, Landroidx/transition/k;->E()Lo/a;

    move-result-object v0

    iget-object v1, p0, Landroidx/transition/k;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {v0, v2}, Lo/a;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Landroidx/transition/k;->m0()V

    invoke-direct {p0, v2, v0}, Landroidx/transition/k;->e0(Landroid/animation/Animator;Lo/a;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/transition/k;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Landroidx/transition/k;->r()V

    return-void
.end method

.method public g0(J)Landroidx/transition/k;
    .locals 0

    iput-wide p1, p0, Landroidx/transition/k;->c:J

    return-object p0
.end method

.method public abstract h(Landroidx/transition/v;)V
.end method

.method public h0(Landroidx/transition/k$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/transition/k;->F:Landroidx/transition/k$e;

    return-void
.end method

.method public i0(Landroid/animation/TimeInterpolator;)Landroidx/transition/k;
    .locals 0

    iput-object p1, p0, Landroidx/transition/k;->d:Landroid/animation/TimeInterpolator;

    return-object p0
.end method

.method public j0(Landroidx/transition/g;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Landroidx/transition/k;->N:Landroidx/transition/g;

    iput-object p1, p0, Landroidx/transition/k;->H:Landroidx/transition/g;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Landroidx/transition/k;->H:Landroidx/transition/g;

    :goto_0
    return-void
.end method

.method k(Landroidx/transition/v;)V
    .locals 0

    return-void
.end method

.method public k0(Landroidx/transition/s;)V
    .locals 0

    return-void
.end method

.method public abstract l(Landroidx/transition/v;)V
.end method

.method public l0(J)Landroidx/transition/k;
    .locals 0

    iput-wide p1, p0, Landroidx/transition/k;->b:J

    return-object p0
.end method

.method m(Landroid/view/ViewGroup;Z)V
    .locals 5

    invoke-virtual {p0, p2}, Landroidx/transition/k;->n(Z)V

    iget-object v0, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    iget-object v0, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    :cond_0
    iget-object v0, p0, Landroidx/transition/k;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Landroidx/transition/k;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1, p2}, Landroidx/transition/k;->i(Landroid/view/View;Z)V

    goto/16 :goto_7

    :cond_3
    :goto_0
    move v0, v1

    :goto_1
    iget-object v2, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_7

    iget-object v2, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v3, Landroidx/transition/v;

    invoke-direct {v3, v2}, Landroidx/transition/v;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_4

    invoke-virtual {p0, v3}, Landroidx/transition/k;->l(Landroidx/transition/v;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v3}, Landroidx/transition/k;->h(Landroidx/transition/v;)V

    :goto_2
    iget-object v4, v3, Landroidx/transition/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v3}, Landroidx/transition/k;->k(Landroidx/transition/v;)V

    if-eqz p2, :cond_5

    iget-object v4, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    invoke-static {v4, v2, v3}, Landroidx/transition/k;->e(Landroidx/transition/w;Landroid/view/View;Landroidx/transition/v;)V

    goto :goto_3

    :cond_5
    iget-object v4, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    invoke-static {v4, v2, v3}, Landroidx/transition/k;->e(Landroidx/transition/w;Landroid/view/View;Landroidx/transition/v;)V

    :cond_6
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    move p1, v1

    :goto_4
    iget-object v0, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_a

    iget-object v0, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    new-instance v2, Landroidx/transition/v;

    invoke-direct {v2, v0}, Landroidx/transition/v;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_8

    invoke-virtual {p0, v2}, Landroidx/transition/k;->l(Landroidx/transition/v;)V

    goto :goto_5

    :cond_8
    invoke-virtual {p0, v2}, Landroidx/transition/k;->h(Landroidx/transition/v;)V

    :goto_5
    iget-object v3, v2, Landroidx/transition/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v2}, Landroidx/transition/k;->k(Landroidx/transition/v;)V

    if-eqz p2, :cond_9

    iget-object v3, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    invoke-static {v3, v0, v2}, Landroidx/transition/k;->e(Landroidx/transition/w;Landroid/view/View;Landroidx/transition/v;)V

    goto :goto_6

    :cond_9
    iget-object v3, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    invoke-static {v3, v0, v2}, Landroidx/transition/k;->e(Landroidx/transition/w;Landroid/view/View;Landroidx/transition/v;)V

    :goto_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_a
    :goto_7
    if-nez p2, :cond_d

    iget-object p1, p0, Landroidx/transition/k;->G:Lo/a;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lo/V;->size()I

    move-result p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(I)V

    move v0, v1

    :goto_8
    if-ge v0, p1, :cond_b

    iget-object v2, p0, Landroidx/transition/k;->G:Lo/a;

    invoke-virtual {v2, v0}, Lo/V;->h(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    iget-object v3, v3, Landroidx/transition/w;->d:Lo/a;

    invoke-virtual {v3, v2}, Lo/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_b
    :goto_9
    if-ge v1, p1, :cond_d

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_c

    iget-object v2, p0, Landroidx/transition/k;->G:Lo/a;

    invoke-virtual {v2, v1}, Lo/V;->l(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    iget-object v3, v3, Landroidx/transition/w;->d:Lo/a;

    invoke-virtual {v3, v2, v0}, Lo/V;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_d
    return-void
.end method

.method protected m0()V
    .locals 2

    iget v0, p0, Landroidx/transition/k;->z:I

    if-nez v0, :cond_0

    sget-object v0, Landroidx/transition/k$g;->a:Landroidx/transition/k$g;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/transition/k;->X(Landroidx/transition/k$g;Z)V

    iput-boolean v1, p0, Landroidx/transition/k;->B:Z

    :cond_0
    iget v0, p0, Landroidx/transition/k;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/transition/k;->z:I

    return-void
.end method

.method n(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    iget-object p1, p1, Landroidx/transition/w;->a:Lo/a;

    invoke-virtual {p1}, Lo/V;->clear()V

    iget-object p1, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    iget-object p1, p1, Landroidx/transition/w;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    iget-object p1, p1, Landroidx/transition/w;->c:Lo/t;

    invoke-virtual {p1}, Lo/t;->b()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    iget-object p1, p1, Landroidx/transition/w;->a:Lo/a;

    invoke-virtual {p1}, Lo/V;->clear()V

    iget-object p1, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    iget-object p1, p1, Landroidx/transition/w;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    iget-object p1, p1, Landroidx/transition/w;->c:Lo/t;

    invoke-virtual {p1}, Lo/t;->b()V

    :goto_0
    return-void
.end method

.method n0(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "@"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/transition/k;->c:J

    const-wide/16 v3, -0x1

    cmp-long p1, v1, v3

    const-string v1, ") "

    if-eqz p1, :cond_0

    const-string p1, "dur("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, Landroidx/transition/k;->c:J

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-wide v5, p0, Landroidx/transition/k;->b:J

    cmp-long p1, v5, v3

    if-eqz p1, :cond_1

    const-string p1, "dly("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Landroidx/transition/k;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object p1, p0, Landroidx/transition/k;->d:Landroid/animation/TimeInterpolator;

    if-eqz p1, :cond_2

    const-string p1, "interp("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/transition/k;->d:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object p1, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-gtz p1, :cond_3

    iget-object p1, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_8

    :cond_3
    const-string p1, "tgts("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const-string v1, ", "

    const/4 v2, 0x0

    if-lez p1, :cond_5

    move p1, v2

    :goto_0
    iget-object v3, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge p1, v3, :cond_5

    if-lez p1, :cond_4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v3, p0, Landroidx/transition/k;->e:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_7

    :goto_1
    iget-object p1, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v2, p1, :cond_7

    if-lez v2, :cond_6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object p1, p0, Landroidx/transition/k;->f:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public o()Landroidx/transition/k;
    .locals 2

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/k;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Landroidx/transition/k;->E:Ljava/util/ArrayList;

    new-instance v1, Landroidx/transition/w;

    invoke-direct {v1}, Landroidx/transition/w;-><init>()V

    iput-object v1, v0, Landroidx/transition/k;->p:Landroidx/transition/w;

    new-instance v1, Landroidx/transition/w;

    invoke-direct {v1}, Landroidx/transition/w;-><init>()V

    iput-object v1, v0, Landroidx/transition/k;->q:Landroidx/transition/w;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    iput-object v1, v0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    iput-object p0, v0, Landroidx/transition/k;->C:Landroidx/transition/k;

    iput-object v1, v0, Landroidx/transition/k;->D:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public p(Landroid/view/ViewGroup;Landroidx/transition/v;Landroidx/transition/v;)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method q(Landroid/view/ViewGroup;Landroidx/transition/w;Landroidx/transition/w;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 18

    move-object/from16 v7, p0

    invoke-static {}, Landroidx/transition/k;->E()Lo/a;

    move-result-object v8

    new-instance v9, Landroid/util/SparseIntArray;

    invoke-direct {v9}, Landroid/util/SparseIntArray;-><init>()V

    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Landroidx/transition/k;->D()Landroidx/transition/k;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v10, :cond_b

    move-object/from16 v13, p4

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/v;

    move-object/from16 v14, p5

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/v;

    if-eqz v0, :cond_0

    iget-object v3, v0, Landroidx/transition/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v0, 0x0

    :cond_0
    if-eqz v1, :cond_1

    iget-object v3, v1, Landroidx/transition/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v1, 0x0

    :cond_1
    if-nez v0, :cond_4

    if-nez v1, :cond_4

    :cond_2
    move-object/from16 v15, p1

    :cond_3
    move/from16 p2, v10

    goto/16 :goto_5

    :cond_4
    if-eqz v0, :cond_5

    if-eqz v1, :cond_5

    invoke-virtual {v7, v0, v1}, Landroidx/transition/k;->N(Landroidx/transition/v;Landroidx/transition/v;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_5
    move-object/from16 v15, p1

    invoke-virtual {v7, v15, v0, v1}, Landroidx/transition/k;->p(Landroid/view/ViewGroup;Landroidx/transition/v;Landroidx/transition/v;)Landroid/animation/Animator;

    move-result-object v3

    if-eqz v3, :cond_3

    if-eqz v1, :cond_a

    iget-object v0, v1, Landroidx/transition/v;->b:Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Landroidx/transition/k;->L()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    array-length v4, v1

    if-lez v4, :cond_9

    new-instance v4, Landroidx/transition/v;

    invoke-direct {v4, v0}, Landroidx/transition/v;-><init>(Landroid/view/View;)V

    move-object/from16 v6, p3

    iget-object v5, v6, Landroidx/transition/w;->a:Lo/a;

    invoke-virtual {v5, v0}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/transition/v;

    if-eqz v5, :cond_6

    const/4 v2, 0x0

    :goto_1
    array-length v11, v1

    if-ge v2, v11, :cond_6

    iget-object v11, v4, Landroidx/transition/v;->a:Ljava/util/Map;

    move-object/from16 v16, v3

    aget-object v3, v1, v2

    move-object/from16 v17, v1

    iget-object v1, v5, Landroidx/transition/v;->a:Ljava/util/Map;

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v11, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v3, v16

    move-object/from16 v1, v17

    goto :goto_1

    :cond_6
    move-object/from16 v16, v3

    invoke-virtual {v8}, Lo/V;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v1, :cond_8

    invoke-virtual {v8, v2}, Lo/V;->h(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    invoke-virtual {v8, v3}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/transition/k$d;

    iget-object v5, v3, Landroidx/transition/k$d;->c:Landroidx/transition/v;

    if-eqz v5, :cond_7

    iget-object v5, v3, Landroidx/transition/k$d;->a:Landroid/view/View;

    if-ne v5, v0, :cond_7

    iget-object v5, v3, Landroidx/transition/k$d;->b:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Landroidx/transition/k;->z()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v3, v3, Landroidx/transition/k$d;->c:Landroidx/transition/v;

    invoke-virtual {v3, v4}, Landroidx/transition/v;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v2, 0x0

    goto :goto_3

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_8
    move-object/from16 v2, v16

    goto :goto_3

    :cond_9
    move-object/from16 v6, p3

    move-object/from16 v16, v3

    move-object/from16 v2, v16

    const/4 v4, 0x0

    :goto_3
    move-object v1, v0

    move-object v11, v2

    move-object v5, v4

    goto :goto_4

    :cond_a
    move-object/from16 v6, p3

    move-object/from16 v16, v3

    iget-object v0, v0, Landroidx/transition/v;->b:Landroid/view/View;

    move-object v1, v0

    move-object/from16 v11, v16

    const/4 v5, 0x0

    :goto_4
    if-eqz v11, :cond_3

    new-instance v4, Landroidx/transition/k$d;

    invoke-virtual/range {p0 .. p0}, Landroidx/transition/k;->z()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object v16

    move-object v0, v4

    move-object/from16 v3, p0

    move/from16 p2, v10

    move-object v10, v4

    move-object/from16 v4, v16

    move-object v6, v11

    invoke-direct/range {v0 .. v6}, Landroidx/transition/k$d;-><init>(Landroid/view/View;Ljava/lang/String;Landroidx/transition/k;Landroid/view/WindowId;Landroidx/transition/v;Landroid/animation/Animator;)V

    invoke-virtual {v8, v11, v10}, Lo/V;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v7, Landroidx/transition/k;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5
    add-int/lit8 v12, v12, 0x1

    move/from16 v10, p2

    goto/16 :goto_0

    :cond_b
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    if-eqz v0, :cond_c

    const/4 v11, 0x0

    :goto_6
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    if-ge v11, v0, :cond_c

    invoke-virtual {v9, v11}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v0

    iget-object v1, v7, Landroidx/transition/k;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/Animator;

    invoke-virtual {v8, v0}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/k$d;

    invoke-virtual {v9, v11}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v1

    int-to-long v1, v1

    const-wide v3, 0x7fffffffffffffffL

    sub-long/2addr v1, v3

    iget-object v3, v0, Landroidx/transition/k$d;->f:Landroid/animation/Animator;

    invoke-virtual {v3}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v3

    add-long/2addr v1, v3

    iget-object v0, v0, Landroidx/transition/k$d;->f:Landroid/animation/Animator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setStartDelay(J)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    :cond_c
    return-void
.end method

.method protected r()V
    .locals 4

    iget v0, p0, Landroidx/transition/k;->z:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Landroidx/transition/k;->z:I

    if-nez v0, :cond_4

    sget-object v0, Landroidx/transition/k$g;->b:Landroidx/transition/k$g;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Landroidx/transition/k;->X(Landroidx/transition/k$g;Z)V

    move v0, v2

    :goto_0
    iget-object v3, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    iget-object v3, v3, Landroidx/transition/w;->c:Lo/t;

    invoke-virtual {v3}, Lo/t;->o()I

    move-result v3

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Landroidx/transition/k;->p:Landroidx/transition/w;

    iget-object v3, v3, Landroidx/transition/w;->c:Lo/t;

    invoke-virtual {v3, v0}, Lo/t;->p(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v2}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_1
    iget-object v3, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    iget-object v3, v3, Landroidx/transition/w;->c:Lo/t;

    invoke-virtual {v3}, Lo/t;->o()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Landroidx/transition/k;->q:Landroidx/transition/w;

    iget-object v3, v3, Landroidx/transition/w;->c:Lo/t;

    invoke-virtual {v3, v0}, Lo/t;->p(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v2}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iput-boolean v1, p0, Landroidx/transition/k;->B:Z

    :cond_4
    return-void
.end method

.method public t()J
    .locals 2

    iget-wide v0, p0, Landroidx/transition/k;->c:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0}, Landroidx/transition/k;->n0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Landroidx/transition/k$e;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->F:Landroidx/transition/k$e;

    return-object v0
.end method

.method public w()Landroid/animation/TimeInterpolator;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->d:Landroid/animation/TimeInterpolator;

    return-object v0
.end method

.method x(Landroid/view/View;Z)Landroidx/transition/v;
    .locals 5

    iget-object v0, p0, Landroidx/transition/k;->r:Landroidx/transition/t;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/transition/k;->x(Landroid/view/View;Z)Landroidx/transition/v;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/transition/v;

    if-nez v4, :cond_3

    return-object v1

    :cond_3
    iget-object v4, v4, Landroidx/transition/v;->b:Landroid/view/View;

    if-ne v4, p1, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    const/4 v3, -0x1

    :goto_2
    if-ltz v3, :cond_7

    if-eqz p2, :cond_6

    iget-object p1, p0, Landroidx/transition/k;->u:Ljava/util/ArrayList;

    goto :goto_3

    :cond_6
    iget-object p1, p0, Landroidx/transition/k;->t:Ljava/util/ArrayList;

    :goto_3
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/transition/v;

    :cond_7
    return-object v1
.end method

.method public z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/transition/k;->a:Ljava/lang/String;

    return-object v0
.end method
