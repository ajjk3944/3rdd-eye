.class final enum Lkj/d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkj/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lkj/d$a;

.field public static final enum RECEIVING:Lkj/d$a;

.field public static final enum RUNNING:Lkj/d$a;

.field public static final enum STARTING:Lkj/d$a;

.field public static final enum STOPPED:Lkj/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkj/d$a;

    const-string/jumbo v1, "STOPPED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkj/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkj/d$a;->STOPPED:Lkj/d$a;

    new-instance v1, Lkj/d$a;

    const-string/jumbo v2, "RUNNING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lkj/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkj/d$a;->RUNNING:Lkj/d$a;

    new-instance v2, Lkj/d$a;

    const-string/jumbo v3, "STARTING"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lkj/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lkj/d$a;->STARTING:Lkj/d$a;

    new-instance v3, Lkj/d$a;

    const-string/jumbo v4, "RECEIVING"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lkj/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lkj/d$a;->RECEIVING:Lkj/d$a;

    filled-new-array {v0, v1, v2, v3}, [Lkj/d$a;

    move-result-object v0

    sput-object v0, Lkj/d$a;->ENUM$VALUES:[Lkj/d$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkj/d$a;
    .locals 1

    const-class v0, Lkj/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkj/d$a;

    return-object p0
.end method

.method public static values()[Lkj/d$a;
    .locals 4

    sget-object v0, Lkj/d$a;->ENUM$VALUES:[Lkj/d$a;

    array-length v1, v0

    new-array v2, v1, [Lkj/d$a;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
