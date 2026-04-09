.class public LI2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI2/m$b;
    }
.end annotation


# instance fields
.field private final a:LW2/h;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LI2/m$a;

    invoke-direct {v0, p0, p1, p2}, LI2/m$a;-><init>(LI2/m;J)V

    iput-object v0, p0, LI2/m;->a:LW2/h;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2, p3}, LI2/m$b;->a(Ljava/lang/Object;II)LI2/m$b;

    move-result-object p1

    iget-object p2, p0, LI2/m;->a:LW2/h;

    invoke-virtual {p2, p1}, LW2/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, LI2/m$b;->c()V

    return-object p2
.end method

.method public b(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 0

    invoke-static {p1, p2, p3}, LI2/m$b;->a(Ljava/lang/Object;II)LI2/m$b;

    move-result-object p1

    iget-object p2, p0, LI2/m;->a:LW2/h;

    invoke-virtual {p2, p1, p4}, LW2/h;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
