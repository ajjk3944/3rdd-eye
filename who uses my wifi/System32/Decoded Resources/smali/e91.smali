.class public final Le91;
.super Ld91;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld91;-><init>()V

    return-void
.end method

.method public constructor <init>(Lo91;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ld91;-><init>(Lo91;)V

    return-void
.end method


# virtual methods
.method public c(ILy20;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld91;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-static {p1}, Ln91;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p2}, Ly20;->d()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {v0, p1, p2}, Lu0;->s(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
