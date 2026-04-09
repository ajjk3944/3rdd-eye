.class public final Ll51;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(Lih3;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Lih3;->f:Z

    iput-boolean v0, p0, Ll51;->a:Z

    iget-boolean v0, p1, Lih3;->g:Z

    iput-boolean v0, p0, Ll51;->b:Z

    iget-boolean p1, p1, Lih3;->h:Z

    iput-boolean p1, p0, Ll51;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lk51;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    iget-boolean v0, p1, Lk51;->a:Z

    .line 2
    iput-boolean v0, p0, Ll51;->a:Z

    .line 3
    iget-boolean v0, p1, Lk51;->b:Z

    .line 4
    iput-boolean v0, p0, Ll51;->b:Z

    .line 5
    iget-boolean p1, p1, Lk51;->c:Z

    .line 6
    iput-boolean p1, p0, Ll51;->c:Z

    return-void
.end method
