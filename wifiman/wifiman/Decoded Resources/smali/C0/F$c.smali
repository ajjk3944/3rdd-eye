.class final enum LC0/F$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC0/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LC0/F$c;

.field public static final enum Max:LC0/F$c;

.field public static final enum Min:LC0/F$c;


# direct methods
.method private static final synthetic $values()[LC0/F$c;
    .locals 2

    sget-object v0, LC0/F$c;->Min:LC0/F$c;

    sget-object v1, LC0/F$c;->Max:LC0/F$c;

    filled-new-array {v0, v1}, [LC0/F$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LC0/F$c;

    const-string v1, "Min"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LC0/F$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC0/F$c;->Min:LC0/F$c;

    new-instance v0, LC0/F$c;

    const-string v1, "Max"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LC0/F$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC0/F$c;->Max:LC0/F$c;

    invoke-static {}, LC0/F$c;->$values()[LC0/F$c;

    move-result-object v0

    sput-object v0, LC0/F$c;->$VALUES:[LC0/F$c;

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

.method public static valueOf(Ljava/lang/String;)LC0/F$c;
    .locals 1

    const-class v0, LC0/F$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LC0/F$c;

    return-object p0
.end method

.method public static values()[LC0/F$c;
    .locals 1

    sget-object v0, LC0/F$c;->$VALUES:[LC0/F$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LC0/F$c;

    return-object v0
.end method
