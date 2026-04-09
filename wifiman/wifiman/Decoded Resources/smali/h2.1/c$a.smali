.class final Lh2/c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/c;->c(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lh2/a;


# direct methods
.method constructor <init>(Ljava/util/Map;Lh2/a;)V
    .locals 0

    iput-object p1, p0, Lh2/c$a;->a:Ljava/util/Map;

    iput-object p2, p0, Lh2/c$a;->b:Lh2/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Lf2/B;)V
    .locals 2

    const-string v0, "argName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/c$a;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lh2/c$a;->b:Lh2/a;

    invoke-virtual {v1, p1, p2, p3, v0}, Lh2/a;->c(ILjava/lang/String;Lf2/B;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lf2/B;

    invoke-virtual {p0, p1, p2, p3}, Lh2/c$a;->a(ILjava/lang/String;Lf2/B;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
