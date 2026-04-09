.class final LE8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/b;-><init>(Lrd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/b;


# direct methods
.method constructor <init>(LE8/b;)V
    .locals 0

    iput-object p1, p0, LE8/b$b;->a:LE8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)LDj/a;
    .locals 5

    const-string/jumbo v0, "seenIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/M;

    invoke-direct {v0}, Lkotlin/jvm/internal/M;-><init>()V

    iget-object v1, p0, LE8/b$b;->a:LE8/b;

    invoke-static {v1}, LE8/b;->c(LE8/b;)Lrd/b;

    move-result-object v1

    invoke-interface {v1}, Lrd/b;->a()Lgg/i;

    move-result-object v1

    iget-object v2, p0, LE8/b$b;->a:LE8/b;

    invoke-static {v2}, LE8/b;->b(LE8/b;)Lgg/i;

    move-result-object v2

    new-instance v3, LE8/b$b$a;

    iget-object v4, p0, LE8/b$b;->a:LE8/b;

    invoke-direct {v3, v4, v0, p1}, LE8/b$b$a;-><init>(LE8/b;Lkotlin/jvm/internal/M;Ljava/util/Set;)V

    invoke-static {v1, v2, v3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, LE8/b$b;->a(Ljava/util/Set;)LDj/a;

    move-result-object p1

    return-object p1
.end method
