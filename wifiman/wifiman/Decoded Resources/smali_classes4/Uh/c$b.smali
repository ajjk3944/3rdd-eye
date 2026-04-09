.class public final LUh/c$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private A:Ljava/util/List;

.field private B:LUh/w;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/util/List;

.field private i:Ljava/util/List;

.field private j:Ljava/util/List;

.field private k:Ljava/util/List;

.field private l:Ljava/util/List;

.field private m:Ljava/util/List;

.field private n:Ljava/util/List;

.field private o:Ljava/util/List;

.field private p:Ljava/util/List;

.field private q:Ljava/util/List;

.field private r:Ljava/util/List;

.field private s:Ljava/util/List;

.field private t:I

.field private u:LUh/q;

.field private v:I

.field private w:Ljava/util/List;

.field private x:Ljava/util/List;

.field private y:Ljava/util/List;

.field private z:LUh/t;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, LUh/c$b;->e:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->h:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->i:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->j:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->k:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->l:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->m:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->n:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->o:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->p:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->q:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->r:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->s:Ljava/util/List;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->u:LUh/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->w:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->x:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->y:Ljava/util/List;

    invoke-static {}, LUh/t;->P()LUh/t;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->z:LUh/t;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->A:Ljava/util/List;

    invoke-static {}, LUh/w;->J()LUh/w;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->B:LUh/w;

    invoke-direct {p0}, LUh/c$b;->R()V

    return-void
.end method

.method private A()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->m:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->m:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->l:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->l:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private D()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x2000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->r:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->r:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private E()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x400

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->o:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->o:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private F()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->w:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->w:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private G()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/high16 v1, 0x100000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->y:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->y:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private H()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->x:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->x:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private I()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->k:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->k:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private K()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->p:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->p:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private L()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x4000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->s:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->s:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private M()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->j:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->j:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private N()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->i:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->i:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private O()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x1000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->q:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->q:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private P()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->h:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->h:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private Q()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->A:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->A:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method

.method private R()V
    .locals 0

    return-void
.end method

.method static synthetic r()LUh/c$b;
    .locals 1

    invoke-static {}, LUh/c$b;->x()LUh/c$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/c$b;
    .locals 1

    new-instance v0, LUh/c$b;

    invoke-direct {v0}, LUh/c$b;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/c$b;->n:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/c$b;->n:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    :cond_0
    return-void
.end method


