.class public final synthetic Lfj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lgj2;

.field public final synthetic h:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lgj2;Ljava/lang/Throwable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lfj2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lfj2;->g:Lgj2;

    .line 4
    .line 5
    iput-object p2, p0, Lfj2;->h:Ljava/lang/Throwable;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lfj2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfj2;->g:Lgj2;

    .line 7
    .line 8
    iget-object v0, v0, Lgj2;->a:Landroid/content/Context;

    .line 9
    .line 10
    sget-object v1, Lmz1;->db:Liz1;

    .line 11
    .line 12
    sget-object v2, Ltw1;->e:Ltw1;

    .line 13
    .line 14
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v2, p0, Lfj2;->h:Ljava/lang/Throwable;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-static {v0}, Lr92;->c(Landroid/content/Context;)Ls92;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "AttributionReporting.getUpdatedUrlAndRegisterSource"

    .line 35
    .line 36
    invoke-interface {v0, v1, v2}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {v0}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource"

    .line 45
    .line 46
    invoke-interface {v0, v1, v2}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-void

    .line 50
    :pswitch_0
    iget-object v0, p0, Lfj2;->g:Lgj2;

    .line 51
    .line 52
    iget-object v0, v0, Lgj2;->a:Landroid/content/Context;

    .line 53
    .line 54
    sget-object v1, Lmz1;->db:Liz1;

    .line 55
    .line 56
    sget-object v2, Ltw1;->e:Ltw1;

    .line 57
    .line 58
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iget-object v2, p0, Lfj2;->h:Ljava/lang/Throwable;

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    invoke-static {v0}, Lr92;->c(Landroid/content/Context;)Ls92;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v1, "AttributionReporting"

    .line 79
    .line 80
    invoke-interface {v0, v1, v2}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-static {v0}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v1, "AttributionReportingSampled"

    .line 89
    .line 90
    invoke-interface {v0, v1, v2}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
