.class final enum LR0/V$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR0/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LR0/V$a;

.field public static final enum HideKeyboard:LR0/V$a;

.field public static final enum ShowKeyboard:LR0/V$a;

.field public static final enum StartInput:LR0/V$a;

.field public static final enum StopInput:LR0/V$a;


# direct methods
.method private static final synthetic $values()[LR0/V$a;
    .locals 4

    sget-object v0, LR0/V$a;->StartInput:LR0/V$a;

    sget-object v1, LR0/V$a;->StopInput:LR0/V$a;

    sget-object v2, LR0/V$a;->ShowKeyboard:LR0/V$a;

    sget-object v3, LR0/V$a;->HideKeyboard:LR0/V$a;

    filled-new-array {v0, v1, v2, v3}, [LR0/V$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LR0/V$a;

    const-string v1, "StartInput"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LR0/V$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LR0/V$a;->StartInput:LR0/V$a;

    new-instance v0, LR0/V$a;

    const-string v1, "StopInput"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LR0/V$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LR0/V$a;->StopInput:LR0/V$a;

    new-instance v0, LR0/V$a;

    const-string v1, "ShowKeyboard"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LR0/V$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LR0/V$a;->ShowKeyboard:LR0/V$a;

    new-instance v0, LR0/V$a;

    const-string v1, "HideKeyboard"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LR0/V$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LR0/V$a;->HideKeyboard:LR0/V$a;

    invoke-static {}, LR0/V$a;->$values()[LR0/V$a;

    move-result-object v0

    sput-object v0, LR0/V$a;->$VALUES:[LR0/V$a;

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

.method public static valueOf(Ljava/lang/String;)LR0/V$a;
    .locals 1

    const-class v0, LR0/V$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LR0/V$a;

    return-object p0
.end method

.method public static values()[LR0/V$a;
    .locals 1

    sget-object v0, LR0/V$a;->$VALUES:[LR0/V$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LR0/V$a;

    return-object v0
.end method
