.class public final Lix;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:I

.field public b:Liw;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Lu50;

.field public i:Lu50;


# direct methods
.method public constructor <init>(ILiw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lix;->a:I

    .line 3
    iput-object p2, p0, Lix;->b:Liw;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lix;->c:Z

    .line 5
    sget-object p1, Lu50;->j:Lu50;

    iput-object p1, p0, Lix;->h:Lu50;

    .line 6
    iput-object p1, p0, Lix;->i:Lu50;

    return-void
.end method

.method public constructor <init>(ILiw;I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Lix;->a:I

    .line 9
    iput-object p2, p0, Lix;->b:Liw;

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lix;->c:Z

    .line 11
    sget-object p1, Lu50;->j:Lu50;

    iput-object p1, p0, Lix;->h:Lu50;

    .line 12
    iput-object p1, p0, Lix;->i:Lu50;

    return-void
.end method
