.class public final enum LEc/t$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEc/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LEc/t$c;

.field public static final enum AP:LEc/t$c;

.field public static final enum ARP:LEc/t$c;

.field public static final enum BONJOUR:LEc/t$c;

.field public static final enum GATEWAY:LEc/t$c;

.field public static final enum HOSTNAME:LEc/t$c;

.field public static final enum ICMP:LEc/t$c;

.field public static final enum MIKROTIK:LEc/t$c;

.field public static final enum MYSELF:LEc/t$c;

.field public static final enum NETBIOS:LEc/t$c;

.field public static final enum SNMP:LEc/t$c;

.field public static final enum UBNT:LEc/t$c;

.field public static final enum UBNT_HTTP_SPEEDTEST:LEc/t$c;

.field public static final enum UBNT_TCP_SPEEDTEST:LEc/t$c;

.field public static final enum UNIFI:LEc/t$c;

.field public static final enum UPNP:LEc/t$c;


# direct methods
.method private static final synthetic $values()[LEc/t$c;
    .locals 15

    sget-object v0, LEc/t$c;->UBNT:LEc/t$c;

    sget-object v1, LEc/t$c;->ICMP:LEc/t$c;

    sget-object v2, LEc/t$c;->ARP:LEc/t$c;

    sget-object v3, LEc/t$c;->BONJOUR:LEc/t$c;

    sget-object v4, LEc/t$c;->NETBIOS:LEc/t$c;

    sget-object v5, LEc/t$c;->SNMP:LEc/t$c;

    sget-object v6, LEc/t$c;->MYSELF:LEc/t$c;

    sget-object v7, LEc/t$c;->GATEWAY:LEc/t$c;

    sget-object v8, LEc/t$c;->AP:LEc/t$c;

    sget-object v9, LEc/t$c;->UPNP:LEc/t$c;

    sget-object v10, LEc/t$c;->MIKROTIK:LEc/t$c;

    sget-object v11, LEc/t$c;->UNIFI:LEc/t$c;

    sget-object v12, LEc/t$c;->UBNT_TCP_SPEEDTEST:LEc/t$c;

    sget-object v13, LEc/t$c;->UBNT_HTTP_SPEEDTEST:LEc/t$c;

    sget-object v14, LEc/t$c;->HOSTNAME:LEc/t$c;

    filled-new-array/range {v0 .. v14}, [LEc/t$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LEc/t$c;

    const-string v1, "UBNT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->UBNT:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "ICMP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->ICMP:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "ARP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->ARP:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "BONJOUR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->BONJOUR:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "NETBIOS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->NETBIOS:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "SNMP"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->SNMP:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "MYSELF"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->MYSELF:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "GATEWAY"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->GATEWAY:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "AP"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->AP:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "UPNP"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->UPNP:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "MIKROTIK"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->MIKROTIK:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "UNIFI"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->UNIFI:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "UBNT_TCP_SPEEDTEST"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->UBNT_TCP_SPEEDTEST:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "UBNT_HTTP_SPEEDTEST"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->UBNT_HTTP_SPEEDTEST:LEc/t$c;

    new-instance v0, LEc/t$c;

    const-string v1, "HOSTNAME"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, LEc/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc/t$c;->HOSTNAME:LEc/t$c;

    invoke-static {}, LEc/t$c;->$values()[LEc/t$c;

    move-result-object v0

    sput-object v0, LEc/t$c;->$VALUES:[LEc/t$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LEc/t$c;->$ENTRIES:Lfh/a;

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

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, LEc/t$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LEc/t$c;
    .locals 1

    const-class v0, LEc/t$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LEc/t$c;

    return-object p0
.end method

.method public static values()[LEc/t$c;
    .locals 1

    sget-object v0, LEc/t$c;->$VALUES:[LEc/t$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LEc/t$c;

    return-object v0
.end method
