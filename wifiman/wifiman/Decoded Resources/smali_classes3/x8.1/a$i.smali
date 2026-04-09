.class final Lx8/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/a;->N0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx8/a;


# direct methods
.method constructor <init>(Lx8/a;)V
    .locals 0

    iput-object p1, p0, Lx8/a$i;->a:Lx8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lje/r;)Lgg/f;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "wifiConnectionState"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p1, Lje/r$b$a;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lje/r$b$a;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_4

    iget-object v2, p0, Lx8/a$i;->a:Lx8/a;

    check-cast p1, Lje/r$b$a;

    invoke-virtual {p1}, Lje/r$b$a;->i()Lke/c;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lke/c;->b()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v2}, Lx8/a;->A0(Lx8/a;)Li8/a;

    move-result-object v5

    new-instance v6, Li8/h;

    invoke-direct {v6, v4}, Li8/h;-><init>(Ljava/lang/String;)V

    new-array v4, v1, [Li8/a$b;

    aput-object v6, v4, v0

    invoke-interface {v5, v4}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v4

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lje/r$b$a;->c()Lh9/a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {v2}, Lx8/a;->A0(Lx8/a;)Li8/a;

    move-result-object v2

    new-instance v3, Li8/g;

    invoke-direct {v3, p1}, Li8/g;-><init>(Lh9/a;)V

    new-array p1, v1, [Li8/a$b;

    aput-object v3, p1, v0

    invoke-interface {v2, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v3

    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object v3

    :goto_3
    return-object v3
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, Lx8/a$i;->a(Lje/r;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
