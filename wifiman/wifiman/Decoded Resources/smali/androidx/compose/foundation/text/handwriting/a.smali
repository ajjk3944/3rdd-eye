.class public abstract Landroidx/compose/foundation/text/handwriting/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Landroidx/compose/foundation/text/handwriting/a;->a:F

    const/16 v0, 0xa

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Landroidx/compose/foundation/text/handwriting/a;->b:F

    return-void
.end method

.method public static final a()F
    .locals 1

    sget v0, Landroidx/compose/foundation/text/handwriting/a;->b:F

    return v0
.end method

.method public static final b()F
    .locals 1

    sget v0, Landroidx/compose/foundation/text/handwriting/a;->a:F

    return v0
.end method

.method public static final c(Landroidx/compose/ui/e;ZLmh/a;)Landroidx/compose/ui/e;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {}, LG/c;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroidx/compose/foundation/text/handwriting/StylusHandwritingElementWithNegativePadding;

    invoke-direct {p1, p2}, Landroidx/compose/foundation/text/handwriting/StylusHandwritingElementWithNegativePadding;-><init>(Lmh/a;)V

    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    sget p1, Landroidx/compose/foundation/text/handwriting/a;->b:F

    sget p2, Landroidx/compose/foundation/text/handwriting/a;->a:F

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object p0

    :cond_0
    return-object p0
.end method
