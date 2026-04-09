.class public final Ls/X$a;
.super Ls/W$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/widget/Magnifier;)V
    .locals 0

    invoke-direct {p0, p1}, Ls/W$a;-><init>(Landroid/widget/Magnifier;)V

    return-void
.end method


# virtual methods
.method public a(JJF)V
    .locals 1

    invoke-static {p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ls/W$a;->c()Landroid/widget/Magnifier;

    move-result-object v0

    invoke-virtual {v0, p5}, Landroid/widget/Magnifier;->setZoom(F)V

    :cond_0
    invoke-static {p3, p4}, Ll0/h;->c(J)Z

    move-result p5

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Ls/W$a;->c()Landroid/widget/Magnifier;

    move-result-object p5

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v0

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-static {p3, p4}, Ll0/g;->m(J)F

    move-result p2

    invoke-static {p3, p4}, Ll0/g;->n(J)F

    move-result p3

    invoke-virtual {p5, v0, p1, p2, p3}, Landroid/widget/Magnifier;->show(FFFF)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ls/W$a;->c()Landroid/widget/Magnifier;

    move-result-object p3

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p4

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-virtual {p3, p4, p1}, Landroid/widget/Magnifier;->show(FF)V

    :goto_0
    return-void
.end method
