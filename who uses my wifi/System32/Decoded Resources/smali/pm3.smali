.class public abstract Lpm3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lnm3;

.field public static final b:Lom3;

.field public static final c:Lom3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnm3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpm3;->a:Lnm3;

    .line 7
    .line 8
    new-instance v0, Lom3;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-direct {v0, v1}, Lom3;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lpm3;->b:Lom3;

    .line 15
    .line 16
    new-instance v0, Lom3;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, Lom3;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lpm3;->c:Lom3;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;
.end method

.method public abstract b(II)Lpm3;
.end method

.method public abstract c(ZZ)Lpm3;
.end method

.method public abstract d(ZZ)Lpm3;
.end method

.method public abstract e()I
.end method
