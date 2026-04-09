.class public LO2/e;
.super LM2/j;
.source "SourceFile"

# interfaces
.implements LE2/b;


# direct methods
.method public constructor <init>(LO2/c;)V
    .locals 0

    invoke-direct {p0, p1}, LM2/j;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LM2/j;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, LO2/c;

    invoke-virtual {v0}, LO2/c;->i()I

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LM2/j;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, LO2/c;

    invoke-virtual {v0}, LO2/c;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LM2/j;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, LO2/c;

    invoke-virtual {v0}, LO2/c;->stop()V

    iget-object v0, p0, LM2/j;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, LO2/c;

    invoke-virtual {v0}, LO2/c;->k()V

    return-void
.end method

.method public d()Ljava/lang/Class;
    .locals 1

    const-class v0, LO2/c;

    return-object v0
.end method
