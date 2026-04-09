.class public final Li53;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# static fields
.field public static final k:Ln43;


# instance fields
.field public final a:Lpq3;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Lj23;

.field public final d:Landroid/content/Context;

.field public final e:Ll83;

.field public final f:Lh23;

.field public final g:Lyu2;

.field public final h:Lnw2;

.field public final i:I

.field public final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ln43;

    .line 2
    .line 3
    new-instance v1, Lorg/json/JSONArray;

    .line 4
    .line 5
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, ""

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3}, Ln43;-><init>(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Li53;->k:Ln43;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Lpq3;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/String;Lj23;Landroid/content/Context;Ll83;Lh23;Lyu2;Lnw2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li53;->a:Lpq3;

    .line 5
    .line 6
    iput-object p2, p0, Li53;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    .line 8
    iput-object p3, p0, Li53;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Li53;->c:Lj23;

    .line 11
    .line 12
    iput-object p5, p0, Li53;->d:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p6, p0, Li53;->e:Ll83;

    .line 15
    .line 16
    iput-object p7, p0, Li53;->f:Lh23;

    .line 17
    .line 18
    iput-object p8, p0, Li53;->g:Lyu2;

    .line 19
    .line 20
    iput-object p9, p0, Li53;->h:Lnw2;

    .line 21
    .line 22
    iput p10, p0, Li53;->i:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 4

    .line 1
    iget v0, p0, Li53;->i:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    sget-object v2, Li53;->k:Ln43;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :cond_0
    iget-object v0, p0, Li53;->e:Ll83;

    .line 14
    .line 15
    iget-boolean v1, v0, Ll83;->s:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v0, v0, Ll83;->d:Lpc4;

    .line 20
    .line 21
    invoke-static {v0}, La30;->w(Lpc4;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La30;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, Lmz1;->N1:Liz1;

    .line 30
    .line 31
    sget-object v3, Ltw1;->e:Ltw1;

    .line 32
    .line 33
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/lang/String;

    .line 40
    .line 41
    const-string v3, ","

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    invoke-static {v2}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :cond_1
    new-instance v0, Lof3;

    .line 63
    .line 64
    const/16 v1, 0x17

    .line 65
    .line 66
    invoke-direct {v0, v1, p0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Li53;->a:Lpq3;

    .line 70
    .line 71
    invoke-static {v0, v1}, Lpu1;->H(Lxp3;Ljava/util/concurrent/Executor;)Lar3;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method

.method public final b(Ljava/util/ArrayList;Ljava/util/Map;)V
    .locals 7

    .line 1
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lm23;

    .line 26
    .line 27
    iget-object v2, v0, Lm23;->a:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v1, p0, Li53;->e:Ll83;

    .line 30
    .line 31
    iget-object v1, v1, Ll83;->d:Lpc4;

    .line 32
    .line 33
    iget-object v1, v1, Lpc4;->r:Landroid/os/Bundle;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_1
    move-object v4, v1

    .line 42
    goto :goto_2

    .line 43
    :cond_0
    const/4 v1, 0x0

    .line 44
    goto :goto_1

    .line 45
    :goto_2
    iget-object v1, v0, Lm23;->e:Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iget-boolean v5, v0, Lm23;->b:Z

    .line 52
    .line 53
    iget-boolean v6, v0, Lm23;->c:Z

    .line 54
    .line 55
    move-object v1, p0

    .line 56
    invoke-virtual/range {v1 .. v6}, Li53;->c(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)Lgq3;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)Lgq3;
    .locals 7

    .line 1
    new-instance v0, Lg53;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move v5, p4

    .line 8
    move v6, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lg53;-><init>(Li53;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)V

    .line 10
    .line 11
    .line 12
    iget-object p1, v1, Li53;->a:Lpq3;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lpu1;->H(Lxp3;Ljava/util/concurrent/Executor;)Lar3;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {p2}, Lgq3;->r(Ln70;)Lgq3;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    sget-object p3, Lmz1;->H1:Liz1;

    .line 23
    .line 24
    sget-object p4, Ltw1;->e:Ltw1;

    .line 25
    .line 26
    iget-object p5, p4, Ltw1;->c:Lkz1;

    .line 27
    .line 28
    invoke-virtual {p5, p3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    if-nez p3, :cond_0

    .line 39
    .line 40
    sget-object p3, Lmz1;->A1:Liz1;

    .line 41
    .line 42
    iget-object p4, p4, Ltw1;->c:Lkz1;

    .line 43
    .line 44
    invoke-virtual {p4, p3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    check-cast p3, Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide p3

    .line 54
    iget-object p5, v1, Li53;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 55
    .line 56
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 57
    .line 58
    invoke-static {p2, p3, p4, v0, p5}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    check-cast p2, Lgq3;

    .line 63
    .line 64
    :cond_0
    new-instance p3, Lu32;

    .line 65
    .line 66
    const/4 p4, 0x3

    .line 67
    invoke-direct {p3, v2, p4}, Lu32;-><init>(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    const-class p4, Ljava/lang/Throwable;

    .line 71
    .line 72
    invoke-static {p2, p4, p3, p1}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1
.end method

.method public final d()I
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    return v0
.end method
