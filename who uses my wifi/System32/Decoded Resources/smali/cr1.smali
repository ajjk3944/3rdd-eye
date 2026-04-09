.class public final Lcr1;
.super Lvc2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final M:Ljava/util/ArrayList;

.field public static final N:Ljava/util/ArrayList;

.field public static final O:Ljava/util/ArrayList;

.field public static final P:Ljava/util/ArrayList;


# instance fields
.field public A:Ljava/lang/String;

.field public final B:Ljava/lang/String;

.field public final C:Ljava/util/ArrayList;

.field public final D:Ljava/util/ArrayList;

.field public final E:Ljava/util/ArrayList;

.field public final F:Ljava/util/ArrayList;

.field public final G:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final H:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final I:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final J:Lb02;

.field public final K:Ljd4;

.field public final L:Lk63;

.field public final g:Lth2;

.field public h:Landroid/content/Context;

.field public final i:Lvs1;

.field public final j:Lm83;

.field public final k:Lv83;

.field public final l:Lpq3;

.field public final m:Ljava/util/concurrent/ScheduledExecutorService;

.field public n:Lo92;

.field public o:Landroid/graphics/Point;

.field public p:Landroid/graphics/Point;

.field public final q:Lpv2;

.field public final r:Leb3;

.field public final s:Z

.field public final t:Z

.field public final u:Z

.field public final v:Z

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final z:Le51;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const-string v1, "/pcs/click"

    .line 4
    .line 5
    const-string v2, "/dbm/clk"

    .line 6
    .line 7
    const-string v3, "/aclk"

    .line 8
    .line 9
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcr1;->M:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    const-string v1, ".doubleclick.net"

    .line 25
    .line 26
    const-string v2, ".googleadservices.com"

    .line 27
    .line 28
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcr1;->N:Ljava/util/ArrayList;

    .line 40
    .line 41
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    const-string v3, "/pagead/conversion"

    .line 44
    .line 45
    const-string v4, "/dbm/ad"

    .line 46
    .line 47
    const-string v5, "/pagead/adview"

    .line 48
    .line 49
    const-string v6, "/pcs/view"

    .line 50
    .line 51
    filled-new-array {v5, v6, v3, v4}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lcr1;->O:Ljava/util/ArrayList;

    .line 63
    .line 64
    new-instance v0, Ljava/util/ArrayList;

    .line 65
    .line 66
    const-string v3, ".googlesyndication.com"

    .line 67
    .line 68
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcr1;->P:Ljava/util/ArrayList;

    .line 80
    .line 81
    return-void
.end method

