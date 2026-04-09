.class public final enum LUh/c$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LUh/c$c;

.field public static final enum ANNOTATION_CLASS:LUh/c$c;

.field public static final enum CLASS:LUh/c$c;

.field public static final enum COMPANION_OBJECT:LUh/c$c;

.field public static final enum ENUM_CLASS:LUh/c$c;

.field public static final enum ENUM_ENTRY:LUh/c$c;

.field public static final enum INTERFACE:LUh/c$c;

.field public static final enum OBJECT:LUh/c$c;

.field private static internalValueMap:Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LUh/c$c;

    const-string v1, "CLASS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, LUh/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v0, LUh/c$c;->CLASS:LUh/c$c;

    new-instance v1, LUh/c$c;

    const-string v2, "INTERFACE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3, v3}, LUh/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v1, LUh/c$c;->INTERFACE:LUh/c$c;

    new-instance v2, LUh/c$c;

    const-string v3, "ENUM_CLASS"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4, v4}, LUh/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v2, LUh/c$c;->ENUM_CLASS:LUh/c$c;

    new-instance v3, LUh/c$c;

    const-string v4, "ENUM_ENTRY"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5, v5}, LUh/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v3, LUh/c$c;->ENUM_ENTRY:LUh/c$c;

    new-instance v4, LUh/c$c;

    const-string v5, "ANNOTATION_CLASS"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6, v6}, LUh/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v4, LUh/c$c;->ANNOTATION_CLASS:LUh/c$c;

    new-instance v5, LUh/c$c;

    const-string v6, "OBJECT"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7, v7}, LUh/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v5, LUh/c$c;->OBJECT:LUh/c$c;

    new-instance v6, LUh/c$c;

    const-string v7, "COMPANION_OBJECT"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8, v8}, LUh/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v6, LUh/c$c;->COMPANION_OBJECT:LUh/c$c;

    filled-new-array/range {v0 .. v6}, [LUh/c$c;

    move-result-object v0

    sput-object v0, LUh/c$c;->$VALUES:[LUh/c$c;

    new-instance v0, LUh/c$c$a;

    invoke-direct {v0}, LUh/c$c$a;-><init>()V

    sput-object v0, LUh/c$c;->internalValueMap:Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p4, p0, LUh/c$c;->value:I

    return-void
.end method

.method public static valueOf(I)LUh/c$c;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :pswitch_0
    sget-object p0, LUh/c$c;->COMPANION_OBJECT:LUh/c$c;

    return-object p0

    .line 3
    :pswitch_1
    sget-object p0, LUh/c$c;->OBJECT:LUh/c$c;

    return-object p0

    .line 4
    :pswitch_2
    sget-object p0, LUh/c$c;->ANNOTATION_CLASS:LUh/c$c;

    return-object p0

    .line 5
    :pswitch_3
    sget-object p0, LUh/c$c;->ENUM_ENTRY:LUh/c$c;

    return-object p0

    .line 6
    :pswitch_4
    sget-object p0, LUh/c$c;->ENUM_CLASS:LUh/c$c;

    return-object p0

    .line 7
    :pswitch_5
    sget-object p0, LUh/c$c;->INTERFACE:LUh/c$c;

    return-object p0

    .line 8
    :pswitch_6
    sget-object p0, LUh/c$c;->CLASS:LUh/c$c;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)LUh/c$c;
    .locals 1

    .line 1
    const-class v0, LUh/c$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUh/c$c;

    return-object p0
.end method

.method public static values()[LUh/c$c;
    .locals 1

    sget-object v0, LUh/c$c;->$VALUES:[LUh/c$c;

    invoke-virtual {v0}, [LUh/c$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUh/c$c;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    iget v0, p0, LUh/c$c;->value:I

    return v0
.end method
