.class public final enum Lcom/marsounjan/icmp4a/d$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/marsounjan/icmp4a/d$c;

.field public static final enum DESTINATION_UNREACHABLE:Lcom/marsounjan/icmp4a/d$c;

.field public static final enum ECHO:Lcom/marsounjan/icmp4a/d$c;

.field public static final enum ECHO_REPLY:Lcom/marsounjan/icmp4a/d$c;

.field public static final enum PARAMETER_PROBLEM:Lcom/marsounjan/icmp4a/d$c;

.field public static final enum REDIRECT:Lcom/marsounjan/icmp4a/d$c;

.field public static final enum SOURCE_QUENCH:Lcom/marsounjan/icmp4a/d$c;

.field public static final enum TIME_EXCEEDED:Lcom/marsounjan/icmp4a/d$c;


# instance fields
.field private final id:B


# direct methods
.method private static final synthetic $values()[Lcom/marsounjan/icmp4a/d$c;
    .locals 7

    sget-object v0, Lcom/marsounjan/icmp4a/d$c;->ECHO_REPLY:Lcom/marsounjan/icmp4a/d$c;

    sget-object v1, Lcom/marsounjan/icmp4a/d$c;->DESTINATION_UNREACHABLE:Lcom/marsounjan/icmp4a/d$c;

    sget-object v2, Lcom/marsounjan/icmp4a/d$c;->SOURCE_QUENCH:Lcom/marsounjan/icmp4a/d$c;

    sget-object v3, Lcom/marsounjan/icmp4a/d$c;->REDIRECT:Lcom/marsounjan/icmp4a/d$c;

    sget-object v4, Lcom/marsounjan/icmp4a/d$c;->ECHO:Lcom/marsounjan/icmp4a/d$c;

    sget-object v5, Lcom/marsounjan/icmp4a/d$c;->TIME_EXCEEDED:Lcom/marsounjan/icmp4a/d$c;

    sget-object v6, Lcom/marsounjan/icmp4a/d$c;->PARAMETER_PROBLEM:Lcom/marsounjan/icmp4a/d$c;

    filled-new-array/range {v0 .. v6}, [Lcom/marsounjan/icmp4a/d$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/marsounjan/icmp4a/d$c;

    const-string/jumbo v1, "ECHO_REPLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/marsounjan/icmp4a/d$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$c;->ECHO_REPLY:Lcom/marsounjan/icmp4a/d$c;

    new-instance v0, Lcom/marsounjan/icmp4a/d$c;

    const-string v1, "DESTINATION_UNREACHABLE"

    const/4 v2, 0x1

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/marsounjan/icmp4a/d$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$c;->DESTINATION_UNREACHABLE:Lcom/marsounjan/icmp4a/d$c;

    new-instance v0, Lcom/marsounjan/icmp4a/d$c;

    const-string/jumbo v1, "SOURCE_QUENCH"

    const/4 v2, 0x2

    const/4 v4, 0x4

    invoke-direct {v0, v1, v2, v4}, Lcom/marsounjan/icmp4a/d$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$c;->SOURCE_QUENCH:Lcom/marsounjan/icmp4a/d$c;

    new-instance v0, Lcom/marsounjan/icmp4a/d$c;

    const-string/jumbo v1, "REDIRECT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v3, v2}, Lcom/marsounjan/icmp4a/d$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$c;->REDIRECT:Lcom/marsounjan/icmp4a/d$c;

    new-instance v0, Lcom/marsounjan/icmp4a/d$c;

    const-string/jumbo v1, "ECHO"

    const/16 v3, 0x8

    invoke-direct {v0, v1, v4, v3}, Lcom/marsounjan/icmp4a/d$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$c;->ECHO:Lcom/marsounjan/icmp4a/d$c;

    new-instance v0, Lcom/marsounjan/icmp4a/d$c;

    const-string/jumbo v1, "TIME_EXCEEDED"

    const/16 v3, 0xb

    invoke-direct {v0, v1, v2, v3}, Lcom/marsounjan/icmp4a/d$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$c;->TIME_EXCEEDED:Lcom/marsounjan/icmp4a/d$c;

    new-instance v0, Lcom/marsounjan/icmp4a/d$c;

    const/4 v1, 0x6

    const/16 v2, 0xc

    const-string/jumbo v3, "PARAMETER_PROBLEM"

    invoke-direct {v0, v3, v1, v2}, Lcom/marsounjan/icmp4a/d$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$c;->PARAMETER_PROBLEM:Lcom/marsounjan/icmp4a/d$c;

    invoke-static {}, Lcom/marsounjan/icmp4a/d$c;->$values()[Lcom/marsounjan/icmp4a/d$c;

    move-result-object v0

    sput-object v0, Lcom/marsounjan/icmp4a/d$c;->$VALUES:[Lcom/marsounjan/icmp4a/d$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/marsounjan/icmp4a/d$c;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lcom/marsounjan/icmp4a/d$c;->id:B

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lcom/marsounjan/icmp4a/d$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/marsounjan/icmp4a/d$c;
    .locals 1

    const-class v0, Lcom/marsounjan/icmp4a/d$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/marsounjan/icmp4a/d$c;

    return-object p0
.end method

.method public static values()[Lcom/marsounjan/icmp4a/d$c;
    .locals 1

    sget-object v0, Lcom/marsounjan/icmp4a/d$c;->$VALUES:[Lcom/marsounjan/icmp4a/d$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/marsounjan/icmp4a/d$c;

    return-object v0
.end method


# virtual methods
.method public final getId-w2LRezQ()B
    .locals 1

    iget-byte v0, p0, Lcom/marsounjan/icmp4a/d$c;->id:B

    return v0
.end method