.method public constructor <init>(Lth2;Landroid/content/Context;Lvs1;Lv83;Lpq3;Ljava/util/concurrent/ScheduledExecutorService;Lpv2;Leb3;Le51;Lb02;Lm83;Ljd4;Lk63;)V
    .locals 2

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.signals.ISignalGenerator"

    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroid/graphics/Point;

    .line 3
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcr1;->o:Landroid/graphics/Point;

    new-instance v0, Landroid/graphics/Point;

    .line 4
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcr1;->p:Landroid/graphics/Point;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    .line 5
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcr1;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcr1;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcr1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcr1;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lcr1;->g:Lth2;

    iput-object p2, p0, Lcr1;->h:Landroid/content/Context;

    iput-object p3, p0, Lcr1;->i:Lvs1;

    iput-object p11, p0, Lcr1;->j:Lm83;

    iput-object p4, p0, Lcr1;->k:Lv83;

    iput-object p5, p0, Lcr1;->l:Lpq3;

    iput-object p6, p0, Lcr1;->m:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p7, p0, Lcr1;->q:Lpv2;

    iput-object p8, p0, Lcr1;->r:Leb3;

    iput-object p9, p0, Lcr1;->z:Le51;

    iput-object p10, p0, Lcr1;->J:Lb02;

    .line 9
    sget-object p1, Lmz1;->E7:Liz1;

    .line 10
    sget-object p2, Ltw1;->e:Ltw1;

    iget-object p3, p2, Ltw1;->c:Lkz1;

    .line 11
    invoke-virtual {p3, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcr1;->s:Z

    sget-object p1, Lmz1;->D7:Liz1;

    .line 13
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 14
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcr1;->t:Z

    sget-object p1, Lmz1;->G7:Liz1;

    .line 16
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcr1;->u:Z

    sget-object p1, Lmz1;->I7:Liz1;

    .line 18
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 19
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcr1;->v:Z

    sget-object p1, Lmz1;->H7:Liz1;

    .line 20
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcr1;->w:Ljava/lang/String;

    sget-object p1, Lmz1;->J7:Liz1;

    .line 22
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcr1;->x:Ljava/lang/String;

    sget-object p1, Lmz1;->K7:Liz1;

    .line 24
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 25
    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcr1;->B:Ljava/lang/String;

    iput-object p12, p0, Lcr1;->K:Ljd4;

    iput-object p13, p0, Lcr1;->L:Lk63;

    sget-object p1, Lmz1;->L7:Liz1;

    .line 26
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lmz1;->M7:Liz1;

    .line 28
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcr1;->J3(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcr1;->C:Ljava/util/ArrayList;

    sget-object p1, Lmz1;->N7:Liz1;

    .line 30
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 31
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcr1;->J3(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcr1;->D:Ljava/util/ArrayList;

    sget-object p1, Lmz1;->O7:Liz1;

    .line 32
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 33
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcr1;->J3(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcr1;->E:Ljava/util/ArrayList;

    sget-object p1, Lmz1;->P7:Liz1;

    .line 34
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcr1;->J3(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcr1;->F:Ljava/util/ArrayList;

    return-void

    :cond_0
    sget-object p1, Lcr1;->M:Ljava/util/ArrayList;

    iput-object p1, p0, Lcr1;->C:Ljava/util/ArrayList;

    sget-object p1, Lcr1;->N:Ljava/util/ArrayList;

    iput-object p1, p0, Lcr1;->D:Ljava/util/ArrayList;

    sget-object p1, Lcr1;->O:Ljava/util/ArrayList;

    iput-object p1, p0, Lcr1;->E:Ljava/util/ArrayList;

    sget-object p1, Lcr1;->P:Ljava/util/ArrayList;

    goto :goto_0
.end method

.method public static F3(Landroid/net/Uri;Ljava/util/List;Ljava/util/List;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    const/4 p0, 0x1

    .line 60
    return p0

    .line 61
    :cond_3
    :goto_0
    return v1
.end method

.method public static final I3(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "&adurl="

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, -0x1

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    const-string v1, "?adurl="

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :cond_0
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    new-instance p0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v2, "="

    .line 35
    .line 36
    const-string v3, "&"

    .line 37
    .line 38
    invoke-static {p0, p1, v2, p2, v3}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_1
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0, p1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public static final J3(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    array-length v1, p0

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v1, :cond_1

    .line 15
    .line 16
    aget-object v3, p0, v2

    .line 17
    .line 18
    invoke-static {v3}, Lyc0;->s(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-object v0
.end method

.method public static K3(Ln70;Lad2;)Lda3;
    .locals 3

    .line 1
    invoke-static {}, Lea3;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    sget-object v0, Ln02;->e:Lso1;

    .line 9
    .line 10
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    :try_start_0
    invoke-static {p0}, Lpu1;->R(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lki2;

    .line 28
    .line 29
    iget-object p0, p0, Lki2;->a:Lba4;

    .line 30
    .line 31
    invoke-virtual {p0}, Lba4;->d()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lda3;

    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v2, p1, Lad2;->g:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lda3;->b(Ljava/util/ArrayList;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Lad2;->i:Lpc4;

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    const-string v0, ""

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception p0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget-object v0, p1, Lpc4;->u:Ljava/lang/String;

    .line 61
    .line 62
    :goto_0
    invoke-virtual {p0, v0}, Lda3;->c(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p1, Lpc4;->r:Landroid/os/Bundle;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lda3;->d(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    return-object p0

    .line 71
    :goto_1
    sget-object p1, Lhg4;->C:Lhg4;

    .line 72
    .line 73
    iget-object p1, p1, Lhg4;->h:Lgd2;

    .line 74
    .line 75
    const-string v0, "SignalGeneratorImpl.getConfiguredCriticalUserJourney"

    .line 76
    .line 77
    invoke-virtual {p1, v0, p0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    :goto_2
    return-object v1
.end method


# virtual methods
.method public final B3(Ljava/util/ArrayList;Lu10;Lj92;Z)V
    .locals 2

    .line 1
    sget-object v0, Lmz1;->b8:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

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
    if-nez v0, :cond_0

    .line 18
    .line 19
    :try_start_0
    const-string p1, "The updating URL feature is not enabled."

    .line 20
    .line 21
    check-cast p3, Lh92;

    .line 22
    .line 23
    invoke-virtual {p3}, Lsb1;->U()Landroid/os/Parcel;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x2

    .line 31
    invoke-virtual {p3, p2, p1}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception p1

    .line 36
    const-string p2, ""

    .line 37
    .line 38
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    new-instance v0, Lyi1;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {v0, p0, p1, p2, v1}, Lyi1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcr1;->l:Lpq3;

    .line 49
    .line 50
    check-cast p1, Lld2;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object v0, p0, Lcr1;->n:Lo92;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v0, v0, Lo92;->g:Ljava/util/Map;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    new-instance v0, Lek1;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-direct {v0, p0, v1}, Lek1;-><init>(Lcr1;I)V

    .line 74
    .line 75
    .line 76
    invoke-static {p2, v0, p1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const-string p1, "Asset view map is empty."

    .line 82
    .line 83
    invoke-static {p1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    new-instance p1, Lzf1;

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    invoke-direct {p1, p0, p3, p4, v0}, Lzf1;-><init>(Lcr1;Lj92;ZI)V

    .line 90
    .line 91
    .line 92
    iget-object p3, p0, Lcr1;->g:Lth2;

    .line 93
    .line 94
    invoke-virtual {p3}, Lth2;->b()Ljava/util/concurrent/Executor;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    new-instance p4, Ljq3;

    .line 99
    .line 100
    invoke-direct {p4, p2, p1, v0}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p2, p4, p3}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final C3(Ljava/util/ArrayList;Lu10;Lj92;Z)V
    .locals 10

    .line 1
    sget-object v0, Lmz1;->b8:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

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
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string p1, "The updating URL feature is not enabled."

    .line 20
    .line 21
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    check-cast p3, Lh92;

    .line 25
    .line 26
    invoke-virtual {p3}, Lsb1;->U()Landroid/os/Parcel;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x2

    .line 34
    invoke-virtual {p3, p2, p1}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception p1

    .line 39
    const-string p2, ""

    .line 40
    .line 41
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    move v2, v1

    .line 51
    move v3, v2

    .line 52
    :cond_1
    :goto_0
    iget-object v4, p0, Lcr1;->D:Ljava/util/ArrayList;

    .line 53
    .line 54
    iget-object v5, p0, Lcr1;->C:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-ge v3, v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    check-cast v6, Landroid/net/Uri;

    .line 65
    .line 66
    invoke-static {v6, v5, v4}, Lcr1;->F3(Landroid/net/Uri;Ljava/util/List;Ljava/util/List;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v0, 0x1

    .line 76
    if-le v2, v0, :cond_3

    .line 77
    .line 78
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const-string v3, "Multiple google urls found: "

    .line 83
    .line 84
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v2}, Lgi2;->i0(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    :goto_1
    if-ge v1, v3, :cond_6

    .line 101
    .line 102
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    check-cast v6, Landroid/net/Uri;

    .line 109
    .line 110
    invoke-static {v6, v5, v4}, Lcr1;->F3(Landroid/net/Uri;Ljava/util/List;Ljava/util/List;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-nez v7, :cond_4

    .line 115
    .line 116
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    const-string v8, "Not a Google URL: "

    .line 121
    .line 122
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-static {v7}, Lgi2;->i0(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v6}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    new-instance v7, Lyi1;

    .line 135
    .line 136
    const/4 v8, 0x1

    .line 137
    invoke-direct {v7, p0, v6, p2, v8}, Lyi1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    iget-object v6, p0, Lcr1;->l:Lpq3;

    .line 141
    .line 142
    check-cast v6, Lld2;

    .line 143
    .line 144
    invoke-virtual {v6, v7}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    iget-object v8, p0, Lcr1;->n:Lo92;

    .line 149
    .line 150
    if-eqz v8, :cond_5

    .line 151
    .line 152
    iget-object v8, v8, Lo92;->g:Ljava/util/Map;

    .line 153
    .line 154
    if-eqz v8, :cond_5

    .line 155
    .line 156
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    if-nez v8, :cond_5

    .line 161
    .line 162
    new-instance v8, Lek1;

    .line 163
    .line 164
    const/4 v9, 0x1

    .line 165
    invoke-direct {v8, p0, v9}, Lek1;-><init>(Lcr1;I)V

    .line 166
    .line 167
    .line 168
    invoke-static {v7, v8, v6}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    goto :goto_2

    .line 173
    :cond_5
    const-string v6, "Asset view map is empty."

    .line 174
    .line 175
    invoke-static {v6}, Lgi2;->f0(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    move-object v6, v7

    .line 179
    :goto_2
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_6
    new-instance p1, Lzp3;

    .line 184
    .line 185
    invoke-static {v2}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-direct {p1, p2, v0}, Lzp3;-><init>(Lxm3;Z)V

    .line 190
    .line 191
    .line 192
    new-instance p2, Lzf1;

    .line 193
    .line 194
    const/4 v0, 0x1

    .line 195
    invoke-direct {p2, p0, p3, p4, v0}, Lzf1;-><init>(Lcr1;Lj92;ZI)V

    .line 196
    .line 197
    .line 198
    iget-object p3, p0, Lcr1;->g:Lth2;

    .line 199
    .line 200
    invoke-virtual {p3}, Lth2;->b()Ljava/util/concurrent/Executor;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    new-instance p4, Ljq3;

    .line 205
    .line 206
    const/4 v0, 0x0

    .line 207
    invoke-direct {p4, p1, p2, v0}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, p4, p3}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method public final D3()V
    .locals 3

    .line 1
    sget-object v0, Lmz1;->ra:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v0, Lmz1;->ua:Liz1;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    sget-object v0, Lmz1;->ya:Liz1;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    iget-object v0, p0, Lcr1;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    :cond_0
    invoke-virtual {p0}, Lcr1;->E3()V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public final E3()V
    .locals 11

    .line 1
    sget-object v0, Lx02;->e:Lso1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcr1;->K:Ljd4;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    const/4 v0, 0x1

    .line 19
    :try_start_0
    invoke-virtual {v1, v0}, Ljd4;->c(Z)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {v1, v0}, Ljd4;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit v1

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0

    .line 31
    :cond_0
    sget-object v0, Lmz1;->Rb:Liz1;

    .line 32
    .line 33
    sget-object v1, Ltw1;->e:Ltw1;

    .line 34
    .line 35
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Lzs1;

    .line 50
    .line 51
    const/16 v1, 0xa

    .line 52
    .line 53
    invoke-direct {v0, v1, p0}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v1, Lmd2;->a:Lld2;

    .line 57
    .line 58
    invoke-static {v0, v1}, Lpu1;->H(Lxp3;Ljava/util/concurrent/Executor;)Lar3;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v1, p0

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iget-object v2, p0, Lcr1;->h:Landroid/content/Context;

    .line 65
    .line 66
    const-string v4, "BANNER"

    .line 67
    .line 68
    new-instance v9, Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 71
    .line 72
    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v3, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v7, 0x0

    .line 78
    const/4 v8, 0x0

    .line 79
    move-object v1, p0

    .line 80
    invoke-virtual/range {v1 .. v10}, Lcr1;->G3(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lxe4;Lpc4;ILjava/lang/String;Landroid/os/Bundle;Lad2;)Lki2;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v0, v0, Lki2;->b:Lba4;

    .line 85
    .line 86
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ln70;

    .line 91
    .line 92
    :goto_0
    new-instance v2, Lz71;

    .line 93
    .line 94
    const/16 v3, 0xc

    .line 95
    .line 96
    invoke-direct {v2, v3, p0}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v3, v1, Lcr1;->g:Lth2;

    .line 100
    .line 101
    invoke-virtual {v3}, Lth2;->b()Ljava/util/concurrent/Executor;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    new-instance v4, Ljq3;

    .line 106
    .line 107
    const/4 v5, 0x0

    .line 108
    invoke-direct {v4, v0, v2, v5}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, v4, v3}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final G3(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lxe4;Lpc4;ILjava/lang/String;Landroid/os/Bundle;Lad2;)Lki2;
    .locals 40

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    new-instance v2, Lk83;

    .line 6
    .line 7
    invoke-direct {v2}, Lk83;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "REWARDED"

    .line 11
    .line 12
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const-string v5, "REWARDED_INTERSTITIAL"

    .line 17
    .line 18
    iget-object v6, v2, Lk83;->o:Lh80;

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    iput v4, v6, Lh80;->g:I

    .line 24
    .line 25
    :cond_0
    :goto_0
    move-object/from16 v4, p0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    const/4 v4, 0x3

    .line 35
    iput v4, v6, Lh80;->g:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    iget-object v6, v4, Lcr1;->g:Lth2;

    .line 39
    .line 40
    iget-object v6, v6, Lth2;->b:Lth2;

    .line 41
    .line 42
    new-instance v7, Lmm2;

    .line 43
    .line 44
    invoke-direct {v7}, Lmm2;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, v7, Lmm2;->a:Landroid/content/Context;

    .line 48
    .line 49
    if-nez p2, :cond_2

    .line 50
    .line 51
    const-string v8, "adUnitId"

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move-object/from16 v8, p2

    .line 55
    .line 56
    :goto_2
    iput-object v8, v2, Lk83;->c:Ljava/lang/String;

    .line 57
    .line 58
    if-nez p5, :cond_3

    .line 59
    .line 60
    new-instance v13, Landroid/os/Bundle;

    .line 61
    .line 62
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v15, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    new-instance v23, Landroid/os/Bundle;

    .line 71
    .line 72
    invoke-direct/range {v23 .. v23}, Landroid/os/Bundle;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v24, Landroid/os/Bundle;

    .line 76
    .line 77
    invoke-direct/range {v24 .. v24}, Landroid/os/Bundle;-><init>()V

    .line 78
    .line 79
    .line 80
    new-instance v25, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct/range {v25 .. v25}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    new-instance v32, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct/range {v32 .. v32}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance v9, Lpc4;

    .line 91
    .line 92
    const/16 v34, 0x0

    .line 93
    .line 94
    const-wide/16 v38, 0x0

    .line 95
    .line 96
    const/16 v10, 0x8

    .line 97
    .line 98
    const-wide/16 v11, -0x1

    .line 99
    .line 100
    const/4 v14, -0x1

    .line 101
    const/16 v16, 0x0

    .line 102
    .line 103
    const/16 v17, -0x1

    .line 104
    .line 105
    const/16 v18, 0x0

    .line 106
    .line 107
    const/16 v19, 0x0

    .line 108
    .line 109
    const/16 v20, 0x0

    .line 110
    .line 111
    const/16 v21, 0x0

    .line 112
    .line 113
    const/16 v22, 0x0

    .line 114
    .line 115
    const/16 v26, 0x0

    .line 116
    .line 117
    const/16 v27, 0x0

    .line 118
    .line 119
    const/16 v28, 0x0

    .line 120
    .line 121
    const/16 v29, 0x0

    .line 122
    .line 123
    const/16 v31, 0x0

    .line 124
    .line 125
    const v33, 0xea60

    .line 126
    .line 127
    .line 128
    const/16 v35, 0x0

    .line 129
    .line 130
    const-wide/16 v36, 0x0

    .line 131
    .line 132
    move/from16 v30, v17

    .line 133
    .line 134
    invoke-direct/range {v9 .. v39}, Lpc4;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lqf3;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLec2;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJ)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    move-object/from16 v9, p5

    .line 139
    .line 140
    :goto_3
    iput-object v9, v2, Lk83;->a:Lpc4;

    .line 141
    .line 142
    if-nez p4, :cond_5

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    sparse-switch v8, :sswitch_data_0

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :sswitch_0
    const-string v3, "BANNER"

    .line 153
    .line 154
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_4

    .line 159
    .line 160
    new-instance v3, Lxe4;

    .line 161
    .line 162
    sget-object v5, Ld3;->i:Ld3;

    .line 163
    .line 164
    invoke-direct {v3, v0, v5}, Lxe4;-><init>(Landroid/content/Context;Ld3;)V

    .line 165
    .line 166
    .line 167
    move-object v0, v3

    .line 168
    goto :goto_6

    .line 169
    :sswitch_1
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_4

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :sswitch_2
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_4

    .line 181
    .line 182
    :goto_4
    new-instance v8, Lxe4;

    .line 183
    .line 184
    const/16 v22, 0x0

    .line 185
    .line 186
    const/16 v23, 0x0

    .line 187
    .line 188
    const-string v9, "reward_mb"

    .line 189
    .line 190
    const/4 v10, 0x0

    .line 191
    const/4 v11, 0x0

    .line 192
    const/4 v12, 0x1

    .line 193
    const/4 v13, 0x0

    .line 194
    const/4 v14, 0x0

    .line 195
    const/4 v15, 0x0

    .line 196
    const/16 v16, 0x0

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    const/16 v18, 0x0

    .line 201
    .line 202
    const/16 v19, 0x0

    .line 203
    .line 204
    const/16 v20, 0x0

    .line 205
    .line 206
    const/16 v21, 0x0

    .line 207
    .line 208
    invoke-direct/range {v8 .. v23}, Lxe4;-><init>(Ljava/lang/String;IIZII[Lxe4;ZZZZZZZZ)V

    .line 209
    .line 210
    .line 211
    move-object v0, v8

    .line 212
    goto :goto_6

    .line 213
    :sswitch_3
    const-string v0, "APP_OPEN_AD"

    .line 214
    .line 215
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_4

    .line 220
    .line 221
    invoke-static {}, Lxe4;->b()Lxe4;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    goto :goto_6

    .line 226
    :sswitch_4
    const-string v0, "NATIVE"

    .line 227
    .line 228
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_4

    .line 233
    .line 234
    invoke-static {}, Lxe4;->a()Lxe4;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    goto :goto_6

    .line 239
    :cond_4
    :goto_5
    new-instance v0, Lxe4;

    .line 240
    .line 241
    invoke-direct {v0}, Lxe4;-><init>()V

    .line 242
    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_5
    move-object/from16 v0, p4

    .line 246
    .line 247
    :goto_6
    iput-object v0, v2, Lk83;->b:Lxe4;

    .line 248
    .line 249
    const/4 v0, 0x1

    .line 250
    iput-boolean v0, v2, Lk83;->s:Z

    .line 251
    .line 252
    move-object/from16 v0, p8

    .line 253
    .line 254
    iput-object v0, v2, Lk83;->t:Landroid/os/Bundle;

    .line 255
    .line 256
    invoke-virtual {v2}, Lk83;->a()Ll83;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    iput-object v0, v7, Lmm2;->b:Ljava/lang/Object;

    .line 261
    .line 262
    move/from16 v0, p6

    .line 263
    .line 264
    iput v0, v7, Lmm2;->g:I

    .line 265
    .line 266
    new-instance v0, Lmm2;

    .line 267
    .line 268
    invoke-direct {v0, v7}, Lmm2;-><init>(Lmm2;)V

    .line 269
    .line 270
    .line 271
    new-instance v2, Lxb4;

    .line 272
    .line 273
    const/16 v3, 0xf

    .line 274
    .line 275
    invoke-direct {v2, v3}, Lxb4;-><init>(I)V

    .line 276
    .line 277
    .line 278
    iput-object v1, v2, Lxb4;->g:Ljava/lang/Object;

    .line 279
    .line 280
    move-object/from16 v1, p7

    .line 281
    .line 282
    iput-object v1, v2, Lxb4;->h:Ljava/lang/Object;

    .line 283
    .line 284
    move-object/from16 v1, p9

    .line 285
    .line 286
    iput-object v1, v2, Lxb4;->i:Ljava/lang/Object;

    .line 287
    .line 288
    new-instance v1, Lt83;

    .line 289
    .line 290
    invoke-direct {v1, v2}, Lt83;-><init>(Lxb4;)V

    .line 291
    .line 292
    .line 293
    new-instance v2, Ljava/util/HashSet;

    .line 294
    .line 295
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 296
    .line 297
    .line 298
    new-instance v2, Ljava/util/HashSet;

    .line 299
    .line 300
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 301
    .line 302
    .line 303
    new-instance v2, Ljava/util/HashSet;

    .line 304
    .line 305
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 306
    .line 307
    .line 308
    new-instance v2, Ljava/util/HashSet;

    .line 309
    .line 310
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 311
    .line 312
    .line 313
    new-instance v2, Ljava/util/HashSet;

    .line 314
    .line 315
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 316
    .line 317
    .line 318
    new-instance v2, Ljava/util/HashSet;

    .line 319
    .line 320
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 321
    .line 322
    .line 323
    new-instance v2, Ljava/util/HashSet;

    .line 324
    .line 325
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 326
    .line 327
    .line 328
    new-instance v2, Ljava/util/HashSet;

    .line 329
    .line 330
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 331
    .line 332
    .line 333
    new-instance v2, Ljava/util/HashSet;

    .line 334
    .line 335
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 336
    .line 337
    .line 338
    new-instance v2, Ljava/util/HashSet;

    .line 339
    .line 340
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 341
    .line 342
    .line 343
    new-instance v2, Ljava/util/HashSet;

    .line 344
    .line 345
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 346
    .line 347
    .line 348
    new-instance v2, Ljava/util/HashSet;

    .line 349
    .line 350
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 351
    .line 352
    .line 353
    new-instance v2, Ljava/util/HashSet;

    .line 354
    .line 355
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 356
    .line 357
    .line 358
    new-instance v2, Ljava/util/HashSet;

    .line 359
    .line 360
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 361
    .line 362
    .line 363
    new-instance v2, Lki2;

    .line 364
    .line 365
    invoke-direct {v2, v6, v1, v0}, Lki2;-><init>(Lth2;Lt83;Lmm2;)V

    .line 366
    .line 367
    .line 368
    return-object v2

    .line 369
    :sswitch_data_0
    .sparse-switch
        -0x772abbe9 -> :sswitch_4
        -0x1987ba06 -> :sswitch_3
        0x205e3c0e -> :sswitch_2
        0x6e8e03bd -> :sswitch_1
        0x7458732c -> :sswitch_0
    .end sparse-switch
.end method

.method public final H3(Ljava/lang/String;)Lgq3;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lau2;

    .line 3
    .line 4
    iget-object v1, p0, Lcr1;->k:Lv83;

    .line 5
    .line 6
    invoke-virtual {v1}, Lv83;->b()Ln70;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Lop1;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v2, p0, v0, p1, v3}, Lop1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcr1;->l:Lpq3;

    .line 17
    .line 18
    invoke-static {v1, v2, p1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Ljq3;

    .line 23
    .line 24
    const/16 v3, 0x16

    .line 25
    .line 26
    invoke-direct {v2, p0, v0, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2, p1}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lgq3;->r(Ln70;)Lgq3;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, Lmz1;->c8:Liz1;

    .line 37
    .line 38
    sget-object v2, Ltw1;->e:Ltw1;

    .line 39
    .line 40
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    int-to-long v1, v1

    .line 53
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 54
    .line 55
    iget-object v4, p0, Lcr1;->m:Ljava/util/concurrent/ScheduledExecutorService;

    .line 56
    .line 57
    invoke-static {v0, v1, v2, v3, v4}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lgq3;

    .line 62
    .line 63
    sget-object v1, Lgj1;->c:Lgj1;

    .line 64
    .line 65
    invoke-static {v0, v1, p1}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-class v1, Ljava/lang/Exception;

    .line 70
    .line 71
    sget-object v2, Lgj1;->d:Lgj1;

    .line 72
    .line 73
    invoke-static {v0, v1, v2, p1}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
.end method

.method public final e2(Lu10;Lad2;Ltc2;)V
    .locals 11

    .line 1
    new-instance v8, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lmz1;->m2:Liz1;

    .line 7
    .line 8
    sget-object v2, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v4, v2, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 13
    .line 14
    invoke-virtual {v4, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v1, p2, Lad2;->i:Lpc4;

    .line 27
    .line 28
    iget-wide v4, v1, Lpc4;->E:J

    .line 29
    .line 30
    const-string v1, "api-call"

    .line 31
    .line 32
    invoke-virtual {v8, v1, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 33
    .line 34
    .line 35
    sget-object v1, Lhg4;->C:Lhg4;

    .line 36
    .line 37
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 38
    .line 39
    const-string v4, "dynamite-enter"

    .line 40
    .line 41
    invoke-static {v1, v8, v4}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Landroid/content/Context;

    .line 49
    .line 50
    iput-object v1, p0, Lcr1;->h:Landroid/content/Context;

    .line 51
    .line 52
    const/16 v4, 0x16

    .line 53
    .line 54
    invoke-static {v1, v4}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    invoke-interface {v10}, Laa3;->a()Laa3;

    .line 59
    .line 60
    .line 61
    sget-object v1, Lmz1;->U7:Liz1;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v4, 0x0

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    iget-object v1, p2, Lad2;->i:Lpc4;

    .line 77
    .line 78
    iget-object v5, v1, Lpc4;->h:Landroid/os/Bundle;

    .line 79
    .line 80
    const-string v6, "optimize_for_app_start"

    .line 81
    .line 82
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-nez v5, :cond_2

    .line 87
    .line 88
    :cond_1
    :goto_0
    move v6, v4

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-static {v1}, La30;->w(Lpc4;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const-string v5, "requester_type_8"

    .line 95
    .line 96
    invoke-static {v1, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_3

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    iget v1, p2, Lad2;->j:I

    .line 104
    .line 105
    const/4 v4, 0x2

    .line 106
    if-ne v1, v4, :cond_4

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    const/4 v4, 0x1

    .line 110
    goto :goto_0

    .line 111
    :goto_1
    iget-object v1, p2, Lad2;->g:Ljava/lang/String;

    .line 112
    .line 113
    const-string v4, "UNKNOWN"

    .line 114
    .line 115
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_6

    .line 120
    .line 121
    new-instance v4, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    sget-object v5, Lmz1;->T7:Liz1;

    .line 127
    .line 128
    invoke-virtual {v2, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    check-cast v7, Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-nez v7, :cond_5

    .line 139
    .line 140
    invoke-virtual {v2, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Ljava/lang/String;

    .line 145
    .line 146
    const-string v5, ","

    .line 147
    .line 148
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    :cond_5
    iget-object v5, p2, Lad2;->i:Lpc4;

    .line 157
    .line 158
    invoke-static {v5}, La30;->w(Lpc4;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_6

    .line 167
    .line 168
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 169
    .line 170
    const-string v2, "Unknown format is no longer supported."

    .line 171
    .line 172
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    new-instance v4, Ljava/lang/IllegalArgumentException;

    .line 180
    .line 181
    invoke-direct {v4, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v4}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    move-object v8, v2

    .line 189
    move-object v2, v1

    .line 190
    goto :goto_2

    .line 191
    :cond_6
    sget-object v4, Lmz1;->Rb:Liz1;

    .line 192
    .line 193
    invoke-virtual {v2, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, Ljava/lang/Boolean;

    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-eqz v2, :cond_7

    .line 204
    .line 205
    sget-object v1, Lmd2;->a:Lld2;

    .line 206
    .line 207
    new-instance v2, Lnv;

    .line 208
    .line 209
    invoke-direct {v2, p0, p2, v6, v8}, Lnv;-><init>(Lcr1;Lad2;ILandroid/os/Bundle;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v2}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    sget-object v4, Lfi1;->b:Lfi1;

    .line 217
    .line 218
    invoke-static {v2, v4, v1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    move-object v8, v1

    .line 223
    goto :goto_2

    .line 224
    :cond_7
    move-object v2, v1

    .line 225
    iget-object v1, p0, Lcr1;->h:Landroid/content/Context;

    .line 226
    .line 227
    move-object v4, v2

    .line 228
    iget-object v2, p2, Lad2;->f:Ljava/lang/String;

    .line 229
    .line 230
    move-object v5, v4

    .line 231
    iget-object v4, p2, Lad2;->h:Lxe4;

    .line 232
    .line 233
    move-object v7, v5

    .line 234
    iget-object v5, p2, Lad2;->i:Lpc4;

    .line 235
    .line 236
    move-object v9, v7

    .line 237
    iget-object v7, p2, Lad2;->k:Ljava/lang/String;

    .line 238
    .line 239
    move-object v0, p0

    .line 240
    move-object v3, v9

    .line 241
    move-object v9, p2

    .line 242
    invoke-virtual/range {v0 .. v9}, Lcr1;->G3(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lxe4;Lpc4;ILjava/lang/String;Landroid/os/Bundle;Lad2;)Lki2;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-static {v1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iget-object v1, v1, Lki2;->b:Lba4;

    .line 251
    .line 252
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    move-object v2, v1

    .line 257
    check-cast v2, Ln70;

    .line 258
    .line 259
    move-object v8, v2

    .line 260
    move-object v2, v0

    .line 261
    :goto_2
    new-instance v0, Lg4;

    .line 262
    .line 263
    const/4 v6, 0x5

    .line 264
    const/4 v7, 0x0

    .line 265
    move-object v1, p0

    .line 266
    move-object v3, p2

    .line 267
    move-object v4, p3

    .line 268
    move-object v5, v10

    .line 269
    invoke-direct/range {v0 .. v7}, Lg4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 270
    .line 271
    .line 272
    move-object v1, v0

    .line 273
    iget-object v2, p0, Lcr1;->g:Lth2;

    .line 274
    .line 275
    invoke-virtual {v2}, Lth2;->b()Ljava/util/concurrent/Executor;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    new-instance v3, Ljq3;

    .line 280
    .line 281
    const/4 v4, 0x0

    .line 282
    invoke-direct {v3, v8, v1, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v8, v3, v2}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 286
    .line 287
    .line 288
    return-void
.end method
