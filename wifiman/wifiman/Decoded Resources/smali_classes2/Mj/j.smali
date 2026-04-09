.class public final synthetic LMj/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LMj/i$b$a;

.field public final synthetic b:LMj/f;

.field public final synthetic c:LMj/w;


# direct methods
.method public synthetic constructor <init>(LMj/i$b$a;LMj/f;LMj/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMj/j;->a:LMj/i$b$a;

    iput-object p2, p0, LMj/j;->b:LMj/f;

    iput-object p3, p0, LMj/j;->c:LMj/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LMj/j;->a:LMj/i$b$a;

    iget-object v1, p0, LMj/j;->b:LMj/f;

    iget-object v2, p0, LMj/j;->c:LMj/w;

    invoke-static {v0, v1, v2}, LMj/i$b$a;->d(LMj/i$b$a;LMj/f;LMj/w;)V

    return-void
.end method
