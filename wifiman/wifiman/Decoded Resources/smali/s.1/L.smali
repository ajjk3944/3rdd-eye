.class public final enum Ls/L;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Ls/L;

.field public static final enum Default:Ls/L;

.field public static final enum PreventUserInput:Ls/L;

.field public static final enum UserInput:Ls/L;


# direct methods
.method private static final synthetic $values()[Ls/L;
    .locals 3

    sget-object v0, Ls/L;->Default:Ls/L;

    sget-object v1, Ls/L;->UserInput:Ls/L;

    sget-object v2, Ls/L;->PreventUserInput:Ls/L;

    filled-new-array {v0, v1, v2}, [Ls/L;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls/L;

    const-string v1, "Default"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls/L;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls/L;->Default:Ls/L;

    new-instance v0, Ls/L;

    const-string v1, "UserInput"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ls/L;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls/L;->UserInput:Ls/L;

    new-instance v0, Ls/L;

    const-string v1, "PreventUserInput"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ls/L;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls/L;->PreventUserInput:Ls/L;

    invoke-static {}, Ls/L;->$values()[Ls/L;

    move-result-object v0

    sput-object v0, Ls/L;->$VALUES:[Ls/L;

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

.method public static valueOf(Ljava/lang/String;)Ls/L;
    .locals 1

    const-class v0, Ls/L;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls/L;

    return-object p0
.end method

.method public static values()[Ls/L;
    .locals 1

    sget-object v0, Ls/L;->$VALUES:[Ls/L;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls/L;

    return-object v0
.end method
