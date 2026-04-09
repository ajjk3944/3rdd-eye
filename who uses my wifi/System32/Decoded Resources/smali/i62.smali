.class public final Li62;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final b:Lts0;


# instance fields
.field public final a:Lmm2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lts0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li62;->b:Lts0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le51;Ljava/lang/String;Lea3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lmm2;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lmm2;->b:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iput v1, v0, Lmm2;->g:I

    .line 18
    .line 19
    iput-object p3, v0, Lmm2;->c:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, v0, Lmm2;->a:Landroid/content/Context;

    .line 26
    .line 27
    iput-object p2, v0, Lmm2;->d:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p4, v0, Lmm2;->e:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object v0, p0, Li62;->a:Lmm2;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lg62;Lf62;)Lk62;
    .locals 2

    .line 1
    new-instance v0, Lk62;

    .line 2
    .line 3
    iget-object v1, p0, Li62;->a:Lmm2;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2, p3}, Lk62;-><init>(Lmm2;Ljava/lang/String;Lg62;Lf62;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
