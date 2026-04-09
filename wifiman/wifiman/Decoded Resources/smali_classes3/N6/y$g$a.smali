.class LN6/y$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN6/y$g;->a(Lgg/s;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LN6/y$g;


# direct methods
.method constructor <init>(LN6/y$g;)V
    .locals 0

    iput-object p1, p0, LN6/y$g$a;->a:LN6/y$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/s;
    .locals 2

    iget-object v0, p0, LN6/y$g$a;->a:LN6/y$g;

    iget-object v0, v0, LN6/y$g;->a:LN6/y;

    iget-object v0, v0, LN6/y;->b:Lgg/w;

    invoke-virtual {p1, v0}, Lgg/s;->g(Lgg/w;)Lgg/s;

    move-result-object v0

    iget-object v1, p0, LN6/y$g$a;->a:LN6/y$g;

    iget-object v1, v1, LN6/y$g;->a:LN6/y;

    iget-object v1, v1, LN6/y;->c:Lgg/w;

    invoke-virtual {p1, v1}, Lgg/s;->g(Lgg/w;)Lgg/s;

    move-result-object p1

    invoke-static {v0, p1}, Lgg/s;->j0(Lgg/v;Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/s;

    invoke-virtual {p0, p1}, LN6/y$g$a;->a(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
