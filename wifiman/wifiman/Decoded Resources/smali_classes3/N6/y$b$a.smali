.class LN6/y$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN6/y$b;->a(Lgg/s;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LN6/y$b;


# direct methods
.method constructor <init>(LN6/y$b;)V
    .locals 0

    iput-object p1, p0, LN6/y$b$a;->a:LN6/y$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/v;
    .locals 4

    iget-object v0, p0, LN6/y$b$a;->a:LN6/y$b;

    iget-wide v1, v0, LN6/y$b;->b:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, v0, LN6/y$b;->c:LN6/y;

    iget-object v0, v0, LN6/y;->a:Lgg/y;

    invoke-virtual {p1, v1, v2, v3, v0}, Lgg/s;->s(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/s;

    invoke-virtual {p0, p1}, LN6/y$b$a;->a(Lgg/s;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
