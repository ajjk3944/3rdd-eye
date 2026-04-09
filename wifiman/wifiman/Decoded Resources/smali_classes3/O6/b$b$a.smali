.class LO6/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO6/b$b;->a(Lgg/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LO6/g;

.field final synthetic b:LO6/b$b;


# direct methods
.method constructor <init>(LO6/b$b;LO6/g;)V
    .locals 0

    iput-object p1, p0, LO6/b$b$a;->b:LO6/b$b;

    iput-object p2, p0, LO6/b$b$a;->a:LO6/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LO6/b$b$a;->b:LO6/b$b;

    iget-object v0, v0, LO6/b$b;->b:LO6/b;

    iget-object v0, v0, LO6/b;->a:LO6/h;

    iget-object v1, p0, LO6/b$b$a;->a:LO6/g;

    invoke-virtual {v0, v1}, LO6/h;->c(LO6/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LO6/b$b$a;->b:LO6/b$b;

    iget-object v0, v0, LO6/b$b;->a:LM6/j;

    invoke-static {v0}, LL6/b;->q(LM6/j;)V

    :cond_0
    return-void
.end method
