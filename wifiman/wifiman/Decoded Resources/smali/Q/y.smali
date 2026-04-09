.class public final LQ/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ/y;

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field public static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ/y;

    invoke-direct {v0}, LQ/y;-><init>()V

    sput-object v0, LQ/y;->a:LQ/y;

    sget-object v0, LS/j;->a:LS/j;

    invoke-virtual {v0}, LS/j;->a()F

    move-result v1

    sput v1, LQ/y;->b:F

    invoke-virtual {v0}, LS/j;->a()F

    move-result v1

    sput v1, LQ/y;->c:F

    sget-object v1, LS/i;->a:LS/i;

    invoke-virtual {v1}, LS/i;->a()F

    move-result v1

    sput v1, LQ/y;->d:F

    invoke-virtual {v0}, LS/j;->a()F

    move-result v0

    sput v0, LQ/y;->e:F

    sget-object v0, LS/h;->a:LS/h;

    invoke-virtual {v0}, LS/h;->a()F

    move-result v0

    sput v0, LQ/y;->f:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LQ/A;Lmh/a;Lr/i;Lr/z;LT/l;II)LQ/z;
    .locals 7

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    const/4 v5, 0x0

    const/4 v6, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p5

    invoke-static/range {v1 .. v6}, LQ/a;->b(FFFLT/l;II)LQ/A;

    move-result-object p1

    :cond_0
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_1

    sget-object p2, LQ/y$a;->a:LQ/y$a;

    :cond_1
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_2

    const/high16 p3, 0x43c80000    # 400.0f

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, p3, v2, v0, v2}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p3

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    const/4 p4, 0x0

    invoke-static {p5, p4}, Lq/z;->b(LT/l;I)Lr/z;

    move-result-object p4

    :cond_3
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_4

    const/4 p5, -0x1

    const-string p7, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1219)"

    const v0, 0x392a8052

    invoke-static {v0, p6, p5, p7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    new-instance p5, LQ/h;

    invoke-direct {p5, p1, p3, p4, p2}, LQ/h;-><init>(LQ/A;Lr/i;Lr/z;Lmh/a;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-object p5
.end method

.method public final b(LQ/A;Lmh/a;Lr/i;Lr/z;LT/l;II)LQ/z;
    .locals 7

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    const/4 v5, 0x0

    const/4 v6, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p5

    invoke-static/range {v1 .. v6}, LQ/a;->b(FFFLT/l;II)LQ/A;

    move-result-object p1

    :cond_0
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_1

    sget-object p2, LQ/y$b;->a:LQ/y$b;

    :cond_1
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_2

    const/high16 p3, 0x43c80000    # 400.0f

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, p3, v2, v0, v2}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p3

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    const/4 p4, 0x0

    invoke-static {p5, p4}, Lq/z;->b(LT/l;I)Lr/z;

    move-result-object p4

    :cond_3
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_4

    const/4 p5, -0x1

    const-string p7, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1252)"

    const v0, -0x68ba0c02

    invoke-static {v0, p6, p5, p7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    new-instance p5, LQ/i;

    invoke-direct {p5, p1, p3, p4, p2}, LQ/i;-><init>(LQ/A;Lr/i;Lr/z;Lmh/a;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-object p5
.end method
