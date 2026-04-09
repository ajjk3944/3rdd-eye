.class public final Lcom/ui/wifiman/ui/component/network/c$a$a;
.super Lcom/ui/wifiman/ui/component/network/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/component/network/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LV7/a;

.field private final b:Ls9/b;

.field private final c:Ls9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LV7/a;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/ui/component/network/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/c$a$a;->a:LV7/a;

    sget-object p1, Lb8/c;->MOBILE:Lb8/c;

    invoke-static {p1}, Lcom/ui/wifiman/ui/component/network/p;->a(Lb8/c;)Ls9/b;

    move-result-object v1

    iput-object v1, p0, Lcom/ui/wifiman/ui/component/network/c$a$a;->b:Ls9/b;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lcom/ui/wifiman/ui/component/network/p;->c(Lb8/c;Ljava/lang/String;ILjava/lang/Object;)Ls9/d;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/c$a$a;->c:Ls9/d;

    return-void
.end method


# virtual methods
.method public a()Ls9/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/c$a$a;->b:Ls9/b;

    return-object v0
.end method

.method public b()Ls9/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/c$a$a;->c:Ls9/d;

    return-object v0
.end method

.method public c(LT/l;I)J
    .locals 3

    const v0, -0x4481d1e9

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo.NetworkState.Cellular.iconTint (NetworkConnectionInfo.kt:101)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p2, p0, Lcom/ui/wifiman/ui/component/network/c$a$a;->a:LV7/a;

    const v0, 0x38665bdd

    invoke-interface {p1, v0}, LT/l;->U(I)V

    const/4 v0, 0x0

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p2, v0, p1, v1, v2}, LNe/f;->c(LW7/f;LW7/f$a;LT/l;II)J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v0

    :goto_0
    invoke-interface {p1}, LT/l;->J()V

    if-nez v0, :cond_2

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

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v0

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/ui/component/network/c$a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/ui/component/network/c$a$a;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/c$a$a;->a:LV7/a;

    iget-object p1, p1, Lcom/ui/wifiman/ui/component/network/c$a$a;->a:LV7/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/c$a$a;->a:LV7/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LW7/f;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/c$a$a;->a:LV7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cellular(signal="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
