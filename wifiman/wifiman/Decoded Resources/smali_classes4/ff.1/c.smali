.class public abstract Lff/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lff/c$a;
    }
.end annotation


# direct methods
.method public static final a(Lff/a;LT/l;I)J
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x17b1c381

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.color (Speedtest.kt:23)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lff/c$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    if-eq p0, p2, :cond_2

    const/4 p2, 0x2

    if-ne p0, p2, :cond_1

    const p0, -0x4cdfd274

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->k()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const p0, -0x4cdfe343

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    const p0, -0x4cdfda74

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->a()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method
