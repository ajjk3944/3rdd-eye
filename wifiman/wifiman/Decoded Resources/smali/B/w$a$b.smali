.class final LB/w$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/w$a;->a(Lc0/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/r;

.field final synthetic b:Lmh/p;


# direct methods
.method constructor <init>(LB/r;Lmh/p;)V
    .locals 0

    iput-object p1, p0, LB/w$a$b;->a:LB/r;

    iput-object p2, p0, LB/w$a$b;->b:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC0/U;J)LC0/D;
    .locals 2

    new-instance v0, LB/y;

    iget-object v1, p0, LB/w$a$b;->a:LB/r;

    invoke-direct {v0, v1, p1}, LB/y;-><init>(LB/r;LC0/U;)V

    iget-object p1, p0, LB/w$a$b;->b:Lmh/p;

    invoke-static {p2, p3}, LY0/b;->a(J)LY0/b;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC0/D;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LC0/U;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LB/w$a$b;->a(LC0/U;J)LC0/D;

    move-result-object p1

    return-object p1
.end method
