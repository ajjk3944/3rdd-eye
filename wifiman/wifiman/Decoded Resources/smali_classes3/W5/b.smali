.class public abstract LW5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LT/l;I)LW5/a;
    .locals 3

    const v0, -0x4fd0d9a

    invoke-interface {p0, v0}, LT/l;->e(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.patrykandpatrick.vico.compose.style.<get-currentChartStyle> (ChartStyle.kt:271)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, LW5/c;->a:LW5/c;

    const/4 v0, 0x6

    invoke-virtual {p1, p0, v0}, LW5/c;->a(LT/l;I)LW5/a;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p0}, LT/l;->P()V

    return-object p1
.end method
