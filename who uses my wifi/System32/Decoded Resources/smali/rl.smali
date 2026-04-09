.class public final Lrl;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lnf1;
.implements Lgj4;


# instance fields
.field public f:Z

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lrl;->g:Ljava/lang/Object;

    .line 22
    new-instance v0, Lpz;

    const/16 v1, 0x10

    .line 23
    invoke-direct {v0, v1}, Lpz;-><init>(I)V

    .line 24
    iput-object v0, p0, Lrl;->h:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lrl;->f:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ll92;Z)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lrl;->g:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, Lrl;->h:Ljava/lang/Object;

    .line 18
    iput-object p3, p0, Lrl;->i:Ljava/lang/Object;

    .line 19
    iput-boolean p4, p0, Lrl;->f:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Llj4;Ljava/lang/Boolean;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1}, Lbd2;->B(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object p1

    :goto_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    if-eqz p3, :cond_1

    .line 7
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_3

    .line 8
    :cond_1
    invoke-static {p1}, Ls0;->b(Landroid/media/AudioManager;)Landroid/media/Spatializer;

    move-result-object p1

    iput-object p1, p0, Lrl;->g:Ljava/lang/Object;

    .line 9
    invoke-static {p1}, Ls0;->a(Landroid/media/Spatializer;)I

    move-result p3

    if-eqz p3, :cond_2

    const/4 v1, 0x1

    :cond_2
    iput-boolean v1, p0, Lrl;->f:Z

    .line 10
    new-instance p3, Lej4;

    invoke-direct {p3, p0, p2}, Lej4;-><init>(Lrl;Llj4;)V

    iput-object p3, p0, Lrl;->i:Ljava/lang/Object;

    new-instance p2, Landroid/os/Handler;

    .line 11
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lrl;->h:Ljava/lang/Object;

    .line 14
    new-instance v0, Lvb1;

    const/4 v1, 0x4

    invoke-direct {v0, p2, v1}, Lvb1;-><init>(Landroid/os/Handler;I)V

    invoke-static {p1, v0, p3}, Ls0;->f(Landroid/media/Spatializer;Lvb1;Lej4;)V

    return-void

    :cond_3
    iput-object v0, p0, Lrl;->g:Ljava/lang/Object;

    iput-boolean v1, p0, Lrl;->f:Z

    iput-object v0, p0, Lrl;->h:Ljava/lang/Object;

    iput-object v0, p0, Lrl;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lao1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrl;->f:Z

    iput-object p1, p0, Lrl;->g:Ljava/lang/Object;

    iput-object p2, p0, Lrl;->h:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lrl;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Llj4;Ldj4;Z[I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrl;->g:Ljava/lang/Object;

    iput-object p2, p0, Lrl;->h:Ljava/lang/Object;

    iput-boolean p3, p0, Lrl;->f:Z

    iput-object p4, p0, Lrl;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lmc2;)V
    .locals 3

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lrl;->g:Ljava/lang/Object;

    .line 28
    new-instance v1, Lpz;

    const/16 v2, 0x10

    .line 29
    invoke-direct {v1, v2}, Lpz;-><init>(I)V

    .line 30
    iput-object v1, p0, Lrl;->h:Ljava/lang/Object;

    const/4 v1, 0x1

    .line 31
    iput-boolean v1, p0, Lrl;->f:Z

    if-eqz p1, :cond_0

    .line 32
    iget-object v1, p1, Lmc2;->j:Ljava/lang/Object;

    check-cast v1, Landroid/content/ComponentName;

    .line 33
    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    iget-object p1, p1, Lmc2;->i:Ljava/lang/Object;

    check-cast p1, Lnl;

    .line 35
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 36
    const-string v2, "android.support.customtabs.extra.SESSION"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 37
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lnf1;Ljk1;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrl;->g:Ljava/lang/Object;

    iput-object p2, p0, Lrl;->h:Ljava/lang/Object;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lrl;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Loo1;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrl;->f:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lrl;->g:Ljava/lang/Object;

    iput-object v0, p0, Lrl;->h:Ljava/lang/Object;

    iput-object p1, p0, Lrl;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ll92;
    .locals 9

    .line 1
    iget-object v0, p0, Lrl;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Intent;

    .line 4
    .line 5
    const-string v1, "android.support.customtabs.extra.SESSION"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    :cond_0
    const-string v1, "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"

    .line 26
    .line 27
    iget-boolean v2, p0, Lrl;->f:Z

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lrl;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lpz;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v1, Landroid/os/Bundle;

    .line 40
    .line 41
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    const-string v1, "androidx.browser.customtabs.extra.SHARE_STATE"

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    invoke-static {}, Lpl;->a()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_2

    .line 64
    .line 65
    const-string v5, "com.android.browser.headers"

    .line 66
    .line 67
    invoke-virtual {v0, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    invoke-virtual {v0, v5}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    new-instance v6, Landroid/os/Bundle;

    .line 79
    .line 80
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 81
    .line 82
    .line 83
    :goto_0
    const-string v7, "Accept-Language"

    .line 84
    .line 85
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-nez v8, :cond_2

    .line 90
    .line 91
    invoke-virtual {v6, v7, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    :cond_2
    const/16 v4, 0x22

    .line 98
    .line 99
    if-lt v1, v4, :cond_4

    .line 100
    .line 101
    iget-object v1, p0, Lrl;->i:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, Landroid/app/ActivityOptions;

    .line 104
    .line 105
    if-nez v1, :cond_3

    .line 106
    .line 107
    invoke-static {}, Lol;->a()Landroid/app/ActivityOptions;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iput-object v1, p0, Lrl;->i:Ljava/lang/Object;

    .line 112
    .line 113
    :cond_3
    iget-object v1, p0, Lrl;->i:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v1, Landroid/app/ActivityOptions;

    .line 116
    .line 117
    invoke-static {v1, v2}, Lql;->a(Landroid/app/ActivityOptions;Z)V

    .line 118
    .line 119
    .line 120
    :cond_4
    iget-object v1, p0, Lrl;->i:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Landroid/app/ActivityOptions;

    .line 123
    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    invoke-virtual {v1}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    :cond_5
    new-instance v1, Ll92;

    .line 131
    .line 132
    invoke-direct {v1, v0, v3}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    return-object v1
.end method

.method public e(ILd02;[I)Lsn3;
    .locals 10

    .line 1
    new-instance v7, Lzi4;

    .line 2
    .line 3
    iget-object v0, p0, Lrl;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Llj4;

    .line 6
    .line 7
    iget-object v1, p0, Lrl;->h:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v4, v1

    .line 10
    check-cast v4, Ldj4;

    .line 11
    .line 12
    invoke-direct {v7, v0, v4}, Lzi4;-><init>(Llj4;Ldj4;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lrl;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, [I

    .line 18
    .line 19
    aget v0, v0, p1

    .line 20
    .line 21
    sget-object v0, Lxm3;->g:Lvm3;

    .line 22
    .line 23
    const-string v0, "initialCapacity"

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    invoke-static {v0, v1}, Lob1;->z(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    new-array v0, v1, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    move-object v8, v0

    .line 33
    move v3, v1

    .line 34
    move v9, v3

    .line 35
    :goto_0
    iget v0, p2, Ld02;->a:I

    .line 36
    .line 37
    if-ge v3, v0, :cond_1

    .line 38
    .line 39
    iget-boolean v6, p0, Lrl;->f:Z

    .line 40
    .line 41
    new-instance v0, Lyi4;

    .line 42
    .line 43
    aget v5, p3, v3

    .line 44
    .line 45
    move v1, p1

    .line 46
    move-object v2, p2

    .line 47
    invoke-direct/range {v0 .. v7}, Lyi4;-><init>(ILd02;ILdj4;IZLzi4;)V

    .line 48
    .line 49
    .line 50
    array-length p1, v8

    .line 51
    add-int/lit8 p2, v9, 0x1

    .line 52
    .line 53
    invoke-static {p1, p2}, Lrm3;->d(II)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-gt v5, p1, :cond_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    move-object v8, p1

    .line 65
    :goto_1
    aput-object v0, v8, v9

    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    move v9, p2

    .line 70
    move p1, v1

    .line 71
    move-object p2, v2

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-static {v8, v9}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
.end method

.method public s()V
    .locals 3

    .line 1
    iget-object v0, p0, Lrl;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnf1;

    .line 4
    .line 5
    invoke-interface {v0}, Lnf1;->s()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lrl;->f:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Lrl;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroid/util/SparseArray;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ge v0, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lmk1;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    iput-boolean v2, v1, Lmk1;->i:Z

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method public v(Lcg1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lrl;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnf1;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lnf1;->v(Lcg1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public z(II)Ljg1;
    .locals 3

    .line 1
    iget-object v0, p0, Lrl;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnf1;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-eq p2, v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lrl;->f:Z

    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Lnf1;->z(II)Ljg1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object p2, p0, Lrl;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lmk1;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_1
    new-instance v2, Lmk1;

    .line 30
    .line 31
    invoke-interface {v0, p1, v1}, Lnf1;->z(II)Ljg1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, Lrl;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ljk1;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, Lmk1;-><init>(Ljg1;Ljk1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, p1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v2
.end method
