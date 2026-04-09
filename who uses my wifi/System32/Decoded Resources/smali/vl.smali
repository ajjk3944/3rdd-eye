.class public final Lvl;
.super Llc0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final s:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lsu0;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llc0;-><init>(Lsu0;)V

    .line 2
    iput-object p2, p0, Lvl;->s:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Lvl;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Llc0;-><init>(Llc0;)V

    .line 4
    iget-object p1, p1, Lvl;->s:Landroid/graphics/RectF;

    iput-object p1, p0, Lvl;->s:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Lwl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnc0;-><init>(Llc0;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lwl;->M:Lvl;

    .line 7
    .line 8
    invoke-virtual {v0}, Lnc0;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
