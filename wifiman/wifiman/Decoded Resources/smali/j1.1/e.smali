.class public Lj1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/e$b;
    }
.end annotation


# static fields
.field public static J0:F = 0.5f


# instance fields
.field public A:I

.field A0:Z

.field public B:F

.field B0:Z

.field public C:I

.field public C0:[F

.field public D:I

.field protected D0:[Lj1/e;

.field public E:F

.field protected E0:[Lj1/e;

.field F:I

.field F0:Lj1/e;

.field G:F

.field G0:Lj1/e;

.field private H:[I

.field public H0:I

.field public I:F

.field public I0:I

.field private J:Z

.field private K:Z

.field private L:I

.field private M:I

.field public N:Lj1/d;

.field public O:Lj1/d;

.field public P:Lj1/d;

.field public Q:Lj1/d;

.field public R:Lj1/d;

.field S:Lj1/d;

.field T:Lj1/d;

.field public U:Lj1/d;

.field public V:[Lj1/d;

.field protected W:Ljava/util/ArrayList;

.field private X:[Z

.field public Y:[Lj1/e$b;

.field public Z:Lj1/e;

.field public a:Z

.field a0:I

.field public b:[Lk1/p;

.field b0:I

.field public c:Lk1/c;

.field public c0:F

.field public d:Lk1/c;

.field protected d0:I

.field public e:Lk1/l;

.field protected e0:I

.field public f:Lk1/n;

.field protected f0:I

.field public g:[Z

.field g0:I

.field h:Z

.field h0:I

.field private i:Z

.field protected i0:I

.field private j:Z

.field protected j0:I

.field private k:Z

.field k0:I

.field private l:I

.field protected l0:I

.field private m:I

.field protected m0:I

.field public n:Lg1/h;

.field n0:F

.field public o:Ljava/lang/String;

.field o0:F

.field private p:Z

.field private p0:Ljava/lang/Object;

.field private q:Z

.field private q0:I

.field private r:Z

.field private r0:I

.field private s:Z

.field private s0:Z

.field public t:I

.field private t0:Ljava/lang/String;

.field public u:I

.field private u0:Ljava/lang/String;

.field private v:I

.field v0:Z

.field public w:I

.field w0:Z

.field public x:I

.field x0:Z

.field public y:[I

.field y0:I

.field public z:I

.field z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lj1/e;->a:Z

    const/4 v1, 0x2

    .line 3
    new-array v2, v1, [Lk1/p;

    iput-object v2, p0, Lj1/e;->b:[Lk1/p;

    const/4 v2, 0x0

    .line 4
    iput-object v2, p0, Lj1/e;->e:Lk1/l;

    .line 5
    iput-object v2, p0, Lj1/e;->f:Lk1/n;

    const/4 v3, 0x1

    .line 6
    new-array v4, v1, [Z

    fill-array-data v4, :array_0

    iput-object v4, p0, Lj1/e;->g:[Z

    .line 7
    iput-boolean v0, p0, Lj1/e;->h:Z

    .line 8
    iput-boolean v3, p0, Lj1/e;->i:Z

    .line 9
    iput-boolean v0, p0, Lj1/e;->j:Z

    .line 10
    iput-boolean v3, p0, Lj1/e;->k:Z

    const/4 v3, -0x1

    .line 11
    iput v3, p0, Lj1/e;->l:I

    .line 12
    iput v3, p0, Lj1/e;->m:I

    .line 13
    new-instance v4, Lg1/h;

    invoke-direct {v4, p0}, Lg1/h;-><init>(Lj1/e;)V

    iput-object v4, p0, Lj1/e;->n:Lg1/h;

    .line 14
    iput-boolean v0, p0, Lj1/e;->p:Z

    .line 15
    iput-boolean v0, p0, Lj1/e;->q:Z

    .line 16
    iput-boolean v0, p0, Lj1/e;->r:Z

    .line 17
    iput-boolean v0, p0, Lj1/e;->s:Z

    .line 18
    iput v3, p0, Lj1/e;->t:I

    .line 19
    iput v3, p0, Lj1/e;->u:I

    .line 20
    iput v0, p0, Lj1/e;->v:I

    .line 21
    iput v0, p0, Lj1/e;->w:I

    .line 22
    iput v0, p0, Lj1/e;->x:I

    .line 23
    new-array v4, v1, [I

    iput-object v4, p0, Lj1/e;->y:[I

    .line 24
    iput v0, p0, Lj1/e;->z:I

    .line 25
    iput v0, p0, Lj1/e;->A:I

    const/high16 v4, 0x3f800000    # 1.0f

    .line 26
    iput v4, p0, Lj1/e;->B:F

    .line 27
    iput v0, p0, Lj1/e;->C:I

    .line 28
    iput v0, p0, Lj1/e;->D:I

    .line 29
    iput v4, p0, Lj1/e;->E:F

    .line 30
    iput v3, p0, Lj1/e;->F:I

    .line 31
    iput v4, p0, Lj1/e;->G:F

    const v4, 0x7fffffff

    .line 32
    filled-new-array {v4, v4}, [I

    move-result-object v4

    iput-object v4, p0, Lj1/e;->H:[I

    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 33
    iput v4, p0, Lj1/e;->I:F

    .line 34
    iput-boolean v0, p0, Lj1/e;->J:Z

    .line 35
    iput-boolean v0, p0, Lj1/e;->K:Z

    .line 36
    iput v0, p0, Lj1/e;->L:I

    .line 37
    iput v0, p0, Lj1/e;->M:I

    .line 38
    new-instance v4, Lj1/d;

    sget-object v5, Lj1/d$a;->LEFT:Lj1/d$a;

    invoke-direct {v4, p0, v5}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v4, p0, Lj1/e;->N:Lj1/d;

    .line 39
    new-instance v4, Lj1/d;

    sget-object v5, Lj1/d$a;->TOP:Lj1/d$a;

    invoke-direct {v4, p0, v5}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v4, p0, Lj1/e;->O:Lj1/d;

    .line 40
    new-instance v4, Lj1/d;

    sget-object v5, Lj1/d$a;->RIGHT:Lj1/d$a;

    invoke-direct {v4, p0, v5}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v4, p0, Lj1/e;->P:Lj1/d;

    .line 41
    new-instance v4, Lj1/d;

    sget-object v5, Lj1/d$a;->BOTTOM:Lj1/d$a;

    invoke-direct {v4, p0, v5}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v4, p0, Lj1/e;->Q:Lj1/d;

    .line 42
    new-instance v4, Lj1/d;

    sget-object v5, Lj1/d$a;->BASELINE:Lj1/d$a;

    invoke-direct {v4, p0, v5}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v4, p0, Lj1/e;->R:Lj1/d;

    .line 43
    new-instance v4, Lj1/d;

    sget-object v5, Lj1/d$a;->CENTER_X:Lj1/d$a;

    invoke-direct {v4, p0, v5}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v4, p0, Lj1/e;->S:Lj1/d;

    .line 44
    new-instance v4, Lj1/d;

    sget-object v5, Lj1/d$a;->CENTER_Y:Lj1/d$a;

    invoke-direct {v4, p0, v5}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v4, p0, Lj1/e;->T:Lj1/d;

    .line 45
    new-instance v11, Lj1/d;

    sget-object v4, Lj1/d$a;->CENTER:Lj1/d$a;

    invoke-direct {v11, p0, v4}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v11, p0, Lj1/e;->U:Lj1/d;

    .line 46
    iget-object v6, p0, Lj1/e;->N:Lj1/d;

    iget-object v7, p0, Lj1/e;->P:Lj1/d;

    iget-object v8, p0, Lj1/e;->O:Lj1/d;

    iget-object v9, p0, Lj1/e;->Q:Lj1/d;

    iget-object v10, p0, Lj1/e;->R:Lj1/d;

    filled-new-array/range {v6 .. v11}, [Lj1/d;

    move-result-object v4

    iput-object v4, p0, Lj1/e;->V:[Lj1/d;

    .line 47
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lj1/e;->W:Ljava/util/ArrayList;

    .line 48
    new-array v4, v1, [Z

    iput-object v4, p0, Lj1/e;->X:[Z

    .line 49
    sget-object v4, Lj1/e$b;->FIXED:Lj1/e$b;

    filled-new-array {v4, v4}, [Lj1/e$b;

    move-result-object v4

    iput-object v4, p0, Lj1/e;->Y:[Lj1/e$b;

    .line 50
    iput-object v2, p0, Lj1/e;->Z:Lj1/e;

    .line 51
    iput v0, p0, Lj1/e;->a0:I

    .line 52
    iput v0, p0, Lj1/e;->b0:I

    const/4 v4, 0x0

    .line 53
    iput v4, p0, Lj1/e;->c0:F

    .line 54
    iput v3, p0, Lj1/e;->d0:I

    .line 55
    iput v0, p0, Lj1/e;->e0:I

    .line 56
    iput v0, p0, Lj1/e;->f0:I

    .line 57
    iput v0, p0, Lj1/e;->g0:I

    .line 58
    iput v0, p0, Lj1/e;->h0:I

    .line 59
    iput v0, p0, Lj1/e;->i0:I

    .line 60
    iput v0, p0, Lj1/e;->j0:I

    .line 61
    iput v0, p0, Lj1/e;->k0:I

    .line 62
    sget v4, Lj1/e;->J0:F

    iput v4, p0, Lj1/e;->n0:F

    .line 63
    iput v4, p0, Lj1/e;->o0:F

    .line 64
    iput v0, p0, Lj1/e;->q0:I

    .line 65
    iput v0, p0, Lj1/e;->r0:I

    .line 66
    iput-boolean v0, p0, Lj1/e;->s0:Z

    .line 67
    iput-object v2, p0, Lj1/e;->t0:Ljava/lang/String;

    .line 68
    iput-object v2, p0, Lj1/e;->u0:Ljava/lang/String;

    .line 69
    iput-boolean v0, p0, Lj1/e;->x0:Z

    .line 70
    iput v0, p0, Lj1/e;->y0:I

    .line 71
    iput v0, p0, Lj1/e;->z0:I

    .line 72
    new-array v0, v1, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, Lj1/e;->C0:[F

    .line 73
    filled-new-array {v2, v2}, [Lj1/e;

    move-result-object v0

    iput-object v0, p0, Lj1/e;->D0:[Lj1/e;

    .line 74
    filled-new-array {v2, v2}, [Lj1/e;

    move-result-object v0

    iput-object v0, p0, Lj1/e;->E0:[Lj1/e;

    .line 75
    iput-object v2, p0, Lj1/e;->F0:Lj1/e;

    .line 76
    iput-object v2, p0, Lj1/e;->G0:Lj1/e;

    .line 77
    iput v3, p0, Lj1/e;->H0:I

    .line 78
    iput v3, p0, Lj1/e;->I0:I

    .line 79
    invoke-direct {p0}, Lj1/e;->a()V

    return-void

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x0

    .line 159
    invoke-direct {p0, v0, v0, p1, p2}, Lj1/e;-><init>(IIII)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 13

    move-object v0, p0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 81
    iput-boolean v1, v0, Lj1/e;->a:Z

    const/4 v2, 0x2

    .line 82
    new-array v3, v2, [Lk1/p;

    iput-object v3, v0, Lj1/e;->b:[Lk1/p;

    const/4 v3, 0x0

    .line 83
    iput-object v3, v0, Lj1/e;->e:Lk1/l;

    .line 84
    iput-object v3, v0, Lj1/e;->f:Lk1/n;

    const/4 v4, 0x1

    .line 85
    new-array v5, v2, [Z

    fill-array-data v5, :array_0

    iput-object v5, v0, Lj1/e;->g:[Z

    .line 86
    iput-boolean v1, v0, Lj1/e;->h:Z

    .line 87
    iput-boolean v4, v0, Lj1/e;->i:Z

    .line 88
    iput-boolean v1, v0, Lj1/e;->j:Z

    .line 89
    iput-boolean v4, v0, Lj1/e;->k:Z

    const/4 v4, -0x1

    .line 90
    iput v4, v0, Lj1/e;->l:I

    .line 91
    iput v4, v0, Lj1/e;->m:I

    .line 92
    new-instance v5, Lg1/h;

    invoke-direct {v5, p0}, Lg1/h;-><init>(Lj1/e;)V

    iput-object v5, v0, Lj1/e;->n:Lg1/h;

    .line 93
    iput-boolean v1, v0, Lj1/e;->p:Z

    .line 94
    iput-boolean v1, v0, Lj1/e;->q:Z

    .line 95
    iput-boolean v1, v0, Lj1/e;->r:Z

    .line 96
    iput-boolean v1, v0, Lj1/e;->s:Z

    .line 97
    iput v4, v0, Lj1/e;->t:I

    .line 98
    iput v4, v0, Lj1/e;->u:I

    .line 99
    iput v1, v0, Lj1/e;->v:I

    .line 100
    iput v1, v0, Lj1/e;->w:I

    .line 101
    iput v1, v0, Lj1/e;->x:I

    .line 102
    new-array v5, v2, [I

    iput-object v5, v0, Lj1/e;->y:[I

    .line 103
    iput v1, v0, Lj1/e;->z:I

    .line 104
    iput v1, v0, Lj1/e;->A:I

    const/high16 v5, 0x3f800000    # 1.0f

    .line 105
    iput v5, v0, Lj1/e;->B:F

    .line 106
    iput v1, v0, Lj1/e;->C:I

    .line 107
    iput v1, v0, Lj1/e;->D:I

    .line 108
    iput v5, v0, Lj1/e;->E:F

    .line 109
    iput v4, v0, Lj1/e;->F:I

    .line 110
    iput v5, v0, Lj1/e;->G:F

    const v5, 0x7fffffff

    .line 111
    filled-new-array {v5, v5}, [I

    move-result-object v5

    iput-object v5, v0, Lj1/e;->H:[I

    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 112
    iput v5, v0, Lj1/e;->I:F

    .line 113
    iput-boolean v1, v0, Lj1/e;->J:Z

    .line 114
    iput-boolean v1, v0, Lj1/e;->K:Z

    .line 115
    iput v1, v0, Lj1/e;->L:I

    .line 116
    iput v1, v0, Lj1/e;->M:I

    .line 117
    new-instance v5, Lj1/d;

    sget-object v6, Lj1/d$a;->LEFT:Lj1/d$a;

    invoke-direct {v5, p0, v6}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v5, v0, Lj1/e;->N:Lj1/d;

    .line 118
    new-instance v5, Lj1/d;

    sget-object v6, Lj1/d$a;->TOP:Lj1/d$a;

    invoke-direct {v5, p0, v6}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v5, v0, Lj1/e;->O:Lj1/d;

    .line 119
    new-instance v5, Lj1/d;

    sget-object v6, Lj1/d$a;->RIGHT:Lj1/d$a;

    invoke-direct {v5, p0, v6}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v5, v0, Lj1/e;->P:Lj1/d;

    .line 120
    new-instance v5, Lj1/d;

    sget-object v6, Lj1/d$a;->BOTTOM:Lj1/d$a;

    invoke-direct {v5, p0, v6}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v5, v0, Lj1/e;->Q:Lj1/d;

    .line 121
    new-instance v5, Lj1/d;

    sget-object v6, Lj1/d$a;->BASELINE:Lj1/d$a;

    invoke-direct {v5, p0, v6}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v5, v0, Lj1/e;->R:Lj1/d;

    .line 122
    new-instance v5, Lj1/d;

    sget-object v6, Lj1/d$a;->CENTER_X:Lj1/d$a;

    invoke-direct {v5, p0, v6}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v5, v0, Lj1/e;->S:Lj1/d;

    .line 123
    new-instance v5, Lj1/d;

    sget-object v6, Lj1/d$a;->CENTER_Y:Lj1/d$a;

    invoke-direct {v5, p0, v6}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v5, v0, Lj1/e;->T:Lj1/d;

    .line 124
    new-instance v12, Lj1/d;

    sget-object v5, Lj1/d$a;->CENTER:Lj1/d$a;

    invoke-direct {v12, p0, v5}, Lj1/d;-><init>(Lj1/e;Lj1/d$a;)V

    iput-object v12, v0, Lj1/e;->U:Lj1/d;

    .line 125
    iget-object v7, v0, Lj1/e;->N:Lj1/d;

    iget-object v8, v0, Lj1/e;->P:Lj1/d;

    iget-object v9, v0, Lj1/e;->O:Lj1/d;

    iget-object v10, v0, Lj1/e;->Q:Lj1/d;

    iget-object v11, v0, Lj1/e;->R:Lj1/d;

    filled-new-array/range {v7 .. v12}, [Lj1/d;

    move-result-object v5

    iput-object v5, v0, Lj1/e;->V:[Lj1/d;

    .line 126
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v0, Lj1/e;->W:Ljava/util/ArrayList;

    .line 127
    new-array v5, v2, [Z

    iput-object v5, v0, Lj1/e;->X:[Z

    .line 128
    sget-object v5, Lj1/e$b;->FIXED:Lj1/e$b;

    filled-new-array {v5, v5}, [Lj1/e$b;

    move-result-object v5

    iput-object v5, v0, Lj1/e;->Y:[Lj1/e$b;

    .line 129
    iput-object v3, v0, Lj1/e;->Z:Lj1/e;

    const/4 v5, 0x0

    .line 130
    iput v5, v0, Lj1/e;->c0:F

    .line 131
    iput v4, v0, Lj1/e;->d0:I

    .line 132
    iput v1, v0, Lj1/e;->g0:I

    .line 133
    iput v1, v0, Lj1/e;->h0:I

    .line 134
    iput v1, v0, Lj1/e;->i0:I

    .line 135
    iput v1, v0, Lj1/e;->j0:I

    .line 136
    iput v1, v0, Lj1/e;->k0:I

    .line 137
    sget v5, Lj1/e;->J0:F

    iput v5, v0, Lj1/e;->n0:F

    .line 138
    iput v5, v0, Lj1/e;->o0:F

    .line 139
    iput v1, v0, Lj1/e;->q0:I

    .line 140
    iput v1, v0, Lj1/e;->r0:I

    .line 141
    iput-boolean v1, v0, Lj1/e;->s0:Z

    .line 142
    iput-object v3, v0, Lj1/e;->t0:Ljava/lang/String;

    .line 143
    iput-object v3, v0, Lj1/e;->u0:Ljava/lang/String;

    .line 144
    iput-boolean v1, v0, Lj1/e;->x0:Z

    .line 145
    iput v1, v0, Lj1/e;->y0:I

    .line 146
    iput v1, v0, Lj1/e;->z0:I

    .line 147
    new-array v1, v2, [F

    fill-array-data v1, :array_1

    iput-object v1, v0, Lj1/e;->C0:[F

    .line 148
    filled-new-array {v3, v3}, [Lj1/e;

    move-result-object v1

    iput-object v1, v0, Lj1/e;->D0:[Lj1/e;

    .line 149
    filled-new-array {v3, v3}, [Lj1/e;

    move-result-object v1

    iput-object v1, v0, Lj1/e;->E0:[Lj1/e;

    .line 150
    iput-object v3, v0, Lj1/e;->F0:Lj1/e;

    .line 151
    iput-object v3, v0, Lj1/e;->G0:Lj1/e;

    .line 152
    iput v4, v0, Lj1/e;->H0:I

    .line 153
    iput v4, v0, Lj1/e;->I0:I

    move v1, p1

    .line 154
    iput v1, v0, Lj1/e;->e0:I

    move v1, p2

    .line 155
    iput v1, v0, Lj1/e;->f0:I

    move/from16 v1, p3

    .line 156
    iput v1, v0, Lj1/e;->a0:I

    move/from16 v1, p4

    .line 157
    iput v1, v0, Lj1/e;->b0:I

    .line 158
    invoke-direct {p0}, Lj1/e;->a()V

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method private X(I)Z
    .locals 3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lj1/e;->V:[Lj1/d;

    aget-object v1, v0, p1

    iget-object v2, v1, Lj1/d;->f:Lj1/d;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lj1/d;->f:Lj1/d;

    if-eq v2, v1, :cond_0

    const/4 v1, 0x1

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    iget-object v0, p1, Lj1/d;->f:Lj1/d;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lj1/d;->f:Lj1/d;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lj1/e;->W:Ljava/util/ArrayList;

    iget-object v1, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lj1/e;->W:Ljava/util/ArrayList;

    iget-object v1, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lj1/e;->W:Ljava/util/ArrayList;

    iget-object v1, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lj1/e;->W:Ljava/util/ArrayList;

    iget-object v1, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lj1/e;->W:Ljava/util/ArrayList;

    iget-object v1, p0, Lj1/e;->S:Lj1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lj1/e;->W:Ljava/util/ArrayList;

    iget-object v1, p0, Lj1/e;->T:Lj1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lj1/e;->W:Ljava/util/ArrayList;

    iget-object v1, p0, Lj1/e;->U:Lj1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lj1/e;->W:Ljava/util/ArrayList;

    iget-object v1, p0, Lj1/e;->R:Lj1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private f(Lc1/d;ZZZZLc1/i;Lc1/i;Lj1/e$b;ZLj1/d;Lj1/d;IIIIFZZZZZIIIIFZ)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p14

    move/from16 v1, p15

    move/from16 v2, p23

    move/from16 v3, p24

    move/from16 v4, p25

    invoke-virtual {v10, v13}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v9

    invoke-virtual {v10, v14}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v8

    invoke-virtual/range {p10 .. p10}, Lj1/d;->j()Lj1/d;

    move-result-object v5

    invoke-virtual {v10, v5}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v7

    invoke-virtual/range {p11 .. p11}, Lj1/d;->j()Lj1/d;

    move-result-object v5

    invoke-virtual {v10, v5}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v6

    invoke-static {}, Lc1/d;->w()Lc1/e;

    invoke-virtual/range {p10 .. p10}, Lj1/d;->o()Z

    move-result v16

    invoke-virtual/range {p11 .. p11}, Lj1/d;->o()Z

    move-result v17

    iget-object v5, v0, Lj1/e;->U:Lj1/d;

    invoke-virtual {v5}, Lj1/d;->o()Z

    move-result v18

    if-eqz v17, :cond_0

    add-int/lit8 v5, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v5, v16

    :goto_0
    if-eqz v18, :cond_1

    add-int/lit8 v5, v5, 0x1

    :cond_1
    if-eqz p17, :cond_2

    move-object/from16 v20, v6

    const/4 v12, 0x3

    goto :goto_1

    :cond_2
    move/from16 v12, p22

    move-object/from16 v20, v6

    :goto_1
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    const/4 v2, 0x1

    if-eqz v6, :cond_3

    if-eq v6, v2, :cond_3

    const/4 v2, 0x2

    if-eq v6, v2, :cond_4

    :cond_3
    const/4 v6, 0x0

    goto :goto_2

    :cond_4
    const/4 v2, 0x4

    if-eq v12, v2, :cond_3

    const/4 v6, 0x1

    :goto_2
    iget v2, v0, Lj1/e;->l:I

    const/4 v14, -0x1

    if-eq v2, v14, :cond_5

    if-eqz p2, :cond_5

    iput v14, v0, Lj1/e;->l:I

    move/from16 p13, v2

    const/4 v6, 0x0

    :cond_5
    iget v2, v0, Lj1/e;->m:I

    if-eq v2, v14, :cond_6

    if-nez p2, :cond_6

    iput v14, v0, Lj1/e;->m:I

    const/4 v6, 0x0

    goto :goto_3

    :cond_6
    move/from16 v2, p13

    :goto_3
    iget v14, v0, Lj1/e;->r0:I

    move/from16 p13, v2

    const/16 v2, 0x8

    if-ne v14, v2, :cond_7

    const/4 v6, 0x0

    const/4 v14, 0x0

    goto :goto_4

    :cond_7
    move v14, v6

    move/from16 v6, p13

    :goto_4
    if-eqz p27, :cond_a

    if-nez v16, :cond_9

    if-nez v17, :cond_9

    if-nez v18, :cond_9

    move/from16 v2, p12

    invoke-virtual {v10, v9, v2}, Lc1/d;->f(Lc1/i;I)V

    :cond_8
    const/16 v11, 0x8

    goto :goto_5

    :cond_9
    if-eqz v16, :cond_8

    if-nez v17, :cond_8

    invoke-virtual/range {p10 .. p10}, Lj1/d;->f()I

    move-result v2

    const/16 v11, 0x8

    invoke-virtual {v10, v9, v7, v2, v11}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    goto :goto_5

    :cond_a
    move v11, v2

    :goto_5
    if-nez v14, :cond_e

    if-eqz p9, :cond_c

    const/4 v2, 0x3

    const/4 v11, 0x0

    invoke-virtual {v10, v8, v9, v11, v2}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    const/16 v2, 0x8

    if-lez v15, :cond_b

    invoke-virtual {v10, v8, v9, v15, v2}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_b
    const v6, 0x7fffffff

    if-ge v1, v6, :cond_d

    invoke-virtual {v10, v8, v9, v1, v2}, Lc1/d;->j(Lc1/i;Lc1/i;II)V

    goto :goto_6

    :cond_c
    move v2, v11

    invoke-virtual {v10, v8, v9, v6, v2}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    :cond_d
    :goto_6
    move/from16 v24, v3

    :goto_7
    move v1, v5

    move-object v15, v7

    move-object v11, v8

    move/from16 v25, v14

    move-object/from16 v14, v20

    :goto_8
    move/from16 v20, p5

    goto/16 :goto_11

    :cond_e
    const/4 v1, 0x2

    if-eq v5, v1, :cond_11

    if-nez p17, :cond_11

    const/4 v1, 0x1

    if-eq v12, v1, :cond_f

    if-nez v12, :cond_11

    :cond_f
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v4, :cond_10

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_10
    const/16 v2, 0x8

    invoke-virtual {v10, v8, v9, v1, v2}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    move/from16 v24, v3

    move v1, v5

    move-object v15, v7

    move-object v11, v8

    move-object/from16 v14, v20

    const/16 v25, 0x0

    goto :goto_8

    :cond_11
    const/4 v1, -0x2

    if-ne v3, v1, :cond_12

    move v2, v6

    goto :goto_9

    :cond_12
    move v2, v3

    :goto_9
    if-ne v4, v1, :cond_13

    move v1, v6

    goto :goto_a

    :cond_13
    move v1, v4

    :goto_a
    if-lez v6, :cond_14

    const/4 v3, 0x1

    if-eq v12, v3, :cond_14

    const/4 v6, 0x0

    :cond_14
    const/16 v3, 0x8

    if-lez v2, :cond_15

    invoke-virtual {v10, v8, v9, v2, v3}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v6

    :cond_15
    const/4 v4, 0x1

    if-lez v1, :cond_17

    if-eqz p3, :cond_16

    if-ne v12, v4, :cond_16

    goto :goto_b

    :cond_16
    invoke-virtual {v10, v8, v9, v1, v3}, Lc1/d;->j(Lc1/i;Lc1/i;II)V

    :goto_b
    invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I

    move-result v6

    :cond_17
    if-ne v12, v4, :cond_1a

    if-eqz p3, :cond_18

    invoke-virtual {v10, v8, v9, v6, v3}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    goto :goto_c

    :cond_18
    if-eqz p19, :cond_19

    const/4 v4, 0x5

    invoke-virtual {v10, v8, v9, v6, v4}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    invoke-virtual {v10, v8, v9, v6, v3}, Lc1/d;->j(Lc1/i;Lc1/i;II)V

    goto :goto_c

    :cond_19
    const/4 v4, 0x5

    invoke-virtual {v10, v8, v9, v6, v4}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    invoke-virtual {v10, v8, v9, v6, v3}, Lc1/d;->j(Lc1/i;Lc1/i;II)V

    :goto_c
    move v4, v1

    move/from16 v24, v2

    goto :goto_7

    :cond_1a
    const/4 v3, 0x2

    if-ne v12, v3, :cond_1e

    invoke-virtual/range {p10 .. p10}, Lj1/d;->k()Lj1/d$a;

    move-result-object v3

    sget-object v4, Lj1/d$a;->TOP:Lj1/d$a;

    if-eq v3, v4, :cond_1c

    invoke-virtual/range {p10 .. p10}, Lj1/d;->k()Lj1/d$a;

    move-result-object v3

    sget-object v6, Lj1/d$a;->BOTTOM:Lj1/d$a;

    if-ne v3, v6, :cond_1b

    goto :goto_e

    :cond_1b
    iget-object v3, v0, Lj1/e;->Z:Lj1/e;

    sget-object v4, Lj1/d$a;->LEFT:Lj1/d$a;

    invoke-virtual {v3, v4}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v3

    invoke-virtual {v10, v3}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v3

    iget-object v4, v0, Lj1/e;->Z:Lj1/e;

    sget-object v6, Lj1/d$a;->RIGHT:Lj1/d$a;

    invoke-virtual {v4, v6}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v4

    invoke-virtual {v10, v4}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v4

    :goto_d
    move-object v11, v3

    move-object v6, v4

    goto :goto_f

    :cond_1c
    :goto_e
    iget-object v3, v0, Lj1/e;->Z:Lj1/e;

    invoke-virtual {v3, v4}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v3

    invoke-virtual {v10, v3}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v3

    iget-object v4, v0, Lj1/e;->Z:Lj1/e;

    sget-object v6, Lj1/d$a;->BOTTOM:Lj1/d$a;

    invoke-virtual {v4, v6}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v4

    invoke-virtual {v10, v4}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v4

    goto :goto_d

    :goto_f
    invoke-virtual/range {p1 .. p1}, Lc1/d;->r()Lc1/b;

    move-result-object v3

    move-object v4, v8

    move/from16 p9, v1

    move v1, v5

    move-object v5, v9

    move/from16 v24, v14

    move-object/from16 v14, v20

    move-object v15, v7

    move-object v7, v11

    move-object v11, v8

    move/from16 v8, p26

    invoke-virtual/range {v3 .. v8}, Lc1/b;->k(Lc1/i;Lc1/i;Lc1/i;Lc1/i;F)Lc1/b;

    move-result-object v3

    invoke-virtual {v10, v3}, Lc1/d;->d(Lc1/b;)V

    if-eqz p3, :cond_1d

    const/16 v24, 0x0

    :cond_1d
    move/from16 v20, p5

    move/from16 v4, p9

    move/from16 v25, v24

    :goto_10
    move/from16 v24, v2

    goto :goto_11

    :cond_1e
    move/from16 p9, v1

    move v1, v5

    move-object v15, v7

    move-object v11, v8

    move/from16 v24, v14

    move-object/from16 v14, v20

    move/from16 v4, p9

    move/from16 v25, v24

    const/16 v20, 0x1

    goto :goto_10

    :goto_11
    if-eqz p27, :cond_1f

    if-eqz p19, :cond_20

    :cond_1f
    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object v7, v9

    const/4 v4, 0x0

    const/4 v6, 0x2

    const/16 v13, 0x8

    const/16 v18, 0x1

    goto/16 :goto_33

    :cond_20
    if-nez v16, :cond_22

    if-nez v17, :cond_22

    if-nez v18, :cond_22

    :cond_21
    :goto_12
    const/4 v3, 0x5

    const/4 v4, 0x0

    goto/16 :goto_30

    :cond_22
    if-eqz v16, :cond_24

    if-nez v17, :cond_24

    iget-object v1, v13, Lj1/d;->f:Lj1/d;

    iget-object v1, v1, Lj1/d;->d:Lj1/e;

    if-eqz p3, :cond_23

    instance-of v1, v1, Lj1/a;

    if-eqz v1, :cond_23

    const/16 v2, 0x8

    goto :goto_13

    :cond_23
    const/4 v2, 0x5

    :goto_13
    move/from16 v19, p3

    const/4 v4, 0x0

    goto/16 :goto_31

    :cond_24
    if-nez v16, :cond_27

    if-eqz v17, :cond_27

    invoke-virtual/range {p11 .. p11}, Lj1/d;->f()I

    move-result v1

    neg-int v1, v1

    const/16 v2, 0x8

    invoke-virtual {v10, v11, v14, v1, v2}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    if-eqz p3, :cond_21

    iget-boolean v1, v0, Lj1/e;->j:Z

    if-eqz v1, :cond_26

    iget-boolean v1, v9, Lc1/i;->g:Z

    if-eqz v1, :cond_26

    iget-object v1, v0, Lj1/e;->Z:Lj1/e;

    if-eqz v1, :cond_26

    check-cast v1, Lj1/f;

    if-eqz p2, :cond_25

    invoke-virtual {v1, v13}, Lj1/f;->k1(Lj1/d;)V

    goto :goto_12

    :cond_25
    invoke-virtual {v1, v13}, Lj1/f;->p1(Lj1/d;)V

    goto :goto_12

    :cond_26
    move-object/from16 v8, p6

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v10, v9, v8, v1, v2}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    move v4, v1

    move v3, v2

    goto/16 :goto_30

    :cond_27
    move-object/from16 v8, p6

    const/4 v1, 0x0

    if-eqz v16, :cond_5a

    if-eqz v17, :cond_5a

    iget-object v2, v13, Lj1/d;->f:Lj1/d;

    iget-object v7, v2, Lj1/d;->d:Lj1/e;

    move-object/from16 v5, p11

    move v6, v1

    iget-object v1, v5, Lj1/d;->f:Lj1/d;

    iget-object v3, v1, Lj1/d;->d:Lj1/e;

    invoke-virtual/range {p0 .. p0}, Lj1/e;->F()Lj1/e;

    move-result-object v2

    const/16 v16, 0x6

    if-eqz v25, :cond_3c

    if-nez v12, :cond_2c

    if-nez v4, :cond_29

    if-nez v24, :cond_29

    iget-boolean v1, v15, Lc1/i;->g:Z

    if-eqz v1, :cond_28

    iget-boolean v1, v14, Lc1/i;->g:Z

    if-eqz v1, :cond_28

    invoke-virtual/range {p10 .. p10}, Lj1/d;->f()I

    move-result v1

    const/16 v4, 0x8

    invoke-virtual {v10, v9, v15, v1, v4}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    invoke-virtual/range {p11 .. p11}, Lj1/d;->f()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v10, v11, v14, v1, v4}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    return-void

    :cond_28
    const/16 v4, 0x8

    move v1, v4

    move/from16 v17, v1

    move/from16 v18, v6

    move/from16 v23, v18

    const/16 v22, 0x1

    goto :goto_14

    :cond_29
    const/16 v4, 0x8

    move/from16 v22, v6

    const/4 v1, 0x5

    const/16 v17, 0x5

    const/16 v18, 0x1

    const/16 v23, 0x1

    :goto_14
    instance-of v4, v7, Lj1/a;

    if-nez v4, :cond_2b

    instance-of v4, v3, Lj1/a;

    if-eqz v4, :cond_2a

    goto :goto_16

    :cond_2a
    move-object/from16 v4, p7

    move/from16 v19, v16

    move/from16 v21, v17

    move/from16 v27, v18

    move/from16 v28, v22

    move/from16 v26, v23

    const/4 v6, 0x1

    const/16 v17, 0x8

    const/16 v18, 0x5

    :goto_15
    move/from16 v23, v1

    const/4 v1, 0x3

    goto/16 :goto_21

    :cond_2b
    :goto_16
    move-object/from16 v4, p7

    move/from16 v19, v16

    move/from16 v27, v18

    move/from16 v28, v22

    move/from16 v26, v23

    const/4 v6, 0x1

    const/16 v17, 0x8

    const/16 v18, 0x5

    const/16 v21, 0x4

    goto :goto_15

    :cond_2c
    const/4 v1, 0x2

    const/16 v17, 0x8

    if-ne v12, v1, :cond_2f

    instance-of v1, v7, Lj1/a;

    if-nez v1, :cond_2e

    instance-of v1, v3, Lj1/a;

    if-eqz v1, :cond_2d

    goto :goto_19

    :cond_2d
    move-object/from16 v4, p7

    move/from16 v28, v6

    move/from16 v19, v16

    const/4 v1, 0x3

    const/4 v6, 0x1

    const/16 v18, 0x5

    const/16 v21, 0x5

    :goto_17
    const/16 v23, 0x5

    :goto_18
    const/16 v26, 0x1

    const/16 v27, 0x1

    goto/16 :goto_21

    :cond_2e
    :goto_19
    move-object/from16 v4, p7

    move/from16 v28, v6

    move/from16 v19, v16

    const/4 v1, 0x3

    const/4 v6, 0x1

    const/16 v18, 0x5

    const/16 v21, 0x4

    goto :goto_17

    :cond_2f
    const/4 v1, 0x1

    if-ne v12, v1, :cond_30

    move-object/from16 v4, p7

    move/from16 v28, v6

    move/from16 v19, v16

    move/from16 v23, v17

    const/4 v1, 0x3

    const/4 v6, 0x1

    const/16 v18, 0x5

    const/16 v21, 0x4

    goto :goto_18

    :cond_30
    const/4 v1, 0x3

    if-ne v12, v1, :cond_3b

    iget v1, v0, Lj1/e;->F:I

    const/4 v6, -0x1

    if-ne v1, v6, :cond_33

    if-eqz p20, :cond_32

    move-object/from16 v4, p7

    move/from16 v23, v17

    const/4 v1, 0x3

    const/4 v6, 0x1

    const/16 v18, 0x5

    if-eqz p3, :cond_31

    const/16 v19, 0x5

    :goto_1a
    const/16 v21, 0x5

    const/16 v26, 0x1

    const/16 v27, 0x1

    const/16 v28, 0x1

    goto/16 :goto_21

    :cond_31
    const/16 v19, 0x4

    goto :goto_1a

    :cond_32
    move-object/from16 v4, p7

    move/from16 v19, v17

    move/from16 v23, v19

    const/4 v1, 0x3

    const/4 v6, 0x1

    const/16 v18, 0x5

    goto :goto_1a

    :cond_33
    if-eqz p17, :cond_36

    move/from16 v1, p23

    const/4 v6, 0x2

    if-eq v1, v6, :cond_35

    const/4 v6, 0x1

    if-ne v1, v6, :cond_34

    goto :goto_1b

    :cond_34
    move/from16 v1, v17

    const/4 v4, 0x5

    goto :goto_1c

    :cond_35
    const/4 v6, 0x1

    :goto_1b
    const/4 v1, 0x5

    const/4 v4, 0x4

    :goto_1c
    move/from16 v23, v1

    move/from16 v21, v4

    move/from16 v26, v6

    move/from16 v27, v26

    move/from16 v28, v27

    move/from16 v19, v16

    const/4 v1, 0x3

    const/16 v18, 0x5

    move-object/from16 v4, p7

    goto/16 :goto_21

    :cond_36
    const/4 v6, 0x1

    if-lez v4, :cond_37

    move-object/from16 v4, p7

    move/from16 v26, v6

    move/from16 v27, v26

    move/from16 v28, v27

    move/from16 v19, v16

    const/4 v1, 0x3

    const/16 v18, 0x5

    const/16 v21, 0x5

    :goto_1d
    const/16 v23, 0x5

    goto/16 :goto_21

    :cond_37
    if-nez v4, :cond_3a

    if-nez v24, :cond_3a

    if-nez p20, :cond_38

    move-object/from16 v4, p7

    move/from16 v26, v6

    move/from16 v27, v26

    move/from16 v28, v27

    move/from16 v19, v16

    move/from16 v21, v17

    const/4 v1, 0x3

    const/16 v18, 0x5

    goto :goto_1d

    :cond_38
    if-eq v7, v2, :cond_39

    if-eq v3, v2, :cond_39

    const/4 v1, 0x4

    goto :goto_1e

    :cond_39
    const/4 v1, 0x5

    :goto_1e
    move-object/from16 v4, p7

    move/from16 v23, v1

    move/from16 v26, v6

    move/from16 v27, v26

    move/from16 v28, v27

    move/from16 v19, v16

    const/4 v1, 0x3

    const/16 v18, 0x5

    const/16 v21, 0x4

    goto/16 :goto_21

    :cond_3a
    move-object/from16 v4, p7

    move/from16 v26, v6

    move/from16 v27, v26

    move/from16 v28, v27

    move/from16 v19, v16

    const/4 v1, 0x3

    const/16 v18, 0x5

    const/16 v21, 0x4

    goto :goto_1d

    :cond_3b
    const/4 v6, 0x1

    move-object/from16 v4, p7

    move/from16 v19, v16

    const/16 v18, 0x5

    const/16 v21, 0x4

    const/16 v23, 0x5

    const/16 v26, 0x0

    const/16 v27, 0x0

    :goto_1f
    const/16 v28, 0x0

    goto :goto_21

    :cond_3c
    const/4 v6, 0x1

    const/16 v17, 0x8

    iget-boolean v1, v15, Lc1/i;->g:Z

    if-eqz v1, :cond_3f

    iget-boolean v1, v14, Lc1/i;->g:Z

    if-eqz v1, :cond_3f

    invoke-virtual/range {p10 .. p10}, Lj1/d;->f()I

    move-result v1

    invoke-virtual/range {p11 .. p11}, Lj1/d;->f()I

    move-result v2

    const/16 v3, 0x8

    move-object/from16 p17, p1

    move-object/from16 p18, v9

    move-object/from16 p19, v15

    move/from16 p20, v1

    move/from16 p21, p16

    move-object/from16 p22, v14

    move-object/from16 p23, v11

    move/from16 p24, v2

    move/from16 p25, v3

    invoke-virtual/range {p17 .. p25}, Lc1/d;->c(Lc1/i;Lc1/i;IFLc1/i;Lc1/i;II)V

    if-eqz p3, :cond_3e

    if-eqz v20, :cond_3e

    iget-object v1, v5, Lj1/d;->f:Lj1/d;

    if-eqz v1, :cond_3d

    invoke-virtual/range {p11 .. p11}, Lj1/d;->f()I

    move-result v1

    move-object/from16 v4, p7

    goto :goto_20

    :cond_3d
    move-object/from16 v4, p7

    const/4 v1, 0x0

    :goto_20
    if-eq v14, v4, :cond_3e

    const/4 v2, 0x5

    invoke-virtual {v10, v4, v11, v1, v2}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_3e
    return-void

    :cond_3f
    move-object/from16 v4, p7

    const/4 v1, 0x3

    const/16 v18, 0x5

    move/from16 v26, v6

    move/from16 v27, v26

    move/from16 v19, v16

    move/from16 v23, v18

    const/16 v21, 0x4

    goto :goto_1f

    :goto_21
    if-eqz v26, :cond_40

    if-ne v15, v14, :cond_40

    if-eq v7, v2, :cond_40

    const/16 v26, 0x0

    const/16 v29, 0x0

    goto :goto_22

    :cond_40
    move/from16 v29, v6

    :goto_22
    if-eqz v27, :cond_42

    if-nez v25, :cond_41

    if-nez p18, :cond_41

    if-nez p20, :cond_41

    if-ne v15, v8, :cond_41

    if-ne v14, v4, :cond_41

    move/from16 v23, v17

    move/from16 v27, v23

    const/16 v19, 0x0

    const/16 v29, 0x0

    goto :goto_23

    :cond_41
    move/from16 v27, v23

    move/from16 v23, v19

    move/from16 v19, p3

    :goto_23
    invoke-virtual/range {p10 .. p10}, Lj1/d;->f()I

    move-result v30

    invoke-virtual/range {p11 .. p11}, Lj1/d;->f()I

    move-result v31

    move v13, v1

    move-object/from16 v1, p1

    move-object/from16 v32, v2

    move/from16 v13, v17

    const/16 v17, 0x4

    move/from16 v36, v18

    move/from16 v18, v6

    move/from16 v6, v36

    move-object v2, v9

    move-object/from16 v33, v3

    move-object v3, v15

    move/from16 v4, v30

    move/from16 v5, p16

    move-object v6, v14

    move-object/from16 v34, v7

    move-object v7, v11

    move/from16 v8, v31

    move-object/from16 v35, v9

    move/from16 v9, v23

    invoke-virtual/range {v1 .. v9}, Lc1/d;->c(Lc1/i;Lc1/i;IFLc1/i;Lc1/i;II)V

    move/from16 v23, v27

    :goto_24
    move/from16 v2, v29

    goto :goto_25

    :cond_42
    move-object/from16 v32, v2

    move-object/from16 v33, v3

    move/from16 v18, v6

    move-object/from16 v34, v7

    move-object/from16 v35, v9

    move/from16 v13, v17

    const/16 v17, 0x4

    move/from16 v19, p3

    goto :goto_24

    :goto_25
    iget v1, v0, Lj1/e;->r0:I

    if-ne v1, v13, :cond_43

    invoke-virtual/range {p11 .. p11}, Lj1/d;->m()Z

    move-result v1

    if-nez v1, :cond_43

    return-void

    :cond_43
    if-eqz v26, :cond_47

    if-eqz v19, :cond_45

    if-eq v15, v14, :cond_45

    if-nez v25, :cond_45

    move-object/from16 v1, v34

    instance-of v3, v1, Lj1/a;

    if-nez v3, :cond_44

    move-object/from16 v3, v33

    instance-of v4, v3, Lj1/a;

    if-eqz v4, :cond_46

    goto :goto_26

    :cond_44
    move-object/from16 v3, v33

    :goto_26
    move/from16 v4, v16

    goto :goto_27

    :cond_45
    move-object/from16 v3, v33

    move-object/from16 v1, v34

    :cond_46
    move/from16 v4, v23

    :goto_27
    invoke-virtual/range {p10 .. p10}, Lj1/d;->f()I

    move-result v5

    move-object/from16 v7, v35

    invoke-virtual {v10, v7, v15, v5, v4}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    invoke-virtual/range {p11 .. p11}, Lj1/d;->f()I

    move-result v5

    neg-int v5, v5

    invoke-virtual {v10, v11, v14, v5, v4}, Lc1/d;->j(Lc1/i;Lc1/i;II)V

    move/from16 v23, v4

    goto :goto_28

    :cond_47
    move-object/from16 v3, v33

    move-object/from16 v1, v34

    move-object/from16 v7, v35

    :goto_28
    if-eqz v19, :cond_48

    if-eqz p21, :cond_48

    instance-of v4, v1, Lj1/a;

    if-nez v4, :cond_48

    instance-of v4, v3, Lj1/a;

    if-nez v4, :cond_48

    move-object/from16 v4, v32

    if-eq v3, v4, :cond_49

    move/from16 v5, v16

    move v6, v5

    move/from16 v2, v18

    goto :goto_29

    :cond_48
    move-object/from16 v4, v32

    :cond_49
    move/from16 v5, v21

    move/from16 v6, v23

    :goto_29
    if-eqz v2, :cond_55

    if-eqz v28, :cond_52

    if-eqz p20, :cond_4a

    if-eqz p4, :cond_52

    :cond_4a
    if-eq v1, v4, :cond_4c

    if-ne v3, v4, :cond_4b

    goto :goto_2a

    :cond_4b
    move v2, v5

    goto :goto_2b

    :cond_4c
    :goto_2a
    move/from16 v2, v16

    :goto_2b
    instance-of v8, v1, Lj1/h;

    if-nez v8, :cond_4d

    instance-of v8, v3, Lj1/h;

    if-eqz v8, :cond_4e

    :cond_4d
    const/4 v2, 0x5

    :cond_4e
    instance-of v8, v1, Lj1/a;

    if-nez v8, :cond_4f

    instance-of v8, v3, Lj1/a;

    if-eqz v8, :cond_50

    :cond_4f
    const/4 v2, 0x5

    :cond_50
    if-eqz p20, :cond_51

    const/4 v2, 0x5

    :cond_51
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_2c

    :cond_52
    move v2, v5

    :goto_2c
    if-eqz v19, :cond_54

    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-eqz p17, :cond_54

    if-nez p20, :cond_54

    if-eq v1, v4, :cond_53

    if-ne v3, v4, :cond_54

    :cond_53
    move/from16 v2, v17

    :cond_54
    invoke-virtual/range {p10 .. p10}, Lj1/d;->f()I

    move-result v1

    invoke-virtual {v10, v7, v15, v1, v2}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    invoke-virtual/range {p11 .. p11}, Lj1/d;->f()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v10, v11, v14, v1, v2}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    :cond_55
    if-eqz v19, :cond_57

    move-object/from16 v2, p6

    if-ne v2, v15, :cond_56

    invoke-virtual/range {p10 .. p10}, Lj1/d;->f()I

    move-result v1

    goto :goto_2d

    :cond_56
    const/4 v1, 0x0

    :goto_2d
    if-eq v15, v2, :cond_57

    const/4 v3, 0x5

    invoke-virtual {v10, v7, v2, v1, v3}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    goto :goto_2e

    :cond_57
    const/4 v3, 0x5

    :goto_2e
    if-eqz v19, :cond_59

    if-eqz v25, :cond_59

    if-nez p14, :cond_59

    if-nez v24, :cond_59

    if-eqz v25, :cond_58

    const/4 v1, 0x3

    if-ne v12, v1, :cond_58

    const/4 v4, 0x0

    invoke-virtual {v10, v11, v7, v4, v13}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    goto :goto_2f

    :cond_58
    const/4 v4, 0x0

    invoke-virtual {v10, v11, v7, v4, v3}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    goto :goto_2f

    :cond_59
    const/4 v4, 0x0

    :goto_2f
    move v2, v3

    goto :goto_31

    :cond_5a
    move v4, v1

    const/4 v3, 0x5

    :goto_30
    move/from16 v19, p3

    goto :goto_2f

    :goto_31
    if-eqz v19, :cond_5e

    if-eqz v20, :cond_5e

    move-object/from16 v1, p11

    iget-object v3, v1, Lj1/d;->f:Lj1/d;

    if-eqz v3, :cond_5b

    invoke-virtual/range {p11 .. p11}, Lj1/d;->f()I

    move-result v3

    move v4, v3

    :cond_5b
    move-object/from16 v3, p7

    if-eq v14, v3, :cond_5e

    iget-boolean v5, v0, Lj1/e;->j:Z

    if-eqz v5, :cond_5d

    iget-boolean v5, v11, Lc1/i;->g:Z

    if-eqz v5, :cond_5d

    iget-object v5, v0, Lj1/e;->Z:Lj1/e;

    if-eqz v5, :cond_5d

    check-cast v5, Lj1/f;

    if-eqz p2, :cond_5c

    invoke-virtual {v5, v1}, Lj1/f;->j1(Lj1/d;)V

    goto :goto_32

    :cond_5c
    invoke-virtual {v5, v1}, Lj1/f;->o1(Lj1/d;)V

    :goto_32
    return-void

    :cond_5d
    invoke-virtual {v10, v3, v11, v4, v2}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_5e
    return-void

    :goto_33
    if-ge v1, v6, :cond_63

    if-eqz p3, :cond_63

    if-eqz v20, :cond_63

    invoke-virtual {v10, v7, v2, v4, v13}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    if-nez p2, :cond_60

    iget-object v1, v0, Lj1/e;->R:Lj1/d;

    iget-object v1, v1, Lj1/d;->f:Lj1/d;

    if-nez v1, :cond_5f

    goto :goto_34

    :cond_5f
    move v2, v4

    goto :goto_35

    :cond_60
    :goto_34
    move/from16 v2, v18

    :goto_35
    if-nez p2, :cond_62

    iget-object v1, v0, Lj1/e;->R:Lj1/d;

    iget-object v1, v1, Lj1/d;->f:Lj1/d;

    if-eqz v1, :cond_62

    iget-object v1, v1, Lj1/d;->d:Lj1/e;

    iget v2, v1, Lj1/e;->c0:F

    const/4 v5, 0x0

    cmpl-float v2, v2, v5

    if-eqz v2, :cond_61

    iget-object v1, v1, Lj1/e;->Y:[Lj1/e$b;

    aget-object v2, v1, v4

    sget-object v5, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne v2, v5, :cond_61

    aget-object v1, v1, v18

    if-ne v1, v5, :cond_61

    move/from16 v2, v18

    goto :goto_36

    :cond_61
    move v2, v4

    :cond_62
    :goto_36
    if-eqz v2, :cond_63

    invoke-virtual {v10, v3, v11, v4, v13}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_63
    return-void
.end method


# virtual methods
.method public A()I
    .locals 2

    iget-object v0, p0, Lj1/e;->H:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public A0(F)V
    .locals 0

    iput p1, p0, Lj1/e;->n0:F

    return-void
.end method

.method public B()I
    .locals 2

    iget-object v0, p0, Lj1/e;->H:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public B0(I)V
    .locals 0

    iput p1, p0, Lj1/e;->y0:I

    return-void
.end method

.method public C()I
    .locals 1

    iget v0, p0, Lj1/e;->m0:I

    return v0
.end method

.method public C0(II)V
    .locals 0

    iput p1, p0, Lj1/e;->e0:I

    sub-int/2addr p2, p1

    iput p2, p0, Lj1/e;->a0:I

    iget p1, p0, Lj1/e;->l0:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Lj1/e;->a0:I

    :cond_0
    return-void
.end method

.method public D()I
    .locals 1

    iget v0, p0, Lj1/e;->l0:I

    return v0
.end method

.method public D0(Lj1/e$b;)V
    .locals 2

    iget-object v0, p0, Lj1/e;->Y:[Lj1/e$b;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public E(I)Lj1/e;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lj1/e;->P:Lj1/d;

    iget-object v0, p1, Lj1/d;->f:Lj1/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lj1/d;->f:Lj1/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lj1/d;->d:Lj1/e;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lj1/e;->Q:Lj1/d;

    iget-object v0, p1, Lj1/d;->f:Lj1/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lj1/d;->f:Lj1/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lj1/d;->d:Lj1/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public E0(IIIF)V
    .locals 0

    iput p1, p0, Lj1/e;->w:I

    iput p2, p0, Lj1/e;->z:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Lj1/e;->A:I

    iput p4, p0, Lj1/e;->B:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lj1/e;->w:I

    :cond_1
    return-void
.end method

.method public F()Lj1/e;
    .locals 1

    iget-object v0, p0, Lj1/e;->Z:Lj1/e;

    return-object v0
.end method

.method public F0(F)V
    .locals 2

    iget-object v0, p0, Lj1/e;->C0:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public G(I)Lj1/e;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lj1/e;->N:Lj1/d;

    iget-object v0, p1, Lj1/d;->f:Lj1/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lj1/d;->f:Lj1/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lj1/d;->d:Lj1/e;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lj1/e;->O:Lj1/d;

    iget-object v0, p1, Lj1/d;->f:Lj1/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lj1/d;->f:Lj1/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lj1/d;->d:Lj1/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected G0(IZ)V
    .locals 1

    iget-object v0, p0, Lj1/e;->X:[Z

    aput-boolean p2, v0, p1

    return-void
.end method

.method public H()I
    .locals 2

    invoke-virtual {p0}, Lj1/e;->P()I

    move-result v0

    iget v1, p0, Lj1/e;->a0:I

    add-int/2addr v0, v1

    return v0
.end method

.method public H0(I)V
    .locals 2

    iget-object v0, p0, Lj1/e;->H:[I

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public I(I)Lk1/p;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lj1/e;->e:Lk1/l;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lj1/e;->f:Lk1/n;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public I0(I)V
    .locals 2

    iget-object v0, p0, Lj1/e;->H:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public J()I
    .locals 1

    invoke-virtual {p0}, Lj1/e;->Q()I

    move-result v0

    return v0
.end method

.method public J0(Z)V
    .locals 0

    iput-boolean p1, p0, Lj1/e;->i:Z

    return-void
.end method

.method public K()F
    .locals 1

    iget v0, p0, Lj1/e;->o0:F

    return v0
.end method

.method public K0(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Lj1/e;->m0:I

    goto :goto_0

    :cond_0
    iput p1, p0, Lj1/e;->m0:I

    :goto_0
    return-void
.end method

.method public L()I
    .locals 1

    iget v0, p0, Lj1/e;->z0:I

    return v0
.end method

.method public L0(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Lj1/e;->l0:I

    goto :goto_0

    :cond_0
    iput p1, p0, Lj1/e;->l0:I

    :goto_0
    return-void
.end method

.method public M()Lj1/e$b;
    .locals 2

    iget-object v0, p0, Lj1/e;->Y:[Lj1/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public M0(Lj1/e;)V
    .locals 0

    iput-object p1, p0, Lj1/e;->Z:Lj1/e;

    return-void
.end method

.method public N()I
    .locals 1

    iget v0, p0, Lj1/e;->r0:I

    return v0
.end method

.method public N0(F)V
    .locals 0

    iput p1, p0, Lj1/e;->o0:F

    return-void
.end method

.method public O()I
    .locals 2

    iget v0, p0, Lj1/e;->r0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lj1/e;->a0:I

    return v0
.end method

.method public O0(I)V
    .locals 0

    iput p1, p0, Lj1/e;->z0:I

    return-void
.end method

.method public P()I
    .locals 2

    iget-object v0, p0, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lj1/f;

    if-eqz v1, :cond_0

    check-cast v0, Lj1/f;

    iget v0, v0, Lj1/f;->R0:I

    iget v1, p0, Lj1/e;->e0:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Lj1/e;->e0:I

    return v0
.end method

.method public P0(II)V
    .locals 0

    iput p1, p0, Lj1/e;->f0:I

    sub-int/2addr p2, p1

    iput p2, p0, Lj1/e;->b0:I

    iget p1, p0, Lj1/e;->m0:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Lj1/e;->b0:I

    :cond_0
    return-void
.end method

.method public Q()I
    .locals 2

    iget-object v0, p0, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lj1/f;

    if-eqz v1, :cond_0

    check-cast v0, Lj1/f;

    iget v0, v0, Lj1/f;->S0:I

    iget v1, p0, Lj1/e;->f0:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Lj1/e;->f0:I

    return v0
.end method

.method public Q0(Lj1/e$b;)V
    .locals 2

    iget-object v0, p0, Lj1/e;->Y:[Lj1/e$b;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    return-void
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, Lj1/e;->J:Z

    return v0
.end method

.method public R0(IIIF)V
    .locals 0

    iput p1, p0, Lj1/e;->x:I

    iput p2, p0, Lj1/e;->C:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Lj1/e;->D:I

    iput p4, p0, Lj1/e;->E:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lj1/e;->x:I

    :cond_1
    return-void
.end method

.method public S(I)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_3

    iget-object p1, p0, Lj1/e;->N:Lj1/d;

    iget-object p1, p1, Lj1/d;->f:Lj1/d;

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget-object v3, p0, Lj1/e;->P:Lj1/d;

    iget-object v3, v3, Lj1/d;->f:Lj1/d;

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_2

    move v1, v2

    :cond_2
    return v1

    :cond_3
    iget-object p1, p0, Lj1/e;->O:Lj1/d;

    iget-object p1, p1, Lj1/d;->f:Lj1/d;

    if-eqz p1, :cond_4

    move p1, v2

    goto :goto_2

    :cond_4
    move p1, v1

    :goto_2
    iget-object v3, p0, Lj1/e;->Q:Lj1/d;

    iget-object v3, v3, Lj1/d;->f:Lj1/d;

    if-eqz v3, :cond_5

    move v3, v2

    goto :goto_3

    :cond_5
    move v3, v1

    :goto_3
    add-int/2addr p1, v3

    iget-object v3, p0, Lj1/e;->R:Lj1/d;

    iget-object v3, v3, Lj1/d;->f:Lj1/d;

    if-eqz v3, :cond_6

    move v3, v2

    goto :goto_4

    :cond_6
    move v3, v1

    :goto_4
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_7

    move v1, v2

    :cond_7
    return v1
.end method

.method public S0(F)V
    .locals 2

    iget-object v0, p0, Lj1/e;->C0:[F

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public T()Z
    .locals 4

    iget-object v0, p0, Lj1/e;->W:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lj1/e;->W:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj1/d;

    invoke-virtual {v3}, Lj1/d;->m()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public T0(I)V
    .locals 0

    iput p1, p0, Lj1/e;->r0:I

    return-void
.end method

.method public U()Z
    .locals 2

    iget v0, p0, Lj1/e;->l:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lj1/e;->m:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public U0(I)V
    .locals 1

    iput p1, p0, Lj1/e;->a0:I

    iget v0, p0, Lj1/e;->l0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Lj1/e;->a0:I

    :cond_0
    return-void
.end method

.method public V(II)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lj1/e;->N:Lj1/d;

    iget-object p1, p1, Lj1/d;->f:Lj1/d;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lj1/d;->n()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lj1/e;->P:Lj1/d;

    iget-object p1, p1, Lj1/d;->f:Lj1/d;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lj1/d;->n()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lj1/e;->P:Lj1/d;

    iget-object p1, p1, Lj1/d;->f:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->e()I

    move-result p1

    iget-object v2, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {v2}, Lj1/d;->f()I

    move-result v2

    sub-int/2addr p1, v2

    iget-object v2, p0, Lj1/e;->N:Lj1/d;

    iget-object v2, v2, Lj1/d;->f:Lj1/d;

    invoke-virtual {v2}, Lj1/d;->e()I

    move-result v2

    iget-object v3, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {v3}, Lj1/d;->f()I

    move-result v3

    add-int/2addr v2, v3

    sub-int/2addr p1, v2

    if-lt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    iget-object p1, p0, Lj1/e;->O:Lj1/d;

    iget-object p1, p1, Lj1/d;->f:Lj1/d;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lj1/d;->n()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lj1/e;->Q:Lj1/d;

    iget-object p1, p1, Lj1/d;->f:Lj1/d;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lj1/d;->n()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lj1/e;->Q:Lj1/d;

    iget-object p1, p1, Lj1/d;->f:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->e()I

    move-result p1

    iget-object v2, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v2}, Lj1/d;->f()I

    move-result v2

    sub-int/2addr p1, v2

    iget-object v2, p0, Lj1/e;->O:Lj1/d;

    iget-object v2, v2, Lj1/d;->f:Lj1/d;

    invoke-virtual {v2}, Lj1/d;->e()I

    move-result v2

    iget-object v3, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {v3}, Lj1/d;->f()I

    move-result v3

    add-int/2addr v2, v3

    sub-int/2addr p1, v2

    if-lt p1, p2, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    return v0

    :cond_3
    return v1
.end method

.method public V0(I)V
    .locals 0

    iput p1, p0, Lj1/e;->e0:I

    return-void
.end method

.method public W(Lj1/d$a;Lj1/e;Lj1/d$a;II)V
    .locals 0

    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p4, p5, p3}, Lj1/d;->b(Lj1/d;IIZ)Z

    return-void
.end method

.method public W0(I)V
    .locals 0

    iput p1, p0, Lj1/e;->f0:I

    return-void
.end method

.method public X0(ZZZZ)V
    .locals 3

    iget p1, p0, Lj1/e;->F:I

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    if-eqz p3, :cond_0

    if-nez p4, :cond_0

    iput v0, p0, Lj1/e;->F:I

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    if-eqz p4, :cond_1

    iput v1, p0, Lj1/e;->F:I

    iget p1, p0, Lj1/e;->d0:I

    if-ne p1, v2, :cond_1

    iget p1, p0, Lj1/e;->G:F

    div-float p1, p2, p1

    iput p1, p0, Lj1/e;->G:F

    :cond_1
    :goto_0
    iget p1, p0, Lj1/e;->F:I

    if-nez p1, :cond_3

    iget-object p1, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iput v1, p0, Lj1/e;->F:I

    goto :goto_1

    :cond_3
    iget p1, p0, Lj1/e;->F:I

    if-ne p1, v1, :cond_5

    iget-object p1, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    iput v0, p0, Lj1/e;->F:I

    :cond_5
    :goto_1
    iget p1, p0, Lj1/e;->F:I

    if-ne p1, v2, :cond_8

    iget-object p1, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-nez p1, :cond_8

    :cond_6
    iget-object p1, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-eqz p1, :cond_7

    iput v0, p0, Lj1/e;->F:I

    goto :goto_2

    :cond_7
    iget-object p1, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {p1}, Lj1/d;->o()Z

    move-result p1

    if-eqz p1, :cond_8

    iget p1, p0, Lj1/e;->G:F

    div-float p1, p2, p1

    iput p1, p0, Lj1/e;->G:F

    iput v1, p0, Lj1/e;->F:I

    :cond_8
    :goto_2
    iget p1, p0, Lj1/e;->F:I

    if-ne p1, v2, :cond_a

    iget p1, p0, Lj1/e;->z:I

    if-lez p1, :cond_9

    iget p3, p0, Lj1/e;->C:I

    if-nez p3, :cond_9

    iput v0, p0, Lj1/e;->F:I

    goto :goto_3

    :cond_9
    if-nez p1, :cond_a

    iget p1, p0, Lj1/e;->C:I

    if-lez p1, :cond_a

    iget p1, p0, Lj1/e;->G:F

    div-float/2addr p2, p1

    iput p2, p0, Lj1/e;->G:F

    iput v1, p0, Lj1/e;->F:I

    :cond_a
    :goto_3
    return-void
.end method

.method public Y()Z
    .locals 1

    iget-boolean v0, p0, Lj1/e;->r:Z

    return v0
.end method

.method public Y0(ZZ)V
    .locals 7

    iget-object v0, p0, Lj1/e;->e:Lk1/l;

    invoke-virtual {v0}, Lk1/p;->k()Z

    move-result v0

    and-int/2addr p1, v0

    iget-object v0, p0, Lj1/e;->f:Lk1/n;

    invoke-virtual {v0}, Lk1/p;->k()Z

    move-result v0

    and-int/2addr p2, v0

    iget-object v0, p0, Lj1/e;->e:Lk1/l;

    iget-object v1, v0, Lk1/p;->h:Lk1/f;

    iget v1, v1, Lk1/f;->g:I

    iget-object v2, p0, Lj1/e;->f:Lk1/n;

    iget-object v3, v2, Lk1/p;->h:Lk1/f;

    iget v3, v3, Lk1/f;->g:I

    iget-object v0, v0, Lk1/p;->i:Lk1/f;

    iget v0, v0, Lk1/f;->g:I

    iget-object v2, v2, Lk1/p;->i:Lk1/f;

    iget v2, v2, Lk1/f;->g:I

    sub-int v4, v0, v1

    sub-int v5, v2, v3

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v1, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v1, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v2, v4, :cond_0

    if-ne v2, v5, :cond_1

    :cond_0
    move v0, v6

    move v1, v0

    move v2, v1

    move v3, v2

    :cond_1
    sub-int/2addr v0, v1

    sub-int/2addr v2, v3

    if-eqz p1, :cond_2

    iput v1, p0, Lj1/e;->e0:I

    :cond_2
    if-eqz p2, :cond_3

    iput v3, p0, Lj1/e;->f0:I

    :cond_3
    iget v1, p0, Lj1/e;->r0:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    iput v6, p0, Lj1/e;->a0:I

    iput v6, p0, Lj1/e;->b0:I

    return-void

    :cond_4
    if-eqz p1, :cond_6

    iget-object p1, p0, Lj1/e;->Y:[Lj1/e$b;

    aget-object p1, p1, v6

    sget-object v1, Lj1/e$b;->FIXED:Lj1/e$b;

    if-ne p1, v1, :cond_5

    iget p1, p0, Lj1/e;->a0:I

    if-ge v0, p1, :cond_5

    move v0, p1

    :cond_5
    iput v0, p0, Lj1/e;->a0:I

    iget p1, p0, Lj1/e;->l0:I

    if-ge v0, p1, :cond_6

    iput p1, p0, Lj1/e;->a0:I

    :cond_6
    if-eqz p2, :cond_8

    iget-object p1, p0, Lj1/e;->Y:[Lj1/e$b;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    sget-object p2, Lj1/e$b;->FIXED:Lj1/e$b;

    if-ne p1, p2, :cond_7

    iget p1, p0, Lj1/e;->b0:I

    if-ge v2, p1, :cond_7

    move v2, p1

    :cond_7
    iput v2, p0, Lj1/e;->b0:I

    iget p1, p0, Lj1/e;->m0:I

    if-ge v2, p1, :cond_8

    iput p1, p0, Lj1/e;->b0:I

    :cond_8
    return-void
.end method

.method public Z(I)Z
    .locals 1

    iget-object v0, p0, Lj1/e;->X:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public Z0(Lc1/d;Z)V
    .locals 6

    iget-object v0, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {p1, v0}, Lc1/d;->x(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {p1, v1}, Lc1/d;->x(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {p1, v2}, Lc1/d;->x(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {p1, v3}, Lc1/d;->x(Ljava/lang/Object;)I

    move-result p1

    if-eqz p2, :cond_0

    iget-object v3, p0, Lj1/e;->e:Lk1/l;

    if-eqz v3, :cond_0

    iget-object v4, v3, Lk1/p;->h:Lk1/f;

    iget-boolean v5, v4, Lk1/f;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, Lk1/p;->i:Lk1/f;

    iget-boolean v5, v3, Lk1/f;->j:Z

    if-eqz v5, :cond_0

    iget v0, v4, Lk1/f;->g:I

    iget v2, v3, Lk1/f;->g:I

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lj1/e;->f:Lk1/n;

    if-eqz p2, :cond_1

    iget-object v3, p2, Lk1/p;->h:Lk1/f;

    iget-boolean v4, v3, Lk1/f;->j:Z

    if-eqz v4, :cond_1

    iget-object p2, p2, Lk1/p;->i:Lk1/f;

    iget-boolean v4, p2, Lk1/f;->j:Z

    if-eqz v4, :cond_1

    iget v1, v3, Lk1/f;->g:I

    iget p1, p2, Lk1/f;->g:I

    :cond_1
    sub-int p2, v2, v0

    sub-int v3, p1, v1

    if-ltz p2, :cond_2

    if-ltz v3, :cond_2

    const/high16 p2, -0x80000000

    if-eq v0, p2, :cond_2

    const v3, 0x7fffffff

    if-eq v0, v3, :cond_2

    if-eq v1, p2, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v2, p2, :cond_2

    if-eq v2, v3, :cond_2

    if-eq p1, p2, :cond_2

    if-ne p1, v3, :cond_3

    :cond_2
    const/4 v0, 0x0

    move p1, v0

    move v1, p1

    move v2, v1

    :cond_3
    invoke-virtual {p0, v0, v1, v2, p1}, Lj1/e;->x0(IIII)V

    return-void
.end method

.method public a0()Z
    .locals 2

    iget-object v0, p0, Lj1/e;->N:Lj1/d;

    iget-object v1, v0, Lj1/d;->f:Lj1/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lj1/d;->f:Lj1/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lj1/e;->P:Lj1/d;

    iget-object v1, v0, Lj1/d;->f:Lj1/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lj1/d;->f:Lj1/d;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lj1/f;Lc1/d;Ljava/util/HashSet;IZ)V
    .locals 7

    if-eqz p5, :cond_1

    invoke-virtual {p3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2, p0}, Lj1/k;->a(Lj1/f;Lc1/d;Lj1/e;)V

    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/16 p5, 0x40

    invoke-virtual {p1, p5}, Lj1/f;->B1(I)Z

    move-result p5

    invoke-virtual {p0, p2, p5}, Lj1/e;->d(Lc1/d;Z)V

    :cond_1
    if-nez p4, :cond_3

    iget-object p5, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {p5}, Lj1/d;->d()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_2

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/d;

    iget-object v1, v0, Lj1/d;->d:Lj1/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lj1/e;->b(Lj1/f;Lc1/d;Ljava/util/HashSet;IZ)V

    goto :goto_0

    :cond_2
    iget-object p5, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {p5}, Lj1/d;->d()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_6

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/d;

    iget-object v1, v0, Lj1/d;->d:Lj1/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lj1/e;->b(Lj1/f;Lc1/d;Ljava/util/HashSet;IZ)V

    goto :goto_1

    :cond_3
    iget-object p5, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {p5}, Lj1/d;->d()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_4

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_2
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/d;

    iget-object v1, v0, Lj1/d;->d:Lj1/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lj1/e;->b(Lj1/f;Lc1/d;Ljava/util/HashSet;IZ)V

    goto :goto_2

    :cond_4
    iget-object p5, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {p5}, Lj1/d;->d()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_5

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_3
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/d;

    iget-object v1, v0, Lj1/d;->d:Lj1/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lj1/e;->b(Lj1/f;Lc1/d;Ljava/util/HashSet;IZ)V

    goto :goto_3

    :cond_5
    iget-object p5, p0, Lj1/e;->R:Lj1/d;

    invoke-virtual {p5}, Lj1/d;->d()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_6

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_4
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/d;

    iget-object v1, v0, Lj1/d;->d:Lj1/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lj1/e;->b(Lj1/f;Lc1/d;Ljava/util/HashSet;IZ)V

    goto :goto_4

    :cond_6
    return-void
.end method

.method public b0()Z
    .locals 2

    iget-object v0, p0, Lj1/e;->O:Lj1/d;

    iget-object v1, v0, Lj1/d;->f:Lj1/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lj1/d;->f:Lj1/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lj1/e;->Q:Lj1/d;

    iget-object v1, v0, Lj1/d;->f:Lj1/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lj1/d;->f:Lj1/d;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method c()Z
    .locals 1

    instance-of v0, p0, Lj1/l;

    if-nez v0, :cond_1

    instance-of v0, p0, Lj1/h;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public c0()Z
    .locals 1

    iget-boolean v0, p0, Lj1/e;->K:Z

    return v0
.end method

.method public d(Lc1/d;Z)V
    .locals 53

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    iget-object v0, v15, Lj1/e;->N:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v13

    iget-object v0, v15, Lj1/e;->P:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v12

    iget-object v0, v15, Lj1/e;->O:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v11

    iget-object v0, v15, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v10

    iget-object v0, v15, Lj1/e;->R:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v9

    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    const/4 v8, 0x2

    const/4 v1, 0x3

    const/4 v7, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_2

    if-eqz v0, :cond_0

    iget-object v2, v0, Lj1/e;->Y:[Lj1/e$b;

    aget-object v2, v2, v6

    sget-object v3, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    if-ne v2, v3, :cond_0

    move v2, v7

    goto :goto_0

    :cond_0
    move v2, v6

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lj1/e;->Y:[Lj1/e$b;

    aget-object v0, v0, v7

    sget-object v3, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    if-ne v0, v3, :cond_1

    move v0, v7

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    iget v3, v15, Lj1/e;->v:I

    if-eq v3, v7, :cond_4

    if-eq v3, v8, :cond_3

    if-eq v3, v1, :cond_2

    move v5, v0

    move v4, v2

    goto :goto_2

    :cond_2
    move v4, v6

    move v5, v4

    goto :goto_2

    :cond_3
    move v5, v0

    move v4, v6

    goto :goto_2

    :cond_4
    move v4, v2

    move v5, v6

    :goto_2
    iget v0, v15, Lj1/e;->r0:I

    const/16 v3, 0x8

    if-ne v0, v3, :cond_5

    iget-boolean v0, v15, Lj1/e;->s0:Z

    if-nez v0, :cond_5

    invoke-virtual/range {p0 .. p0}, Lj1/e;->T()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v15, Lj1/e;->X:[Z

    aget-boolean v2, v0, v6

    if-nez v2, :cond_5

    aget-boolean v0, v0, v7

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-boolean v0, v15, Lj1/e;->p:Z

    const/4 v2, 0x5

    if-nez v0, :cond_6

    iget-boolean v8, v15, Lj1/e;->q:Z

    if-eqz v8, :cond_c

    :cond_6
    if-eqz v0, :cond_8

    iget v0, v15, Lj1/e;->e0:I

    invoke-virtual {v14, v13, v0}, Lc1/d;->f(Lc1/i;I)V

    iget v0, v15, Lj1/e;->e0:I

    iget v8, v15, Lj1/e;->a0:I

    add-int/2addr v0, v8

    invoke-virtual {v14, v12, v0}, Lc1/d;->f(Lc1/i;I)V

    if-eqz v4, :cond_8

    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_8

    iget-boolean v8, v15, Lj1/e;->k:Z

    if-eqz v8, :cond_7

    check-cast v0, Lj1/f;

    iget-object v8, v15, Lj1/e;->N:Lj1/d;

    invoke-virtual {v0, v8}, Lj1/f;->k1(Lj1/d;)V

    iget-object v8, v15, Lj1/e;->P:Lj1/d;

    invoke-virtual {v0, v8}, Lj1/f;->j1(Lj1/d;)V

    goto :goto_3

    :cond_7
    iget-object v0, v0, Lj1/e;->P:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    invoke-virtual {v14, v0, v12, v6, v2}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_8
    :goto_3
    iget-boolean v0, v15, Lj1/e;->q:Z

    if-eqz v0, :cond_b

    iget v0, v15, Lj1/e;->f0:I

    invoke-virtual {v14, v11, v0}, Lc1/d;->f(Lc1/i;I)V

    iget v0, v15, Lj1/e;->f0:I

    iget v8, v15, Lj1/e;->b0:I

    add-int/2addr v0, v8

    invoke-virtual {v14, v10, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->R:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->m()Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, v15, Lj1/e;->f0:I

    iget v8, v15, Lj1/e;->k0:I

    add-int/2addr v0, v8

    invoke-virtual {v14, v9, v0}, Lc1/d;->f(Lc1/i;I)V

    :cond_9
    if-eqz v5, :cond_b

    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_b

    iget-boolean v8, v15, Lj1/e;->k:Z

    if-eqz v8, :cond_a

    check-cast v0, Lj1/f;

    iget-object v8, v15, Lj1/e;->O:Lj1/d;

    invoke-virtual {v0, v8}, Lj1/f;->p1(Lj1/d;)V

    iget-object v8, v15, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v0, v8}, Lj1/f;->o1(Lj1/d;)V

    goto :goto_4

    :cond_a
    iget-object v0, v0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    invoke-virtual {v14, v0, v10, v6, v2}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_b
    :goto_4
    iget-boolean v0, v15, Lj1/e;->p:Z

    if-eqz v0, :cond_c

    iget-boolean v0, v15, Lj1/e;->q:Z

    if-eqz v0, :cond_c

    iput-boolean v6, v15, Lj1/e;->p:Z

    iput-boolean v6, v15, Lj1/e;->q:Z

    return-void

    :cond_c
    sget-boolean v0, Lc1/d;->s:Z

    if-eqz p2, :cond_f

    iget-object v0, v15, Lj1/e;->e:Lk1/l;

    if-eqz v0, :cond_f

    iget-object v8, v15, Lj1/e;->f:Lk1/n;

    if-eqz v8, :cond_f

    iget-object v2, v0, Lk1/p;->h:Lk1/f;

    iget-boolean v1, v2, Lk1/f;->j:Z

    if-eqz v1, :cond_f

    iget-object v0, v0, Lk1/p;->i:Lk1/f;

    iget-boolean v0, v0, Lk1/f;->j:Z

    if-eqz v0, :cond_f

    iget-object v0, v8, Lk1/p;->h:Lk1/f;

    iget-boolean v0, v0, Lk1/f;->j:Z

    if-eqz v0, :cond_f

    iget-object v0, v8, Lk1/p;->i:Lk1/f;

    iget-boolean v0, v0, Lk1/f;->j:Z

    if-eqz v0, :cond_f

    iget v0, v2, Lk1/f;->g:I

    invoke-virtual {v14, v13, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->e:Lk1/l;

    iget-object v0, v0, Lk1/p;->i:Lk1/f;

    iget v0, v0, Lk1/f;->g:I

    invoke-virtual {v14, v12, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->f:Lk1/n;

    iget-object v0, v0, Lk1/p;->h:Lk1/f;

    iget v0, v0, Lk1/f;->g:I

    invoke-virtual {v14, v11, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->f:Lk1/n;

    iget-object v0, v0, Lk1/p;->i:Lk1/f;

    iget v0, v0, Lk1/f;->g:I

    invoke-virtual {v14, v10, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->f:Lk1/n;

    iget-object v0, v0, Lk1/n;->k:Lk1/f;

    iget v0, v0, Lk1/f;->g:I

    invoke-virtual {v14, v9, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_e

    if-eqz v4, :cond_d

    iget-object v0, v15, Lj1/e;->g:[Z

    aget-boolean v0, v0, v6

    if-eqz v0, :cond_d

    invoke-virtual/range {p0 .. p0}, Lj1/e;->a0()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    iget-object v0, v0, Lj1/e;->P:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    invoke-virtual {v14, v0, v12, v6, v3}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_d
    if-eqz v5, :cond_e

    iget-object v0, v15, Lj1/e;->g:[Z

    aget-boolean v0, v0, v7

    if-eqz v0, :cond_e

    invoke-virtual/range {p0 .. p0}, Lj1/e;->b0()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    iget-object v0, v0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    invoke-virtual {v14, v0, v10, v6, v3}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_e
    iput-boolean v6, v15, Lj1/e;->p:Z

    iput-boolean v6, v15, Lj1/e;->q:Z

    return-void

    :cond_f
    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_14

    invoke-direct {v15, v6}, Lj1/e;->X(I)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    check-cast v0, Lj1/f;

    invoke-virtual {v0, v15, v6}, Lj1/f;->g1(Lj1/e;I)V

    move v0, v7

    goto :goto_5

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lj1/e;->a0()Z

    move-result v0

    :goto_5
    invoke-direct {v15, v7}, Lj1/e;->X(I)Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v1, v15, Lj1/e;->Z:Lj1/e;

    check-cast v1, Lj1/f;

    invoke-virtual {v1, v15, v7}, Lj1/f;->g1(Lj1/e;I)V

    move v1, v7

    goto :goto_6

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lj1/e;->b0()Z

    move-result v1

    :goto_6
    if-nez v0, :cond_12

    if-eqz v4, :cond_12

    iget v2, v15, Lj1/e;->r0:I

    if-eq v2, v3, :cond_12

    iget-object v2, v15, Lj1/e;->N:Lj1/d;

    iget-object v2, v2, Lj1/d;->f:Lj1/d;

    if-nez v2, :cond_12

    iget-object v2, v15, Lj1/e;->P:Lj1/d;

    iget-object v2, v2, Lj1/d;->f:Lj1/d;

    if-nez v2, :cond_12

    iget-object v2, v15, Lj1/e;->Z:Lj1/e;

    iget-object v2, v2, Lj1/e;->P:Lj1/d;

    invoke-virtual {v14, v2}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v2

    invoke-virtual {v14, v2, v12, v6, v7}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_12
    if-nez v1, :cond_13

    if-eqz v5, :cond_13

    iget v2, v15, Lj1/e;->r0:I

    if-eq v2, v3, :cond_13

    iget-object v2, v15, Lj1/e;->O:Lj1/d;

    iget-object v2, v2, Lj1/d;->f:Lj1/d;

    if-nez v2, :cond_13

    iget-object v2, v15, Lj1/e;->Q:Lj1/d;

    iget-object v2, v2, Lj1/d;->f:Lj1/d;

    if-nez v2, :cond_13

    iget-object v2, v15, Lj1/e;->R:Lj1/d;

    if-nez v2, :cond_13

    iget-object v2, v15, Lj1/e;->Z:Lj1/e;

    iget-object v2, v2, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v14, v2}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v2

    invoke-virtual {v14, v2, v10, v6, v7}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_13
    move/from16 v29, v0

    move/from16 v28, v1

    goto :goto_7

    :cond_14
    move/from16 v28, v6

    move/from16 v29, v28

    :goto_7
    iget v0, v15, Lj1/e;->a0:I

    iget v1, v15, Lj1/e;->l0:I

    if-ge v0, v1, :cond_15

    goto :goto_8

    :cond_15
    move v1, v0

    :goto_8
    iget v2, v15, Lj1/e;->b0:I

    iget v8, v15, Lj1/e;->m0:I

    if-ge v2, v8, :cond_16

    goto :goto_9

    :cond_16
    move v8, v2

    :goto_9
    iget-object v3, v15, Lj1/e;->Y:[Lj1/e$b;

    aget-object v7, v3, v6

    sget-object v6, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    move/from16 v22, v1

    if-eq v7, v6, :cond_17

    const/4 v1, 0x1

    :goto_a
    const/16 v20, 0x1

    goto :goto_b

    :cond_17
    const/4 v1, 0x0

    goto :goto_a

    :goto_b
    aget-object v3, v3, v20

    move/from16 v23, v8

    move-object/from16 v27, v9

    if-eq v3, v6, :cond_18

    const/4 v8, 0x1

    goto :goto_c

    :cond_18
    const/4 v8, 0x0

    :goto_c
    iget v9, v15, Lj1/e;->d0:I

    iput v9, v15, Lj1/e;->F:I

    move-object/from16 v30, v10

    iget v10, v15, Lj1/e;->c0:F

    iput v10, v15, Lj1/e;->G:F

    move-object/from16 v31, v11

    iget v11, v15, Lj1/e;->w:I

    move-object/from16 v32, v12

    iget v12, v15, Lj1/e;->x:I

    const/16 v24, 0x0

    cmpl-float v24, v10, v24

    move-object/from16 v33, v13

    if-lez v24, :cond_22

    iget v13, v15, Lj1/e;->r0:I

    const/16 v14, 0x8

    if-eq v13, v14, :cond_22

    if-ne v7, v6, :cond_19

    if-nez v11, :cond_19

    const/4 v11, 0x3

    :cond_19
    if-ne v3, v6, :cond_1a

    if-nez v12, :cond_1a

    const/4 v12, 0x3

    :cond_1a
    if-ne v7, v6, :cond_1b

    if-ne v3, v6, :cond_1b

    const/4 v13, 0x3

    if-ne v11, v13, :cond_1c

    if-ne v12, v13, :cond_1c

    invoke-virtual {v15, v4, v5, v1, v8}, Lj1/e;->X0(ZZZZ)V

    goto :goto_10

    :cond_1b
    const/4 v13, 0x3

    :cond_1c
    const/4 v1, 0x4

    if-ne v7, v6, :cond_1e

    if-ne v11, v13, :cond_1e

    const/4 v8, 0x0

    iput v8, v15, Lj1/e;->F:I

    int-to-float v0, v2

    mul-float/2addr v10, v0

    float-to-int v0, v10

    if-eq v3, v6, :cond_1d

    move/from16 v36, v1

    move/from16 v35, v12

    move/from16 v34, v23

    const/4 v14, 0x0

    move v1, v0

    goto :goto_11

    :cond_1d
    move v1, v0

    move/from16 v36, v11

    move/from16 v35, v12

    :goto_d
    move/from16 v34, v23

    :goto_e
    const/4 v14, 0x1

    goto :goto_11

    :cond_1e
    if-ne v3, v6, :cond_21

    if-ne v12, v13, :cond_21

    const/4 v2, 0x1

    iput v2, v15, Lj1/e;->F:I

    const/4 v2, -0x1

    if-ne v9, v2, :cond_1f

    const/high16 v2, 0x3f800000    # 1.0f

    div-float/2addr v2, v10

    iput v2, v15, Lj1/e;->G:F

    :cond_1f
    iget v2, v15, Lj1/e;->G:F

    int-to-float v0, v0

    mul-float/2addr v2, v0

    float-to-int v8, v2

    if-eq v7, v6, :cond_20

    move/from16 v35, v1

    move/from16 v34, v8

    move/from16 v36, v11

    move/from16 v1, v22

    :goto_f
    const/4 v14, 0x0

    goto :goto_11

    :cond_20
    move/from16 v34, v8

    move/from16 v36, v11

    move/from16 v35, v12

    move/from16 v1, v22

    goto :goto_e

    :cond_21
    :goto_10
    move/from16 v36, v11

    move/from16 v35, v12

    move/from16 v1, v22

    goto :goto_d

    :cond_22
    move/from16 v36, v11

    move/from16 v35, v12

    move/from16 v1, v22

    move/from16 v34, v23

    goto :goto_f

    :goto_11
    iget-object v0, v15, Lj1/e;->y:[I

    const/4 v2, 0x0

    aput v36, v0, v2

    const/4 v2, 0x1

    aput v35, v0, v2

    iput-boolean v14, v15, Lj1/e;->h:Z

    if-eqz v14, :cond_24

    iget v0, v15, Lj1/e;->F:I

    const/4 v2, -0x1

    if-eqz v0, :cond_23

    if-ne v0, v2, :cond_25

    :cond_23
    const/16 v18, 0x1

    goto :goto_12

    :cond_24
    const/4 v2, -0x1

    :cond_25
    const/16 v18, 0x0

    :goto_12
    if-eqz v14, :cond_27

    iget v0, v15, Lj1/e;->F:I

    const/4 v3, 0x1

    if-eq v0, v3, :cond_26

    if-ne v0, v2, :cond_27

    :cond_26
    const/16 v37, 0x1

    goto :goto_13

    :cond_27
    const/16 v37, 0x0

    :goto_13
    iget-object v0, v15, Lj1/e;->Y:[Lj1/e$b;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    sget-object v13, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    if-ne v0, v13, :cond_28

    instance-of v0, v15, Lj1/f;

    if-eqz v0, :cond_28

    const/4 v9, 0x1

    goto :goto_14

    :cond_28
    const/4 v9, 0x0

    :goto_14
    if-eqz v9, :cond_29

    const/16 v22, 0x0

    goto :goto_15

    :cond_29
    move/from16 v22, v1

    :goto_15
    iget-object v0, v15, Lj1/e;->U:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->o()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/lit8 v38, v0, 0x1

    iget-object v0, v15, Lj1/e;->X:[Z

    const/4 v2, 0x0

    aget-boolean v23, v0, v2

    aget-boolean v39, v0, v1

    iget v0, v15, Lj1/e;->t:I

    const/16 v40, 0x0

    const/4 v8, 0x2

    if-eq v0, v8, :cond_2e

    iget-boolean v0, v15, Lj1/e;->p:Z

    if-nez v0, :cond_2e

    if-eqz p2, :cond_2a

    iget-object v0, v15, Lj1/e;->e:Lk1/l;

    if-eqz v0, :cond_2a

    iget-object v1, v0, Lk1/p;->h:Lk1/f;

    iget-boolean v2, v1, Lk1/f;->j:Z

    if-eqz v2, :cond_2a

    iget-object v0, v0, Lk1/p;->i:Lk1/f;

    iget-boolean v0, v0, Lk1/f;->j:Z

    if-nez v0, :cond_2b

    :cond_2a
    move-object/from16 v12, p1

    move-object/from16 v10, v32

    move-object/from16 v11, v33

    const/16 v3, 0x8

    goto/16 :goto_16

    :cond_2b
    if-eqz p2, :cond_2d

    iget v0, v1, Lk1/f;->g:I

    move-object/from16 v12, p1

    move-object/from16 v11, v33

    invoke-virtual {v12, v11, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->e:Lk1/l;

    iget-object v0, v0, Lk1/p;->i:Lk1/f;

    iget v0, v0, Lk1/f;->g:I

    move-object/from16 v10, v32

    invoke-virtual {v12, v10, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_2c

    if-eqz v4, :cond_2c

    iget-object v0, v15, Lj1/e;->g:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_2c

    invoke-virtual/range {p0 .. p0}, Lj1/e;->a0()Z

    move-result v0

    if-nez v0, :cond_2c

    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    iget-object v0, v0, Lj1/e;->P:Lj1/d;

    invoke-virtual {v12, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    const/16 v3, 0x8

    invoke-virtual {v12, v0, v10, v1, v3}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_2c
    move/from16 v46, v4

    move/from16 v47, v5

    move-object/from16 v48, v6

    move-object/from16 v52, v13

    move/from16 v32, v14

    move-object/from16 v49, v27

    move-object/from16 v50, v30

    move-object/from16 v51, v31

    move-object/from16 v30, v10

    move-object/from16 v31, v11

    goto/16 :goto_1a

    :cond_2d
    move-object/from16 v12, p1

    :cond_2e
    move/from16 v46, v4

    move/from16 v47, v5

    move-object/from16 v48, v6

    move-object/from16 v52, v13

    move-object/from16 v49, v27

    move-object/from16 v50, v30

    move-object/from16 v51, v31

    move-object/from16 v30, v32

    move-object/from16 v31, v33

    move/from16 v32, v14

    goto/16 :goto_1a

    :goto_16
    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_2f

    iget-object v0, v0, Lj1/e;->P:Lj1/d;

    invoke-virtual {v12, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    move-object v7, v0

    goto :goto_17

    :cond_2f
    move-object/from16 v7, v40

    :goto_17
    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_30

    iget-object v0, v0, Lj1/e;->N:Lj1/d;

    invoke-virtual {v12, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_18

    :cond_30
    move-object/from16 v16, v40

    :goto_18
    iget-object v0, v15, Lj1/e;->g:[Z

    const/16 v19, 0x0

    aget-boolean v21, v0, v19

    iget-object v0, v15, Lj1/e;->Y:[Lj1/e$b;

    aget-object v32, v0, v19

    iget-object v1, v15, Lj1/e;->N:Lj1/d;

    iget-object v2, v15, Lj1/e;->P:Lj1/d;

    move-object/from16 v33, v2

    iget v2, v15, Lj1/e;->e0:I

    move/from16 v41, v2

    iget v2, v15, Lj1/e;->l0:I

    iget-object v3, v15, Lj1/e;->H:[I

    aget v43, v3, v19

    iget v3, v15, Lj1/e;->n0:F

    const/16 v20, 0x1

    aget-object v0, v0, v20

    if-ne v0, v6, :cond_31

    move/from16 v44, v20

    goto :goto_19

    :cond_31
    move/from16 v44, v19

    :goto_19
    iget v0, v15, Lj1/e;->z:I

    move/from16 v24, v0

    iget v0, v15, Lj1/e;->A:I

    move/from16 v25, v0

    iget v0, v15, Lj1/e;->B:F

    move/from16 v26, v0

    const/4 v0, 0x1

    move-object/from16 v17, v33

    move/from16 v33, v41

    move/from16 v41, v2

    move v2, v0

    move-object/from16 v0, p0

    move-object/from16 v45, v1

    move-object/from16 v1, p1

    move/from16 v42, v3

    move v3, v4

    move/from16 v46, v4

    move v4, v5

    move/from16 v47, v5

    move/from16 v5, v21

    move-object/from16 v48, v6

    move-object/from16 v6, v16

    move-object/from16 v8, v32

    move-object/from16 v49, v27

    move-object/from16 v16, v10

    move-object/from16 v50, v30

    move-object/from16 v10, v45

    move-object/from16 v19, v11

    move-object/from16 v51, v31

    move-object/from16 v11, v17

    move-object/from16 v30, v16

    move/from16 v12, v33

    move-object/from16 v52, v13

    move-object/from16 v31, v19

    move/from16 v13, v22

    move/from16 v32, v14

    move/from16 v14, v41

    move/from16 v15, v43

    move/from16 v16, v42

    move/from16 v17, v18

    move/from16 v18, v44

    move/from16 v19, v29

    move/from16 v20, v28

    move/from16 v21, v23

    move/from16 v22, v36

    move/from16 v23, v35

    move/from16 v27, v38

    invoke-direct/range {v0 .. v27}, Lj1/e;->f(Lc1/d;ZZZZLc1/i;Lc1/i;Lj1/e$b;ZLj1/d;Lj1/d;IIIIFZZZZZIIIIFZ)V

    :goto_1a
    if-eqz p2, :cond_35

    move-object/from16 v15, p0

    iget-object v0, v15, Lj1/e;->f:Lk1/n;

    if-eqz v0, :cond_34

    iget-object v1, v0, Lk1/p;->h:Lk1/f;

    iget-boolean v2, v1, Lk1/f;->j:Z

    if-eqz v2, :cond_34

    iget-object v0, v0, Lk1/p;->i:Lk1/f;

    iget-boolean v0, v0, Lk1/f;->j:Z

    if-eqz v0, :cond_34

    iget v0, v1, Lk1/f;->g:I

    move-object/from16 v14, p1

    move-object/from16 v13, v51

    invoke-virtual {v14, v13, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->f:Lk1/n;

    iget-object v0, v0, Lk1/p;->i:Lk1/f;

    iget v0, v0, Lk1/f;->g:I

    move-object/from16 v12, v50

    invoke-virtual {v14, v12, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->f:Lk1/n;

    iget-object v0, v0, Lk1/n;->k:Lk1/f;

    iget v0, v0, Lk1/f;->g:I

    move-object/from16 v1, v49

    invoke-virtual {v14, v1, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_33

    if-nez v28, :cond_33

    if-eqz v47, :cond_33

    iget-object v2, v15, Lj1/e;->g:[Z

    const/4 v11, 0x1

    aget-boolean v2, v2, v11

    if-eqz v2, :cond_32

    iget-object v0, v0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v10, 0x0

    invoke-virtual {v14, v0, v12, v10, v2}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    goto :goto_1b

    :cond_32
    const/16 v2, 0x8

    const/4 v10, 0x0

    goto :goto_1b

    :cond_33
    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    :goto_1b
    move v7, v10

    goto :goto_1d

    :cond_34
    move-object/from16 v14, p1

    move-object/from16 v1, v49

    move-object/from16 v12, v50

    move-object/from16 v13, v51

    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_1c

    :cond_35
    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v1, v49

    move-object/from16 v12, v50

    move-object/from16 v13, v51

    :goto_1c
    move v7, v11

    :goto_1d
    iget v0, v15, Lj1/e;->u:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_36

    move v6, v10

    goto :goto_1e

    :cond_36
    move v6, v7

    :goto_1e
    if-eqz v6, :cond_41

    iget-boolean v0, v15, Lj1/e;->q:Z

    if-nez v0, :cond_41

    iget-object v0, v15, Lj1/e;->Y:[Lj1/e$b;

    aget-object v0, v0, v11

    move-object/from16 v3, v52

    if-ne v0, v3, :cond_37

    instance-of v0, v15, Lj1/f;

    if-eqz v0, :cond_37

    move v9, v11

    goto :goto_1f

    :cond_37
    move v9, v10

    :goto_1f
    if-eqz v9, :cond_38

    move/from16 v34, v10

    :cond_38
    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_39

    iget-object v0, v0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    move-object v7, v0

    goto :goto_20

    :cond_39
    move-object/from16 v7, v40

    :goto_20
    iget-object v0, v15, Lj1/e;->Z:Lj1/e;

    if-eqz v0, :cond_3a

    iget-object v0, v0, Lj1/e;->O:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    move-object v6, v0

    goto :goto_21

    :cond_3a
    move-object/from16 v6, v40

    :goto_21
    iget v0, v15, Lj1/e;->k0:I

    if-gtz v0, :cond_3b

    iget v0, v15, Lj1/e;->r0:I

    if-ne v0, v2, :cond_3f

    :cond_3b
    iget-object v0, v15, Lj1/e;->R:Lj1/d;

    iget-object v3, v0, Lj1/d;->f:Lj1/d;

    if-eqz v3, :cond_3d

    invoke-virtual/range {p0 .. p0}, Lj1/e;->m()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    iget-object v0, v15, Lj1/e;->R:Lj1/d;

    iget-object v0, v0, Lj1/d;->f:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    iget-object v3, v15, Lj1/e;->R:Lj1/d;

    invoke-virtual {v3}, Lj1/d;->f()I

    move-result v3

    invoke-virtual {v14, v1, v0, v3, v2}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    if-eqz v47, :cond_3c

    iget-object v0, v15, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v14, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v14, v7, v0, v10, v1}, Lc1/d;->h(Lc1/i;Lc1/i;II)V

    :cond_3c
    move/from16 v27, v10

    goto :goto_23

    :cond_3d
    iget v3, v15, Lj1/e;->r0:I

    if-ne v3, v2, :cond_3e

    invoke-virtual {v0}, Lj1/d;->f()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    goto :goto_22

    :cond_3e
    invoke-virtual/range {p0 .. p0}, Lj1/e;->m()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, Lc1/d;->e(Lc1/i;Lc1/i;II)Lc1/b;

    :cond_3f
    :goto_22
    move/from16 v27, v38

    :goto_23
    iget-object v0, v15, Lj1/e;->g:[Z

    aget-boolean v5, v0, v11

    iget-object v0, v15, Lj1/e;->Y:[Lj1/e$b;

    aget-object v8, v0, v11

    iget-object v4, v15, Lj1/e;->O:Lj1/d;

    iget-object v3, v15, Lj1/e;->Q:Lj1/d;

    iget v1, v15, Lj1/e;->f0:I

    iget v2, v15, Lj1/e;->m0:I

    iget-object v10, v15, Lj1/e;->H:[I

    aget v16, v10, v11

    iget v10, v15, Lj1/e;->o0:F

    const/16 v17, 0x0

    aget-object v0, v0, v17

    move-object/from16 v11, v48

    if-ne v0, v11, :cond_40

    const/16 v18, 0x1

    goto :goto_24

    :cond_40
    move/from16 v18, v17

    :goto_24
    iget v0, v15, Lj1/e;->C:I

    move/from16 v24, v0

    iget v0, v15, Lj1/e;->D:I

    move/from16 v25, v0

    iget v0, v15, Lj1/e;->E:F

    move/from16 v26, v0

    const/4 v0, 0x0

    move/from16 v19, v2

    move v2, v0

    move-object/from16 v0, p0

    move/from16 v20, v1

    move-object/from16 v1, p1

    move-object v11, v3

    move/from16 v3, v47

    move-object/from16 v21, v4

    move/from16 v4, v46

    move/from16 v17, v10

    move-object/from16 v10, v21

    move-object/from16 v33, v12

    move/from16 v12, v20

    move-object/from16 v38, v13

    move/from16 v13, v34

    move/from16 v14, v19

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v37

    move/from16 v19, v28

    move/from16 v20, v29

    move/from16 v21, v39

    move/from16 v22, v35

    move/from16 v23, v36

    invoke-direct/range {v0 .. v27}, Lj1/e;->f(Lc1/d;ZZZZLc1/i;Lc1/i;Lj1/e$b;ZLj1/d;Lj1/d;IIIIFZZZZZIIIIFZ)V

    goto :goto_25

    :cond_41
    move-object/from16 v33, v12

    move-object/from16 v38, v13

    :goto_25
    move-object/from16 v7, p0

    if-eqz v32, :cond_43

    iget v0, v7, Lj1/e;->F:I

    const/16 v6, 0x8

    const/4 v1, 0x1

    if-ne v0, v1, :cond_42

    iget v5, v7, Lj1/e;->G:F

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    move-object/from16 v2, v38

    move-object/from16 v3, v30

    move-object/from16 v4, v31

    invoke-virtual/range {v0 .. v6}, Lc1/d;->k(Lc1/i;Lc1/i;Lc1/i;Lc1/i;FI)V

    goto :goto_26

    :cond_42
    iget v5, v7, Lj1/e;->G:F

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    move-object/from16 v2, v31

    move-object/from16 v3, v33

    move-object/from16 v4, v38

    invoke-virtual/range {v0 .. v6}, Lc1/d;->k(Lc1/i;Lc1/i;Lc1/i;Lc1/i;FI)V

    :cond_43
    :goto_26
    iget-object v0, v7, Lj1/e;->U:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->o()Z

    move-result v0

    if-eqz v0, :cond_44

    iget-object v0, v7, Lj1/e;->U:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->j()Lj1/d;

    move-result-object v0

    invoke-virtual {v0}, Lj1/d;->h()Lj1/e;

    move-result-object v0

    iget v1, v7, Lj1/e;->I:F

    const/high16 v2, 0x42b40000    # 90.0f

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, v7, Lj1/e;->U:Lj1/d;

    invoke-virtual {v2}, Lj1/d;->f()I

    move-result v2

    move-object/from16 v3, p1

    invoke-virtual {v3, v7, v0, v1, v2}, Lc1/d;->b(Lj1/e;Lj1/e;FI)V

    :cond_44
    const/4 v0, 0x0

    iput-boolean v0, v7, Lj1/e;->p:Z

    iput-boolean v0, v7, Lj1/e;->q:Z

    return-void
.end method

.method public d0()Z
    .locals 2

    iget-boolean v0, p0, Lj1/e;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lj1/e;->r0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Z
    .locals 2

    iget v0, p0, Lj1/e;->r0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e0()Z
    .locals 1

    iget-boolean v0, p0, Lj1/e;->p:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f0()Z
    .locals 1

    iget-boolean v0, p0, Lj1/e;->q:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public g(Lj1/d$a;Lj1/e;Lj1/d$a;I)V
    .locals 8

    sget-object v0, Lj1/d$a;->CENTER:Lj1/d$a;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_c

    if-ne p3, v0, :cond_8

    sget-object p1, Lj1/d$a;->LEFT:Lj1/d$a;

    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p3

    sget-object p4, Lj1/d$a;->RIGHT:Lj1/d$a;

    invoke-virtual {p0, p4}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v2

    sget-object v3, Lj1/d$a;->TOP:Lj1/d$a;

    invoke-virtual {p0, v3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v4

    sget-object v5, Lj1/d$a;->BOTTOM:Lj1/d$a;

    invoke-virtual {p0, v5}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v6

    const/4 v7, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lj1/d;->o()Z

    move-result p3

    if-nez p3, :cond_1

    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lj1/d;->o()Z

    move-result p3

    if-eqz p3, :cond_2

    :cond_1
    move p1, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, p2, p1, v1}, Lj1/e;->g(Lj1/d$a;Lj1/e;Lj1/d$a;I)V

    invoke-virtual {p0, p4, p2, p4, v1}, Lj1/e;->g(Lj1/d$a;Lj1/e;Lj1/d$a;I)V

    move p1, v7

    :goto_0
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lj1/d;->o()Z

    move-result p3

    if-nez p3, :cond_4

    :cond_3
    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lj1/d;->o()Z

    move-result p3

    if-eqz p3, :cond_5

    :cond_4
    move v7, v1

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v3, p2, v3, v1}, Lj1/e;->g(Lj1/d$a;Lj1/e;Lj1/d$a;I)V

    invoke-virtual {p0, v5, p2, v5, v1}, Lj1/e;->g(Lj1/d$a;Lj1/e;Lj1/d$a;I)V

    :goto_1
    if-eqz p1, :cond_6

    if-eqz v7, :cond_6

    invoke-virtual {p0, v0}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p2, v0}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lj1/d;->a(Lj1/d;I)Z

    goto/16 :goto_5

    :cond_6
    if-eqz p1, :cond_7

    sget-object p1, Lj1/d$a;->CENTER_X:Lj1/d$a;

    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p3

    invoke-virtual {p2, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p3, p1, v1}, Lj1/d;->a(Lj1/d;I)Z

    goto/16 :goto_5

    :cond_7
    if-eqz v7, :cond_1c

    sget-object p1, Lj1/d$a;->CENTER_Y:Lj1/d$a;

    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p3

    invoke-virtual {p2, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p3, p1, v1}, Lj1/d;->a(Lj1/d;I)Z

    goto/16 :goto_5

    :cond_8
    sget-object p1, Lj1/d$a;->LEFT:Lj1/d$a;

    if-eq p3, p1, :cond_b

    sget-object p4, Lj1/d$a;->RIGHT:Lj1/d$a;

    if-ne p3, p4, :cond_9

    goto :goto_2

    :cond_9
    sget-object p1, Lj1/d$a;->TOP:Lj1/d$a;

    if-eq p3, p1, :cond_a

    sget-object p4, Lj1/d$a;->BOTTOM:Lj1/d$a;

    if-ne p3, p4, :cond_1c

    :cond_a
    invoke-virtual {p0, p1, p2, p3, v1}, Lj1/e;->g(Lj1/d$a;Lj1/e;Lj1/d$a;I)V

    sget-object p1, Lj1/d$a;->BOTTOM:Lj1/d$a;

    invoke-virtual {p0, p1, p2, p3, v1}, Lj1/e;->g(Lj1/d$a;Lj1/e;Lj1/d$a;I)V

    invoke-virtual {p0, v0}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lj1/d;->a(Lj1/d;I)Z

    goto/16 :goto_5

    :cond_b
    :goto_2
    invoke-virtual {p0, p1, p2, p3, v1}, Lj1/e;->g(Lj1/d$a;Lj1/e;Lj1/d$a;I)V

    sget-object p1, Lj1/d$a;->RIGHT:Lj1/d$a;

    invoke-virtual {p0, p1, p2, p3, v1}, Lj1/e;->g(Lj1/d$a;Lj1/e;Lj1/d$a;I)V

    invoke-virtual {p0, v0}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lj1/d;->a(Lj1/d;I)Z

    goto/16 :goto_5

    :cond_c
    sget-object v2, Lj1/d$a;->CENTER_X:Lj1/d$a;

    if-ne p1, v2, :cond_e

    sget-object v3, Lj1/d$a;->LEFT:Lj1/d$a;

    if-eq p3, v3, :cond_d

    sget-object v4, Lj1/d$a;->RIGHT:Lj1/d$a;

    if-ne p3, v4, :cond_e

    :cond_d
    invoke-virtual {p0, v3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    sget-object p3, Lj1/d$a;->RIGHT:Lj1/d$a;

    invoke-virtual {p0, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p3

    invoke-virtual {p1, p2, v1}, Lj1/d;->a(Lj1/d;I)Z

    invoke-virtual {p3, p2, v1}, Lj1/d;->a(Lj1/d;I)Z

    invoke-virtual {p0, v2}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p1, p2, v1}, Lj1/d;->a(Lj1/d;I)Z

    goto/16 :goto_5

    :cond_e
    sget-object v3, Lj1/d$a;->CENTER_Y:Lj1/d$a;

    if-ne p1, v3, :cond_10

    sget-object v4, Lj1/d$a;->TOP:Lj1/d$a;

    if-eq p3, v4, :cond_f

    sget-object v5, Lj1/d$a;->BOTTOM:Lj1/d$a;

    if-ne p3, v5, :cond_10

    :cond_f
    invoke-virtual {p2, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p0, v4}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lj1/d;->a(Lj1/d;I)Z

    sget-object p2, Lj1/d$a;->BOTTOM:Lj1/d$a;

    invoke-virtual {p0, p2}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lj1/d;->a(Lj1/d;I)Z

    invoke-virtual {p0, v3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lj1/d;->a(Lj1/d;I)Z

    goto/16 :goto_5

    :cond_10
    if-ne p1, v2, :cond_11

    if-ne p3, v2, :cond_11

    sget-object p1, Lj1/d$a;->LEFT:Lj1/d$a;

    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lj1/d;->a(Lj1/d;I)Z

    sget-object p1, Lj1/d$a;->RIGHT:Lj1/d$a;

    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lj1/d;->a(Lj1/d;I)Z

    invoke-virtual {p0, v2}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lj1/d;->a(Lj1/d;I)Z

    goto/16 :goto_5

    :cond_11
    if-ne p1, v3, :cond_12

    if-ne p3, v3, :cond_12

    sget-object p1, Lj1/d$a;->TOP:Lj1/d$a;

    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lj1/d;->a(Lj1/d;I)Z

    sget-object p1, Lj1/d$a;->BOTTOM:Lj1/d$a;

    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lj1/d;->a(Lj1/d;I)Z

    invoke-virtual {p0, v3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lj1/d;->a(Lj1/d;I)Z

    goto/16 :goto_5

    :cond_12
    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object v1

    invoke-virtual {p2, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p2

    invoke-virtual {v1, p2}, Lj1/d;->p(Lj1/d;)Z

    move-result p3

    if-eqz p3, :cond_1c

    sget-object p3, Lj1/d$a;->BASELINE:Lj1/d$a;

    if-ne p1, p3, :cond_14

    sget-object p1, Lj1/d$a;->TOP:Lj1/d$a;

    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    sget-object p3, Lj1/d$a;->BOTTOM:Lj1/d$a;

    invoke-virtual {p0, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p3

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lj1/d;->q()V

    :cond_13
    if-eqz p3, :cond_1b

    invoke-virtual {p3}, Lj1/d;->q()V

    goto :goto_4

    :cond_14
    sget-object v4, Lj1/d$a;->TOP:Lj1/d$a;

    if-eq p1, v4, :cond_18

    sget-object v4, Lj1/d$a;->BOTTOM:Lj1/d$a;

    if-ne p1, v4, :cond_15

    goto :goto_3

    :cond_15
    sget-object p3, Lj1/d$a;->LEFT:Lj1/d$a;

    if-eq p1, p3, :cond_16

    sget-object p3, Lj1/d$a;->RIGHT:Lj1/d$a;

    if-ne p1, p3, :cond_1b

    :cond_16
    invoke-virtual {p0, v0}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p3

    invoke-virtual {p3}, Lj1/d;->j()Lj1/d;

    move-result-object v0

    if-eq v0, p2, :cond_17

    invoke-virtual {p3}, Lj1/d;->q()V

    :cond_17
    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p1}, Lj1/d;->g()Lj1/d;

    move-result-object p1

    invoke-virtual {p0, v2}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p3

    invoke-virtual {p3}, Lj1/d;->o()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Lj1/d;->q()V

    invoke-virtual {p3}, Lj1/d;->q()V

    goto :goto_4

    :cond_18
    :goto_3
    invoke-virtual {p0, p3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p3

    if-eqz p3, :cond_19

    invoke-virtual {p3}, Lj1/d;->q()V

    :cond_19
    invoke-virtual {p0, v0}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p3

    invoke-virtual {p3}, Lj1/d;->j()Lj1/d;

    move-result-object v0

    if-eq v0, p2, :cond_1a

    invoke-virtual {p3}, Lj1/d;->q()V

    :cond_1a
    invoke-virtual {p0, p1}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p1

    invoke-virtual {p1}, Lj1/d;->g()Lj1/d;

    move-result-object p1

    invoke-virtual {p0, v3}, Lj1/e;->l(Lj1/d$a;)Lj1/d;

    move-result-object p3

    invoke-virtual {p3}, Lj1/d;->o()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Lj1/d;->q()V

    invoke-virtual {p3}, Lj1/d;->q()V

    :cond_1b
    :goto_4
    invoke-virtual {v1, p2, p4}, Lj1/d;->a(Lj1/d;I)Z

    :cond_1c
    :goto_5
    return-void
.end method

.method public g0()Z
    .locals 1

    iget-boolean v0, p0, Lj1/e;->s:Z

    return v0
.end method

.method public h(Lj1/d;Lj1/d;I)V
    .locals 1

    invoke-virtual {p1}, Lj1/d;->h()Lj1/e;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-virtual {p1}, Lj1/d;->k()Lj1/d$a;

    move-result-object p1

    invoke-virtual {p2}, Lj1/d;->h()Lj1/e;

    move-result-object v0

    invoke-virtual {p2}, Lj1/d;->k()Lj1/d$a;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2, p3}, Lj1/e;->g(Lj1/d$a;Lj1/e;Lj1/d$a;I)V

    :cond_0
    return-void
.end method

.method public h0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj1/e;->r:Z

    return-void
.end method

.method public i(Lj1/e;FI)V
    .locals 6

    sget-object v3, Lj1/d$a;->CENTER:Lj1/d$a;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v3

    move-object v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lj1/e;->W(Lj1/d$a;Lj1/e;Lj1/d$a;II)V

    iput p2, p0, Lj1/e;->I:F

    return-void
.end method

.method public i0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj1/e;->s:Z

    return-void
.end method

.method public j(Lc1/d;)V
    .locals 1

    iget-object v0, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {p1, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    iget-object v0, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {p1, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    iget-object v0, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {p1, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    iget-object v0, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {p1, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    iget v0, p0, Lj1/e;->k0:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lj1/e;->R:Lj1/d;

    invoke-virtual {p1, v0}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    :cond_0
    return-void
.end method

.method public j0()Z
    .locals 4

    iget-object v0, p0, Lj1/e;->Y:[Lj1/e$b;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    sget-object v3, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    aget-object v0, v0, v2

    if-ne v0, v3, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lj1/e;->e:Lk1/l;

    if-nez v0, :cond_0

    new-instance v0, Lk1/l;

    invoke-direct {v0, p0}, Lk1/l;-><init>(Lj1/e;)V

    iput-object v0, p0, Lj1/e;->e:Lk1/l;

    :cond_0
    iget-object v0, p0, Lj1/e;->f:Lk1/n;

    if-nez v0, :cond_1

    new-instance v0, Lk1/n;

    invoke-direct {v0, p0}, Lk1/n;-><init>(Lj1/e;)V

    iput-object v0, p0, Lj1/e;->f:Lk1/n;

    :cond_1
    return-void
.end method

.method public k0()V
    .locals 6

    iget-object v0, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->q()V

    iget-object v0, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->q()V

    iget-object v0, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->q()V

    iget-object v0, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->q()V

    iget-object v0, p0, Lj1/e;->R:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->q()V

    iget-object v0, p0, Lj1/e;->S:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->q()V

    iget-object v0, p0, Lj1/e;->T:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->q()V

    iget-object v0, p0, Lj1/e;->U:Lj1/d;

    invoke-virtual {v0}, Lj1/d;->q()V

    const/4 v0, 0x0

    iput-object v0, p0, Lj1/e;->Z:Lj1/e;

    const/high16 v1, 0x7fc00000    # Float.NaN

    iput v1, p0, Lj1/e;->I:F

    const/4 v1, 0x0

    iput v1, p0, Lj1/e;->a0:I

    iput v1, p0, Lj1/e;->b0:I

    const/4 v2, 0x0

    iput v2, p0, Lj1/e;->c0:F

    const/4 v2, -0x1

    iput v2, p0, Lj1/e;->d0:I

    iput v1, p0, Lj1/e;->e0:I

    iput v1, p0, Lj1/e;->f0:I

    iput v1, p0, Lj1/e;->i0:I

    iput v1, p0, Lj1/e;->j0:I

    iput v1, p0, Lj1/e;->k0:I

    iput v1, p0, Lj1/e;->l0:I

    iput v1, p0, Lj1/e;->m0:I

    sget v3, Lj1/e;->J0:F

    iput v3, p0, Lj1/e;->n0:F

    iput v3, p0, Lj1/e;->o0:F

    iget-object v3, p0, Lj1/e;->Y:[Lj1/e$b;

    sget-object v4, Lj1/e$b;->FIXED:Lj1/e$b;

    aput-object v4, v3, v1

    const/4 v5, 0x1

    aput-object v4, v3, v5

    iput-object v0, p0, Lj1/e;->p0:Ljava/lang/Object;

    iput v1, p0, Lj1/e;->q0:I

    iput v1, p0, Lj1/e;->r0:I

    iput-object v0, p0, Lj1/e;->u0:Ljava/lang/String;

    iput-boolean v1, p0, Lj1/e;->v0:Z

    iput-boolean v1, p0, Lj1/e;->w0:Z

    iput v1, p0, Lj1/e;->y0:I

    iput v1, p0, Lj1/e;->z0:I

    iput-boolean v1, p0, Lj1/e;->A0:Z

    iput-boolean v1, p0, Lj1/e;->B0:Z

    iget-object v0, p0, Lj1/e;->C0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v1

    aput v3, v0, v5

    iput v2, p0, Lj1/e;->t:I

    iput v2, p0, Lj1/e;->u:I

    iget-object v0, p0, Lj1/e;->H:[I

    const v3, 0x7fffffff

    aput v3, v0, v1

    aput v3, v0, v5

    iput v1, p0, Lj1/e;->w:I

    iput v1, p0, Lj1/e;->x:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lj1/e;->B:F

    iput v0, p0, Lj1/e;->E:F

    iput v3, p0, Lj1/e;->A:I

    iput v3, p0, Lj1/e;->D:I

    iput v1, p0, Lj1/e;->z:I

    iput v1, p0, Lj1/e;->C:I

    iput-boolean v1, p0, Lj1/e;->h:Z

    iput v2, p0, Lj1/e;->F:I

    iput v0, p0, Lj1/e;->G:F

    iput-boolean v1, p0, Lj1/e;->x0:Z

    iget-object v0, p0, Lj1/e;->g:[Z

    aput-boolean v5, v0, v1

    aput-boolean v5, v0, v5

    iput-boolean v1, p0, Lj1/e;->K:Z

    iget-object v0, p0, Lj1/e;->X:[Z

    aput-boolean v1, v0, v1

    aput-boolean v1, v0, v5

    iput-boolean v5, p0, Lj1/e;->i:Z

    iget-object v0, p0, Lj1/e;->y:[I

    aput v1, v0, v1

    aput v1, v0, v5

    iput v2, p0, Lj1/e;->l:I

    iput v2, p0, Lj1/e;->m:I

    return-void
.end method

.method public l(Lj1/d$a;)Lj1/d;
    .locals 2

    sget-object v0, Lj1/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget-object p1, p0, Lj1/e;->T:Lj1/d;

    return-object p1

    :pswitch_2
    iget-object p1, p0, Lj1/e;->S:Lj1/d;

    return-object p1

    :pswitch_3
    iget-object p1, p0, Lj1/e;->U:Lj1/d;

    return-object p1

    :pswitch_4
    iget-object p1, p0, Lj1/e;->R:Lj1/d;

    return-object p1

    :pswitch_5
    iget-object p1, p0, Lj1/e;->Q:Lj1/d;

    return-object p1

    :pswitch_6
    iget-object p1, p0, Lj1/e;->P:Lj1/d;

    return-object p1

    :pswitch_7
    iget-object p1, p0, Lj1/e;->O:Lj1/d;

    return-object p1

    :pswitch_8
    iget-object p1, p0, Lj1/e;->N:Lj1/d;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l0()V
    .locals 3

    invoke-virtual {p0}, Lj1/e;->F()Lj1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v0, v0, Lj1/f;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj1/e;->F()Lj1/e;

    move-result-object v0

    check-cast v0, Lj1/f;

    invoke-virtual {v0}, Lj1/f;->w1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj1/e;->W:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lj1/e;->W:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj1/d;

    invoke-virtual {v2}, Lj1/d;->q()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lj1/e;->k0:I

    return v0
.end method

.method public m0()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj1/e;->p:Z

    iput-boolean v0, p0, Lj1/e;->q:Z

    iput-boolean v0, p0, Lj1/e;->r:Z

    iput-boolean v0, p0, Lj1/e;->s:Z

    iget-object v1, p0, Lj1/e;->W:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lj1/e;->W:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj1/d;

    invoke-virtual {v2}, Lj1/d;->r()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public n(I)F
    .locals 1

    if-nez p1, :cond_0

    iget p1, p0, Lj1/e;->n0:F

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget p1, p0, Lj1/e;->o0:F

    return p1

    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    return p1
.end method

.method public n0(Lc1/c;)V
    .locals 1

    iget-object v0, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->s(Lc1/c;)V

    iget-object v0, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->s(Lc1/c;)V

    iget-object v0, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->s(Lc1/c;)V

    iget-object v0, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->s(Lc1/c;)V

    iget-object v0, p0, Lj1/e;->R:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->s(Lc1/c;)V

    iget-object v0, p0, Lj1/e;->U:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->s(Lc1/c;)V

    iget-object v0, p0, Lj1/e;->S:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->s(Lc1/c;)V

    iget-object v0, p0, Lj1/e;->T:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->s(Lc1/c;)V

    return-void
.end method

.method public o()I
    .locals 2

    invoke-virtual {p0}, Lj1/e;->Q()I

    move-result v0

    iget v1, p0, Lj1/e;->b0:I

    add-int/2addr v0, v1

    return v0
.end method

.method public o0(I)V
    .locals 0

    iput p1, p0, Lj1/e;->k0:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lj1/e;->J:Z

    return-void
.end method

.method public p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/e;->p0:Ljava/lang/Object;

    return-object v0
.end method

.method public p0(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lj1/e;->p0:Ljava/lang/Object;

    return-void
.end method

.method public q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj1/e;->t0:Ljava/lang/String;

    return-object v0
.end method

.method public q0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lj1/e;->t0:Ljava/lang/String;

    return-void
.end method

.method public r(I)Lj1/e$b;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lj1/e;->x()Lj1/e$b;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lj1/e;->M()Lj1/e$b;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public r0(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x2c

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, -0x1

    if-lez v2, :cond_3

    add-int/lit8 v6, v1, -0x1

    if-ge v2, v6, :cond_3

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "W"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "H"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_0

    :cond_2
    move v3, v5

    :goto_0
    add-int/2addr v2, v4

    move v5, v3

    move v3, v2

    :cond_3
    const/16 v2, 0x3a

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ltz v2, :cond_5

    sub-int/2addr v1, v4

    if-ge v2, v1, :cond_5

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/2addr v2, v4

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    cmpl-float v2, v1, v0

    if-lez v2, :cond_6

    cmpl-float v2, p1, v0

    if-lez v2, :cond_6

    if-ne v5, v4, :cond_4

    div-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_4
    div-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    move p1, v0

    :goto_1
    cmpl-float v0, p1, v0

    if-lez v0, :cond_7

    iput p1, p0, Lj1/e;->c0:F

    iput v5, p0, Lj1/e;->d0:I

    :cond_7
    return-void

    :cond_8
    :goto_2
    iput v0, p0, Lj1/e;->c0:F

    return-void
.end method

.method public s()F
    .locals 1

    iget v0, p0, Lj1/e;->c0:F

    return v0
.end method

.method public s0(I)V
    .locals 3

    iget-boolean v0, p0, Lj1/e;->J:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lj1/e;->k0:I

    sub-int v0, p1, v0

    iget v1, p0, Lj1/e;->b0:I

    add-int/2addr v1, v0

    iput v0, p0, Lj1/e;->f0:I

    iget-object v2, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {v2, v0}, Lj1/d;->t(I)V

    iget-object v0, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v0, v1}, Lj1/d;->t(I)V

    iget-object v0, p0, Lj1/e;->R:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->t(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj1/e;->q:Z

    return-void
.end method

.method public t()I
    .locals 1

    iget v0, p0, Lj1/e;->d0:I

    return v0
.end method

.method public t0(II)V
    .locals 1

    iget-boolean v0, p0, Lj1/e;->p:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->t(I)V

    iget-object v0, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {v0, p2}, Lj1/d;->t(I)V

    iput p1, p0, Lj1/e;->e0:I

    sub-int/2addr p2, p1

    iput p2, p0, Lj1/e;->a0:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj1/e;->p:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lj1/e;->u0:Ljava/lang/String;

    const-string v2, ""

    const-string v3, " "

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "type: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lj1/e;->u0:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj1/e;->t0:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lj1/e;->t0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lj1/e;->e0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lj1/e;->f0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") - ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lj1/e;->a0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lj1/e;->b0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()I
    .locals 2

    iget v0, p0, Lj1/e;->r0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lj1/e;->b0:I

    return v0
.end method

.method public u0(I)V
    .locals 1

    iget-object v0, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->t(I)V

    iput p1, p0, Lj1/e;->e0:I

    return-void
.end method

.method public v()F
    .locals 1

    iget v0, p0, Lj1/e;->n0:F

    return v0
.end method

.method public v0(I)V
    .locals 1

    iget-object v0, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->t(I)V

    iput p1, p0, Lj1/e;->f0:I

    return-void
.end method

.method public w()I
    .locals 1

    iget v0, p0, Lj1/e;->y0:I

    return v0
.end method

.method public w0(II)V
    .locals 1

    iget-boolean v0, p0, Lj1/e;->q:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {v0, p1}, Lj1/d;->t(I)V

    iget-object v0, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v0, p2}, Lj1/d;->t(I)V

    iput p1, p0, Lj1/e;->f0:I

    sub-int/2addr p2, p1

    iput p2, p0, Lj1/e;->b0:I

    iget-boolean p2, p0, Lj1/e;->J:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lj1/e;->R:Lj1/d;

    iget v0, p0, Lj1/e;->k0:I

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Lj1/d;->t(I)V

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lj1/e;->q:Z

    return-void
.end method

.method public x()Lj1/e$b;
    .locals 2

    iget-object v0, p0, Lj1/e;->Y:[Lj1/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public x0(IIII)V
    .locals 2

    sub-int/2addr p3, p1

    sub-int/2addr p4, p2

    iput p1, p0, Lj1/e;->e0:I

    iput p2, p0, Lj1/e;->f0:I

    iget p1, p0, Lj1/e;->r0:I

    const/16 p2, 0x8

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lj1/e;->a0:I

    iput v0, p0, Lj1/e;->b0:I

    return-void

    :cond_0
    iget-object p1, p0, Lj1/e;->Y:[Lj1/e$b;

    aget-object p2, p1, v0

    sget-object v0, Lj1/e$b;->FIXED:Lj1/e$b;

    if-ne p2, v0, :cond_1

    iget v1, p0, Lj1/e;->a0:I

    if-ge p3, v1, :cond_1

    move p3, v1

    :cond_1
    const/4 v1, 0x1

    aget-object p1, p1, v1

    if-ne p1, v0, :cond_2

    iget p1, p0, Lj1/e;->b0:I

    if-ge p4, p1, :cond_2

    move p4, p1

    :cond_2
    iput p3, p0, Lj1/e;->a0:I

    iput p4, p0, Lj1/e;->b0:I

    iget p1, p0, Lj1/e;->m0:I

    if-ge p4, p1, :cond_3

    iput p1, p0, Lj1/e;->b0:I

    :cond_3
    iget p1, p0, Lj1/e;->l0:I

    if-ge p3, p1, :cond_4

    iput p1, p0, Lj1/e;->a0:I

    :cond_4
    iget p1, p0, Lj1/e;->A:I

    if-lez p1, :cond_5

    sget-object v0, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne p2, v0, :cond_5

    iget p2, p0, Lj1/e;->a0:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lj1/e;->a0:I

    :cond_5
    iget p1, p0, Lj1/e;->D:I

    if-lez p1, :cond_6

    iget-object p2, p0, Lj1/e;->Y:[Lj1/e$b;

    aget-object p2, p2, v1

    sget-object v0, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne p2, v0, :cond_6

    iget p2, p0, Lj1/e;->b0:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lj1/e;->b0:I

    :cond_6
    iget p1, p0, Lj1/e;->a0:I

    if-eq p3, p1, :cond_7

    iput p1, p0, Lj1/e;->l:I

    :cond_7
    iget p1, p0, Lj1/e;->b0:I

    if-eq p4, p1, :cond_8

    iput p1, p0, Lj1/e;->m:I

    :cond_8
    return-void
.end method

.method public y()I
    .locals 1

    invoke-virtual {p0}, Lj1/e;->P()I

    move-result v0

    return v0
.end method

.method public y0(Z)V
    .locals 0

    iput-boolean p1, p0, Lj1/e;->J:Z

    return-void
.end method

.method public z(I)I
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lj1/e;->O()I

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lj1/e;->u()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public z0(I)V
    .locals 1

    iput p1, p0, Lj1/e;->b0:I

    iget v0, p0, Lj1/e;->m0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Lj1/e;->b0:I

    :cond_0
    return-void
.end method
