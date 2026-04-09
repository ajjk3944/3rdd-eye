.class Lw1/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw1/q;->g([LB1/k$b;I)LB1/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw1/q;


# direct methods
.method constructor <init>(Lw1/q;)V
    .locals 0

    iput-object p1, p0, Lw1/q$a;->a:Lw1/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LB1/k$b;

    invoke-virtual {p0, p1}, Lw1/q$a;->c(LB1/k$b;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LB1/k$b;

    invoke-virtual {p0, p1}, Lw1/q$a;->d(LB1/k$b;)Z

    move-result p1

    return p1
.end method

.method public c(LB1/k$b;)I
    .locals 0

    invoke-virtual {p1}, LB1/k$b;->e()I

    move-result p1

    return p1
.end method

.method public d(LB1/k$b;)Z
    .locals 0

    invoke-virtual {p1}, LB1/k$b;->f()Z

    move-result p1

    return p1
.end method
