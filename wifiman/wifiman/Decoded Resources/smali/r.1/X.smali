.class public final enum Lr/X;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lr/X;

.field public static final enum Default:Lr/X;

.field public static final enum PreventUserInput:Lr/X;

.field public static final enum UserInput:Lr/X;


# direct methods
.method private static final synthetic $values()[Lr/X;
    .locals 3

    sget-object v0, Lr/X;->Default:Lr/X;

    sget-object v1, Lr/X;->UserInput:Lr/X;

    sget-object v2, Lr/X;->PreventUserInput:Lr/X;

    filled-new-array {v0, v1, v2}, [Lr/X;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr/X;

    const-string v1, "Default"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr/X;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr/X;->Default:Lr/X;

    new-instance v0, Lr/X;

    const-string v1, "UserInput"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr/X;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr/X;->UserInput:Lr/X;

    new-instance v0, Lr/X;

    const-string v1, "PreventUserInput"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lr/X;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr/X;->PreventUserInput:Lr/X;

    invoke-static {}, Lr/X;->$values()[Lr/X;

    move-result-object v0

    sput-object v0, Lr/X;->$VALUES:[Lr/X;

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

.method public static valueOf(Ljava/lang/String;)Lr/X;
    .locals 1

    const-class v0, Lr/X;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr/X;

    return-object p0
.end method

.method public static values()[Lr/X;
    .locals 1

    sget-object v0, Lr/X;->$VALUES:[Lr/X;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr/X;

    return-object v0
.end method
