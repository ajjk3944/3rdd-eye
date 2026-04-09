.class LN6/y$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN6/y;->c(I)Lgg/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:J

.field final synthetic c:LN6/y;


# direct methods
.method constructor <init>(LN6/y;IJ)V
    .locals 0

    iput-object p1, p0, LN6/y$b;->c:LN6/y;

    iput p2, p0, LN6/y$b;->a:I

    iput-wide p3, p0, LN6/y$b;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/s;
    .locals 4

    iget v0, p0, LN6/y$b;->a:I

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, LN6/y$b;->c:LN6/y;

    iget-object v3, v3, LN6/y;->a:Lgg/y;

    invoke-virtual {p1, v0, v1, v2, v3}, Lgg/s;->S0(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    new-instance v0, LN6/y$b$a;

    invoke-direct {v0, p0}, LN6/y$b$a;-><init>(LN6/y$b;)V

    invoke-virtual {p1, v0}, Lgg/s;->v0(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lgg/s;)Lgg/v;
    .locals 0

    invoke-virtual {p0, p1}, LN6/y$b;->a(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
