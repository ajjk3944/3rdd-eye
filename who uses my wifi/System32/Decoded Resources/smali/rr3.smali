.class public abstract Lrr3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lsu3;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-class v0, Lcr3;

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lmr2;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lmr2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lwr3;->a:Lwr3;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lmr2;->y(Lew3;)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lsu2;->p:Lsu2;

    .line 16
    .line 17
    const-class v3, Lxr3;

    .line 18
    .line 19
    new-instance v4, Law3;

    .line 20
    .line 21
    invoke-direct {v4, v3, v0, v2}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v4}, Lmr2;->u(Law3;)V

    .line 25
    .line 26
    .line 27
    sget-object v2, Lsu2;->o:Lsu2;

    .line 28
    .line 29
    const-class v3, Lis3;

    .line 30
    .line 31
    new-instance v4, Law3;

    .line 32
    .line 33
    invoke-direct {v4, v3, v0, v2}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v4}, Lmr2;->u(Law3;)V

    .line 37
    .line 38
    .line 39
    sget-object v2, Ltv2;->q:Ltv2;

    .line 40
    .line 41
    const-class v3, Lns3;

    .line 42
    .line 43
    new-instance v4, Law3;

    .line 44
    .line 45
    invoke-direct {v4, v3, v0, v2}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v4}, Lmr2;->u(Law3;)V

    .line 49
    .line 50
    .line 51
    sget-object v2, Ltv2;->p:Ltv2;

    .line 52
    .line 53
    const-class v3, Les3;

    .line 54
    .line 55
    new-instance v4, Law3;

    .line 56
    .line 57
    invoke-direct {v4, v3, v0, v2}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v4}, Lmr2;->u(Law3;)V

    .line 61
    .line 62
    .line 63
    sget-object v2, Lsu2;->n:Lsu2;

    .line 64
    .line 65
    const-class v3, Lrs3;

    .line 66
    .line 67
    new-instance v4, Law3;

    .line 68
    .line 69
    invoke-direct {v4, v3, v0, v2}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v4}, Lmr2;->u(Law3;)V

    .line 73
    .line 74
    .line 75
    sget-object v2, Ltv2;->o:Ltv2;

    .line 76
    .line 77
    const-class v3, Lpt3;

    .line 78
    .line 79
    new-instance v4, Law3;

    .line 80
    .line 81
    invoke-direct {v4, v3, v0, v2}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v4}, Lmr2;->u(Law3;)V

    .line 85
    .line 86
    .line 87
    sget-object v2, Ltv2;->r:Ltv2;

    .line 88
    .line 89
    const-class v3, Lmt3;

    .line 90
    .line 91
    new-instance v4, Law3;

    .line 92
    .line 93
    invoke-direct {v4, v3, v0, v2}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v4}, Lmr2;->u(Law3;)V

    .line 97
    .line 98
    .line 99
    new-instance v0, Ldw3;

    .line 100
    .line 101
    invoke-direct {v0, v1}, Ldw3;-><init>(Lmr2;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Lsu3;

    .line 105
    .line 106
    invoke-direct {v1, v0}, Lsu3;-><init>(Ldw3;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    sput-object v1, Lrr3;->a:Lsu3;

    .line 110
    .line 111
    return-void

    .line 112
    :catch_0
    move-exception v0

    .line 113
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    throw v1
.end method
