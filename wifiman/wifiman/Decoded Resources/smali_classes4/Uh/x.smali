.class public final enum LUh/x;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;


# static fields
.field private static final synthetic $VALUES:[LUh/x;

.field public static final enum INTERNAL:LUh/x;

.field public static final enum LOCAL:LUh/x;

.field public static final enum PRIVATE:LUh/x;

.field public static final enum PRIVATE_TO_THIS:LUh/x;

.field public static final enum PROTECTED:LUh/x;

.field public static final enum PUBLIC:LUh/x;

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
    .locals 8

    new-instance v0, LUh/x;

    const-string v1, "INTERNAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, LUh/x;-><init>(Ljava/lang/String;III)V

    sput-object v0, LUh/x;->INTERNAL:LUh/x;

    new-instance v1, LUh/x;

    const-string v2, "PRIVATE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3, v3}, LUh/x;-><init>(Ljava/lang/String;III)V

    sput-object v1, LUh/x;->PRIVATE:LUh/x;

    new-instance v2, LUh/x;

    const-string v3, "PROTECTED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4, v4}, LUh/x;-><init>(Ljava/lang/String;III)V

    sput-object v2, LUh/x;->PROTECTED:LUh/x;

    new-instance v3, LUh/x;

    const-string v4, "PUBLIC"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5, v5}, LUh/x;-><init>(Ljava/lang/String;III)V

    sput-object v3, LUh/x;->PUBLIC:LUh/x;

    new-instance v4, LUh/x;

    const-string v5, "PRIVATE_TO_THIS"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6, v6}, LUh/x;-><init>(Ljava/lang/String;III)V

    sput-object v4, LUh/x;->PRIVATE_TO_THIS:LUh/x;

    new-instance v5, LUh/x;

    const-string v6, "LOCAL"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7, v7}, LUh/x;-><init>(Ljava/lang/String;III)V

    sput-object v5, LUh/x;->LOCAL:LUh/x;

    filled-new-array/range {v0 .. v5}, [LUh/x;

    move-result-object v0

    sput-object v0, LUh/x;->$VALUES:[LUh/x;

    new-instance v0, LUh/x$a;

    invoke-direct {v0}, LUh/x$a;-><init>()V

    sput-object v0, LUh/x;->internalValueMap:Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;

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

    iput p4, p0, LUh/x;->value:I

    return-void
.end method

.method public static valueOf(I)LUh/x;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    sget-object p0, LUh/x;->LOCAL:LUh/x;

    return-object p0

    .line 3
    :cond_1
    sget-object p0, LUh/x;->PRIVATE_TO_THIS:LUh/x;

    return-object p0

    .line 4
    :cond_2
    sget-object p0, LUh/x;->PUBLIC:LUh/x;

    return-object p0

    .line 5
    :cond_3
    sget-object p0, LUh/x;->PROTECTED:LUh/x;

    return-object p0

    .line 6
    :cond_4
    sget-object p0, LUh/x;->PRIVATE:LUh/x;

    return-object p0

    .line 7
    :cond_5
    sget-object p0, LUh/x;->INTERNAL:LUh/x;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LUh/x;
    .locals 1

    .line 1
    const-class v0, LUh/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUh/x;

    return-object p0
.end method

.method public static values()[LUh/x;
    .locals 1

    sget-object v0, LUh/x;->$VALUES:[LUh/x;

    invoke-virtual {v0}, [LUh/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUh/x;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    iget v0, p0, LUh/x;->value:I

    return v0
.end method
