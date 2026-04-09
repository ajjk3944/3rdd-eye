.class LN6/y$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN6/y$a;->a(Lgg/s;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LN6/y$a;


# direct methods
.method constructor <init>(LN6/y$a;)V
    .locals 0

    iput-object p1, p0, LN6/y$a$c;->a:LN6/y$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/v;
    .locals 1

    iget-object v0, p0, LN6/y$a$c;->a:LN6/y$a;

    iget-object v0, v0, LN6/y$a;->c:Lkg/n;

    invoke-virtual {p1, v0}, Lgg/s;->O0(Lkg/n;)Lgg/s;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->f1(Lgg/v;)Lgg/s;

    move-result-object p1

    iget-object v0, p0, LN6/y$a$c;->a:LN6/y$a;

    iget-object v0, v0, LN6/y$a;->d:Lkg/n;

    invoke-virtual {p1, v0}, Lgg/s;->Q(Lkg/n;)Lgg/s;

    move-result-object p1

    iget-object v0, p0, LN6/y$a$c;->a:LN6/y$a;

    iget-object v0, v0, LN6/y$a;->a:Lkg/n;

    invoke-virtual {p1, v0}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/s;

    invoke-virtual {p0, p1}, LN6/y$a$c;->a(Lgg/s;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
