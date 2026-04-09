.class public final enum LTe/N;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTe/N$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LTe/N;

.field public static final enum COMPARE_1:LTe/N;

.field public static final enum COMPARE_2:LTe/N;

.field public static final enum COMPARE_3:LTe/N;

.field public static final enum COMPARE_4:LTe/N;

.field public static final enum COMPARE_5:LTe/N;

.field public static final enum PRIMARY:LTe/N;

.field public static final enum SECONDARY:LTe/N;


# direct methods
.method private static final synthetic $values()[LTe/N;
    .locals 7

    sget-object v0, LTe/N;->PRIMARY:LTe/N;

    sget-object v1, LTe/N;->COMPARE_1:LTe/N;

    sget-object v2, LTe/N;->COMPARE_2:LTe/N;

    sget-object v3, LTe/N;->COMPARE_3:LTe/N;

    sget-object v4, LTe/N;->COMPARE_4:LTe/N;

    sget-object v5, LTe/N;->COMPARE_5:LTe/N;

    sget-object v6, LTe/N;->SECONDARY:LTe/N;

    filled-new-array/range {v0 .. v6}, [LTe/N;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LTe/N;

    const-string v1, "PRIMARY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LTe/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTe/N;->PRIMARY:LTe/N;

    new-instance v0, LTe/N;

    const-string v1, "COMPARE_1"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LTe/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTe/N;->COMPARE_1:LTe/N;

    new-instance v0, LTe/N;

    const-string v1, "COMPARE_2"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LTe/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTe/N;->COMPARE_2:LTe/N;

    new-instance v0, LTe/N;

    const-string v1, "COMPARE_3"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LTe/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTe/N;->COMPARE_3:LTe/N;

    new-instance v0, LTe/N;

    const-string v1, "COMPARE_4"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LTe/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTe/N;->COMPARE_4:LTe/N;

    new-instance v0, LTe/N;

    const-string v1, "COMPARE_5"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LTe/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTe/N;->COMPARE_5:LTe/N;

    new-instance v0, LTe/N;

    const-string v1, "SECONDARY"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LTe/N;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTe/N;->SECONDARY:LTe/N;

    invoke-static {}, LTe/N;->$values()[LTe/N;

    move-result-object v0

    sput-object v0, LTe/N;->$VALUES:[LTe/N;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LTe/N;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, LTe/N;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LTe/N;
    .locals 1

    const-class v0, LTe/N;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LTe/N;

    return-object p0
.end method

.method public static values()[LTe/N;
    .locals 1

    sget-object v0, LTe/N;->$VALUES:[LTe/N;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTe/N;

    return-object v0
.end method


# virtual methods
.method public final getColor-vNxB06k(Lma/a;)J
    .locals 2

    const-string v0, "palette"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LTe/N$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$b;->i()J

    move-result-wide v0

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->e()Lr9/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$a;->f()J

    move-result-wide v0

    goto :goto_0

    :pswitch_2
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->a()Lr9/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$a;->h()J

    move-result-wide v0

    goto :goto_0

    :pswitch_3
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->f()Lr9/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$a;->f()J

    move-result-wide v0

    goto :goto_0

    :pswitch_4
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->k()Lr9/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$a;->f()J

    move-result-wide v0

    goto :goto_0

    :pswitch_5
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->a()Lr9/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$a;->f()J

    move-result-wide v0

    goto :goto_0

    :pswitch_6
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->j()J

    move-result-wide v0

    :goto_0
    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
