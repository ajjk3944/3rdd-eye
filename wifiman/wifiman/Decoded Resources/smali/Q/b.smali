.class public final LQ/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ/b;

.field private static final b:F

.field private static final c:F

.field private static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ/b;

    invoke-direct {v0}, LQ/b;-><init>()V

    sput-object v0, LQ/b;->a:LQ/b;

    sget-object v0, LS/g;->a:LS/g;

    invoke-virtual {v0}, LS/g;->b()F

    move-result v0

    sput v0, LQ/b;->b:F

    const/16 v0, 0x38

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LQ/b;->c:F

    const/16 v0, 0x280

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LQ/b;->d:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    sget v0, LQ/b;->b:F

    return v0
.end method

.method public final b(LT/l;I)Lm0/i1;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:295)"

    const v2, 0x645c7ef6

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/g;->a:LS/g;

    invoke-virtual {p2}, LS/g;->a()LS/e;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LQ/v;->d(LS/e;LT/l;I)Lm0/i1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p1
.end method
