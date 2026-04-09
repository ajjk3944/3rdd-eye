.class public final enum LY0/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LY0/t;

.field public static final enum Ltr:LY0/t;

.field public static final enum Rtl:LY0/t;


# direct methods
.method private static final synthetic $values()[LY0/t;
    .locals 2

    sget-object v0, LY0/t;->Ltr:LY0/t;

    sget-object v1, LY0/t;->Rtl:LY0/t;

    filled-new-array {v0, v1}, [LY0/t;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY0/t;

    const-string v1, "Ltr"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LY0/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY0/t;->Ltr:LY0/t;

    new-instance v0, LY0/t;

    const-string v1, "Rtl"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LY0/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY0/t;->Rtl:LY0/t;

    invoke-static {}, LY0/t;->$values()[LY0/t;

    move-result-object v0

    sput-object v0, LY0/t;->$VALUES:[LY0/t;

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

.method public static valueOf(Ljava/lang/String;)LY0/t;
    .locals 1

    const-class v0, LY0/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LY0/t;

    return-object p0
.end method

.method public static values()[LY0/t;
    .locals 1

    sget-object v0, LY0/t;->$VALUES:[LY0/t;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LY0/t;

    return-object v0
.end method
