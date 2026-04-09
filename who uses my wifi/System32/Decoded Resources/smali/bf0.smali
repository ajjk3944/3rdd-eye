.class public final Lbf0;
.super Lv61;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final l:Lni0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbf0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2, v1, v1}, Lbf0;-><init>(Lu61;FLuk1;Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-static {v1, v0}, Lni0;->a(ILmi0;)Lni0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lbf0;->l:Lni0;

    .line 14
    .line 15
    const/high16 v1, 0x3f000000    # 0.5f

    .line 16
    .line 17
    iput v1, v0, Lni0;->f:F

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lu61;FLuk1;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lmi0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    new-array v0, v0, [F

    .line 6
    .line 7
    iput-object v0, p0, Lv61;->g:[F

    .line 8
    .line 9
    iput-object p1, p0, Lv61;->h:Lu61;

    .line 10
    .line 11
    iput p2, p0, Lv61;->i:F

    .line 12
    .line 13
    iput-object p3, p0, Lv61;->j:Luk1;

    .line 14
    .line 15
    iput-object p4, p0, Lv61;->k:Landroid/view/View;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Lmi0;
    .locals 5

    .line 1
    new-instance v0, Lbf0;

    .line 2
    .line 3
    iget-object v1, p0, Lv61;->h:Lu61;

    .line 4
    .line 5
    iget v2, p0, Lv61;->i:F

    .line 6
    .line 7
    iget-object v3, p0, Lv61;->j:Luk1;

    .line 8
    .line 9
    iget-object v4, p0, Lv61;->k:Landroid/view/View;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Lbf0;-><init>(Lu61;FLuk1;Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv61;->g:[F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lv61;->i:F

    .line 5
    .line 6
    aput v2, v0, v1

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    aput v2, v0, v1

    .line 11
    .line 12
    iget-object v1, p0, Lv61;->j:Luk1;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Luk1;->e([F)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lv61;->h:Lu61;

    .line 18
    .line 19
    iget-object v2, p0, Lv61;->k:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, Lu61;->a([FLandroid/view/View;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lbf0;->l:Lni0;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lni0;->c(Lmi0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
