.class public abstract Lcom/ui/sso/api/provider/f$b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public static synthetic a(Lcom/ui/sso/api/provider/f$b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/ui/sso/api/provider/f;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string/jumbo p2, "ui.account.provider"

    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/ui/sso/api/provider/f$b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/ui/sso/api/provider/f;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: new"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
