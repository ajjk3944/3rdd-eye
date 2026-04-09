.class public final enum LQ1/h$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LQ1/h$b;

.field public static final enum BOOLEAN:LQ1/h$b;

.field public static final enum DOUBLE:LQ1/h$b;

.field public static final enum FLOAT:LQ1/h$b;

.field public static final enum INTEGER:LQ1/h$b;

.field public static final enum LONG:LQ1/h$b;

.field public static final enum STRING:LQ1/h$b;

.field public static final enum STRING_SET:LQ1/h$b;

.field public static final enum VALUE_NOT_SET:LQ1/h$b;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, LQ1/h$b;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, LQ1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LQ1/h$b;->BOOLEAN:LQ1/h$b;

    new-instance v1, LQ1/h$b;

    const-string v4, "FLOAT"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, LQ1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, LQ1/h$b;->FLOAT:LQ1/h$b;

    new-instance v3, LQ1/h$b;

    const-string v4, "INTEGER"

    const/4 v6, 0x3

    invoke-direct {v3, v4, v5, v6}, LQ1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, LQ1/h$b;->INTEGER:LQ1/h$b;

    new-instance v4, LQ1/h$b;

    const-string v5, "LONG"

    const/4 v7, 0x4

    invoke-direct {v4, v5, v6, v7}, LQ1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v4, LQ1/h$b;->LONG:LQ1/h$b;

    new-instance v5, LQ1/h$b;

    const-string v6, "STRING"

    const/4 v8, 0x5

    invoke-direct {v5, v6, v7, v8}, LQ1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, LQ1/h$b;->STRING:LQ1/h$b;

    new-instance v6, LQ1/h$b;

    const-string v7, "STRING_SET"

    const/4 v9, 0x6

    invoke-direct {v6, v7, v8, v9}, LQ1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v6, LQ1/h$b;->STRING_SET:LQ1/h$b;

    new-instance v7, LQ1/h$b;

    const-string v8, "DOUBLE"

    const/4 v10, 0x7

    invoke-direct {v7, v8, v9, v10}, LQ1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v7, LQ1/h$b;->DOUBLE:LQ1/h$b;

    new-instance v8, LQ1/h$b;

    const-string v9, "VALUE_NOT_SET"

    invoke-direct {v8, v9, v10, v2}, LQ1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v8, LQ1/h$b;->VALUE_NOT_SET:LQ1/h$b;

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    filled-new-array/range {v0 .. v7}, [LQ1/h$b;

    move-result-object v0

    sput-object v0, LQ1/h$b;->$VALUES:[LQ1/h$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LQ1/h$b;->value:I

    return-void
.end method

.method public static forNumber(I)LQ1/h$b;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LQ1/h$b;->DOUBLE:LQ1/h$b;

    return-object p0

    :pswitch_1
    sget-object p0, LQ1/h$b;->STRING_SET:LQ1/h$b;

    return-object p0

    :pswitch_2
    sget-object p0, LQ1/h$b;->STRING:LQ1/h$b;

    return-object p0

    :pswitch_3
    sget-object p0, LQ1/h$b;->LONG:LQ1/h$b;

    return-object p0

    :pswitch_4
    sget-object p0, LQ1/h$b;->INTEGER:LQ1/h$b;

    return-object p0

    :pswitch_5
    sget-object p0, LQ1/h$b;->FLOAT:LQ1/h$b;

    return-object p0

    :pswitch_6
    sget-object p0, LQ1/h$b;->BOOLEAN:LQ1/h$b;

    return-object p0

    :pswitch_7
    sget-object p0, LQ1/h$b;->VALUE_NOT_SET:LQ1/h$b;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static valueOf(I)LQ1/h$b;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, LQ1/h$b;->forNumber(I)LQ1/h$b;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LQ1/h$b;
    .locals 1

    .line 1
    const-class v0, LQ1/h$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LQ1/h$b;

    return-object p0
.end method

.method public static values()[LQ1/h$b;
    .locals 1

    sget-object v0, LQ1/h$b;->$VALUES:[LQ1/h$b;

    invoke-virtual {v0}, [LQ1/h$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQ1/h$b;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, LQ1/h$b;->value:I

    return v0
.end method
