.class final LD/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/d;->b(LE0/j;)LD/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/j;


# direct methods
.method constructor <init>(LE0/j;)V
    .locals 0

    iput-object p1, p0, LD/d$a;->a:LE0/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final r1(LC0/r;Lmh/a;Ldh/e;)Ljava/lang/Object;
    .locals 2

    iget-object p3, p0, LD/d$a;->a:LE0/j;

    invoke-static {p3}, LE0/l;->a(LE0/j;)Landroid/view/View;

    move-result-object p3

    invoke-static {p1}, LC0/s;->e(LC0/r;)J

    move-result-wide v0

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll0/i;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0, v1}, Ll0/i;->x(J)Ll0/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, LD/d;->a(Ll0/i;)Landroid/graphics/Rect;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p3, p1, p2}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
