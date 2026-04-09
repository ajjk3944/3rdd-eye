.class LK6/n0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/n0;->e()Lkg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LK6/n0;


# direct methods
.method constructor <init>(LK6/n0;)V
    .locals 0

    iput-object p1, p0, LK6/n0$g;->a:LK6/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LM6/x;)Lgg/z;
    .locals 3

    iget-object v0, p0, LK6/n0$g;->a:LK6/n0;

    iget-object v0, v0, LK6/n0;->c:LM6/k;

    iget-wide v1, p1, LM6/x;->a:J

    iget-object p1, p1, LM6/x;->b:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, p1}, LM6/k;->e(JLjava/util/concurrent/TimeUnit;)LM6/w;

    move-result-object p1

    iget-object v0, p0, LK6/n0$g;->a:LK6/n0;

    iget-object v0, v0, LK6/n0;->a:LO6/d;

    invoke-interface {v0, p1}, LO6/a;->a(LM6/j;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->P()Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM6/x;

    invoke-virtual {p0, p1}, LK6/n0$g;->a(LM6/x;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
