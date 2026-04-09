.class public final Lt6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:F

.field private c:Landroid/graphics/Typeface;

.field private d:Landroid/text/TextUtils$TruncateAt;

.field private e:I

.field private f:Lm6/a;

.field private g:Landroid/graphics/Paint$Align;

.field private h:Lw6/c;

.field private i:Lw6/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x1000000

    iput v0, p0, Lt6/b$a;->a:I

    const/high16 v0, 0x41400000    # 12.0f

    iput v0, p0, Lt6/b$a;->b:F

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    iput-object v0, p0, Lt6/b$a;->d:Landroid/text/TextUtils$TruncateAt;

    const/4 v0, 0x1

    iput v0, p0, Lt6/b$a;->e:I

    sget-object v0, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    iput-object v0, p0, Lt6/b$a;->g:Landroid/graphics/Paint$Align;

    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object v0

    iput-object v0, p0, Lt6/b$a;->h:Lw6/c;

    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object v0

    iput-object v0, p0, Lt6/b$a;->i:Lw6/c;

    return-void
.end method


# virtual methods
.method public final a()Lt6/b;
    .locals 3

    new-instance v0, Lt6/b;

    invoke-direct {v0}, Lt6/b;-><init>()V

    iget v1, p0, Lt6/b$a;->a:I

    invoke-virtual {v0, v1}, Lt6/b;->w(I)V

    iget v1, p0, Lt6/b$a;->b:F

    invoke-virtual {v0, v1}, Lt6/b;->A(F)V

    iget-object v1, p0, Lt6/b$a;->c:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lt6/b;->B(Landroid/graphics/Typeface;)V

    iget-object v1, p0, Lt6/b$a;->d:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Lt6/b;->x(Landroid/text/TextUtils$TruncateAt;)V

    iget v1, p0, Lt6/b$a;->e:I

    invoke-virtual {v0, v1}, Lt6/b;->y(I)V

    iget-object v1, p0, Lt6/b$a;->f:Lm6/a;

    invoke-virtual {v0, v1}, Lt6/b;->v(Lm6/a;)V

    iget-object v1, p0, Lt6/b$a;->g:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Lt6/b;->z(Landroid/graphics/Paint$Align;)V

    invoke-virtual {v0}, Lt6/b;->j()Lw6/c;

    move-result-object v1

    iget-object v2, p0, Lt6/b$a;->h:Lw6/c;

    invoke-virtual {v1, v2}, Lw6/c;->j(Lw6/b;)Lw6/c;

    invoke-virtual {v0}, Lt6/b;->a()Lw6/c;

    move-result-object v1

    iget-object v2, p0, Lt6/b$a;->i:Lw6/c;

    invoke-virtual {v1, v2}, Lw6/c;->j(Lw6/b;)Lw6/c;

    return-object v0
.end method

.method public final b(Lm6/a;)V
    .locals 0

    iput-object p1, p0, Lt6/b$a;->f:Lm6/a;

    return-void
.end method

.method public final c(I)V
    .locals 0

    iput p1, p0, Lt6/b$a;->a:I

    return-void
.end method

.method public final d(Landroid/text/TextUtils$TruncateAt;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lt6/b$a;->d:Landroid/text/TextUtils$TruncateAt;

    return-void
.end method

.method public final e(I)V
    .locals 0

    iput p1, p0, Lt6/b$a;->e:I

    return-void
.end method

.method public final f(Lw6/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lt6/b$a;->i:Lw6/c;

    return-void
.end method

.method public final g(Lw6/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lt6/b$a;->h:Lw6/c;

    return-void
.end method

.method public final h(Landroid/graphics/Paint$Align;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lt6/b$a;->g:Landroid/graphics/Paint$Align;

    return-void
.end method

.method public final i(F)V
    .locals 0

    iput p1, p0, Lt6/b$a;->b:F

    return-void
.end method

.method public final j(Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p1, p0, Lt6/b$a;->c:Landroid/graphics/Typeface;

    return-void
.end method
