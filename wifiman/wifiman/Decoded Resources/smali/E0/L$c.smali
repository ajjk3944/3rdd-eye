.class final LE0/L$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/L;->T(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/L;

.field final synthetic b:J


# direct methods
.method constructor <init>(LE0/L;J)V
    .locals 0

    iput-object p1, p0, LE0/L$c;->a:LE0/L;

    iput-wide p2, p0, LE0/L$c;->b:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LE0/L$c;->a:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-wide v1, p0, LE0/L$c;->b:J

    invoke-interface {v0, v1, v2}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/L$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
