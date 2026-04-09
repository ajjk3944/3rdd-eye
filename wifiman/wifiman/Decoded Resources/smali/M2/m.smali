.class public LM2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LC2/g;)Z
    .locals 0

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1, p2}, LM2/m;->d(Landroid/graphics/drawable/Drawable;LC2/g;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILC2/g;)LE2/c;
    .locals 0

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1, p2, p3, p4}, LM2/m;->c(Landroid/graphics/drawable/Drawable;IILC2/g;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/graphics/drawable/Drawable;IILC2/g;)LE2/c;
    .locals 0

    invoke-static {p1}, LM2/k;->f(Landroid/graphics/drawable/Drawable;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/graphics/drawable/Drawable;LC2/g;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
