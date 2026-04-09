.class public final Lq4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final i:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Lbw0;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lof3;

.field public final d:Le2;

.field public final e:Lvq2;

.field public f:Z

.field public g:F

.field public h:Ll92;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq4;->i:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lvq2;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbw0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lbw0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lq4;->a:Lbw0;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lq4;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Lof3;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, v2, p0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lq4;->c:Lof3;

    .line 26
    .line 27
    new-instance v0, Le2;

    .line 28
    .line 29
    invoke-direct {v0, v2, p0}, Le2;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lq4;->d:Le2;

    .line 33
    .line 34
    iput-boolean v1, p0, Lq4;->f:Z

    .line 35
    .line 36
    const/high16 v0, 0x3f800000    # 1.0f

    .line 37
    .line 38
    iput v0, p0, Lq4;->g:F

    .line 39
    .line 40
    iput-object p1, p0, Lq4;->e:Lvq2;

    .line 41
    .line 42
    return-void
.end method
