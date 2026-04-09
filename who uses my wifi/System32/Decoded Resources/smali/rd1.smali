.class public final Lrd1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:Lzf4;

.field public final synthetic b:I

.field public final synthetic c:Lsd1;


# direct methods
.method public constructor <init>(Lsd1;Lzf4;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lrd1;->a:Lzf4;

    .line 5
    .line 6
    iput p3, p0, Lrd1;->b:I

    .line 7
    .line 8
    iput-object p1, p0, Lrd1;->c:Lsd1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lrd1;->c:Lsd1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "dropVideoBuffer"

    .line 7
    .line 8
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lrd1;->a:Lzf4;

    .line 12
    .line 13
    iget v2, p0, Lrd1;->b:I

    .line 14
    .line 15
    invoke-interface {v1, v2}, Lzf4;->I(I)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, v2, v1}, Lsd1;->u0(II)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
