.class public final Lcom/ui/sso/auth/d;
.super Lcom/ui/sso/auth/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/auth/d$a;,
        Lcom/ui/sso/auth/d$b;
    }
.end annotation


# static fields
.field public static final d:Lcom/ui/sso/auth/d$a;


# instance fields
.field private final a:Lcom/ui/sso/auth/d$b;

.field private final b:Lcom/ui/sso/auth/a$a;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/auth/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/auth/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/auth/d;->d:Lcom/ui/sso/auth/d$a;

    return-void
.end method

.method public constructor <init>(Lcom/ui/sso/auth/d$b;)V
    .locals 2

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/sso/auth/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/sso/auth/d;->a:Lcom/ui/sso/auth/d$b;

    sget-object v1, Lcom/ui/sso/auth/a$a;->UBIC_PKCE:Lcom/ui/sso/auth/a$a;

    iput-object v1, p0, Lcom/ui/sso/auth/d;->b:Lcom/ui/sso/auth/a$a;

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->f()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ui/sso/auth/d;->c:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/ui/sso/auth/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string/jumbo v0, "Token is blank"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "Device ID is blank"

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "Device name is blank"

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v0, "Code verifier is blank"

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string/jumbo v0, "Method is blank"

    :cond_4
    :goto_0
    if-nez v0, :cond_5

    return-void

    :cond_5
    new-instance p1, Lcom/ui/sso/auth/UiCookieAuthError$InvalidToken;

    invoke-direct {p1, v0}, Lcom/ui/sso/auth/UiCookieAuthError$InvalidToken;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/auth/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/ui/sso/auth/a$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/auth/d;->b:Lcom/ui/sso/auth/a$a;

    return-object v0
.end method

.method public final c()Lcom/ui/sso/auth/d$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/auth/d;->a:Lcom/ui/sso/auth/d$b;

    return-object v0
.end method

.method public final d()Z
    .locals 4

    iget-object v0, p0, Lcom/ui/sso/auth/d;->a:Lcom/ui/sso/auth/d$b;

    invoke-virtual {v0}, Lcom/ui/sso/auth/d$b;->d()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/ui/sso/auth/d;->a:Lcom/ui/sso/auth/d$b;

    invoke-virtual {v2}, Lcom/ui/sso/auth/d$b;->d()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/sso/auth/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lcom/ui/sso/auth/d;->a:Lcom/ui/sso/auth/d$b;

    check-cast p1, Lcom/ui/sso/auth/d;

    iget-object p1, p1, Lcom/ui/sso/auth/d;->a:Lcom/ui/sso/auth/d$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/auth/d;->a:Lcom/ui/sso/auth/d$b;

    invoke-virtual {v0}, Lcom/ui/sso/auth/d$b;->hashCode()I

    move-result v0

    return v0
.end method
