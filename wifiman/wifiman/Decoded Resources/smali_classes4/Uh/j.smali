.class public final enum LUh/j;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;


# static fields
.field private static final synthetic $VALUES:[LUh/j;

.field public static final enum DECLARATION:LUh/j;

.field public static final enum DELEGATION:LUh/j;

.field public static final enum FAKE_OVERRIDE:LUh/j;

.field public static final enum SYNTHESIZED:LUh/j;

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
    .locals 6

    new-instance v0, LUh/j;

    const-string v1, "DECLARATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, LUh/j;-><init>(Ljava/lang/String;III)V

    sput-object v0, LUh/j;->DECLARATION:LUh/j;

    new-instance v1, LUh/j;

    const-string v2, "FAKE_OVERRIDE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3, v3}, LUh/j;-><init>(Ljava/lang/String;III)V

    sput-object v1, LUh/j;->FAKE_OVERRIDE:LUh/j;

    new-instance v2, LUh/j;

    const-string v3, "DELEGATION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4, v4}, LUh/j;-><init>(Ljava/lang/String;III)V

    sput-object v2, LUh/j;->DELEGATION:LUh/j;

    new-instance v3, LUh/j;

    const-string v4, "SYNTHESIZED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5, v5}, LUh/j;-><init>(Ljava/lang/String;III)V

    sput-object v3, LUh/j;->SYNTHESIZED:LUh/j;

    filled-new-array {v0, v1, v2, v3}, [LUh/j;

    move-result-object v0

    sput-object v0, LUh/j;->$VALUES:[LUh/j;

    new-instance v0, LUh/j$a;

    invoke-direct {v0}, LUh/j$a;-><init>()V

    sput-object v0, LUh/j;->internalValueMap:Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;

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

    iput p4, p0, LUh/j;->value:I

    return-void
.end method

.method public static valueOf(I)LUh/j;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    sget-object p0, LUh/j;->SYNTHESIZED:LUh/j;

    return-object p0

    .line 3
    :cond_1
    sget-object p0, LUh/j;->DELEGATION:LUh/j;

    return-object p0

    .line 4
    :cond_2
    sget-object p0, LUh/j;->FAKE_OVERRIDE:LUh/j;

    return-object p0

    .line 5
    :cond_3
    sget-object p0, LUh/j;->DECLARATION:LUh/j;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LUh/j;
    .locals 1

    .line 1
    const-class v0, LUh/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUh/j;

    return-object p0
.end method

.method public static values()[LUh/j;
    .locals 1

    sget-object v0, LUh/j;->$VALUES:[LUh/j;

    invoke-virtual {v0}, [LUh/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUh/j;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    iget v0, p0, LUh/j;->value:I

    return v0
.end method
