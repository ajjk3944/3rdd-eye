.class final LN/C$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/y0;


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

    iput-object p1, p0, LN/C$a;->a:LN/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 6

    iget-object v0, p0, LN/C$a;->a:LN/C;

    invoke-static {v0}, LN/C;->K2(LN/C;)Lm0/y0;

    move-result-object v0

    invoke-interface {v0}, Lm0/y0;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x10

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LN/C$a;->a:LN/C;

    invoke-static {}, LN/A0;->d()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/y0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LN/y0;->a()J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LN/y0;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    sget-object v0, LN/z0;->a:LN/z0;

    iget-object v1, p0, LN/C$a;->a:LN/C;

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v2

    invoke-static {v1, v2}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v1

    iget-object v3, p0, LN/C$a;->a:LN/C;

    invoke-static {}, LN/n;->d()LT/H0;

    move-result-object v4

    invoke-static {v3, v4}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LN/m;

    invoke-virtual {v3}, LN/m;->o()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, LN/z0;->b(JZ)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method
