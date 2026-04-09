.class final Ln8/j$e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/j$e;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/j$e$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/j$e$d;

    invoke-direct {v0}, Ln8/j$e$d;-><init>()V

    sput-object v0, Ln8/j$e$d;->a:Ln8/j$e$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Ll9/a;)Ll9/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LVd/a;

    invoke-virtual {v2}, LVd/a;->a()Lh9/a;

    move-result-object v3

    if-eqz v3, :cond_0

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    invoke-virtual {v2}, LVd/a;->a()Lh9/a;

    move-result-object v2

    invoke-static {v3, v2}, LZg/v;->f0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    check-cast v1, LVd/a;

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, LVd/a;->a()Lh9/a;

    move-result-object v0

    :cond_3
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, Ln8/j$e$d;->a(Ll9/a;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
