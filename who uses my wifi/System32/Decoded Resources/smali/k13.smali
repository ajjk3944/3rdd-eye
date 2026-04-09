.class public final Lk13;
.super Lj13;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lth2;

.field public final b:Lmm2;

.field public final c:Lfp2;

.field public final d:Lo13;

.field public final e:Le03;


# direct methods
.method public constructor <init>(Lth2;Lmm2;Lfp2;Lo13;Le03;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk13;->a:Lth2;

    .line 5
    .line 6
    iput-object p2, p0, Lk13;->b:Lmm2;

    .line 7
    .line 8
    iput-object p3, p0, Lk13;->c:Lfp2;

    .line 9
    .line 10
    iput-object p4, p0, Lk13;->d:Lo13;

    .line 11
    .line 12
    iput-object p5, p0, Lk13;->e:Le03;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final c(Ll83;Landroid/os/Bundle;La83;Lh83;)Lq93;
    .locals 9

    .line 1
    iget-object v0, p0, Lk13;->b:Lmm2;

    .line 2
    .line 3
    iput-object p1, v0, Lmm2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, v0, Lmm2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v1, Lt83;

    .line 8
    .line 9
    const/16 v5, 0x13

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v4, p0, Lk13;->d:Lo13;

    .line 13
    .line 14
    move-object v3, p3

    .line 15
    move-object v2, p4

    .line 16
    invoke-direct/range {v1 .. v6}, Lt83;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lmm2;->e:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object p1, Lmz1;->V3:Liz1;

    .line 22
    .line 23
    sget-object p2, Ltw1;->e:Ltw1;

    .line 24
    .line 25
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    iget-object p1, p0, Lk13;->e:Le03;

    .line 40
    .line 41
    iput-object p1, v0, Lmm2;->f:Ljava/lang/Object;

    .line 42
    .line 43
    :cond_0
    iget-object p1, p0, Lk13;->a:Lth2;

    .line 44
    .line 45
    iget-object v2, p1, Lth2;->b:Lth2;

    .line 46
    .line 47
    new-instance v5, Lmm2;

    .line 48
    .line 49
    invoke-direct {v5, v0}, Lmm2;-><init>(Lmm2;)V

    .line 50
    .line 51
    .line 52
    const-class p1, Lfp2;

    .line 53
    .line 54
    iget-object v4, p0, Lk13;->c:Lfp2;

    .line 55
    .line 56
    invoke-static {v4, p1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Lzh2;

    .line 60
    .line 61
    new-instance v3, Ltv2;

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    const/4 p2, 0x0

    .line 65
    invoke-direct {v3, p1, p2}, Ltv2;-><init>(IB)V

    .line 66
    .line 67
    .line 68
    new-instance v6, Lf23;

    .line 69
    .line 70
    const/16 p1, 0x19

    .line 71
    .line 72
    invoke-direct {v6, p1}, Lf23;-><init>(I)V

    .line 73
    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v8, 0x0

    .line 77
    invoke-direct/range {v1 .. v8}, Lzh2;-><init>(Lth2;Ltv2;Lfp2;Lmm2;Lf23;Lm73;Lb73;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lzh2;->a()Lnl2;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Lnl2;->b()Lq93;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p1, p2}, Lnl2;->c(Ln70;)Lq93;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
.end method
