.class public final Ls/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/V;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls/X$a;
    }
.end annotation


# static fields
.field public static final b:Ls/X;

.field private static final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls/X;

    invoke-direct {v0}, Ls/X;-><init>()V

    sput-object v0, Ls/X;->b:Ls/X;

    const/4 v0, 0x1

    sput-boolean v0, Ls/X;->c:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    sget-boolean v0, Ls/X;->c:Z

    return v0
.end method

.method public bridge synthetic b(Landroid/view/View;ZJFFZLY0/d;F)Ls/U;
    .locals 0

    invoke-virtual/range {p0 .. p9}, Ls/X;->c(Landroid/view/View;ZJFFZLY0/d;F)Ls/X$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/view/View;ZJFFZLY0/d;F)Ls/X$a;
    .locals 2

    if-eqz p2, :cond_0

    new-instance p2, Ls/X$a;

    new-instance p3, Landroid/widget/Magnifier;

    invoke-direct {p3, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    invoke-direct {p2, p3}, Ls/X$a;-><init>(Landroid/widget/Magnifier;)V

    return-object p2

    :cond_0
    invoke-interface {p8, p3, p4}, LY0/d;->K1(J)J

    move-result-wide p2

    invoke-interface {p8, p5}, LY0/d;->d1(F)F

    move-result p4

    invoke-interface {p8, p6}, LY0/d;->d1(F)F

    move-result p5

    new-instance p6, Landroid/widget/Magnifier$Builder;

    invoke-direct {p6, p1}, Landroid/widget/Magnifier$Builder;-><init>(Landroid/view/View;)V

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p1, p2, v0

    if-eqz p1, :cond_1

    invoke-static {p2, p3}, Ll0/m;->i(J)F

    move-result p1

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    invoke-static {p2, p3}, Ll0/m;->g(J)F

    move-result p2

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p2

    invoke-virtual {p6, p1, p2}, Landroid/widget/Magnifier$Builder;->setSize(II)Landroid/widget/Magnifier$Builder;

    :cond_1
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p6, p4}, Landroid/widget/Magnifier$Builder;->setCornerRadius(F)Landroid/widget/Magnifier$Builder;

    :cond_2
    invoke-static {p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p6, p5}, Landroid/widget/Magnifier$Builder;->setElevation(F)Landroid/widget/Magnifier$Builder;

    :cond_3
    invoke-static {p9}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p6, p9}, Landroid/widget/Magnifier$Builder;->setInitialZoom(F)Landroid/widget/Magnifier$Builder;

    :cond_4
    invoke-virtual {p6, p7}, Landroid/widget/Magnifier$Builder;->setClippingEnabled(Z)Landroid/widget/Magnifier$Builder;

    invoke-virtual {p6}, Landroid/widget/Magnifier$Builder;->build()Landroid/widget/Magnifier;

    move-result-object p1

    new-instance p2, Ls/X$a;

    invoke-direct {p2, p1}, Ls/X$a;-><init>(Landroid/widget/Magnifier;)V

    return-object p2
.end method
