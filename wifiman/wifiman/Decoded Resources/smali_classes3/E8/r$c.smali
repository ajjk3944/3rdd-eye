.class final LE8/r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/r;->y0(FLT7/c;)Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk8/d;

.field final synthetic b:LE8/r;


# direct methods
.method constructor <init>(Lk8/d;LE8/r;)V
    .locals 0

    iput-object p1, p0, LE8/r$c;->a:Lk8/d;

    iput-object p2, p0, LE8/r$c;->b:LE8/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lk8/d;D)D
    .locals 0

    invoke-static {p0, p1, p2}, LE8/r$c;->c(Lk8/d;D)D

    move-result-wide p0

    return-wide p0
.end method

.method private static final c(Lk8/d;D)D
    .locals 2

    invoke-virtual {p0}, Lk8/d;->i()D

    move-result-wide p1

    const-wide v0, 0x408f400000000000L    # 1000.0

    cmpg-double p1, p1, v0

    if-gez p1, :cond_0

    invoke-virtual {p0}, Lk8/d;->i()D

    move-result-wide p0

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    div-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    :goto_0
    long-to-double p0, p0

    mul-double/2addr p0, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lk8/d;->i()D

    move-result-wide p0

    div-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    goto :goto_0

    :goto_1
    return-wide p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 11

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1e15ad57

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ubnt.usurvey.ui.speedtest.SpeedtestInternetServerPickerVM.formattedDistanceText.<anonymous>.<anonymous> (SpeedtestInternetServerPickerVM.kt:144)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v3, p0, LE8/r$c;->a:Lk8/d;

    const p3, -0x4dd14fee

    invoke-interface {p2, p3}, LT/l;->U(I)V

    iget-object p3, p0, LE8/r$c;->a:Lk8/d;

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    iget-object v0, p0, LE8/r$c;->a:Lk8/d;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_2

    :cond_1
    new-instance v1, LE8/s;

    invoke-direct {v1, v0}, LE8/s;-><init>(Lk8/d;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v7, v1

    check-cast v7, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    iget-object p3, p0, LE8/r$c;->b:LE8/r;

    invoke-static {p3}, LE8/r;->u0(LE8/r;)Ljava/text/NumberFormat;

    move-result-object v8

    const-string/jumbo p3, "access$getNoFractionDigitsFormat$p(...)"

    invoke-static {v8, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v3 .. v10}, Lk8/d;->c(Lk8/d;Landroid/content/Context;ZZLmh/l;Ljava/text/NumberFormat;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LE8/r$c;->b(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
