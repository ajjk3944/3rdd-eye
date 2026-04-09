.class public abstract LM/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:LJ0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x19

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    sput v1, LM/w;->a:F

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LM/w;->b:F

    new-instance v0, LJ0/v;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "SelectionHandleInfo"

    invoke-direct {v0, v3, v1, v2, v1}, LJ0/v;-><init>(Ljava/lang/String;Lmh/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LM/w;->c:LJ0/v;

    return-void
.end method

.method public static final a(J)J
    .locals 1

    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v0

    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result p0

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float/2addr p0, p1

    invoke-static {v0, p0}, Ll0/h;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final b()F
    .locals 1

    sget v0, LM/w;->b:F

    return v0
.end method

.method public static final c()F
    .locals 1

    sget v0, LM/w;->a:F

    return v0
.end method

.method public static final d()LJ0/v;
    .locals 1

    sget-object v0, LM/w;->c:LJ0/v;

    return-object v0
.end method

.method public static final e(LW0/i;Z)Z
    .locals 1

    sget-object v0, LW0/i;->Ltr:LW0/i;

    if-ne p0, v0, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    sget-object v0, LW0/i;->Rtl:LW0/i;

    if-ne p0, v0, :cond_2

    if-eqz p1, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final f(ZLW0/i;Z)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p1, p2}, LM/w;->e(LW0/i;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LM/w;->e(LW0/i;Z)Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
