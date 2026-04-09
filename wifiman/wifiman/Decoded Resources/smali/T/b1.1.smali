.class public final LT/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;
.implements Ljava/lang/Iterable;
.implements Lnh/a;


# instance fields
.field private a:[I

.field private b:I

.field private c:[Ljava/lang/Object;

.field private d:I

.field private e:I

.field private f:Z

.field private g:I

.field private h:Ljava/util/ArrayList;

.field private i:Ljava/util/HashMap;

.field private j:Lo/z;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [I

    iput-object v1, p0, LT/b1;->a:[I

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, LT/b1;->c:[Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LT/b1;->h:Ljava/util/ArrayList;

    return-void
.end method

.method private final L(I)LT/d;
    .locals 2

    iget-boolean v0, p0, LT/b1;->f:Z

    if-eqz v0, :cond_0

    const-string v0, "use active SlotWriter to crate an anchor for location instead"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    if-ltz p1, :cond_1

    iget v0, p0, LT/b1;->b:I

    if-ge p1, v0, :cond_1

    iget-object v1, p0, LT/b1;->h:Ljava/util/ArrayList;

    invoke-static {v1, p1, v0}, LT/d1;->f(Ljava/util/ArrayList;II)LT/d;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-boolean v0, p0, LT/b1;->f:Z

    return v0
.end method

.method public final C(ILT/d;)Z
    .locals 3

    iget-boolean v0, p0, LT/b1;->f:Z

    if-eqz v0, :cond_0

    const-string v0, "Writer is active"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_1

    iget v2, p0, LT/b1;->b:I

    if-ge p1, v2, :cond_1

    move v2, v0

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    if-nez v2, :cond_2

    const-string v2, "Invalid group index"

    invoke-static {v2}, LT/o;->r(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p2}, LT/b1;->H(LT/d;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, LT/b1;->a:[I

    invoke-static {v2, p1}, LT/d1;->h([II)I

    move-result v2

    add-int/2addr v2, p1

    invoke-virtual {p2}, LT/d;->a()I

    move-result p2

    if-gt p1, p2, :cond_3

    if-ge p2, v2, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    return v0
.end method

.method public final D()LT/a1;
    .locals 2

    iget-boolean v0, p0, LT/b1;->f:Z

    if-nez v0, :cond_0

    iget v0, p0, LT/b1;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LT/b1;->e:I

    new-instance v0, LT/a1;

    invoke-direct {v0, p0}, LT/a1;-><init>(LT/b1;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read while a writer is pending"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final G()LT/e1;
    .locals 2

    iget-boolean v0, p0, LT/b1;->f:Z

    if-eqz v0, :cond_0

    const-string v0, "Cannot start a writer when another writer is pending"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, LT/b1;->e:I

    const/4 v1, 0x1

    if-gtz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "Cannot start a writer when a reader is pending"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_2
    iput-boolean v1, p0, LT/b1;->f:Z

    iget v0, p0, LT/b1;->g:I

    add-int/2addr v0, v1

    iput v0, p0, LT/b1;->g:I

    new-instance v0, LT/e1;

    invoke-direct {v0, p0}, LT/e1;-><init>(LT/b1;)V

    return-object v0
.end method

.method public final H(LT/d;)Z
    .locals 3

    invoke-virtual {p1}, LT/d;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/b1;->h:Ljava/util/ArrayList;

    invoke-virtual {p1}, LT/d;->a()I

    move-result v1

    iget v2, p0, LT/b1;->b:I

    invoke-static {v0, v1, v2}, LT/d1;->t(Ljava/util/ArrayList;II)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v1, p0, LT/b1;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final I([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lo/z;)V
    .locals 0

    iput-object p1, p0, LT/b1;->a:[I

    iput p2, p0, LT/b1;->b:I

    iput-object p3, p0, LT/b1;->c:[Ljava/lang/Object;

    iput p4, p0, LT/b1;->d:I

    iput-object p5, p0, LT/b1;->h:Ljava/util/ArrayList;

    iput-object p6, p0, LT/b1;->i:Ljava/util/HashMap;

    iput-object p7, p0, LT/b1;->j:Lo/z;

    return-void
.end method

.method public final J(I)LT/U;
    .locals 2

    iget-object v0, p0, LT/b1;->i:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, LT/b1;->L(I)LT/d;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LT/U;

    :cond_0
    return-object v1
.end method

.method public final b(I)LT/d;
    .locals 4

    iget-boolean v0, p0, LT/b1;->f:Z

    if-eqz v0, :cond_0

    const-string v0, "use active SlotWriter to create an anchor location instead"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_1

    iget v2, p0, LT/b1;->b:I

    if-ge p1, v2, :cond_1

    move v0, v1

    :cond_1
    if-nez v0, :cond_2

    const-string v0, "Parameter index is out of range"

    invoke-static {v0}, LT/B0;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, LT/b1;->h:Ljava/util/ArrayList;

    iget v2, p0, LT/b1;->b:I

    invoke-static {v0, p1, v2}, LT/d1;->t(Ljava/util/ArrayList;II)I

    move-result v2

    if-gez v2, :cond_3

    new-instance v3, LT/d;

    invoke-direct {v3, p1}, LT/d;-><init>(I)V

    add-int/2addr v2, v1

    neg-int p1, v2

    invoke-virtual {v0, p1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, LT/d;

    :goto_0
    return-object v3
.end method

.method public final e(LT/d;)I
    .locals 1

    iget-boolean v0, p0, LT/b1;->f:Z

    if-eqz v0, :cond_0

    const-string v0, "Use active SlotWriter to determine anchor location instead"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, LT/d;->b()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Anchor refers to a group that was removed"

    invoke-static {v0}, LT/B0;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, LT/d;->a()I

    move-result p1

    return p1
.end method

.method public final f(LT/a1;Ljava/util/HashMap;)V
    .locals 0

    invoke-virtual {p1}, LT/a1;->y()LT/b1;

    move-result-object p1

    if-ne p1, p0, :cond_0

    iget p1, p0, LT/b1;->e:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "Unexpected reader close()"

    invoke-static {p1}, LT/o;->r(Ljava/lang/String;)V

    :cond_1
    iget p1, p0, LT/b1;->e:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LT/b1;->e:I

    if-eqz p2, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, LT/b1;->i:Ljava/util/HashMap;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iput-object p2, p0, LT/b1;->i:Ljava/util/HashMap;

    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    goto :goto_3

    :goto_2
    monitor-exit p0

    throw p1

    :cond_3
    :goto_3
    return-void
.end method

.method public final g(LT/e1;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lo/z;)V
    .locals 9

    move-object v8, p0

    invoke-virtual {p1}, LT/e1;->f0()LT/b1;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v0, v8, :cond_0

    iget-boolean v0, v8, LT/b1;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Unexpected writer close()"

    invoke-static {v0}, LT/B0;->a(Ljava/lang/String;)V

    :cond_1
    iput-boolean v1, v8, LT/b1;->f:Z

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-virtual/range {v0 .. v7}, LT/b1;->I([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lo/z;)V

    return-void
.end method

.method public final i()V
    .locals 4

    new-instance v0, Lo/z;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/z;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LT/b1;->j:Lo/z;

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget v0, p0, LT/b1;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, LT/S;

    const/4 v1, 0x0

    iget v2, p0, LT/b1;->b:I

    invoke-direct {v0, p0, v1, v2}, LT/S;-><init>(LT/b1;II)V

    return-object v0
.end method

.method public final j()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LT/b1;->i:Ljava/util/HashMap;

    return-void
.end method

.method public final k()Z
    .locals 2

    iget v0, p0, LT/b1;->b:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    iget-object v0, p0, LT/b1;->a:[I

    invoke-static {v0, v1}, LT/d1;->c([II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final q()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, LT/b1;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final s()Lo/z;
    .locals 1

    iget-object v0, p0, LT/b1;->j:Lo/z;

    return-object v0
.end method

.method public final u()[I
    .locals 1

    iget-object v0, p0, LT/b1;->a:[I

    return-object v0
.end method

.method public final v()I
    .locals 1

    iget v0, p0, LT/b1;->b:I

    return v0
.end method

.method public final w()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT/b1;->c:[Ljava/lang/Object;

    return-object v0
.end method

.method public final x()I
    .locals 1

    iget v0, p0, LT/b1;->d:I

    return v0
.end method

.method public final y()Ljava/util/HashMap;
    .locals 1

    iget-object v0, p0, LT/b1;->i:Ljava/util/HashMap;

    return-object v0
.end method

.method public final z()I
    .locals 1

    iget v0, p0, LT/b1;->g:I

    return v0
.end method
