.class public final synthetic Lr53;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z

.field public final synthetic d:Landroid/os/Bundle;

.field public final synthetic e:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/lang/Object;ZLandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr53;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, Lr53;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, Lr53;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, Lr53;->d:Landroid/os/Bundle;

    .line 11
    .line 12
    iput-object p5, p0, Lr53;->e:Landroid/os/Bundle;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lr53;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lr53;->b:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ln70;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ln53;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {v1, v2}, Ln53;->c(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-boolean v3, p0, Lr53;->c:Z

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-interface {v1, v2}, Ln53;->p(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sget-object v0, Lmz1;->m2:Liz1;

    .line 41
    .line 42
    sget-object v1, Ltw1;->e:Ltw1;

    .line 43
    .line 44
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, Lr53;->d:Landroid/os/Bundle;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    sget-object v1, Lhg4;->C:Lhg4;

    .line 63
    .line 64
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    instance-of v1, v2, Ljm2;

    .line 74
    .line 75
    iget-object v5, p0, Lr53;->e:Landroid/os/Bundle;

    .line 76
    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    const-string v1, "client-signals-end"

    .line 80
    .line 81
    invoke-virtual {v0, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 82
    .line 83
    .line 84
    const-string v1, "client_sig_latency_key"

    .line 85
    .line 86
    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 87
    .line 88
    .line 89
    return-object v2

    .line 90
    :cond_2
    const-string v1, "gms-signals-end"

    .line 91
    .line 92
    invoke-virtual {v0, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 93
    .line 94
    .line 95
    const-string v1, "gms_sig_latency_key"

    .line 96
    .line 97
    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    return-object v2
.end method
