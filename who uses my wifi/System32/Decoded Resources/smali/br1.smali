.class public final Lbr1;
.super Lxr2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:Landroid/content/Context;

.field public final synthetic g:Lus1;


# direct methods
.method public constructor <init>(Lus1;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lbr1;->f:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p1, p0, Lbr1;->g:Lus1;

    .line 4
    .line 5
    invoke-direct {p0}, Lxr2;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g0(Lnx2;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lbr1;->f:Landroid/content/Context;

    .line 5
    .line 6
    iget-object p1, p1, Lnx2;->g:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, Lbr1;->g:Lus1;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v1, v0, p1, v2, v2}, Lus1;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
