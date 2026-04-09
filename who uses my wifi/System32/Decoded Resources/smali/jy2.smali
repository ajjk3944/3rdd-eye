.class public final Ljy2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljo2;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Loc2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Loc2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljy2;->f:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Ljy2;->g:Loc2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Lh83;)V
    .locals 4

    .line 1
    iget-object p1, p1, Lh83;->b:Lp21;

    .line 2
    .line 3
    iget-object p1, p1, Lp21;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lc83;

    .line 6
    .line 7
    iget-object p1, p1, Lc83;->e:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Ljy2;->g:Loc2;

    .line 16
    .line 17
    iget-object v1, p0, Ljy2;->f:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v2, Lmz1;->A0:Liz1;

    .line 23
    .line 24
    sget-object v3, Ltw1;->e:Ltw1;

    .line 25
    .line 26
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 27
    .line 28
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Loc2;->a(Landroid/content/Context;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-static {v1}, Loc2;->g(Landroid/content/Context;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v2, v0, Loc2;->i:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter v2

    .line 56
    :try_start_0
    monitor-exit v2

    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    throw p1

    .line 61
    :cond_1
    :goto_0
    const-string v2, "_aq"

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-virtual {v0, v1, v2, p1, v3}, Loc2;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
.end method

.method public final G0(Lfa2;)V
    .locals 0

    .line 1
    return-void
.end method
