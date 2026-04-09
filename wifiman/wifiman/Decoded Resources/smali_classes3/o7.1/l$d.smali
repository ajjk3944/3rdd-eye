.class final Lo7/l$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/l;->n(Ljava/util/List;Lq7/c;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lq7/c;

.field final synthetic b:Lo7/l$b;


# direct methods
.method constructor <init>(Lq7/c;Lo7/l$b;)V
    .locals 0

    iput-object p1, p0, Lo7/l$d;->a:Lq7/c;

    iput-object p2, p0, Lo7/l$d;->b:Lo7/l$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls7/g;)Lgg/f;
    .locals 5

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo7/l$d;->a:Lq7/c;

    iget-object v1, p0, Lo7/l$d;->b:Lo7/l$b;

    invoke-virtual {v1}, Lo7/l$b;->a()Lu7/a;

    move-result-object v1

    invoke-virtual {v1}, Lu7/a;->a()Lmh/l;

    move-result-object v1

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    new-instance v3, Lr7/a;

    iget-object v4, p0, Lo7/l$d;->b:Lo7/l$b;

    invoke-virtual {v4}, Lo7/l$b;->b()I

    move-result v4

    invoke-direct {v3, v4, p1}, Lr7/a;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, p1, v1, v2, v3}, Lq7/c;->a(Ls7/g;JLr7/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls7/g;

    invoke-virtual {p0, p1}, Lo7/l$d;->a(Ls7/g;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
