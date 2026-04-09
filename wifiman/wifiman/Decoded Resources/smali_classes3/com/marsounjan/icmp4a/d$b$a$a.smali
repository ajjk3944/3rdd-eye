.class public final enum Lcom/marsounjan/icmp4a/d$b$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/d$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum COMM_ADMIN_PROHIBITED:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum DEST_HOST_ADMIN_PROHIBITED:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum DEST_HOST_UNKNOWN:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum DEST_NETWORK_ADMIN_PROHIBITED:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum DEST_NET_UNKNOWN:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum FRAGMENTATION_NEEDED:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum HOST_PRECEDENCE_VIOLATION:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum HOST_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum HOST_UNREACHABLE_FOR_TOS:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum NETWORK_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum NETWORK_UNREACHABLE_FOR_TOS:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum PORT_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum PRECEDENCE_CUTOFF:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum PROTOCOL_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

.field public static final enum SOURCE_HOST_ISOLATED:Lcom/marsounjan/icmp4a/d$b$a$a;


# instance fields
.field private final id:B

.field private final message:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/marsounjan/icmp4a/d$b$a$a;
    .locals 15

    sget-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->NETWORK_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v1, Lcom/marsounjan/icmp4a/d$b$a$a;->HOST_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v2, Lcom/marsounjan/icmp4a/d$b$a$a;->PROTOCOL_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v3, Lcom/marsounjan/icmp4a/d$b$a$a;->PORT_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v4, Lcom/marsounjan/icmp4a/d$b$a$a;->FRAGMENTATION_NEEDED:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v5, Lcom/marsounjan/icmp4a/d$b$a$a;->DEST_NET_UNKNOWN:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v6, Lcom/marsounjan/icmp4a/d$b$a$a;->DEST_HOST_UNKNOWN:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v7, Lcom/marsounjan/icmp4a/d$b$a$a;->SOURCE_HOST_ISOLATED:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v8, Lcom/marsounjan/icmp4a/d$b$a$a;->DEST_NETWORK_ADMIN_PROHIBITED:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v9, Lcom/marsounjan/icmp4a/d$b$a$a;->DEST_HOST_ADMIN_PROHIBITED:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v10, Lcom/marsounjan/icmp4a/d$b$a$a;->NETWORK_UNREACHABLE_FOR_TOS:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v11, Lcom/marsounjan/icmp4a/d$b$a$a;->HOST_UNREACHABLE_FOR_TOS:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v12, Lcom/marsounjan/icmp4a/d$b$a$a;->COMM_ADMIN_PROHIBITED:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v13, Lcom/marsounjan/icmp4a/d$b$a$a;->HOST_PRECEDENCE_VIOLATION:Lcom/marsounjan/icmp4a/d$b$a$a;

    sget-object v14, Lcom/marsounjan/icmp4a/d$b$a$a;->PRECEDENCE_CUTOFF:Lcom/marsounjan/icmp4a/d$b$a$a;

    filled-new-array/range {v0 .. v14}, [Lcom/marsounjan/icmp4a/d$b$a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const/4 v1, 0x0

    const-string v2, "Destination Net Unreachable"

    const-string/jumbo v3, "NETWORK_UNREACHABLE"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->NETWORK_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const/4 v1, 0x1

    const-string v2, "Destination Host Unreachable"

    const-string/jumbo v3, "HOST_UNREACHABLE"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->HOST_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const/4 v1, 0x2

    const-string v2, "Destination Protocol Unreachable"

    const-string/jumbo v3, "PROTOCOL_UNREACHABLE"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->PROTOCOL_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const/4 v1, 0x3

    const-string v2, "Destination Port Unreachable"

    const-string/jumbo v3, "PORT_UNREACHABLE"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->PORT_UNREACHABLE:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const/4 v1, 0x4

    const-string/jumbo v2, "Frag needed and DF set"

    const-string/jumbo v3, "FRAGMENTATION_NEEDED"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->FRAGMENTATION_NEEDED:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const-string v1, "Destination network unknown"

    const-string v2, "DEST_NET_UNKNOWN"

    const/4 v3, 0x5

    const/4 v4, 0x6

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->DEST_NET_UNKNOWN:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const-string v1, "Destination host unknown"

    const-string v2, "DEST_HOST_UNKNOWN"

    const/4 v3, 0x7

    invoke-direct {v0, v2, v4, v3, v1}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->DEST_HOST_UNKNOWN:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const-string/jumbo v1, "Source host isolated"

    const-string/jumbo v2, "SOURCE_HOST_ISOLATED"

    const/16 v4, 0x8

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->SOURCE_HOST_ISOLATED:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const-string v1, "Destination network is administratively prohibited"

    const-string v2, "DEST_NETWORK_ADMIN_PROHIBITED"

    const/16 v3, 0x9

    invoke-direct {v0, v2, v4, v3, v1}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->DEST_NETWORK_ADMIN_PROHIBITED:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const-string v1, "Destination host is administratively prohibited"

    const-string v2, "DEST_HOST_ADMIN_PROHIBITED"

    const/16 v4, 0xa

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->DEST_HOST_ADMIN_PROHIBITED:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const-string/jumbo v1, "Network is unreachable for Type Of Service"

    const-string/jumbo v2, "NETWORK_UNREACHABLE_FOR_TOS"

    const/16 v3, 0xb

    invoke-direct {v0, v2, v4, v3, v1}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->NETWORK_UNREACHABLE_FOR_TOS:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const-string/jumbo v1, "Host is unreachable for Type Of Service"

    const-string/jumbo v2, "HOST_UNREACHABLE_FOR_TOS"

    const/16 v4, 0xc

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->HOST_UNREACHABLE_FOR_TOS:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const-string v1, "Communication administratively prohibited (administrative filtering prevents packet from being forwarded)"

    const-string v2, "COMM_ADMIN_PROHIBITED"

    const/16 v3, 0xd

    invoke-direct {v0, v2, v4, v3, v1}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->COMM_ADMIN_PROHIBITED:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const-string/jumbo v1, "Host precedence violation (indicates the requested precedence is not permitted for the combination of host or network and port)"

    const-string/jumbo v2, "HOST_PRECEDENCE_VIOLATION"

    const/16 v4, 0xe

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->HOST_PRECEDENCE_VIOLATION:Lcom/marsounjan/icmp4a/d$b$a$a;

    new-instance v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    const/16 v1, 0xf

    const-string/jumbo v2, "Precedence cutoff in effect (precedence of datagram is below the level set by the network administrators)"

    const-string/jumbo v3, "PRECEDENCE_CUTOFF"

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/marsounjan/icmp4a/d$b$a$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->PRECEDENCE_CUTOFF:Lcom/marsounjan/icmp4a/d$b$a$a;

    invoke-static {}, Lcom/marsounjan/icmp4a/d$b$a$a;->$values()[Lcom/marsounjan/icmp4a/d$b$a$a;

    move-result-object v0

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->$VALUES:[Lcom/marsounjan/icmp4a/d$b$a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->$ENTRIES:Lfh/a;

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

    iput-byte p3, p0, Lcom/marsounjan/icmp4a/d$b$a$a;->id:B

    iput-object p4, p0, Lcom/marsounjan/icmp4a/d$b$a$a;->message:Ljava/lang/String;

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

    sget-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/marsounjan/icmp4a/d$b$a$a;
    .locals 1

    const-class v0, Lcom/marsounjan/icmp4a/d$b$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/marsounjan/icmp4a/d$b$a$a;

    return-object p0
.end method

.method public static values()[Lcom/marsounjan/icmp4a/d$b$a$a;
    .locals 1

    sget-object v0, Lcom/marsounjan/icmp4a/d$b$a$a;->$VALUES:[Lcom/marsounjan/icmp4a/d$b$a$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/marsounjan/icmp4a/d$b$a$a;

    return-object v0
.end method


# virtual methods
.method public final getId-w2LRezQ()B
    .locals 1

    iget-byte v0, p0, Lcom/marsounjan/icmp4a/d$b$a$a;->id:B

    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/d$b$a$a;->message:Ljava/lang/String;

    return-object v0
.end method
