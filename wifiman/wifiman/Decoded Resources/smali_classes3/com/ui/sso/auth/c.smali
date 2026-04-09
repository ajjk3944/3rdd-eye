.class public final Lcom/ui/sso/auth/c;
.super Lcom/ui/sso/auth/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/auth/c$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/ui/sso/auth/c$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/Long;

.field private final c:Lcom/ui/sso/auth/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/auth/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/auth/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/auth/c;->d:Lcom/ui/sso/auth/c$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Long;)V
    .locals 1

    const-string/jumbo v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/sso/auth/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/sso/auth/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/sso/auth/c;->b:Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/ui/sso/auth/c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/ui/sso/auth/a$a;->UBIC:Lcom/ui/sso/auth/a$a;

    iput-object p1, p0, Lcom/ui/sso/auth/c;->c:Lcom/ui/sso/auth/a$a;

    return-void

    :cond_0
    new-instance p1, Lcom/ui/sso/auth/UiCookieAuthError$InvalidToken;

    const-string/jumbo p2, "Token is blank"

    invoke-direct {p1, p2}, Lcom/ui/sso/auth/UiCookieAuthError$InvalidToken;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/auth/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/ui/sso/auth/a$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/auth/c;->c:Lcom/ui/sso/auth/a$a;

    return-object v0
.end method

.method public final c()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/auth/c;->b:Ljava/lang/Long;

    return-object v0
.end method

.method public final d()Z
    .locals 4

    iget-object v0, p0, Lcom/ui/sso/auth/c;->b:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/ui/sso/auth/c;->b:Ljava/lang/Long;

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
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/sso/auth/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/ui/sso/auth/c;->a()Ljava/lang/String;

    move-result-object v1

    check-cast p1, Lcom/ui/sso/auth/c;

    invoke-virtual {p1}, Lcom/ui/sso/auth/c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/sso/auth/c;->b:Ljava/lang/Long;

    iget-object v3, p1, Lcom/ui/sso/auth/c;->b:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lcom/ui/sso/auth/c;->b()Lcom/ui/sso/auth/a$a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/sso/auth/c;->b()Lcom/ui/sso/auth/a$a;

    move-result-object p1

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/ui/sso/auth/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ui/sso/auth/c;->b()Lcom/ui/sso/auth/a$a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
