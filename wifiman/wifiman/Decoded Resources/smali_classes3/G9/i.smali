.class public abstract LG9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ls9/a;FJLT/l;II)Lmh/q;
    .locals 2

    const-string/jumbo v0, "icon"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0xe4d6cb4

    invoke-interface {p4, v0}, LT/l;->U(I)V

    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_0

    const/16 p1, 0x18

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    :cond_0
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_1

    sget-object p2, Lla/a;->a:Lla/a;

    sget p3, Lla/a;->b:I

    invoke-virtual {p2, p4, p3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->c()Lma/a$c;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$c;->a()J

    move-result-wide p2

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result p6

    if-eqz p6, :cond_2

    const/4 p6, -0x1

    const-string/jumbo v1, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetLeadingIcon (UiSettingsWidgetLeadingIcon.kt:23)"

    invoke-static {v0, p5, p6, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance p5, LG9/i$a;

    invoke-direct {p5, p0, p1, p2, p3}, LG9/i$a;-><init>(Ls9/a;FJ)V

    const/16 p0, 0x36

    const p1, 0x38cd8f69

    const/4 p2, 0x1

    invoke-static {p1, p2, p5, p4, p0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p4}, LT/l;->J()V

    return-object p0
.end method
