.class LO6/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO6/g;->b(LO6/j;Lgg/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LO6/j;

.field final synthetic b:Lgg/y;

.field final synthetic c:LO6/g;


# direct methods
.method constructor <init>(LO6/g;LO6/j;Lgg/y;)V
    .locals 0

    iput-object p1, p0, LO6/g$a;->c:LO6/g;

    iput-object p2, p0, LO6/g$a;->a:LO6/j;

    iput-object p3, p0, LO6/g$a;->b:Lgg/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LO6/g$a;->c:LO6/g;

    iget-object v0, v0, LO6/g;->b:LM6/j;

    iget-object v1, p0, LO6/g$a;->a:LO6/j;

    invoke-interface {v0, v1}, LM6/j;->N0(LO6/i;)Lgg/s;

    move-result-object v0

    iget-object v1, p0, LO6/g$a;->b:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/s;->e1(Lgg/y;)Lgg/s;

    move-result-object v0

    new-instance v1, LO6/g$a$a;

    invoke-direct {v1, p0}, LO6/g$a$a;-><init>(LO6/g$a;)V

    invoke-virtual {v0, v1}, Lgg/s;->d(Lgg/x;)V

    return-void
.end method
