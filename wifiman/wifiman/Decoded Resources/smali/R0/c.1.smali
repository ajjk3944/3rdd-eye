.class final LR0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LR0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR0/c;

    invoke-direct {v0}, LR0/c;-><init>()V

    sput-object v0, LR0/c;->a:LR0/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;
    .locals 5

    invoke-virtual {p2}, Ll0/i;->u()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Ll0/i;->n()F

    move-result v0

    invoke-virtual {p1, v0}, LL0/M;->r(F)I

    move-result v0

    invoke-virtual {p2}, Ll0/i;->e()F

    move-result p2

    invoke-virtual {p1, p2}, LL0/M;->r(F)I

    move-result p2

    if-gt v0, p2, :cond_0

    :goto_0
    invoke-virtual {p1, v0}, LL0/M;->s(I)F

    move-result v1

    invoke-virtual {p1, v0}, LL0/M;->v(I)F

    move-result v2

    invoke-virtual {p1, v0}, LL0/M;->t(I)F

    move-result v3

    invoke-virtual {p1, v0}, LL0/M;->m(I)F

    move-result v4

    invoke-static {p0, v1, v2, v3, v4}, LI/C;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;FFFF)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    if-eq v0, p2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method
