.class public final LN/F;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/F;

.field private static final b:Lr/r0;

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LN/F;

    invoke-direct {v0}, LN/F;-><init>()V

    sput-object v0, LN/F;->a:LN/F;

    new-instance v0, Lr/r0;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/16 v2, 0x100

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lr/r0;-><init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/F;->b:Lr/r0;

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/F;->c:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)J
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:758)"

    const v2, -0x2f023db4

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LN/f0;->a:LN/f0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object p1

    invoke-virtual {p1}, LN/m;->n()J

    move-result-wide p1

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-wide p1
.end method

.method public final b()F
    .locals 1

    sget v0, LN/F;->c:F

    return v0
.end method

.method public final c(LT/l;I)J
    .locals 8

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:777)"

    const v2, 0x24ca1eee

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

.method public final d(LT/l;I)Lm0/i1;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:770)"

    const v2, 0x79b37362

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LN/f0;->a:LN/f0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LN/f0;->b(LT/l;I)LN/F0;

    move-result-object p1

    invoke-virtual {p1}, LN/F0;->a()LE/a;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p1
.end method
