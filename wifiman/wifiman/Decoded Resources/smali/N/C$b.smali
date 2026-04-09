.class final LN/C$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/C;->N2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/C;


# direct methods
.method constructor <init>(LN/C;)V
    .locals 0

    iput-object p1, p0, LN/C$b;->a:LN/C;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LP/g;
    .locals 5

    iget-object v0, p0, LN/C$b;->a:LN/C;

    invoke-static {}, LN/A0;->d()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/y0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LN/y0;->b()LP/g;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LN/z0;->a:LN/z0;

    iget-object v1, p0, LN/C$b;->a:LN/C;

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v2

    invoke-static {v1, v2}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v1

    iget-object v3, p0, LN/C$b;->a:LN/C;

    invoke-static {}, LN/n;->d()LT/H0;

    move-result-object v4

    invoke-static {v3, v4}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LN/m;

    invoke-virtual {v3}, LN/m;->o()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, LN/z0;->a(JZ)LP/g;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/C$b;->a()LP/g;

    move-result-object v0

    return-object v0
.end method
