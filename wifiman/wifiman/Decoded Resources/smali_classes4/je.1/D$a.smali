.class final Lje/D$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/D;-><init>(Lje/u;Lfe/u;LT7/d;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lje/D;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lje/D;J)V
    .locals 0

    iput-object p1, p0, Lje/D$a;->a:Lje/D;

    iput-wide p2, p0, Lje/D$a;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 5

    iget-object v0, p0, Lje/D$a;->a:Lje/D;

    invoke-static {v0}, Lje/D;->e(Lje/D;)LT7/d;

    move-result-object v1

    invoke-interface {v1}, LT7/d;->a()J

    move-result-wide v1

    iget-wide v3, p0, Lje/D$a;->b:J

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lje/D;->c(Lje/D;J)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lje/D$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
