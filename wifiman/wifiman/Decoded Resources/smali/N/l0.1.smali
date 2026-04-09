.class public final LN/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/l0;

.field private static final b:F

.field private static final c:Lr/i;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LN/l0;

    invoke-direct {v0}, LN/l0;-><init>()V

    sput-object v0, LN/l0;->a:LN/l0;

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/l0;->b:F

    invoke-static {}, Lr/G;->c()Lr/E;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/16 v3, 0x12c

    const/4 v4, 0x0

    invoke-static {v3, v4, v0, v1, v2}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v0

    sput-object v0, LN/l0;->c:Lr/i;

    const/16 v0, 0x8

    sput v0, LN/l0;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lr/i;
    .locals 1

    sget-object v0, LN/l0;->c:Lr/i;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LN/l0;->b:F

    return v0
.end method

.method public final c(LT/l;I)J
    .locals 8

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:539)"

    const v2, -0x6b5b7fe

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LN/f0;->a:LN/f0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object p1

    invoke-virtual {p1}, LN/m;->i()J

    move-result-wide v0

    const/16 v6, 0xe

    const/4 v7, 0x0

    const v2, 0x3ea3d70a    # 0.32f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide p1

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-wide p1
.end method
