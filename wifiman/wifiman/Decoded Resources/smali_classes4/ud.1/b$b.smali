.class final Lud/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lud/b;->a()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lud/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lud/b$b;

    invoke-direct {v0}, Lud/b$b;-><init>()V

    sput-object v0, Lud/b$b;->a:Lud/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LW7/b;Ll9/a;)LW7/b;
    .locals 4

    const-string v0, "cache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LW7/b;

    invoke-virtual {p1}, LW7/b;->b()LW7/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, LW7/b;->b()LW7/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p1}, LW7/b;->b()LW7/a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p2}, LW7/b;->b()LW7/a;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, LW7/a;->a(LW7/a;)I

    move-result v0

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LW7/b;->b()LW7/a;

    move-result-object v0

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    invoke-virtual {p2}, LW7/b;->b()LW7/a;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v1

    :goto_2
    invoke-virtual {p1}, LW7/b;->c()LW7/a;

    move-result-object v2

    if-eqz v2, :cond_6

    if-eqz p2, :cond_4

    invoke-virtual {p2}, LW7/b;->c()LW7/a;

    move-result-object v2

    goto :goto_3

    :cond_4
    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_5

    invoke-virtual {p1}, LW7/b;->c()LW7/a;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p2}, LW7/b;->c()LW7/a;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, LW7/a;->a(LW7/a;)I

    move-result v2

    if-gez v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, LW7/b;->c()LW7/a;

    move-result-object v1

    goto :goto_5

    :cond_6
    :goto_4
    if-eqz p2, :cond_7

    invoke-virtual {p2}, LW7/b;->c()LW7/a;

    move-result-object v1

    :cond_7
    :goto_5
    invoke-virtual {p1, v0, v1}, LW7/b;->a(LW7/a;LW7/a;)LW7/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW7/b;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, Lud/b$b;->a(LW7/b;Ll9/a;)LW7/b;

    move-result-object p1

    return-object p1
.end method
