.class public final synthetic Li3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/a$a;


# instance fields
.field public final synthetic a:Li3/c;

.field public final synthetic b:Lc3/p;

.field public final synthetic c:Lc3/i;


# direct methods
.method public synthetic constructor <init>(Li3/c;Lc3/p;Lc3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/b;->a:Li3/c;

    iput-object p2, p0, Li3/b;->b:Lc3/p;

    iput-object p3, p0, Li3/b;->c:Lc3/i;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Li3/b;->a:Li3/c;

    iget-object v1, p0, Li3/b;->b:Lc3/p;

    iget-object v2, p0, Li3/b;->c:Lc3/i;

    invoke-static {v0, v1, v2}, Li3/c;->b(Li3/c;Lc3/p;Lc3/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
