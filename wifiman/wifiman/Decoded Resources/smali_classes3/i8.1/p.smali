.class public final synthetic Li8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Li8/q;

.field public final synthetic b:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Li8/q;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/p;->a:Li8/q;

    iput-object p2, p0, Li8/p;->b:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li8/p;->a:Li8/q;

    iget-object v1, p0, Li8/p;->b:Landroid/net/Uri;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, p1}, Li8/q;->c(Li8/q;Landroid/net/Uri;Landroid/content/Context;)Li8/a$a;

    move-result-object p1

    return-object p1
.end method
