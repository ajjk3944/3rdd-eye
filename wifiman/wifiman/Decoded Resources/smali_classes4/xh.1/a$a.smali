.class public final enum Lxh/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lxh/a$a;

.field public static final enum CALL_BY_NAME:Lxh/a$a;

.field public static final enum POSITIONAL_CALL:Lxh/a$a;


# direct methods
.method private static final synthetic $values()[Lxh/a$a;
    .locals 2

    sget-object v0, Lxh/a$a;->CALL_BY_NAME:Lxh/a$a;

    sget-object v1, Lxh/a$a;->POSITIONAL_CALL:Lxh/a$a;

    filled-new-array {v0, v1}, [Lxh/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxh/a$a;

    const-string v1, "CALL_BY_NAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxh/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxh/a$a;->CALL_BY_NAME:Lxh/a$a;

    new-instance v0, Lxh/a$a;

    const-string v1, "POSITIONAL_CALL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lxh/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxh/a$a;->POSITIONAL_CALL:Lxh/a$a;

    invoke-static {}, Lxh/a$a;->$values()[Lxh/a$a;

    move-result-object v0

    sput-object v0, Lxh/a$a;->$VALUES:[Lxh/a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lxh/a$a;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)Lxh/a$a;
    .locals 1

    const-class v0, Lxh/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxh/a$a;

    return-object p0
.end method

.method public static values()[Lxh/a$a;
    .locals 1

    sget-object v0, Lxh/a$a;->$VALUES:[Lxh/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxh/a$a;

    return-object v0
.end method
