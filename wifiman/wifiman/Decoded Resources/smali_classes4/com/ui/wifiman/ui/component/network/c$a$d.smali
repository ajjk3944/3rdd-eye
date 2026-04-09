.class public final Lcom/ui/wifiman/ui/component/network/c$a$d;
.super Lcom/ui/wifiman/ui/component/network/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/component/network/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/ui/component/network/c$a$d$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LS8/l;

.field private final c:Ls9/b;

.field private final d:Ls9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LS8/l;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/ui/component/network/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->b:LS8/l;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, LS8/l;->h()LW7/f$a;

    move-result-object p2

    sget-object v0, Lcom/ui/wifiman/ui/component/network/c$a$d$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    sget-object p2, LPe/a;->a:LPe/a;

    invoke-virtual {p2}, LPe/a;->X()Ls9/b;

    move-result-object p2

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p2, LPe/a;->a:LPe/a;

    invoke-virtual {p2}, LPe/a;->Z()Ls9/b;

    move-result-object p2

    goto :goto_0

    :cond_2
    sget-object p2, LPe/a;->a:LPe/a;

    invoke-virtual {p2}, LPe/a;->Y()Ls9/b;

    move-result-object p2

    :goto_0
    if-nez p2, :cond_4

    :cond_3
    sget-object p2, Lb8/c;->WIFI:Lb8/c;

    invoke-static {p2}, Lcom/ui/wifiman/ui/component/network/p;->a(Lb8/c;)Ls9/b;

    move-result-object p2

    :cond_4
    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->c:Ls9/b;

    sget-object p2, Lb8/c;->WIFI:Lb8/c;

    invoke-static {p2, p1}, Lcom/ui/wifiman/ui/component/network/p;->b(Lb8/c;Ljava/lang/String;)Ls9/d;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->d:Ls9/d;

    return-void
.end method


# virtual methods
.method public a()Ls9/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->c:Ls9/b;

    return-object v0
.end method

.method public b()Ls9/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->d:Ls9/d;

    return-object v0
.end method

.method public c(LT/l;I)J
    .locals 3

    const v0, 0x480cfb2c

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo.NetworkState.WiFi.iconTint (NetworkConnectionInfo.kt:81)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/ui/component/network/c$a$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/ui/component/network/c$a$d;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/ui/component/network/c$a$d;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->b:LS8/l;

    iget-object p1, p1, Lcom/ui/wifiman/ui/component/network/c$a$d;->b:LS8/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->b:LS8/l;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LS8/l;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/c$a$d;->b:LS8/l;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WiFi(ssid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", signal="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
