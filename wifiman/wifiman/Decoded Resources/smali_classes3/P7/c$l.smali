.class public final LP7/c$l;
.super LP7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "l"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/Long;

.field private final d:Ljava/lang/Long;

.field private final e:Ljava/lang/Integer;

.field private final f:Lb8/c;

.field private final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lb8/c;)V
    .locals 0

    invoke-direct {p0}, LP7/c;-><init>()V

    iput-object p1, p0, LP7/c$l;->a:Ljava/lang/String;

    iput-object p2, p0, LP7/c$l;->b:Ljava/lang/String;

    iput-object p3, p0, LP7/c$l;->c:Ljava/lang/Long;

    iput-object p4, p0, LP7/c$l;->d:Ljava/lang/Long;

    iput-object p5, p0, LP7/c$l;->e:Ljava/lang/Integer;

    iput-object p6, p0, LP7/c$l;->f:Lb8/c;

    const-string/jumbo p1, "speedtest_result"

    iput-object p1, p0, LP7/c$l;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, LP7/c$l;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string/jumbo v2, "server"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v1, p0, LP7/c$l;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string/jumbo v2, "provider"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, LP7/c$l;->e:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    iget-object v1, p0, LP7/c$l;->e:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string/jumbo v2, "latency"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    iget-object v1, p0, LP7/c$l;->c:Ljava/lang/Long;

    if-eqz v1, :cond_3

    iget-object v1, p0, LP7/c$l;->c:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string/jumbo v3, "speed_download"

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_3
    iget-object v1, p0, LP7/c$l;->d:Ljava/lang/Long;

    if-eqz v1, :cond_4

    iget-object v1, p0, LP7/c$l;->d:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string/jumbo v3, "speed_upload"

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_4
    iget-object v1, p0, LP7/c$l;->f:Lb8/c;

    if-eqz v1, :cond_5

    invoke-static {v1}, LR7/b;->a(Lb8/c;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string/jumbo v2, "network_type"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LP7/c$l;->g:Ljava/lang/String;

    return-object v0
.end method
