.class final LE8/q$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/q;->M0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/q;


# direct methods
.method constructor <init>(LE8/q;)V
    .locals 0

    iput-object p1, p0, LE8/q$k;->a:LE8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LAd/a$b;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "feedback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/q$k;->a:LE8/q;

    invoke-static {v0}, LE8/q;->w0(LE8/q;)LAd/a;

    move-result-object v0

    invoke-interface {v0, p1}, LAd/a;->a(LAd/a$b;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, LE8/q$k;->a:LE8/q;

    new-instance v1, LE8/q$k$b;

    invoke-direct {v1, v0}, LE8/q$k$b;-><init>(LE8/q;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    invoke-static {v1}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    const-wide/16 v0, 0x1388

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lgg/b;->Y(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object p1

    sget-object v0, LE8/q$k$a;->a:LE8/q$k$a;

    invoke-virtual {p1, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LAd/a$b;

    invoke-virtual {p0, p1}, LE8/q$k;->a(LAd/a$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
