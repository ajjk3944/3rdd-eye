.class final LN/J0$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/J0$a;->a(Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# direct methods
.method constructor <init>(LN/H0;)V
    .locals 0

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 3

    sget-object v0, LJ0/e;->b:LJ0/e$a;

    invoke-virtual {v0}, LJ0/e$a;->b()I

    move-result v0

    invoke-static {p1, v0}, LJ0/t;->f0(LJ0/w;I)V

    new-instance v0, LN/J0$a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN/J0$a$a$a;-><init>(LN/H0;)V

    const/4 v2, 0x1

    invoke-static {p1, v1, v0, v2, v1}, LJ0/t;->n(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LN/J0$a$a;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
