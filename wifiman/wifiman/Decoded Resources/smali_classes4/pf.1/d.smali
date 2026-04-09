.class public abstract Lpf/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lpf/b;LT/l;I)Lmh/r;
    .locals 3

    const-string v0, "vm"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x25d7d359

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.sso.account.accountPickerDialogs (SSOAccountPickerDialogs.kt:16)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance p2, Lpf/d$a;

    invoke-direct {p2, p0}, Lpf/d$a;-><init>(Lpf/b;)V

    const/16 p0, 0x36

    const v0, -0x28c111d4

    const/4 v1, 0x1

    invoke-static {v0, v1, p2, p1, p0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object p0
.end method
