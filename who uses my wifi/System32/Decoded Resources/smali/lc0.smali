.class public Llc0;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Lsu0;

.field public b:Ldy0;

.field public c:Ljr;

.field public d:Landroid/content/res/ColorStateList;

.field public e:Landroid/content/res/ColorStateList;

.field public f:Landroid/content/res/ColorStateList;

.field public g:Landroid/graphics/PorterDuff$Mode;

.field public h:Landroid/graphics/Rect;

.field public final i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:F

.field public n:F

.field public o:I

.field public p:I

.field public q:I

.field public r:Landroid/graphics/Paint$Style;


# direct methods
.method public constructor <init>(Llc0;)V
    .locals 2

    .line 18
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Llc0;->d:Landroid/content/res/ColorStateList;

    .line 20
    iput-object v0, p0, Llc0;->e:Landroid/content/res/ColorStateList;

    .line 21
    iput-object v0, p0, Llc0;->f:Landroid/content/res/ColorStateList;

    .line 22
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Llc0;->g:Landroid/graphics/PorterDuff$Mode;

    .line 23
    iput-object v0, p0, Llc0;->h:Landroid/graphics/Rect;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 24
    iput v0, p0, Llc0;->i:F

    .line 25
    iput v0, p0, Llc0;->j:F

    const/16 v0, 0xff

    .line 26
    iput v0, p0, Llc0;->l:I

    const/4 v0, 0x0

    .line 27
    iput v0, p0, Llc0;->m:F

    .line 28
    iput v0, p0, Llc0;->n:F

    const/4 v0, 0x0

    .line 29
    iput v0, p0, Llc0;->o:I

    .line 30
    iput v0, p0, Llc0;->p:I

    .line 31
    iput v0, p0, Llc0;->q:I

    .line 32
    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Llc0;->r:Landroid/graphics/Paint$Style;

    .line 33
    iget-object v0, p1, Llc0;->a:Lsu0;

    iput-object v0, p0, Llc0;->a:Lsu0;

    .line 34
    iget-object v0, p1, Llc0;->b:Ldy0;

    iput-object v0, p0, Llc0;->b:Ldy0;

    .line 35
    iget-object v0, p1, Llc0;->c:Ljr;

    iput-object v0, p0, Llc0;->c:Ljr;

    .line 36
    iget v0, p1, Llc0;->k:F

    iput v0, p0, Llc0;->k:F

    .line 37
    iget-object v0, p1, Llc0;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Llc0;->d:Landroid/content/res/ColorStateList;

    .line 38
    iget-object v0, p1, Llc0;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Llc0;->e:Landroid/content/res/ColorStateList;

    .line 39
    iget-object v0, p1, Llc0;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Llc0;->g:Landroid/graphics/PorterDuff$Mode;

    .line 40
    iget-object v0, p1, Llc0;->f:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Llc0;->f:Landroid/content/res/ColorStateList;

    .line 41
    iget v0, p1, Llc0;->l:I

    iput v0, p0, Llc0;->l:I

    .line 42
    iget v0, p1, Llc0;->i:F

    iput v0, p0, Llc0;->i:F

    .line 43
    iget v0, p1, Llc0;->q:I

    iput v0, p0, Llc0;->q:I

    .line 44
    iget v0, p1, Llc0;->o:I

    iput v0, p0, Llc0;->o:I

    .line 45
    iget v0, p1, Llc0;->j:F

    iput v0, p0, Llc0;->j:F

    .line 46
    iget v0, p1, Llc0;->m:F

    iput v0, p0, Llc0;->m:F

    .line 47
    iget v0, p1, Llc0;->n:F

    iput v0, p0, Llc0;->n:F

    .line 48
    iget v0, p1, Llc0;->p:I

    iput v0, p0, Llc0;->p:I

    .line 49
    iget-object v0, p1, Llc0;->r:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Llc0;->r:Landroid/graphics/Paint$Style;

    .line 50
    iget-object v0, p1, Llc0;->h:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    .line 51
    new-instance v0, Landroid/graphics/Rect;

    iget-object p1, p1, Llc0;->h:Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Llc0;->h:Landroid/graphics/Rect;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lsu0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Llc0;->d:Landroid/content/res/ColorStateList;

    .line 3
    iput-object v0, p0, Llc0;->e:Landroid/content/res/ColorStateList;

    .line 4
    iput-object v0, p0, Llc0;->f:Landroid/content/res/ColorStateList;

    .line 5
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Llc0;->g:Landroid/graphics/PorterDuff$Mode;

    .line 6
    iput-object v0, p0, Llc0;->h:Landroid/graphics/Rect;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    iput v1, p0, Llc0;->i:F

    .line 8
    iput v1, p0, Llc0;->j:F

    const/16 v1, 0xff

    .line 9
    iput v1, p0, Llc0;->l:I

    const/4 v1, 0x0

    .line 10
    iput v1, p0, Llc0;->m:F

    .line 11
    iput v1, p0, Llc0;->n:F

    const/4 v1, 0x0

    .line 12
    iput v1, p0, Llc0;->o:I

    .line 13
    iput v1, p0, Llc0;->p:I

    .line 14
    iput v1, p0, Llc0;->q:I

    .line 15
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v1, p0, Llc0;->r:Landroid/graphics/Paint$Style;

    .line 16
    iput-object p1, p0, Llc0;->a:Lsu0;

    .line 17
    iput-object v0, p0, Llc0;->c:Ljr;

    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Lnc0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnc0;-><init>(Llc0;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lnc0;->k:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Lnc0;->l:Z

    .line 10
    .line 11
    return-object v0
.end method
