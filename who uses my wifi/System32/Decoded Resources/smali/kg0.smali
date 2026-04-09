.class public final Lkg0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:Z

.field public e:I

.field public f:Ll51;

.field public g:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkg0;->a:Z

    const/4 v1, -0x1

    iput v1, p0, Lkg0;->b:I

    iput v0, p0, Lkg0;->c:I

    iput-boolean v0, p0, Lkg0;->d:Z

    const/4 v1, 0x1

    iput v1, p0, Lkg0;->e:I

    iput-boolean v0, p0, Lkg0;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(Lkg0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-boolean v0, p1, Lkg0;->a:Z

    .line 3
    iput-boolean v0, p0, Lkg0;->a:Z

    .line 4
    iget v0, p1, Lkg0;->b:I

    .line 5
    iput v0, p0, Lkg0;->b:I

    .line 6
    iget v0, p1, Lkg0;->c:I

    .line 7
    iput v0, p0, Lkg0;->c:I

    .line 8
    iget-boolean v0, p1, Lkg0;->d:Z

    .line 9
    iput-boolean v0, p0, Lkg0;->d:Z

    .line 10
    iget v0, p1, Lkg0;->e:I

    .line 11
    iput v0, p0, Lkg0;->e:I

    .line 12
    iget-object v0, p1, Lkg0;->f:Ll51;

    .line 13
    iput-object v0, p0, Lkg0;->f:Ll51;

    .line 14
    iget-boolean p1, p1, Lkg0;->g:Z

    .line 15
    iput-boolean p1, p0, Lkg0;->g:Z

    return-void
.end method
