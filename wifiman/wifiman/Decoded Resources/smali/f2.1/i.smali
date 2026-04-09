.class public final Lf2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf2/h$a;

.field private b:Lf2/B;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf2/h$a;

    invoke-direct {v0}, Lf2/h$a;-><init>()V

    iput-object v0, p0, Lf2/i;->a:Lf2/h$a;

    return-void
.end method


# virtual methods
.method public final a()Lf2/h;
    .locals 1

    iget-object v0, p0, Lf2/i;->a:Lf2/h$a;

    invoke-virtual {v0}, Lf2/h$a;->a()Lf2/h;

    move-result-object v0

    return-object v0
.end method

.method public final b(Z)V
    .locals 1

    iput-boolean p1, p0, Lf2/i;->c:Z

    iget-object v0, p0, Lf2/i;->a:Lf2/h$a;

    invoke-virtual {v0, p1}, Lf2/h$a;->b(Z)Lf2/h$a;

    return-void
.end method

.method public final c(Lf2/B;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf2/i;->b:Lf2/B;

    iget-object v0, p0, Lf2/i;->a:Lf2/h$a;

    invoke-virtual {v0, p1}, Lf2/h$a;->c(Lf2/B;)Lf2/h$a;

    return-void
.end method
