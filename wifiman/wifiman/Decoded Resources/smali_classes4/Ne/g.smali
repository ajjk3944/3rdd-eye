.class public abstract LNe/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNe/g$a;
    }
.end annotation


# direct methods
.method public static final a(Le8/a;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LNe/g$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget p0, Lm8/a;->e:I

    goto :goto_0

    :pswitch_1
    sget p0, Lm8/a;->b:I

    goto :goto_0

    :pswitch_2
    sget p0, Lm8/a;->a:I

    goto :goto_0

    :pswitch_3
    sget p0, Lm8/a;->c:I

    goto :goto_0

    :pswitch_4
    sget p0, Lm8/a;->f:I

    goto :goto_0

    :pswitch_5
    sget p0, Lm8/a;->d:I

    goto :goto_0

    :pswitch_6
    sget p0, Lm8/a;->g:I

    goto :goto_0

    :pswitch_7
    sget p0, Lm8/a;->h:I

    :goto_0
    return p0

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
