.class final Lcom/ui/wifiman/model/discovery/engine/snmp/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/snmp/b;-><init>(LZc/f;Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$h;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$h;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$h;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)Ll9/a;
    .locals 3

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZc/e$a;->b()Linet/ipaddr/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LZc/e$a;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    sget-object v0, LWc/a;->c:LWc/a$a;

    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LZc/e$a;->b()Linet/ipaddr/g;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LZc/e$a;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_3

    :cond_3
    move-object p1, v1

    :goto_3
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, v2, p1}, LWc/a$a;->a(Linet/ipaddr/g;I)LWc/a;

    move-result-object p1

    if-eqz p1, :cond_4

    sget-object v0, Lee/a;->a:Lee/a;

    invoke-virtual {v0, p1}, Lee/a;->a(LWc/a;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lee/a;->e(J)Ljava/lang/String;

    move-result-object v1

    :cond_4
    new-instance p1, Ll9/a;

    new-instance v0, Linet/ipaddr/n;

    invoke-direct {v0, v1}, Linet/ipaddr/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Linet/ipaddr/n;->g()Linet/ipaddr/g;

    move-result-object v0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$h;->a(LZc/e;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
