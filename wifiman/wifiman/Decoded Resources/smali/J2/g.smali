.class public LJ2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ2/g$a;
    }
.end annotation


# instance fields
.field private final a:LI2/n;


# direct methods
.method public constructor <init>(LI2/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ2/g;->a:LI2/n;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILC2/g;)LI2/n$a;
    .locals 0

    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1, p2, p3, p4}, LJ2/g;->c(Ljava/net/URL;IILC2/g;)LI2/n$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1}, LJ2/g;->d(Ljava/net/URL;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/net/URL;IILC2/g;)LI2/n$a;
    .locals 2

    iget-object v0, p0, LJ2/g;->a:LI2/n;

    new-instance v1, LI2/h;

    invoke-direct {v1, p1}, LI2/h;-><init>(Ljava/net/URL;)V

    invoke-interface {v0, v1, p2, p3, p4}, LI2/n;->a(Ljava/lang/Object;IILC2/g;)LI2/n$a;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/net/URL;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
