.class final Ljj/i$d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/i$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/M;

.field final synthetic b:Lkotlin/jvm/internal/K;

.field final synthetic c:Ljj/i;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/K;Ljj/i;)V
    .locals 0

    iput-object p1, p0, Ljj/i$d$a;->a:Lkotlin/jvm/internal/M;

    iput-object p2, p0, Ljj/i$d$a;->b:Lkotlin/jvm/internal/K;

    iput-object p3, p0, Ljj/i$d$a;->c:Ljj/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 5

    iget-object v0, p0, Ljj/i$d$a;->a:Lkotlin/jvm/internal/M;

    iget-wide v1, v0, Lkotlin/jvm/internal/M;->a:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    iput-wide p1, v0, Lkotlin/jvm/internal/M;->a:J

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljj/i$d$a;->b:Lkotlin/jvm/internal/K;

    iget-object v3, p0, Ljj/i$d$a;->c:Ljj/i;

    sub-long/2addr p1, v1

    invoke-static {v3}, Ljj/i;->e(Ljj/i;)F

    move-result v1

    invoke-static {v3, p1, p2, v1}, Ljj/i;->a(Ljj/i;JF)F

    move-result p1

    iput p1, v0, Lkotlin/jvm/internal/K;->a:F

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljj/i$d$a;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
