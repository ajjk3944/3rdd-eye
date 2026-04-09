.class public final Lqw1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lwv1;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbu1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lqw1;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lqw1;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgb3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lqw1;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lqw1;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lnb3;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lqw1;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lqw1;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final T(Z)V
    .locals 2

    .line 1
    iget v0, p0, Lqw1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lmz1;->y:Liz1;

    .line 7
    .line 8
    sget-object v1, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lqw1;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lnb3;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lnb3;->c(Z)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :pswitch_0
    sget-object v0, Lmz1;->y:Liz1;

    .line 33
    .line 34
    sget-object v1, Ltw1;->e:Ltw1;

    .line 35
    .line 36
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Lqw1;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lgb3;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lgb3;->b(Z)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void

    .line 58
    :pswitch_1
    iget-object v0, p0, Lqw1;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lbu1;

    .line 61
    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Lbu1;->E()V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-virtual {v0}, Lbu1;->y()V

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
