.class public final enum Lcom/marsounjan/icmp4a/i$b$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/i$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/marsounjan/icmp4a/i$b$a$a;

.field public static final enum ADDRESS_UNREACHABLE:Lcom/marsounjan/icmp4a/i$b$a$a;

.field public static final enum BEYOND_ADDRESS_SCOPE:Lcom/marsounjan/icmp4a/i$b$a$a;

.field public static final enum COMMUNICATION_PROHIBITED:Lcom/marsounjan/icmp4a/i$b$a$a;

.field public static final enum NO_ROUTE_TO_DESTINATION:Lcom/marsounjan/icmp4a/i$b$a$a;

.field public static final enum PORT_UNREACHABLE:Lcom/marsounjan/icmp4a/i$b$a$a;

.field public static final enum ROUTE_TO_DESTINATION_REJECTED:Lcom/marsounjan/icmp4a/i$b$a$a;

.field public static final enum SOURCE_ADDRESS_FAILED_INGRESS_POLICY:Lcom/marsounjan/icmp4a/i$b$a$a;

.field public static final enum SOURCE_ROUTING_HEADER_ERROR:Lcom/marsounjan/icmp4a/i$b$a$a;


# instance fields
.field private final id:B

.field private final message:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/marsounjan/icmp4a/i$b$a$a;
    .locals 8

    sget-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->NO_ROUTE_TO_DESTINATION:Lcom/marsounjan/icmp4a/i$b$a$a;

    sget-object v1, Lcom/marsounjan/icmp4a/i$b$a$a;->COMMUNICATION_PROHIBITED:Lcom/marsounjan/icmp4a/i$b$a$a;

    sget-object v2, Lcom/marsounjan/icmp4a/i$b$a$a;->BEYOND_ADDRESS_SCOPE:Lcom/marsounjan/icmp4a/i$b$a$a;

    sget-object v3, Lcom/marsounjan/icmp4a/i$b$a$a;->ADDRESS_UNREACHABLE:Lcom/marsounjan/icmp4a/i$b$a$a;

    sget-object v4, Lcom/marsounjan/icmp4a/i$b$a$a;->PORT_UNREACHABLE:Lcom/marsounjan/icmp4a/i$b$a$a;

    sget-object v5, Lcom/marsounjan/icmp4a/i$b$a$a;->SOURCE_ADDRESS_FAILED_INGRESS_POLICY:Lcom/marsounjan/icmp4a/i$b$a$a;

    sget-object v6, Lcom/marsounjan/icmp4a/i$b$a$a;->ROUTE_TO_DESTINATION_REJECTED:Lcom/marsounjan/icmp4a/i$b$a$a;

    sget-object v7, Lcom/marsounjan/icmp4a/i$b$a$a;->SOURCE_ROUTING_HEADER_ERROR:Lcom/marsounjan/icmp4a/i$b$a$a;

    filled-new-array/range {v0 .. v7}, [Lcom/marsounjan/icmp4a/i$b$a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$a$a;

    const/4 v1, 0x0

    const-string/jumbo v2, "No route to destination"

    const-string/jumbo v3, "NO_ROUTE_TO_DESTINATION"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/i$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->NO_ROUTE_TO_DESTINATION:Lcom/marsounjan/icmp4a/i$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$a$a;

    const/4 v1, 0x1

    const-string v2, "Administratively prohibited"

    const-string v3, "COMMUNICATION_PROHIBITED"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/i$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->COMMUNICATION_PROHIBITED:Lcom/marsounjan/icmp4a/i$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$a$a;

    const/4 v1, 0x2

    const-string v2, "Beyond scope of source address"

    const-string v3, "BEYOND_ADDRESS_SCOPE"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/i$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->BEYOND_ADDRESS_SCOPE:Lcom/marsounjan/icmp4a/i$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$a$a;

    const/4 v1, 0x3

    const-string v2, "Address unreachable"

    const-string v3, "ADDRESS_UNREACHABLE"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/i$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->ADDRESS_UNREACHABLE:Lcom/marsounjan/icmp4a/i$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$a$a;

    const/4 v1, 0x4

    const-string/jumbo v2, "Port unreachable"

    const-string/jumbo v3, "PORT_UNREACHABLE"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/i$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->PORT_UNREACHABLE:Lcom/marsounjan/icmp4a/i$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$a$a;

    const/4 v1, 0x5

    const-string/jumbo v2, "Source address failed ingress policy"

    const-string/jumbo v3, "SOURCE_ADDRESS_FAILED_INGRESS_POLICY"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/i$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->SOURCE_ADDRESS_FAILED_INGRESS_POLICY:Lcom/marsounjan/icmp4a/i$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$a$a;

    const/4 v1, 0x6

    const-string/jumbo v2, "Route to destination rejected"

    const-string/jumbo v3, "ROUTE_TO_DESTINATION_REJECTED"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/i$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->ROUTE_TO_DESTINATION_REJECTED:Lcom/marsounjan/icmp4a/i$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$a$a;

    const/4 v1, 0x7

    const-string/jumbo v2, "Routing header error"

    const-string/jumbo v3, "SOURCE_ROUTING_HEADER_ERROR"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/i$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->SOURCE_ROUTING_HEADER_ERROR:Lcom/marsounjan/icmp4a/i$b$a$a;

    invoke-static {}, Lcom/marsounjan/icmp4a/i$b$a$a;->$values()[Lcom/marsounjan/icmp4a/i$b$a$a;

    move-result-object v0

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->$VALUES:[Lcom/marsounjan/icmp4a/i$b$a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IBLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lcom/marsounjan/icmp4a/i$b$a$a;->id:B

    iput-object p4, p0, Lcom/marsounjan/icmp4a/i$b$a$a;->message:Ljava/lang/String;

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

    sget-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/marsounjan/icmp4a/i$b$a$a;
    .locals 1

    const-class v0, Lcom/marsounjan/icmp4a/i$b$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/marsounjan/icmp4a/i$b$a$a;

    return-object p0
.end method

.method public static values()[Lcom/marsounjan/icmp4a/i$b$a$a;
    .locals 1

    sget-object v0, Lcom/marsounjan/icmp4a/i$b$a$a;->$VALUES:[Lcom/marsounjan/icmp4a/i$b$a$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/marsounjan/icmp4a/i$b$a$a;

    return-object v0
.end method


# virtual methods
.method public final getId-w2LRezQ()B
    .locals 1

    iget-byte v0, p0, Lcom/marsounjan/icmp4a/i$b$a$a;->id:B

    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/i$b$a$a;->message:Ljava/lang/String;

    return-object v0
.end method
