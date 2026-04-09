.class final Lcom/ui/wifiman/model/discovery/engine/snmp/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/snmp/b;-><init>(LZc/f;Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$g;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$g;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$g;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SNMP discovery should never emit error"

    const-string v1, "SnmpDiscEngine"

    invoke-static {v0, p1, v1}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$g;->a(Ljava/lang/Throwable;)V

    return-void
.end method
