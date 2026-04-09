.class final Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a;->a(Ljava/lang/Long;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$a;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "SNMP discovery scan request"

    const-string v0, "SnmpDiscEngine"

    invoke-static {p1, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$a;->a(LDj/c;)V

    return-void
.end method
