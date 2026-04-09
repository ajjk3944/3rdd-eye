.class public final LL9/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL9/w;

.field private static final b:F

.field private static final c:F

.field private static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL9/w;

    invoke-direct {v0}, LL9/w;-><init>()V

    sput-object v0, LL9/w;->a:LL9/w;

    const/16 v0, 0x38

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LL9/w;->b:F

    const/16 v0, 0x40

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LL9/w;->c:F

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LL9/w;->d:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LL9/w;FFILjava/lang/Object;)Lz/N;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget p1, LL9/w;->d:F

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget p2, LL9/w;->d:F

    :cond_1
    invoke-virtual {p0, p1, p2}, LL9/w;->a(FF)Lz/N;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(FF)Lz/N;
    .locals 6

    const/16 v4, 0xa

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move v0, p1

    move v2, p2

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/o;->e(FFFFILjava/lang/Object;)Lz/N;

    move-result-object p1

    return-object p1
.end method

.method public final c()F
    .locals 1

    sget v0, LL9/w;->c:F

    return v0
.end method

.method public final d()F
    .locals 1

    sget v0, LL9/w;->b:F

    return v0
.end method

.method public final e(LT/l;I)J
    .locals 3

    const v0, -0x6dadbfae

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.toolbar.UiToolbarDefaults.<get-defaultBackground> (UiToolbarDefaults.kt:13)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p2}, Lm0/v0$a;->d()J

    move-result-wide v0

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method
