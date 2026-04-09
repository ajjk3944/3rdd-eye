.class public abstract LA8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA8/a$a;
    }
.end annotation


# direct methods
.method public static final a(Lcom/ubnt/mlkit/product/a$b;)Ls9/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LA8/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    new-instance p0, Ls9/d$c;

    const-string/jumbo v0, "UDM_393"

    invoke-direct {p0, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :pswitch_1
    new-instance p0, Ls9/d$c;

    const-string v0, "AFI_P_e44"

    invoke-direct {p0, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :pswitch_2
    new-instance p0, Ls9/d$c;

    const-string v0, "AFI_ALN_R_cb7"

    invoke-direct {p0, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :pswitch_3
    new-instance p0, Ls9/d$c;

    const-string v0, "AFI_INS_R_eb2"

    invoke-direct {p0, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :pswitch_4
    new-instance p0, Ls9/d$c;

    const-string v0, "AFI_R_af7"

    invoke-direct {p0, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :pswitch_5
    new-instance p0, Ls9/d$b;

    const v0, 0x7f110215

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :pswitch_6
    new-instance p0, Ls9/d$b;

    const v0, 0x7f110216

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :pswitch_7
    new-instance p0, Ls9/d$b;

    const v0, 0x7f110214

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Lcom/ubnt/mlkit/product/a$b;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LA8/a;->d(Lcom/ubnt/mlkit/product/a$b;)Lcom/ubnt/usurvey/product/l;

    move-result-object p0

    invoke-static {p0}, Lcom/ubnt/usurvey/product/s;->a(Lcom/ubnt/usurvey/product/l;)Lcom/ubnt/usurvey/product/r;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/ubnt/usurvey/product/r;->b()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static final c(Lcom/ubnt/mlkit/product/a$b;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LA8/a;->d(Lcom/ubnt/mlkit/product/a$b;)Lcom/ubnt/usurvey/product/l;

    move-result-object p0

    invoke-static {p0}, Lcom/ubnt/usurvey/product/s;->a(Lcom/ubnt/usurvey/product/l;)Lcom/ubnt/usurvey/product/r;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/ubnt/usurvey/product/r;->a()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method private static final d(Lcom/ubnt/mlkit/product/a$b;)Lcom/ubnt/usurvey/product/l;
    .locals 1

    sget-object v0, LA8/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, Lcom/ubnt/usurvey/product/l;->UDM_393:Lcom/ubnt/usurvey/product/l;

    goto :goto_0

    :pswitch_1
    sget-object p0, Lcom/ubnt/usurvey/product/l;->AFI_P_e44:Lcom/ubnt/usurvey/product/l;

    goto :goto_0

    :pswitch_2
    sget-object p0, Lcom/ubnt/usurvey/product/l;->AFI_ALN_R_cb7:Lcom/ubnt/usurvey/product/l;

    goto :goto_0

    :pswitch_3
    sget-object p0, Lcom/ubnt/usurvey/product/l;->AFI_INS_R_eb2:Lcom/ubnt/usurvey/product/l;

    goto :goto_0

    :pswitch_4
    sget-object p0, Lcom/ubnt/usurvey/product/l;->AFI_R_af7:Lcom/ubnt/usurvey/product/l;

    goto :goto_0

    :pswitch_5
    sget-object p0, Lcom/ubnt/usurvey/product/l;->UFLHD_094:Lcom/ubnt/usurvey/product/l;

    goto :goto_0

    :pswitch_6
    sget-object p0, Lcom/ubnt/usurvey/product/l;->U7IWP_cc9:Lcom/ubnt/usurvey/product/l;

    goto :goto_0

    :pswitch_7
    sget-object p0, Lcom/ubnt/usurvey/product/l;->U7NHD_3e3:Lcom/ubnt/usurvey/product/l;

    :goto_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