# virtual methods
.method public S(LUh/c;)LUh/c$b;
    .locals 2

    invoke-static {}, LUh/c;->I1()LUh/c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/c;->v2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/c;->N1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/c$b;->Z(I)LUh/c$b;

    :cond_1
    invoke-virtual {p1}, LUh/c;->w2()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/c;->O1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/c$b;->a0(I)LUh/c$b;

    :cond_2
    invoke-virtual {p1}, LUh/c;->u2()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/c;->A1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/c$b;->Y(I)LUh/c$b;

    :cond_3
    invoke-static {p1}, LUh/c;->k1(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, LUh/c$b;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, LUh/c;->k1(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->h:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_0

    :cond_4
    invoke-direct {p0}, LUh/c$b;->P()V

    iget-object v0, p0, LUh/c$b;->h:Ljava/util/List;

    invoke-static {p1}, LUh/c;->k1(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_5
    :goto_0
    invoke-static {p1}, LUh/c;->m1(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, LUh/c$b;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p1}, LUh/c;->m1(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->i:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_1

    :cond_6
    invoke-direct {p0}, LUh/c$b;->N()V

    iget-object v0, p0, LUh/c$b;->i:Ljava/util/List;

    invoke-static {p1}, LUh/c;->m1(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    :goto_1
    invoke-static {p1}, LUh/c;->o1(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, LUh/c$b;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p1}, LUh/c;->o1(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->j:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_2

    :cond_8
    invoke-direct {p0}, LUh/c$b;->M()V

    iget-object v0, p0, LUh/c$b;->j:Ljava/util/List;

    invoke-static {p1}, LUh/c;->o1(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_9
    :goto_2
    invoke-static {p1}, LUh/c;->q1(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, LUh/c$b;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1}, LUh/c;->q1(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->k:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_3

    :cond_a
    invoke-direct {p0}, LUh/c$b;->I()V

    iget-object v0, p0, LUh/c$b;->k:Ljava/util/List;

    invoke-static {p1}, LUh/c;->q1(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_b
    :goto_3
    invoke-static {p1}, LUh/c;->s1(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, LUh/c$b;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {p1}, LUh/c;->s1(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->l:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_4

    :cond_c
    invoke-direct {p0}, LUh/c$b;->B()V

    iget-object v0, p0, LUh/c$b;->l:Ljava/util/List;

    invoke-static {p1}, LUh/c;->s1(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_d
    :goto_4
    invoke-static {p1}, LUh/c;->u1(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, LUh/c$b;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {p1}, LUh/c;->u1(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->m:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_5

    :cond_e
    invoke-direct {p0}, LUh/c$b;->A()V

    iget-object v0, p0, LUh/c$b;->m:Ljava/util/List;

    invoke-static {p1}, LUh/c;->u1(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_f
    :goto_5
    invoke-static {p1}, LUh/c;->w1(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, LUh/c$b;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {p1}, LUh/c;->w1(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->n:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_6

    :cond_10
    invoke-direct {p0}, LUh/c$b;->z()V

    iget-object v0, p0, LUh/c$b;->n:Ljava/util/List;

    invoke-static {p1}, LUh/c;->w1(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_11
    :goto_6
    invoke-static {p1}, LUh/c;->y1(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, LUh/c$b;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {p1}, LUh/c;->y1(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->o:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_7

    :cond_12
    invoke-direct {p0}, LUh/c$b;->E()V

    iget-object v0, p0, LUh/c$b;->o:Ljava/util/List;

    invoke-static {p1}, LUh/c;->y1(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_13
    :goto_7
    invoke-static {p1}, LUh/c;->f0(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    iget-object v0, p0, LUh/c$b;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {p1}, LUh/c;->f0(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->p:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit16 v0, v0, -0x801

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_8

    :cond_14
    invoke-direct {p0}, LUh/c$b;->K()V

    iget-object v0, p0, LUh/c$b;->p:Ljava/util/List;

    invoke-static {p1}, LUh/c;->f0(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_15
    :goto_8
    invoke-static {p1}, LUh/c;->C0(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, LUh/c$b;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {p1}, LUh/c;->C0(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->q:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit16 v0, v0, -0x1001

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_9

    :cond_16
    invoke-direct {p0}, LUh/c$b;->O()V

    iget-object v0, p0, LUh/c$b;->q:Ljava/util/List;

    invoke-static {p1}, LUh/c;->C0(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_17
    :goto_9
    invoke-static {p1}, LUh/c;->G0(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    iget-object v0, p0, LUh/c$b;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {p1}, LUh/c;->G0(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->r:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_a

    :cond_18
    invoke-direct {p0}, LUh/c$b;->D()V

    iget-object v0, p0, LUh/c$b;->r:Ljava/util/List;

    invoke-static {p1}, LUh/c;->G0(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_19
    :goto_a
    invoke-static {p1}, LUh/c;->M0(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, LUh/c$b;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-static {p1}, LUh/c;->M0(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->s:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_b

    :cond_1a
    invoke-direct {p0}, LUh/c$b;->L()V

    iget-object v0, p0, LUh/c$b;->s:Ljava/util/List;

    invoke-static {p1}, LUh/c;->M0(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1b
    :goto_b
    invoke-virtual {p1}, LUh/c;->x2()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-virtual {p1}, LUh/c;->S1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/c$b;->c0(I)LUh/c$b;

    :cond_1c
    invoke-virtual {p1}, LUh/c;->y2()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {p1}, LUh/c;->T1()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/c$b;->V(LUh/q;)LUh/c$b;

    :cond_1d
    invoke-virtual {p1}, LUh/c;->z2()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual {p1}, LUh/c;->U1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/c$b;->d0(I)LUh/c$b;

    :cond_1e
    invoke-static {p1}, LUh/c;->V0(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_20

    iget-object v0, p0, LUh/c$b;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-static {p1}, LUh/c;->V0(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->w:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    const v1, -0x40001

    and-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_c

    :cond_1f
    invoke-direct {p0}, LUh/c$b;->F()V

    iget-object v0, p0, LUh/c$b;->w:Ljava/util/List;

    invoke-static {p1}, LUh/c;->V0(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_20
    :goto_c
    invoke-static {p1}, LUh/c;->X0(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_22

    iget-object v0, p0, LUh/c$b;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-static {p1}, LUh/c;->X0(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->x:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    const v1, -0x80001

    and-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_d

    :cond_21
    invoke-direct {p0}, LUh/c$b;->H()V

    iget-object v0, p0, LUh/c$b;->x:Ljava/util/List;

    invoke-static {p1}, LUh/c;->X0(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_22
    :goto_d
    invoke-static {p1}, LUh/c;->Z0(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_24

    iget-object v0, p0, LUh/c$b;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-static {p1}, LUh/c;->Z0(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->y:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    const v1, -0x100001

    and-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_e

    :cond_23
    invoke-direct {p0}, LUh/c$b;->G()V

    iget-object v0, p0, LUh/c$b;->y:Ljava/util/List;

    invoke-static {p1}, LUh/c;->Z0(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_24
    :goto_e
    invoke-virtual {p1}, LUh/c;->A2()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-virtual {p1}, LUh/c;->r2()LUh/t;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/c$b;->W(LUh/t;)LUh/c$b;

    :cond_25
    invoke-static {p1}, LUh/c;->c1(LUh/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_27

    iget-object v0, p0, LUh/c$b;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-static {p1}, LUh/c;->c1(LUh/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/c$b;->A:Ljava/util/List;

    iget v0, p0, LUh/c$b;->d:I

    const v1, -0x400001

    and-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    goto :goto_f

    :cond_26
    invoke-direct {p0}, LUh/c$b;->Q()V

    iget-object v0, p0, LUh/c$b;->A:Ljava/util/List;

    invoke-static {p1}, LUh/c;->c1(LUh/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_27
    :goto_f
    invoke-virtual {p1}, LUh/c;->B2()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-virtual {p1}, LUh/c;->t2()LUh/w;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/c$b;->X(LUh/w;)LUh/c$b;

    :cond_28
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/c;->g1(LUh/c;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public U(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/c$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/c;->X:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/c;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/c$b;->S(LUh/c;)LUh/c$b;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object p2

    check-cast p2, LUh/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, LUh/c$b;->S(LUh/c;)LUh/c$b;

    :cond_1
    throw p1
.end method

.method public V(LUh/q;)LUh/c$b;
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/c$b;->u:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/c$b;->u:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/c$b;->u:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/c$b;->u:LUh/q;

    :goto_0
    iget p1, p0, LUh/c$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/c$b;->d:I

    return-object p0
.end method

.method public W(LUh/t;)LUh/c$b;
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/high16 v1, 0x200000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/c$b;->z:LUh/t;

    invoke-static {}, LUh/t;->P()LUh/t;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/c$b;->z:LUh/t;

    invoke-static {v0}, LUh/t;->G0(LUh/t;)LUh/t$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/t$b;->w(LUh/t;)LUh/t$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/t$b;->p()LUh/t;

    move-result-object p1

    iput-object p1, p0, LUh/c$b;->z:LUh/t;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/c$b;->z:LUh/t;

    :goto_0
    iget p1, p0, LUh/c$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/c$b;->d:I

    return-object p0
.end method

.method public X(LUh/w;)LUh/c$b;
    .locals 3

    iget v0, p0, LUh/c$b;->d:I

    const/high16 v1, 0x800000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/c$b;->B:LUh/w;

    invoke-static {}, LUh/w;->J()LUh/w;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/c$b;->B:LUh/w;

    invoke-static {v0}, LUh/w;->d0(LUh/w;)LUh/w$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/w$b;->w(LUh/w;)LUh/w$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/w$b;->p()LUh/w;

    move-result-object p1

    iput-object p1, p0, LUh/c$b;->B:LUh/w;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/c$b;->B:LUh/w;

    :goto_0
    iget p1, p0, LUh/c$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/c$b;->d:I

    return-object p0
.end method

.method public Y(I)LUh/c$b;
    .locals 1

    iget v0, p0, LUh/c$b;->d:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LUh/c$b;->d:I

    iput p1, p0, LUh/c$b;->g:I

    return-object p0
.end method

.method public Z(I)LUh/c$b;
    .locals 1

    iget v0, p0, LUh/c$b;->d:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/c$b;->d:I

    iput p1, p0, LUh/c$b;->e:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/c$b;->t()LUh/c;

    move-result-object v0

    return-object v0
.end method

.method public a0(I)LUh/c$b;
    .locals 1

    iget v0, p0, LUh/c$b;->d:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/c$b;->d:I

    iput p1, p0, LUh/c$b;->f:I

    return-object p0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/c$b;->U(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/c$b;

    move-result-object p1

    return-object p1
.end method

.method public c0(I)LUh/c$b;
    .locals 2

    iget v0, p0, LUh/c$b;->d:I

    const v1, 0x8000

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    iput p1, p0, LUh/c$b;->t:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/c$b;->w()LUh/c$b;

    move-result-object v0

    return-object v0
.end method

.method public d0(I)LUh/c$b;
    .locals 2

    iget v0, p0, LUh/c$b;->d:I

    const/high16 v1, 0x20000

    or-int/2addr v0, v1

    iput v0, p0, LUh/c$b;->d:I

    iput p1, p0, LUh/c$b;->v:I

    return-object p0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/c;

    invoke-virtual {p0, p1}, LUh/c$b;->S(LUh/c;)LUh/c$b;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/c;
    .locals 2

    invoke-virtual {p0}, LUh/c$b;->u()LUh/c;

    move-result-object v0

    invoke-virtual {v0}, LUh/c;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/c;
    .locals 5

    new-instance v0, LUh/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/c;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/c$b;->d:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LUh/c$b;->e:I

    invoke-static {v0, v2}, LUh/c;->h1(LUh/c;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, LUh/c$b;->f:I

    invoke-static {v0, v2}, LUh/c;->i1(LUh/c;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v2, p0, LUh/c$b;->g:I

    invoke-static {v0, v2}, LUh/c;->j1(LUh/c;I)I

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x8

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_3

    iget-object v2, p0, LUh/c$b;->h:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->h:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit8 v2, v2, -0x9

    iput v2, p0, LUh/c$b;->d:I

    :cond_3
    iget-object v2, p0, LUh/c$b;->h:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->l1(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x10

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_4

    iget-object v2, p0, LUh/c$b;->i:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->i:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit8 v2, v2, -0x11

    iput v2, p0, LUh/c$b;->d:I

    :cond_4
    iget-object v2, p0, LUh/c$b;->i:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->n1(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x20

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_5

    iget-object v2, p0, LUh/c$b;->j:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->j:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit8 v2, v2, -0x21

    iput v2, p0, LUh/c$b;->d:I

    :cond_5
    iget-object v2, p0, LUh/c$b;->j:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->p1(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x40

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_6

    iget-object v2, p0, LUh/c$b;->k:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->k:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit8 v2, v2, -0x41

    iput v2, p0, LUh/c$b;->d:I

    :cond_6
    iget-object v2, p0, LUh/c$b;->k:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->r1(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x80

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_7

    iget-object v2, p0, LUh/c$b;->l:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->l:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit16 v2, v2, -0x81

    iput v2, p0, LUh/c$b;->d:I

    :cond_7
    iget-object v2, p0, LUh/c$b;->l:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->t1(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x100

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    iget-object v2, p0, LUh/c$b;->m:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->m:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit16 v2, v2, -0x101

    iput v2, p0, LUh/c$b;->d:I

    :cond_8
    iget-object v2, p0, LUh/c$b;->m:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->v1(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x200

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_9

    iget-object v2, p0, LUh/c$b;->n:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->n:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit16 v2, v2, -0x201

    iput v2, p0, LUh/c$b;->d:I

    :cond_9
    iget-object v2, p0, LUh/c$b;->n:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->x1(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x400

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_a

    iget-object v2, p0, LUh/c$b;->o:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->o:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit16 v2, v2, -0x401

    iput v2, p0, LUh/c$b;->d:I

    :cond_a
    iget-object v2, p0, LUh/c$b;->o:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->z1(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x800

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_b

    iget-object v2, p0, LUh/c$b;->p:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->p:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit16 v2, v2, -0x801

    iput v2, p0, LUh/c$b;->d:I

    :cond_b
    iget-object v2, p0, LUh/c$b;->p:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->q0(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x1000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_c

    iget-object v2, p0, LUh/c$b;->q:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->q:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit16 v2, v2, -0x1001

    iput v2, p0, LUh/c$b;->d:I

    :cond_c
    iget-object v2, p0, LUh/c$b;->q:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->E0(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x2000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_d

    iget-object v2, p0, LUh/c$b;->r:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->r:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit16 v2, v2, -0x2001

    iput v2, p0, LUh/c$b;->d:I

    :cond_d
    iget-object v2, p0, LUh/c$b;->r:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->K0(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/16 v4, 0x4000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_e

    iget-object v2, p0, LUh/c$b;->s:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->s:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    and-int/lit16 v2, v2, -0x4001

    iput v2, p0, LUh/c$b;->d:I

    :cond_e
    iget-object v2, p0, LUh/c$b;->s:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->N0(LUh/c;Ljava/util/List;)Ljava/util/List;

    const v2, 0x8000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_f

    or-int/lit8 v3, v3, 0x8

    :cond_f
    iget v2, p0, LUh/c$b;->t:I

    invoke-static {v0, v2}, LUh/c;->P0(LUh/c;I)I

    const/high16 v2, 0x10000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_10

    or-int/lit8 v3, v3, 0x10

    :cond_10
    iget-object v2, p0, LUh/c$b;->u:LUh/q;

    invoke-static {v0, v2}, LUh/c;->T0(LUh/c;LUh/q;)LUh/q;

    const/high16 v2, 0x20000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_11

    or-int/lit8 v3, v3, 0x20

    :cond_11
    iget v2, p0, LUh/c$b;->v:I

    invoke-static {v0, v2}, LUh/c;->U0(LUh/c;I)I

    iget v2, p0, LUh/c$b;->d:I

    const/high16 v4, 0x40000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_12

    iget-object v2, p0, LUh/c$b;->w:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->w:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const v4, -0x40001

    and-int/2addr v2, v4

    iput v2, p0, LUh/c$b;->d:I

    :cond_12
    iget-object v2, p0, LUh/c$b;->w:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->W0(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/high16 v4, 0x80000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_13

    iget-object v2, p0, LUh/c$b;->x:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->x:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const v4, -0x80001

    and-int/2addr v2, v4

    iput v2, p0, LUh/c$b;->d:I

    :cond_13
    iget-object v2, p0, LUh/c$b;->x:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->Y0(LUh/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const/high16 v4, 0x100000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_14

    iget-object v2, p0, LUh/c$b;->y:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->y:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const v4, -0x100001

    and-int/2addr v2, v4

    iput v2, p0, LUh/c$b;->d:I

    :cond_14
    iget-object v2, p0, LUh/c$b;->y:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->a1(LUh/c;Ljava/util/List;)Ljava/util/List;

    const/high16 v2, 0x200000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_15

    or-int/lit8 v3, v3, 0x40

    :cond_15
    iget-object v2, p0, LUh/c$b;->z:LUh/t;

    invoke-static {v0, v2}, LUh/c;->b1(LUh/c;LUh/t;)LUh/t;

    iget v2, p0, LUh/c$b;->d:I

    const/high16 v4, 0x400000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_16

    iget-object v2, p0, LUh/c$b;->A:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/c$b;->A:Ljava/util/List;

    iget v2, p0, LUh/c$b;->d:I

    const v4, -0x400001

    and-int/2addr v2, v4

    iput v2, p0, LUh/c$b;->d:I

    :cond_16
    iget-object v2, p0, LUh/c$b;->A:Ljava/util/List;

    invoke-static {v0, v2}, LUh/c;->d1(LUh/c;Ljava/util/List;)Ljava/util/List;

    const/high16 v2, 0x800000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_17

    or-int/lit16 v3, v3, 0x80

    :cond_17
    iget-object v1, p0, LUh/c$b;->B:LUh/w;

    invoke-static {v0, v1}, LUh/c;->e1(LUh/c;LUh/w;)LUh/w;

    invoke-static {v0, v3}, LUh/c;->f1(LUh/c;I)I

    return-object v0
.end method

.method public w()LUh/c$b;
    .locals 2

    invoke-static {}, LUh/c$b;->x()LUh/c$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/c$b;->u()LUh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/c$b;->S(LUh/c;)LUh/c$b;

    move-result-object v0

    return-object v0
.end method
