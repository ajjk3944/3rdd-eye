.class public final LAf/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDe/a;


# instance fields
.field private final a:LS8/j;

.field private final b:Ls9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LS8/j;)V
    .locals 1

    const-string v0, "security"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAf/x;->a:LS8/j;

    invoke-static {p1}, LAf/y;->c(LS8/j;)Ls9/d;

    move-result-object p1

    iput-object p1, p0, LAf/x;->b:Ls9/d;

    return-void
.end method


# virtual methods
.method public a()Ls9/d;
    .locals 1

    iget-object v0, p0, LAf/x;->b:Ls9/d;

    return-object v0
.end method

.method public b(LT/l;I)J
    .locals 3

    const v0, 0x518c6506

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.WifiSecurityBadge.color (WifiSecurityTypeBadge.kt:17)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p2, p0, LAf/x;->a:LS8/j;

    invoke-virtual {p2}, LS8/j;->b()Z

    move-result p2

    if-eqz p2, :cond_1

    const p2, 0x30642bd0

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->k()Lr9/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const p2, 0x30651032

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method

.method public c(LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LDe/a$a;->a(LDe/a;LT/l;I)V

    return-void
.end method

.method public d()Z
    .locals 1

    invoke-static {p0}, LDe/a$a;->b(LDe/a;)Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LAf/x;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LAf/x;

    iget-object v1, p0, LAf/x;->a:LS8/j;

    iget-object p1, p1, LAf/x;->a:LS8/j;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LAf/x;->a:LS8/j;

    invoke-virtual {v0}, LS8/j;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LAf/x;->a:LS8/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WifiSecurityBadge(security="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
