.class public final Llp;
.super Lb40;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic j:I

.field public final k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Llp;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Lb80;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Llp;->k:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget v0, p0, Llp;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Llp;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lkd;

    .line 9
    .line 10
    sget-object v0, Lz31;->a:Lz31;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lkd;->e(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p1, p0, Llp;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lc40;

    .line 19
    .line 20
    invoke-virtual {p0}, Lb40;->k()Lg40;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lg40;->A()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    instance-of v1, v0, Lpg;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    check-cast v0, Lpg;

    .line 33
    .line 34
    iget-object v0, v0, Lpg;->a:Ljava/lang/Throwable;

    .line 35
    .line 36
    invoke-static {v0}, Lbd2;->k(Ljava/lang/Throwable;)Liq0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, v0}, Lkd;->e(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v0}, Lwl2;->x(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p1, v0}, Lkd;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    return-void

    .line 52
    :pswitch_1
    iget-object v0, p0, Llp;->k:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lf30;

    .line 55
    .line 56
    invoke-interface {v0, p1}, Lf30;->d(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_2
    iget-object p1, p0, Llp;->k:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Ljp;

    .line 63
    .line 64
    invoke-interface {p1}, Ljp;->b()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
