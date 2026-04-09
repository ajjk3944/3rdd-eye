.class public final Lxb4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lg8;
.implements Ll01;
.implements Lws2;
.implements Lan1;
.implements Lt9;
.implements Ltd2;
.implements Lfd0;
.implements Lhd0;
.implements Ljd0;
.implements Ldp2;
.implements Lug2;
.implements Lo93;
.implements Lqq2;
.implements Lk73;


# static fields
.field public static j:Lxb4;

.field public static final k:Ljava/lang/Object;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxb4;->k:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Lxb4;->f:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxb4;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 3

    iput p1, p0, Lxb4;->f:I

    packed-switch p1, :pswitch_data_0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p2, p0, Lxb4;->i:Ljava/lang/Object;

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    .line 26
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lxb4;->h:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 27
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 28
    iget-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lib0;

    .line 29
    iget-object v1, v1, Lib0;->b:Lb4;

    .line 30
    new-instance v2, Lcv0;

    .line 31
    iget-object v1, v1, Lf74;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    .line 32
    invoke-direct {v2, v1}, Lcv0;-><init>(Ljava/util/List;)V

    .line 33
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lib0;

    .line 35
    iget-object v0, v0, Lib0;->c:Lb4;

    .line 36
    iget-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lb4;->Q0()Lba;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 37
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lxb4;->g:Ljava/lang/Object;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ljg1;

    iput-object p1, p0, Lxb4;->h:Ljava/lang/Object;

    new-instance p1, Lfw3;

    new-instance p2, Lof3;

    const/16 v0, 0xa

    invoke-direct {p2, v0, p0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 38
    invoke-direct {p1, p2}, Lfw3;-><init>(Lzb3;)V

    iput-object p1, p0, Lxb4;->i:Ljava/lang/Object;

    const/4 p2, 0x3

    .line 39
    invoke-virtual {p1, p2}, Lfw3;->w(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lxb4;->f:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    .line 12
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    new-instance v2, Lbh3;

    const/16 p1, 0x8

    invoke-direct {v2, p1, p0}, Lbh3;-><init>(ILjava/lang/Object;)V

    const-wide/32 v5, 0x15180

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    .line 13
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable$Callback;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lxb4;->f:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_0

    .line 45
    const-string v0, "/"

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lxb4;->h:Ljava/lang/Object;

    goto :goto_0

    .line 46
    :cond_0
    iput-object p2, p0, Lxb4;->h:Ljava/lang/Object;

    .line 47
    :goto_0
    iput-object p3, p0, Lxb4;->i:Ljava/lang/Object;

    .line 48
    instance-of p2, p1, Landroid/view/View;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    .line 49
    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    goto :goto_1

    .line 50
    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    :goto_1
    return-void
.end method

.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroidx/appcompat/widget/Toolbar;)V
    .locals 0

    const/4 p1, 0x2

    iput p1, p0, Lxb4;->f:I

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p2, p0, Lxb4;->g:Ljava/lang/Object;

    .line 53
    iput-object p3, p0, Lxb4;->h:Ljava/lang/Object;

    .line 54
    iput-object p4, p0, Lxb4;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le60;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lxb4;->f:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ld60;

    invoke-direct {v0, p1}, Ld60;-><init>(Lb60;)V

    iput-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    .line 42
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lxb4;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh83;La83;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Lxb4;->f:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    iput-object p2, p0, Lxb4;->h:Ljava/lang/Object;

    if-nez p3, :cond_0

    const-string p3, "com.google.ads.mediation.admob.AdMobAdapter"

    :cond_0
    iput-object p3, p0, Lxb4;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 4

    const/16 v0, 0x8

    iput v0, p0, Lxb4;->f:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    .line 65
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    iput-object v1, p0, Lxb4;->g:Ljava/lang/Object;

    .line 66
    new-instance v1, Loa1;

    iget-object v2, p0, Lxb4;->g:Ljava/lang/Object;

    check-cast v2, Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Loa1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    .line 67
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 68
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 69
    iget-object p1, p0, Lxb4;->h:Ljava/lang/Object;

    check-cast p1, Loa1;

    const-class v0, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Loa1;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lxb4;->f:I

    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    iput-object p2, p0, Lxb4;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lxb4;->f:I

    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    iput-object p2, p0, Lxb4;->h:Ljava/lang/Object;

    iput-object p3, p0, Lxb4;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 4
    iput p4, p0, Lxb4;->f:I

    iput-object p2, p0, Lxb4;->g:Ljava/lang/Object;

    iput-object p3, p0, Lxb4;->h:Ljava/lang/Object;

    iput-object p1, p0, Lxb4;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lxb4;->f:I

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    .line 62
    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0xd

    iput v0, p0, Lxb4;->f:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgg4;

    invoke-direct {v0}, Lgg4;-><init>()V

    const-string v1, "video/mp2t"

    .line 15
    invoke-virtual {v0, v1}, Lgg4;->d(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v0, p1}, Lgg4;->e(Ljava/lang/String;)V

    .line 17
    new-instance p1, Lph4;

    .line 18
    invoke-direct {p1, v0}, Lph4;-><init>(Lgg4;)V

    .line 19
    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    const/16 v0, 0xb

    iput v0, p0, Lxb4;->f:I

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 57
    new-instance v0, Lia1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lia1;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    .line 58
    new-instance v0, Llu0;

    invoke-direct {v0, p1}, Llu0;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lmc2;Lfr;Lcn;Ljava/util/Set;)V
    .locals 7

    const/4 v0, 0x5

    iput v0, p0, Lxb4;->f:I

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p2, p0, Lxb4;->g:Ljava/lang/Object;

    .line 72
    iput-object p1, p0, Lxb4;->h:Ljava/lang/Object;

    .line 73
    iput-object p3, p0, Lxb4;->i:Ljava/lang/Object;

    .line 74
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 75
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 76
    new-instance v1, Ljava/lang/String;

    const/4 p3, 0x0

    array-length p4, p2

    invoke-direct {v1, p2, p3, p4}, Ljava/lang/String;-><init>([III)V

    .line 77
    new-instance v6, Ler3;

    const/4 p2, 0x2

    invoke-direct {v6, v1, p2}, Ler3;-><init>(Ljava/lang/String;I)V

    .line 78
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lxb4;->y(Ljava/lang/CharSequence;IIIZLcs;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(Lt83;Lld2;)V
    .locals 2

    const/16 v0, 0x1d

    iput v0, p0, Lxb4;->f:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsu2;

    const/16 v1, 0x8

    .line 21
    invoke-direct {v0, v1}, Lsu2;-><init>(I)V

    .line 22
    iput-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    iput-object p2, p0, Lxb4;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lth2;Landroid/content/Context;Lld2;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Lxb4;->f:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb4;->h:Ljava/lang/Object;

    iput-object p2, p0, Lxb4;->g:Ljava/lang/Object;

    iput-object p3, p0, Lxb4;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz62;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lxb4;->f:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    return-void
.end method

.method public static final I(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    .line 1
    const-string v0, "app_set_id_storage"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public static final K(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lxb4;->I(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v3, "app_set_id_last_used_time"

    .line 14
    .line 15
    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const-string v1, "Failed to store app set ID last used time for App "

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    const-string v0, "AppSet"

    .line 52
    .line 53
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    new-instance p0, Lfb4;

    .line 57
    .line 58
    const-string v0, "Failed to store the app set ID last used time."

    .line 59
    .line 60
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    :cond_1
    return-void
.end method

.method public static g(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq p1, v2, :cond_6

    .line 23
    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-class v2, Lr31;

    .line 30
    .line 31
    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, [Lr31;

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    if-lez v2, :cond_6

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    move v3, v0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez p2, :cond_3

    .line 61
    .line 62
    if-eq v4, p1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-le p1, v5, :cond_5

    .line 65
    .line 66
    if-ge p1, v4, :cond_5

    .line 67
    .line 68
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    :goto_1
    return v0
.end method

.method public static r(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lxb4;
    .locals 2

    .line 1
    new-instance v0, Lxb4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/16 p2, 0xa

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, p2}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public A(Llm2;)Lgq3;
    .locals 7

    .line 1
    new-instance v0, Lmc2;

    .line 2
    .line 3
    iget-object v1, p0, Lxb4;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lt83;

    .line 6
    .line 7
    iget-object v2, p0, Lxb4;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    invoke-direct {v0, v1, p1, v2}, Lmc2;-><init>(Lt83;Llm2;Ljava/util/concurrent/Executor;)V

    .line 12
    .line 13
    .line 14
    iget-object v3, v0, Lmc2;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lg73;

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    sget-object v3, Ld12;->a:Lso1;

    .line 21
    .line 22
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    new-instance v1, Lg73;

    .line 35
    .line 36
    invoke-virtual {v0}, Lmc2;->x()Lg93;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v1, v4, v3}, Lg73;-><init>(Lfa2;Lf93;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, v0, Lmc2;->j:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {v1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-interface {p1}, Llm2;->a()Lnl2;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v1, v1, Lt83;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ld93;

    .line 58
    .line 59
    iget-object v4, v3, Lnl2;->i:Lkm2;

    .line 60
    .line 61
    iget-object v5, v3, Lnl2;->c:Lu93;

    .line 62
    .line 63
    sget-object v6, Ls93;->z:Ls93;

    .line 64
    .line 65
    invoke-virtual {v4}, Lkm2;->b()Lq93;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v5, v4, v6}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    new-instance v5, Lz02;

    .line 74
    .line 75
    const/4 v6, 0x4

    .line 76
    invoke-direct {v5, v3, v1, v6}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v5}, Lbu1;->s(Lyp3;)Lbu1;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Lbu1;->A()Lq93;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    new-instance v4, Lvg0;

    .line 88
    .line 89
    const/16 v5, 0x12

    .line 90
    .line 91
    invoke-direct {v4, v5, v3}, Lvg0;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v3, v3, Lnl2;->j:Ljava/util/concurrent/Executor;

    .line 95
    .line 96
    new-instance v5, Ljq3;

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    invoke-direct {v5, v1, v4, v6}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v5, v3}, Lq93;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, Lgq3;->r(Ln70;)Lgq3;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    new-instance v3, Lf73;

    .line 110
    .line 111
    const/4 v4, 0x1

    .line 112
    invoke-direct {v3, v0, v4}, Lf73;-><init>(Lmc2;I)V

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v3, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    new-instance v3, Lf73;

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    invoke-direct {v3, v0, v4}, Lf73;-><init>(Lmc2;I)V

    .line 123
    .line 124
    .line 125
    const-class v0, Lmy2;

    .line 126
    .line 127
    invoke-static {v1, v0, v3, v2}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :goto_0
    sget-object v1, Lgj1;->s:Lgj1;

    .line 132
    .line 133
    invoke-static {v0, v1, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    goto :goto_1

    .line 138
    :cond_1
    invoke-static {v3}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :goto_1
    invoke-static {v0}, Lgq3;->r(Ln70;)Lgq3;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    new-instance v1, Lz02;

    .line 147
    .line 148
    const/16 v3, 0xe

    .line 149
    .line 150
    invoke-direct {v1, p0, p1, v3}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v0, v1, v2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    new-instance v0, Lgj1;

    .line 158
    .line 159
    const/16 v1, 0x12

    .line 160
    .line 161
    invoke-direct {v0, v1}, Lgj1;-><init>(I)V

    .line 162
    .line 163
    .line 164
    const-class v1, Ljava/lang/Exception;

    .line 165
    .line 166
    invoke-static {p1, v1, v0, v2}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    return-object p1
.end method

.method public B(Lnf1;Lin1;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lxb4;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, [Ljg1;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_2

    .line 9
    .line 10
    invoke-virtual {p2}, Lin1;->a()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lin1;->b()V

    .line 14
    .line 15
    .line 16
    iget v3, p2, Lin1;->d:I

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    invoke-interface {p1, v3, v4}, Lnf1;->z(II)Ljg1;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, Lxb4;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lph4;

    .line 32
    .line 33
    iget-object v5, v4, Lph4;->m:Ljava/lang/String;

    .line 34
    .line 35
    const-string v6, "application/cea-608"

    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const/4 v7, 0x1

    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    const-string v6, "application/cea-708"

    .line 45
    .line 46
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    move v7, v0

    .line 54
    :cond_1
    :goto_1
    const-string v6, "Invalid closed caption MIME type provided: %s"

    .line 55
    .line 56
    invoke-static {v7, v6, v5}, Lzt0;->X(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v6, Lgg4;

    .line 60
    .line 61
    invoke-direct {v6}, Lgg4;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Lin1;->b()V

    .line 65
    .line 66
    .line 67
    iget-object v7, p2, Lin1;->e:Ljava/lang/String;

    .line 68
    .line 69
    iput-object v7, v6, Lgg4;->a:Ljava/lang/String;

    .line 70
    .line 71
    const-string v7, "video/mp2t"

    .line 72
    .line 73
    invoke-virtual {v6, v7}, Lgg4;->d(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6, v5}, Lgg4;->e(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget v5, v4, Lph4;->e:I

    .line 80
    .line 81
    iput v5, v6, Lgg4;->e:I

    .line 82
    .line 83
    iget-object v5, v4, Lph4;->d:Ljava/lang/String;

    .line 84
    .line 85
    iput-object v5, v6, Lgg4;->d:Ljava/lang/String;

    .line 86
    .line 87
    iget v5, v4, Lph4;->J:I

    .line 88
    .line 89
    iput v5, v6, Lgg4;->I:I

    .line 90
    .line 91
    iget-object v4, v4, Lph4;->p:Ljava/util/List;

    .line 92
    .line 93
    iput-object v4, v6, Lgg4;->o:Ljava/util/List;

    .line 94
    .line 95
    new-instance v4, Lph4;

    .line 96
    .line 97
    invoke-direct {v4, v6}, Lph4;-><init>(Lgg4;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v3, v4}, Ljg1;->d(Lph4;)V

    .line 101
    .line 102
    .line 103
    aput-object v3, v2, v1

    .line 104
    .line 105
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    return-void
.end method

.method public C(Lyy2;)Lzy2;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lyy2;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget v3, v0, Lyy2;->b:I

    .line 8
    .line 9
    iget-object v4, v0, Lyy2;->c:Ljava/util/HashMap;

    .line 10
    .line 11
    iget-object v5, v0, Lyy2;->d:[B

    .line 12
    .line 13
    iget-object v6, v0, Lyy2;->e:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v0, Lhg4;->C:Lhg4;

    .line 16
    .line 17
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 23
    .line 24
    .line 25
    move-result-wide v7

    .line 26
    const-string v9, ""

    .line 27
    .line 28
    const-string v0, "AdRequestServiceImpl: Sending request: "

    .line 29
    .line 30
    const-string v10, "SDK version: "

    .line 31
    .line 32
    const-string v11, "Received error HTTP response code: "

    .line 33
    .line 34
    :try_start_0
    new-instance v12, Lzy2;

    .line 35
    .line 36
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v13, 0x0

    .line 40
    iput v13, v12, Lzy2;->a:I

    .line 41
    .line 42
    new-instance v14, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v14, v12, Lzy2;->b:Ljava/util/HashMap;

    .line 48
    .line 49
    iput-object v9, v12, Lzy2;->c:Ljava/lang/String;

    .line 50
    .line 51
    const-wide/16 v14, -0x1

    .line 52
    .line 53
    iput-wide v14, v12, Lzy2;->d:J

    .line 54
    .line 55
    iget-object v14, v1, Lxb4;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v14, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v15

    .line 63
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v15

    .line 67
    add-int/lit8 v15, v15, 0xd

    .line 68
    .line 69
    new-instance v13, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-static {v10}, Lgi2;->f0(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    add-int/lit8 v10, v10, 0x27

    .line 96
    .line 97
    new-instance v13, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v13, v10}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    new-instance v0, Ljava/net/URL;

    .line 116
    .line 117
    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v2, Ljava/util/HashMap;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 123
    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    :goto_0
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    move-object v13, v0

    .line 131
    check-cast v13, Ljava/net/HttpURLConnection;

    .line 132
    .line 133
    iget-object v0, v1, Lxb4;->i:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v0, :cond_0

    .line 138
    .line 139
    invoke-virtual {v13, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :catch_0
    move-exception v0

    .line 144
    goto/16 :goto_11

    .line 145
    .line 146
    :cond_0
    :goto_1
    :try_start_1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 147
    .line 148
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 149
    .line 150
    iget-object v15, v1, Lxb4;->g:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v15, Landroid/content/Context;

    .line 153
    .line 154
    invoke-virtual {v0, v15, v14, v13, v3}, Llf4;->A(Landroid/content/Context;Ljava/lang/String;Ljava/net/HttpURLConnection;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v15

    .line 169
    if-eqz v15, :cond_1

    .line 170
    .line 171
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    check-cast v15, Ljava/util/Map$Entry;

    .line 176
    .line 177
    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v16

    .line 181
    move-object/from16 v17, v0

    .line 182
    .line 183
    move-object/from16 v0, v16

    .line 184
    .line 185
    check-cast v0, Ljava/lang/String;

    .line 186
    .line 187
    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v15

    .line 191
    check-cast v15, Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {v13, v0, v15}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    move-object/from16 v0, v17

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :catchall_0
    move-exception v0

    .line 200
    goto/16 :goto_10

    .line 201
    .line 202
    :catch_1
    move-exception v0

    .line 203
    goto/16 :goto_e

    .line 204
    .line 205
    :cond_1
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-nez v0, :cond_2

    .line 210
    .line 211
    const-string v0, "Content-Type"

    .line 212
    .line 213
    invoke-virtual {v13, v0, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_2
    new-instance v15, Lwb4;

    .line 217
    .line 218
    invoke-direct {v15}, Lwb4;-><init>()V
    :try_end_1
    .catch Lhx2; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    .line 220
    .line 221
    :try_start_2
    invoke-virtual {v15, v13, v5}, Lwb4;->a(Ljava/net/HttpURLConnection;[B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 222
    .line 223
    .line 224
    move/from16 v16, v3

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :catchall_1
    move-exception v0

    .line 228
    :try_start_3
    const-string v1, "Network request logging failed."

    .line 229
    .line 230
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    sget-object v1, Lhg4;->C:Lhg4;

    .line 234
    .line 235
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 236
    .line 237
    move/from16 v16, v3

    .line 238
    .line 239
    const-string v3, "HttpRequestFunction.logAdRequest"

    .line 240
    .line 241
    invoke-virtual {v1, v3, v0}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    :goto_3
    array-length v0, v5

    .line 245
    const/4 v3, 0x1

    .line 246
    if-lez v0, :cond_3

    .line 247
    .line 248
    invoke-virtual {v13, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v13, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    :try_end_3
    .catch Lhx2; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 252
    .line 253
    .line 254
    :try_start_4
    new-instance v1, Ljava/io/BufferedOutputStream;

    .line 255
    .line 256
    invoke-virtual {v13}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-direct {v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 261
    .line 262
    .line 263
    :try_start_5
    invoke-virtual {v1, v5}, Ljava/io/OutputStream;->write([B)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 264
    .line 265
    .line 266
    :try_start_6
    invoke-static {v1}, Lg82;->c(Ljava/io/Closeable;)V

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :catchall_2
    move-exception v0

    .line 271
    goto :goto_4

    .line 272
    :catchall_3
    move-exception v0

    .line 273
    const/4 v1, 0x0

    .line 274
    :goto_4
    invoke-static {v1}, Lg82;->c(Ljava/io/Closeable;)V

    .line 275
    .line 276
    .line 277
    throw v0

    .line 278
    :cond_3
    :goto_5
    invoke-virtual {v13}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    invoke-virtual {v13}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v18

    .line 298
    if-eqz v18, :cond_5

    .line 299
    .line 300
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v18

    .line 304
    check-cast v18, Ljava/util/Map$Entry;

    .line 305
    .line 306
    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v19

    .line 310
    move/from16 v20, v3

    .line 311
    .line 312
    move-object/from16 v3, v19

    .line 313
    .line 314
    check-cast v3, Ljava/lang/String;

    .line 315
    .line 316
    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v18

    .line 320
    move-object/from16 v19, v1

    .line 321
    .line 322
    move-object/from16 v1, v18

    .line 323
    .line 324
    check-cast v1, Ljava/util/List;

    .line 325
    .line 326
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v18

    .line 330
    if-eqz v18, :cond_4

    .line 331
    .line 332
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    check-cast v3, Ljava/util/List;

    .line 337
    .line 338
    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 339
    .line 340
    .line 341
    :goto_7
    move-object/from16 v1, v19

    .line 342
    .line 343
    move/from16 v3, v20

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_4
    move-object/from16 v18, v4

    .line 347
    .line 348
    new-instance v4, Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-object/from16 v4, v18

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_5
    move/from16 v20, v3

    .line 360
    .line 361
    move-object/from16 v18, v4

    .line 362
    .line 363
    invoke-virtual {v15, v13, v0}, Lwb4;->b(Ljava/net/HttpURLConnection;I)V

    .line 364
    .line 365
    .line 366
    iput v0, v12, Lzy2;->a:I

    .line 367
    .line 368
    iput-object v2, v12, Lzy2;->b:Ljava/util/HashMap;

    .line 369
    .line 370
    iput-object v9, v12, Lzy2;->c:Ljava/lang/String;
    :try_end_6
    .catch Lhx2; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 371
    .line 372
    const/16 v1, 0xc8

    .line 373
    .line 374
    const/16 v3, 0x12c

    .line 375
    .line 376
    if-lt v0, v1, :cond_b

    .line 377
    .line 378
    if-ge v0, v3, :cond_b

    .line 379
    .line 380
    :try_start_7
    new-instance v1, Ljava/io/InputStreamReader;

    .line 381
    .line 382
    invoke-virtual {v13}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-direct {v1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 387
    .line 388
    .line 389
    :try_start_8
    sget-object v0, Lhg4;->C:Lhg4;

    .line 390
    .line 391
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 392
    .line 393
    new-instance v0, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    const/16 v2, 0x2000

    .line 396
    .line 397
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 398
    .line 399
    .line 400
    const/16 v2, 0x800

    .line 401
    .line 402
    new-array v2, v2, [C

    .line 403
    .line 404
    :goto_8
    invoke-virtual {v1, v2}, Ljava/io/Reader;->read([C)I

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    const/4 v4, -0x1

    .line 409
    if-eq v3, v4, :cond_6

    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    invoke-virtual {v0, v2, v4, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    goto :goto_8

    .line 416
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 420
    :try_start_9
    invoke-static {v1}, Lg82;->c(Ljava/io/Closeable;)V

    .line 421
    .line 422
    .line 423
    invoke-static {}, Lwb4;->c()Z

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    if-nez v1, :cond_7

    .line 428
    .line 429
    goto :goto_9

    .line 430
    :cond_7
    if-eqz v0, :cond_8

    .line 431
    .line 432
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    new-instance v2, Lit3;

    .line 437
    .line 438
    const/4 v3, 0x0

    .line 439
    invoke-direct {v2, v3, v1}, Lit3;-><init>(ILjava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    const-string v1, "onNetworkResponseBody"

    .line 443
    .line 444
    invoke-virtual {v15, v1, v2}, Lwb4;->e(Ljava/lang/String;Lbb4;)V

    .line 445
    .line 446
    .line 447
    :cond_8
    :goto_9
    iput-object v0, v12, Lzy2;->c:Ljava/lang/String;

    .line 448
    .line 449
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-eqz v0, :cond_a

    .line 454
    .line 455
    sget-object v0, Lmz1;->W5:Liz1;

    .line 456
    .line 457
    sget-object v1, Ltw1;->e:Ltw1;

    .line 458
    .line 459
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 460
    .line 461
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    check-cast v0, Ljava/lang/Boolean;

    .line 466
    .line 467
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    if-eqz v0, :cond_9

    .line 472
    .line 473
    goto :goto_a

    .line 474
    :cond_9
    new-instance v0, Lhx2;

    .line 475
    .line 476
    const/4 v1, 0x3

    .line 477
    invoke-direct {v0, v1}, Lhx2;-><init>(I)V

    .line 478
    .line 479
    .line 480
    throw v0

    .line 481
    :cond_a
    :goto_a
    sget-object v0, Lhg4;->C:Lhg4;

    .line 482
    .line 483
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 484
    .line 485
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 489
    .line 490
    .line 491
    move-result-wide v0

    .line 492
    sub-long/2addr v0, v7

    .line 493
    iput-wide v0, v12, Lzy2;->d:J
    :try_end_9
    .catch Lhx2; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 494
    .line 495
    :goto_b
    :try_start_a
    invoke-virtual {v13}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 496
    .line 497
    .line 498
    goto/16 :goto_f

    .line 499
    .line 500
    :catchall_4
    move-exception v0

    .line 501
    goto :goto_c

    .line 502
    :catchall_5
    move-exception v0

    .line 503
    const/4 v1, 0x0

    .line 504
    :goto_c
    :try_start_b
    invoke-static {v1}, Lg82;->c(Ljava/io/Closeable;)V

    .line 505
    .line 506
    .line 507
    throw v0

    .line 508
    :cond_b
    const/4 v4, 0x0

    .line 509
    if-lt v0, v3, :cond_f

    .line 510
    .line 511
    const/16 v1, 0x190

    .line 512
    .line 513
    if-ge v0, v1, :cond_f

    .line 514
    .line 515
    const-string v0, "Location"

    .line 516
    .line 517
    invoke-virtual {v13, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 522
    .line 523
    .line 524
    move-result v1

    .line 525
    if-nez v1, :cond_e

    .line 526
    .line 527
    sget-object v1, Lmz1;->w8:Liz1;

    .line 528
    .line 529
    sget-object v3, Ltw1;->e:Ltw1;

    .line 530
    .line 531
    iget-object v15, v3, Ltw1;->c:Lkz1;

    .line 532
    .line 533
    invoke-virtual {v15, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    check-cast v1, Ljava/lang/Boolean;

    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 540
    .line 541
    .line 542
    move-result v1
    :try_end_b
    .catch Lhx2; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 543
    if-eqz v1, :cond_c

    .line 544
    .line 545
    :try_start_c
    new-instance v1, Ljava/net/URI;

    .line 546
    .line 547
    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 551
    .line 552
    .line 553
    move-result-object v0
    :try_end_c
    .catch Ljava/net/URISyntaxException; {:try_start_c .. :try_end_c} :catch_2
    .catch Lhx2; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 554
    goto :goto_d

    .line 555
    :catch_2
    move-exception v0

    .line 556
    :try_start_d
    new-instance v1, Lhx2;

    .line 557
    .line 558
    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    invoke-direct {v1, v2, v0}, Lhx2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 563
    .line 564
    .line 565
    throw v1

    .line 566
    :cond_c
    new-instance v1, Ljava/net/URL;

    .line 567
    .line 568
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    move-object v0, v1

    .line 572
    :goto_d
    add-int/lit8 v10, v10, 0x1

    .line 573
    .line 574
    sget-object v1, Lmz1;->F5:Liz1;

    .line 575
    .line 576
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 577
    .line 578
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    check-cast v1, Ljava/lang/Integer;

    .line 583
    .line 584
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 585
    .line 586
    .line 587
    move-result v1
    :try_end_d
    .catch Lhx2; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 588
    if-gt v10, v1, :cond_d

    .line 589
    .line 590
    :try_start_e
    invoke-virtual {v13}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    .line 591
    .line 592
    .line 593
    move-object/from16 v1, p0

    .line 594
    .line 595
    move/from16 v3, v16

    .line 596
    .line 597
    move-object/from16 v4, v18

    .line 598
    .line 599
    goto/16 :goto_0

    .line 600
    .line 601
    :cond_d
    :try_start_f
    const-string v0, "Too many redirects."

    .line 602
    .line 603
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    new-instance v0, Lhx2;

    .line 607
    .line 608
    const-string v1, "Too many redirects"

    .line 609
    .line 610
    move/from16 v2, v20

    .line 611
    .line 612
    invoke-direct {v0, v1, v2}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 613
    .line 614
    .line 615
    throw v0

    .line 616
    :cond_e
    const-string v0, "No location header to follow redirect."

    .line 617
    .line 618
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    new-instance v0, Lhx2;

    .line 622
    .line 623
    const-string v1, "No location header to follow redirect"

    .line 624
    .line 625
    const/4 v2, 0x1

    .line 626
    invoke-direct {v0, v1, v2}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 627
    .line 628
    .line 629
    throw v0

    .line 630
    :cond_f
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 635
    .line 636
    .line 637
    move-result v1

    .line 638
    add-int/lit8 v1, v1, 0x23

    .line 639
    .line 640
    new-instance v2, Ljava/lang/StringBuilder;

    .line 641
    .line 642
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-static {v1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    new-instance v1, Lhx2;

    .line 659
    .line 660
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    add-int/lit8 v2, v2, 0x23

    .line 669
    .line 670
    new-instance v3, Ljava/lang/StringBuilder;

    .line 671
    .line 672
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    const/4 v2, 0x1

    .line 686
    invoke-direct {v1, v0, v2}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 687
    .line 688
    .line 689
    throw v1
    :try_end_f
    .catch Lhx2; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 690
    :goto_e
    :try_start_10
    sget-object v1, Lmz1;->W8:Liz1;

    .line 691
    .line 692
    sget-object v2, Ltw1;->e:Ltw1;

    .line 693
    .line 694
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 695
    .line 696
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    check-cast v1, Ljava/lang/Boolean;

    .line 701
    .line 702
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    if-eqz v1, :cond_10

    .line 707
    .line 708
    sget-object v0, Lhg4;->C:Lhg4;

    .line 709
    .line 710
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 711
    .line 712
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 716
    .line 717
    .line 718
    move-result-wide v0

    .line 719
    sub-long/2addr v0, v7

    .line 720
    iput-wide v0, v12, Lzy2;->d:J

    .line 721
    .line 722
    goto/16 :goto_b

    .line 723
    .line 724
    :goto_f
    return-object v12

    .line 725
    :cond_10
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 726
    :goto_10
    :try_start_11
    invoke-virtual {v13}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 727
    .line 728
    .line 729
    throw v0
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_0

    .line 730
    :goto_11
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    const-string v2, "Error while connecting to ad server: "

    .line 739
    .line 740
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    invoke-static {v1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    new-instance v2, Lhx2;

    .line 748
    .line 749
    invoke-direct {v2, v1, v0}, Lhx2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 750
    .line 751
    .line 752
    throw v2
.end method

.method public D()Ljr3;
    .locals 5

    .line 1
    iget-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lls2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lls2;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Llx2;

    .line 10
    .line 11
    iget-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lxn1;

    .line 14
    .line 15
    invoke-virtual {v1}, Lxn1;->b()Lp21;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lxb4;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lls2;

    .line 22
    .line 23
    invoke-virtual {v2}, Lls2;->a()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lmo1;

    .line 28
    .line 29
    new-instance v3, Ljr3;

    .line 30
    .line 31
    const/16 v4, 0xa

    .line 32
    .line 33
    invoke-direct {v3, v0, v1, v2, v4}, Ljr3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    return-object v3
.end method

.method public E(JLkz2;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Lkz2;->B()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p3}, Lkz2;->b()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p3}, Lkz2;->b()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p3}, Lkz2;->K()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v3, 0x1b2

    .line 23
    .line 24
    if-ne v0, v3, :cond_1

    .line 25
    .line 26
    const v0, 0x47413934

    .line 27
    .line 28
    .line 29
    if-ne v1, v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    if-ne v2, v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lfw3;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2, p3}, Lfw3;->x(JLkz2;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method public declared-synchronized F(Lpc4;I)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    .line 4
    .line 5
    new-instance v0, Lz23;

    .line 6
    .line 7
    invoke-direct {v0, p2}, Lz23;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance p2, Lf23;

    .line 11
    .line 12
    invoke-direct {p2, p0}, Lf23;-><init>(Lxb4;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    iget-object v2, p0, Lxb4;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lbu1;

    .line 22
    .line 23
    invoke-virtual {v2, p1, v1, v0, p2}, Lbu1;->o(Lpc4;Ljava/lang/String;Lm54;Ly23;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1
.end method

.method public G()Lc83;
    .locals 1

    .line 1
    iget-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh83;

    .line 4
    .line 5
    iget-object v0, v0, Lh83;->b:Lp21;

    .line 6
    .line 7
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lc83;

    .line 10
    .line 11
    return-object v0
.end method

.method public H()Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    check-cast v4, Liz1;

    .line 24
    .line 25
    sget-object v5, Ltw1;->e:Ltw1;

    .line 26
    .line 27
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 28
    .line 29
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v2, Lso1;

    .line 51
    .line 52
    const-string v3, ""

    .line 53
    .line 54
    const/4 v4, 0x4

    .line 55
    const-string v5, "gad:dynamite_module:experiment_id"

    .line 56
    .line 57
    invoke-direct {v2, v5, v3, v4}, Lso1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 61
    .line 62
    .line 63
    sget-object v2, Lwl2;->j:Lso1;

    .line 64
    .line 65
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 66
    .line 67
    .line 68
    sget-object v2, Lwl2;->k:Lso1;

    .line 69
    .line 70
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 71
    .line 72
    .line 73
    sget-object v2, Lwl2;->l:Lso1;

    .line 74
    .line 75
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 76
    .line 77
    .line 78
    sget-object v2, Lwl2;->m:Lso1;

    .line 79
    .line 80
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 81
    .line 82
    .line 83
    sget-object v2, Lwl2;->n:Lso1;

    .line 84
    .line 85
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 86
    .line 87
    .line 88
    sget-object v2, Lwl2;->D:Lso1;

    .line 89
    .line 90
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 91
    .line 92
    .line 93
    sget-object v2, Lwl2;->o:Lso1;

    .line 94
    .line 95
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 96
    .line 97
    .line 98
    sget-object v2, Lwl2;->v:Lso1;

    .line 99
    .line 100
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 101
    .line 102
    .line 103
    sget-object v2, Lwl2;->w:Lso1;

    .line 104
    .line 105
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 106
    .line 107
    .line 108
    sget-object v2, Lwl2;->x:Lso1;

    .line 109
    .line 110
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 111
    .line 112
    .line 113
    sget-object v2, Lwl2;->y:Lso1;

    .line 114
    .line 115
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 116
    .line 117
    .line 118
    sget-object v2, Lwl2;->z:Lso1;

    .line 119
    .line 120
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 121
    .line 122
    .line 123
    sget-object v2, Lwl2;->A:Lso1;

    .line 124
    .line 125
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 126
    .line 127
    .line 128
    sget-object v2, Lwl2;->B:Lso1;

    .line 129
    .line 130
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 131
    .line 132
    .line 133
    sget-object v2, Lwl2;->C:Lso1;

    .line 134
    .line 135
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 136
    .line 137
    .line 138
    sget-object v2, Lwl2;->p:Lso1;

    .line 139
    .line 140
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 141
    .line 142
    .line 143
    sget-object v2, Lwl2;->q:Lso1;

    .line 144
    .line 145
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 146
    .line 147
    .line 148
    sget-object v2, Lwl2;->r:Lso1;

    .line 149
    .line 150
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 151
    .line 152
    .line 153
    sget-object v2, Lwl2;->s:Lso1;

    .line 154
    .line 155
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 156
    .line 157
    .line 158
    sget-object v2, Lwl2;->t:Lso1;

    .line 159
    .line 160
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 161
    .line 162
    .line 163
    sget-object v2, Lwl2;->u:Lso1;

    .line 164
    .line 165
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 169
    .line 170
    .line 171
    return-object v0
.end method

.method public J()Ljava/util/ArrayList;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lxb4;->H()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lxb4;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    check-cast v4, Liz1;

    .line 23
    .line 24
    sget-object v5, Ltw1;->e:Ltw1;

    .line 25
    .line 26
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 27
    .line 28
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    sget-object v2, Lm54;->c:Lso1;

    .line 50
    .line 51
    invoke-static {v1, v2}, Lob1;->C(Ljava/util/ArrayList;Lso1;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public T(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public Y()V
    .locals 9

    .line 1
    iget-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwy0;

    .line 4
    .line 5
    iget-object v1, v0, Lwy0;->h:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-boolean v2, v0, Lwy0;->f:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x1

    .line 17
    iput-boolean v2, v0, Lwy0;->f:Z

    .line 18
    .line 19
    iget-object v0, v0, Lwy0;->g:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v4, v0

    .line 22
    check-cast v4, Lvw1;

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    monitor-exit v1

    .line 27
    return-void

    .line 28
    :cond_1
    sget-object v0, Lmd2;->a:Lld2;

    .line 29
    .line 30
    iget-object v2, p0, Lxb4;->g:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v5, v2

    .line 33
    check-cast v5, Lww1;

    .line 34
    .line 35
    iget-object v2, p0, Lxb4;->h:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v6, v2

    .line 38
    check-cast v6, Lyw1;

    .line 39
    .line 40
    new-instance v2, Lvd;

    .line 41
    .line 42
    const/4 v7, 0x6

    .line 43
    const/4 v8, 0x0

    .line 44
    move-object v3, p0

    .line 45
    invoke-direct/range {v2 .. v8}, Lvd;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Lld2;->a(Ljava/lang/Runnable;)Ln70;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v2, Ljq3;

    .line 53
    .line 54
    const/16 v3, 0x19

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-direct {v2, v6, v0, v3, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Lmd2;->g:Lld2;

    .line 61
    .line 62
    iget-object v3, v6, Lpd2;->f:Lwq3;

    .line 63
    .line 64
    invoke-virtual {v3, v2, v0}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 65
    .line 66
    .line 67
    monitor-exit v1

    .line 68
    return-void

    .line 69
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    throw v0
.end method

.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxb4;->D()Ljr3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b(Lx13;Lnf1;Lin1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxb4;->h:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p3}, Lin1;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Lin1;->b()V

    .line 7
    .line 8
    .line 9
    iget p1, p3, Lin1;->d:I

    .line 10
    .line 11
    const/4 p3, 0x5

    .line 12
    invoke-interface {p2, p1, p3}, Lnf1;->z(II)Ljg1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lxb4;->i:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p2, p0, Lxb4;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, Lph4;

    .line 21
    .line 22
    invoke-interface {p1, p2}, Ljg1;->d(Lph4;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lxb4;->f:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    check-cast v0, Ljz2;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 1
    iget-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    check-cast v1, Lug4;

    iget-object v2, p0, Lxb4;->i:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance v3, Lgi;

    const/16 v4, 0x13

    invoke-direct {v3, p1, v2, v1, v4}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, v0, Ljz2;->g:Lpq3;

    invoke-interface {p1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    return-object p1

    .line 3
    :pswitch_0
    check-cast p1, Lyy2;

    invoke-virtual {p0, p1}, Lxb4;->C(Lyy2;)Lzy2;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lxb4;->f:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lum2;

    .line 4
    iget-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    check-cast v0, Lka2;

    iget-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lxb4;->i:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lum2;->J(Lka2;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :pswitch_0
    check-cast p1, Lq52;

    const-string p1, "loadNewJavascriptEngine (success): Trying to acquire lock"

    .line 6
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    iget-object p1, p0, Lxb4;->i:Ljava/lang/Object;

    check-cast p1, Lmm2;

    .line 7
    iget-object v0, p1, Lmm2;->b:Ljava/lang/Object;

    .line 8
    monitor-enter v0

    :try_start_0
    const-string v1, "loadNewJavascriptEngine (success): Lock acquired"

    .line 9
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 10
    iput v1, p1, Lmm2;->g:I

    .line 11
    iget-object v1, p1, Lmm2;->f:Ljava/lang/Object;

    check-cast v1, Lb62;

    if-eqz v1, :cond_0

    .line 12
    iget-object v2, p0, Lxb4;->g:Ljava/lang/Object;

    check-cast v2, Lb62;

    if-eq v2, v1, :cond_0

    const-string v1, "New JS engine is loaded, marking previous one as destroyable."

    .line 13
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 14
    iget-object v1, p1, Lmm2;->f:Ljava/lang/Object;

    check-cast v1, Lb62;

    .line 15
    invoke-virtual {v1}, Lb62;->y()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lxb4;->g:Ljava/lang/Object;

    check-cast v1, Lb62;

    .line 16
    iput-object v1, p1, Lmm2;->f:Ljava/lang/Object;

    .line 17
    sget-object v1, Ln02;->d:Lso1;

    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 18
    iget-object p1, p1, Lmm2;->e:Ljava/lang/Object;

    check-cast p1, Lea3;

    if-eqz p1, :cond_1

    .line 19
    iget-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    check-cast v1, Laa3;

    const/4 v2, 0x1

    .line 20
    invoke-interface {v1, v2}, Laa3;->b(Z)Laa3;

    invoke-interface {v1}, Laa3;->n()Lca3;

    move-result-object v1

    invoke-virtual {p1, v1}, Lea3;->b(Lca3;)V

    .line 21
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "loadNewJavascriptEngine (success): Lock released"

    .line 22
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    return-void

    .line 23
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public d()La83;
    .locals 1

    .line 1
    iget-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La83;

    .line 4
    .line 5
    return-object v0
.end method

.method public e(Lkz2;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx13;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Lx13;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-wide v2, v1, Lx13;->c:J

    .line 17
    .line 18
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-wide v6, v1, Lx13;->b:J

    .line 28
    .line 29
    add-long/2addr v2, v6

    .line 30
    :goto_0
    move-wide v7, v2

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p1, v0

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    invoke-virtual {v1}, Lx13;->a()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    monitor-exit v1

    .line 41
    iget-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    check-cast v2, Lx13;

    .line 45
    .line 46
    monitor-enter v2

    .line 47
    :try_start_1
    iget-wide v0, v2, Lx13;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    monitor-exit v2

    .line 50
    cmp-long v2, v7, v4

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    cmp-long v2, v0, v4

    .line 55
    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    iget-object v2, p0, Lxb4;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lph4;

    .line 62
    .line 63
    iget-wide v3, v2, Lph4;->r:J

    .line 64
    .line 65
    cmp-long v3, v0, v3

    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    new-instance v3, Lgg4;

    .line 70
    .line 71
    invoke-direct {v3, v2}, Lgg4;-><init>(Lph4;)V

    .line 72
    .line 73
    .line 74
    iput-wide v0, v3, Lgg4;->q:J

    .line 75
    .line 76
    new-instance v0, Lph4;

    .line 77
    .line 78
    invoke-direct {v0, v3}, Lph4;-><init>(Lgg4;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    .line 82
    .line 83
    iget-object v1, p0, Lxb4;->i:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Ljg1;

    .line 86
    .line 87
    invoke-interface {v1, v0}, Ljg1;->d(Lph4;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-virtual {p1}, Lkz2;->B()I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    iget-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ljg1;

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-interface {v0, p1, v10, v1}, Ljg1;->a(Lkz2;II)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lxb4;->i:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v6, p1

    .line 105
    check-cast v6, Ljg1;

    .line 106
    .line 107
    const/4 v11, 0x0

    .line 108
    const/4 v12, 0x0

    .line 109
    const/4 v9, 0x1

    .line 110
    invoke-interface/range {v6 .. v12}, Ljg1;->c(JIIILig1;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    :goto_2
    return-void

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    move-object p1, v0

    .line 116
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 117
    throw p1

    .line 118
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 119
    throw p1
.end method

.method public f()Lmj0;
    .locals 8

    .line 1
    new-instance v0, Lmj0;

    .line 2
    .line 3
    iget-object v1, p0, Lxb4;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/UUID;

    .line 6
    .line 7
    iget-object v2, p0, Lxb4;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Loa1;

    .line 10
    .line 11
    iget-object v3, p0, Lxb4;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Lmj0;->a:Ljava/util/UUID;

    .line 19
    .line 20
    iput-object v2, v0, Lmj0;->b:Loa1;

    .line 21
    .line 22
    iput-object v3, v0, Lmj0;->c:Ljava/util/HashSet;

    .line 23
    .line 24
    iget-object v1, v2, Loa1;->j:Lri;

    .line 25
    .line 26
    iget-object v2, v1, Lri;->h:Lhj;

    .line 27
    .line 28
    iget-object v2, v2, Lhj;->a:Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-lez v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-boolean v2, v1, Lri;->d:Z

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    iget-boolean v2, v1, Lri;->b:Z

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    iget-boolean v1, v1, Lri;->c:Z

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    move v1, v3

    .line 54
    :goto_1
    iget-object v2, p0, Lxb4;->h:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Loa1;

    .line 57
    .line 58
    iget-boolean v2, v2, Loa1;->q:Z

    .line 59
    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    const-string v1, "Expedited jobs only support network and storage constraints"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_4
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, p0, Lxb4;->g:Ljava/lang/Object;

    .line 78
    .line 79
    new-instance v1, Loa1;

    .line 80
    .line 81
    iget-object v2, p0, Lxb4;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Loa1;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    iput v3, v1, Loa1;->b:I

    .line 89
    .line 90
    sget-object v4, Lim;->c:Lim;

    .line 91
    .line 92
    iput-object v4, v1, Loa1;->e:Lim;

    .line 93
    .line 94
    iput-object v4, v1, Loa1;->f:Lim;

    .line 95
    .line 96
    sget-object v4, Lri;->i:Lri;

    .line 97
    .line 98
    iput-object v4, v1, Loa1;->j:Lri;

    .line 99
    .line 100
    iput v3, v1, Loa1;->l:I

    .line 101
    .line 102
    const-wide/16 v4, 0x7530

    .line 103
    .line 104
    iput-wide v4, v1, Loa1;->m:J

    .line 105
    .line 106
    const-wide/16 v4, -0x1

    .line 107
    .line 108
    iput-wide v4, v1, Loa1;->p:J

    .line 109
    .line 110
    iput v3, v1, Loa1;->r:I

    .line 111
    .line 112
    iget-object v6, v2, Loa1;->a:Ljava/lang/String;

    .line 113
    .line 114
    iput-object v6, v1, Loa1;->a:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v6, v2, Loa1;->c:Ljava/lang/String;

    .line 117
    .line 118
    iput-object v6, v1, Loa1;->c:Ljava/lang/String;

    .line 119
    .line 120
    iget v6, v2, Loa1;->b:I

    .line 121
    .line 122
    iput v6, v1, Loa1;->b:I

    .line 123
    .line 124
    iget-object v6, v2, Loa1;->d:Ljava/lang/String;

    .line 125
    .line 126
    iput-object v6, v1, Loa1;->d:Ljava/lang/String;

    .line 127
    .line 128
    new-instance v6, Lim;

    .line 129
    .line 130
    iget-object v7, v2, Loa1;->e:Lim;

    .line 131
    .line 132
    invoke-direct {v6, v7}, Lim;-><init>(Lim;)V

    .line 133
    .line 134
    .line 135
    iput-object v6, v1, Loa1;->e:Lim;

    .line 136
    .line 137
    new-instance v6, Lim;

    .line 138
    .line 139
    iget-object v7, v2, Loa1;->f:Lim;

    .line 140
    .line 141
    invoke-direct {v6, v7}, Lim;-><init>(Lim;)V

    .line 142
    .line 143
    .line 144
    iput-object v6, v1, Loa1;->f:Lim;

    .line 145
    .line 146
    iget-wide v6, v2, Loa1;->g:J

    .line 147
    .line 148
    iput-wide v6, v1, Loa1;->g:J

    .line 149
    .line 150
    iget-wide v6, v2, Loa1;->h:J

    .line 151
    .line 152
    iput-wide v6, v1, Loa1;->h:J

    .line 153
    .line 154
    iget-wide v6, v2, Loa1;->i:J

    .line 155
    .line 156
    iput-wide v6, v1, Loa1;->i:J

    .line 157
    .line 158
    new-instance v6, Lri;

    .line 159
    .line 160
    iget-object v7, v2, Loa1;->j:Lri;

    .line 161
    .line 162
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 163
    .line 164
    .line 165
    iput v3, v6, Lri;->a:I

    .line 166
    .line 167
    iput-wide v4, v6, Lri;->f:J

    .line 168
    .line 169
    iput-wide v4, v6, Lri;->g:J

    .line 170
    .line 171
    new-instance v3, Lhj;

    .line 172
    .line 173
    invoke-direct {v3}, Lhj;-><init>()V

    .line 174
    .line 175
    .line 176
    iput-object v3, v6, Lri;->h:Lhj;

    .line 177
    .line 178
    iget-boolean v3, v7, Lri;->b:Z

    .line 179
    .line 180
    iput-boolean v3, v6, Lri;->b:Z

    .line 181
    .line 182
    iget-boolean v3, v7, Lri;->c:Z

    .line 183
    .line 184
    iput-boolean v3, v6, Lri;->c:Z

    .line 185
    .line 186
    iget v3, v7, Lri;->a:I

    .line 187
    .line 188
    iput v3, v6, Lri;->a:I

    .line 189
    .line 190
    iget-boolean v3, v7, Lri;->d:Z

    .line 191
    .line 192
    iput-boolean v3, v6, Lri;->d:Z

    .line 193
    .line 194
    iget-boolean v3, v7, Lri;->e:Z

    .line 195
    .line 196
    iput-boolean v3, v6, Lri;->e:Z

    .line 197
    .line 198
    iget-object v3, v7, Lri;->h:Lhj;

    .line 199
    .line 200
    iput-object v3, v6, Lri;->h:Lhj;

    .line 201
    .line 202
    iput-object v6, v1, Loa1;->j:Lri;

    .line 203
    .line 204
    iget v3, v2, Loa1;->k:I

    .line 205
    .line 206
    iput v3, v1, Loa1;->k:I

    .line 207
    .line 208
    iget v3, v2, Loa1;->l:I

    .line 209
    .line 210
    iput v3, v1, Loa1;->l:I

    .line 211
    .line 212
    iget-wide v3, v2, Loa1;->m:J

    .line 213
    .line 214
    iput-wide v3, v1, Loa1;->m:J

    .line 215
    .line 216
    iget-wide v3, v2, Loa1;->n:J

    .line 217
    .line 218
    iput-wide v3, v1, Loa1;->n:J

    .line 219
    .line 220
    iget-wide v3, v2, Loa1;->o:J

    .line 221
    .line 222
    iput-wide v3, v1, Loa1;->o:J

    .line 223
    .line 224
    iget-wide v3, v2, Loa1;->p:J

    .line 225
    .line 226
    iput-wide v3, v1, Loa1;->p:J

    .line 227
    .line 228
    iget-boolean v3, v2, Loa1;->q:Z

    .line 229
    .line 230
    iput-boolean v3, v1, Loa1;->q:Z

    .line 231
    .line 232
    iget v2, v2, Loa1;->r:I

    .line 233
    .line 234
    iput v2, v1, Loa1;->r:I

    .line 235
    .line 236
    iput-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    .line 237
    .line 238
    iget-object v2, p0, Lxb4;->g:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, Ljava/util/UUID;

    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    iput-object v2, v1, Loa1;->a:Ljava/lang/String;

    .line 247
    .line 248
    return-object v0
.end method

.method public h()Lgi4;
    .locals 4

    .line 1
    new-instance v0, Lk01;

    .line 2
    .line 3
    invoke-direct {v0}, Lk01;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lxb4;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    new-instance v2, Lsz2;

    .line 11
    .line 12
    const/16 v3, 0x11

    .line 13
    .line 14
    invoke-direct {v2, p0, v0, v3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lk01;->a:Lgi4;

    .line 21
    .line 22
    return-object v0
.end method

.method public bridge synthetic i(Llv2;Lj73;)Ln70;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lxb4;->A(Llm2;)Lgq3;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public j(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llu0;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Llu0;->execute(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public k(I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    iget-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Lxb4;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v2, v1}, Lob1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public bridge synthetic l()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public m(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p1, v1}, Lob1;->h(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public n(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Ll6;->a()Ll6;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lxb4;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v2, v0, Ll6;->a:Lzp0;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {v2, v1, p1, v3}, Lzp0;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v0

    .line 39
    return-object p1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method

.method public o(IILj7;)Landroid/graphics/Typeface;
    .locals 9

    .line 1
    iget-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lxb4;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroid/util/TypedValue;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Landroid/util/TypedValue;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lxb4;->i:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_1
    iget-object p1, p0, Lxb4;->g:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    check-cast v2, Landroid/content/Context;

    .line 30
    .line 31
    iget-object p1, p0, Lxb4;->i:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v4, p1

    .line 34
    check-cast v4, Landroid/util/TypedValue;

    .line 35
    .line 36
    sget-object p1, Lfq0;->a:Ljava/lang/ThreadLocal;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :goto_0
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    :cond_2
    const/4 v7, 0x1

    .line 47
    const/4 v8, 0x0

    .line 48
    move v5, p2

    .line 49
    move-object v6, p3

    .line 50
    invoke-static/range {v2 .. v8}, Lfq0;->a(Landroid/content/Context;ILandroid/util/TypedValue;ILg82;ZZ)Landroid/graphics/Typeface;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method public p(Ljava/lang/CharSequence;IILq31;)Z
    .locals 7

    .line 1
    iget v0, p4, Lq31;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lor;

    .line 13
    .line 14
    invoke-virtual {p4}, Lq31;->b()Loe0;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/16 v5, 0x8

    .line 19
    .line 20
    invoke-virtual {v4, v5}, Lcb0;->a(I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    iget-object v6, v4, Lcb0;->i:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v4, v4, Lcb0;->f:I

    .line 31
    .line 32
    add-int/2addr v5, v4

    .line 33
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 34
    .line 35
    .line 36
    :cond_0
    check-cast v0, Lcn;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v4, Lcn;->b:Ljava/lang/ThreadLocal;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    new-instance v5, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 64
    .line 65
    .line 66
    :goto_0
    if-ge p2, p3, :cond_2

    .line 67
    .line 68
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    add-int/lit8 p2, p2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iget-object p1, v0, Lcn;->a:Landroid/text/TextPaint;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    sget p3, Lfk0;->a:I

    .line 85
    .line 86
    invoke-static {p1, p2}, Ldk0;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iget p2, p4, Lq31;->c:I

    .line 91
    .line 92
    and-int/lit8 p2, p2, 0x4

    .line 93
    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    or-int/lit8 p1, p2, 0x2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    or-int/lit8 p1, p2, 0x1

    .line 100
    .line 101
    :goto_1
    iput p1, p4, Lq31;->c:I

    .line 102
    .line 103
    :cond_4
    iget p1, p4, Lq31;->c:I

    .line 104
    .line 105
    and-int/lit8 p1, p1, 0x3

    .line 106
    .line 107
    if-ne p1, v1, :cond_5

    .line 108
    .line 109
    return v3

    .line 110
    :cond_5
    return v2
.end method

.method public q(ZLandroid/content/Context;Lan2;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p3, p0, Lxb4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, Lc03;

    .line 4
    .line 5
    iget-object p3, p3, Lc03;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p3, Lu83;

    .line 8
    .line 9
    invoke-virtual {p3, p1}, Lu83;->b(Z)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p3, Lu83;->a:Lw62;

    .line 13
    .line 14
    iget-object p3, p0, Lxb4;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p3, Lr03;

    .line 17
    .line 18
    iget-object p3, p3, Lr03;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p3, Le51;

    .line 21
    .line 22
    iget p3, p3, Le51;->h:I

    .line 23
    .line 24
    sget-object v0, Lmz1;->Q0:Liz1;

    .line 25
    .line 26
    sget-object v1, Ltw1;->e:Ltw1;

    .line 27
    .line 28
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v0
    :try_end_0
    .catch Ln83; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    if-ge p3, v0, :cond_0

    .line 41
    .line 42
    :try_start_1
    invoke-interface {p1}, Lw62;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    :try_start_2
    new-instance p2, Ln83;

    .line 48
    .line 49
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw p2
    :try_end_2
    .catch Ln83; {:try_start_2 .. :try_end_2} :catch_0

    .line 53
    :cond_0
    :try_start_3
    new-instance p3, Loi0;

    .line 54
    .line 55
    invoke-direct {p3, p2}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, p3}, Lw62;->e1(Lu10;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catchall_1
    move-exception p1

    .line 63
    :try_start_4
    new-instance p2, Ln83;

    .line 64
    .line 65
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw p2
    :try_end_4
    .catch Ln83; {:try_start_4 .. :try_end_4} :catch_0

    .line 69
    :catch_0
    move-exception p1

    .line 70
    const-string p2, "Cannot show interstitial."

    .line 71
    .line 72
    invoke-static {p2}, Lgi2;->f0(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance p2, Lpq2;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw p2
.end method

.method public s()V
    .locals 3

    .line 1
    const-string v0, "#008 Must be called on the main UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x2c

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const-string v1, "Adapter called onAdFailedToLoad with error 0."

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    iget-object v1, p0, Lxb4;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lz62;

    .line 37
    .line 38
    invoke-interface {v1, v0}, Lz62;->m0(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    move-exception v0

    .line 43
    const-string v1, "#007 Could not call remote method."

    .line 44
    .line 45
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public t(Lr2;)V
    .locals 6

    .line 1
    const-string v0, "#008 Must be called on the main UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Lr2;->g:I

    .line 7
    .line 8
    iget-object v1, p1, Lr2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p1, Lr2;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    add-int/lit8 v3, v3, 0x47

    .line 41
    .line 42
    add-int/2addr v3, v4

    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0xf

    .line 46
    .line 47
    add-int/2addr v3, v5

    .line 48
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 49
    .line 50
    .line 51
    const-string v3, "Adapter called onAdFailedToLoad with error. ErrorCode: "

    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, ". ErrorMessage: "

    .line 60
    .line 61
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, ". ErrorDomain: "

    .line 68
    .line 69
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :try_start_0
    iget-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lz62;

    .line 85
    .line 86
    invoke-virtual {p1}, Lr2;->d()Lnx2;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-interface {v0, p1}, Lz62;->K0(Lnx2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catch_0
    move-exception p1

    .line 95
    const-string v0, "#007 Could not call remote method."

    .line 96
    .line 97
    invoke-static {v0, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public u(Lr2;)V
    .locals 6

    .line 1
    const-string v0, "#008 Must be called on the main UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Lr2;->g:I

    .line 7
    .line 8
    iget-object v1, p1, Lr2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p1, Lr2;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    add-int/lit8 v3, v3, 0x47

    .line 41
    .line 42
    add-int/2addr v3, v4

    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0xf

    .line 46
    .line 47
    add-int/2addr v3, v5

    .line 48
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 49
    .line 50
    .line 51
    const-string v3, "Adapter called onAdFailedToLoad with error. ErrorCode: "

    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, ". ErrorMessage: "

    .line 60
    .line 61
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, ". ErrorDomain: "

    .line 68
    .line 69
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :try_start_0
    iget-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lz62;

    .line 85
    .line 86
    invoke-virtual {p1}, Lr2;->d()Lnx2;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-interface {v0, p1}, Lz62;->K0(Lnx2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catch_0
    move-exception p1

    .line 95
    const-string v0, "#007 Could not call remote method."

    .line 96
    .line 97
    invoke-static {v0, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public v(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmt2;

    .line 4
    .line 5
    iget-object v1, p0, Lxb4;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lag2;

    .line 8
    .line 9
    iget-object v2, p0, Lxb4;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lyw1;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lmt2;->a:Ll83;

    .line 17
    .line 18
    sget-object v3, Lmz1;->n4:Liz1;

    .line 19
    .line 20
    sget-object v4, Ltw1;->e:Ltw1;

    .line 21
    .line 22
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-eqz p4, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Ll83;->a:Lih3;

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-interface {v1}, Lag2;->f()Lqg2;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-eqz p2, :cond_0

    .line 47
    .line 48
    invoke-interface {v1}, Lag2;->f()Lqg2;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p2, p1}, Lqg2;->C3(Lih3;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-virtual {v2}, Lyw1;->d()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    new-instance p4, Lr13;

    .line 60
    .line 61
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    add-int/lit8 v0, v0, 0x40

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    add-int/2addr v0, v1

    .line 84
    add-int/lit8 v0, v0, 0xf

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    add-int/2addr v0, v1

    .line 93
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 94
    .line 95
    .line 96
    const-string v0, "Native Video WebView failed to load. Error code: "

    .line 97
    .line 98
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p2, ", Description: "

    .line 105
    .line 106
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p1, ", Failing URL: "

    .line 113
    .line 114
    invoke-static {v3, p1, p3}, Lex0;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const/4 p2, 0x1

    .line 119
    invoke-direct {p4, p1, p2}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, p4}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_2
    iget-object p1, v0, Ll83;->a:Lih3;

    .line 127
    .line 128
    if-eqz p1, :cond_3

    .line 129
    .line 130
    invoke-interface {v1}, Lag2;->f()Lqg2;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    if-eqz p2, :cond_3

    .line 135
    .line 136
    invoke-interface {v1}, Lag2;->f()Lqg2;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-virtual {p2, p1}, Lqg2;->C3(Lih3;)V

    .line 141
    .line 142
    .line 143
    :cond_3
    invoke-virtual {v2}, Lyw1;->d()V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public w(Lr2;)V
    .locals 6

    .line 1
    const-string v0, "#008 Must be called on the main UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Lr2;->g:I

    .line 7
    .line 8
    iget-object v1, p1, Lr2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p1, Lr2;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    add-int/lit8 v3, v3, 0x47

    .line 41
    .line 42
    add-int/2addr v3, v4

    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0xf

    .line 46
    .line 47
    add-int/2addr v3, v5

    .line 48
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 49
    .line 50
    .line 51
    const-string v3, "Adapter called onAdFailedToLoad with error. ErrorCode: "

    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, ". ErrorMessage: "

    .line 60
    .line 61
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, ". ErrorDomain: "

    .line 68
    .line 69
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :try_start_0
    iget-object v0, p0, Lxb4;->g:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lz62;

    .line 85
    .line 86
    invoke-virtual {p1}, Lr2;->d()Lnx2;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-interface {v0, p1}, Lz62;->K0(Lnx2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catch_0
    move-exception p1

    .line 95
    const-string v0, "#007 Could not call remote method."

    .line 96
    .line 97
    invoke-static {v0, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public x(Lt50;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmu0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lmu0;->run()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Lmu0;

    .line 11
    .line 12
    iget-object v1, p0, Lxb4;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ld60;

    .line 15
    .line 16
    invoke-direct {v0, v1, p1}, Lmu0;-><init>(Ld60;Lt50;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lxb4;->i:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p1, p0, Lxb4;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public y(Ljava/lang/CharSequence;IIIZLcs;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    new-instance v5, Lds;

    .line 12
    .line 13
    iget-object v6, v0, Lxb4;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Lmc2;

    .line 16
    .line 17
    iget-object v6, v6, Lmc2;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v6, Lqe0;

    .line 20
    .line 21
    invoke-direct {v5, v6}, Lds;-><init>(Lqe0;)V

    .line 22
    .line 23
    .line 24
    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x1

    .line 30
    move v9, v6

    .line 31
    move v10, v7

    .line 32
    move v11, v8

    .line 33
    move/from16 v6, p2

    .line 34
    .line 35
    :cond_0
    :goto_0
    move v7, v6

    .line 36
    :goto_1
    const/4 v12, 0x2

    .line 37
    if-ge v6, v2, :cond_f

    .line 38
    .line 39
    if-ge v10, v3, :cond_f

    .line 40
    .line 41
    if-eqz v11, :cond_f

    .line 42
    .line 43
    iget-object v13, v5, Lds;->c:Lqe0;

    .line 44
    .line 45
    iget-object v13, v13, Lqe0;->a:Landroid/util/SparseArray;

    .line 46
    .line 47
    if-nez v13, :cond_1

    .line 48
    .line 49
    const/4 v13, 0x0

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    check-cast v13, Lqe0;

    .line 56
    .line 57
    :goto_2
    iget v14, v5, Lds;->a:I

    .line 58
    .line 59
    const/4 v15, 0x3

    .line 60
    if-eq v14, v12, :cond_3

    .line 61
    .line 62
    if-nez v13, :cond_2

    .line 63
    .line 64
    invoke-virtual {v5}, Lds;->a()V

    .line 65
    .line 66
    .line 67
    :goto_3
    move v13, v8

    .line 68
    goto :goto_6

    .line 69
    :cond_2
    iput v12, v5, Lds;->a:I

    .line 70
    .line 71
    iput-object v13, v5, Lds;->c:Lqe0;

    .line 72
    .line 73
    iput v8, v5, Lds;->f:I

    .line 74
    .line 75
    :goto_4
    move v13, v12

    .line 76
    goto :goto_6

    .line 77
    :cond_3
    if-eqz v13, :cond_4

    .line 78
    .line 79
    iput-object v13, v5, Lds;->c:Lqe0;

    .line 80
    .line 81
    iget v13, v5, Lds;->f:I

    .line 82
    .line 83
    add-int/2addr v13, v8

    .line 84
    iput v13, v5, Lds;->f:I

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    const v13, 0xfe0e

    .line 88
    .line 89
    .line 90
    if-ne v9, v13, :cond_5

    .line 91
    .line 92
    invoke-virtual {v5}, Lds;->a()V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    const v13, 0xfe0f

    .line 97
    .line 98
    .line 99
    if-ne v9, v13, :cond_6

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    iget-object v13, v5, Lds;->c:Lqe0;

    .line 103
    .line 104
    iget-object v14, v13, Lqe0;->b:Lq31;

    .line 105
    .line 106
    if-eqz v14, :cond_9

    .line 107
    .line 108
    iget v14, v5, Lds;->f:I

    .line 109
    .line 110
    if-ne v14, v8, :cond_8

    .line 111
    .line 112
    invoke-virtual {v5}, Lds;->b()Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_7

    .line 117
    .line 118
    iget-object v13, v5, Lds;->c:Lqe0;

    .line 119
    .line 120
    iput-object v13, v5, Lds;->d:Lqe0;

    .line 121
    .line 122
    invoke-virtual {v5}, Lds;->a()V

    .line 123
    .line 124
    .line 125
    :goto_5
    move v13, v15

    .line 126
    goto :goto_6

    .line 127
    :cond_7
    invoke-virtual {v5}, Lds;->a()V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    iput-object v13, v5, Lds;->d:Lqe0;

    .line 132
    .line 133
    invoke-virtual {v5}, Lds;->a()V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_9
    invoke-virtual {v5}, Lds;->a()V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :goto_6
    iput v9, v5, Lds;->e:I

    .line 142
    .line 143
    if-eq v13, v8, :cond_e

    .line 144
    .line 145
    if-eq v13, v12, :cond_c

    .line 146
    .line 147
    if-eq v13, v15, :cond_a

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_a
    if-nez p5, :cond_b

    .line 151
    .line 152
    iget-object v12, v5, Lds;->d:Lqe0;

    .line 153
    .line 154
    iget-object v12, v12, Lqe0;->b:Lq31;

    .line 155
    .line 156
    invoke-virtual {v0, v1, v7, v6, v12}, Lxb4;->p(Ljava/lang/CharSequence;IILq31;)Z

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    if-nez v12, :cond_0

    .line 161
    .line 162
    :cond_b
    iget-object v11, v5, Lds;->d:Lqe0;

    .line 163
    .line 164
    iget-object v11, v11, Lqe0;->b:Lq31;

    .line 165
    .line 166
    invoke-interface {v4, v1, v7, v6, v11}, Lcs;->g(Ljava/lang/CharSequence;IILq31;)Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    add-int/lit8 v10, v10, 0x1

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    add-int/2addr v12, v6

    .line 179
    if-ge v12, v2, :cond_d

    .line 180
    .line 181
    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    move v9, v6

    .line 186
    :cond_d
    move v6, v12

    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    add-int/2addr v6, v7

    .line 198
    if-ge v6, v2, :cond_0

    .line 199
    .line 200
    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    move v9, v7

    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_f
    iget v2, v5, Lds;->a:I

    .line 208
    .line 209
    if-ne v2, v12, :cond_12

    .line 210
    .line 211
    iget-object v2, v5, Lds;->c:Lqe0;

    .line 212
    .line 213
    iget-object v2, v2, Lqe0;->b:Lq31;

    .line 214
    .line 215
    if-eqz v2, :cond_12

    .line 216
    .line 217
    iget v2, v5, Lds;->f:I

    .line 218
    .line 219
    if-gt v2, v8, :cond_10

    .line 220
    .line 221
    invoke-virtual {v5}, Lds;->b()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_12

    .line 226
    .line 227
    :cond_10
    if-ge v10, v3, :cond_12

    .line 228
    .line 229
    if-eqz v11, :cond_12

    .line 230
    .line 231
    if-nez p5, :cond_11

    .line 232
    .line 233
    iget-object v2, v5, Lds;->c:Lqe0;

    .line 234
    .line 235
    iget-object v2, v2, Lqe0;->b:Lq31;

    .line 236
    .line 237
    invoke-virtual {v0, v1, v7, v6, v2}, Lxb4;->p(Ljava/lang/CharSequence;IILq31;)Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-nez v2, :cond_12

    .line 242
    .line 243
    :cond_11
    iget-object v2, v5, Lds;->c:Lqe0;

    .line 244
    .line 245
    iget-object v2, v2, Lqe0;->b:Lq31;

    .line 246
    .line 247
    invoke-interface {v4, v1, v7, v6, v2}, Lcs;->g(Ljava/lang/CharSequence;IILq31;)Z

    .line 248
    .line 249
    .line 250
    :cond_12
    invoke-interface {v4}, Lcs;->b()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    return-object v1
.end method

.method public z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxb4;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
