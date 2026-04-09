.class public final Lp6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/f$a;
    }
.end annotation


# static fields
.field public static final a:Lp6/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp6/f;

    invoke-direct {v0}, Lp6/f;-><init>()V

    sput-object v0, Lp6/f;->a:Lp6/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FFFFLp6/b;Landroid/graphics/Path;)V
    .locals 1

    const-string/jumbo v0, "cornerLocation"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lp6/f$a;->a:[I

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    move-result p5

    aget p5, v0, p5

    const/4 v0, 0x1

    if-eq p5, v0, :cond_3

    const/4 v0, 0x2

    if-eq p5, v0, :cond_2

    const/4 v0, 0x3

    if-eq p5, v0, :cond_1

    const/4 p1, 0x4

    if-ne p5, p1, :cond_0

    invoke-virtual {p6, p3, p2}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p6, p1, p4}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_0

    :cond_2
    invoke-virtual {p6, p3, p2}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_0

    :cond_3
    invoke-virtual {p6, p1, p4}, Landroid/graphics/Path;->lineTo(FF)V

    :goto_0
    return-void
.end method
