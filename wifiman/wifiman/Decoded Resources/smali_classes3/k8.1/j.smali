.class public abstract Lk8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk8/j$a;
    }
.end annotation


# direct methods
.method public static final a(Lcom/ubnt/usurvey/product/l;)Ls9/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk8/j$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    goto :goto_0

    :pswitch_0
    sget-object p0, LPe/a;->a:LPe/a;

    invoke-virtual {p0}, LPe/a;->W()Ls9/b;

    move-result-object p0

    goto :goto_0

    :pswitch_1
    sget-object p0, LPe/a;->a:LPe/a;

    invoke-virtual {p0}, LPe/a;->V()Ls9/b;

    move-result-object p0

    goto :goto_0

    :pswitch_2
    sget-object p0, LPe/a;->a:LPe/a;

    invoke-virtual {p0}, LPe/a;->T()Ls9/b;

    move-result-object p0

    :goto_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
