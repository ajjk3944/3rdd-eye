.class LK6/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/n0;->a(JLjava/util/concurrent/TimeUnit;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/util/concurrent/TimeUnit;

.field final synthetic c:LK6/n0;


# direct methods
.method constructor <init>(LK6/n0;JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    iput-object p1, p0, LK6/n0$a;->c:LK6/n0;

    iput-wide p2, p0, LK6/n0$a;->a:J

    iput-object p4, p0, LK6/n0$a;->b:Ljava/util/concurrent/TimeUnit;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lhg/c;)V
    .locals 5

    iget-object p1, p0, LK6/n0$a;->c:LK6/n0;

    iget-object p1, p1, LK6/n0;->e:LHg/d;

    new-instance v0, LM6/x;

    iget-wide v1, p0, LK6/n0$a;->a:J

    iget-object v3, p0, LK6/n0$a;->b:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, LM6/x;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-interface {p1, v0}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, LK6/n0$a;->a(Lhg/c;)V

    return-void
.end method
