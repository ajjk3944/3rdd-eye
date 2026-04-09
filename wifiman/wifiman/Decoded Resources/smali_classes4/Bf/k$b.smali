.class public final LBf/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBf/k;->l(LS8/c;LT/l;I)Lz6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBf/k$b$a;
    }
.end annotation


# instance fields
.field final synthetic a:LS8/c;


# direct methods
.method constructor <init>(LS8/c;)V
    .locals 0

    iput-object p1, p0, LBf/k$b;->a:LS8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FLk6/b;)Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "chartValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LBf/k$b;->a:LS8/c;

    sget-object v0, LBf/k$b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p2, v0, :cond_11

    const/4 v0, 0x2

    if-eq p2, v0, :cond_9

    const/4 v0, 0x3

    if-ne p2, v0, :cond_8

    const p2, 0x45ba1800    # 5955.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x45bf1800    # 6115.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const p2, 0x45c41800    # 6275.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    const p2, 0x45c91800    # 6435.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    const p2, 0x45ce1800    # 6595.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    const p2, 0x45d31800    # 6755.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_5

    goto :goto_0

    :cond_5
    const p2, 0x45d81800    # 6915.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_6

    goto :goto_0

    :cond_6
    const p2, 0x45dd1800    # 7075.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_7

    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_2

    :cond_7
    move-object p1, v1

    goto :goto_2

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    const p2, 0x45a19000    # 5170.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_a

    goto :goto_1

    :cond_a
    const p2, 0x45a41000    # 5250.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_b

    goto :goto_1

    :cond_b
    const p2, 0x45a6e000    # 5340.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_c

    goto :goto_1

    :cond_c
    const p2, 0x45ab4000    # 5480.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_d

    goto :goto_1

    :cond_d
    const p2, 0x45ae1000    # 5570.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_e

    goto :goto_1

    :cond_e
    const p2, 0x45b1d000    # 5690.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_f

    goto :goto_1

    :cond_f
    const p2, 0x45b4c800    # 5785.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_10

    goto :goto_1

    :cond_10
    const p2, 0x45b6a800    # 5845.0f

    cmpg-float p2, p1, p2

    if-nez p2, :cond_7

    :goto_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_2

    :cond_11
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    :goto_2
    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->c(I)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lvf/g;->a(I)Ljava/lang/String;

    move-result-object v1

    :cond_12
    if-eqz v1, :cond_13

    goto :goto_3

    :cond_13
    const-string v1, ""

    :goto_3
    return-object v1
.end method
