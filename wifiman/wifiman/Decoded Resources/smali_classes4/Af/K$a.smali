.class final LAf/K$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAf/K;->c(Landroidx/compose/ui/e;LAf/H;Lmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LAf/H;


# direct methods
.method constructor <init>(LAf/H;)V
    .locals 0

    iput-object p1, p0, LAf/K$a;->a:LAf/H;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 7

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.wifi.component.WmwStatusButton.<anonymous>.<anonymous> (WmwStatusButton.kt:80)"

    const v1, 0x764fac70

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, LAf/K$a;->a:LAf/H;

    instance-of p3, p1, LAf/H$a;

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    check-cast p1, LAf/H$a;

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, LAf/H$a;->a()Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    :goto_1
    move v2, p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    iget-object p1, p0, LAf/K$a;->a:LAf/H;

    instance-of p3, p1, LAf/H$a;

    if-eqz p3, :cond_3

    move-object v0, p1

    check-cast v0, LAf/H$a;

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, LAf/H$a;->b()Z

    move-result p1

    :goto_3
    move v3, p1

    goto :goto_4

    :cond_4
    const/4 p1, 0x0

    goto :goto_3

    :goto_4
    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object v4, p2

    invoke-static/range {v1 .. v6}, LJf/d;->c(Landroidx/compose/ui/e;FZLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LAf/K$a;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
