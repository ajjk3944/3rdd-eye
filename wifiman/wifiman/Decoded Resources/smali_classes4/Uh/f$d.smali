.class public final enum LUh/f$d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LUh/f$d;

.field public static final enum AT_LEAST_ONCE:LUh/f$d;

.field public static final enum AT_MOST_ONCE:LUh/f$d;

.field public static final enum EXACTLY_ONCE:LUh/f$d;

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
    .locals 5

    new-instance v0, LUh/f$d;

    const-string v1, "AT_MOST_ONCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, LUh/f$d;-><init>(Ljava/lang/String;III)V

    sput-object v0, LUh/f$d;->AT_MOST_ONCE:LUh/f$d;

    new-instance v1, LUh/f$d;

    const-string v2, "EXACTLY_ONCE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3, v3}, LUh/f$d;-><init>(Ljava/lang/String;III)V

    sput-object v1, LUh/f$d;->EXACTLY_ONCE:LUh/f$d;

    new-instance v2, LUh/f$d;

    const-string v3, "AT_LEAST_ONCE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4, v4}, LUh/f$d;-><init>(Ljava/lang/String;III)V

    sput-object v2, LUh/f$d;->AT_LEAST_ONCE:LUh/f$d;

    filled-new-array {v0, v1, v2}, [LUh/f$d;

    move-result-object v0

    sput-object v0, LUh/f$d;->$VALUES:[LUh/f$d;

    new-instance v0, LUh/f$d$a;

    invoke-direct {v0}, LUh/f$d$a;-><init>()V

    sput-object v0, LUh/f$d;->internalValueMap:Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;

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

    iput p4, p0, LUh/f$d;->value:I

    return-void
.end method

.method public static valueOf(I)LUh/f$d;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    sget-object p0, LUh/f$d;->AT_LEAST_ONCE:LUh/f$d;

    return-object p0

    .line 3
    :cond_1
    sget-object p0, LUh/f$d;->EXACTLY_ONCE:LUh/f$d;

    return-object p0

    .line 4
    :cond_2
    sget-object p0, LUh/f$d;->AT_MOST_ONCE:LUh/f$d;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LUh/f$d;
    .locals 1

    .line 1
    const-class v0, LUh/f$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUh/f$d;

    return-object p0
.end method

.method public static values()[LUh/f$d;
    .locals 1

    sget-object v0, LUh/f$d;->$VALUES:[LUh/f$d;

    invoke-virtual {v0}, [LUh/f$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUh/f$d;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    iget v0, p0, LUh/f$d;->value:I

    return v0
.end method
