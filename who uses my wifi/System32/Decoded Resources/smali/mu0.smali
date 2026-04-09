.class public final Lmu0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f:Ld60;

.field public final g:Lt50;

.field public h:Z


# direct methods
.method public constructor <init>(Ld60;Lt50;)V
    .locals 1

    .line 1
    const-string v0, "registry"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "event"

    .line 7
    .line 8
    invoke-static {p2, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lmu0;->f:Ld60;

    .line 15
    .line 16
    iput-object p2, p0, Lmu0;->g:Lt50;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lmu0;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lmu0;->f:Ld60;

    .line 6
    .line 7
    iget-object v1, p0, Lmu0;->g:Lt50;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ld60;->d(Lt50;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lmu0;->h:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method
