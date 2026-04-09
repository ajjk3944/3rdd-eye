.class final enum Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/snmp/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

.field public static final enum contact:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

.field public static final enum description:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

.field public static final enum deviceName:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

.field public static final enum location:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

.field public static final enum objectID:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

.field public static final enum services:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

.field public static final enum uptime:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;


# instance fields
.field private final oid:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;
    .locals 7

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->description:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->objectID:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    sget-object v2, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->uptime:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    sget-object v3, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->contact:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    sget-object v4, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->deviceName:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    sget-object v5, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->location:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    sget-object v6, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->services:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    filled-new-array/range {v0 .. v6}, [Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    const/4 v1, 0x0

    const-string v2, "1.3.6.1.2.1.1.1"

    const-string v3, "description"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->description:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    const/4 v1, 0x1

    const-string v2, "1.3.6.1.2.1.1.2"

    const-string v3, "objectID"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->objectID:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    const/4 v1, 0x2

    const-string v2, "1.3.6.1.2.1.1.3"

    const-string v3, "uptime"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->uptime:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    const/4 v1, 0x3

    const-string v2, "1.3.6.1.2.1.1.4"

    const-string v3, "contact"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->contact:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    const/4 v1, 0x4

    const-string v2, "1.3.6.1.2.1.1.5"

    const-string v3, "deviceName"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->deviceName:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    const/4 v1, 0x5

    const-string v2, "1.3.6.1.2.1.1.6"

    const-string v3, "location"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->location:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    const/4 v1, 0x6

    const-string v2, "1.3.6.1.2.1.1.7"

    const-string v3, "services"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->services:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-static {}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->$values()[Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->$VALUES:[Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->oid:Ljava/lang/String;

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

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->$VALUES:[Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    return-object v0
.end method


# virtual methods
.method public final getOid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->oid:Ljava/lang/String;

    return-object v0
.end method

.method public final getOidWithInterface()Lorg/snmp4j/smi/OID;
    .locals 3

    new-instance v0, Lorg/snmp4j/smi/OID;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->oid:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".0"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
