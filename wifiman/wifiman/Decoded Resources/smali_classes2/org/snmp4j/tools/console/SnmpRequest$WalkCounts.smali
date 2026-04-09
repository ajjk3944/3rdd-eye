.class Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/tools/console/SnmpRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WalkCounts"
.end annotation


# instance fields
.field public objects:I

.field public requests:I

.field final synthetic this$0:Lorg/snmp4j/tools/console/SnmpRequest;


# direct methods
.method constructor <init>(Lorg/snmp4j/tools/console/SnmpRequest;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;->this$0:Lorg/snmp4j/tools/console/SnmpRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
