.class public Linet/ipaddr/format/validate/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:Ljava/lang/Integer;

.field private final b:Ljava/lang/Integer;

.field private final c:Ljava/lang/CharSequence;

.field private d:Linet/ipaddr/format/validate/r;

.field private e:Linet/ipaddr/g;

.field private final f:Ljava/lang/CharSequence;


# direct methods
.method constructor <init>()V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v5}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/Integer;Linet/ipaddr/format/validate/r;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;)V

    return-void
.end method

.method constructor <init>(Linet/ipaddr/format/validate/r;Ljava/lang/CharSequence;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    .line 5
    invoke-direct/range {v0 .. v5}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/Integer;Linet/ipaddr/format/validate/r;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/CharSequence;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    .line 2
    invoke-direct/range {v0 .. v5}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/Integer;Linet/ipaddr/format/validate/r;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;I)V
    .locals 6

    .line 3
    invoke-static {p2}, Linet/ipaddr/format/validate/i;->c(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/Integer;Linet/ipaddr/format/validate/r;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v5, p2

    .line 6
    invoke-direct/range {v0 .. v5}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/Integer;Linet/ipaddr/format/validate/r;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/Integer;Linet/ipaddr/format/validate/r;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    .line 10
    iput-object p2, p0, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    .line 11
    iput-object p3, p0, Linet/ipaddr/format/validate/i;->f:Ljava/lang/CharSequence;

    .line 12
    iput-object p4, p0, Linet/ipaddr/format/validate/i;->b:Ljava/lang/Integer;

    .line 13
    iput-object p5, p0, Linet/ipaddr/format/validate/i;->c:Ljava/lang/CharSequence;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/CharSequence;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    .line 4
    invoke-direct/range {v0 .. v5}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/Integer;Linet/ipaddr/format/validate/r;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;)V

    return-void
.end method

.method private E(Linet/ipaddr/format/validate/i;)V
    .locals 0

    iget-object p1, p1, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    iput-object p1, p0, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    :cond_0
    return-void
.end method

.method private static c(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/format/validate/g;->a(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private t(Linet/ipaddr/format/validate/i;)V
    .locals 0

    iget-object p1, p1, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    if-eqz p1, :cond_0

    iput-object p1, p0, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    :cond_0
    return-void
.end method


# virtual methods
.method B(Linet/ipaddr/format/validate/i;)V
    .locals 0

    invoke-direct {p0, p1}, Linet/ipaddr/format/validate/i;->E(Linet/ipaddr/format/validate/i;)V

    invoke-direct {p0, p1}, Linet/ipaddr/format/validate/i;->t(Linet/ipaddr/format/validate/i;)V

    return-void
.end method

.method F0()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method protected bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/i;->d()Linet/ipaddr/format/validate/i;

    move-result-object v0

    return-object v0
.end method

.method protected d()Linet/ipaddr/format/validate/i;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/format/validate/i;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method h()Ljava/lang/Integer;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/format/validate/i;->F0()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/format/validate/i;->l()Linet/ipaddr/g;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Linet/ipaddr/g;->W0(Z)Ljava/lang/Integer;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method l()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/i;->e:Linet/ipaddr/g;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r;->c2()Linet/ipaddr/g;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method m()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/i;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method n()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/i;->c:Ljava/lang/CharSequence;

    return-object v0
.end method

.method o()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/i;->f:Ljava/lang/CharSequence;

    return-object v0
.end method

.method p(Linet/ipaddr/o;)Linet/ipaddr/g$a;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    invoke-static {v1}, Linet/ipaddr/g;->U0(Linet/ipaddr/g$a;)I

    move-result v1

    if-le v0, v1, :cond_2

    invoke-virtual {p1}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object p1

    iget-boolean p1, p1, Linet/ipaddr/o$b;->g:Z

    if-nez p1, :cond_2

    sget-object p1, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    return-object p1

    :cond_0
    iget-object p1, p0, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Linet/ipaddr/format/validate/r;->f1()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    return-object p1

    :cond_1
    iget-object p1, p0, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    invoke-virtual {p1}, Linet/ipaddr/format/validate/r;->e1()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    return-object p1

    :cond_2
    iget-object p1, p0, Linet/ipaddr/format/validate/i;->f:Ljava/lang/CharSequence;

    if-eqz p1, :cond_3

    sget-object p1, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method r(Linet/ipaddr/format/validate/i;)V
    .locals 2

    iget-object v0, p0, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p1, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_1

    :cond_0
    iget-object v0, p1, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    iput-object v0, p0, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    :cond_1
    iget-object v0, p0, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    if-nez v0, :cond_2

    iget-object p1, p1, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    if-eqz p1, :cond_3

    iput-object p1, p0, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    goto :goto_0

    :cond_2
    iget-object v0, p1, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/i;->l()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/format/validate/i;->l()Linet/ipaddr/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Linet/ipaddr/g;->i1(Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object p1

    iput-object p1, p0, Linet/ipaddr/format/validate/i;->e:Linet/ipaddr/g;

    :cond_3
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "network prefix length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Linet/ipaddr/format/validate/i;->a:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " mask: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Linet/ipaddr/format/validate/i;->d:Linet/ipaddr/format/validate/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " zone: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Linet/ipaddr/format/validate/i;->f:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " port: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Linet/ipaddr/format/validate/i;->b:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " service: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Linet/ipaddr/format/validate/i;->c:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
