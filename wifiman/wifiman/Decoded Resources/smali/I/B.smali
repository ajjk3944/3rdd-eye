.class public final LI/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/B;

    invoke-direct {v0}, LI/B;-><init>()V

    sput-object v0, LI/B;->a:LI/B;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;
    .locals 2

    invoke-static {}, LI/w;->a()Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    move-result-object v0

    invoke-static {p1}, Lm0/b1;->c(Ll0/i;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v0, v1}, LI/x;->a(Landroid/view/inputmethod/EditorBoundsInfo$Builder;Landroid/graphics/RectF;)Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    move-result-object v0

    invoke-static {p1}, Lm0/b1;->c(Ll0/i;)Landroid/graphics/RectF;

    move-result-object p1

    invoke-static {v0, p1}, LI/y;->a(Landroid/view/inputmethod/EditorBoundsInfo$Builder;Landroid/graphics/RectF;)Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    move-result-object p1

    invoke-static {p1}, LI/z;->a(Landroid/view/inputmethod/EditorBoundsInfo$Builder;)Landroid/view/inputmethod/EditorBoundsInfo;

    move-result-object p1

    invoke-static {p0, p1}, LI/A;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroid/view/inputmethod/EditorBoundsInfo;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    move-result-object p0

    return-object p0
.end method
