.class final LE8/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/f;->q0(Lgf/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/f;


# direct methods
.method constructor <init>(LE8/f;)V
    .locals 0

    iput-object p1, p0, LE8/f$e;->a:LE8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqd/a$a;)Lgg/f;
    .locals 5

    const-string/jumbo v0, "a2aSpeedTestParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/f$e;->a:LE8/f;

    invoke-static {v0}, LE8/f;->r0(LE8/f;)LE8/a;

    move-result-object v0

    invoke-interface {v0}, LE8/a;->a()Lgg/b;

    move-result-object v0

    iget-object v1, p0, LE8/f$e;->a:LE8/f;

    invoke-static {v1}, LE8/f;->s0(LE8/f;)Li8/a;

    move-result-object v1

    new-instance v2, Li8/a$b$B$c$a;

    invoke-direct {v2, p1}, Li8/a$b$B$c$a;-><init>(Lqd/a$a;)V

    const/4 p1, 0x1

    new-array v3, p1, [Li8/a$b;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-interface {v1, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    aput-object v0, v2, v4

    aput-object v1, v2, p1

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqd/a$a;

    invoke-virtual {p0, p1}, LE8/f$e;->a(Lqd/a$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
