.class public final enum LJh/U$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJh/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LJh/U$b;

.field public static final enum OBJECT_PARAMETER_GENERIC:LJh/U$b;

.field public static final enum OBJECT_PARAMETER_NON_GENERIC:LJh/U$b;

.field public static final enum ONE_COLLECTION_PARAMETER:LJh/U$b;


# instance fields
.field private final isObjectReplacedWithTypeParameter:Z

.field private final valueParametersSignature:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LJh/U$b;
    .locals 3

    sget-object v0, LJh/U$b;->ONE_COLLECTION_PARAMETER:LJh/U$b;

    sget-object v1, LJh/U$b;->OBJECT_PARAMETER_NON_GENERIC:LJh/U$b;

    sget-object v2, LJh/U$b;->OBJECT_PARAMETER_GENERIC:LJh/U$b;

    filled-new-array {v0, v1, v2}, [LJh/U$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LJh/U$b;

    const/4 v1, 0x0

    const-string v2, "Ljava/util/Collection<+Ljava/lang/Object;>;"

    const-string v3, "ONE_COLLECTION_PARAMETER"

    invoke-direct {v0, v3, v1, v2, v1}, LJh/U$b;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, LJh/U$b;->ONE_COLLECTION_PARAMETER:LJh/U$b;

    new-instance v0, LJh/U$b;

    const/4 v1, 0x0

    const-string v2, "OBJECT_PARAMETER_NON_GENERIC"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1, v3}, LJh/U$b;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, LJh/U$b;->OBJECT_PARAMETER_NON_GENERIC:LJh/U$b;

    new-instance v0, LJh/U$b;

    const/4 v1, 0x2

    const-string v2, "Ljava/lang/Object;"

    const-string v4, "OBJECT_PARAMETER_GENERIC"

    invoke-direct {v0, v4, v1, v2, v3}, LJh/U$b;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, LJh/U$b;->OBJECT_PARAMETER_GENERIC:LJh/U$b;

    invoke-static {}, LJh/U$b;->$values()[LJh/U$b;

    move-result-object v0

    sput-object v0, LJh/U$b;->$VALUES:[LJh/U$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LJh/U$b;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LJh/U$b;->valueParametersSignature:Ljava/lang/String;

    iput-boolean p4, p0, LJh/U$b;->isObjectReplacedWithTypeParameter:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LJh/U$b;
    .locals 1

    const-class v0, LJh/U$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJh/U$b;

    return-object p0
.end method

.method public static values()[LJh/U$b;
    .locals 1

    sget-object v0, LJh/U$b;->$VALUES:[LJh/U$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJh/U$b;

    return-object v0
.end method
