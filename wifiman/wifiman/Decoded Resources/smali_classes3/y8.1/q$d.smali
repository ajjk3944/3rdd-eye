.class final Ly8/q$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/q;-><init>(Lje/C;Ly8/a$b;Ljd/b;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/q;


# direct methods
.method constructor <init>(Ly8/q;)V
    .locals 0

    iput-object p1, p0, Ly8/q$d;->a:Ly8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ll9/a;

    check-cast p3, Ljava/util/Set;

    check-cast p4, La8/a;

    invoke-virtual {p0, p1, p2, p3, p4}, Ly8/q$d;->b(Ljava/util/List;Ll9/a;Ljava/util/Set;La8/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;Ll9/a;Ljava/util/Set;La8/a;)Ljava/util/List;
    .locals 1

    const-string/jumbo v0, "connected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chartDrawnBands"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljd/a$b;

    iget-object p4, p0, Ly8/q$d;->a:Ly8/q;

    invoke-static {p1}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LWc/c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LWc/c;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lje/r;

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lje/r$b$b;->a:Lje/r$b$b;

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljd/a$b;->b()LCc/a;

    move-result-object p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    invoke-static {p4, p1, p3, p2}, Ly8/q;->j(Ly8/q;Lje/r;Ljava/util/Set;LCc/a;)LTe/F0;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
