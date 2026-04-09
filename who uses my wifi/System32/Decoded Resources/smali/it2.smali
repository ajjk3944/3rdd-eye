.class public final Lit2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lp12;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lit2;->a:I

    iput-object p1, p0, Lit2;->b:Ljava/lang/String;

    iput-object p2, p0, Lit2;->c:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lit2;->d:Lp12;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lp12;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lit2;->a:I

    iput-object p1, p0, Lit2;->b:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lit2;->c:Ljava/lang/String;

    iput-object p2, p0, Lit2;->d:Lp12;

    return-void
.end method
