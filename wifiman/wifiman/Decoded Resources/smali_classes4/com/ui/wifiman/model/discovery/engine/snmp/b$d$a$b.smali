.class final Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a;->a(Ljava/lang/Long;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$b;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error;

    if-eqz v0, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$b;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
