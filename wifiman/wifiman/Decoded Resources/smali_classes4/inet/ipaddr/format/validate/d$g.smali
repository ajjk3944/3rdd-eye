.class public Linet/ipaddr/format/validate/d$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/format/validate/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field a:Linet/ipaddr/format/validate/r$d;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Linet/ipaddr/g;Linet/ipaddr/g;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Linet/ipaddr/format/validate/r$d;

    invoke-direct {v0, p1, p2}, Linet/ipaddr/format/validate/r$d;-><init>(Linet/ipaddr/g;Linet/ipaddr/g;)V

    iput-object v0, p0, Linet/ipaddr/format/validate/d$g;->a:Linet/ipaddr/format/validate/r$d;

    return-void
.end method

.method synthetic constructor <init>(Linet/ipaddr/g;Linet/ipaddr/g;Linet/ipaddr/format/validate/d$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Linet/ipaddr/format/validate/d$g;-><init>(Linet/ipaddr/g;Linet/ipaddr/g;)V

    return-void
.end method

.method private c()Linet/ipaddr/format/validate/r$d;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$g;->a:Linet/ipaddr/format/validate/r$d;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/format/validate/d$g;->a:Linet/ipaddr/format/validate/r$d;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$g;->a()Linet/ipaddr/format/validate/r$d;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/format/validate/d$g;->a:Linet/ipaddr/format/validate/r$d;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    return-object v0
.end method


# virtual methods
.method public M()Linet/ipaddr/g;
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/format/validate/d$g;->c()Linet/ipaddr/format/validate/r$d;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$d;->a()Linet/ipaddr/g;

    move-result-object v0

    return-object v0
.end method

.method public S0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method a()Linet/ipaddr/format/validate/r$d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g0()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$g;->M()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/g;->F0()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getType()Linet/ipaddr/format/validate/d$h;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$g;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    invoke-static {v0}, Linet/ipaddr/format/validate/d$h;->from(Linet/ipaddr/g$a;)Linet/ipaddr/format/validate/d$h;

    move-result-object v0

    return-object v0
.end method

.method public o0()Linet/ipaddr/g$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$g;->M()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/g;->n0()Linet/ipaddr/g$a;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$g;->M()Linet/ipaddr/g;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
