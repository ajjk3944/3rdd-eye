.class final LE8/A$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A;->u0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/A;


# direct methods
.method constructor <init>(LE8/A;)V
    .locals 0

    iput-object p1, p0, LE8/A$q;->a:LE8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljf/f;)Lgg/f;
    .locals 5

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/A$q;->a:LE8/A;

    invoke-static {v0}, LE8/A;->B0(LE8/A;)LP7/a;

    move-result-object v0

    new-instance v1, LP7/e;

    invoke-direct {v1}, LP7/e;-><init>()V

    invoke-interface {v0, v1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, LE8/A$q;->a:LE8/A;

    invoke-static {v1}, LE8/A;->K0(LE8/A;)Li8/a;

    move-result-object v1

    new-instance v2, Li8/a$b$B$b$c;

    invoke-virtual {p1}, Ljf/f;->a()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Li8/a$b$B$b$c;-><init>(J)V

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

    invoke-static {v2}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljf/f;

    invoke-virtual {p0, p1}, LE8/A$q;->a(Ljf/f;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
