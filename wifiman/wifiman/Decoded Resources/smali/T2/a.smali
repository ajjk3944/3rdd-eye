.class public abstract LT2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT2/d;


# instance fields
.field private final a:I

.field private final b:I

.field private c:Lcom/bumptech/glide/request/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/high16 v0, -0x80000000

    .line 1
    invoke-direct {p0, v0, v0}, LT2/a;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1, p2}, LW2/l;->t(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iput p1, p0, LT2/a;->a:I

    .line 5
    iput p2, p0, LT2/a;->b:I

    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " and height: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public final d(LT2/c;)V
    .locals 0

    return-void
.end method

.method public final e(Lcom/bumptech/glide/request/c;)V
    .locals 0

    iput-object p1, p0, LT2/a;->c:Lcom/bumptech/glide/request/c;

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public h(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public i(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public final j()Lcom/bumptech/glide/request/c;
    .locals 1

    iget-object v0, p0, LT2/a;->c:Lcom/bumptech/glide/request/c;

    return-object v0
.end method

.method public final l(LT2/c;)V
    .locals 2

    iget v0, p0, LT2/a;->a:I

    iget v1, p0, LT2/a;->b:I

    invoke-interface {p1, v0, v1}, LT2/c;->f(II)V

    return-void
.end method
