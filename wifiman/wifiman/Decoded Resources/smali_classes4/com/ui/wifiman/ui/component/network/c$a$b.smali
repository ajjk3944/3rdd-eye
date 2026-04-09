.class public final Lcom/ui/wifiman/ui/component/network/c$a$b;
.super Lcom/ui/wifiman/ui/component/network/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/component/network/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/component/network/c$a$b;

.field private static final b:Ls9/b;

.field private static final c:Ls9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/component/network/c$a$b;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/c$a$b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/component/network/c$a$b;->a:Lcom/ui/wifiman/ui/component/network/c$a$b;

    sget-object v0, Lb8/c;->ETHERNET:Lb8/c;

    invoke-static {v0}, Lcom/ui/wifiman/ui/component/network/p;->a(Lb8/c;)Ls9/b;

    move-result-object v1

    sput-object v1, Lcom/ui/wifiman/ui/component/network/c$a$b;->b:Ls9/b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lcom/ui/wifiman/ui/component/network/p;->c(Lb8/c;Ljava/lang/String;ILjava/lang/Object;)Ls9/d;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/component/network/c$a$b;->c:Ls9/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/ui/component/network/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ls9/b;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/component/network/c$a$b;->b:Ls9/b;

    return-object v0
.end method

.method public b()Ls9/d;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/component/network/c$a$b;->c:Ls9/d;

    return-object v0
.end method

.method public c(LT/l;I)J
    .locals 3

    const v0, 0xa5149ca

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo.NetworkState.Ethernet.iconTint (NetworkConnectionInfo.kt:90)"

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
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/ui/wifiman/ui/component/network/c$a$b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x217fbe67

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Ethernet"

    return-object v0
.end method
