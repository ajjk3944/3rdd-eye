.class public final enum LJ/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LJ/j$a;

.field public static final enum Mouse:LJ/j$a;

.field public static final enum None:LJ/j$a;

.field public static final enum Touch:LJ/j$a;


# direct methods
.method private static final synthetic $values()[LJ/j$a;
    .locals 3

    sget-object v0, LJ/j$a;->None:LJ/j$a;

    sget-object v1, LJ/j$a;->Touch:LJ/j$a;

    sget-object v2, LJ/j$a;->Mouse:LJ/j$a;

    filled-new-array {v0, v1, v2}, [LJ/j$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LJ/j$a;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LJ/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJ/j$a;->None:LJ/j$a;

    new-instance v0, LJ/j$a;

    const-string v1, "Touch"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LJ/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJ/j$a;->Touch:LJ/j$a;

    new-instance v0, LJ/j$a;

    const-string v1, "Mouse"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LJ/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJ/j$a;->Mouse:LJ/j$a;

    invoke-static {}, LJ/j$a;->$values()[LJ/j$a;

    move-result-object v0

    sput-object v0, LJ/j$a;->$VALUES:[LJ/j$a;

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

.method public static valueOf(Ljava/lang/String;)LJ/j$a;
    .locals 1

    const-class v0, LJ/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJ/j$a;

    return-object p0
.end method

.method public static values()[LJ/j$a;
    .locals 1

    sget-object v0, LJ/j$a;->$VALUES:[LJ/j$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJ/j$a;

    return-object v0
.end method
