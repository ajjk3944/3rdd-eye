.class public final Ljg0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Z

.field public b:I

.field public c:Z

.field public d:I

.field public e:Ll51;

.field public f:Z

.field public g:Z

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljg0;->a:Z

    iput v0, p0, Ljg0;->b:I

    iput-boolean v0, p0, Ljg0;->c:Z

    const/4 v1, 0x1

    iput v1, p0, Ljg0;->d:I

    iput-boolean v0, p0, Ljg0;->f:Z

    iput-boolean v0, p0, Ljg0;->g:Z

    iput v0, p0, Ljg0;->h:I

    iput v1, p0, Ljg0;->i:I

    return-void
.end method

.method public synthetic constructor <init>(Ljg0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-boolean v0, p1, Ljg0;->a:Z

    .line 3
    iput-boolean v0, p0, Ljg0;->a:Z

    .line 4
    iget v0, p1, Ljg0;->b:I

    .line 5
    iput v0, p0, Ljg0;->b:I

    .line 6
    iget-boolean v0, p1, Ljg0;->c:Z

    .line 7
    iput-boolean v0, p0, Ljg0;->c:Z

    .line 8
    iget v0, p1, Ljg0;->d:I

    .line 9
    iput v0, p0, Ljg0;->d:I

    .line 10
    iget-object v0, p1, Ljg0;->e:Ll51;

    .line 11
    iput-object v0, p0, Ljg0;->e:Ll51;

    .line 12
    iget-boolean v0, p1, Ljg0;->f:Z

    .line 13
    iput-boolean v0, p0, Ljg0;->f:Z

    .line 14
    iget-boolean v0, p1, Ljg0;->g:Z

    .line 15
    iput-boolean v0, p0, Ljg0;->g:Z

    .line 16
    iget v0, p1, Ljg0;->h:I

    .line 17
    iput v0, p0, Ljg0;->h:I

    .line 18
    iget p1, p1, Ljg0;->i:I

    .line 19
    iput p1, p0, Ljg0;->i:I

    return-void
.end method
