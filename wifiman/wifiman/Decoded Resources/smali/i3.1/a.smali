.class public final synthetic Li3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li3/c;

.field public final synthetic b:Lc3/p;

.field public final synthetic c:La3/j;

.field public final synthetic d:Lc3/i;


# direct methods
.method public synthetic constructor <init>(Li3/c;Lc3/p;La3/j;Lc3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/a;->a:Li3/c;

    iput-object p2, p0, Li3/a;->b:Lc3/p;

    iput-object p3, p0, Li3/a;->c:La3/j;

    iput-object p4, p0, Li3/a;->d:Lc3/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Li3/a;->a:Li3/c;

    iget-object v1, p0, Li3/a;->b:Lc3/p;

    iget-object v2, p0, Li3/a;->c:La3/j;

    iget-object v3, p0, Li3/a;->d:Lc3/i;

    invoke-static {v0, v1, v2, v3}, Li3/c;->c(Li3/c;Lc3/p;La3/j;Lc3/i;)V

    return-void
.end method
