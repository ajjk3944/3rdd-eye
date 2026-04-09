.class public final Lmt0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Landroidx/appcompat/widget/SearchView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmt0;->a:Landroidx/appcompat/widget/SearchView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Lmt0;->a:Landroidx/appcompat/widget/SearchView;

    .line 2
    .line 3
    iget-object p2, p1, Landroidx/appcompat/widget/SearchView;->u:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 4
    .line 5
    iget-object p3, p1, Landroidx/appcompat/widget/SearchView;->C:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    const/4 p5, 0x1

    .line 12
    if-le p4, p5, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p4

    .line 18
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    iget-object p6, p1, Landroidx/appcompat/widget/SearchView;->w:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p6}, Landroid/view/View;->getPaddingLeft()I

    .line 25
    .line 26
    .line 27
    move-result p6

    .line 28
    new-instance p7, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {p7}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-boolean p8, Lg71;->a:Z

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 36
    .line 37
    .line 38
    move-result p8

    .line 39
    const/4 p9, 0x0

    .line 40
    if-ne p8, p5, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move p5, p9

    .line 44
    :goto_0
    iget-boolean p1, p1, Landroidx/appcompat/widget/SearchView;->S:Z

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    const p1, 0x7f070029

    .line 49
    .line 50
    .line 51
    invoke-virtual {p4, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    const p8, 0x7f07002a

    .line 56
    .line 57
    .line 58
    invoke-virtual {p4, p8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    add-int p9, p4, p1

    .line 63
    .line 64
    :cond_1
    invoke-virtual {p2}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1, p7}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 69
    .line 70
    .line 71
    if-eqz p5, :cond_2

    .line 72
    .line 73
    iget p1, p7, Landroid/graphics/Rect;->left:I

    .line 74
    .line 75
    neg-int p1, p1

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    iget p1, p7, Landroid/graphics/Rect;->left:I

    .line 78
    .line 79
    add-int/2addr p1, p9

    .line 80
    sub-int p1, p6, p1

    .line 81
    .line 82
    :goto_1
    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    iget p3, p7, Landroid/graphics/Rect;->left:I

    .line 90
    .line 91
    add-int/2addr p1, p3

    .line 92
    iget p3, p7, Landroid/graphics/Rect;->right:I

    .line 93
    .line 94
    add-int/2addr p1, p3

    .line 95
    add-int/2addr p1, p9

    .line 96
    sub-int/2addr p1, p6

    .line 97
    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    .line 98
    .line 99
    .line 100
    :cond_3
    return-void
.end method
