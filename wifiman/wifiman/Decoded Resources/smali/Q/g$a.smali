.class final LQ/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/y0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/g;->N2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/g;


# direct methods
.method constructor <init>(LQ/g;)V
    .locals 0

    iput-object p1, p0, LQ/g$a;->a:LQ/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 6

    iget-object v0, p0, LQ/g$a;->a:LQ/g;

    invoke-static {v0}, LQ/g;->K2(LQ/g;)Lm0/y0;

    move-result-object v0

    invoke-interface {v0}, Lm0/y0;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x10

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LQ/g$a;->a:LQ/g;

    invoke-static {}, LQ/o;->a()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQ/m;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LQ/m;->a()J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LQ/m;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LQ/g$a;->a:LQ/g;

    invoke-static {}, LQ/f;->a()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method
