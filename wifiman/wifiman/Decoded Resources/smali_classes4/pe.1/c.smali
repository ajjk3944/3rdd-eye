.class public final Lpe/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpe/c$a;
    }
.end annotation


# static fields
.field public static final a:Lpe/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpe/c;

    invoke-direct {v0}, Lpe/c;-><init>()V

    sput-object v0, Lpe/c;->a:Lpe/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lke/b;II)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 4

    const-string v0, "mcsType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpe/c$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    rem-int/lit8 v0, p2, 0x8

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    move v0, p2

    :goto_0
    packed-switch v0, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "invalid mcs index \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\' got from ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->BPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_1
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->BPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_2
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_4096:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_3
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_4096:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_4
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_1024:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_5
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_1024:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_6
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_256:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto :goto_1

    :pswitch_7
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_256:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto :goto_1

    :pswitch_8
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_64:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto :goto_1

    :pswitch_9
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_64:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto :goto_1

    :pswitch_a
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_64:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_2_3:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto :goto_1

    :pswitch_b
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_16:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto :goto_1

    :pswitch_c
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_16:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto :goto_1

    :pswitch_d
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto :goto_1

    :pswitch_e
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    goto :goto_1

    :pswitch_f
    sget-object p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    sget-object p2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->BPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {p1, p2, v0, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public final b(LS8/a;)Lke/b;
    .locals 1

    const-string v0, "ieeeMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpe/c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const/4 p1, 0x0

    goto :goto_0

    :pswitch_1
    sget-object p1, Lke/b;->HT:Lke/b;

    goto :goto_0

    :pswitch_2
    sget-object p1, Lke/b;->VHT:Lke/b;

    goto :goto_0

    :pswitch_3
    sget-object p1, Lke/b;->HE:Lke/b;

    goto :goto_0

    :pswitch_4
    sget-object p1, Lke/b;->EHT:Lke/b;

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
