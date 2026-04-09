.class public final Lik2;
.super Lel2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final l:Landroid/content/Context;

.field public final m:Landroid/view/View;

.field public final n:Lag2;

.field public final o:Lb83;

.field public final p:Ldl2;

.field public final q:Lyr2;

.field public final r:Lyp2;

.field public final s:Lz94;

.field public final t:Ljava/util/concurrent/Executor;

.field public u:Lxe4;


# direct methods
.method public constructor <init>(Lko1;Landroid/content/Context;Lb83;Landroid/view/View;Lag2;Ldl2;Lyr2;Lyp2;Lz94;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lel2;-><init>(Lko1;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lik2;->l:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p4, p0, Lik2;->m:Landroid/view/View;

    .line 7
    .line 8
    iput-object p5, p0, Lik2;->n:Lag2;

    .line 9
    .line 10
    iput-object p3, p0, Lik2;->o:Lb83;

    .line 11
    .line 12
    iput-object p6, p0, Lik2;->p:Ldl2;

    .line 13
    .line 14
    iput-object p7, p0, Lik2;->q:Lyr2;

    .line 15
    .line 16
    iput-object p8, p0, Lik2;->r:Lyp2;

    .line 17
    .line 18
    iput-object p9, p0, Lik2;->s:Lz94;

    .line 19
    .line 20
    iput-object p10, p0, Lik2;->t:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    new-instance v0, Lfu1;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lik2;->t:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0}, Lel2;->a()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final c()Lb83;
    .locals 5

    .line 1
    iget-object v0, p0, Lik2;->u:Lxe4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v2, v0, Lxe4;->n:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    new-instance v0, Lb83;

    .line 11
    .line 12
    const/4 v2, -0x3

    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v0, v2, v1, v3}, Lb83;-><init>(IIZ)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    iget v2, v0, Lxe4;->j:I

    .line 19
    .line 20
    iget v0, v0, Lxe4;->g:I

    .line 21
    .line 22
    new-instance v3, Lb83;

    .line 23
    .line 24
    invoke-direct {v3, v2, v0, v1}, Lb83;-><init>(IIZ)V

    .line 25
    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_1
    iget-object v0, p0, Lel2;->b:La83;

    .line 29
    .line 30
    iget-boolean v2, v0, La83;->c0:Z

    .line 31
    .line 32
    if-eqz v2, :cond_4

    .line 33
    .line 34
    iget-object v2, v0, La83;->a:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    const-string v4, "FirstParty"

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    new-instance v0, Lb83;

    .line 64
    .line 65
    iget-object v2, p0, Lik2;->m:Landroid/view/View;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-direct {v0, v3, v2, v1}, Lb83;-><init>(IIZ)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_4
    :goto_0
    iget-object v0, v0, La83;->r:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lb83;

    .line 86
    .line 87
    return-object v0
.end method

.method public final d()I
    .locals 3

    .line 1
    sget-object v0, Lmz1;->z8:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lel2;->b:La83;

    .line 20
    .line 21
    iget-boolean v0, v0, La83;->g0:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lmz1;->A8:Liz1;

    .line 26
    .line 27
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    return v0

    .line 43
    :cond_0
    iget-object v0, p0, Lel2;->a:Lh83;

    .line 44
    .line 45
    iget-object v0, v0, Lh83;->b:Lp21;

    .line 46
    .line 47
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lc83;

    .line 50
    .line 51
    iget v0, v0, Lc83;->c:I

    .line 52
    .line 53
    return v0
.end method
